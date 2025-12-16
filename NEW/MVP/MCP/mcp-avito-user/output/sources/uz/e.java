package uZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MnzNavBarV2.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LuZ/e;", "", "", "progress", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/Float;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/Float;", "b", "()Ljava/lang/Float;", "Lcom/avito/android/remote/model/ButtonAction;", "a", "()Lcom/avito/android/remote/model/ButtonAction;", "_avito_mnz-common_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    @com.google.gson.annotations.c("button")
    @l
    private final ButtonAction button;

    @com.google.gson.annotations.c("progress")
    @l
    private final Float progress;

    public e(@l Float f12, @l ButtonAction buttonAction) {
        this.progress = f12;
        this.button = buttonAction;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final Float getProgress() {
        return this.progress;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.progress, eVar.progress) && L.f(this.button, eVar.button);
    }

    public final int hashCode() {
        Float f12 = this.progress;
        int iHashCode = (f12 == null ? 0 : f12.hashCode()) * 31;
        ButtonAction buttonAction = this.button;
        return iHashCode + (buttonAction != null ? buttonAction.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MnzNavBarV2(progress=");
        sb2.append(this.progress);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }
}
