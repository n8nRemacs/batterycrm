package androidx.view;

import X41.f;
import X41.i;
import Y61.k;
import android.os.Bundle;
import androidx.view.C23060r0;
import androidx.view.C23485c;
import androidx.view.InterfaceC23487e;
import androidx.view.Lifecycle;
import androidx.view.P0;
import j.K;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: SavedStateHandleSupport.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@i
/* renamed from: androidx.lifecycle.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23066u0 {

    /* renamed from: a, reason: collision with root package name */
    @f
    @k
    public static final b f46894a = new b();

    /* renamed from: b, reason: collision with root package name */
    @f
    @k
    public static final c f46895b = new c();

    /* renamed from: c, reason: collision with root package name */
    @f
    @k
    public static final a f46896c = new a();

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/u0$a", "Lz1/a$b;", "Landroid/os/Bundle;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u0$a */
    public static final class a implements AbstractC50339a.b<Bundle> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/u0$b", "Lz1/a$b;", "Landroidx/savedstate/e;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u0$b */
    public static final class b implements AbstractC50339a.b<InterfaceC23487e> {
    }

    /* compiled from: SavedStateHandleSupport.kt */
    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/lifecycle/u0$c", "Lz1/a$b;", "Landroidx/lifecycle/T0;", "lifecycle-viewmodel-savedstate_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.u0$c */
    public static final class c implements AbstractC50339a.b<T0> {
    }

    @K
    @k
    public static final C23060r0 a(@k AbstractC50339a abstractC50339a) {
        InterfaceC23487e interfaceC23487e = (InterfaceC23487e) abstractC50339a.a(f46894a);
        if (interfaceC23487e == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        T0 t02 = (T0) abstractC50339a.a(f46895b);
        if (t02 == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) abstractC50339a.a(f46896c);
        String str = (String) abstractC50339a.a(P0.d.f46701c);
        if (str == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
        }
        C23485c.InterfaceC1922c interfaceC1922cB = interfaceC23487e.getSavedStateRegistry().b();
        C23070w0 c23070w0 = interfaceC1922cB instanceof C23070w0 ? (C23070w0) interfaceC1922cB : null;
        if (c23070w0 == null) {
            throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
        }
        LinkedHashMap linkedHashMap = ((C23072x0) new P0(t02, new C23068v0()).b(C23072x0.class, "androidx.lifecycle.internal.SavedStateHandlesVM")).f46923E;
        C23060r0 c23060r0 = (C23060r0) linkedHashMap.get(str);
        if (c23060r0 != null) {
            return c23060r0;
        }
        C23060r0.a aVar = C23060r0.f46874f;
        c23070w0.a();
        Bundle bundle2 = c23070w0.f46911c;
        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
        Bundle bundle4 = c23070w0.f46911c;
        if (bundle4 != null) {
            bundle4.remove(str);
        }
        Bundle bundle5 = c23070w0.f46911c;
        if (bundle5 != null && bundle5.isEmpty()) {
            c23070w0.f46911c = null;
        }
        aVar.getClass();
        C23060r0 c23060r0A = C23060r0.a.a(bundle3, bundle);
        linkedHashMap.put(str, c23060r0A);
        return c23060r0A;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @K
    public static final <T extends InterfaceC23487e & T0> void b(@k T t12) {
        Lifecycle.State f46705d = t12.getLifecycle().getF46705d();
        if (f46705d != Lifecycle.State.f46680c && f46705d != Lifecycle.State.f46681d) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t12.getSavedStateRegistry().b() == null) {
            C23070w0 c23070w0 = new C23070w0(t12.getSavedStateRegistry(), t12);
            t12.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", c23070w0);
            t12.getLifecycle().a(new C23062s0(c23070w0));
        }
    }
}
