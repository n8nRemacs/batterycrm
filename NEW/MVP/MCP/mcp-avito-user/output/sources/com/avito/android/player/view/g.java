package com.avito.android.player.view;

import D80.a;
import com.avito.android.analytics.event.native_video.VideoStopReason;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.view.PlayerGalleryFragment;
import com.google.android.exoplayer2.InterfaceC36534o;
import com.google.android.exoplayer2.K;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import kotlin.Metadata;

/* compiled from: PlayerGalleryFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/view/g;", "Lcom/google/android/exoplayer2/K;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g extends K {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlayerGalleryFragment f220310b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ StyledPlayerView f220311c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(InterfaceC36534o interfaceC36534o, PlayerGalleryFragment playerGalleryFragment, StyledPlayerView styledPlayerView) {
        super(interfaceC36534o);
        this.f220310b = playerGalleryFragment;
        this.f220311c = styledPlayerView;
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void E() {
        PlayerGalleryFragment.a aVar = PlayerGalleryFragment.f220264J0;
        this.f220310b.r5().accept(a.h.f2968a);
        super.E();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void pause() {
        PlayerGalleryFragment playerGalleryFragment = this.f220310b;
        if (playerGalleryFragment.f220273H0) {
            j jVarR5 = playerGalleryFragment.r5();
            Double dValueOf = Double.valueOf(getCurrentPosition() / 1000.0d);
            Double dB2 = J80.g.b(this);
            PlayerAnalyticsParameters playerAnalyticsParameters = playerGalleryFragment.q5().f220222i;
            String str = playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null;
            PlayerAnalyticsParameters playerAnalyticsParameters2 = playerGalleryFragment.q5().f220222i;
            jVarR5.accept(new a.e(dValueOf, dB2, str, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220029c : null, playerGalleryFragment.f220267B0 ? VideoStopReason.f90113d : VideoStopReason.f90114e));
            E80.b bVar = playerGalleryFragment.f220271F0;
            if (bVar != null) {
                bVar.f3793c.invoke();
            }
        }
        playerGalleryFragment.f220268C0 = true;
        playerGalleryFragment.f220273H0 = true;
        this.f220311c.setKeepScreenOn(false);
        super.pause();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void play() {
        this.f220311c.setKeepScreenOn(true);
        PlayerGalleryFragment playerGalleryFragment = this.f220310b;
        if (playerGalleryFragment.f220273H0) {
            j jVarR5 = playerGalleryFragment.r5();
            PlayerAnalyticsParameters playerAnalyticsParameters = playerGalleryFragment.q5().f220222i;
            String str = playerAnalyticsParameters != null ? playerAnalyticsParameters.f220028b : null;
            PlayerAnalyticsParameters playerAnalyticsParameters2 = playerGalleryFragment.q5().f220222i;
            jVarR5.accept(new a.f(str, playerAnalyticsParameters2 != null ? playerAnalyticsParameters2.f220029c : null));
        }
        playerGalleryFragment.f220273H0 = true;
        E80.b bVar = playerGalleryFragment.f220271F0;
        if (bVar != null) {
            bVar.f3794d.invoke();
        }
        playerGalleryFragment.f220268C0 = false;
        super.play();
    }

    @Override // com.google.android.exoplayer2.K, com.google.android.exoplayer2.d0
    public final void z() {
        PlayerGalleryFragment.a aVar = PlayerGalleryFragment.f220264J0;
        this.f220310b.r5().accept(a.b.f2957a);
        super.z();
    }
}
