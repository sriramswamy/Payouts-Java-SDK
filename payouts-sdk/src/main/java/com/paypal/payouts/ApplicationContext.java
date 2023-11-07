// This class was generated on Mon, 16 Dec 2019 21:04:40 IST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// AlternateNotificationMethod.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data H4sIAAAAAAAC/9xTzW7TQBC+8xSjPSWSm1AJOORWuT0hQlUiLlVUTbyTeKT1rNkdEyyUd0cbuwmJiwCBEOrNO7/fz/irWbQ1mZm5ckpBUAnmXnnNBSp7gXekpbcmMx8xMK4czbFK5SYzb6k9Pq4pFoHr1GNmJsdam0AR0FpOMXQg34+tvKUI6iEQFiX4RtNDS4JABfFnChBog8GybEBLjlBjW5HoxGTmKgRsO9gvM3NHaN+La81sjS5SCnxqOJA9BG6DrykoUzSz+wPh29ILDYnVffjI7jFySnFREuwzIE21ogAswBqhQPHCBTpg6RTt6N/fTC7fvOqLE6vaocDahwp1OSpV6zibTrfb7YS1mbDoNFAxXVzc3eQX+9YpyfjvsY+aQAzpF74RDe1D4e2pCmeJoRh9ARToXOKXCmGU5+Ps30gDHYhqxUIWHMlGS/Dr/VHlOaDY/edha29b1URNtwkrgk0gVAqgJQpcvgbLG9bYTT7vK7xEjhrTCjxmLUXl7tUrML/Ox/vtsVklzVJzP2P0Yf57lmpozhyVxrld9lNb6YuSRPby0K0+sfaJ5NDeQ1EP/k9P8ReBPwr7FO5hbgj7zLb/4BZ/+J886xNd7pa7F98AAAD//w==
// DO NOT EDIT
package com.paypal.payouts;

import com.paypal.http.annotations.Model;
import com.paypal.http.annotations.SerializedName;

/**
 * Metadata for accepting additional information from merchants to Venmo.
 */
@Model
public class ApplicationContext {

    // Required default constructor
    public ApplicationContext() {
    }

    /**
     * This attribute controls the privacy of a payout transaction in recipient’s feed.
     */
    @SerializedName("social_feed_privacy")
    private String socialFeedPrivacy;

    public String socialFeedPrivacy() {
        return socialFeedPrivacy;
    }

    public ApplicationContext socialFeedPrivacy(String socialFeedPrivacy) {
        this.socialFeedPrivacy = socialFeedPrivacy;
        return this;
    }
	
    /**
     * Link to a logo that displays as the sender's profile image in the recipient's Venmo feed.
     */
    @SerializedName("logo_url")
    private String logoUrl;

    public String logoUrl() {
        return logoUrl;
    }

    public ApplicationContext logoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }	
}
