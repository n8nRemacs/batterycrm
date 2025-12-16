package com.avito.android.messenger.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.messenger.conversation.ChannelFragment;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.messenger.conversation.mvi.context.d0;
import com.avito.android.messenger.conversation.mvi.send.SendMessagePresenter;
import com.avito.android.permissions.C33032b;
import h31.k;
import kotlin.Metadata;

/* compiled from: ChannelFragmentComponent.kt */
@com.avito.android.di.B
@h31.k
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/di/d;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.messenger.di.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC32428d {

    /* compiled from: ChannelFragmentComponent.kt */
    @k.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/di/d$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.di.d$a */
    public interface a {
        @Y61.k
        InterfaceC32428d a(@h31.b @Y61.k ChannelFragment channelFragment, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k Resources resources, @h31.b @Y61.k com.avito.android.messenger.conversation.W1 w12, @h31.b @Y61.k OpenedFrom openedFrom, @h31.b @Y61.k SendMessagePresenter.State state, @h31.b @Y61.k InterfaceC31987a.C5631a c5631a, @h31.b @Y61.k d0.c.a aVar, @h31.b @Y61.k C33032b c33032b, @h31.b @Y61.k com.avito.android.messenger.conversation.A1 a12, @w2 @h31.b @Y61.k String str, @h31.b @F0 @Y61.k String str2, @h31.b @Y61.k @z2 String str3, @InterfaceC32519z0 @h31.b @Y61.k String str4, @h31.b @Y61.k @A0 String str5);
    }

    void a(@Y61.k ChannelFragment channelFragment);
}
