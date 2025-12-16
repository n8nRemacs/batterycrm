package androidx.fragment.app;

import Fc1.G3;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.view.C22985S;
import androidx.view.C23066u0;
import androidx.view.C23074y0;
import androidx.view.C23485c;
import androidx.view.C23486d;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import j.InterfaceC42153i;
import z1.AbstractC50339a;
import z1.C50343e;

/* compiled from: FragmentViewLifecycleOwner.java */
/* loaded from: classes.dex */
class P implements InterfaceC22969B, InterfaceC23487e, T0 {

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f46494b;

    /* renamed from: c, reason: collision with root package name */
    public final S0 f46495c;

    /* renamed from: d, reason: collision with root package name */
    public final G3 f46496d;

    /* renamed from: e, reason: collision with root package name */
    public P0.c f46497e;

    /* renamed from: f, reason: collision with root package name */
    public C22985S f46498f = null;

    /* renamed from: g, reason: collision with root package name */
    public C23486d f46499g = null;

    public P(@j.N Fragment fragment, @j.N S0 s02, @j.N G3 g32) {
        this.f46494b = fragment;
        this.f46495c = s02;
        this.f46496d = g32;
    }

    public final void a(@j.N Lifecycle.Event event) {
        this.f46498f.f(event);
    }

    public final void b() {
        if (this.f46498f == null) {
            this.f46498f = new C22985S(this, true);
            C23486d.f54432d.getClass();
            C23486d c23486dA = C23486d.a.a(this);
            this.f46499g = c23486dA;
            c23486dA.a();
            this.f46496d.run();
        }
    }

    @Override // androidx.view.InterfaceC22969B
    @InterfaceC42153i
    @j.N
    public final AbstractC50339a getDefaultViewModelCreationExtras() {
        Application application;
        Fragment fragment = this.f46494b;
        Context applicationContext = fragment.requireContext().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C50343e c50343e = new C50343e();
        if (application != null) {
            c50343e.b(P0.a.f46696g, application);
        }
        c50343e.b(C23066u0.f46894a, fragment);
        c50343e.b(C23066u0.f46895b, this);
        if (fragment.getArguments() != null) {
            c50343e.b(C23066u0.f46896c, fragment.getArguments());
        }
        return c50343e;
    }

    @Override // androidx.view.InterfaceC22969B
    @j.N
    public final P0.c getDefaultViewModelProviderFactory() {
        Application application;
        Fragment fragment = this.f46494b;
        P0.c defaultViewModelProviderFactory = fragment.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(fragment.mDefaultFactory)) {
            this.f46497e = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.f46497e == null) {
            Context applicationContext = fragment.requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            this.f46497e = new C23074y0(application, fragment, fragment.getArguments());
        }
        return this.f46497e;
    }

    @Override // androidx.view.InterfaceC22983P
    @j.N
    public final Lifecycle getLifecycle() {
        b();
        return this.f46498f;
    }

    @Override // androidx.view.InterfaceC23487e
    @j.N
    public final C23485c getSavedStateRegistry() {
        b();
        return this.f46499g.f54434b;
    }

    @Override // androidx.view.T0
    @j.N
    /* renamed from: getViewModelStore */
    public final S0 getF42820b() {
        b();
        return this.f46495c;
    }
}
