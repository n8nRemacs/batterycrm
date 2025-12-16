package com.avito.android.iac_dialer_ui.pub.call_screen.dtmf_buttons;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.v;
import com.akita.compose.component.button.m;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: IacUIDtmfButtonsOpenKeyboard.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_iac-dialer-ui_public"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: IacUIDtmfButtonsOpenKeyboard.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f167265l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ v f167266m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f167267n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f167268o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, int i13, Y41.a aVar, v vVar) {
            super(2);
            this.f167265l = aVar;
            this.f167266m = vVar;
            this.f167267n = i12;
            this.f167268o = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f167267n | 1);
            v vVar = this.f167266m;
            c.a(iA2, this.f167268o, this.f167265l, a12, vVar);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @k Y41.a aVar, @l A a12, @l v vVar) {
        int i14;
        int i15;
        B bE2 = a12.E(172266009);
        if ((i12 & 14) == 0) {
            i14 = (bE2.u(aVar) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i16 = i13 & 2;
        if (i16 != 0) {
            i15 = i14 | 48;
        } else {
            i15 = i14 | (bE2.B(vVar) ? 32 : 16);
        }
        if ((i15 & 91) == 18 && bE2.c()) {
            bE2.f();
        } else {
            if (i16 != 0) {
                vVar = v.f42878y1;
            }
            v vVarA = C22501m2.a(C20588k2.d(vVar, 1.0f), "IacUITestTags.DtmfButtons.OPEN_KEYBOARD");
            com.akita.compose.theme.re23.b.f63983a.getClass();
            m.a(R.string.iac_dialer_ui_public___dtmf_buttons___open_keyboard, aVar, com.akita.compose.theme.re23.b.c(bE2).r2(), vVarA, Integer.valueOf(R.drawable.iac_dialer_ui_public_icon_keyboard_open_24), false, false, bE2, ((i15 << 3) & 112) | 512, 976);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12, i13, aVar, vVar);
        }
    }
}
