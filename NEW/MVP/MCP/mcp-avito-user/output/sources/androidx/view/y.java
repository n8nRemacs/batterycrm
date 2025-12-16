package androidx.view;

import X41.j;
import Y41.a;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import androidx.view.y;
import j.InterfaceC42164u;
import j.K;
import j.X;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42754k;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: OnBackPressedDispatcher.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/activity/y;", "", "c", "d", "e", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Runnable f21289a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C42754k<x> f21290b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Y41.a<G0> f21291c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final OnBackInvokedCallback f21292d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public OnBackInvokedDispatcher f21293e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f21294f;

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            y.this.d();
            return G0.f406611a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            y.this.c();
            return G0.f406611a;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Landroidx/activity/y$c;", "", "<init>", "()V", "dispatcher", "", "priority", "callback", "Lkotlin/G0;", "b", "(Ljava/lang/Object;ILjava/lang/Object;)V", "c", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function0;", "onBackInvoked", "Landroid/window/OnBackInvokedCallback;", "a", "(LY41/a;)Landroid/window/OnBackInvokedCallback;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @X
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f21297a = new c();

        @InterfaceC42164u
        @k
        public final OnBackInvokedCallback a(@k final Y41.a<G0> onBackInvoked) {
            return new OnBackInvokedCallback() { // from class: androidx.activity.z
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    a aVar = onBackInvoked;
                    y.c cVar = y.c.f21297a;
                    aVar.invoke();
                }
            };
        }

        @InterfaceC42164u
        public final void b(@k Object dispatcher, int priority, @k Object callback) {
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(priority, (OnBackInvokedCallback) callback);
        }

        @InterfaceC42164u
        public final void c(@k Object dispatcher, @k Object callback) {
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/activity/y$d;", "Landroidx/lifecycle/L;", "Landroidx/activity/j;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class d implements InterfaceC22979L, j {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Lifecycle f21298b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final x f21299c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public j f21300d;

        public d(@k Lifecycle lifecycle, @k x xVar) {
            this.f21298b = lifecycle;
            this.f21299c = xVar;
            lifecycle.a(this);
        }

        @Override // androidx.view.InterfaceC22979L
        public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.f21300d = y.this.b(this.f21299c);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                j jVar = this.f21300d;
                if (jVar != null) {
                    ((e) jVar).cancel();
                }
            }
        }

        @Override // androidx.view.j
        public final void cancel() {
            this.f21298b.c(this);
            this.f21299c.f21287b.remove(this);
            j jVar = this.f21300d;
            if (jVar != null) {
                ((e) jVar).cancel();
            }
            this.f21300d = null;
        }
    }

    /* compiled from: OnBackPressedDispatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/activity/y$e;", "Landroidx/activity/j;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class e implements j {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final x f21302b;

        public e(@k x xVar) {
            this.f21302b = xVar;
        }

        @Override // androidx.view.j
        public final void cancel() {
            y yVar = y.this;
            C42754k<x> c42754k = yVar.f21290b;
            x xVar = this.f21302b;
            c42754k.remove(xVar);
            xVar.f21287b.remove(this);
            if (Build.VERSION.SDK_INT >= 33) {
                xVar.f21288c = null;
                yVar.d();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @j
    public y() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @K
    public final void a(@k InterfaceC22983P interfaceC22983P, @k x xVar) {
        Lifecycle lifecycle = interfaceC22983P.getLifecycle();
        if (lifecycle.getF46705d() == Lifecycle.State.f46679b) {
            return;
        }
        xVar.f21287b.add(new d(lifecycle, xVar));
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            xVar.f21288c = this.f21291c;
        }
    }

    @K
    @k
    public final j b(@k x xVar) {
        this.f21290b.addLast(xVar);
        e eVar = new e(xVar);
        xVar.f21287b.add(eVar);
        if (Build.VERSION.SDK_INT >= 33) {
            d();
            xVar.f21288c = this.f21291c;
        }
        return eVar;
    }

    @K
    public final void c() {
        x xVarPrevious;
        C42754k<x> c42754k = this.f21290b;
        ListIterator<x> listIterator = c42754k.listIterator(c42754k.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                xVarPrevious = null;
                break;
            } else {
                xVarPrevious = listIterator.previous();
                if (xVarPrevious.f21286a) {
                    break;
                }
            }
        }
        x xVar = xVarPrevious;
        if (xVar != null) {
            xVar.c();
            return;
        }
        Runnable runnable = this.f21289a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @X
    public final void d() {
        boolean z12;
        C42754k<x> c42754k = this.f21290b;
        if (c42754k == null || !c42754k.isEmpty()) {
            Iterator<x> it = c42754k.iterator();
            while (it.hasNext()) {
                if (it.next().f21286a) {
                    z12 = true;
                    break;
                }
            }
            z12 = false;
        } else {
            z12 = false;
        }
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.f21293e;
        OnBackInvokedCallback onBackInvokedCallback = this.f21292d;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z12 && !this.f21294f) {
            c.f21297a.b(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.f21294f = true;
        } else {
            if (z12 || !this.f21294f) {
                return;
            }
            c.f21297a.c(onBackInvokedDispatcher, onBackInvokedCallback);
            this.f21294f = false;
        }
    }

    @j
    public y(@l Runnable runnable) {
        this.f21289a = runnable;
        this.f21290b = new C42754k<>();
        if (Build.VERSION.SDK_INT >= 33) {
            this.f21291c = new a();
            this.f21292d = c.f21297a.a(new b());
        }
    }

    public /* synthetic */ y(Runnable runnable, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : runnable);
    }
}
