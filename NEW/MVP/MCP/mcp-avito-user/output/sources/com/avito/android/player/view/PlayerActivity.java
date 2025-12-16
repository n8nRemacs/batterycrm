package com.avito.android.player.view;

import Y61.l;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.player.di.d;
import com.avito.android.player.router.PlayerArguments;
import com.avito.android.rec.ScreenSource;
import com.avito.android.util.C35974x2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: PlayerActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/player/view/PlayerActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "b", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PlayerActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.a {

    /* compiled from: PlayerActivity.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/avito/android/player/view/PlayerActivity$a;", "", "<init>", "()V", "", "KEY_ANALYTICS_PARAMETERS", "Ljava/lang/String;", "KEY_BLOCK_TYPE", "KEY_PLAYER_RESIZE_MODE", "KEY_PLAYER_SCREEN_SOURCE", "KEY_SESSION", "KEY_SLUG", "KEY_URL", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: PlayerActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/player/view/PlayerActivity$b;", "", "<init>", "()V", "_avito_player_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
    }

    static {
        new a(null);
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.fragment_container;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@l Bundle bundle) {
        d.a aVarA = com.avito.android.player.di.a.a();
        aVarA.a((com.avito.android.player.di.e) C29972i.a(C29972i.b(this), com.avito.android.player.di.e.class));
        aVarA.build();
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            Fragment fragmentH = getSupportFragmentManager().H("PlayerFragment");
            if ((fragmentH instanceof PlayerFragment ? (PlayerFragment) fragmentH : null) == null) {
                String stringExtra = getIntent().getStringExtra("player_url");
                if (stringExtra == null) {
                    throw new IllegalStateException("");
                }
                Bundle extras = getIntent().getExtras();
                TreeClickStreamParent treeClickStreamParent = extras != null ? (TreeClickStreamParent) extras.getParcelable("treeAnalyticsParent") : null;
                ScreenSource screenSource = (ScreenSource) getIntent().getParcelableExtra("player_screen_source");
                if (screenSource == null) {
                    screenSource = ScreenSource.EMPTY.f251779d;
                }
                PlayerArguments playerArguments = new PlayerArguments(stringExtra, getIntent().getStringExtra("player_slug"), getIntent().getStringExtra("player_block_type"), getIntent().getStringExtra("player_session"), treeClickStreamParent, screenSource, C35974x2.b(getIntent(), "player_resize_mode"), (PlayerAnalyticsParameters) getIntent().getParcelableExtra("analyrics_parameters"), null, null, 768, null);
                PlayerFragment.f220234F0.getClass();
                PlayerFragment playerFragment = new PlayerFragment();
                playerFragment.f220245x0.setValue(playerFragment, PlayerFragment.f220235G0[0], playerArguments);
                H hE2 = getSupportFragmentManager().e();
                hE2.j(R.id.fragment_container, playerFragment, "PlayerFragment", 1);
                hE2.f();
            }
        }
    }
}
