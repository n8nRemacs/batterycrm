package com.avito.android.messenger.blacklist.mvi.di;

import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.messenger.blacklist.mvi.BlacklistFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: BlacklistFragmentComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/di/c;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: BlacklistFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/blacklist/mvi/di/c$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k d dVar);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        c build();

        @h31.b
        @Y61.k
        a c(@Y61.k BlacklistFragment blacklistFragment);
    }

    void a(@Y61.k BlacklistFragment blacklistFragment);
}
