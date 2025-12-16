package com.akita.compose.component.tab_group;

import androidx.compose.animation.core.C20310q;
import androidx.compose.animation.core.G1;
import androidx.compose.animation.core.Q;
import androidx.compose.foundation.a2;
import androidx.compose.foundation.d2;
import androidx.compose.foundation.layout.E;
import androidx.compose.foundation.layout.T1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22187u0;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.q0;
import androidx.compose.ui.text.x0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: TabGroup.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"tab-group_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final G1 f63030a = C20310q.e(300, 0, Q.f26121a, 2);

    /* compiled from: TabGroup.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LR2/a;", "indicatorData", "Lkotlin/G0;", "invoke", "(LR2/a;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<R2.a, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ u f63031l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar) {
            super(3);
            this.f63031l = uVar;
        }

        @Override // Y41.q
        public final G0 invoke(R2.a aVar, A a12, Integer num) {
            R2.a aVar2 = aVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(aVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                u uVar = this.f63031l;
                e.a(aVar2, uVar.f63097d, uVar.f63098e, uVar.f63095b, uVar.f63096c, null, a13, iIntValue & 14);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TabGroup.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<Integer> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ q0 f63032l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f63033m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ x0 f63034n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, String str, x0 x0Var) {
            super(0);
            this.f63032l = q0Var;
            this.f63033m = str;
            this.f63034n = x0Var;
        }

        @Override // Y41.a
        public final Integer invoke() {
            return Integer.valueOf((int) (q0.b(this.f63032l, new C22602e(this.f63033m, null, 2, null), this.f63034n, 0, false, 0, 0L, null, null, null, 2044).f42528c >> 32));
        }
    }

    /* compiled from: TabGroup.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<R2.b> f63035l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f63036m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ u f63037n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63038o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<R2.b> list, int i12, u uVar, Y41.l<? super Integer, G0> lVar) {
            super(2);
            this.f63035l = list;
            this.f63036m = i12;
            this.f63037n = uVar;
            this.f63038o = lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
        @Override // Y41.p
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(androidx.compose.runtime.A r10, java.lang.Integer r11) {
            /*
                r9 = this;
                androidx.compose.runtime.A r10 = (androidx.compose.runtime.A) r10
                java.lang.Number r11 = (java.lang.Number) r11
                int r11 = r11.intValue()
                r11 = r11 & 11
                r0 = 2
                if (r11 != r0) goto L19
                boolean r11 = r10.c()
                if (r11 != 0) goto L14
                goto L19
            L14:
                r10.f()
                goto L7e
            L19:
                java.util.List<R2.b> r11 = r9.f63035l
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.Iterator r11 = r11.iterator()
                r7 = 0
                r0 = r7
            L23:
                boolean r1 = r11.hasNext()
                if (r1 == 0) goto L7e
                java.lang.Object r1 = r11.next()
                int r8 = r0 + 1
                if (r0 < 0) goto L79
                R2.b r1 = (R2.b) r1
                int r2 = r9.f63036m
                if (r0 != r2) goto L39
                r2 = 1
                goto L3a
            L39:
                r2 = r7
            L3a:
                com.akita.compose.component.tab_group.u r3 = r9.f63037n
                com.akita.compose.component.tab_group.j r3 = r3.f63099f
                r4 = 1809144915(0x6bd55c53, float:5.1587438E26)
                r10.C(r4)
                Y41.l<java.lang.Integer, kotlin.G0> r4 = r9.f63038o
                boolean r5 = r10.B(r4)
                boolean r6 = r10.m(r0)
                r5 = r5 | r6
                java.lang.Object r6 = r10.t()
                if (r5 != 0) goto L5e
                androidx.compose.runtime.A$a r5 = androidx.compose.runtime.A.f37866a
                r5.getClass()
                androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
                if (r6 != r5) goto L66
            L5e:
                com.akita.compose.component.tab_group.l r6 = new com.akita.compose.component.tab_group.l
                r6.<init>(r0, r4)
                r10.H(r6)
            L66:
                r4 = r6
                Y41.a r4 = (Y41.a) r4
                r10.h()
                r5 = 0
                r6 = 0
                r0 = r1
                r1 = r2
                r2 = r3
                r3 = r4
                r4 = r5
                r5 = r10
                com.akita.compose.component.tab_group.i.a(r0, r1, r2, r3, r4, r5, r6)
                r0 = r8
                goto L23
            L79:
                kotlin.collections.C42745f0.H0()
                r10 = 0
                throw r10
            L7e:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.tab_group.k.c.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: TabGroup.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ List<R2.b> f63039l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ int f63040m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, G0> f63041n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ u f63042o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f63043p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ T1 f63044q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f63045r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f63046s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(List<R2.b> list, int i12, Y41.l<? super Integer, G0> lVar, u uVar, androidx.compose.ui.v vVar, T1 t12, int i13, int i14) {
            super(2);
            this.f63039l = list;
            this.f63040m = i12;
            this.f63041n = lVar;
            this.f63042o = uVar;
            this.f63043p = vVar;
            this.f63044q = t12;
            this.f63045r = i13;
            this.f63046s = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63045r | 1);
            u uVar = this.f63042o;
            k.a(this.f63039l, this.f63040m, this.f63041n, uVar, this.f63043p, this.f63044q, a12, iA2, this.f63046s);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k java.util.List<R2.b> r16, int r17, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r18, @Y61.k com.akita.compose.component.tab_group.u r19, @Y61.l androidx.compose.ui.v r20, @Y61.l androidx.compose.foundation.layout.T1 r21, @Y61.l androidx.compose.runtime.A r22, int r23, int r24) {
        /*
            r4 = r19
            r0 = -833708730(0xffffffffce4e9d46, float:-8.666034E8)
            r1 = r22
            androidx.compose.runtime.B r0 = r1.E(r0)
            r1 = r24 & 16
            if (r1 == 0) goto L13
            androidx.compose.ui.v$a r1 = androidx.compose.ui.v.f42878y1
            r14 = r1
            goto L15
        L13:
            r14 = r20
        L15:
            r1 = r24 & 32
            if (r1 == 0) goto L21
            r1 = 0
            r2 = 3
            androidx.compose.foundation.layout.V1 r1 = androidx.compose.foundation.layout.R1.c(r1, r1, r2)
            r15 = r1
            goto L23
        L21:
            r15 = r21
        L23:
            int r1 = r16.size()
            r2 = 0
            androidx.compose.ui.text.q0 r1 = androidx.compose.ui.text.r0.a(r1, r2, r2, r0)
            com.akita.compose.component.tab_group.j r3 = r4.f63099f
            com.akita.compose.foundation.r r3 = r3.f63027h
            java.lang.Object[] r5 = new java.lang.Object[r2]
            androidx.compose.ui.text.x0 r3 = r3.d(r5, r0)
            java.lang.Object r5 = r16.get(r17)
            R2.b r5 = (R2.b) r5
            R2.b$c r5 = r5.f14070a
            java.lang.String r5 = r5.a(r0)
            com.akita.compose.component.tab_group.k$a r6 = new com.akita.compose.component.tab_group.k$a
            r6.<init>(r4)
            r7 = 1103587749(0x41c769a5, float:24.926584)
            androidx.compose.runtime.internal.n r8 = androidx.compose.runtime.internal.r.c(r7, r6, r0)
            r6 = 612546137(0x2482b659, float:5.668742E-17)
            r0.C(r6)
            boolean r6 = r0.B(r1)
            boolean r7 = r0.B(r5)
            r6 = r6 | r7
            boolean r7 = r0.B(r3)
            r6 = r6 | r7
            java.lang.Object r7 = r0.t()
            if (r6 != 0) goto L71
            androidx.compose.runtime.A$a r6 = androidx.compose.runtime.A.f37866a
            r6.getClass()
            androidx.compose.runtime.A$a$a r6 = androidx.compose.runtime.A.a.f37868b
            if (r7 != r6) goto L79
        L71:
            com.akita.compose.component.tab_group.k$b r7 = new com.akita.compose.component.tab_group.k$b
            r7.<init>(r1, r5, r3)
            r0.H(r7)
        L79:
            r9 = r7
            Y41.a r9 = (Y41.a) r9
            r0.X(r2)
            com.akita.compose.component.tab_group.k$c r1 = new com.akita.compose.component.tab_group.k$c
            r2 = r16
            r3 = r17
            r13 = r18
            r1.<init>(r2, r3, r4, r13)
            r5 = 915394153(0x368fce69, float:4.2857614E-6)
            androidx.compose.runtime.internal.n r11 = androidx.compose.runtime.internal.r.c(r5, r1, r0)
            int r1 = r23 >> 3
            r1 = r1 & 14
            r5 = 1575936(0x180c00, float:2.208357E-39)
            r1 = r1 | r5
            int r5 = r23 >> 6
            r5 = r5 & 896(0x380, float:1.256E-42)
            r1 = r1 | r5
            r5 = 458752(0x70000, float:6.42848E-40)
            r5 = r23 & r5
            r1 = r1 | r5
            float r6 = r4.f63094a
            r5 = r17
            r7 = r14
            r10 = r15
            r12 = r0
            r13 = r1
            b(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            androidx.compose.runtime.c2 r9 = r0.Z()
            if (r9 == 0) goto Lca
            com.akita.compose.component.tab_group.k$d r10 = new com.akita.compose.component.tab_group.k$d
            r0 = r10
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r14
            r6 = r15
            r7 = r23
            r8 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f38184d = r10
        Lca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.tab_group.k.a(java.util.List, int, Y41.l, com.akita.compose.component.tab_group.u, androidx.compose.ui.v, androidx.compose.foundation.layout.T1, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(int i12, float f12, @Y61.l androidx.compose.ui.v vVar, @Y61.l C22096n c22096n, @Y61.l Y41.a aVar, @Y61.l T1 t12, @Y61.k C22096n c22096n2, @Y61.l A a12, int i13) {
        int i14;
        B bE2 = a12.E(1831784843);
        if ((i13 & 14) == 0) {
            i14 = (bE2.m(i12) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 112) == 0) {
            i14 |= bE2.k(f12) ? 32 : 16;
        }
        if ((i13 & 896) == 0) {
            i14 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i13 & 7168) == 0) {
            i14 |= bE2.u(c22096n) ? 2048 : 1024;
        }
        if ((57344 & i13) == 0) {
            i14 |= bE2.u(aVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i13) == 0) {
            i14 |= bE2.B(t12) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i13) == 0) {
            i14 |= bE2.u(c22096n2) ? 1048576 : 524288;
        }
        if ((i14 & 2995931) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            d2 d2VarA = a2.a(bE2);
            Object objT = bE2.t();
            A.f37866a.getClass();
            Object obj = A.a.f37868b;
            if (objT == obj) {
                objT = C22187u0.h(EmptyCoroutineContext.INSTANCE, bE2);
                bE2.H(objT);
            }
            T t13 = (T) objT;
            bE2.C(612600357);
            boolean zB2 = bE2.B(d2VarA) | bE2.B(t13);
            Object objT2 = bE2.t();
            if (zB2 || objT2 == obj) {
                objT2 = new t(d2VarA, t13);
                bE2.H(objT2);
            }
            bE2.X(false);
            E.a(null, null, false, androidx.compose.runtime.internal.r.c(983237493, new q(vVar, t12, d2VarA, f12, c22096n2, (t) objT2, i12, aVar, c22096n), bE2), bE2, 3072, 7);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new r(i12, f12, vVar, c22096n, aVar, t12, c22096n2, i13);
        }
    }
}
