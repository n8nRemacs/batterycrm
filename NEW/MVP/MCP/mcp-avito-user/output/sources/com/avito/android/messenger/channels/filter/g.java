package com.avito.android.messenger.channels.filter;

import android.content.Context;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ChannelsFilterResourceProvider.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/filter/g;", "Lcom/avito/android/messenger/channels/filter/f;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f187157a;

    @Inject
    public g(@Y61.k Context context) {
        this.f187157a = context;
    }

    @Override // com.avito.android.messenger.channels.filter.f
    @Y61.k
    public final String a() {
        return this.f187157a.getString(R.string.messenger_filter_chats_chips_all);
    }

    @Override // com.avito.android.messenger.channels.filter.f
    @Y61.k
    public final String b() {
        return this.f187157a.getString(R.string.messenger_filter_chats_chips_unread);
    }
}
