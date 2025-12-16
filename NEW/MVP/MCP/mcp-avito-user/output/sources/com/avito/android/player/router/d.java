package com.avito.android.player.router;

import Y61.k;
import Y61.l;
import android.content.Intent;
import com.avito.android.player.PlayerAnalyticsParameters;
import com.avito.android.rec.ScreenSource;
import kotlin.Metadata;

/* compiled from: PlayerIntentFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/player/router/d;", "", "_avito_player_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface d {

    /* compiled from: PlayerIntentFactory.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    Intent a(@k String str, @l String str2, @l String str3, @l String str4, @k ScreenSource screenSource, @l Integer num, @l PlayerAnalyticsParameters playerAnalyticsParameters);
}
