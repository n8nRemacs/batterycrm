package bp0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchV1Response.kt */
@P
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b!\u0010\u001cR\u001a\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b#\u0010\u0018R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u001a\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b%\u0010\u001cR\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u001a\u001a\u0004\b)\u0010\u001cR\u001a\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b*\u0010\u001c¨\u0006+"}, d2 = {"Lbp0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "audienceExplained", "autoDispatchExplained", "", "autoDispatchRequired", "autoDispatchSubTitle", "autoDispatchSummaryExplained", "fastChipsRecommendationSubtitle", "fastChipsRecommendationTitle", "fastChipsSubtitle", "fastChipsTitle", "howItWorks", "noAudience", "offerTypeSubTitle", "Lbp0/e;", "previews", "recipients", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lbp0/e;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "e", "f", "g", "h", "i", "j", "k", "l", "Lbp0/e;", "m", "()Lbp0/e;", "n", "o", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bp0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C25692d {

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

    @com.google.gson.annotations.c("fastChipsRecommendationSubtitle")
    @k
    private final String fastChipsRecommendationSubtitle;

    @com.google.gson.annotations.c("fastChipsRecommendationTitle")
    @k
    private final String fastChipsRecommendationTitle;

    @com.google.gson.annotations.c("fastChipsSubtitle")
    @k
    private final String fastChipsSubtitle;

    @com.google.gson.annotations.c("fastChipsTitle")
    @k
    private final String fastChipsTitle;

    @com.google.gson.annotations.c("howItWorks")
    @k
    private final AttributedText howItWorks;

    @com.google.gson.annotations.c("noAudience")
    @k
    private final AttributedText noAudience;

    @com.google.gson.annotations.c("offerTypeSubTitle")
    @k
    private final String offerTypeSubTitle;

    @com.google.gson.annotations.c("previews")
    @k
    private final C25693e previews;

    @com.google.gson.annotations.c("recipients")
    @k
    private final String recipients;

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    public C25692d(@k AttributedText attributedText, @k AttributedText attributedText2, @k String str, @k String str2, @k AttributedText attributedText3, @k String str3, @k String str4, @k String str5, @k String str6, @k AttributedText attributedText4, @k AttributedText attributedText5, @k String str7, @k C25693e c25693e, @k String str8, @k String str9) {
        this.audienceExplained = attributedText;
        this.autoDispatchExplained = attributedText2;
        this.autoDispatchRequired = str;
        this.autoDispatchSubTitle = str2;
        this.autoDispatchSummaryExplained = attributedText3;
        this.fastChipsRecommendationSubtitle = str3;
        this.fastChipsRecommendationTitle = str4;
        this.fastChipsSubtitle = str5;
        this.fastChipsTitle = str6;
        this.howItWorks = attributedText4;
        this.noAudience = attributedText5;
        this.offerTypeSubTitle = str7;
        this.previews = c25693e;
        this.recipients = str8;
        this.title = str9;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAudienceExplained() {
        return this.audienceExplained;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final AttributedText getAutoDispatchExplained() {
        return this.autoDispatchExplained;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getAutoDispatchRequired() {
        return this.autoDispatchRequired;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getAutoDispatchSubTitle() {
        return this.autoDispatchSubTitle;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getAutoDispatchSummaryExplained() {
        return this.autoDispatchSummaryExplained;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getFastChipsRecommendationSubtitle() {
        return this.fastChipsRecommendationSubtitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getFastChipsRecommendationTitle() {
        return this.fastChipsRecommendationTitle;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final String getFastChipsSubtitle() {
        return this.fastChipsSubtitle;
    }

    @k
    /* renamed from: i, reason: from getter */
    public final String getFastChipsTitle() {
        return this.fastChipsTitle;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final AttributedText getHowItWorks() {
        return this.howItWorks;
    }

    @k
    /* renamed from: k, reason: from getter */
    public final AttributedText getNoAudience() {
        return this.noAudience;
    }

    @k
    /* renamed from: l, reason: from getter */
    public final String getOfferTypeSubTitle() {
        return this.offerTypeSubTitle;
    }

    @k
    /* renamed from: m, reason: from getter */
    public final C25693e getPreviews() {
        return this.previews;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final String getRecipients() {
        return this.recipients;
    }

    @k
    /* renamed from: o, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
