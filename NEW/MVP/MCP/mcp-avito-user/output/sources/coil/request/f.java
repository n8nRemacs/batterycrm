package coil.request;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23057q;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: GlobalLifecycle.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcoil/request/f;", "Landroidx/lifecycle/Lifecycle;", "<init>", "()V", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f extends Lifecycle {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final f f58644b = new f();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f58645c = new a();

    /* compiled from: GlobalLifecycle.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"coil/request/f$a", "Landroidx/lifecycle/P;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC22983P {
        @Override // androidx.view.InterfaceC22983P
        public final Lifecycle getLifecycle() {
            return f.f58644b;
        }
    }

    @Override // androidx.view.Lifecycle
    public final void a(@Y61.k InterfaceC22982O interfaceC22982O) {
        if (!(interfaceC22982O instanceof InterfaceC23057q)) {
            throw new IllegalArgumentException((interfaceC22982O + " must implement androidx.lifecycle.DefaultLifecycleObserver.").toString());
        }
        InterfaceC23057q interfaceC23057q = (InterfaceC23057q) interfaceC22982O;
        a aVar = f58645c;
        interfaceC23057q.onCreate(aVar);
        interfaceC23057q.onStart(aVar);
        interfaceC23057q.onResume(aVar);
    }

    @Override // androidx.view.Lifecycle
    @Y61.k
    /* renamed from: b */
    public final Lifecycle.State getF46705d() {
        return Lifecycle.State.f46683f;
    }

    @Y61.k
    public final String toString() {
        return "coil.request.GlobalLifecycle";
    }

    @Override // androidx.view.Lifecycle
    public final void c(@Y61.k InterfaceC22982O interfaceC22982O) {
    }
}
