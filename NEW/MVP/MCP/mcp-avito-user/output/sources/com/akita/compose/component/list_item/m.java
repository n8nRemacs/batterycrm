package com.akita.compose.component.list_item;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.text.C22602e;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: ListItem.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"list-item_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class m {

    /* compiled from: ListItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f61914l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ s f61915m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22602e c22602e, s sVar) {
            super(2);
            this.f61914l = c22602e;
            this.f61915m = sVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.foundation.ui.p.a(this.f61914l, this.f61915m.f61951c, null, false, 0L, null, 0, 0, false, null, a13, 0, 1020);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ListItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f61916l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ s f61917m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f61918n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Y41.p<A, Integer, G0> f61919o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Y41.p<A, Integer, G0> f61920p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.p<A, Integer, G0> f61921q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f61922r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f61923s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(C22602e c22602e, s sVar, androidx.compose.ui.v vVar, Y41.p<? super A, ? super Integer, G0> pVar, Y41.p<? super A, ? super Integer, G0> pVar2, Y41.p<? super A, ? super Integer, G0> pVar3, int i12, int i13) {
            super(2);
            this.f61916l = c22602e;
            this.f61917m = sVar;
            this.f61918n = vVar;
            this.f61919o = pVar;
            this.f61920p = pVar2;
            this.f61921q = pVar3;
            this.f61922r = i12;
            this.f61923s = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f61922r | 1);
            C22602e c22602e = this.f61916l;
            Y41.p<A, Integer, G0> pVar = this.f61919o;
            m.b(c22602e, this.f61917m, this.f61918n, pVar, this.f61920p, this.f61921q, a12, iA2, this.f61923s);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void a(@Y61.k C22602e c22602e, @Y61.k C22602e c22602e2, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, @Y61.l Y41.p pVar, @Y61.l C22096n c22096n, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(2058319481);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(c22602e2) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(sVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.B(vVar) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.u(pVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= bE2.u(c22096n) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((374491 & i13) == 74898 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = i13 >> 3;
            b(c22602e, sVar, vVar, androidx.compose.runtime.internal.r.c(1600761498, new j(c22602e2, sVar), bE2), pVar, c22096n, bE2, (57344 & i13) | (i13 & 14) | 3072 | (i14 & 112) | (i14 & 896) | (i13 & 458752), 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new k(c22602e, c22602e2, sVar, vVar, pVar, c22096n, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.ui.text.C22602e r17, @Y61.k com.akita.compose.component.list_item.s r18, @Y61.l androidx.compose.ui.v r19, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r20, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r21, @Y61.l Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r22, @Y61.l androidx.compose.runtime.A r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.m.b(androidx.compose.ui.text.e, com.akita.compose.component.list_item.s, androidx.compose.ui.v, Y41.p, Y41.p, Y41.p, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k com.akita.compose.component.list_item.s r17, @Y61.l androidx.compose.ui.v r18, @Y61.l Y41.p r19, @Y61.l Y41.p r20, @Y61.l Y41.p r21, @Y61.k androidx.compose.runtime.internal.C22096n r22, @Y61.l androidx.compose.runtime.A r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.m.c(com.akita.compose.component.list_item.s, androidx.compose.ui.v, Y41.p, Y41.p, Y41.p, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k java.lang.String r20, @Y61.k com.akita.compose.component.list_item.s r21, @Y61.l androidx.compose.ui.v r22, @Y61.l androidx.compose.runtime.internal.C22096n r23, @Y61.l androidx.compose.runtime.internal.C22096n r24, @Y61.l androidx.compose.runtime.internal.C22096n r25, @Y61.l androidx.compose.runtime.A r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.m.d(java.lang.String, com.akita.compose.component.list_item.s, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(@Y61.k java.lang.String r14, @Y61.k java.lang.String r15, @Y61.k com.akita.compose.component.list_item.s r16, @Y61.l androidx.compose.ui.v r17, @Y61.l androidx.compose.runtime.internal.C22096n r18, @Y61.l androidx.compose.runtime.internal.C22096n r19, @Y61.l androidx.compose.runtime.A r20, int r21, int r22) {
        /*
            r1 = r14
            r2 = r15
            r0 = 1643074195(0x61ef5293, float:5.5184024E20)
            r3 = r20
            androidx.compose.runtime.B r0 = r3.E(r0)
            boolean r3 = r0.B(r14)
            r4 = 2
            if (r3 == 0) goto L14
            r3 = 4
            goto L15
        L14:
            r3 = r4
        L15:
            r3 = r21 | r3
            boolean r5 = r0.B(r15)
            if (r5 == 0) goto L20
            r5 = 32
            goto L22
        L20:
            r5 = 16
        L22:
            r3 = r3 | r5
            r11 = r16
            boolean r5 = r0.B(r11)
            if (r5 == 0) goto L2e
            r5 = 256(0x100, float:3.59E-43)
            goto L30
        L2e:
            r5 = 128(0x80, float:1.8E-43)
        L30:
            r3 = r3 | r5
            r12 = r17
            boolean r5 = r0.B(r12)
            if (r5 == 0) goto L3c
            r5 = 2048(0x800, float:2.87E-42)
            goto L3e
        L3c:
            r5 = 1024(0x400, float:1.435E-42)
        L3e:
            r3 = r3 | r5
            r5 = r22 & 16
            if (r5 == 0) goto L48
            r3 = r3 | 24576(0x6000, float:3.4438E-41)
        L45:
            r6 = r18
            goto L5d
        L48:
            r6 = 57344(0xe000, float:8.0356E-41)
            r6 = r21 & r6
            if (r6 != 0) goto L45
            r6 = r18
            boolean r7 = r0.u(r6)
            if (r7 == 0) goto L5a
            r7 = 16384(0x4000, float:2.2959E-41)
            goto L5c
        L5a:
            r7 = 8192(0x2000, float:1.148E-41)
        L5c:
            r3 = r3 | r7
        L5d:
            r7 = 374491(0x5b6db, float:5.24774E-40)
            r7 = r7 & r3
            r8 = 74898(0x12492, float:1.04954E-40)
            if (r7 != r8) goto L72
            boolean r7 = r0.c()
            if (r7 != 0) goto L6d
            goto L72
        L6d:
            r0.f()
            r5 = r6
            goto L95
        L72:
            r7 = 0
            if (r5 == 0) goto L77
            r13 = r7
            goto L78
        L77:
            r13 = r6
        L78:
            androidx.compose.ui.text.e r5 = new androidx.compose.ui.text.e
            r5.<init>(r14, r7, r4, r7)
            androidx.compose.ui.text.e r6 = new androidx.compose.ui.text.e
            r6.<init>(r15, r7, r4, r7)
            r4 = 524160(0x7ff80, float:7.34505E-40)
            r10 = r3 & r4
            r3 = r5
            r4 = r6
            r5 = r16
            r6 = r17
            r7 = r13
            r8 = r19
            r9 = r0
            a(r3, r4, r5, r6, r7, r8, r9, r10)
            r5 = r13
        L95:
            androidx.compose.runtime.c2 r9 = r0.Z()
            if (r9 == 0) goto Laf
            com.akita.compose.component.list_item.i r10 = new com.akita.compose.component.list_item.i
            r0 = r10
            r1 = r14
            r2 = r15
            r3 = r16
            r4 = r17
            r6 = r19
            r7 = r21
            r8 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f38184d = r10
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.list_item.m.e(java.lang.String, java.lang.String, com.akita.compose.component.list_item.s, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int, int):void");
    }
}
