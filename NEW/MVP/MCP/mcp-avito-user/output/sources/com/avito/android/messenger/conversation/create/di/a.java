package com.avito.android.messenger.conversation.create.di;

import Y61.k;
import com.avito.android.di.InterfaceC30272y;
import com.avito.android.messenger.conversation.create.CreateChannelFragment;
import com.avito.android.messenger.conversation.create.CreateChannelPresenter;
import h31.d;
import kotlin.Metadata;

/* compiled from: CreateChannelFragmentComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/create/di/a;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC30272y
@h31.d
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CreateChannelFragmentComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/create/di/a$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.conversation.create.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC5590a {
        @h31.b
        @k
        InterfaceC5590a a(@k CreateChannelFragment createChannelFragment);

        @h31.b
        @k
        InterfaceC5590a b(@k CreateChannelPresenter.State state);

        @k
        a build();

        @k
        InterfaceC5590a c(@k b bVar);
    }

    void a(@k CreateChannelFragment createChannelFragment);
}
