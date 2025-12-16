package com.avito.android.str_cancellation_settings.composables;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.Q0;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.akita.compose.theme.re23.style.J1;
import com.akita.compose.theme.re23.style.M1;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import p0.InterfaceC44967a;

/* compiled from: StrCancellationSettingsBottomBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_str-cancellation-settings_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class W {

    /* compiled from: StrCancellationSettingsBottomBar.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f288183l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f288184m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f288185n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, boolean z13, Y41.a<G0> aVar) {
            super(2);
            this.f288183l = z12;
            this.f288184m = z13;
            this.f288185n = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                InterfaceC44967a interfaceC44967a = (InterfaceC44967a) a13.o(Q0.f41203l);
                androidx.compose.ui.v vVarD = C20588k2.d(androidx.compose.ui.v.f42878y1, 1.0f);
                float f12 = 10;
                h.a aVar = androidx.compose.ui.unit.h.f42849c;
                com.akita.compose.component.button.m.c(u0.i.c(a13, R.string.apply_button_title), new V(this.f288185n, interfaceC44967a), com.avito.android.actions_sheet.a.o(com.akita.compose.theme.re23.b.f63983a, a13), R1.l(vVarD, f12, f12, f12, 16), null, null, null, this.f288183l, this.f288184m, null, a13, 512, 624);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StrCancellationSettingsBottomBar.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ boolean f288186l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f288187m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f288188n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f288189o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, Y41.a aVar, boolean z12, boolean z13) {
            super(2);
            this.f288186l = z12;
            this.f288187m = z13;
            this.f288188n = aVar;
            this.f288189o = i12;
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f288189o | 1);
            Y41.a<G0> aVar = this.f288188n;
            W.a(this.f288186l, this.f288187m, aVar, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(boolean z12, boolean z13, @Y61.k Y41.a<G0> aVar, @Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(982367088);
        int i13 = (bE2.j(z12) ? 4 : 2) | i12 | (bE2.j(z13) ? 32 : 16);
        if ((i12 & 896) == 0) {
            i13 |= bE2.u(aVar) ? 256 : 128;
        }
        if ((i13 & 731) == 146 && bE2.c()) {
            bE2.f();
        } else {
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.foundation.modifier.f fVar = ((J1) bE2.o(M1.f66164b)).getF66160b().f61580d;
            com.akita.compose.foundation.p pVar = com.akita.compose.theme.re23.b.f63984b.f63851H1;
            float f12 = 24;
            h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
            float f13 = 0;
            androidx.compose.foundation.shape.n nVarB = androidx.compose.foundation.shape.o.b(f12, f12, f13, f13);
            v.a aVar3 = androidx.compose.ui.v.f42878y1;
            float f14 = com.akita.compose.foundation.modifier.d.f63611a;
            com.akita.compose.foundation.ui.n.a(com.akita.compose.foundation.modifier.d.a(aVar3, fVar.f63623a, fVar.f63624b, com.akita.compose.foundation.modifier.d.f63611a), nVarB, 0.0f, pVar, null, androidx.compose.runtime.internal.r.c(-1480635468, new a(z13, z12, aVar), bE2), bE2, 1572864, 52);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, aVar, z12, z13);
        }
    }
}
