package com.avito.android.player.mvi;

import com.avito.android.arch.mvi.u;
import com.avito.android.player.mvi.entity.PlayerInternalAction;
import com.avito.android.player.mvi.entity.PlayerMviState;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlayerReducer.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/mvi/l;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/player/mvi/entity/PlayerInternalAction;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements u<PlayerInternalAction, PlayerMviState> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final F80.a f220205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.connection_quality.connectivity.a f220206c;

    @Inject
    public l(@Y61.k F80.a aVar, @Y61.k com.avito.android.connection_quality.connectivity.a aVar2) {
        this.f220205b = aVar;
        this.f220206c = aVar2;
    }

    @Override // com.avito.android.arch.mvi.u
    public final PlayerMviState a(PlayerInternalAction playerInternalAction, PlayerMviState playerMviState) {
        PlayerInternalAction playerInternalAction2 = playerInternalAction;
        PlayerMviState playerMviState2 = playerMviState;
        if (playerInternalAction2 instanceof PlayerInternalAction.MediaLoading) {
            return PlayerMviState.Loading.f220186b;
        }
        if (playerInternalAction2 instanceof PlayerInternalAction.MediaLoaded) {
            return !(playerMviState2 instanceof PlayerMviState.Error) ? PlayerMviState.Loaded.f220185b : playerMviState2;
        }
        if (!(playerInternalAction2 instanceof PlayerInternalAction.MediaError)) {
            return playerMviState2;
        }
        boolean zC2 = this.f220206c.c();
        F80.a aVar = this.f220205b;
        return new PlayerMviState.Error(zC2 ? aVar.b() : aVar.a());
    }
}
