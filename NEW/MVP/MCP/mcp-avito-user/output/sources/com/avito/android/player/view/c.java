package com.avito.android.player.view;

import D80.a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.view.PlayerFragment;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.K;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.Metadata;

/* compiled from: PlayerFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/view/c;", "Lcom/google/android/exoplayer2/K;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends K {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerFragment f220306b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC36534o interfaceC36534o, PlayerFragment playerFragment) {
        super(interfaceC36534o);
        this.f220306b = playerFragment;
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void E() {
        PlayerFragment.a aVar = PlayerFragment.f220234F0;
        this.f220306b.E5().accept(a.h.f2968a);
        super.E();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void pause() {
        PlayerFragment playerFragment = this.f220306b;
        StyledPlayerView styledPlayerView = playerFragment.f220247z0;
        if (styledPlayerView != null) {
            styledPlayerView.setKeepScreenOn(false);
        }
        j jVarE5 = playerFragment.E5();
        Double dValueOf = Double.valueOf(getCurrentPosition() / 1000.0d);
        Double dB2 = J80.g.b(this);
        PlayerAnalyticsParameters playerAnalyticsParameters = playerFragment.D5().f220222i;
        String str = playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null;
        PlayerAnalyticsParameters playerAnalyticsParameters2 = playerFragment.D5().f220222i;
        jVarE5.accept(new a.e(dValueOf, dB2, str, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220029c : null, VideoStopReason.f90114e));
        super.pause();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void play() {
        PlayerFragment playerFragment = this.f220306b;
        StyledPlayerView styledPlayerView = playerFragment.f220247z0;
        if (styledPlayerView != null) {
            styledPlayerView.setKeepScreenOn(true);
        }
        j jVarE5 = playerFragment.E5();
        PlayerAnalyticsParameters playerAnalyticsParameters = playerFragment.D5().f220222i;
        String str = playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null;
        PlayerAnalyticsParameters playerAnalyticsParameters2 = playerFragment.D5().f220222i;
        jVarE5.accept(new a.f(str, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220029c : null));
        super.play();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void z() {
        PlayerFragment.a aVar = PlayerFragment.f220234F0;
        this.f220306b.E5().accept(a.b.f2957a);
        super.z();
    }
}
