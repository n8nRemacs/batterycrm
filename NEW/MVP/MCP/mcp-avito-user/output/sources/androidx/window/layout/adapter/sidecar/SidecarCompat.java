package androidx.window.layout.adapter.sidecar;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.j;
import androidx.core.util.InterfaceC22791e;
import androidx.window.core.p;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.adapter.sidecar.h;
import androidx.window.layout.n;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import j.B;
import j.k0;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: SidecarCompat.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat;", "Landroidx/window/layout/adapter/sidecar/a;", "a", "b", "c", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class SidecarCompat implements androidx.window.layout.adapter.sidecar.a {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f55275f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @l
    public final SidecarInterface f55276a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final androidx.window.layout.adapter.sidecar.b f55277b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f55278c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashMap f55279d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public b f55280e;

    /* compiled from: SidecarCompat.kt */
    @s0
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "Landroidx/window/sidecar/SidecarDeviceState;", "newDeviceState", "Lkotlin/G0;", "onDeviceStateChanged", "(Landroidx/window/sidecar/SidecarDeviceState;)V", "Landroid/os/IBinder;", "windowToken", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "newLayout", "onWindowLayoutChanged", "(Landroid/os/IBinder;Landroidx/window/sidecar/SidecarWindowLayoutInfo;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        public TranslatingCallback() {
        }

        public void onDeviceStateChanged(@k SidecarDeviceState newDeviceState) {
            SidecarInterface f55276a;
            Collection<Activity> collectionValues = SidecarCompat.this.f55278c.values();
            SidecarCompat sidecarCompat = SidecarCompat.this;
            for (Activity activity : collectionValues) {
                SidecarCompat.f55275f.getClass();
                IBinder iBinderA = a.a(activity);
                SidecarWindowLayoutInfo windowLayoutInfo = null;
                if (iBinderA != null && (f55276a = sidecarCompat.getF55276a()) != null) {
                    windowLayoutInfo = f55276a.getWindowLayoutInfo(iBinderA);
                }
                b bVar = sidecarCompat.f55280e;
                if (bVar != null) {
                    bVar.b(activity, sidecarCompat.f55277b.e(windowLayoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(@k IBinder windowToken, @k SidecarWindowLayoutInfo newLayout) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SidecarDeviceState sidecarDeviceState;
            Activity activity = (Activity) SidecarCompat.this.f55278c.get(windowToken);
            if (activity == null) {
                return;
            }
            androidx.window.layout.adapter.sidecar.b bVar = SidecarCompat.this.f55277b;
            SidecarInterface f55276a = SidecarCompat.this.getF55276a();
            if (f55276a == null || (sidecarDeviceState = f55276a.getDeviceState()) == null) {
                sidecarDeviceState = new SidecarDeviceState();
            }
            n nVarE = bVar.e(newLayout, sidecarDeviceState);
            b bVar2 = SidecarCompat.this.f55280e;
            if (bVar2 != null) {
                bVar2.b(activity, nVarE);
            }
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @l
        public static IBinder a(@l Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }

        @l
        public static SidecarInterface b(@k Context context) {
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        @l
        public static p c() {
            try {
                String apiVersion = SidecarProvider.getApiVersion();
                if (TextUtils.isEmpty(apiVersion)) {
                    return null;
                }
                p.f55200g.getClass();
                return p.a.a(apiVersion);
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public a() {
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements a.InterfaceC1943a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final h.b f55282a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ReentrantLock f55283b = new ReentrantLock();

        /* renamed from: c, reason: collision with root package name */
        @B
        @k
        public final WeakHashMap<Activity, n> f55284c = new WeakHashMap<>();

        public b(@k h.b bVar) {
            this.f55282a = bVar;
        }

        public final void a(@k Activity activity) {
            ReentrantLock reentrantLock = this.f55283b;
            reentrantLock.lock();
            try {
                this.f55284c.put(activity, null);
                G0 g02 = G0.f406611a;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void b(@k Activity activity, @k n nVar) {
            ReentrantLock reentrantLock = this.f55283b;
            reentrantLock.lock();
            WeakHashMap<Activity, n> weakHashMap = this.f55284c;
            try {
                if (nVar.equals(weakHashMap.get(activity))) {
                    return;
                }
                weakHashMap.put(activity, nVar);
                reentrantLock.unlock();
                Iterator<h.c> it = h.this.f55300b.iterator();
                while (it.hasNext()) {
                    h.c next = it.next();
                    if (next.f55302a.equals(activity)) {
                        next.f55305d = nVar;
                        next.f55303b.execute(new i(next, nVar));
                    }
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public SidecarCompat(@k Context context) {
        f55275f.getClass();
        SidecarInterface sidecarInterfaceB = a.b(context);
        androidx.window.layout.adapter.sidecar.b bVar = new androidx.window.layout.adapter.sidecar.b(null, 1, null);
        this.f55276a = sidecarInterfaceB;
        this.f55277b = bVar;
        this.f55278c = new LinkedHashMap();
        this.f55279d = new LinkedHashMap();
    }

    @k0
    @l
    /* renamed from: d, reason: from getter */
    public final SidecarInterface getF55276a() {
        return this.f55276a;
    }

    @k0
    @k
    public final n e(@k Activity activity) {
        SidecarDeviceState sidecarDeviceState;
        f55275f.getClass();
        IBinder iBinderA = a.a(activity);
        if (iBinderA == null) {
            return new n(C42745f0.z());
        }
        SidecarInterface sidecarInterface = this.f55276a;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinderA) : null;
        SidecarInterface sidecarInterface2 = this.f55276a;
        if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return this.f55277b.e(windowLayoutInfo, sidecarDeviceState);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(@k Activity activity) {
        SidecarInterface sidecarInterface;
        f55275f.getClass();
        IBinder iBinderA = a.a(activity);
        if (iBinderA == null) {
            return;
        }
        SidecarInterface sidecarInterface2 = this.f55276a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinderA);
        }
        LinkedHashMap linkedHashMap = this.f55279d;
        InterfaceC22791e<Configuration> interfaceC22791e = (InterfaceC22791e) linkedHashMap.get(activity);
        if (interfaceC22791e != null) {
            if (activity instanceof j) {
                ((j) activity).removeOnConfigurationChangedListener(interfaceC22791e);
            }
            linkedHashMap.remove(activity);
        }
        b bVar = this.f55280e;
        if (bVar != null) {
            bVar.a(activity);
        }
        LinkedHashMap linkedHashMap2 = this.f55278c;
        boolean z12 = linkedHashMap2.size() == 1;
        linkedHashMap2.remove(iBinderA);
        if (!z12 || (sidecarInterface = this.f55276a) == null) {
            return;
        }
        sidecarInterface.onDeviceStateListenersChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(@k IBinder iBinder, @k final Activity activity) {
        SidecarInterface sidecarInterface;
        LinkedHashMap linkedHashMap = this.f55278c;
        linkedHashMap.put(iBinder, activity);
        SidecarInterface sidecarInterface2 = this.f55276a;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
        }
        if (linkedHashMap.size() == 1 && (sidecarInterface = this.f55276a) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        b bVar = this.f55280e;
        if (bVar != null) {
            bVar.b(activity, e(activity));
        }
        LinkedHashMap linkedHashMap2 = this.f55279d;
        if (linkedHashMap2.get(activity) == null && (activity instanceof j)) {
            InterfaceC22791e<Configuration> interfaceC22791e = new InterfaceC22791e() { // from class: androidx.window.layout.adapter.sidecar.g
                @Override // androidx.core.util.InterfaceC22791e
                public final void accept(Object obj) {
                    SidecarCompat sidecarCompat = this.f55294b;
                    SidecarCompat.b bVar2 = sidecarCompat.f55280e;
                    if (bVar2 != null) {
                        Activity activity2 = activity;
                        bVar2.b(activity2, sidecarCompat.e(activity2));
                    }
                }
            };
            linkedHashMap2.put(activity, interfaceC22791e);
            ((j) activity).addOnConfigurationChangedListener(interfaceC22791e);
        }
    }

    public final void h(@k h.b bVar) {
        this.f55280e = new b(bVar);
        SidecarInterface sidecarInterface = this.f55276a;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctElementSidecarCallback(this.f55277b, new TranslatingCallback()));
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    public final boolean i() {
        Class<?> cls;
        Class<?> cls2;
        Class<?> cls3;
        Class<?> cls4;
        try {
            SidecarInterface sidecarInterface = this.f55276a;
            Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
            Class<?> returnType = method != null ? method.getReturnType() : null;
            Class cls5 = Void.TYPE;
            if (!L.f(returnType, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
            }
            SidecarInterface sidecarInterface2 = this.f55276a;
            if (sidecarInterface2 != null) {
                sidecarInterface2.getDeviceState();
            }
            SidecarInterface sidecarInterface3 = this.f55276a;
            if (sidecarInterface3 != null) {
                sidecarInterface3.onDeviceStateListenersChanged(true);
            }
            SidecarInterface sidecarInterface4 = this.f55276a;
            Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
            Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
            if (!L.f(returnType2, SidecarWindowLayoutInfo.class)) {
                throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
            }
            SidecarInterface sidecarInterface5 = this.f55276a;
            Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
            Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
            if (!L.f(returnType3, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
            }
            SidecarInterface sidecarInterface6 = this.f55276a;
            Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
            Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
            if (!L.f(returnType4, cls5)) {
                throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
            }
            SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
            try {
                sidecarDeviceState.posture = 3;
            } catch (NoSuchFieldError unused) {
                SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
                if (((Integer) SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0])).intValue() != 3) {
                    throw new Exception("Invalid device posture getter/setter");
                }
            }
            SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
            sidecarDisplayFeature.setRect(sidecarDisplayFeature.getRect());
            sidecarDisplayFeature.getType();
            sidecarDisplayFeature.setType(1);
            SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
            try {
                List list = sidecarWindowLayoutInfo.displayFeatures;
            } catch (NoSuchFieldError unused2) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(sidecarDisplayFeature);
                SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
                if (!L.f(arrayList, (List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(sidecarWindowLayoutInfo, new Object[0]))) {
                    throw new Exception("Invalid display feature getter/setter");
                }
            }
            return true;
        } catch (Throwable unused3) {
            return false;
        }
    }

    /* compiled from: SidecarCompat.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/sidecar/SidecarCompat$c;", "Landroid/view/View$OnAttachStateChangeListener;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SidecarCompat f55285b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WeakReference<Activity> f55286c;

        public c(@k SidecarCompat sidecarCompat, @k Activity activity) {
            this.f55285b = sidecarCompat;
            this.f55286c = new WeakReference<>(activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(@k View view) {
            view.removeOnAttachStateChangeListener(this);
            Activity activity = this.f55286c.get();
            SidecarCompat.f55275f.getClass();
            IBinder iBinderA = a.a(activity);
            if (activity == null || iBinderA == null) {
                return;
            }
            this.f55285b.g(iBinderA, activity);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(@k View view) {
        }
    }
}
