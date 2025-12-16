package coil.view;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.L;

/* compiled from: RealSizeResolver.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcoil/size/e;", "Lcoil/size/h;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: coil.size.e, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27251e implements InterfaceC27254h {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C27253g f58762b;

    public C27251e(@k C27253g c27253g) {
        this.f58762b = c27253g;
    }

    @Override // coil.view.InterfaceC27254h
    @l
    public final Object a(@k Continuation<? super C27253g> continuation) {
        return this.f58762b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C27251e) {
            if (L.f(this.f58762b, ((C27251e) obj).f58762b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f58762b.hashCode();
    }
}
