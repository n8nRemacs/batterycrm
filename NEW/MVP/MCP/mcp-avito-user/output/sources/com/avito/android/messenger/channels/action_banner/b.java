package com.avito.android.messenger.channels.action_banner;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ChannelsAutoRepliesBannerStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/b;", "Lcom/avito/android/messenger/channels/action_banner/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f186715a;

    public b(@Y61.k SharedPreferences sharedPreferences) {
        this.f186715a = sharedPreferences;
    }

    @Override // com.avito.android.messenger.channels.action_banner.a
    @SuppressLint({"ApplySharedPref"})
    public final void a(int i12) {
        this.f186715a.edit().putLong(AK.c.g(i12, "channel_auto_replies_banner_show_count_key."), c(i12) + 1).commit();
    }

    @Override // com.avito.android.messenger.channels.action_banner.a
    public final boolean b() {
        return this.f186715a.getBoolean("channel_auto_replies_banner_clicked_key.-5", false);
    }

    @Override // com.avito.android.messenger.channels.action_banner.a
    public final long c(int i12) {
        return this.f186715a.getLong("channel_auto_replies_banner_show_count_key." + i12, 0L);
    }

    @Override // com.avito.android.messenger.channels.action_banner.a
    public final void d(int i12) {
        this.f186715a.edit().putBoolean("channel_auto_replies_banner_clicked_key." + i12, true).commit();
    }
}
