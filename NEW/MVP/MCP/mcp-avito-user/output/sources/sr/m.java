package Sr;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: EstimateActivateV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"LSr/m;", "", "", "amountPenny", "Lcom/avito/android/remote/model/text/AttributedText;", "label", "", "value", "<init>", "(JLcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;)V", "J", "a", "()J", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "_avito_cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class m {

    @com.google.gson.annotations.c("amountPenny")
    private final long amountPenny;

    @com.google.gson.annotations.c("label")
    @Y61.k
    private final AttributedText label;

    @com.google.gson.annotations.c("value")
    @Y61.k
    private final String value;

    public m(long j12, @Y61.k AttributedText attributedText, @Y61.k String str) {
        this.amountPenny = j12;
        this.label = attributedText;
        this.value = str;
    }

    /* renamed from: a, reason: from getter */
    public final long getAmountPenny() {
        return this.amountPenny;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getLabel() {
        return this.label;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
