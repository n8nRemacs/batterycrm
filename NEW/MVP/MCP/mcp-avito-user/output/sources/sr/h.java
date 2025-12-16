package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LSr/h;", "", "", "amountPenny", "Lcom/avito/android/deep_linking/links/DeepLink;", "extraInfoUri", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "", "value", "<init>", "(JLcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "J", "a", "()J", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class h {

    @com.google.gson.annotations.c("amountPenny")
    private final long amountPenny;

    @com.google.gson.annotations.c("extraInfoUri")
    @Y61.l
    private final DeepLink extraInfoUri;

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final AttributedText label;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public h(long j12, @Y61.l DeepLink deepLink, @Y61.k AttributedText attributedText, @Y61.k String str) {
        this.amountPenny = j12;
        this.extraInfoUri = deepLink;
        this.label = attributedText;
        this.value = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final DeepLink getExtraInfoUri() {
        return this.extraInfoUri;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
