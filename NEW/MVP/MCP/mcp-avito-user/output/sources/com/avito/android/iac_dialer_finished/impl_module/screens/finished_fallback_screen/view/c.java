package com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.view;

import Y41.p;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import com.avito.android.R;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_fallback_screen.mvi.entity.IacFinishedFallbackScreenState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.fallback_screen.i;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.fallback_screen.j;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacFinishedFallbackScreenViewFactory.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n2<IacFinishedFallbackScreenState> f166620l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f166621m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166622n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166623o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166624p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166625q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(n2<IacFinishedFallbackScreenState> n2Var, d dVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4) {
        super(2);
        this.f166620l = n2Var;
        this.f166621m = dVar;
        this.f166622n = aVar;
        this.f166623o = aVar2;
        this.f166624p = aVar3;
        this.f166625q = aVar4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            IacFinishedFallbackScreenState iacFinishedFallbackScreenState = (IacFinishedFallbackScreenState) C22126m3.b(this.f166620l, a13).getF42167b();
            d dVar = this.f166621m;
            dVar.getClass();
            boolean zIsVideo = iacFinishedFallbackScreenState.getArgument().isVideo();
            Context context = dVar.f166626a;
            i.a(new j(new IacUICallHeaderState(zIsVideo ? context.getString(R.string.iac_dialer_ui_public___cahh_header___video) : context.getString(R.string.iac_dialer_ui_public___cahh_header___audio)), new IacUIAudioModePeerInfoState(iacFinishedFallbackScreenState.getArgument().getPeerName(), iacFinishedFallbackScreenState.getArgument().getPeerAvatar(), iacFinishedFallbackScreenState.getArgument().getStatus(), false, null, null), new IacUIAudioModeItemInfoState(iacFinishedFallbackScreenState.getArgument().getItemTitle(), iacFinishedFallbackScreenState.getArgument().getItemImage(), iacFinishedFallbackScreenState.getArgument().getItemPrice(), false), iacFinishedFallbackScreenState.getArgument().getGsmLink() != null, iacFinishedFallbackScreenState.getArgument().getIacLink() != null, iacFinishedFallbackScreenState.getArgument().getMessengerLink() != null), b.f166619l, this.f166622n, this.f166623o, this.f166624p, this.f166625q, null, a13, 48);
        }
        return G0.f406611a;
    }
}
