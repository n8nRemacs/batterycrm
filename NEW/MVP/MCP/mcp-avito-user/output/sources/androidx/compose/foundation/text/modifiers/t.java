package androidx.compose.foundation.text.modifiers;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.InterfaceC22242a0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22440v;
import androidx.compose.ui.node.InterfaceC22438u;
import androidx.compose.ui.node.K;
import androidx.compose.ui.node.T0;
import androidx.compose.ui.semantics.C;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.semantics.F;
import androidx.compose.ui.semantics.y;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.text.o0;
import androidx.compose.ui.text.x0;
import androidx.compose.ui.v;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import java.util.HashMap;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: TextStringSimpleNode.kt */
@P
@s0
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016BS\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/text/modifiers/t;", "Landroidx/compose/ui/v$d;", "Landroidx/compose/ui/node/K;", "Landroidx/compose/ui/node/u;", "Landroidx/compose/ui/node/T0;", "", "text", "Landroidx/compose/ui/text/x0;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Landroidx/compose/ui/text/style/s;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Landroidx/compose/ui/graphics/a0;", "overrideColor", "<init>", "(Ljava/lang/String;Landroidx/compose/ui/text/x0;Landroidx/compose/ui/text/font/E$b;IZIILandroidx/compose/ui/graphics/a0;Lkotlin/jvm/internal/w;)V", "a", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class t extends v.d implements K, InterfaceC22438u, T0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public a f31717A;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public String f31718p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public x0 f31719q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public E.b f31720r;

    /* renamed from: s, reason: collision with root package name */
    public int f31721s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f31722t;

    /* renamed from: u, reason: collision with root package name */
    public int f31723u;

    /* renamed from: v, reason: collision with root package name */
    public int f31724v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public InterfaceC22242a0 f31725w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public HashMap f31726x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public h f31727y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public Y41.l<? super List<o0>, Boolean> f31728z;

    /* compiled from: TextStringSimpleNode.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/modifiers/t$a;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f31729a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public String f31730b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f31731c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public h f31732d;

        public a(String str, String str2, boolean z12, h hVar, int i12, C42822w c42822w) {
            z12 = (i12 & 4) != 0 ? false : z12;
            hVar = (i12 & 8) != 0 ? null : hVar;
            this.f31729a = str;
            this.f31730b = str2;
            this.f31731c = z12;
            this.f31732d = hVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f31729a, aVar.f31729a) && L.f(this.f31730b, aVar.f31730b) && this.f31731c == aVar.f31731c && L.f(this.f31732d, aVar.f31732d);
        }

        public final int hashCode() {
            int i12 = androidx.appcompat.app.r.i(H.d(this.f31729a.hashCode() * 31, 31, this.f31730b), 31, this.f31731c);
            h hVar = this.f31732d;
            return i12 + (hVar == null ? 0 : hVar.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TextSubstitution(layoutCache=");
            sb2.append(this.f31732d);
            sb2.append(", isShowingSubstitution=");
            return androidx.appcompat.app.r.x(sb2, this.f31731c, ')');
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/o0;", "textLayoutResult", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<List<o0>, Boolean> {
        public b() {
            super(1);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0035  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(java.util.List<androidx.compose.ui.text.o0> r33) {
            /*
                r32 = this;
                r0 = r33
                java.util.List r0 = (java.util.List) r0
                r1 = r32
                androidx.compose.foundation.text.modifiers.t r2 = androidx.compose.foundation.text.modifiers.t.this
                androidx.compose.foundation.text.modifiers.h r3 = r2.l2()
                androidx.compose.ui.text.x0 r4 = r2.f31719q
                androidx.compose.ui.graphics.a0 r2 = r2.f31725w
                if (r2 == 0) goto L17
                long r5 = r2.a()
                goto L1e
            L17:
                androidx.compose.ui.graphics.T$a r2 = androidx.compose.ui.graphics.T.f39320b
                r2.getClass()
                long r5 = androidx.compose.ui.graphics.T.f39330l
            L1e:
                r16 = 0
                r18 = 16777214(0xfffffe, float:2.3509884E-38)
                r7 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r14 = 0
                r15 = 0
                androidx.compose.ui.text.x0 r2 = androidx.compose.ui.text.x0.h(r4, r5, r7, r9, r10, r11, r12, r14, r15, r16, r18)
                androidx.compose.ui.unit.LayoutDirection r4 = r3.f31661o
                r5 = 0
                if (r4 != 0) goto L38
            L35:
                r8 = r5
                goto Lb5
            L38:
                androidx.compose.ui.layout.x r6 = r3.f31655i
                if (r6 != 0) goto L3d
                goto L35
            L3d:
                androidx.compose.ui.text.e r7 = new androidx.compose.ui.text.e
                java.lang.String r8 = r3.f31647a
                r9 = 2
                r7.<init>(r8, r5, r9, r5)
                androidx.compose.ui.text.b r8 = r3.f31656j
                if (r8 != 0) goto L4a
                goto L35
            L4a:
                androidx.compose.ui.text.O r8 = r3.f31660n
                if (r8 != 0) goto L4f
                goto L35
            L4f:
                long r8 = r3.f31662p
                r10 = -8589934589(0xfffffffe00000003, double:NaN)
                long r14 = r8 & r10
                androidx.compose.ui.unit.b$a r8 = androidx.compose.ui.unit.C22712b.f42842b
                androidx.compose.ui.text.o0 r8 = new androidx.compose.ui.text.o0
                androidx.compose.ui.text.n0 r9 = new androidx.compose.ui.text.n0
                kotlin.collections.z0 r10 = kotlin.collections.C42784z0.f406748b
                int r11 = r3.f31652f
                boolean r12 = r3.f31651e
                int r13 = r3.f31650d
                androidx.compose.ui.text.font.E$b r5 = r3.f31649c
                r31 = 0
                r19 = r9
                r20 = r7
                r21 = r2
                r22 = r10
                r23 = r11
                r24 = r12
                r25 = r13
                r26 = r6
                r27 = r4
                r28 = r5
                r29 = r14
                r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31)
                androidx.compose.ui.text.G r4 = new androidx.compose.ui.text.G
                androidx.compose.ui.text.H r13 = new androidx.compose.ui.text.H
                androidx.compose.ui.text.font.E$b r5 = r3.f31649c
                r19 = r13
                r20 = r7
                r21 = r2
                r22 = r10
                r23 = r6
                r24 = r5
                r19.<init>(r20, r21, r22, r23, r24)
                int r2 = r3.f31652f
                int r5 = r3.f31650d
                r18 = 0
                r12 = r4
                r16 = r2
                r17 = r5
                r12.<init>(r13, r14, r16, r17, r18)
                long r2 = r3.f31658l
                r21 = 0
                r16 = r8
                r17 = r9
                r18 = r4
                r19 = r2
                r16.<init>(r17, r18, r19, r21)
            Lb5:
                if (r8 == 0) goto Lbc
                r0.add(r8)
                r5 = r8
                goto Lbd
            Lbc:
                r5 = 0
            Lbd:
                if (r5 == 0) goto Lc1
                r0 = 1
                goto Lc2
            Lc1:
                r0 = 0
            Lc2:
                java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "updatedText", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<C22602e, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            String str = c22602e.f42127c;
            t tVar = t.this;
            a aVar = tVar.f31717A;
            if (aVar == null) {
                a aVar2 = new a(tVar.f31718p, str, false, null, 12, null);
                h hVar = new h(str, tVar.f31719q, tVar.f31720r, tVar.f31721s, tVar.f31722t, tVar.f31723u, tVar.f31724v, null);
                hVar.c(tVar.l2().f31655i);
                aVar2.f31732d = hVar;
                tVar.f31717A = aVar2;
            } else if (!L.f(str, aVar.f31730b)) {
                aVar.f31730b = str;
                h hVar2 = aVar.f31732d;
                if (hVar2 != null) {
                    x0 x0Var = tVar.f31719q;
                    E.b bVar = tVar.f31720r;
                    int i12 = tVar.f31721s;
                    boolean z12 = tVar.f31722t;
                    int i13 = tVar.f31723u;
                    int i14 = tVar.f31724v;
                    hVar2.f31647a = str;
                    hVar2.f31648b = x0Var;
                    hVar2.f31649c = bVar;
                    hVar2.f31650d = i12;
                    hVar2.f31651e = z12;
                    hVar2.f31652f = i13;
                    hVar2.f31653g = i14;
                    hVar2.b();
                    G0 g02 = G0.f406611a;
                }
            }
            t.k2(tVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<Boolean, Boolean> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            t tVar = t.this;
            a aVar = tVar.f31717A;
            if (aVar == null) {
                return Boolean.FALSE;
            }
            aVar.f31731c = zBooleanValue;
            t.k2(tVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class e extends N implements Y41.a<Boolean> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            t tVar = t.this;
            tVar.f31717A = null;
            t.k2(tVar);
            return Boolean.TRUE;
        }
    }

    /* compiled from: TextStringSimpleNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<K0.a, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ K0 f31737l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(K0 k02) {
            super(1);
            this.f31737l = k02;
        }

        @Override // Y41.l
        public final G0 invoke(K0.a aVar) {
            aVar.e(this.f31737l, 0, 0, 0.0f);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, InterfaceC22242a0 interfaceC22242a0, int i15, C42822w c42822w) {
        int i16;
        if ((i15 & 8) != 0) {
            androidx.compose.ui.text.style.s.f42720b.getClass();
            i16 = androidx.compose.ui.text.style.s.f42721c;
        } else {
            i16 = i12;
        }
        this(str, x0Var, bVar, i16, (i15 & 16) != 0 ? true : z12, (i15 & 32) != 0 ? Integer.MAX_VALUE : i13, (i15 & 64) != 0 ? 1 : i14, (i15 & 128) != 0 ? null : interfaceC22242a0, null);
    }

    public static final void k2(t tVar) {
        tVar.getClass();
        C22421l.g(tVar).Z();
        C22421l.g(tVar).Y();
        C22440v.a(tVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A(@Y61.k androidx.compose.ui.node.X r2, @Y61.k androidx.compose.ui.layout.InterfaceC22391w r3, int r4) {
        /*
            r1 = this;
            androidx.compose.foundation.text.modifiers.t$a r3 = r1.f31717A
            if (r3 == 0) goto L10
            boolean r0 = r3.f31731c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            androidx.compose.foundation.text.modifiers.h r3 = r3.f31732d
            if (r3 != 0) goto L14
        L10:
            androidx.compose.foundation.text.modifiers.h r3 = r1.l2()
        L14:
            r3.c(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getF40449b()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.A(androidx.compose.ui.node.X, androidx.compose.ui.layout.w, int):int");
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k F f12) {
        Y41.l bVar = this.f31728z;
        if (bVar == null) {
            bVar = new b();
            this.f31728z = bVar;
        }
        C.u(f12, new C22602e(this.f31718p, null, 2, null));
        a aVar = this.f31717A;
        if (aVar != null) {
            boolean z12 = aVar.f31731c;
            y yVar = y.f41820a;
            yVar.getClass();
            androidx.compose.ui.semantics.E<Boolean> e12 = y.f41808C;
            kotlin.reflect.n<Object>[] nVarArr = C.f41719a;
            kotlin.reflect.n<Object> nVar = nVarArr[15];
            Boolean boolValueOf = Boolean.valueOf(z12);
            e12.getClass();
            f12.a(e12, boolValueOf);
            C22602e c22602e = new C22602e(aVar.f31730b, null, 2, null);
            yVar.getClass();
            androidx.compose.ui.semantics.E<C22602e> e13 = y.f41807B;
            kotlin.reflect.n<Object> nVar2 = nVarArr[14];
            e13.getClass();
            f12.a(e13, c22602e);
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

    /* JADX WARN: Removed duplicated region for block: B:11:0x0014  */
    @Override // androidx.compose.ui.node.K
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.layout.InterfaceC22367j0 f(@Y61.k androidx.compose.ui.layout.InterfaceC22369k0 r21, @Y61.k androidx.compose.ui.layout.InterfaceC22363h0 r22, long r23) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.f(androidx.compose.ui.layout.k0, androidx.compose.ui.layout.h0, long):androidx.compose.ui.layout.j0");
    }

    public final h l2() {
        if (this.f31727y == null) {
            this.f31727y = new h(this.f31718p, this.f31719q, this.f31720r, this.f31721s, this.f31722t, this.f31723u, this.f31724v, null);
        }
        return this.f31727y;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(@Y61.k androidx.compose.ui.node.X r1, @Y61.k androidx.compose.ui.layout.InterfaceC22391w r2, int r3) {
        /*
            r0 = this;
            androidx.compose.foundation.text.modifiers.t$a r2 = r0.f31717A
            if (r2 == 0) goto L10
            boolean r3 = r2.f31731c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            androidx.compose.foundation.text.modifiers.h r2 = r2.f31732d
            if (r2 != 0) goto L14
        L10:
            androidx.compose.foundation.text.modifiers.h r2 = r0.l2()
        L14:
            r2.c(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getF40449b()
            androidx.compose.ui.text.O r1 = r2.d(r1)
            float r1 = r1.c()
            int r1 = androidx.compose.foundation.text.V1.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.m(androidx.compose.ui.node.X, androidx.compose.ui.layout.w, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0015  */
    @Override // androidx.compose.ui.node.InterfaceC22438u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(@Y61.k androidx.compose.ui.node.P r13) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.t(androidx.compose.ui.node.P):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int x(@Y61.k androidx.compose.ui.node.X r2, @Y61.k androidx.compose.ui.layout.InterfaceC22391w r3, int r4) {
        /*
            r1 = this;
            androidx.compose.foundation.text.modifiers.t$a r3 = r1.f31717A
            if (r3 == 0) goto L10
            boolean r0 = r3.f31731c
            if (r0 == 0) goto L9
            goto La
        L9:
            r3 = 0
        La:
            if (r3 == 0) goto L10
            androidx.compose.foundation.text.modifiers.h r3 = r3.f31732d
            if (r3 != 0) goto L14
        L10:
            androidx.compose.foundation.text.modifiers.h r3 = r1.l2()
        L14:
            r3.c(r2)
            androidx.compose.ui.unit.LayoutDirection r2 = r2.getF40449b()
            int r2 = r3.a(r4, r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.x(androidx.compose.ui.node.X, androidx.compose.ui.layout.w, int):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0010  */
    @Override // androidx.compose.ui.node.K
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int z(@Y61.k androidx.compose.ui.node.X r1, @Y61.k androidx.compose.ui.layout.InterfaceC22391w r2, int r3) {
        /*
            r0 = this;
            androidx.compose.foundation.text.modifiers.t$a r2 = r0.f31717A
            if (r2 == 0) goto L10
            boolean r3 = r2.f31731c
            if (r3 == 0) goto L9
            goto La
        L9:
            r2 = 0
        La:
            if (r2 == 0) goto L10
            androidx.compose.foundation.text.modifiers.h r2 = r2.f31732d
            if (r2 != 0) goto L14
        L10:
            androidx.compose.foundation.text.modifiers.h r2 = r0.l2()
        L14:
            r2.c(r1)
            androidx.compose.ui.unit.LayoutDirection r1 = r1.getF40449b()
            androidx.compose.ui.text.O r1 = r2.d(r1)
            float r1 = r1.a()
            int r1 = androidx.compose.foundation.text.V1.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.modifiers.t.z(androidx.compose.ui.node.X, androidx.compose.ui.layout.w, int):int");
    }

    public t(String str, x0 x0Var, E.b bVar, int i12, boolean z12, int i13, int i14, InterfaceC22242a0 interfaceC22242a0, C42822w c42822w) {
        this.f31718p = str;
        this.f31719q = x0Var;
        this.f31720r = bVar;
        this.f31721s = i12;
        this.f31722t = z12;
        this.f31723u = i13;
        this.f31724v = i14;
        this.f31725w = interfaceC22242a0;
    }
}
