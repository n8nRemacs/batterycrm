package com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner;

import Y41.p;
import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.C21086w0;
import androidx.compose.foundation.layout.R1;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.v;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.UniversalImageKt;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: IacEnableTrueBanner.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_profile-phones_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final UniversalImage f228225a = UniversalImageKt.universalImageOf(new Image(P0.g(new Q(new Size(258, 143), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_light_258x143.png")), new Q(new Size(515, 285), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_light_515x285.png")), new Q(new Size(772, 428), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_light_772x428.png")), new Q(new Size(1029, 570), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_light_1029x570.png")))), new Image(P0.g(new Q(new Size(258, 143), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_dark_258x143.png")), new Q(new Size(515, 285), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_dark_515x285.png")), new Q(new Size(772, 428), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_dark_772x428.png")), new Q(new Size(1029, 570), Uri.parse("https://avito.st/static/ims/86d8734e-36e7-4600-bfc9-dbebb5d8f345_callspermissionsenable_dark_1029x570.png")))));

    /* compiled from: IacEnableTrueBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f228226l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ G0 invoke() {
            return G0.f406611a;
        }
    }

    /* compiled from: IacEnableTrueBanner.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ v f228227l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f228228m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f228229n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i12, int i13, Y41.a aVar, v vVar) {
            super(2);
            this.f228227l = vVar;
            this.f228228m = aVar;
            this.f228229n = i13;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(7);
            Y41.a<G0> aVar = this.f228228m;
            g.a(iA2, this.f228229n, aVar, a12, this.f228227l);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(int i12, int i13, @l Y41.a aVar, @l A a12, @l v vVar) {
        Y41.a aVar2;
        int i14;
        Y41.a aVar3;
        B bE2 = a12.E(-266170312);
        int i15 = i13 & 2;
        if (i15 != 0) {
            i14 = i12 | 48;
            aVar2 = aVar;
        } else {
            aVar2 = aVar;
            i14 = (bE2.u(aVar2) ? 32 : 16) | i12;
        }
        if ((i14 & 91) == 18 && bE2.c()) {
            bE2.f();
            aVar3 = aVar2;
        } else {
            aVar3 = i15 != 0 ? a.f228226l : aVar2;
            v vVarC = C21086w0.c(vVar, false, null, null, aVar3, 7);
            com.akita.compose.theme.re23.b.f63983a.getClass();
            com.akita.compose.component.banner.h f66889a = com.akita.compose.theme.re23.b.b(bE2).getF66889a();
            h.a aVar4 = androidx.compose.ui.unit.h.f42849c;
            com.akita.compose.component.banner.h hVarA = com.akita.compose.component.banner.h.a(f66889a, R1.a(14), null, null, null, 16382);
            com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner.b.f228208a.getClass();
            com.akita.compose.component.banner.g.c(hVarA, vVarC, null, null, null, 0.0f, null, com.avito.android.profile_phones.phones_list.phones_list_screen_ui.content.iac_enable_banner.b.f228209b, bE2, com.akita.compose.component.banner.h.f60462o | 12582912, 124);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12, i13, aVar3, vVar);
        }
    }
}
