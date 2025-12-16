package com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.n2;

/* compiled from: IacFinishedMicRequestScreenViewFactory.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/view/d;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/view/a;", "Lcom/avito/android/iac_dialer_finished/impl_module/screens/finished_mic_request_screen/mvi/entity/IacFinishedMicRequestScreenState;", VoiceInfo.STATE, "_avito_iac-dialer-finished_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
/* loaded from: classes14.dex */
public final class d implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f166816a;

    @Inject
    public d(@k Context context) {
        this.f166816a = context;
    }

    @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_mic_request_screen.view.a
    @k
    public final ComposeView a(@k Context context, @k n2 n2Var, @k Y41.a aVar, @k Y41.a aVar2, @k Y41.a aVar3, @k Y41.a aVar4, @k Y41.a aVar5) {
        ComposeView composeView = new ComposeView(context, null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(-1867897771, new c(n2Var, this, aVar, aVar2, aVar3, aVar4, aVar5), true));
        return composeView;
    }
}
