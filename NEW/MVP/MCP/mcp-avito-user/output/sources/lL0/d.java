package ll0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateEditV4Response.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b&\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b'\u0010\u001cR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lll0/d;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "amountAttributed", "", "amountPenny", "", "amountPennyPrefix", "Lll0/e;", "detailedFee", "Lcom/avito/android/deep_linking/links/DeepLink;", "extraInfoUri", "Lll0/g;", "helpContent", "label", "value", "", "withHelpIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/lang/String;Lll0/e;Lcom/avito/android/deep_linking/links/DeepLink;Lll0/g;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "b", "()J", "Ljava/lang/String;", "getAmountPennyPrefix", "()Ljava/lang/String;", "Lll0/e;", "getDetailedFee", "()Lll0/e;", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lll0/g;", "d", "()Lll0/g;", "e", "f", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d {

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
    private final e detailedFee;

    @com.google.gson.annotations.c("extraInfoUri")
    @l
    private final DeepLink extraInfoUri;

    @com.google.gson.annotations.c("helpContent")
    @l
    private final g helpContent;

    @com.google.gson.annotations.c("label")
    @k
    private final AttributedText label;

    @com.google.gson.annotations.c("value")
    @k
    private final String value;

    @com.google.gson.annotations.c("withHelpIcon")
    @l
    private final Boolean withHelpIcon;

    public d(@l AttributedText attributedText, long j12, @l String str, @l e eVar, @l DeepLink deepLink, @l g gVar, @k AttributedText attributedText2, @k String str2, @l Boolean bool) {
        this.amountAttributed = attributedText;
        this.amountPenny = j12;
        this.amountPennyPrefix = str;
        this.detailedFee = eVar;
        this.extraInfoUri = deepLink;
        this.helpContent = gVar;
        this.label = attributedText2;
        this.value = str2;
        this.withHelpIcon = bool;
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

    @l
    /* renamed from: d, reason: from getter */
    public final g getHelpContent() {
        return this.helpContent;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final Boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }
}
