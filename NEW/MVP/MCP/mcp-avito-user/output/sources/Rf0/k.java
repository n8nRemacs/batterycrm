package RF0;

import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoStrNavBarV2.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LRF0/k;", "", "", "progress", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/Float;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_trx-promo_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class k {

    @com.google.gson.annotations.c("button")
    @Y61.l
    private final ButtonAction button;

    @com.google.gson.annotations.c("progress")
    @Y61.l
    private final Float progress;

    public k(@Y61.l Float f12, @Y61.l ButtonAction buttonAction) {
        this.progress = f12;
        this.button = buttonAction;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.progress, kVar.progress) && L.f(this.button, kVar.button);
    }

    public final int hashCode() {
        Float f12 = this.progress;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        ButtonAction buttonAction = this.button;
        return iHashCode + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoStrNavBarV2(progress=");
        sb2.append(this.progress);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }
}
