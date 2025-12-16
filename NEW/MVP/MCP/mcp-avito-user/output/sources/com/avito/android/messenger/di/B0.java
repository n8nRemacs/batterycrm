package com.avito.android.messenger.di;

import com.avito.android.messenger.conversation.mvi.sync.IncompleteMessageLoadingWorker;
import h31.d;
import kotlin.Metadata;

/* compiled from: IncompleteMessageLoaderComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/di/B0;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface B0 {

    /* compiled from: IncompleteMessageLoaderComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/B0$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        a a(@Y61.k C0 c02);

        @Y61.k
        B0 build();
    }

    void a(@Y61.k IncompleteMessageLoadingWorker incompleteMessageLoadingWorker);
}
