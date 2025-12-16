package androidx.view;

import Y61.k;
import androidx.view.Lifecycle;
import j.K;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.N0;

/* compiled from: LifecycleController.jvm.kt */
@s0
@K
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/E;", "", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22972E {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Lifecycle f46659a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Lifecycle.State f46660b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C23061s f46661c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final C22971D f46662d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.D, androidx.lifecycle.O] */
    public C22972E(@k Lifecycle lifecycle, @k Lifecycle.State state, @k C23061s c23061s, @k final N0 n02) {
        this.f46659a = lifecycle;
        this.f46660b = state;
        this.f46661c = c23061s;
        ?? r32 = new InterfaceC22979L() { // from class: androidx.lifecycle.D
            @Override // androidx.view.InterfaceC22979L
            public final void HH(InterfaceC22983P interfaceC22983P, Lifecycle.Event event) {
                Lifecycle.State f46705d = interfaceC22983P.getLifecycle().getF46705d();
                Lifecycle.State state2 = Lifecycle.State.f46679b;
                C22972E c22972e = this.f46657b;
                if (f46705d == state2) {
                    n02.c(null);
                    c22972e.a();
                    return;
                }
                int iCompareTo = interfaceC22983P.getLifecycle().getF46705d().compareTo(c22972e.f46660b);
                C23061s c23061s2 = c22972e.f46661c;
                if (iCompareTo < 0) {
                    c23061s2.f46881a = true;
                } else if (c23061s2.f46881a) {
                    if (c23061s2.f46882b) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher");
                    }
                    c23061s2.f46881a = false;
                    c23061s2.a();
                }
            }
        };
        this.f46662d = r32;
        if (lifecycle.getF46705d() != Lifecycle.State.f46679b) {
            lifecycle.a(r32);
        } else {
            n02.c(null);
            a();
        }
    }

    @K
    public final void a() {
        this.f46659a.c(this.f46662d);
        C23061s c23061s = this.f46661c;
        c23061s.f46882b = true;
        c23061s.a();
    }
}
