package androidx.window.layout.adapter.sidecar;

import Y61.k;
import Y61.l;
import android.app.Activity;
import android.content.Context;
import android.os.IBinder;
import androidx.core.util.InterfaceC22791e;
import androidx.window.layout.adapter.sidecar.SidecarCompat;
import androidx.window.layout.adapter.sidecar.a;
import androidx.window.layout.n;
import j.B;
import j.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import m2.InterfaceC43864a;

/* compiled from: SidecarWindowBackend.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/window/layout/adapter/sidecar/h;", "Lm2/a;", "a", "b", "c", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements InterfaceC43864a {

    /* renamed from: d, reason: collision with root package name */
    @l
    public static volatile h f55297d;

    /* renamed from: a, reason: collision with root package name */
    @B
    @k0
    @l
    public final SidecarCompat f55299a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CopyOnWriteArrayList<c> f55300b = new CopyOnWriteArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f55296c = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final ReentrantLock f55298e = new ReentrantLock();

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/window/layout/adapter/sidecar/h$a;", "", "<init>", "()V", "", "DEBUG", "Z", "", "TAG", "Ljava/lang/String;", "Landroidx/window/layout/adapter/sidecar/h;", "globalInstance", "Landroidx/window/layout/adapter/sidecar/h;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @k0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/sidecar/h$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class b implements a.InterfaceC1943a {
        public b() {
        }
    }

    /* compiled from: SidecarWindowBackend.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/layout/adapter/sidecar/h$c;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Activity f55302a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Executor f55303b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InterfaceC22791e<n> f55304c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public n f55305d;

        public c(@k Activity activity, @k Executor executor, @k InterfaceC22791e<n> interfaceC22791e) {
            this.f55302a = activity;
            this.f55303b = executor;
            this.f55304c = interfaceC22791e;
        }
    }

    @k0
    public h(@l SidecarCompat sidecarCompat) {
        this.f55299a = sidecarCompat;
        if (sidecarCompat != null) {
            sidecarCompat.h(new b());
        }
    }

    @Override // m2.InterfaceC43864a
    public final void a(@k InterfaceC22791e<n> interfaceC22791e) {
        synchronized (f55298e) {
            try {
                if (this.f55299a == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<c> it = this.f55300b.iterator();
                while (it.hasNext()) {
                    c next = it.next();
                    if (next.f55304c == interfaceC22791e) {
                        arrayList.add(next);
                    }
                }
                this.f55300b.removeAll(arrayList);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Activity activity = ((c) it2.next()).f55302a;
                    CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f55300b;
                    if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                        Iterator<c> it3 = copyOnWriteArrayList.iterator();
                        while (it3.hasNext()) {
                            if (it3.next().f55302a.equals(activity)) {
                                break;
                            }
                        }
                    }
                    SidecarCompat sidecarCompat = this.f55299a;
                    if (sidecarCompat != null) {
                        sidecarCompat.f(activity);
                    }
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m2.InterfaceC43864a
    public final void b(@k Context context, @k Executor executor, @k InterfaceC22791e<n> interfaceC22791e) {
        c next;
        G0 g02 = null;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            ReentrantLock reentrantLock = f55298e;
            reentrantLock.lock();
            try {
                SidecarCompat sidecarCompat = this.f55299a;
                if (sidecarCompat == null) {
                    interfaceC22791e.accept(new n(C42784z0.f406748b));
                    return;
                }
                CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f55300b;
                boolean z12 = false;
                if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
                    Iterator<c> it = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        } else if (it.next().f55302a.equals(activity)) {
                            z12 = true;
                            break;
                        }
                    }
                }
                c cVar = new c(activity, executor, interfaceC22791e);
                copyOnWriteArrayList.add(cVar);
                if (z12) {
                    Iterator<c> it2 = copyOnWriteArrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it2.next();
                            if (activity.equals(next.f55302a)) {
                                break;
                            }
                        }
                    }
                    c cVar2 = next;
                    n nVar = cVar2 != null ? cVar2.f55305d : null;
                    if (nVar != null) {
                        cVar.f55305d = nVar;
                        cVar.f55303b.execute(new i(cVar, nVar));
                    }
                } else {
                    SidecarCompat.f55275f.getClass();
                    IBinder iBinderA = SidecarCompat.a.a(activity);
                    if (iBinderA != null) {
                        sidecarCompat.g(iBinderA, activity);
                    } else {
                        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new SidecarCompat.c(sidecarCompat, activity));
                    }
                }
                G0 g03 = G0.f406611a;
                reentrantLock.unlock();
                g02 = G0.f406611a;
            } finally {
                reentrantLock.unlock();
            }
        }
        if (g02 == null) {
            interfaceC22791e.accept(new n(C42784z0.f406748b));
        }
    }
}
