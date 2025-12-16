package ru.avito.messenger.api.entity;

import X81.v;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.PlatformSupport;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import ru.avito.messenger.api.entity.body.MessageBody;

/* compiled from: ChatMessage.kt */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001:\u0002?@B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b$\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\"\u001a\u0004\b%\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b)\u0010\u001aR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010-\u001a\u0004\b\f\u0010.R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b6\u00107R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00108\u001a\u0004\b9\u0010:R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\b<\u0010=R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010/\u001a\u0004\b>\u00101¨\u0006A"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage;", "LX81/v;", "", "id", "uid", "channelId", "Lru/avito/messenger/api/entity/body/MessageBody;", "body", "fromId", "", "created", "", "isRead", "readTimeStamp", "Lru/avito/messenger/api/entity/ChatMessage$PartialChannel;", "channel", "Lru/avito/messenger/api/entity/ChatMessage$Preview;", MessageSuggest.PREVIEW, "Lcom/avito/android/remote/model/messenger/PlatformSupport;", PlatformActions.PLATFORM_SUPPORT, "Lru/avito/messenger/api/entity/Quote;", "quote", "initActionTimestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/body/MessageBody;Ljava/lang/String;JZLjava/lang/Long;Lru/avito/messenger/api/entity/ChatMessage$PartialChannel;Lru/avito/messenger/api/entity/ChatMessage$Preview;Lcom/avito/android/remote/model/messenger/PlatformSupport;Lru/avito/messenger/api/entity/Quote;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getUid", "getChannelId", "Lru/avito/messenger/api/entity/body/MessageBody;", "getBody", "()Lru/avito/messenger/api/entity/body/MessageBody;", "getFromId", "J", "getCreated", "()J", "Z", "()Z", "Ljava/lang/Long;", "getReadTimeStamp", "()Ljava/lang/Long;", "Lru/avito/messenger/api/entity/ChatMessage$PartialChannel;", "getChannel", "()Lru/avito/messenger/api/entity/ChatMessage$PartialChannel;", "Lru/avito/messenger/api/entity/ChatMessage$Preview;", "getPreview", "()Lru/avito/messenger/api/entity/ChatMessage$Preview;", "Lcom/avito/android/remote/model/messenger/PlatformSupport;", "getPlatformSupport", "()Lcom/avito/android/remote/model/messenger/PlatformSupport;", "Lru/avito/messenger/api/entity/Quote;", "getQuote", "()Lru/avito/messenger/api/entity/Quote;", "getInitActionTimestamp", "PartialChannel", "Preview", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class ChatMessage implements v {

    @k
    private final MessageBody body;

    @l
    private final PartialChannel channel;

    @k
    private final String channelId;
    private final long created;

    @k
    private final String fromId;

    @k
    private final String id;

    @l
    private final Long initActionTimestamp;
    private final boolean isRead;

    @l
    private final PlatformSupport platformSupport;

    @l
    private final Preview preview;

    @l
    private final Quote quote;

    @l
    private final Long readTimeStamp;

    @k
    private final String uid;

    /* compiled from: ChatMessage.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage$PartialChannel;", "", "", "updated", "", "", "tags", "<init>", "(JLjava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "J", "getUpdated", "()J", "Ljava/util/List;", "getTags", "()Ljava/util/List;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class PartialChannel {

        @c("tags")
        @l
        private final List<String> tags;

        @c("updated")
        private final long updated;

        public PartialChannel(long j12, @l List<String> list) {
            this.updated = j12;
            this.tags = list;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PartialChannel)) {
                return false;
            }
            PartialChannel partialChannel = (PartialChannel) other;
            return this.updated == partialChannel.updated && L.f(this.tags, partialChannel.tags);
        }

        public final long getUpdated() {
            return this.updated;
        }

        public int hashCode() {
            int iHashCode = Long.hashCode(this.updated) * 31;
            List<String> list = this.tags;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("PartialChannel(updated=");
            sb2.append(this.updated);
            sb2.append(", tags=");
            return H.p(sb2, this.tags, ')');
        }
    }

    /* compiled from: ChatMessage.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/avito/messenger/api/entity/ChatMessage$Preview;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getText", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Preview {

        @c("text")
        @k
        private final String text;

        public Preview(@k String str) {
            this.text = str;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Preview) && L.f(this.text, ((Preview) other).text);
        }

        @k
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            return this.text.hashCode();
        }

        @k
        public String toString() {
            return C22026a.c(new StringBuilder("Preview(text="), this.text, ')');
        }
    }

    public ChatMessage(@k String str, @k String str2, @k String str3, @k MessageBody messageBody, @k String str4, long j12, boolean z12, @l Long l12, @l PartialChannel partialChannel, @l Preview preview, @l PlatformSupport platformSupport, @l Quote quote, @l Long l13) {
        this.id = str;
        this.uid = str2;
        this.channelId = str3;
        this.body = messageBody;
        this.fromId = str4;
        this.created = j12;
        this.isRead = z12;
        this.readTimeStamp = l12;
        this.channel = partialChannel;
        this.preview = preview;
        this.platformSupport = platformSupport;
        this.quote = quote;
        this.initActionTimestamp = l13;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessage)) {
            return false;
        }
        ChatMessage chatMessage = (ChatMessage) other;
        return L.f(this.id, chatMessage.id) && L.f(this.uid, chatMessage.uid) && L.f(this.channelId, chatMessage.channelId) && L.f(this.body, chatMessage.body) && L.f(this.fromId, chatMessage.fromId) && this.created == chatMessage.created && this.isRead == chatMessage.isRead && L.f(this.readTimeStamp, chatMessage.readTimeStamp) && L.f(this.channel, chatMessage.channel) && L.f(this.preview, chatMessage.preview) && L.f(this.platformSupport, chatMessage.platformSupport) && L.f(this.quote, chatMessage.quote) && L.f(this.initActionTimestamp, chatMessage.initActionTimestamp);
    }

    @k
    public final MessageBody getBody() {
        return this.body;
    }

    @l
    public final PartialChannel getChannel() {
        return this.channel;
    }

    @Override // X81.h
    @k
    public String getChannelId() {
        return this.channelId;
    }

    public final long getCreated() {
        return this.created;
    }

    @Override // X81.v
    @k
    public String getFromId() {
        return this.fromId;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final Long getInitActionTimestamp() {
        return this.initActionTimestamp;
    }

    @l
    public final PlatformSupport getPlatformSupport() {
        return this.platformSupport;
    }

    @l
    public final Preview getPreview() {
        return this.preview;
    }

    @l
    public final Quote getQuote() {
        return this.quote;
    }

    @l
    public final Long getReadTimeStamp() {
        return this.readTimeStamp;
    }

    @k
    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int i12 = r.i(r.g(H.d((this.body.hashCode() + H.d(H.d(this.id.hashCode() * 31, 31, this.uid), 31, this.channelId)) * 31, 31, this.fromId), 31, this.created), 31, this.isRead);
        Long l12 = this.readTimeStamp;
        int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        PartialChannel partialChannel = this.channel;
        int iHashCode2 = (iHashCode + (partialChannel == null ? 0 : partialChannel.hashCode())) * 31;
        Preview preview = this.preview;
        int iHashCode3 = (iHashCode2 + (preview == null ? 0 : preview.hashCode())) * 31;
        PlatformSupport platformSupport = this.platformSupport;
        int iHashCode4 = (iHashCode3 + (platformSupport == null ? 0 : platformSupport.hashCode())) * 31;
        Quote quote = this.quote;
        int iHashCode5 = (iHashCode4 + (quote == null ? 0 : quote.hashCode())) * 31;
        Long l13 = this.initActionTimestamp;
        return iHashCode5 + (l13 != null ? l13.hashCode() : 0);
    }

    /* renamed from: isRead, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ChatMessage(id=");
        sb2.append(this.id);
        sb2.append(", uid=");
        sb2.append(this.uid);
        sb2.append(", channelId=");
        sb2.append(this.channelId);
        sb2.append(", body=");
        sb2.append(this.body);
        sb2.append(", fromId=");
        sb2.append(this.fromId);
        sb2.append(", created=");
        sb2.append(this.created);
        sb2.append(", isRead=");
        sb2.append(this.isRead);
        sb2.append(", readTimeStamp=");
        sb2.append(this.readTimeStamp);
        sb2.append(", channel=");
        sb2.append(this.channel);
        sb2.append(", preview=");
        sb2.append(this.preview);
        sb2.append(", platformSupport=");
        sb2.append(this.platformSupport);
        sb2.append(", quote=");
        sb2.append(this.quote);
        sb2.append(", initActionTimestamp=");
        return m.m(sb2, this.initActionTimestamp, ')');
    }
}
