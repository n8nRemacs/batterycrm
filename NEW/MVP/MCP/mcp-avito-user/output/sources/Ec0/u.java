package eC0;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CpxConfigureLandingResult.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LeC0/u;", "", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "", "bottomSpacer", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Integer;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "b", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/Integer;", "a", "()Ljava/lang/Integer;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class u {

    @com.google.gson.annotations.c("bottomSpacer")
    @Y61.l
    private final Integer bottomSpacer;

    @com.google.gson.annotations.c("text")
    @Y61.k
    private final AttributedText text;

    public u(@Y61.k AttributedText attributedText, @Y61.l Integer num) {
        this.text = attributedText;
        this.bottomSpacer = num;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final Integer getBottomSpacer() {
        return this.bottomSpacer;
    }

    @Y61.k
    /* renamed from: b, reason: from getter */
    public final AttributedText getText() {
        return this.text;
    }
}
