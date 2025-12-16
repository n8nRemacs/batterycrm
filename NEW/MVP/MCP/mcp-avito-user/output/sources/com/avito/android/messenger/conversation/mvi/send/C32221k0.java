package com.avito.android.messenger.conversation.mvi.send;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import kotlin.Metadata;

/* compiled from: SendMessagePresenter.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "it", "", "test", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Z", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.send.k0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32221k0<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final C32221k0<T> f194526b = new C32221k0<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        Boolean boolValueOf;
        com.avito.android.mvi.b<Channel> bVar = ((InterfaceC31987a.C5631a) obj).f190237b;
        if (bVar instanceof b.d) {
            Channel channel = (Channel) ((b.d) bVar).f207035a;
            boolValueOf = Boolean.valueOf((channel.getContext() instanceof ChannelContext.System) && channel.getTags().contains("s"));
        } else {
            boolValueOf = null;
        }
        return kotlin.jvm.internal.L.f(boolValueOf, Boolean.TRUE);
    }
}
