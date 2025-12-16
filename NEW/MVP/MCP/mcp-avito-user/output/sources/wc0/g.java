package wC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: ApiTariffCptInfoV3Response.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"LwC0/g;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "leftText", "rightText", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "a", "()Lcom/avito/android/remote/model/text/AttributedText;", "b", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g {

    @com.google.gson.annotations.c("leftText")
    @Y61.k
    private final AttributedText leftText;

    @com.google.gson.annotations.c("rightText")
    @Y61.k
    private final AttributedText rightText;

    public g(@Y61.k AttributedText attributedText, @Y61.k AttributedText attributedText2) {
        this.leftText = attributedText;
        this.rightText = attributedText2;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public final AttributedText getLeftText() {
        return this.leftText;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getRightText() {
        return this.rightText;
    }
}
