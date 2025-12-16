package ll0;

import Y61.l;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateEditV4Response.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lll0/f;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "agreement", "", "cptToken", "", NotificationsSettings.Section.SECTION_DELIVERY, "Lll0/b;", "fbsFee", "Lll0/d;", "fee", "Lll0/j;", "sellFasterBanner", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;Lll0/b;Lll0/d;Lll0/j;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "c", "()Ljava/lang/Boolean;", "Lll0/b;", "d", "()Lll0/b;", "Lll0/d;", "e", "()Lll0/d;", "Lll0/j;", "f", "()Lll0/j;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    @com.google.gson.annotations.c("agreement")
    @l
    private final AttributedText agreement;

    @com.google.gson.annotations.c("cptToken")
    @l
    private final String cptToken;

    @com.google.gson.annotations.c(NotificationsSettings.Section.SECTION_DELIVERY)
    @l
    private final Boolean delivery;

    @com.google.gson.annotations.c("fbsFee")
    @l
    private final C43791b fbsFee;

    @com.google.gson.annotations.c("fee")
    @l
    private final d fee;

    @com.google.gson.annotations.c("sellFasterBanner")
    @l
    private final j sellFasterBanner;

    public f(@l AttributedText attributedText, @l String str, @l Boolean bool, @l C43791b c43791b, @l d dVar, @l j jVar) {
        this.agreement = attributedText;
        this.cptToken = str;
        this.delivery = bool;
        this.fbsFee = c43791b;
        this.fee = dVar;
        this.sellFasterBanner = jVar;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAgreement() {
        return this.agreement;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final String getCptToken() {
        return this.cptToken;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Boolean getDelivery() {
        return this.delivery;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C43791b getFbsFee() {
        return this.fbsFee;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final d getFee() {
        return this.fee;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final j getSellFasterBanner() {
        return this.sellFasterBanner;
    }
}
