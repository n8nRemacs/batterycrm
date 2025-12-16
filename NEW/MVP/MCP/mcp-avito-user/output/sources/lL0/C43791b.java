package ll0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateEditV4Response.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u001a\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0016\u001a\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lll0/b;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "amountAttributed", "", "amountPenny", "", "amountPennyPrefix", "Lll0/c;", "detailedFee", "Lcom/avito/android/deep_linking/links/DeepLink;", "extraInfoUri", "label", "value", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/lang/String;Lll0/c;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "b", "()J", "Ljava/lang/String;", "getAmountPennyPrefix", "()Ljava/lang/String;", "Lll0/c;", "getDetailedFee", "()Lll0/c;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "d", "e", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ll0.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C43791b {

    @com.google.gson.annotations.c("amountAttributed")
    @l
    private final AttributedText amountAttributed;

    @com.google.gson.annotations.c("amountPenny")
    private final long amountPenny;

    @com.google.gson.annotations.c("amountPennyPrefix")
    @l
    private final String amountPennyPrefix;

    @com.google.gson.annotations.c("detailedFee")
    @l
    private final C43792c detailedFee;

    @com.google.gson.annotations.c("extraInfoUri")
    @l
    private final DeepLink extraInfoUri;

    @com.google.gson.annotations.c("label")
    @k
    private final AttributedText label;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    public C43791b(@l AttributedText attributedText, long j12, @l String str, @l C43792c c43792c, @l DeepLink deepLink, @k AttributedText attributedText2, @k String str2) {
        this.amountAttributed = attributedText;
        this.amountPenny = j12;
        this.amountPennyPrefix = str;
        this.detailedFee = c43792c;
        this.extraInfoUri = deepLink;
        this.label = attributedText2;
        this.value = str2;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAmountAttributed() {
        return this.amountAttributed;
    }

    /* renamed from: b, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final DeepLink getExtraInfoUri() {
        return this.extraInfoUri;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
