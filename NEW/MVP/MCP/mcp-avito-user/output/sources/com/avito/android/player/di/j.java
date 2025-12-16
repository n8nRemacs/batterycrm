package com.avito.android.player.di;

import android.content.Context;
import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.player.ExoPlayerController;
import com.avito.android.player.analytics.PlayerAnalyticsInteractor;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.player.tracker.PlayerFragmentScreen;
import com.avito.android.player.view.PlayerGalleryFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: PlayerGalleryFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/player/di/j;", "", "a", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes14.dex */
public interface j {

    /* compiled from: PlayerGalleryFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/di/j$a;", "", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC30106l7 interfaceC30106l7);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        j build();

        @h31.b
        @Y61.k
        a c(@Y61.k r rVar);

        @Y61.k
        a d(@Y61.k g gVar);

        @h31.b
        @Y61.k
        a e(@Y61.k @n Context context);

        @h31.b
        @Y61.k
        a f(@Y61.l PlayerAnalyticsInteractor.State state);

        @h31.b
        @Y61.k
        a g(@Y61.k PlayerArguments playerArguments);

        @h31.b
        @Y61.k
        a h(@Y61.l ExoPlayerController.State state);

        @h31.b
        @Y61.k
        a i(@Y61.k PlayerGalleryFragment playerGalleryFragment);

        @h31.b
        @Y61.k
        a j(@Y61.k PlayerFragmentScreen playerFragmentScreen);
    }

    void a(@Y61.k PlayerGalleryFragment playerGalleryFragment);
}
