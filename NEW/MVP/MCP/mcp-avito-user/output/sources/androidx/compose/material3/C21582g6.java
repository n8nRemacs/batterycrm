package androidx.compose.material3;

import androidx.compose.animation.core.C20310q;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: DateRangePicker.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.g6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21582g6 extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Long f36398l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Long f36399m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f36400n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f36401o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.p<Long, Long, kotlin.G0> f36402p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Long, kotlin.G0> f36403q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC21692l2 f36404r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.ranges.l f36405s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InterfaceC21648j4 f36406t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Ce f36407u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y3 f36408v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f36409w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f36410x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C21582g6(Long l12, Long l13, long j12, int i12, Y41.p<? super Long, ? super Long, kotlin.G0> pVar, Y41.l<? super Long, kotlin.G0> lVar, AbstractC21692l2 abstractC21692l2, kotlin.ranges.l lVar2, InterfaceC21648j4 interfaceC21648j4, Ce ce2, Y3 y32, int i13, int i14) {
        super(2);
        this.f36398l = l12;
        this.f36399m = l13;
        this.f36400n = j12;
        this.f36401o = i12;
        this.f36402p = pVar;
        this.f36403q = lVar;
        this.f36404r = abstractC21692l2;
        this.f36405s = lVar2;
        this.f36406t = interfaceC21648j4;
        this.f36407u = ce2;
        this.f36408v = y32;
        this.f36409w = i13;
        this.f36410x = i14;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        int i12;
        int i13;
        InterfaceC21648j4 interfaceC21648j4;
        AbstractC21692l2 abstractC21692l2;
        kotlin.ranges.l lVar;
        Y41.l<Long, kotlin.G0> lVar2;
        Y41.p<Long, Long, kotlin.G0> pVar;
        int i14;
        long j12;
        Long l12;
        Long l13;
        num.intValue();
        int iA2 = C22066f2.a(this.f36409w | 1);
        int iA3 = C22066f2.a(this.f36410x);
        androidx.compose.foundation.layout.V1 v12 = C21811q6.f37145a;
        androidx.compose.runtime.B bE2 = a12.E(-532789335);
        int i15 = iA2 & 6;
        Long l14 = this.f36398l;
        if (i15 == 0) {
            i12 = (bE2.B(l14) ? 4 : 2) | iA2;
        } else {
            i12 = iA2;
        }
        int i16 = iA2 & 48;
        Long l15 = this.f36399m;
        if (i16 == 0) {
            i12 |= bE2.B(l15) ? 32 : 16;
        }
        int i17 = iA2 & 384;
        long j13 = this.f36400n;
        if (i17 == 0) {
            i12 |= bE2.n(j13) ? 256 : 128;
        }
        int i18 = iA2 & 3072;
        int i19 = this.f36401o;
        if (i18 == 0) {
            i12 |= bE2.m(i19) ? 2048 : 1024;
        }
        int i22 = iA2 & 24576;
        Y41.p<Long, Long, kotlin.G0> pVar2 = this.f36402p;
        if (i22 == 0) {
            i12 |= bE2.u(pVar2) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        int i23 = 196608 & iA2;
        Y41.l<Long, kotlin.G0> lVar3 = this.f36403q;
        if (i23 == 0) {
            i12 |= bE2.u(lVar3) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i24 = 1572864 & iA2;
        AbstractC21692l2 abstractC21692l22 = this.f36404r;
        if (i24 == 0) {
            i12 |= bE2.u(abstractC21692l22) ? 1048576 : 524288;
        }
        int i25 = 12582912 & iA2;
        kotlin.ranges.l lVar4 = this.f36405s;
        if (i25 == 0) {
            i12 |= bE2.u(lVar4) ? 8388608 : 4194304;
        }
        int i26 = 100663296 & iA2;
        InterfaceC21648j4 interfaceC21648j42 = this.f36406t;
        if (i26 == 0) {
            i12 |= (134217728 & iA2) == 0 ? bE2.B(interfaceC21648j42) : bE2.u(interfaceC21648j42) ? 67108864 : 33554432;
        }
        int i27 = 805306368 & iA2;
        Ce ce2 = this.f36407u;
        if (i27 == 0) {
            i12 |= bE2.B(ce2) ? 536870912 : 268435456;
        }
        int i28 = iA3 & 6;
        Y3 y32 = this.f36408v;
        if (i28 == 0) {
            i13 = iA3 | (bE2.B(y32) ? 4 : 2);
        } else {
            i13 = iA3;
        }
        if ((306783379 & i12) == 306783378 && (i13 & 3) == 2 && bE2.c()) {
            bE2.f();
            interfaceC21648j4 = interfaceC21648j42;
            abstractC21692l2 = abstractC21692l22;
            lVar = lVar4;
            lVar2 = lVar3;
            pVar = pVar2;
            i14 = i19;
            j12 = j13;
            l12 = l15;
            l13 = l14;
        } else {
            interfaceC21648j4 = interfaceC21648j42;
            abstractC21692l2 = abstractC21692l22;
            lVar = lVar4;
            lVar2 = lVar3;
            pVar = pVar2;
            i14 = i19;
            j12 = j13;
            l12 = l15;
            l13 = l14;
            androidx.compose.animation.F0.b(D6.a(i19), androidx.compose.ui.semantics.r.b(androidx.compose.ui.v.f42878y1, false, C21536e6.f36250l), C20310q.d(0.0f, 7, null), null, androidx.compose.runtime.internal.r.b(bE2, -1026642619, new C21559f6(l14, l15, j13, pVar2, lVar2, abstractC21692l2, lVar, interfaceC21648j4, ce2, y32)), bE2, ((i12 >> 9) & 14) | 24960, 8);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new C21582g6(l13, l12, j12, i14, pVar, lVar2, abstractC21692l2, lVar, interfaceC21648j4, ce2, y32, iA2, iA3);
        }
        return kotlin.G0.f406611a;
    }
}
