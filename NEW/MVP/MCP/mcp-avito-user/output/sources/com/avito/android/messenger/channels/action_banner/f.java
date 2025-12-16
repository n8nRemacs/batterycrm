package com.avito.android.messenger.channels.action_banner;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ChannelsBannerShowTimeStorage.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/action_banner/f;", "Lcom/avito/android/messenger/channels/action_banner/e;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SharedPreferences f186731a;

    public f(@Y61.k SharedPreferences sharedPreferences) {
        this.f186731a = sharedPreferences;
    }

    @Override // com.avito.android.messenger.channels.action_banner.e
    public final long a(int i12) {
        return this.f186731a.getLong(AK.c.g(i12, "channels_banner_next_show_time."), 0L);
    }

    @Override // com.avito.android.messenger.channels.action_banner.e
    @SuppressLint({"ApplySharedPref"})
    public final void b(int i12, long j12) {
        this.f186731a.edit().putLong("channels_banner_next_show_time." + i12, j12).commit();
    }
}
