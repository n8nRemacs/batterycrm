package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.text.S1;
import androidx.compose.foundation.text.V1;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.layout.AbstractC22348a;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.T0;
import androidx.compose.ui.node.X;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.U;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.n0;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.List;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextAnnotatedStringNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001&BÓ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 \u0012\u0016\b\u0002\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b$\u0010%¨\u0006'"}, d2 = {"Landroidx/compose/foundation/text/modifiers/q;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/T0;", "Landroidx/compose/ui/text/e;", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Lkotlin/Function1;", "Landroidx/compose/ui/text/o0;", "Lkotlin/G0;", "onTextLayout", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "Landroidx/compose/ui/text/e$e;", "Landroidx/compose/ui/text/U;", "placeholders", "Ll0/j;", "onPlaceholderLayout", "Landroidx/compose/foundation/text/modifiers/k;", "selectionController", "Landroidx/compose/ui/graphics/a0;", "overrideColor", "Landroidx/compose/foundation/text/S1;", "autoSize", "Landroidx/compose/foundation/text/modifiers/q$a;", "onShowTranslation", "<init>", "(Landroidx/compose/ui/text/e;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;LY41/l;IZIILjava/util/List;LY41/l;Landroidx/compose/foundation/text/modifiers/k;Landroidx/compose/ui/graphics/a0;Landroidx/compose/foundation/text/S1;LY41/l;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class q extends v.d implements K, InterfaceC22438u, T0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public InterfaceC22242a0 f31690A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public S1 f31691B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super a, G0> f31692C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public Map<AbstractC22348a, Integer> f31693D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public androidx.compose.foundation.text.modifiers.f f31694E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super List<o0>, Boolean> f31695F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public a f31696G;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public C22602e f31697p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public x0 f31698q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public E.b f31699r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super o0, G0> f31700s;

    /* renamed from: t, reason: collision with root package name */
    public int f31701t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f31702u;

    /* renamed from: v, reason: collision with root package name */
    public int f31703v;

    /* renamed from: w, reason: collision with root package name */
    public int f31704w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public List<C22602e.C1684e<U>> f31705x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super List<l0.j>, G0> f31706y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public k f31707z;

    /* compiled from: TextAnnotatedStringNode.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/q$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C22602e f31708a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public C22602e f31709b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31710c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public androidx.compose.foundation.text.modifiers.f f31711d;

        public a(C22602e c22602e, C22602e c22602e2, boolean z12, androidx.compose.foundation.text.modifiers.f fVar, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? false : z12;
            fVar = (i12 & 8) != 0 ? null : fVar;
            this.f31708a = c22602e;
            this.f31709b = c22602e2;
            this.f31710c = z12;
            this.f31711d = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f31708a, aVar.f31708a) && L.f(this.f31709b, aVar.f31709b) && this.f31710c == aVar.f31710c && L.f(this.f31711d, aVar.f31711d);
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i((this.f31709b.hashCode() + (this.f31708a.hashCode() * 31)) * 31, 31, this.f31710c);
            androidx.compose.foundation.text.modifiers.f fVar = this.f31711d;
            return i12 + (fVar == null ? 0 : fVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.f31708a) + ", substitution=" + ((Object) this.f31709b) + ", isShowingSubstitution=" + this.f31710c + ", layoutCache=" + this.f31711d + ')';
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/o0;", "textLayoutResult", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<List<o0>, Boolean> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(List<o0> list) {
            o0 o0Var;
            long jA2;
            List<o0> list2 = list;
            q qVar = q.this;
            o0 o0Var2 = qVar.m2().f31640o;
            if (o0Var2 != null) {
                n0 n0Var = o0Var2.f42526a;
                C22602e c22602e = n0Var.f42506a;
                x0 x0Var = qVar.f31698q;
                InterfaceC22242a0 interfaceC22242a0 = qVar.f31690A;
                if (interfaceC22242a0 != null) {
                    jA2 = interfaceC22242a0.a();
                } else {
                    T.f39320b.getClass();
                    jA2 = T.f39330l;
                }
                o0Var = new o0(new n0(c22602e, x0.h(x0Var, jA2, 0L, null, null, null, 0L, null, 0, 0L, 16777214), n0Var.f42508c, n0Var.f42509d, n0Var.f42510e, n0Var.f42511f, n0Var.f42512g, n0Var.f42513h, n0Var.f42514i, n0Var.f42515j, (C42822w) null), o0Var2.f42527b, o0Var2.f42528c, null);
                list2.add(o0Var);
            } else {
                o0Var = null;
            }
            return Boolean.valueOf(o0Var != null);
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "updatedText", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C22602e, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            C22602e c22602e2 = c22602e;
            q qVar = q.this;
            a aVar = qVar.f31696G;
            if (aVar == null) {
                a aVar2 = new a(qVar.f31697p, c22602e2, false, null, 12, null);
                androidx.compose.foundation.text.modifiers.f fVar = new androidx.compose.foundation.text.modifiers.f(c22602e2, qVar.f31698q, qVar.f31699r, qVar.f31701t, qVar.f31702u, qVar.f31703v, qVar.f31704w, C42784z0.f406748b, qVar.f31691B, null);
                fVar.c(qVar.m2().f31636k);
                aVar2.f31711d = fVar;
                qVar.f31696G = aVar2;
            } else if (!L.f(c22602e2, aVar.f31709b)) {
                aVar.f31709b = c22602e2;
                androidx.compose.foundation.text.modifiers.f fVar2 = aVar.f31711d;
                if (fVar2 != null) {
                    x0 x0Var = qVar.f31698q;
                    E.b bVar = qVar.f31699r;
                    int i12 = qVar.f31701t;
                    boolean z12 = qVar.f31702u;
                    int i13 = qVar.f31703v;
                    int i14 = qVar.f31704w;
                    C42784z0 c42784z0 = C42784z0.f406748b;
                    S1 s12 = qVar.f31691B;
                    fVar2.f31626a = c22602e2;
                    fVar2.e(x0Var);
                    fVar2.f31627b = bVar;
                    fVar2.f31628c = i12;
                    fVar2.f31629d = z12;
                    fVar2.f31630e = i13;
                    fVar2.f31631f = i14;
                    fVar2.f31632g = c42784z0;
                    fVar2.f31633h = s12;
                    fVar2.f31638m = null;
                    fVar2.f31640o = null;
                    fVar2.f31642q = -1;
                    fVar2.f31641p = -1;
                    fVar2.f31643r = null;
                    G0 g02 = G0.f406611a;
                }
            }
            q.k2(qVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<Boolean, Boolean> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            q qVar = q.this;
            a aVar = qVar.f31696G;
            if (aVar == null) {
                return Boolean.FALSE;
            }
            Y41.l<? super a, G0> lVar = qVar.f31692C;
            if (lVar != null) {
                lVar.invoke(aVar);
            }
            a aVar2 = qVar.f31696G;
            if (aVar2 != null) {
                aVar2.f31710c = zBooleanValue;
            }
            q.k2(qVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            q qVar = q.this;
            qVar.f31696G = null;
            q.k2(qVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextAnnotatedStringNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f31716l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(K0 k02) {
            super(1);
            this.f31716l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f31716l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    public q() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, int i15, C42822w c42822w) {
        int i16;
        Y41.l lVar4 = (i15 & 8) != 0 ? null : lVar;
        if ((i15 & 16) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(c22602e, x0Var, bVar, lVar4, i16, (i15 & 32) != 0 ? true : z12, (i15 & 64) != 0 ? Integer.MAX_VALUE : i13, (i15 & 128) != 0 ? 1 : i14, (i15 & 256) != 0 ? null : list, (i15 & 512) != 0 ? null : lVar2, (i15 & 1024) != 0 ? null : kVar, (i15 & 2048) != 0 ? null : interfaceC22242a0, (i15 & 4096) != 0 ? null : s12, (i15 & 8192) != 0 ? null : lVar3, null);
    }

    public static final void k2(q qVar) {
        qVar.getClass();
        C22421l.g(qVar).Z();
        C22421l.g(qVar).Y();
        C22440v.a(qVar);
    }

    @Override // androidx.compose.ui.node.K
    public final int A(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return n2(x12).a(i12, x12.getF40449b());
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k F f12) {
        Y41.l bVar = this.f31695F;
        if (bVar == null) {
            bVar = new b();
            this.f31695F = bVar;
        }
        C.u(f12, this.f31697p);
        a aVar = this.f31696G;
        if (aVar != null) {
            C22602e c22602e = aVar.f31709b;
            y yVar = y.f41820a;
            yVar.getClass();
            androidx.compose.ui.semantics.E<C22602e> e12 = y.f41807B;
            kotlin.reflect.n<Object>[] nVarArr = C.f41719a;
            kotlin.reflect.n<Object> nVar = nVarArr[14];
            e12.getClass();
            f12.a(e12, c22602e);
            boolean z12 = aVar.f31710c;
            yVar.getClass();
            androidx.compose.ui.semantics.E<Boolean> e13 = y.f41808C;
            kotlin.reflect.n<Object> nVar2 = nVarArr[15];
            Boolean boolValueOf = Boolean.valueOf(z12);
            e13.getClass();
            f12.a(e13, boolValueOf);
        }
        c cVar = new c();
        androidx.compose.ui.semantics.k kVar = androidx.compose.ui.semantics.k.f41760a;
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41771l, new C22553a(null, cVar));
        d dVar = new d();
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41772m, new C22553a(null, dVar));
        e eVar = new e();
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41773n, new C22553a(null, eVar));
        C.f(f12, bVar);
    }

    @Override // androidx.compose.ui.v.d
    /* renamed from: Z1 */
    public final boolean getF40330q() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    @Override // androidx.compose.ui.node.K
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC22367j0 f(@Y61.k androidx.compose.ui.layout.InterfaceC22369k0 r25, @Y61.k androidx.compose.ui.layout.InterfaceC22363h0 r26, long r27) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.q.f(androidx.compose.ui.layout.k0, androidx.compose.ui.layout.h0, long):androidx.compose.ui.layout.j0");
    }

    public final void l2(boolean z12, boolean z13, boolean z14, boolean z15) {
        if (z13 || z14 || z15) {
            androidx.compose.foundation.text.modifiers.f fVarM2 = m2();
            C22602e c22602e = this.f31697p;
            x0 x0Var = this.f31698q;
            E.b bVar = this.f31699r;
            int i12 = this.f31701t;
            boolean z16 = this.f31702u;
            int i13 = this.f31703v;
            int i14 = this.f31704w;
            List<C22602e.C1684e<U>> list = this.f31705x;
            S1 s12 = this.f31691B;
            fVarM2.f31626a = c22602e;
            fVarM2.e(x0Var);
            fVarM2.f31627b = bVar;
            fVarM2.f31628c = i12;
            fVarM2.f31629d = z16;
            fVarM2.f31630e = i13;
            fVarM2.f31631f = i14;
            fVarM2.f31632g = list;
            fVarM2.f31633h = s12;
            fVarM2.f31638m = null;
            fVarM2.f31640o = null;
            fVarM2.f31642q = -1;
            fVarM2.f31641p = -1;
            fVarM2.f31643r = null;
        }
        if (this.f42893o) {
            if (z13 || (z12 && this.f31695F != null)) {
                C22421l.g(this).Z();
            }
            if (z13 || z14 || z15) {
                C22421l.g(this).Y();
                C22440v.a(this);
            }
            if (z12) {
                C22440v.a(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.K
    public final int m(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return V1.a(n2(x12).d(x12.getF40449b()).c());
    }

    public final androidx.compose.foundation.text.modifiers.f m2() {
        if (this.f31694E == null) {
            this.f31694E = new androidx.compose.foundation.text.modifiers.f(this.f31697p, this.f31698q, this.f31699r, this.f31701t, this.f31702u, this.f31703v, this.f31704w, this.f31705x, this.f31691B, null);
        }
        return this.f31694E;
    }

    public final androidx.compose.foundation.text.modifiers.f n2(androidx.compose.ui.unit.d dVar) {
        androidx.compose.foundation.text.modifiers.f fVar;
        a aVar = this.f31696G;
        if (aVar != null && aVar.f31710c && (fVar = aVar.f31711d) != null) {
            fVar.c(dVar);
            return fVar;
        }
        androidx.compose.foundation.text.modifiers.f fVarM2 = m2();
        fVarM2.c(dVar);
        return fVarM2;
    }

    public final boolean o2(@Y61.l Y41.l<? super o0, G0> lVar, @Y61.l Y41.l<? super List<l0.j>, G0> lVar2, @Y61.l k kVar, @Y61.l Y41.l<? super a, G0> lVar3) {
        boolean z12;
        if (this.f31700s != lVar) {
            this.f31700s = lVar;
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.f31706y != lVar2) {
            this.f31706y = lVar2;
            z12 = true;
        }
        if (!L.f(this.f31707z, kVar)) {
            this.f31707z = kVar;
            z12 = true;
        }
        if (this.f31692C == lVar3) {
            return z12;
        }
        this.f31692C = lVar3;
        return true;
    }

    public final boolean p2(@Y61.k x0 x0Var, @Y61.l List<C22602e.C1684e<U>> list, int i12, int i13, boolean z12, @Y61.k E.b bVar, int i14, @Y61.l S1 s12) {
        boolean z13 = !this.f31698q.f(x0Var);
        this.f31698q = x0Var;
        if (!L.f(this.f31705x, list)) {
            this.f31705x = list;
            z13 = true;
        }
        if (this.f31704w != i12) {
            this.f31704w = i12;
            z13 = true;
        }
        if (this.f31703v != i13) {
            this.f31703v = i13;
            z13 = true;
        }
        if (this.f31702u != z12) {
            this.f31702u = z12;
            z13 = true;
        }
        if (!L.f(this.f31699r, bVar)) {
            this.f31699r = bVar;
            z13 = true;
        }
        if (!androidx.compose.ui.text.style.s.a(this.f31701t, i14)) {
            this.f31701t = i14;
            z13 = true;
        }
        if (L.f(this.f31691B, s12)) {
            return z13;
        }
        this.f31691B = s12;
        return true;
    }

    public final boolean q2(@Y61.k C22602e c22602e) {
        boolean zF2 = L.f(this.f31697p.f42127c, c22602e.f42127c);
        boolean z12 = (zF2 && L.f(this.f31697p.f42126b, c22602e.f42126b)) ? false : true;
        if (z12) {
            this.f31697p = c22602e;
        }
        if (!zF2) {
            this.f31696G = null;
        }
        return z12;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101  */
    @Override // androidx.compose.ui.node.InterfaceC22438u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(@Y61.k androidx.compose.ui.node.P r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.q.t(androidx.compose.ui.node.P):void");
    }

    @Override // androidx.compose.ui.node.K
    public final int x(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return n2(x12).a(i12, x12.getF40449b());
    }

    @Override // androidx.compose.ui.node.K
    public final int z(@Y61.k X x12, @Y61.k InterfaceC22391w interfaceC22391w, int i12) {
        return V1.a(n2(x12).d(x12.getF40449b()).a());
    }

    public q(C22602e c22602e, x0 x0Var, E.b bVar, Y41.l lVar, int i12, boolean z12, int i13, int i14, List list, Y41.l lVar2, k kVar, InterfaceC22242a0 interfaceC22242a0, S1 s12, Y41.l lVar3, C42822w c42822w) {
        this.f31697p = c22602e;
        this.f31698q = x0Var;
        this.f31699r = bVar;
        this.f31700s = lVar;
        this.f31701t = i12;
        this.f31702u = z12;
        this.f31703v = i13;
        this.f31704w = i14;
        this.f31705x = list;
        this.f31706y = lVar2;
        this.f31707z = kVar;
        this.f31690A = interfaceC22242a0;
        this.f31691B = s12;
        this.f31692C = lVar3;
    }
}
