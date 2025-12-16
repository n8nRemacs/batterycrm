package androidx.view;

import AK.c;
import Y61.k;
import Y61.l;
import android.os.Looper;
import androidx.appcompat.app.r;
import androidx.view.Lifecycle;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;

/* compiled from: LifecycleRegistry.jvm.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/S;", "Landroidx/lifecycle/Lifecycle;", "a", "b", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.lifecycle.S, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22985S extends Lifecycle {

    /* renamed from: k, reason: collision with root package name */
    @k
    public static final a f46702k = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public final boolean f46703b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public androidx.arch.core.internal.a<InterfaceC22982O, b> f46704c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public Lifecycle.State f46705d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final WeakReference<InterfaceC22983P> f46706e;

    /* renamed from: f, reason: collision with root package name */
    public int f46707f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f46708g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f46709h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ArrayList<Lifecycle.State> f46710i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final Z1<Lifecycle.State> f46711j;

    /* compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/S$a;", "", "<init>", "()V", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.S$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LifecycleRegistry.jvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/S$b;", "", "lifecycle-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.lifecycle.S$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public Lifecycle.State f46712a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public InterfaceC22979L f46713b;

        public final void a(@l InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
            Lifecycle.State stateA = event.a();
            a aVar = C22985S.f46702k;
            Lifecycle.State state = this.f46712a;
            aVar.getClass();
            if (stateA.compareTo(state) < 0) {
                state = stateA;
            }
            this.f46712a = state;
            this.f46713b.HH(interfaceC22983P, event);
            this.f46712a = stateA;
        }
    }

    public /* synthetic */ C22985S(InterfaceC22983P interfaceC22983P, boolean z12, C42822w c42822w) {
        this(interfaceC22983P, z12);
    }

    @Override // androidx.view.Lifecycle
    public final void a(@k InterfaceC22982O interfaceC22982O) {
        InterfaceC22979L c23054o0;
        InterfaceC22983P interfaceC22983P;
        ArrayList<Lifecycle.State> arrayList = this.f46710i;
        e("addObserver");
        Lifecycle.State state = this.f46705d;
        Lifecycle.State state2 = Lifecycle.State.f46679b;
        if (state != state2) {
            state2 = Lifecycle.State.f46680c;
        }
        b bVar = new b();
        C22990X c22990x = C22990X.f46717a;
        boolean z12 = interfaceC22982O instanceof InterfaceC22979L;
        boolean z13 = interfaceC22982O instanceof InterfaceC23057q;
        if (z12 && z13) {
            c23054o0 = new C23059r((InterfaceC23057q) interfaceC22982O, (InterfaceC22979L) interfaceC22982O);
        } else if (z13) {
            c23054o0 = new C23059r((InterfaceC23057q) interfaceC22982O, null);
        } else if (z12) {
            c23054o0 = (InterfaceC22979L) interfaceC22982O;
        } else {
            Class<?> cls = interfaceC22982O.getClass();
            C22990X.f46717a.getClass();
            if (C22990X.b(cls) == 2) {
                List list = (List) C22990X.f46719c.get(cls);
                if (list.size() == 1) {
                    c23054o0 = new B0(C22990X.a((Constructor) list.get(0), interfaceC22982O));
                } else {
                    int size = list.size();
                    InterfaceC23075z[] interfaceC23075zArr = new InterfaceC23075z[size];
                    for (int i12 = 0; i12 < size; i12++) {
                        interfaceC23075zArr[i12] = C22990X.a((Constructor) list.get(i12), interfaceC22982O);
                    }
                    c23054o0 = new C23039h(interfaceC23075zArr);
                }
            } else {
                c23054o0 = new C23054o0(interfaceC22982O);
            }
        }
        bVar.f46713b = c23054o0;
        bVar.f46712a = state2;
        if (this.f46704c.b(interfaceC22982O, bVar) == null && (interfaceC22983P = this.f46706e.get()) != null) {
            boolean z14 = this.f46707f != 0 || this.f46708g;
            Lifecycle.State stateD = d(interfaceC22982O);
            this.f46707f++;
            while (bVar.f46712a.compareTo(stateD) < 0 && this.f46704c.f22700f.containsKey(interfaceC22982O)) {
                arrayList.add(bVar.f46712a);
                Lifecycle.Event.Companion companion = Lifecycle.Event.INSTANCE;
                Lifecycle.State state3 = bVar.f46712a;
                companion.getClass();
                int iOrdinal = state3.ordinal();
                Lifecycle.Event event = iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? null : Lifecycle.Event.ON_RESUME : Lifecycle.Event.ON_START : Lifecycle.Event.ON_CREATE;
                if (event == null) {
                    throw new IllegalStateException("no event up from " + bVar.f46712a);
                }
                bVar.a(interfaceC22983P, event);
                arrayList.remove(arrayList.size() - 1);
                stateD = d(interfaceC22982O);
            }
            if (!z14) {
                i();
            }
            this.f46707f--;
        }
    }

    @Override // androidx.view.Lifecycle
    @k
    /* renamed from: b, reason: from getter */
    public final Lifecycle.State getF46705d() {
        return this.f46705d;
    }

    @Override // androidx.view.Lifecycle
    public final void c(@k InterfaceC22982O interfaceC22982O) {
        e("removeObserver");
        this.f46704c.d(interfaceC22982O);
    }

    public final Lifecycle.State d(InterfaceC22982O interfaceC22982O) {
        b bVar;
        Map.Entry entryE = this.f46704c.e(interfaceC22982O);
        Lifecycle.State state = (entryE == null || (bVar = (b) entryE.getValue()) == null) ? null : bVar.f46712a;
        ArrayList<Lifecycle.State> arrayList = this.f46710i;
        Lifecycle.State state2 = arrayList.isEmpty() ? null : (Lifecycle.State) r.j(1, arrayList);
        Lifecycle.State state3 = this.f46705d;
        f46702k.getClass();
        if (state == null || state.compareTo(state3) >= 0) {
            state = state3;
        }
        return (state2 == null || state2.compareTo(state) >= 0) ? state : state2;
    }

    public final void e(String str) {
        if (this.f46703b) {
            androidx.arch.core.executor.b.a().f22695a.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(c.k("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public void f(@k Lifecycle.Event event) {
        e("handleLifecycleEvent");
        g(event.a());
    }

    public final void g(Lifecycle.State state) {
        Lifecycle.State state2 = this.f46705d;
        if (state2 == state) {
            return;
        }
        Lifecycle.State state3 = Lifecycle.State.f46680c;
        Lifecycle.State state4 = Lifecycle.State.f46679b;
        if (state2 == state3 && state == state4) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + state + ", but was " + this.f46705d + " in component " + this.f46706e.get()).toString());
        }
        this.f46705d = state;
        if (this.f46708g || this.f46707f != 0) {
            this.f46709h = true;
            return;
        }
        this.f46708g = true;
        i();
        this.f46708g = false;
        if (this.f46705d == state4) {
            this.f46704c = new androidx.arch.core.internal.a<>();
        }
    }

    public final void h(@k Lifecycle.State state) {
        e("setCurrentState");
        g(state);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        r11.f46709h = false;
        r11.f46711j.setValue(r11.f46705d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0037, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i() {
        /*
            Method dump skipped, instructions count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.view.C22985S.i():void");
    }

    public C22985S(InterfaceC22983P interfaceC22983P, boolean z12) {
        this.f46703b = z12;
        this.f46704c = new androidx.arch.core.internal.a<>();
        Lifecycle.State state = Lifecycle.State.f46680c;
        this.f46705d = state;
        this.f46710i = new ArrayList<>();
        this.f46706e = new WeakReference<>(interfaceC22983P);
        this.f46711j = p2.a(state);
    }
}
