package com.akita.compose.foundation.ui;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.C20608p2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: Spacer.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g {

    /* compiled from: Spacer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ float f63721l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f63722m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f63723n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f63724o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f12, v vVar, int i12, int i13) {
            super(2);
            this.f63721l = f12;
            this.f63722m = vVar;
            this.f63723n = i12;
            this.f63724o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f63723n | 1);
            v vVar = this.f63722m;
            int i12 = this.f63724o;
            g.b(this.f63721l, vVar, a12, iA2, i12);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(float f12, @Y61.l v vVar, @Y61.l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2046677224);
        if ((i12 & 14) == 0) {
            i13 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (((i13 | 48) & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            vVar = v.f42878y1;
            C20608p2.a(bE2, C20588k2.f(vVar, f12));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new f(f12, vVar, i12);
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void b(float f12, @Y61.l v vVar, @Y61.l A a12, int i12, int i13) {
        int i14;
        B bE2 = a12.E(6817027);
        if ((i12 & 14) == 0) {
            i14 = (bE2.k(f12) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 |= 48;
        } else if ((i12 & 112) == 0) {
            i14 |= bE2.B(vVar) ? 32 : 16;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            if (i15 != 0) {
                vVar = v.f42878y1;
            }
            C20608p2.a(bE2, C20588k2.t(vVar, f12));
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(f12, vVar, i12, i13);
        }
    }
}
