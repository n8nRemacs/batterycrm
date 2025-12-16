package androidx.compose.foundation;

import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.InterfaceC22374n;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import java.util.List;
import kotlin.Metadata;

/* compiled from: Image.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20806p1 {

    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/k0;", "", "Landroidx/compose/ui/layout/h0;", "<anonymous parameter 0>", "Landroidx/compose/ui/unit/b;", "constraints", "Landroidx/compose/ui/layout/j0;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/k0;Ljava/util/List;J)Landroidx/compose/ui/layout/j0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.p1$a */
    public static final class a implements InterfaceC22365i0 {

        /* renamed from: a, reason: collision with root package name */
        public static final a f29791a = new a();

        /* compiled from: Image.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.p1$a$a, reason: collision with other inner class name */
        public static final class C1596a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public static final C1596a f29792l = new C1596a();

            public C1596a() {
                super(1);
            }

            @Override // Y41.l
            public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
                return kotlin.G0.f406611a;
            }
        }

        @Override // androidx.compose.ui.layout.InterfaceC22365i0
        public final InterfaceC22367j0 b(InterfaceC22369k0 interfaceC22369k0, List<? extends InterfaceC22363h0> list, long j12) {
            return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), kotlin.collections.P0.c(), C1596a.f29792l);
        }
    }

    /* compiled from: Image.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.p1$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.painter.e f29793l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f29794m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f29795n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22215f f29796o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22374n f29797p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ float f29798q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.U f29799r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f29800s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f29801t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.graphics.painter.e eVar, String str, androidx.compose.ui.v vVar, InterfaceC22215f interfaceC22215f, InterfaceC22374n interfaceC22374n, float f12, androidx.compose.ui.graphics.U u12, int i12, int i13) {
            super(2);
            this.f29793l = eVar;
            this.f29794m = str;
            this.f29795n = vVar;
            this.f29796o = interfaceC22215f;
            this.f29797p = interfaceC22374n;
            this.f29798q = f12;
            this.f29799r = u12;
            this.f29800s = i12;
            this.f29801t = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f29800s | 1);
            InterfaceC22374n interfaceC22374n = this.f29797p;
            C20806p1.a(this.f29793l, this.f29794m, this.f29795n, this.f29796o, interfaceC22374n, this.f29798q, this.f29799r, a12, iA2, this.f29801t);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Image.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.p1$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f29802l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f29802l = str;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            androidx.compose.ui.semantics.F f13 = f12;
            androidx.compose.ui.semantics.C.m(f13, this.f29802l);
            androidx.compose.ui.semantics.i.f41744b.getClass();
            androidx.compose.ui.semantics.C.s(f13, androidx.compose.ui.semantics.i.f41749g);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cf  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.graphics.painter.e r18, @Y61.l java.lang.String r19, @Y61.l androidx.compose.ui.v r20, @Y61.l androidx.compose.ui.InterfaceC22215f r21, @Y61.l androidx.compose.ui.layout.InterfaceC22374n r22, float r23, @Y61.l androidx.compose.ui.graphics.U r24, @Y61.l androidx.compose.runtime.A r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20806p1.a(androidx.compose.ui.graphics.painter.e, java.lang.String, androidx.compose.ui.v, androidx.compose.ui.f, androidx.compose.ui.layout.n, float, androidx.compose.ui.graphics.U, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k C22293d c22293d, @Y61.l String str, @Y61.l androidx.compose.ui.v vVar, @Y61.l InterfaceC22374n.a.f fVar, @Y61.l androidx.compose.ui.graphics.F f12, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        InterfaceC22374n interfaceC22374n;
        androidx.compose.ui.graphics.F f13;
        androidx.compose.runtime.A a13;
        androidx.compose.ui.v vVar2 = (i13 & 4) != 0 ? androidx.compose.ui.v.f42878y1 : vVar;
        InterfaceC22215f.f39074a.getClass();
        androidx.compose.ui.i iVar = InterfaceC22215f.a.f39080f;
        if ((i13 & 16) != 0) {
            InterfaceC22374n.f40491a.getClass();
            interfaceC22374n = InterfaceC22374n.a.f40494c;
        } else {
            interfaceC22374n = fVar;
        }
        if ((i13 & 64) != 0) {
            a13 = a12;
            f13 = null;
        } else {
            f13 = f12;
            a13 = a12;
        }
        a(androidx.compose.ui.graphics.vector.e0.c(c22293d, a13), str, vVar2, iVar, interfaceC22374n, 1.0f, f13, a12, (i12 & 112) | 8 | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (i12 & 3670016), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004d  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.ui.graphics.InterfaceC22280q0 r10, @Y61.l java.lang.String r11, @Y61.l androidx.compose.ui.v r12, @Y61.l androidx.compose.ui.i r13, @Y61.l androidx.compose.ui.layout.InterfaceC22374n r14, float r15, @Y61.l androidx.compose.ui.graphics.U r16, int r17, @Y61.l androidx.compose.runtime.A r18, int r19, int r20) {
        /*
            r0 = r10
            r7 = r18
            r1 = r20
            r2 = r1 & 4
            if (r2 == 0) goto Lc
            androidx.compose.ui.v$a r2 = androidx.compose.ui.v.f42878y1
            goto Ld
        Lc:
            r2 = r12
        Ld:
            r3 = r1 & 8
            if (r3 == 0) goto L19
            androidx.compose.ui.f$a r3 = androidx.compose.ui.InterfaceC22215f.f39074a
            r3.getClass()
            androidx.compose.ui.i r3 = androidx.compose.ui.InterfaceC22215f.a.f39080f
            goto L1a
        L19:
            r3 = r13
        L1a:
            r4 = r1 & 32
            if (r4 == 0) goto L22
            r4 = 1065353216(0x3f800000, float:1.0)
            r5 = r4
            goto L23
        L22:
            r5 = r15
        L23:
            r4 = r1 & 64
            if (r4 == 0) goto L2a
            r4 = 0
            r6 = r4
            goto L2c
        L2a:
            r6 = r16
        L2c:
            r1 = r1 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L38
            androidx.compose.ui.graphics.drawscope.g$a r1 = androidx.compose.ui.graphics.drawscope.g.f39490B1
            r1.getClass()
            int r1 = androidx.compose.ui.graphics.drawscope.g.a.f39493c
            goto L3a
        L38:
            r1 = r17
        L3a:
            boolean r4 = r7.B(r10)
            java.lang.Object r8 = r18.t()
            if (r4 != 0) goto L4d
            androidx.compose.runtime.A$a r4 = androidx.compose.runtime.A.f37866a
            r4.getClass()
            androidx.compose.runtime.A$a$a r4 = androidx.compose.runtime.A.a.f37868b
            if (r8 != r4) goto L54
        L4d:
            androidx.compose.ui.graphics.painter.a r8 = androidx.compose.ui.graphics.painter.b.a(r10, r1)
            r7.H(r8)
        L54:
            r0 = r8
            androidx.compose.ui.graphics.painter.a r0 = (androidx.compose.ui.graphics.painter.a) r0
            r1 = 4194288(0x3ffff0, float:5.87745E-39)
            r8 = r19 & r1
            r9 = 0
            r1 = r11
            r4 = r14
            r7 = r18
            a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C20806p1.c(androidx.compose.ui.graphics.q0, java.lang.String, androidx.compose.ui.v, androidx.compose.ui.i, androidx.compose.ui.layout.n, float, androidx.compose.ui.graphics.U, int, androidx.compose.runtime.A, int, int):void");
    }
}
