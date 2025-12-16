package com.akita.compose.component.slider;

import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: Slider.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"slider_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i {

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/slider/q;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/slider/q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.q<q, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f62716l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ s f62717m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.foundation.interaction.m mVar, s sVar) {
            super(3);
            this.f62716l = mVar;
            this.f62717m = sVar;
        }

        @Override // Y41.q
        public final G0 invoke(q qVar, A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 81) == 16 && a13.c()) {
                a13.f();
            } else {
                s sVar = this.f62717m;
                t.a(this.f62716l, null, sVar.f62762d.c(a13), sVar.f62763e, a13, 0, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/akita/compose/component/slider/q;", "it", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/slider/q;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.q<q, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ s f62718l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s sVar) {
            super(3);
            this.f62718l = sVar;
        }

        @Override // Y41.q
        public final G0 invoke(q qVar, A a12, Integer num) {
            q qVar2 = qVar;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(qVar2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                s sVar = this.f62718l;
                y.a(qVar2, null, sVar.f62759a, sVar.f62761c.c(a13), sVar.f62760b.c(a13), a13, iIntValue & 14, 2);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: Slider.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f62719l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Float, G0> f62720m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ s f62721n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f62722o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f62723p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f62724q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f62725r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ kotlin.ranges.f<Float> f62726s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f62727t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f62728u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f62729v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(float f12, Y41.l<? super Float, G0> lVar, s sVar, androidx.compose.ui.v vVar, boolean z12, Y41.a<G0> aVar, androidx.compose.foundation.interaction.m mVar, kotlin.ranges.f<Float> fVar, int i12, int i13, int i14) {
            super(2);
            this.f62719l = f12;
            this.f62720m = lVar;
            this.f62721n = sVar;
            this.f62722o = vVar;
            this.f62723p = z12;
            this.f62724q = aVar;
            this.f62725r = mVar;
            this.f62726s = fVar;
            this.f62727t = i12;
            this.f62728u = i13;
            this.f62729v = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f62728u | 1);
            kotlin.ranges.f<Float> fVar = this.f62726s;
            androidx.compose.foundation.interaction.m mVar = this.f62725r;
            i.a(this.f62719l, this.f62720m, this.f62721n, this.f62722o, this.f62723p, this.f62724q, mVar, fVar, this.f62727t, a12, iA2, this.f62729v);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012c  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(float r25, @Y61.k Y41.l<? super java.lang.Float, kotlin.G0> r26, @Y61.k com.akita.compose.component.slider.s r27, @Y61.l androidx.compose.ui.v r28, boolean r29, @Y61.l Y41.a<kotlin.G0> r30, @Y61.l androidx.compose.foundation.interaction.m r31, @Y61.l kotlin.ranges.f<java.lang.Float> r32, @j.F int r33, @Y61.l androidx.compose.runtime.A r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.slider.i.a(float, Y41.l, com.akita.compose.component.slider.s, androidx.compose.ui.v, boolean, Y41.a, androidx.compose.foundation.interaction.m, kotlin.ranges.f, int, androidx.compose.runtime.A, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0167  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(com.akita.compose.component.slider.q r25, androidx.compose.ui.v r26, boolean r27, androidx.compose.foundation.interaction.m r28, Y41.q r29, Y41.q r30, androidx.compose.runtime.A r31, int r32) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.slider.i.b(com.akita.compose.component.slider.q, androidx.compose.ui.v, boolean, androidx.compose.foundation.interaction.m, Y41.q, Y41.q, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void c(@Y61.k q qVar, @Y61.k s sVar, @Y61.l androidx.compose.ui.v vVar, boolean z12, @Y61.l androidx.compose.foundation.interaction.m mVar, @Y61.l C22096n c22096n, @Y61.l C22096n c22096n2, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(1601132459);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(qVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.B(sVar) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(vVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.j(z12) ? 2048 : 1024;
        }
        if ((i12 & 57344) == 0) {
            i13 |= bE2.B(mVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i12 & 458752) == 0) {
            i13 |= bE2.u(c22096n) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        if ((3670016 & i12) == 0) {
            i13 |= bE2.u(c22096n2) ? 1048576 : 524288;
        }
        if ((2995931 & i13) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            int i14 = i13 & 14;
            int i15 = i13 >> 3;
            b(qVar, vVar, z12, mVar, c22096n, c22096n2, bE2, (57344 & i15) | i14 | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 458752));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new e(qVar, sVar, vVar, z12, mVar, c22096n, c22096n2, i12);
        }
    }
}
