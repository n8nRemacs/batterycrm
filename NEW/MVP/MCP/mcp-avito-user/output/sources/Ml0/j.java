package ml0;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.List;
import kotlin.Metadata;

/* compiled from: EstimateV4Response.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b#\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lml0/j;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "amountAttributed", "", "amountPenny", "", "Lml0/q;", "details", "Lcom/avito/android/deep_linking/links/DeepLink;", "extraInfoUri", "Lml0/r;", "helpContent", "label", "", "value", "", "withHelpIcon", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;JLjava/util/List;Lcom/avito/android/deep_linking/links/DeepLink;Lml0/r;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/Boolean;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "b", "()J", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lcom/avito/android/deep_linking/links/DeepLink;", "d", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lml0/r;", "e", "()Lml0/r;", "f", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ljava/lang/Boolean;", "h", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {

    @com.google.gson.annotations.c("amountAttributed")
    @Y61.l
    private final AttributedText amountAttributed;

    @com.google.gson.annotations.c("amountPenny")
    private final long amountPenny;

    @com.google.gson.annotations.c("details")
    @Y61.l
    private final List<q> details;

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

    public j(@Y61.l AttributedText attributedText, long j12, @Y61.l List<q> list, @Y61.l DeepLink deepLink, @Y61.l r rVar, @Y61.k AttributedText attributedText2, @Y61.k String str, @Y61.l Boolean bool) {
        this.amountAttributed = attributedText;
        this.amountPenny = j12;
        this.details = list;
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
    public final List<q> c() {
        return this.details;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final DeepLink getExtraInfoUri() {
        return this.extraInfoUri;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final r getHelpContent() {
        return this.helpContent;
    }

    @Y61.k
    /* renamed from: f, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    @Y61.l
    /* renamed from: h, reason: from getter */
    public final Boolean getWithHelpIcon() {
        return this.withHelpIcon;
    }
}
