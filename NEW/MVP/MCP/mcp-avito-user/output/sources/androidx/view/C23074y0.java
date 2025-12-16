package androidx.view;

import A1.i;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.view.C23060r0;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.P0;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import z1.AbstractC50339a;
import z1.C50343e;

/* compiled from: SavedStateViewModelFactory.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/y0;", "Landroidx/lifecycle/P0$e;", "Landroidx/lifecycle/P0$c;", "<init>", "()V", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.y0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23074y0 extends P0.e implements P0.c {

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Application f46925d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final P0.a f46926e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Bundle f46927f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Lifecycle f46928g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final C23485c f46929h;

    public C23074y0() {
        this.f46926e = new P0.a();
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls, @k AbstractC50339a abstractC50339a) {
        i.a aVar = P0.d.f46701c;
        LinkedHashMap linkedHashMap = ((C50343e) abstractC50339a).f443747a;
        String str = (String) linkedHashMap.get(aVar);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(C23066u0.f46894a) == null || linkedHashMap.get(C23066u0.f46895b) == null) {
            if (this.f46928g != null) {
                return (T) create(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(P0.a.f46696g);
        boolean zIsAssignableFrom = C22995b.class.isAssignableFrom(cls);
        Constructor constructorA = (!zIsAssignableFrom || application == null) ? C23076z0.a(cls, C23076z0.f46931b) : C23076z0.a(cls, C23076z0.f46930a);
        return constructorA == null ? (T) this.f46926e.create(cls, abstractC50339a) : (!zIsAssignableFrom || application == null) ? (T) C23076z0.b(cls, constructorA, C23066u0.a(abstractC50339a)) : (T) C23076z0.b(cls, constructorA, application, C23066u0.a(abstractC50339a));
    }

    @Override // androidx.lifecycle.P0.e
    @RestrictTo
    public final void onRequery(@k M0 m02) {
        Lifecycle lifecycle = this.f46928g;
        if (lifecycle != null) {
            C22970C.a(m02, this.f46929h, lifecycle);
        }
    }

    @SuppressLint({"LambdaLast"})
    public C23074y0(@l Application application, @k InterfaceC23487e interfaceC23487e, @l Bundle bundle) {
        P0.a aVar;
        this.f46929h = interfaceC23487e.getSavedStateRegistry();
        this.f46928g = interfaceC23487e.getLifecycle();
        this.f46927f = bundle;
        this.f46925d = application;
        if (application != null) {
            P0.a.f46694e.getClass();
            if (P0.a.f46695f == null) {
                P0.a.f46695f = new P0.a(application);
            }
            aVar = P0.a.f46695f;
        } else {
            aVar = new P0.a();
        }
        this.f46926e = aVar;
    }

    @k
    public final <T extends M0> T create(@k String str, @k Class<T> cls) {
        Constructor constructorA;
        T t12;
        Lifecycle lifecycle = this.f46928g;
        if (lifecycle != null) {
            boolean zIsAssignableFrom = C22995b.class.isAssignableFrom(cls);
            Application application = this.f46925d;
            if (zIsAssignableFrom && application != null) {
                constructorA = C23076z0.a(cls, C23076z0.f46930a);
            } else {
                constructorA = C23076z0.a(cls, C23076z0.f46931b);
            }
            if (constructorA == null) {
                if (application != null) {
                    return (T) this.f46926e.create(cls);
                }
                P0.d.f46699a.getClass();
                if (P0.d.f46700b == null) {
                    P0.d.f46700b = new P0.d();
                }
                return (T) P0.d.f46700b.create(cls);
            }
            C23485c c23485c = this.f46929h;
            Bundle bundle = this.f46927f;
            C22970C c22970c = C22970C.f46654a;
            Bundle bundleA = c23485c.a(str);
            C23060r0.f46874f.getClass();
            C23060r0 c23060r0A = C23060r0.a.a(bundleA, bundle);
            C23064t0 c23064t0 = new C23064t0(str, c23060r0A);
            if (!c23064t0.f46892d) {
                c23064t0.f46892d = true;
                lifecycle.a(c23064t0);
                c23485c.c(str, c23060r0A.f46880e);
                C22970C.f46654a.getClass();
                C22970C.b(lifecycle, c23485c);
                if (zIsAssignableFrom && application != null) {
                    t12 = (T) C23076z0.b(cls, constructorA, application, c23060r0A);
                } else {
                    t12 = (T) C23076z0.b(cls, constructorA, c23060r0A);
                }
                t12.addCloseable("androidx.lifecycle.savedstate.vm.tag", c23064t0);
                return t12;
            }
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
