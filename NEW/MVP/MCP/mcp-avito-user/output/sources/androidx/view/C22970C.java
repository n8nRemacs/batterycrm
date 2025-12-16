package androidx.view;

import X41.n;
import Y61.k;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* compiled from: LegacySavedStateHandleController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/C;", "", "<init>", "()V", "a", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22970C {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C22970C f46654a = new C22970C();

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/C$a;", "Landroidx/savedstate/c$a;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.C$a */
    public static final class a implements C23485c.a {
        @Override // androidx.view.C23485c.a
        public final void a(@k InterfaceC23487e interfaceC23487e) {
            if (!(interfaceC23487e instanceof T0)) {
                throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
            }
            S0 f42820b = ((T0) interfaceC23487e).getF42820b();
            C23485c savedStateRegistry = interfaceC23487e.getSavedStateRegistry();
            f42820b.getClass();
            LinkedHashMap linkedHashMap = f42820b.f46714a;
            Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
            while (it.hasNext()) {
                C22970C.a((M0) linkedHashMap.get((String) it.next()), savedStateRegistry, interfaceC23487e.getLifecycle());
            }
            if (new HashSet(linkedHashMap.keySet()).isEmpty()) {
                return;
            }
            savedStateRegistry.d(a.class);
        }
    }

    /* compiled from: LegacySavedStateHandleController.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/C$b", "Landroidx/lifecycle/L;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.C$b */
    public static final class b implements InterfaceC22979L {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Lifecycle f46655b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C23485c f46656c;

        public b(Lifecycle lifecycle, C23485c c23485c) {
            this.f46655b = lifecycle;
            this.f46656c = c23485c;
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f46655b.c(this);
                this.f46656c.d(a.class);
            }
        }
    }

    @n
    public static final void a(@k M0 m02, @k C23485c c23485c, @k Lifecycle lifecycle) {
        boolean z12;
        C23064t0 c23064t0 = (C23064t0) m02.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (c23064t0 == null || (z12 = c23064t0.f46892d)) {
            return;
        }
        if (z12) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        c23064t0.f46892d = true;
        lifecycle.a(c23064t0);
        c23485c.c(c23064t0.f46890b, c23064t0.f46891c.f46880e);
        f46654a.getClass();
        b(lifecycle, c23485c);
    }

    public static void b(Lifecycle lifecycle, C23485c c23485c) {
        Lifecycle.State f46705d = lifecycle.getF46705d();
        if (f46705d == Lifecycle.State.f46680c || f46705d.a(Lifecycle.State.f46682e)) {
            c23485c.d(a.class);
        } else {
            lifecycle.a(new b(lifecycle, c23485c));
        }
    }
}
