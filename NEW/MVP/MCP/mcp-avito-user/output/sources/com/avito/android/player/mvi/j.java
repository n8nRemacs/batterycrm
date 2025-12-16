package com.avito.android.player.mvi;

import D80.b;
import com.avito.android.arch.mvi.t;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlayerOneTimeEventProducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/mvi/j;", "Lcom/avito/android/arch/mvi/t;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "LD80/b;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements t<PlayerInternalAction, D80.b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PlayerAnalyticsInteractor f220199b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ExoPlayerController f220200c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final J80.b f220201d;

    @Inject
    public j(@Y61.k PlayerAnalyticsInteractor playerAnalyticsInteractor, @Y61.k ExoPlayerController exoPlayerController, @Y61.k J80.b bVar) {
        this.f220199b = playerAnalyticsInteractor;
        this.f220200c = exoPlayerController;
        this.f220201d = bVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final D80.b b(PlayerInternalAction playerInternalAction) {
        PlayerInternalAction playerInternalAction2 = playerInternalAction;
        boolean z12 = playerInternalAction2 instanceof PlayerInternalAction.RetryPressed;
        J80.b bVar = this.f220201d;
        ExoPlayerController exoPlayerController = this.f220200c;
        PlayerAnalyticsInteractor playerAnalyticsInteractor = this.f220199b;
        if (z12) {
            exoPlayerController.e();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.FirstFrameRendered) {
            playerAnalyticsInteractor.a();
            bVar.d();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.PlayPressed) {
            playerAnalyticsInteractor.d();
            PlayerInternalAction.PlayPressed playPressed = (PlayerInternalAction.PlayPressed) playerInternalAction2;
            bVar.c(null, playPressed.f220176b, playPressed.f220177c, true);
        } else if (playerInternalAction2 instanceof PlayerInternalAction.FastForwardPressed) {
            playerAnalyticsInteractor.f();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.RewindPressed) {
            playerAnalyticsInteractor.j();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaBecomeReady) {
            playerAnalyticsInteractor.i();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaFinished) {
            playerAnalyticsInteractor.l();
            PlayerInternalAction.MediaFinished mediaFinished = (PlayerInternalAction.MediaFinished) playerInternalAction2;
            playerAnalyticsInteractor.e(mediaFinished.f220161c, mediaFinished.f220162d);
            bVar.f(null, mediaFinished.f220163e, mediaFinished.f220164f);
        } else if (playerInternalAction2 instanceof PlayerInternalAction.PausedPressed) {
            PlayerInternalAction.PausedPressed pausedPressed = (PlayerInternalAction.PausedPressed) playerInternalAction2;
            playerAnalyticsInteractor.b(pausedPressed.f220171b, pausedPressed.f220172c, pausedPressed.f220175f);
            bVar.c(null, pausedPressed.f220173d, pausedPressed.f220174e, false);
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MutePressed) {
            playerAnalyticsInteractor.g(((PlayerInternalAction.MutePressed) playerInternalAction2).f220169b);
        } else if (playerInternalAction2 instanceof PlayerInternalAction.ViewPaused) {
            exoPlayerController.d();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaProgressChanged) {
            playerAnalyticsInteractor.h(((PlayerInternalAction.MediaProgressChanged) playerInternalAction2).f220168b);
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaLoading) {
            bVar.g();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaLoaded) {
            bVar.b();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.MediaError) {
            playerAnalyticsInteractor.c();
        } else if (playerInternalAction2 instanceof PlayerInternalAction.OnFramesDropped) {
            bVar.e(((PlayerInternalAction.OnFramesDropped) playerInternalAction2).f220170b);
        }
        if (playerInternalAction2 instanceof PlayerInternalAction.PlayerCreated) {
            PlayerInternalAction.PlayerCreated playerCreated = (PlayerInternalAction.PlayerCreated) playerInternalAction2;
            bVar.a(playerCreated.f220179c);
            return new b.d(playerCreated.f220178b);
        }
        if (playerInternalAction2 instanceof PlayerInternalAction.ClosePressed) {
            PlayerInternalAction.ClosePressed closePressed = (PlayerInternalAction.ClosePressed) playerInternalAction2;
            playerAnalyticsInteractor.k(closePressed.f220151b, closePressed.f220152c);
            return b.a.f2970a;
        }
        if (playerInternalAction2 instanceof PlayerInternalAction.FirstFrameRendered) {
            return b.C0151b.f2971a;
        }
        if (playerInternalAction2 instanceof PlayerInternalAction.MediaFinished) {
            return b.c.f2972a;
        }
        return null;
    }
}
