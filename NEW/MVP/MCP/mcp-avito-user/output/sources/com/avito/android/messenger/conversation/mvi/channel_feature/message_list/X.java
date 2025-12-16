package com.avito.android.messenger.conversation.mvi.channel_feature.message_list;

import com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a;
import kotlin.Metadata;

/* compiled from: MessageListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "prev", "cur", "", "invoke", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class X extends kotlin.jvm.internal.N implements Y41.p<InterfaceC31987a.C5631a, InterfaceC31987a.C5631a, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ G0 f189904l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public X(G0 g02) {
        super(2);
        this.f189904l = g02;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    @Override // Y41.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a r5, com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a r6) {
        /*
            r4 = this;
            com.avito.android.messenger.conversation.mvi.context.a$a r5 = (com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a) r5
            com.avito.android.messenger.conversation.mvi.context.a$a r6 = (com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a) r6
            com.avito.android.mvi.b<com.avito.android.remote.model.messenger.Channel> r0 = r5.f190237b
            boolean r1 = r0 instanceof com.avito.android.mvi.b.a
            ru.avito.messenger.MessengerUserHashInfo r2 = r6.f190236a
            ru.avito.messenger.MessengerUserHashInfo r5 = r5.f190236a
            com.avito.android.mvi.b<com.avito.android.remote.model.messenger.Channel> r6 = r6.f190237b
            if (r1 != 0) goto L1c
            boolean r1 = r0 instanceof com.avito.android.mvi.b.c
            if (r1 == 0) goto L2e
            java.lang.String r1 = r5.f430682d
            boolean r1 = kotlin.text.C43066x.K(r1)
            if (r1 == 0) goto L2e
        L1c:
            boolean r1 = r6 instanceof com.avito.android.mvi.b.a
            if (r1 != 0) goto La7
            boolean r1 = r6 instanceof com.avito.android.mvi.b.c
            if (r1 == 0) goto L2e
            java.lang.String r1 = r2.f430682d
            boolean r1 = kotlin.text.C43066x.K(r1)
            if (r1 == 0) goto L2e
            goto La7
        L2e:
            boolean r1 = r0 instanceof com.avito.android.mvi.b.C6174b
            if (r1 == 0) goto L36
            boolean r1 = r6 instanceof com.avito.android.mvi.b.C6174b
            if (r1 != 0) goto La7
        L36:
            com.avito.android.messenger.conversation.mvi.channel_feature.message_list.G0 r1 = r4.f189904l
            r1.getClass()
            boolean r1 = r0 instanceof com.avito.android.mvi.b.d
            r3 = 0
            if (r1 == 0) goto L43
            com.avito.android.mvi.b$d r0 = (com.avito.android.mvi.b.d) r0
            goto L44
        L43:
            r0 = r3
        L44:
            if (r0 == 0) goto L49
            T r0 = r0.f207035a
            goto L4a
        L49:
            r0 = r3
        L4a:
            com.avito.android.remote.model.messenger.Channel r0 = (com.avito.android.remote.model.messenger.Channel) r0
            boolean r1 = r6 instanceof com.avito.android.mvi.b.d
            if (r1 == 0) goto L53
            com.avito.android.mvi.b$d r6 = (com.avito.android.mvi.b.d) r6
            goto L54
        L53:
            r6 = r3
        L54:
            if (r6 == 0) goto L59
            T r6 = r6.f207035a
            goto L5a
        L59:
            r6 = r3
        L5a:
            com.avito.android.remote.model.messenger.Channel r6 = (com.avito.android.remote.model.messenger.Channel) r6
            if (r0 == 0) goto La5
            if (r6 != 0) goto L61
            goto La5
        L61:
            java.lang.String r1 = r5.f430682d
            boolean r1 = kotlin.text.C43066x.K(r1)
            if (r1 != 0) goto L6a
            goto L6b
        L6a:
            r5 = r3
        L6b:
            java.lang.String r1 = r2.f430682d
            boolean r1 = kotlin.text.C43066x.K(r1)
            if (r1 != 0) goto L74
            goto L75
        L74:
            r2 = r3
        L75:
            boolean r5 = kotlin.jvm.internal.L.f(r5, r2)
            if (r5 != 0) goto L7c
            goto La5
        L7c:
            com.avito.android.remote.model.messenger.context.ChannelContext r5 = r0.getContext()
            com.avito.android.remote.model.messenger.context.ChannelContext r1 = r6.getContext()
            boolean r5 = kotlin.jvm.internal.L.f(r5, r1)
            if (r5 == 0) goto La5
            java.util.List r5 = r0.getUsers()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Set r5 = kotlin.collections.C42745f0.P0(r5)
            java.util.List r6 = r6.getUsers()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Set r6 = kotlin.collections.C42745f0.P0(r6)
            boolean r5 = kotlin.jvm.internal.L.f(r5, r6)
            if (r5 == 0) goto La5
            goto La7
        La5:
            r5 = 0
            goto La8
        La7:
            r5 = 1
        La8:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.channel_feature.message_list.X.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
