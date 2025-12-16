package androidx.compose.foundation.text;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22034b2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.C22220e;
import androidx.compose.ui.graphics.C22273n;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22648n;
import androidx.compose.ui.text.input.C22654u;
import kotlin.Metadata;

/* compiled from: CoreTextField.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/q1;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20985q1 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31777A;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public U1 f31778a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22034b2 f31779b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final InterfaceC22489j2 f31780c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C22648n f31781d = new C22648n();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.text.input.i0 f31782e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31783f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31784g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.layout.A f31785h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<Q2> f31786i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public C22602e f31787j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31788k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31789l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31790m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31791n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31792o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f31793p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31794q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20965l1 f31795r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31796s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31797t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> f31798u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f31799v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Y41.l<C22654u, kotlin.G0> f31800w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final C22273n f31801x;

    /* renamed from: y, reason: collision with root package name */
    public long f31802y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31803z;

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/u;", "imeAction", "Lkotlin/G0;", "invoke-KlQnJC8", "(I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.q1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<C22654u, kotlin.G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(C22654u c22654u) {
            Y41.l<InterfaceC20969m1, kotlin.G0> lVar;
            kotlin.G0 g02;
            androidx.compose.ui.focus.r rVar;
            int i12 = c22654u.f42476a;
            C20965l1 c20965l1 = C20985q1.this.f31795r;
            c20965l1.getClass();
            C22654u.f42467b.getClass();
            int i13 = C22654u.f42475j;
            if (C22654u.b(i12, i13)) {
                C20973n1 c20973n1 = c20965l1.f31566b;
                if (c20973n1 == null) {
                    c20973n1 = null;
                }
                lVar = c20973n1.f31744a;
            } else if (C22654u.b(i12, C22654u.f42470e)) {
                C20973n1 c20973n12 = c20965l1.f31566b;
                if (c20973n12 == null) {
                    c20973n12 = null;
                }
                lVar = c20973n12.f31745b;
            } else if (C22654u.b(i12, C22654u.f42474i)) {
                C20973n1 c20973n13 = c20965l1.f31566b;
                if (c20973n13 == null) {
                    c20973n13 = null;
                }
                lVar = c20973n13.f31746c;
            } else if (C22654u.b(i12, C22654u.f42473h)) {
                C20973n1 c20973n14 = c20965l1.f31566b;
                if (c20973n14 == null) {
                    c20973n14 = null;
                }
                lVar = c20973n14.f31747d;
            } else if (C22654u.b(i12, C22654u.f42471f)) {
                C20973n1 c20973n15 = c20965l1.f31566b;
                if (c20973n15 == null) {
                    c20973n15 = null;
                }
                lVar = c20973n15.f31748e;
            } else if (C22654u.b(i12, C22654u.f42472g)) {
                C20973n1 c20973n16 = c20965l1.f31566b;
                if (c20973n16 == null) {
                    c20973n16 = null;
                }
                lVar = c20973n16.f31749f;
            } else {
                if (!(C22654u.b(i12, C22654u.f42469d) ? true : C22654u.b(i12, 0))) {
                    throw new IllegalStateException("invalid ImeAction");
                }
                lVar = null;
            }
            if (lVar != null) {
                lVar.invoke(c20965l1);
                g02 = kotlin.G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                if (C22654u.b(i12, C22654u.f42474i)) {
                    androidx.compose.ui.focus.r rVar2 = c20965l1.f31567c;
                    rVar = rVar2 != null ? rVar2 : null;
                    C22220e.f39163b.getClass();
                    rVar.h(C22220e.f39164c);
                } else if (C22654u.b(i12, C22654u.f42473h)) {
                    androidx.compose.ui.focus.r rVar3 = c20965l1.f31567c;
                    rVar = rVar3 != null ? rVar3 : null;
                    C22220e.f39163b.getClass();
                    rVar.h(C22220e.f39165d);
                } else if (C22654u.b(i12, i13)) {
                    InterfaceC22489j2 interfaceC22489j2 = c20965l1.f31565a;
                    if (interfaceC22489j2 != null) {
                        interfaceC22489j2.hide();
                    }
                } else {
                    if (!(C22654u.b(i12, C22654u.f42470e) ? true : C22654u.b(i12, C22654u.f42471f) ? true : C22654u.b(i12, C22654u.f42472g))) {
                        C22654u.b(i12, C22654u.f42469d);
                    }
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.q1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            androidx.compose.ui.text.input.W w13 = w12;
            String str = w13.f42383a.f42127c;
            C20985q1 c20985q1 = C20985q1.this;
            C22602e c22602e = c20985q1.f31787j;
            if (!kotlin.jvm.internal.L.f(str, c22602e != null ? c22602e.f42127c : null)) {
                ((C22082i3) c20985q1.f31788k).setValue(HandleState.f30333b);
                InterfaceC22204y1 interfaceC22204y1 = c20985q1.f31797t;
                if (((Boolean) ((C22082i3) interfaceC22204y1).getF42167b()).booleanValue()) {
                    ((C22082i3) interfaceC22204y1).setValue(Boolean.FALSE);
                } else {
                    ((C22082i3) c20985q1.f31796s).setValue(Boolean.FALSE);
                }
            }
            androidx.compose.ui.text.v0.f42734b.getClass();
            long j12 = androidx.compose.ui.text.v0.f42735c;
            ((C22082i3) c20985q1.f31803z).setValue(androidx.compose.ui.text.v0.a(j12));
            ((C22082i3) c20985q1.f31777A).setValue(androidx.compose.ui.text.v0.a(j12));
            c20985q1.f31798u.invoke(w13);
            c20985q1.f31779b.invalidate();
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: CoreTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.q1$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f31806l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            return kotlin.G0.f406611a;
        }
    }

    public C20985q1(@Y61.k U1 u12, @Y61.k InterfaceC22034b2 interfaceC22034b2, @Y61.l InterfaceC22489j2 interfaceC22489j2) {
        this.f31778a = u12;
        this.f31779b = interfaceC22034b2;
        this.f31780c = interfaceC22489j2;
        Boolean bool = Boolean.FALSE;
        this.f31783f = C22126m3.g(bool);
        this.f31784g = C22126m3.g(androidx.compose.ui.unit.h.a(0));
        this.f31786i = C22126m3.g(null);
        this.f31788k = C22126m3.g(HandleState.f30333b);
        this.f31789l = C22126m3.g(bool);
        this.f31790m = C22126m3.g(bool);
        this.f31791n = C22126m3.g(bool);
        this.f31792o = C22126m3.g(bool);
        this.f31793p = true;
        this.f31794q = C22126m3.g(Boolean.TRUE);
        this.f31795r = new C20965l1(interfaceC22489j2);
        this.f31796s = C22126m3.g(bool);
        this.f31797t = C22126m3.g(bool);
        this.f31798u = c.f31806l;
        this.f31799v = new b();
        this.f31800w = new a();
        this.f31801x = new C22273n();
        androidx.compose.ui.graphics.T.f39320b.getClass();
        this.f31802y = androidx.compose.ui.graphics.T.f39330l;
        androidx.compose.ui.text.v0.f42734b.getClass();
        long j12 = androidx.compose.ui.text.v0.f42735c;
        this.f31803z = C22126m3.g(androidx.compose.ui.text.v0.a(j12));
        this.f31777A = C22126m3.g(androidx.compose.ui.text.v0.a(j12));
    }

    @Y61.k
    public final HandleState a() {
        return (HandleState) ((C22082i3) this.f31788k).getF42167b();
    }

    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f31783f).getF42167b()).booleanValue();
    }

    @Y61.l
    public final androidx.compose.ui.layout.A c() {
        androidx.compose.ui.layout.A a12 = this.f31785h;
        if (a12 == null || !a12.m()) {
            return null;
        }
        return a12;
    }

    @Y61.l
    public final Q2 d() {
        return (Q2) ((C22082i3) this.f31786i).getF42167b();
    }
}
