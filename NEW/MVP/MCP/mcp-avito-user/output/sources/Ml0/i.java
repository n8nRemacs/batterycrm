package ml0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u001d\u0010\u0013R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lml0/i;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "amountAttributed", "", "amountPenny", "Lcom/avito/android/deep_linking/links/DeepLink;", "extraInfoUri", "Lml0/r;", "helpContent", "label", "", "value", "", "withHelpIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLcom/avito/android/deep_linking/links/DeepLink;Lml0/r;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "b", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "c", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lml0/r;", "d", "()Lml0/r;", "e", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "g", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class i {

    @com.google.gson.annotations.c("amountAttributed")
    @Y61.l
    private final AttributedText amountAttributed;

    @com.google.gson.annotations.c("amountPenny")
    private final long amountPenny;

    @com.google.gson.annotations.c("extraInfoUri")
    @Y61.l
    private final DeepLink extraInfoUri;

    @com.google.gson.annotations.c("helpContent")
    @Y61.l
    private final r helpContent;

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final AttributedText label;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    @com.google.gson.annotations.c("withHelpIcon")
    @Y61.l
    private final Boolean withHelpIcon;

    public i(@Y61.l AttributedText attributedText, long j12, @Y61.l DeepLink deepLink, @Y61.l r rVar, @Y61.k AttributedText attributedText2, @Y61.k String str, @Y61.l Boolean bool) {
        this.amountAttributed = attributedText;
        this.amountPenny = j12;
        this.extraInfoUri = deepLink;
        this.helpContent = rVar;
        this.label = attributedText2;
        this.value = str;
        this.withHelpIcon = bool;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final AttributedText getAmountAttributed() {
        return this.amountAttributed;
    }

    /* renamed from: b, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final DeepLink getExtraInfoUri() {
        return this.extraInfoUri;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final r getHelpContent() {
        return this.helpContent;
    }

    @Y61.k
    /* renamed from: e, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Y61.l
    /* renamed from: g, reason: from getter */
    public final Boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }
}
