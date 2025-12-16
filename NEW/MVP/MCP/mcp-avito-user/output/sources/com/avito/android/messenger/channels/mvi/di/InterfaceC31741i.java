package com.avito.android.messenger.channels.mvi.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.messenger.channels.mvi.di.InterfaceC31746n;
import com.avito.android.messenger.channels.mvi.view.ChannelsFragment;
import com.avito.android.messenger.di.o2;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;
import oW.InterfaceC44697a;

/* compiled from: ChannelsComponent.kt */
@com.avito.android.di.B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/di/i;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* renamed from: com.avito.android.messenger.channels.mvi.di.i, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC31741i {

    /* compiled from: ChannelsComponent.kt */
    @d.a
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/channels/mvi/di/i$a;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.di.i$a */
    public interface a {
        @Y61.k
        a a(@Y61.k InterfaceC39417a interfaceC39417a);

        @h31.b
        @Y61.k
        a b(@Y61.k Resources resources);

        @Y61.k
        InterfaceC31741i build();

        @Y61.k
        a c(@Y61.k o2 o2Var);

        @h31.b
        @Y61.k
        a d(@Y61.k ChannelsFragment channelsFragment);

        @Y61.k
        a e(@Y61.k InterfaceC31742j interfaceC31742j);

        @Y61.k
        a f(@Y61.k InterfaceC44697a interfaceC44697a);

        @h31.b
        @Y61.k
        a g(@Y61.k C28478k c28478k);

        @h31.b
        @Y61.k
        a h(@Y61.k ChannelsFragment channelsFragment);

        @Y61.k
        a l(@Y61.k InterfaceC30106l7 interfaceC30106l7);
    }

    @Y61.k
    InterfaceC31746n.a a();

    void b(@Y61.k ChannelsFragment channelsFragment);
}
