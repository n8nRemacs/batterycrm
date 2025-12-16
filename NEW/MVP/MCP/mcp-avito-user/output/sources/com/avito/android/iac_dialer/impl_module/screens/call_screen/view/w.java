package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.view.C22977J;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43108m;
import pK.InterfaceC46970a;
import xK.InterfaceC49851a;

/* compiled from: IacCallScreenViewFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/view/w;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/view/a;", "Lcom/avito/android/iac_dialer/impl_module/screens/call_screen/dialer_mediator/IacCallScreenDialerMediatorState;", VoiceInfo.STATE, "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
@Singleton
/* loaded from: classes14.dex */
public final class w implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC46970a f166348a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49851a f166349b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a f166350c;

    @Inject
    public w(@Y61.k InterfaceC46970a interfaceC46970a, @Y61.k InterfaceC49851a interfaceC49851a, @Y61.k com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a aVar) {
        this.f166348a = interfaceC46970a;
        this.f166349b = interfaceC49851a;
        this.f166350c = aVar;
    }

    @Override // com.avito.android.iac_dialer.impl_module.screens.call_screen.view.a
    @Y61.k
    public final ComposeView a(@Y61.k Context context, @Y61.k C22977J c22977j, @Y61.k Y41.l lVar, @Y61.k String str) {
        e eVar = new e(this, str);
        n nVar = new n(eVar);
        o oVar = new o(eVar);
        f fVar = new f(eVar);
        l lVar2 = new l(eVar);
        i iVar = new i(eVar);
        s sVar = new s(eVar);
        q qVar = new q(eVar);
        p pVar = new p(eVar);
        r rVar = new r(eVar);
        k kVar = new k(eVar);
        j jVar = new j(eVar);
        m mVar = new m(eVar);
        v vVar = v.f166347l;
        u uVar = new u(eVar);
        t tVar = new t(eVar);
        g gVar = new g(eVar);
        h hVar = new h(eVar);
        C43108m c43108mA = A.a(Integer.MAX_VALUE, null, null, 6);
        C43108m c43108mA2 = A.a(Integer.MAX_VALUE, null, null, 6);
        C43108m c43108mA3 = A.a(Integer.MAX_VALUE, null, null, 6);
        C43259k.d(c22977j, null, null, new b(this, str, c43108mA2, c43108mA3, c43108mA, null), 3);
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-67785116, new d(this, str, nVar, oVar, fVar, lVar2, iVar, sVar, qVar, pVar, rVar, kVar, jVar, mVar, c43108mA, vVar, uVar, tVar, c43108mA2, gVar, lVar, c43108mA3, hVar), true));
        return composeView;
    }
}
