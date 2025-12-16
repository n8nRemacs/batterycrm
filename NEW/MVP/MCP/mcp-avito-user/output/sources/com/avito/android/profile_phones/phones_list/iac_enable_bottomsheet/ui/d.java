package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.foundation.C21086w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.v;
import com.akita.compose.component.list_item.m;
import com.akita.compose.component.list_item.s;
import com.akita.compose.component.toggle.ToggleState;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState;
import com.avito.android.remote.model.UniversalImage;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import shark.AndroidResourceIdNames;

/* compiled from: IacEnableBottomSheetContent.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final UniversalImage f227867a = new UniversalImage(com.avito.android.profile_phones.utils.a.b(P0.g(new Q("86x48", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_86x48.png"), new Q("172x95", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_172x95.png"), new Q("258x143", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_258x143.png"), new Q("343x190", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_343x190.png"), new Q("429x238", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_429x238.png"), new Q("515x285", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_515x285.png"), new Q("601x333", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_601x333.png"), new Q("686x380", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_686x380.png"), new Q("858x475", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_858x475.png"), new Q("1029x570", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_1029x570.png"), new Q("1201x665", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_1201x665.png"), new Q("1372x760", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_light_1372x760.png"))), com.avito.android.profile_phones.utils.a.b(P0.g(new Q("86x48", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_86x48.png"), new Q("172x95", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_172x95.png"), new Q("258x143", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_258x143.png"), new Q("343x190", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_343x190.png"), new Q("429x238", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_429x238.png"), new Q("515x285", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_515x285.png"), new Q("601x333", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_601x333.png"), new Q("686x380", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_686x380.png"), new Q("858x475", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_858x475.png"), new Q("1029x570", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_1029x570.png"), new Q("1201x665", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_1201x665.png"), new Q("1372x760", "https://avito.st/static/ims/1a66358e-fae6-48a1-bcef-2cadd28af550_enableinternetcalls_dark_1372x760.png"))));

    /* compiled from: IacEnableBottomSheetContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacEnableBottomSheetState f227868l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f227869m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f227870n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ v f227871o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f227872p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f227873q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(IacEnableBottomSheetState iacEnableBottomSheetState, Y41.a<G0> aVar, Y41.a<G0> aVar2, v vVar, int i12, int i13) {
            super(2);
            this.f227868l = iacEnableBottomSheetState;
            this.f227869m = aVar;
            this.f227870n = aVar2;
            this.f227871o = vVar;
            this.f227872p = i12;
            this.f227873q = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f227872p | 1);
            Y41.a<G0> aVar = this.f227869m;
            d.a(this.f227868l, aVar, this.f227870n, this.f227871o, a12, iA2, this.f227873q);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState r32, @Y61.k Y41.a<kotlin.G0> r33, @Y61.k Y41.a<kotlin.G0> r34, @Y61.l androidx.compose.ui.v r35, @Y61.l androidx.compose.runtime.A r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.ui.d.a(com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi.entity.IacEnableBottomSheetState, Y41.a, Y41.a, androidx.compose.ui.v, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(@k C22602e c22602e, boolean z12, @k s sVar, @k Y41.a aVar, @k ToggleState toggleState, @l v vVar, @l A a12, int i12) {
        int i13;
        B bE2 = a12.E(-2067155684);
        if ((i12 & 14) == 0) {
            i13 = (bE2.B(c22602e) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= bE2.j(z12) ? 32 : 16;
        }
        if ((i12 & 896) == 0) {
            i13 |= bE2.B(sVar) ? 256 : 128;
        }
        if ((i12 & 7168) == 0) {
            i13 |= bE2.u(aVar) ? 2048 : 1024;
        }
        if ((57344 & i12) == 0) {
            i13 |= bE2.B(toggleState) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((458752 & i12) == 0) {
            i13 |= bE2.B(vVar) ? 131072 : AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;
        }
        int i14 = i13 | 1572864;
        if ((2995931 & i14) == 599186 && bE2.c()) {
            bE2.f();
        } else {
            m.b(c22602e, sVar, C21086w0.c(vVar, toggleState != ToggleState.f63312c, null, null, aVar, 6), null, null, r.c(1558649407, new f(z12, sVar, toggleState, aVar), bE2), bE2, (i14 & 14) | 196608 | ((i14 >> 3) & 112) | ((i14 >> 9) & 7168), 16);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new g(c22602e, z12, sVar, aVar, toggleState, vVar, i12);
        }
    }
}
