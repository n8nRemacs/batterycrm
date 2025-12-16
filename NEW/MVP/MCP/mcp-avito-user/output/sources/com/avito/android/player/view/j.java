package com.avito.android.player.view;

import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.mvi.entity.PlayerMviState;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.i2;

/* compiled from: PlayerViewModel.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/player/view/j;", "Lcom/avito/android/arch/mvi/android/j;", "LD80/a;", "Lcom/avito/android/player/mvi/entity/PlayerMviState;", "LD80/b;", "a", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j extends com.avito.android.arch.mvi.android.j<D80.a, PlayerMviState, D80.b> {

    /* renamed from: P, reason: collision with root package name */
    @Y61.k
    public static final a f220312P = new a(null);

    /* renamed from: N, reason: collision with root package name */
    @Y61.k
    public final PlayerAnalyticsInteractor f220313N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.k
    public final ExoPlayerController f220314O;

    /* compiled from: PlayerViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/player/view/j$a;", "", "<init>", "()V", "", "KEY_PLAYER_ANALYTICS_STATE", "Ljava/lang/String;", "KEY_PLAYER_STATE", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Inject
    public j(@Y61.k com.avito.android.player.mvi.h hVar, @Y61.k PlayerAnalyticsInteractor playerAnalyticsInteractor, @Y61.k ExoPlayerController exoPlayerController) {
        super(hVar, i2.a.b(i2.f411430a, 0L, 2));
        this.f220313N = playerAnalyticsInteractor;
        this.f220314O = exoPlayerController;
    }
}
