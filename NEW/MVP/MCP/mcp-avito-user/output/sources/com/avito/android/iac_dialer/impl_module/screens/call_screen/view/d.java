package com.avito.android.iac_dialer.impl_module.screens.call_screen.view;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.dialer_mediator.IacCallScreenDialerMediatorState;
import com.avito.android.iac_dialer_ui.pub.call_screen.IacUICallScreenState;
import com.avito.android.iac_dialer_ui.pub.call_screen.audio_devices_bottom_sheet.IacUIAudioDevicesBottomSheetState;
import com.avito.android.iac_dialer_ui.pub.call_screen.wait_bottom_sheet.IacUIWaitBottomSheetType;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.C43108m;
import okhttp3.internal.http2.Http2Connection;
import pK.InterfaceC46970a;

/* compiled from: IacCallScreenViewFactory.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIWaitBottomSheetType, G0> f166306A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIWaitBottomSheetType, G0> f166307B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIWaitBottomSheetType, G0> f166308C;

    /* renamed from: D, reason: collision with root package name */
    public final /* synthetic */ C43108m f166309D;

    /* renamed from: E, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166310E;

    /* renamed from: F, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUICallScreenState.IdleModeContent.LaunchedAction, G0> f166311F;

    /* renamed from: G, reason: collision with root package name */
    public final /* synthetic */ C43108m f166312G;

    /* renamed from: H, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacUIAudioDevicesBottomSheetState.Device, G0> f166313H;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ w f166314l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f166315m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166316n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166317o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166318p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166319q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166320r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166321s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166322t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166323u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166324v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166325w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f166326x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166327y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C43108m f166328z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(w wVar, String str, Y41.a aVar, Y41.a aVar2, Y41.a aVar3, Y41.a aVar4, Y41.a aVar5, Y41.a aVar6, Y41.a aVar7, Y41.a aVar8, Y41.a aVar9, Y41.a aVar10, Y41.l lVar, Y41.a aVar11, C43108m c43108m, Y41.l lVar2, Y41.l lVar3, Y41.l lVar4, C43108m c43108m2, Y41.a aVar12, Y41.l lVar5, C43108m c43108m3, Y41.l lVar6) {
        super(2);
        this.f166314l = wVar;
        this.f166315m = str;
        this.f166316n = aVar;
        this.f166317o = aVar2;
        this.f166318p = aVar3;
        this.f166319q = aVar4;
        this.f166320r = aVar5;
        this.f166321s = aVar6;
        this.f166322t = aVar7;
        this.f166323u = aVar8;
        this.f166324v = aVar9;
        this.f166325w = aVar10;
        this.f166326x = lVar;
        this.f166327y = aVar11;
        this.f166328z = c43108m;
        this.f166306A = lVar2;
        this.f166307B = lVar3;
        this.f166308C = lVar4;
        this.f166309D = c43108m2;
        this.f166310E = aVar12;
        this.f166311F = lVar5;
        this.f166312G = c43108m3;
        this.f166313H = lVar6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            w wVar = this.f166314l;
            InterfaceC22204y1 interfaceC22204y1B = C22126m3.b(wVar.f166349b.getState(), a13);
            com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166315m, "uiState=" + ((IacCallScreenDialerMediatorState) interfaceC22204y1B.getF42167b()), null);
            IacUICallScreenState callScreenState = ((IacCallScreenDialerMediatorState) interfaceC22204y1B.getF42167b()).getCallScreenState();
            c cVar = new c(0, wVar.f166348a, InterfaceC46970a.class, "get", "get()J", 0);
            com.avito.android.iac_dialer.impl_module.screens.call_screen.video_renderers.a aVar = wVar.f166350c;
            com.avito.android.iac_dialer_ui.pub.call_screen.y.a(callScreenState, cVar, aVar.f166288b, aVar.f166289c, aVar.f166290d, this.f166316n, this.f166317o, this.f166318p, this.f166319q, this.f166320r, this.f166321s, this.f166322t, this.f166323u, this.f166324v, this.f166325w, this.f166326x, this.f166327y, this.f166328z, this.f166306A, this.f166307B, this.f166308C, this.f166309D, this.f166310E, this.f166311F, this.f166312G, this.f166313H, a13, 0, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, 32832);
        }
        return G0.f406611a;
    }
}
