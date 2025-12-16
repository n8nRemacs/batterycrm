package cp0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiCreateDispatchVasV1Response.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcp0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "audienceExplained", "howItWorks", "noAudience", "", "offerTypeSubTitle", "Lcp0/i;", "previewTitle", "recipients", "title", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Lcp0/i;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "c", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcp0/i;", "e", "()Lcp0/i;", "f", "g", "_avito_sbc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: cp0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C39393d {

    @com.google.gson.annotations.c("audienceExplained")
    @Y61.k
    private final AttributedText audienceExplained;

    @com.google.gson.annotations.c("howItWorks")
    @Y61.k
    private final AttributedText howItWorks;

    @com.google.gson.annotations.c("noAudience")
    @Y61.k
    private final AttributedText noAudience;

    @com.google.gson.annotations.c("offerTypeSubTitle")
    @Y61.k
    private final String offerTypeSubTitle;

    @com.google.gson.annotations.c("previewTitle")
    @Y61.k
    private final i previewTitle;

    @com.google.gson.annotations.c("recipients")
    @Y61.k
    private final String recipients;

    @com.google.gson.annotations.c("title")
    @Y61.k
    private final String title;

    public C39393d(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2, @Y61.k AttributedText attributedText3, @Y61.k String str, @Y61.k i iVar, @Y61.k String str2, @Y61.k String str3) {
        this.audienceExplained = attributedText;
        this.howItWorks = attributedText2;
        this.noAudience = attributedText3;
        this.offerTypeSubTitle = str;
        this.previewTitle = iVar;
        this.recipients = str2;
        this.title = str3;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getAudienceExplained() {
        return this.audienceExplained;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getHowItWorks() {
        return this.howItWorks;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getNoAudience() {
        return this.noAudience;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getOfferTypeSubTitle() {
        return this.offerTypeSubTitle;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final i getPreviewTitle() {
        return this.previewTitle;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getRecipients() {
        return this.recipients;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }
}
