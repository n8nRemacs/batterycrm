package com.akita.compose.component.circular_counter;

import Y41.q;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.InterfaceC20640y;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.v;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import j.InterfaceC42165v;
import j.InterfaceC42167x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: CircularCounter.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"circular-counter_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a {

    /* compiled from: CircularCounter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.akita.compose.component.circular_counter.a$a, reason: collision with other inner class name */
    public static final class C2084a extends N implements q<InterfaceC20640y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f60993l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.circular_counter.d f60994m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2084a(int i12, com.akita.compose.component.circular_counter.d dVar) {
            super(3);
            this.f60993l = i12;
            this.f60994m = dVar;
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
            InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.ui.graphics.painter.e eVarA = u0.e.a(this.f60993l, 0, a13);
                com.akita.compose.component.circular_counter.d dVar = this.f60994m;
                p pVar = dVar.f61025f.f63644a;
                v.a aVar = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                com.akita.compose.foundation.ui.e.a(eVarA, null, C20588k2.o(interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), dVar.f61024e), pVar, a13, 56, 0);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CircularCounter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ int f60995l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f60996m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.circular_counter.d f60997n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f60998o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f60999p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f61000q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f61001r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, float f12, com.akita.compose.component.circular_counter.d dVar, v vVar, int i13, int i14, int i15) {
            super(2);
            this.f60995l = i12;
            this.f60996m = f12;
            this.f60997n = dVar;
            this.f60998o = vVar;
            this.f60999p = i13;
            this.f61000q = i14;
            this.f61001r = i15;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f61000q | 1);
            com.akita.compose.component.circular_counter.d dVar = this.f60997n;
            a.b(this.f60995l, this.f60996m, dVar, this.f60998o, this.f60999p, a12, iA2, this.f61001r);
            return G0.f406611a;
        }
    }

    /* compiled from: CircularCounter.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/layout/y;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/layout/y;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements q<InterfaceC20640y, A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.circular_counter.d f61002l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f61003m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.akita.compose.component.circular_counter.d dVar, String str) {
            super(3);
            this.f61002l = dVar;
            this.f61003m = str;
        }

        @Override // Y41.q
        public final G0 invoke(InterfaceC20640y interfaceC20640y, A a12, Integer num) {
            InterfaceC20640y interfaceC20640y2 = interfaceC20640y;
            A a13 = a12;
            int iIntValue = num.intValue();
            if ((iIntValue & 14) == 0) {
                iIntValue |= a13.B(interfaceC20640y2) ? 4 : 2;
            }
            if ((iIntValue & 91) == 18 && a13.c()) {
                a13.f();
            } else {
                r rVar = this.f61002l.f61025f;
                v.a aVar = v.f42878y1;
                InterfaceC22215f.f39074a.getClass();
                com.akita.compose.foundation.ui.p.b(this.f61003m, rVar, interfaceC20640y2.d(aVar, InterfaceC22215f.a.f39080f), false, 0L, null, 1, 0, false, null, a13, 1572864, 952);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CircularCounter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f61004l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ float f61005m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.circular_counter.d f61006n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f61007o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f61008p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f61009q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ int f61010r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, float f12, com.akita.compose.component.circular_counter.d dVar, v vVar, int i12, int i13, int i14) {
            super(2);
            this.f61004l = str;
            this.f61005m = f12;
            this.f61006n = dVar;
            this.f61007o = vVar;
            this.f61008p = i12;
            this.f61009q = i13;
            this.f61010r = i14;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f61009q | 1);
            com.akita.compose.component.circular_counter.d dVar = this.f61006n;
            a.c(this.f61004l, this.f61005m, dVar, this.f61007o, this.f61008p, a12, iA2, this.f61010r);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d7  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@j.InterfaceC42167x float r16, com.akita.compose.component.circular_counter.d r17, androidx.compose.ui.v r18, androidx.compose.runtime.internal.C22096n r19, androidx.compose.runtime.A r20, int r21) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.akita.compose.component.circular_counter.a.a(float, com.akita.compose.component.circular_counter.d, androidx.compose.ui.v, androidx.compose.runtime.internal.n, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@InterfaceC42165v int i12, @InterfaceC42167x float f12, @k com.akita.compose.component.circular_counter.d dVar, @l v vVar, int i13, @l A a12, int i14, int i15) {
        B bE2 = a12.E(-28538077);
        int i16 = (bE2.m(i12) ? 4 : 2) | i14;
        if ((i14 & 112) == 0) {
            i16 |= bE2.k(f12) ? 32 : 16;
        }
        int i17 = i16 | (bE2.B(dVar) ? 256 : 128);
        int i18 = i15 & 8;
        if (i18 != 0) {
            i17 |= 3072;
        } else if ((i14 & 7168) == 0) {
            i17 |= bE2.B(vVar) ? 2048 : 1024;
        }
        int i19 = i17 | 24576;
        if ((46811 & i19) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            if (i18 != 0) {
                vVar = v.f42878y1;
            }
            int i22 = i19 >> 3;
            a(f12, dVar, vVar, androidx.compose.runtime.internal.r.c(1669815194, new C2084a(i12, dVar), bE2), bE2, (i22 & 896) | (i22 & 14) | 24576 | (i22 & 112) | 3072);
            i13 = 100;
        }
        v vVar2 = vVar;
        int i23 = i13;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, f12, dVar, vVar2, i23, i14, i15);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void c(@k String str, @InterfaceC42167x float f12, @k com.akita.compose.component.circular_counter.d dVar, @l v vVar, int i12, @l A a12, int i13, int i14) {
        int i15;
        B bE2 = a12.E(425837719);
        if ((i13 & 14) == 0) {
            i15 = (bE2.B(str) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 112) == 0) {
            i15 |= bE2.k(f12) ? 32 : 16;
        }
        int i16 = i15 | (bE2.B(dVar) ? 256 : 128);
        int i17 = i14 & 8;
        if (i17 != 0) {
            i16 |= 3072;
        } else if ((i13 & 7168) == 0) {
            i16 |= bE2.B(vVar) ? 2048 : 1024;
        }
        int i18 = i16 | 24576;
        if ((46811 & i18) == 9362 && bE2.c()) {
            bE2.f();
        } else {
            if (i17 != 0) {
                vVar = v.f42878y1;
            }
            int i19 = i18 >> 3;
            a(f12, dVar, vVar, androidx.compose.runtime.internal.r.c(1353387200, new c(dVar, str), bE2), bE2, (i19 & 896) | (i19 & 14) | 24576 | (i19 & 112) | 3072);
            i12 = 100;
        }
        v vVar2 = vVar;
        int i22 = i12;
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new d(str, f12, dVar, vVar2, i22, i13, i14);
        }
    }
}
