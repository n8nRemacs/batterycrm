package androidx.compose.ui.text.input;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import androidx.compose.ui.graphics.A0;
import androidx.compose.ui.input.pointer.InterfaceC22334l;
import androidx.compose.ui.text.input.a0;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.v0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: TextInputServiceAndroid.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/text/input/a0;", "Landroidx/compose/ui/text/input/P;", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes.dex */
public final class a0 implements P {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final View f42391a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22658y f42392b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Executor f42393c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f42394d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f42395e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f42396f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public W f42397g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public C22655v f42398h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final ArrayList f42399i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Object f42400j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public Rect f42401k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C22641g f42402l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.collection.e<a> f42403m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Z f42404n;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/a0$a;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f42405b;

        /* renamed from: c, reason: collision with root package name */
        public static final a f42406c;

        /* renamed from: d, reason: collision with root package name */
        public static final a f42407d;

        /* renamed from: e, reason: collision with root package name */
        public static final a f42408e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ a[] f42409f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f42410g;

        static {
            a aVar = new a("StartInput", 0);
            f42405b = aVar;
            a aVar2 = new a("StopInput", 1);
            f42406c = aVar2;
            a aVar3 = new a("ShowKeyboard", 2);
            f42407d = aVar3;
            a aVar4 = new a("HideKeyboard", 3);
            f42408e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f42409f = aVarArr;
            f42410g = kotlin.enums.c.a(aVarArr);
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f42409f.clone();
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a aVar = a.f42405b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a aVar2 = a.f42405b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a aVar3 = a.f42405b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/input/k;", "it", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<List<? extends InterfaceC22645k>, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f42411l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(List<? extends InterfaceC22645k> list) {
            return G0.f406611a;
        }
    }

    /* compiled from: TextInputServiceAndroid.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/u;", "it", "Lkotlin/G0;", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<C22654u, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f42412l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* synthetic */ G0 invoke(C22654u c22654u) {
            int i12 = c22654u.f42476a;
            return G0.f406611a;
        }
    }

    public a0(View view, InterfaceC22334l interfaceC22334l, InterfaceC22658y interfaceC22658y, Executor executor, int i12, C42822w c42822w) {
        if ((i12 & 8) != 0) {
            final Choreographer choreographer = Choreographer.getInstance();
            executor = new Executor() { // from class: androidx.compose.ui.text.input.f0
                @Override // java.util.concurrent.Executor
                public final void execute(final Runnable runnable) {
                    choreographer.postFrameCallback(new Choreographer.FrameCallback() { // from class: androidx.compose.ui.text.input.g0
                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j12) {
                            runnable.run();
                        }
                    });
                }
            };
        }
        this.f42391a = view;
        this.f42392b = interfaceC22658y;
        this.f42393c = executor;
        this.f42395e = d0.f42419l;
        this.f42396f = e0.f42420l;
        v0.f42734b.getClass();
        this.f42397g = new W("", v0.f42735c, (v0) null, 4, (C42822w) null);
        C22655v.f42477h.getClass();
        this.f42398h = C22655v.f42478i;
        this.f42399i = new ArrayList();
        this.f42400j = C42727D.b(LazyThreadSafetyMode.f406616d, new b0(this));
        this.f42402l = new C22641g(interfaceC22334l, interfaceC22658y);
        this.f42403m = new androidx.compose.runtime.collection.e<>(new a[16], 0);
    }

    @Override // androidx.compose.ui.text.input.P
    public final void a() {
        this.f42394d = false;
        this.f42395e = c.f42411l;
        this.f42396f = d.f42412l;
        this.f42401k = null;
        i(a.f42406c);
    }

    @Override // androidx.compose.ui.text.input.P
    public final void b(@Y61.l W w12, @Y61.k W w13) {
        boolean z12 = (v0.c(this.f42397g.f42384b, w13.f42384b) && kotlin.jvm.internal.L.f(this.f42397g.f42385c, w13.f42385c)) ? false : true;
        this.f42397g = w13;
        int size = this.f42399i.size();
        for (int i12 = 0; i12 < size; i12++) {
            Q q12 = (Q) ((WeakReference) this.f42399i.get(i12)).get();
            if (q12 != null) {
                q12.f42370d = w13;
            }
        }
        C22641g c22641g = this.f42402l;
        synchronized (c22641g.f42425c) {
            c22641g.f42432j = null;
            c22641g.f42434l = null;
            c22641g.f42433k = null;
            c22641g.f42435m = C22640f.f42421l;
            c22641g.f42436n = null;
            c22641g.f42437o = null;
            G0 g02 = G0.f406611a;
        }
        if (kotlin.jvm.internal.L.f(w12, w13)) {
            if (z12) {
                InterfaceC22658y interfaceC22658y = this.f42392b;
                int iG2 = v0.g(w13.f42384b);
                int iF2 = v0.f(w13.f42384b);
                v0 v0Var = this.f42397g.f42385c;
                int iG3 = v0Var != null ? v0.g(v0Var.f42736a) : -1;
                v0 v0Var2 = this.f42397g.f42385c;
                interfaceC22658y.b(iG2, iF2, iG3, v0Var2 != null ? v0.f(v0Var2.f42736a) : -1);
                return;
            }
            return;
        }
        if (w12 != null && (!kotlin.jvm.internal.L.f(w12.f42383a.f42127c, w13.f42383a.f42127c) || (v0.c(w12.f42384b, w13.f42384b) && !kotlin.jvm.internal.L.f(w12.f42385c, w13.f42385c)))) {
            this.f42392b.c();
            return;
        }
        int size2 = this.f42399i.size();
        for (int i13 = 0; i13 < size2; i13++) {
            Q q13 = (Q) ((WeakReference) this.f42399i.get(i13)).get();
            if (q13 != null) {
                W w14 = this.f42397g;
                InterfaceC22658y interfaceC22658y2 = this.f42392b;
                if (q13.f42374h) {
                    q13.f42370d = w14;
                    if (q13.f42372f) {
                        interfaceC22658y2.e(q13.f42371e, A.a(w14));
                    }
                    v0 v0Var3 = w14.f42385c;
                    int iG4 = v0Var3 != null ? v0.g(v0Var3.f42736a) : -1;
                    v0 v0Var4 = w14.f42385c;
                    int iF3 = v0Var4 != null ? v0.f(v0Var4.f42736a) : -1;
                    long j12 = w14.f42384b;
                    interfaceC22658y2.b(v0.g(j12), v0.f(j12), iG4, iF3);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.P
    public final void c(@Y61.k W w12, @Y61.k C22655v c22655v, @Y61.k Y41.l<? super List<? extends InterfaceC22645k>, G0> lVar, @Y61.k Y41.l<? super C22654u, G0> lVar2) {
        this.f42394d = true;
        this.f42397g = w12;
        this.f42398h = c22655v;
        this.f42395e = (kotlin.jvm.internal.N) lVar;
        this.f42396f = (kotlin.jvm.internal.N) lVar2;
        i(a.f42405b);
    }

    @Override // androidx.compose.ui.text.input.P
    public final void d() {
        i(a.f42405b);
    }

    @Override // androidx.compose.ui.text.input.P
    public final void e() {
        i(a.f42408e);
    }

    @Override // androidx.compose.ui.text.input.P
    @InterfaceC42830m
    public final void f(@Y61.k l0.j jVar) {
        Rect rect;
        this.f42401k = new Rect(kotlin.math.b.b(jVar.f413390a), kotlin.math.b.b(jVar.f413391b), kotlin.math.b.b(jVar.f413392c), kotlin.math.b.b(jVar.f413393d));
        if (!this.f42399i.isEmpty() || (rect = this.f42401k) == null) {
            return;
        }
        this.f42391a.requestRectangleOnScreen(new Rect(rect));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.text.input.P
    public final void g(@Y61.k W w12, @Y61.k L l12, @Y61.k o0 o0Var, @Y61.k Y41.l<? super A0, G0> lVar, @Y61.k l0.j jVar, @Y61.k l0.j jVar2) {
        C22641g c22641g = this.f42402l;
        synchronized (c22641g.f42425c) {
            try {
                c22641g.f42432j = w12;
                c22641g.f42434l = l12;
                c22641g.f42433k = o0Var;
                c22641g.f42435m = (kotlin.jvm.internal.N) lVar;
                c22641g.f42436n = jVar;
                c22641g.f42437o = jVar2;
                if (c22641g.f42427e || c22641g.f42426d) {
                    c22641g.a();
                }
                G0 g02 = G0.f406611a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.ui.text.input.P
    public final void h() {
        i(a.f42407d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.compose.ui.text.input.Z, java.lang.Runnable] */
    public final void i(a aVar) {
        this.f42403m.b(aVar);
        if (this.f42404n == null) {
            ?? r22 = new Runnable() { // from class: androidx.compose.ui.text.input.Z
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v2, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v3, types: [T, java.lang.Boolean] */
                /* JADX WARN: Type inference failed for: r9v6, types: [T, java.lang.Boolean] */
                @Override // java.lang.Runnable
                public final void run() {
                    View viewFindFocus;
                    a0 a0Var = this.f42390b;
                    a0Var.f42404n = null;
                    View view = a0Var.f42391a;
                    boolean zIsFocused = view.isFocused();
                    androidx.compose.runtime.collection.e<a0.a> eVar = a0Var.f42403m;
                    if (!zIsFocused && (viewFindFocus = view.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
                        eVar.g();
                        return;
                    }
                    l0.h hVar = new l0.h();
                    l0.h hVar2 = new l0.h();
                    a0.a[] aVarArr = eVar.f38260b;
                    int i12 = eVar.f38262d;
                    for (int i13 = 0; i13 < i12; i13++) {
                        a0.a aVar2 = aVarArr[i13];
                        int iOrdinal = aVar2.ordinal();
                        if (iOrdinal == 0) {
                            ?? r92 = Boolean.TRUE;
                            hVar.f406842b = r92;
                            hVar2.f406842b = r92;
                        } else if (iOrdinal == 1) {
                            ?? r93 = Boolean.FALSE;
                            hVar.f406842b = r93;
                            hVar2.f406842b = r93;
                        } else if ((iOrdinal == 2 || iOrdinal == 3) && !kotlin.jvm.internal.L.f(hVar.f406842b, Boolean.FALSE)) {
                            hVar2.f406842b = Boolean.valueOf(aVar2 == a0.a.f42407d);
                        }
                    }
                    eVar.g();
                    boolean zF2 = kotlin.jvm.internal.L.f(hVar.f406842b, Boolean.TRUE);
                    InterfaceC22658y interfaceC22658y = a0Var.f42392b;
                    if (zF2) {
                        interfaceC22658y.c();
                    }
                    Boolean bool = (Boolean) hVar2.f406842b;
                    if (bool != null) {
                        if (bool.booleanValue()) {
                            interfaceC22658y.f();
                        } else {
                            interfaceC22658y.d();
                        }
                    }
                    if (kotlin.jvm.internal.L.f(hVar.f406842b, Boolean.FALSE)) {
                        interfaceC22658y.c();
                    }
                }
            };
            this.f42393c.execute(r22);
            this.f42404n = r22;
        }
    }
}
