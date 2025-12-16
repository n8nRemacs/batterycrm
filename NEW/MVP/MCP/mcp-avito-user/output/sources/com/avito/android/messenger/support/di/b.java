package com.avito.android.messenger.support.di;

import Y61.k;
import android.content.res.Resources;
import com.avito.android.di.B;
import com.avito.android.messenger.support.SupportChatFormFragment;
import h31.d;
import kotlin.Metadata;

/* compiled from: SupportChatFormComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/support/di/b;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SupportChatFormComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/support/di/b$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        a a(@k c cVar);

        @h31.b
        @k
        a b(@k Resources resources);

        @k
        b build();

        @h31.b
        @k
        a c(int i12);

        @h31.b
        @k
        a d(@k SupportChatFormFragment supportChatFormFragment);
    }

    void a(@k SupportChatFormFragment supportChatFormFragment);
}
