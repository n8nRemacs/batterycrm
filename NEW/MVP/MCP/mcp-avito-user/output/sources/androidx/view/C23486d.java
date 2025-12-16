package androidx.view;

import M11.d;
import X41.n;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.arch.core.internal.b;
import androidx.view.C23485c;
import androidx.view.Lifecycle;
import j.K;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SavedStateRegistryController.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/d;", "", "a", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.savedstate.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23486d {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f54432d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC23487e f54433a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C23485c f54434b = new C23485c();

    /* renamed from: c, reason: collision with root package name */
    public boolean f54435c;

    /* compiled from: SavedStateRegistryController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/d$a;", "", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.savedstate.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @n
        @k
        public static C23486d a(@k InterfaceC23487e interfaceC23487e) {
            return new C23486d(interfaceC23487e, null);
        }

        public a() {
        }
    }

    public C23486d(InterfaceC23487e interfaceC23487e, C42822w c42822w) {
        this.f54433a = interfaceC23487e;
    }

    @K
    public final void a() {
        InterfaceC23487e interfaceC23487e = this.f54433a;
        Lifecycle lifecycle = interfaceC23487e.getLifecycle();
        if (lifecycle.getF46705d() != Lifecycle.State.f46680c) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        lifecycle.a(new C23484b(interfaceC23487e));
        C23485c c23485c = this.f54434b;
        if (c23485c.f54427b) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        lifecycle.a(new d(c23485c, 4));
        c23485c.f54427b = true;
        this.f54435c = true;
    }

    @K
    public final void b(@l Bundle bundle) {
        if (!this.f54435c) {
            a();
        }
        Lifecycle lifecycle = this.f54433a.getLifecycle();
        if (lifecycle.getF46705d().a(Lifecycle.State.f46682e)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + lifecycle.getF46705d()).toString());
        }
        C23485c c23485c = this.f54434b;
        if (!c23485c.f54427b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c23485c.f54429d) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c23485c.f54428c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c23485c.f54429d = true;
    }

    @K
    public final void c(@k Bundle bundle) {
        C23485c c23485c = this.f54434b;
        c23485c.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = c23485c.f54428c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b<String, C23485c.InterfaceC1922c> bVar = c23485c.f54426a;
        bVar.getClass();
        b.d dVar = new b.d();
        bVar.f22703d.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((C23485c.InterfaceC1922c) entry.getValue()).H());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
