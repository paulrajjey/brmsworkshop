package redhat.brmsworkshop.lab1;

/**
 * This class was automatically generated by the data modeler tool.
 */
@org.kie.api.definition.type.Label(value = "Quote")
public class Quote  implements java.io.Serializable {

static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Quote Info")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String eligibility;
    
    @org.kie.api.definition.type.Label(value = "Total Premium")
    @org.kie.api.definition.type.Position(value = 1)
    private java.math.BigDecimal totalPremium;

    public Quote() {
    }

    public Quote(java.lang.String eligibility, java.math.BigDecimal totalPremium) {
        this.eligibility = eligibility;
        this.totalPremium = totalPremium;
    }


    
    public java.lang.String getEligibility() {
        return this.eligibility;
    }

    public void setEligibility(  java.lang.String eligibility ) {
        this.eligibility = eligibility;
    }
    
    public java.math.BigDecimal getTotalPremium() {
        return this.totalPremium;
    }

    public void setTotalPremium(  java.math.BigDecimal totalPremium ) {
        this.totalPremium = totalPremium;
    }
}