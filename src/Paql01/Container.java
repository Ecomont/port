package Paql01;

import java.util.Objects;

public class Container {
    private int identifierNumber;
    private int weight;
    private String countryOfOrigin;
    private boolean inspectedByCustoms;
    private int priorityLevel;
    private String contentDescription;
    private String companySender;
    private String companyReceiver;

    public Container() {
    }

    public Container(int identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public Container(boolean inspectedByCustoms) {
        this.inspectedByCustoms = inspectedByCustoms;
    }

    public Container(int identifierNumber, int weight, String countryOfOrigin, boolean inspectedByCustoms, int priorityLevel, String contentDescription, String companySender, String companyReceiver) {
        this.identifierNumber = identifierNumber;
        this.weight = weight;
        this.countryOfOrigin = countryOfOrigin;
        this.inspectedByCustoms = inspectedByCustoms;
        this.priorityLevel = priorityLevel;
        this.contentDescription = contentDescription;
        this.companySender = companySender;
        this.companyReceiver = companyReceiver;
    }

    public int getIdentifierNumber() {
        return identifierNumber;
    }

    public void setIdentifierNumber(int identifierNumber) {
        this.identifierNumber = identifierNumber;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public boolean isInspectedByCustoms() {
        return inspectedByCustoms;
    }

    public void setInspectedByCustoms(boolean inspectedByCustoms) {
        this.inspectedByCustoms = inspectedByCustoms;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getContentDescription() {
        return contentDescription;
    }

    public void setContentDescription(String contentDescription) {
        if (companySender.length()>100){
            throw new IllegalArgumentException("String exceeds 20 characters.");
        }
        this.contentDescription = contentDescription;
    }

    public String getCompanySender() {
        return companySender;
    }

    public void setCompanySender(String companySender) {
        if (companySender.length()>20){
            throw new IllegalArgumentException("String exceeds 20 characters.");
        }
        this.companySender = companySender;
    }

    public String getCompanyReceiver() {
        return companyReceiver;
    }

    public void setCompanyReceiver(String companyReceiver) {
        if (companySender.length()>20){
            throw new IllegalArgumentException("String exceeds 20 characters.");
        }
        this.companyReceiver = companyReceiver;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof Container)) {
            return false;
        }
        Container other = (Container) o;
        return this.identifierNumber == other.identifierNumber &&
                Objects.equals(this.countryOfOrigin, other.countryOfOrigin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identifierNumber, countryOfOrigin);
    }

}
