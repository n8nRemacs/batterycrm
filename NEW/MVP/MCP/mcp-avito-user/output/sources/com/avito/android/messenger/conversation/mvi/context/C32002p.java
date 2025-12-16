package com.avito.android.messenger.conversation.mvi.context;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.messenger.conversation.OpenedFrom;
import com.avito.android.messenger.conversation.W1;
import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import com.avito.android.mvi.b;
import com.avito.android.remote.model.User;
import com.avito.android.remote.model.messenger.Channel;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: ChannelContextInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.messenger.conversation.mvi.context.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32002p<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C31988b f190395b;

    public C32002p(C31988b c31988b) {
        this.f190395b = c31988b;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC31987a.C5631a c5631a = (InterfaceC31987a.C5631a) obj;
        com.avito.android.mvi.b<Channel> bVar = c5631a.f190237b;
        String strO = null;
        if (bVar instanceof b.d) {
            Channel channel = (Channel) ((b.d) bVar).f207035a;
            if (channel.getContext() instanceof ChannelContext.System) {
                List<User> users = channel.getUsers();
                ArrayList arrayList = new ArrayList(C42745f0.q(users, 10));
                Iterator<T> it = users.iterator();
                while (it.hasNext()) {
                    arrayList.add(((User) it.next()).getId());
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (!kotlin.jvm.internal.L.f((String) next, c5631a.f190236a.f430682d)) {
                        arrayList2.add(next);
                    }
                }
                strO = C42745f0.O(arrayList2, ",", null, null, null, 62);
            }
        }
        String str = strO;
        C31988b c31988b = this.f190395b;
        InterfaceC28373a interfaceC28373a = c31988b.f190245Z;
        boolean z12 = c31988b.f190247b0 == OpenedFrom.f189129c;
        W1 w12 = c31988b.f190248c0;
        interfaceC28373a.c(new com.avito.android.messenger.analytics.N(w12.f189239b, c31988b.f190241V, w12.f189240c, w12.f189241d, str, z12));
    }
}
