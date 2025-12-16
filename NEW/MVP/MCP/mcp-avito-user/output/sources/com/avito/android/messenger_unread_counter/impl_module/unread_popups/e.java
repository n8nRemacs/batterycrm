package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import android.content.Context;
import com.avito.android.R;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: UnreadMessagesPopupsResourceProvider.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/e;", "Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/d;", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f197750a;

    @Inject
    public e(@Y61.k Context context) {
        this.f197750a = context;
    }

    @Override // com.avito.android.messenger_unread_counter.impl_module.unread_popups.d
    @Y61.k
    public final String a(int i12) {
        return this.f197750a.getResources().getQuantityString(R.plurals.messenger_unread_count_new, i12, Integer.valueOf(i12));
    }
}
