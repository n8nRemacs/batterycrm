package com.avito.android.app.task;

import com.avito.android.analytics.NetworkType;
import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.messenger.analytics.ServerConnectionType;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.util.V2;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.avito.messenger.k0;

/* compiled from: PendingMessageHandler.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.app.task.i1, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28564i1<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f91613b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C28582o1 f91614c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC28598u0 f91615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ LocalMessage f91616e;

    public C28564i1(InterfaceC28598u0 interfaceC28598u0, C28582o1 c28582o1, LocalMessage localMessage, AtomicInteger atomicInteger) {
        this.f91613b = atomicInteger;
        this.f91614c = c28582o1;
        this.f91615d = interfaceC28598u0;
        this.f91616e = localMessage;
    }

    @Override // l41.g
    public final void accept(Object obj) throws InterruptedException {
        MessageType messageType;
        ServerConnectionType serverConnectionType;
        int iIncrementAndGet = this.f91613b.incrementAndGet();
        C28582o1 c28582o1 = this.f91614c;
        c28582o1.getClass();
        V2 v22 = V2.f318762a;
        StringBuilder sbJ = androidx.camera.camera2.internal.G.j(iIncrementAndGet, "Started sending message attempt #", ": ");
        StringBuilder sb2 = new StringBuilder("LocalMessage(localId='");
        LocalMessage localMessage = this.f91616e;
        sb2.append(localMessage.getLocalId());
        sb2.append("', remoteId='");
        sb2.append(localMessage.getRemoteId());
        sb2.append("', channelId='");
        sb2.append(localMessage.getChannelId());
        sb2.append("', fromId='");
        sb2.append(localMessage.getFromId());
        sb2.append("')");
        sbJ.append(sb2.toString());
        v22.c("PendingMessageHandler", sbJ.toString(), null);
        if (iIncrementAndGet == 1) {
            this.f91615d.a();
        }
        String strA = c28582o1.f91677j.a();
        String channelId = localMessage.getChannelId();
        MessageBody body = localMessage.getBody();
        if (body instanceof MessageBody.ItemReference ? true : body instanceof MessageBody.Item) {
            messageType = MessageType.f186200d;
        } else {
            if (body instanceof MessageBody.LocalImage ? true : body instanceof MessageBody.ImageReference ? true : body instanceof MessageBody.ImageBody) {
                messageType = MessageType.f186201e;
            } else if (body instanceof MessageBody.Link) {
                messageType = MessageType.f186203g;
            } else if (body instanceof MessageBody.Location) {
                messageType = MessageType.f186202f;
            } else if (body instanceof MessageBody.Text.Regular) {
                messageType = ((MessageBody.Text.Regular) localMessage.getBody()).getSuggestedTemplates() != null ? MessageType.f186204h : MessageType.f186199c;
            } else if (body instanceof MessageBody.File) {
                messageType = MessageType.f186205i;
            } else if (body instanceof MessageBody.Video) {
                messageType = MessageType.f186206j;
            } else if (body instanceof MessageBody.Voice) {
                messageType = MessageType.f186207k;
            } else {
                if (!(body instanceof MessageBody.Text.Reaction ? true : body instanceof MessageBody.Call ? true : body instanceof MessageBody.AppCall ? true : body instanceof MessageBody.Deleted ? true : body instanceof MessageBody.Unknown ? true : body instanceof MessageBody.SystemMessageBody.Platform ? true : body instanceof MessageBody.SystemMessageBody.Text ? true : body instanceof MessageBody.SystemMessageBody.Unknown)) {
                    throw new NoWhenBranchMatchedException();
                }
                messageType = MessageType.f186199c;
            }
        }
        MessageType messageType2 = messageType;
        String localId = localMessage.getLocalId();
        NetworkType networkType = NetworkType.f89666d;
        boolean z12 = !kotlin.jvm.internal.L.f(strA, "NONE");
        ru.avito.messenger.k0 k0VarD = c28582o1.f91668a.state().d();
        if (k0VarD instanceof k0.a) {
            serverConnectionType = ServerConnectionType.f186249d;
        } else {
            if (!(k0VarD instanceof k0.b ? true : k0VarD instanceof k0.c)) {
                throw new NoWhenBranchMatchedException();
            }
            serverConnectionType = ServerConnectionType.f186248c;
        }
        c28582o1.f91676i.c(new com.avito.android.messenger.analytics.c0(channelId, messageType2, localId, z12, strA, serverConnectionType));
    }
}
