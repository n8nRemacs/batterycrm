package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view;

import Y41.p;
import android.content.Context;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import com.avito.android.R;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.mvi.entity.IacFinishedMicRequestScreenState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModeItemInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUIAudioModePeerInfoState;
import com.avito.android.iac_dialer_ui.pub.common_ui.IacUICallHeaderState;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.mic_request_screen.k;
import com.avito.android.iac_dialer_ui.pub.finished_call_screens.mic_request_screen.l;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacFinishedMicRequestScreenViewFactory.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n2<IacFinishedMicRequestScreenState> f166809l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f166810m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166811n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166812o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166813p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166814q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f166815r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(n2<? extends IacFinishedMicRequestScreenState> n2Var, d dVar, Y41.a<G0> aVar, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.a<G0> aVar5) {
        super(2);
        this.f166809l = n2Var;
        this.f166810m = dVar;
        this.f166811n = aVar;
        this.f166812o = aVar2;
        this.f166813p = aVar3;
        this.f166814q = aVar4;
        this.f166815r = aVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        l.a bVar;
        l.a aVar;
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            IacFinishedMicRequestScreenState iacFinishedMicRequestScreenState = (IacFinishedMicRequestScreenState) C22126m3.b(this.f166809l, a13).getF42167b();
            d dVar = this.f166810m;
            dVar.getClass();
            boolean zIsVideo = iacFinishedMicRequestScreenState.getArgument().isVideo();
            Context context = dVar.f166816a;
            IacUICallHeaderState iacUICallHeaderState = new IacUICallHeaderState(zIsVideo ? context.getString(R.string.iac_dialer_ui_public___cahh_header___video) : context.getString(R.string.iac_dialer_ui_public___cahh_header___audio));
            IacUIAudioModePeerInfoState iacUIAudioModePeerInfoState = new IacUIAudioModePeerInfoState(iacFinishedMicRequestScreenState.getArgument().getPeerName(), iacFinishedMicRequestScreenState.getArgument().getPeerAvatar(), iacFinishedMicRequestScreenState.getArgument().getStatus(), false, null, null);
            IacUIAudioModeItemInfoState iacUIAudioModeItemInfoState = new IacUIAudioModeItemInfoState(iacFinishedMicRequestScreenState.getArgument().getItemTitle(), iacFinishedMicRequestScreenState.getArgument().getItemImage(), iacFinishedMicRequestScreenState.getArgument().getItemPrice(), false);
            if (iacFinishedMicRequestScreenState instanceof IacFinishedMicRequestScreenState.Initial) {
                aVar = l.a.C4965a.f167716a;
            } else {
                if (iacFinishedMicRequestScreenState instanceof IacFinishedMicRequestScreenState.Requesting) {
                    bVar = new l.a.c(((IacFinishedMicRequestScreenState.Requesting) iacFinishedMicRequestScreenState).getCanAskMic());
                } else {
                    if (!(iacFinishedMicRequestScreenState instanceof IacFinishedMicRequestScreenState.Granted)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bVar = new l.a.b(iacFinishedMicRequestScreenState.getArgument().getIacLink() != null);
                }
                aVar = bVar;
            }
            k.a(new l(iacUICallHeaderState, iacUIAudioModePeerInfoState, iacUIAudioModeItemInfoState, aVar), b.f166808l, this.f166811n, this.f166812o, this.f166813p, this.f166814q, this.f166815r, null, a13, 48);
        }
        return G0.f406611a;
    }
}
