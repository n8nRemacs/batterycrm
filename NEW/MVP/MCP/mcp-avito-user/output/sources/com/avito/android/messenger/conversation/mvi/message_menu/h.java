package com.avito.android.messenger.conversation.mvi.message_menu;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.analytics.MessageType;
import com.avito.android.remote.model.messenger.message.LocalMessage;
import com.avito.android.remote.model.messenger.message.MessageBody;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import ru.avito.messenger.MessengerUserHashInfo;

/* compiled from: MessageContextData.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/h;", "", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public static final a f191745j = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MessengerUserHashInfo f191746a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f191747b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f191748c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f191749d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f191750e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f191751f;

    /* renamed from: g, reason: collision with root package name */
    public final long f191752g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final MessageType f191753h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f191754i;

    /* compiled from: MessageContextData.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/message_menu/h$a;", "", "<init>", "()V", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static h a(@Y61.k LocalMessage localMessage) {
            MessageType messageType;
            MessengerUserHashInfo messengerUserHashInfoC = com.avito.android.messenger.util.i.c(localMessage);
            String channelId = localMessage.getChannelId();
            String localId = localMessage.getLocalId();
            String fromId = localMessage.getFromId();
            String remoteId = localMessage.getRemoteId();
            boolean zIsFailed = localMessage.isFailed();
            long created = localMessage.getCreated();
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
            return new h(messengerUserHashInfoC, channelId, localId, fromId, remoteId, zIsFailed, created, messageType, ((localMessage.getBody() instanceof MessageBody.SystemMessageBody.Platform) || (localMessage.getBody() instanceof MessageBody.Text.Reaction)) ? false : true);
        }

        public a() {
        }
    }

    public h(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, boolean z12, long j12, @Y61.k MessageType messageType, boolean z13) {
        this.f191746a = messengerUserHashInfo;
        this.f191747b = str;
        this.f191748c = str2;
        this.f191749d = str3;
        this.f191750e = str4;
        this.f191751f = z12;
        this.f191752g = j12;
        this.f191753h = messageType;
        this.f191754i = z13;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f191746a, hVar.f191746a) && L.f(this.f191747b, hVar.f191747b) && L.f(this.f191748c, hVar.f191748c) && L.f(this.f191749d, hVar.f191749d) && L.f(this.f191750e, hVar.f191750e) && this.f191751f == hVar.f191751f && this.f191752g == hVar.f191752g && this.f191753h == hVar.f191753h && this.f191754i == hVar.f191754i;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(this.f191746a.hashCode() * 31, 31, this.f191747b), 31, this.f191748c), 31, this.f191749d);
        String str = this.f191750e;
        return Boolean.hashCode(this.f191754i) + ((this.f191753h.hashCode() + androidx.appcompat.app.r.g(androidx.appcompat.app.r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f191751f), 31, this.f191752g)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MessageData(userInfo=");
        sb2.append(this.f191746a);
        sb2.append(", channelId=");
        sb2.append(this.f191747b);
        sb2.append(", localId=");
        sb2.append(this.f191748c);
        sb2.append(", fromId=");
        sb2.append(this.f191749d);
        sb2.append(", remoteId=");
        sb2.append(this.f191750e);
        sb2.append(", isFailed=");
        sb2.append(this.f191751f);
        sb2.append(", created=");
        sb2.append(this.f191752g);
        sb2.append(", type=");
        sb2.append(this.f191753h);
        sb2.append(", isSentByUserDirectly=");
        return androidx.appcompat.app.r.x(sb2, this.f191754i, ')');
    }
}
