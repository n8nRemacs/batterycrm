package com.avito.android.player.mvi;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;

/* compiled from: PlayerBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/mvi/c;", "Lcom/avito/android/player/ExoPlayerController$a;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements ExoPlayerController.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Z1<PlayerInternalAction> f220139b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC36534o f220140c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f220141d;

    public c(Z1<PlayerInternalAction> z12, InterfaceC36534o interfaceC36534o, e eVar) {
        this.f220139b = z12;
        this.f220140c = interfaceC36534o;
        this.f220141d = eVar;
    }

    @Override // com.avito.android.player.ExoPlayerController.a
    public final void UB(float f12) {
        Z1<PlayerInternalAction> z12;
        do {
            z12 = this.f220139b;
        } while (!z12.N3(z12.getValue(), new PlayerInternalAction.MediaProgressChanged(f12)));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlaybackStateChanged(int i12) {
        PlayerInternalAction value;
        Double dValueOf;
        Double dB2;
        PlayerAnalyticsParameters playerAnalyticsParameters;
        Z1<PlayerInternalAction> z12 = this.f220139b;
        if (i12 == 2) {
            while (!z12.N3(z12.getValue(), new PlayerInternalAction.MediaLoading())) {
            }
            return;
        }
        if (i12 == 3) {
            while (!z12.N3(z12.getValue(), PlayerInternalAction.MediaBecomeReady.f220156b)) {
            }
        } else if (i12 == 4) {
            InterfaceC36534o interfaceC36534o = this.f220140c;
            if (interfaceC36534o == null) {
                return;
            }
            do {
                value = z12.getValue();
                dValueOf = Double.valueOf(interfaceC36534o.getCurrentPosition() / 1000.0d);
                dB2 = J80.g.b(interfaceC36534o);
                playerAnalyticsParameters = this.f220141d.f220144a.f220222i;
            } while (!z12.N3(value, new PlayerInternalAction.MediaFinished(i12, dValueOf, dB2, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null, playerAnalyticsParameters != null ? playerAnalyticsParameters.f220029c : null)));
        }
        while (!z12.N3(z12.getValue(), PlayerInternalAction.MediaLoaded.f220165b)) {
        }
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onPlayerError(@Y61.k PlaybackException playbackException) {
        Z1<PlayerInternalAction> z12;
        do {
            z12 = this.f220139b;
        } while (!z12.N3(z12.getValue(), new PlayerInternalAction.MediaError(playbackException)));
    }

    @Override // com.google.android.exoplayer2.d0.g
    public final void onRenderedFirstFrame() {
        Z1<PlayerInternalAction> z12;
        do {
            z12 = this.f220139b;
        } while (!z12.N3(z12.getValue(), PlayerInternalAction.FirstFrameRendered.f220154b));
    }
}
