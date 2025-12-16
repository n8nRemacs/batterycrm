package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.graphics.vector.C22293d;
import androidx.compose.ui.v;
import kotlin.Metadata;

/* compiled from: Icon.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.y8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21991y8 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f37756a;

    /* compiled from: Icon.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.y8$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22293d f37757l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f37758m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f37759n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f37760o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f37761p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f37762q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22293d c22293d, String str, androidx.compose.ui.v vVar, long j12, int i12, int i13) {
            super(2);
            this.f37757l = c22293d;
            this.f37758m = str;
            this.f37759n = vVar;
            this.f37760o = j12;
            this.f37761p = i12;
            this.f37762q = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f37761p | 1);
            C22293d c22293d = this.f37757l;
            String str = this.f37758m;
            C21991y8.b(c22293d, str, this.f37759n, this.f37760o, a12, iA2, this.f37762q);
            return kotlin.G0.f406611a;
        }
    }

    static {
        v.a aVar = androidx.compose.ui.v.f42878y1;
        d0.B.f393158a.getClass();
        f37756a = C20588k2.o(aVar, d0.B.f393159b);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0130  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.graphics.painter.e r16, @Y61.l java.lang.String r17, @Y61.l androidx.compose.ui.v r18, long r19, @Y61.l androidx.compose.runtime.A r21, int r22) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21991y8.a(androidx.compose.ui.graphics.painter.e, java.lang.String, androidx.compose.ui.v, long, androidx.compose.runtime.A, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(@Y61.k C22293d c22293d, @Y61.l String str, @Y61.l androidx.compose.ui.v vVar, long j12, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.v vVar2;
        int i14;
        int i15;
        androidx.compose.ui.v vVar3;
        long j13;
        androidx.compose.ui.v vVar4;
        long j14;
        androidx.compose.runtime.B bE2 = a12.E(-126890956);
        int i16 = i12 | (bE2.B(c22293d) ? 4 : 2);
        if ((i12 & 48) == 0) {
            i16 |= bE2.B(str) ? 32 : 16;
        }
        int i17 = i13 & 4;
        if (i17 != 0) {
            i14 = i16 | 384;
            vVar2 = vVar;
        } else {
            vVar2 = vVar;
            i14 = i16 | (bE2.B(vVar) ? 256 : 128);
        }
        int i18 = i14 | 1024;
        if ((i18 & 1171) == 1170 && bE2.c()) {
            bE2.f();
            vVar4 = vVar2;
            j14 = j12;
        } else {
            bE2.y0();
            if ((i12 & 1) == 0 || bE2.g0()) {
                i15 = i18 & (-7169);
                vVar3 = i17 != 0 ? androidx.compose.ui.v.f42878y1 : vVar2;
                j13 = ((androidx.compose.ui.graphics.T) bE2.o(L3.f35042a)).f39331a;
            } else {
                bE2.f();
                i15 = i18 & (-7169);
                j13 = j12;
                vVar3 = vVar2;
            }
            bE2.Y();
            a(androidx.compose.ui.graphics.vector.e0.c(c22293d, bE2), str, vVar3, j13, bE2, (i15 & 112) | 8 | (i15 & 896));
            vVar4 = vVar3;
            j14 = j13;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(c22293d, str, vVar4, j14, i12, i13);
        }
    }
}
