package com.avito.android.player.router;

import Y61.k;
import Y61.l;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.view.PlayerGalleryFragment;
import com.avito.android.rec.ScreenSource;
import com.avito.android.remote.model.Image;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: PlayerGalleryFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/router/a;", "LE80/c;", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a implements E80.c {
    @Inject
    public a() {
    }

    @Override // E80.c
    @k
    public final PlayerGalleryFragment a(@k String str, @k ScreenSource screenSource, @l PlayerAnalyticsParameters playerAnalyticsParameters, @l Image image, @l Boolean bool) {
        PlayerArguments playerArguments = new PlayerArguments(str, null, null, null, null, screenSource, 0, playerAnalyticsParameters, image, bool);
        PlayerGalleryFragment.f220264J0.getClass();
        PlayerGalleryFragment playerGalleryFragment = new PlayerGalleryFragment();
        playerGalleryFragment.f220280s0.setValue(playerGalleryFragment, PlayerGalleryFragment.f220265K0[0], playerArguments);
        return playerGalleryFragment;
    }
}
