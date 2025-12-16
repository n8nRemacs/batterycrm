package No0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CreateDiscountDispatchResponse.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001:\u0001#B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001a\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0012\u001a\u0004\b \u0010\u0014R\u001a\u0010\u000e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\"\u0010\u0014¨\u0006$"}, d2 = {"LNo0/c;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "audienceExplained", "howItWorks", "noAudience", "LNo0/e;", "previewTitle", "", "recipients", "title", "offerTypeSubTitle", "autoDispatchSubTitle", "autoDispatchExplained", "autoDispatchRequired", "autoDispatchSummaryExplained", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;LNo0/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getAudienceExplained", "()Lcom/avito/android/remote/model/text/AttributedText;", "getHowItWorks", "getNoAudience", "LNo0/e;", "getPreviewTitle", "()LNo0/e;", "Ljava/lang/String;", "getRecipients", "()Ljava/lang/String;", "getTitle", "getOfferTypeSubTitle", "getAutoDispatchSubTitle", "getAutoDispatchExplained", "getAutoDispatchRequired", "getAutoDispatchSummaryExplained", "a", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: No0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C14599c {

    @com.google.gson.annotations.c("audienceExplained")
    @k
    private final AttributedText audienceExplained;

    @com.google.gson.annotations.c("autoDispatchExplained")
    @k
    private final AttributedText autoDispatchExplained;

    @com.google.gson.annotations.c("autoDispatchRequired")
    @k
    private final String autoDispatchRequired;

    @com.google.gson.annotations.c("autoDispatchSubTitle")
    @k
    private final String autoDispatchSubTitle;

    @com.google.gson.annotations.c("autoDispatchSummaryExplained")
    @k
    private final AttributedText autoDispatchSummaryExplained;

    @com.google.gson.annotations.c("howItWorks")
    @k
    private final AttributedText howItWorks;

    @com.google.gson.annotations.c("noAudience")
    @k
    private final AttributedText noAudience;

    @com.google.gson.annotations.c("offerTypeSubTitle")
    @k
    private final String offerTypeSubTitle;

    @com.google.gson.annotations.c("previewTitle")
    @k
    private final e previewTitle;

    @com.google.gson.annotations.c("recipients")
    @k
    private final String recipients;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    /* compiled from: CreateDiscountDispatchResponse.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"LNo0/c$a;", "", "<init>", "()V", "", "AUDIENCE_EXPLAINED", "Ljava/lang/String;", "AUTO_DISPATCH_EXPLAINED", "AUTO_DISPATCH_REQUIRED", "AUTO_DISPATCH_SUBTITLE", "AUTO_DISPATCH_SUMMARY_EXPLAINED", "HOW_IT_WORKS", "NO_AUDIENCE", "OFFER_TYPE_SUBTITLE", "PREVIEW_TITLE", "RECIPIENTS", "TITLE", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: No0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C14599c(@k AttributedText attributedText, @k AttributedText attributedText2, @k AttributedText attributedText3, @k e eVar, @k String str, @k String str2, @k String str3, @k String str4, @k AttributedText attributedText4, @k String str5, @k AttributedText attributedText5) {
        this.audienceExplained = attributedText;
        this.howItWorks = attributedText2;
        this.noAudience = attributedText3;
        this.previewTitle = eVar;
        this.recipients = str;
        this.title = str2;
        this.offerTypeSubTitle = str3;
        this.autoDispatchSubTitle = str4;
        this.autoDispatchExplained = attributedText4;
        this.autoDispatchRequired = str5;
        this.autoDispatchSummaryExplained = attributedText5;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14599c)) {
            return false;
        }
        C14599c c14599c = (C14599c) obj;
        return L.f(this.audienceExplained, c14599c.audienceExplained) && L.f(this.howItWorks, c14599c.howItWorks) && L.f(this.noAudience, c14599c.noAudience) && L.f(this.previewTitle, c14599c.previewTitle) && L.f(this.recipients, c14599c.recipients) && L.f(this.title, c14599c.title) && L.f(this.offerTypeSubTitle, c14599c.offerTypeSubTitle) && L.f(this.autoDispatchSubTitle, c14599c.autoDispatchSubTitle) && L.f(this.autoDispatchExplained, c14599c.autoDispatchExplained) && L.f(this.autoDispatchRequired, c14599c.autoDispatchRequired) && L.f(this.autoDispatchSummaryExplained, c14599c.autoDispatchSummaryExplained);
    }

    public final int hashCode() {
        return this.autoDispatchSummaryExplained.hashCode() + H.d(com.avito.android.actions_sheet.a.b(H.d(H.d(H.d(H.d((this.previewTitle.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(this.audienceExplained.hashCode() * 31, 31, this.howItWorks), 31, this.noAudience)) * 31, 31, this.recipients), 31, this.title), 31, this.offerTypeSubTitle), 31, this.autoDispatchSubTitle), 31, this.autoDispatchExplained), 31, this.autoDispatchRequired);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Descriptions(audienceExplained=");
        sb2.append(this.audienceExplained);
        sb2.append(", howItWorks=");
        sb2.append(this.howItWorks);
        sb2.append(", noAudience=");
        sb2.append(this.noAudience);
        sb2.append(", previewTitle=");
        sb2.append(this.previewTitle);
        sb2.append(", recipients=");
        sb2.append(this.recipients);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", offerTypeSubTitle=");
        sb2.append(this.offerTypeSubTitle);
        sb2.append(", autoDispatchSubTitle=");
        sb2.append(this.autoDispatchSubTitle);
        sb2.append(", autoDispatchExplained=");
        sb2.append(this.autoDispatchExplained);
        sb2.append(", autoDispatchRequired=");
        sb2.append(this.autoDispatchRequired);
        sb2.append(", autoDispatchSummaryExplained=");
        return com.avito.android.actions_sheet.a.w(sb2, this.autoDispatchSummaryExplained, ')');
    }
}
