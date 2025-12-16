package com.avito.android.messenger.conversation.mvi.message_menu;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MessageMenuPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/context/a$a;", "contextState", "Larrow/core/Y0;", "Lcom/avito/android/messenger/conversation/mvi/message_menu/m$e;", "apply", "(Lcom/avito/android/messenger/conversation/mvi/context/a$a;)Larrow/core/Y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class q<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f191801b;

    public q(m mVar) {
        this.f191801b = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    @Override // l41.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object apply(java.lang.Object r6) {
        /*
            r5 = this;
            com.avito.android.messenger.conversation.mvi.context.a$a r6 = (com.avito.android.messenger.conversation.mvi.context.InterfaceC31987a.C5631a) r6
            com.avito.android.mvi.b<com.avito.android.remote.model.messenger.Channel> r0 = r6.f190237b
            boolean r1 = r0 instanceof com.avito.android.mvi.b.d
            r2 = 0
            if (r1 == 0) goto L59
            com.avito.android.mvi.b$d r0 = (com.avito.android.mvi.b.d) r0
            T r0 = r0.f207035a
            com.avito.android.remote.model.messenger.Channel r0 = (com.avito.android.remote.model.messenger.Channel) r0
            com.avito.android.messenger.conversation.mvi.message_menu.m r1 = r5.f191801b
            JY.a r1 = r1.f191783Z
            boolean r1 = r1.l()
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L37
            com.avito.android.remote.model.messenger.context.ChannelContext r1 = r0.getContext()
            com.avito.android.remote.model.messenger.attach_menu.AttachMenu r1 = r1.getAttachMenu()
            if (r1 == 0) goto L29
            com.avito.android.remote.model.messenger.attach_menu.AttachMenuItem$Replies r2 = r1.getReplies()
        L29:
            if (r2 != 0) goto L35
            ru.avito.messenger.MessengerUserHashInfo r6 = r6.f190236a
            java.lang.String r6 = r6.f430682d
            boolean r6 = com.avito.android.remote.model.messenger.ChannelKt.hasItemContextAndUserIsSeller(r0, r6)
            if (r6 == 0) goto L37
        L35:
            r6 = r4
            goto L38
        L37:
            r6 = r3
        L38:
            com.avito.android.remote.model.messenger.InputState r1 = r0.getInputState()
            if (r1 == 0) goto L45
            boolean r1 = r1.isDisabled()
            if (r1 != r4) goto L45
            goto L51
        L45:
            com.avito.android.remote.model.messenger.InputState r1 = r0.getInputState()
            if (r1 != 0) goto L52
            com.avito.android.remote.model.messenger.ReadOnlyState r0 = r0.getReadOnlyState()
            if (r0 == 0) goto L52
        L51:
            r3 = r4
        L52:
            r0 = r3 ^ 1
            com.avito.android.messenger.conversation.mvi.message_menu.m$e r2 = new com.avito.android.messenger.conversation.mvi.message_menu.m$e
            r2.<init>(r6, r0)
        L59:
            arrow.core.Y0 r6 = arrow.core.Z0.b(r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.message_menu.q.apply(java.lang.Object):java.lang.Object");
    }
}
