package coil.view;

import Y61.k;
import Y61.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealViewSizeResolver.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcoil/size/f;", "Landroid/view/View;", "T", "Lcoil/size/j;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27252f<T extends View> implements InterfaceC27256j<T> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final T f58763b;

    /* JADX WARN: Multi-variable type inference failed */
    public C27252f(@k View view) {
        this.f58763b = view;
    }

    @Override // coil.view.InterfaceC27256j
    public final boolean c() {
        return true;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27252f) {
            if (L.f(this.f58763b, ((C27252f) obj).f58763b)) {
                return true;
            }
        }
        return false;
    }

    @Override // coil.view.InterfaceC27256j
    @k
    public final T getView() {
        return this.f58763b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.f58763b.hashCode() * 31);
    }
}
