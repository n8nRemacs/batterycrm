package ru.avito.messenger.api.entity;

import W81.a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import ru.avito.messenger.api.entity.context.ChannelContext;

/* compiled from: Channel.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b*\b\u0086\b\u0018\u00002\u00020\u0001BÉ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#Jò\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010*\u001a\u00020\u00112\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010#R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010/\u001a\u0004\b0\u00101R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b6\u00107R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00105\u001a\u0004\b8\u00107R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b\u0012\u0010@R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b\u0013\u0010@R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010?\u001a\u0004\b\u0014\u0010@R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010?\u001a\u0004\b\u0015\u0010@R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\bA\u00104R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010B\u001a\u0004\bC\u0010DR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010,\u001a\u0004\bE\u0010#R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\bF\u0010#R\u001a\u0010\u001c\u001a\u00020\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010G\u001a\u0004\bH\u0010IR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010J\u001a\u0004\bK\u0010LR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010M\u001a\u0004\bN\u0010O¨\u0006P"}, d2 = {"Lru/avito/messenger/api/entity/Channel;", "", "", "channelId", "type", "Lru/avito/messenger/api/entity/ChatMessage;", "lastMessage", "", "Lru/avito/messenger/api/entity/ChannelUser;", "users", "", "created", "updated", "Lru/avito/messenger/api/entity/context/ChannelContext;", "context", "Lru/avito/messenger/api/entity/ReadOnlyState;", "readOnlyState", "", "isDeleted", "isRead", "isSpam", "isAnswered", "tags", "LW81/a;", MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, MessageBody.SystemMessageBody.Platform.FLOW, "suspectMessageId", "Lru/avito/messenger/api/entity/ChannelInfo;", RequestReviewResultKt.INFO_TYPE, "Lru/avito/messenger/api/entity/InputState;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "pinOrder", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/ChatMessage;Ljava/util/List;JJLru/avito/messenger/api/entity/context/ChannelContext;Lru/avito/messenger/api/entity/ReadOnlyState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;LW81/a;Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/ChannelInfo;Lru/avito/messenger/api/entity/InputState;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/ChatMessage;Ljava/util/List;JJLru/avito/messenger/api/entity/context/ChannelContext;Lru/avito/messenger/api/entity/ReadOnlyState;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;LW81/a;Ljava/lang/String;Ljava/lang/String;Lru/avito/messenger/api/entity/ChannelInfo;Lru/avito/messenger/api/entity/InputState;Ljava/lang/Long;)Lru/avito/messenger/api/entity/Channel;", "", "hashCode", "()I", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChannelId", "getType", "Lru/avito/messenger/api/entity/ChatMessage;", "getLastMessage", "()Lru/avito/messenger/api/entity/ChatMessage;", "Ljava/util/List;", "getUsers", "()Ljava/util/List;", "J", "getCreated", "()J", "getUpdated", "Lru/avito/messenger/api/entity/context/ChannelContext;", "getContext", "()Lru/avito/messenger/api/entity/context/ChannelContext;", "Lru/avito/messenger/api/entity/ReadOnlyState;", "getReadOnlyState", "()Lru/avito/messenger/api/entity/ReadOnlyState;", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "getTags", "LW81/a;", "getContextActions", "()LW81/a;", "getFlow", "getSuspectMessageId", "Lru/avito/messenger/api/entity/ChannelInfo;", "getInfo", "()Lru/avito/messenger/api/entity/ChannelInfo;", "Lru/avito/messenger/api/entity/InputState;", "getInputState", "()Lru/avito/messenger/api/entity/InputState;", "Ljava/lang/Long;", "getPinOrder", "()Ljava/lang/Long;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class Channel {

    @c("channelId")
    @k
    private final String channelId;

    @c("context")
    @k
    private final ChannelContext context;

    @c(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS)
    @l
    private final a contextActions;

    @c("created")
    private final long created;

    @c(MessageBody.SystemMessageBody.Platform.FLOW)
    @l
    private final String flow;

    @c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final ChannelInfo info;

    @c(MessageBody.SystemMessageBody.Platform.INPUT_STATE)
    @l
    private final InputState inputState;

    @c("isAnswered")
    @l
    private final Boolean isAnswered;

    @c("isDeleted")
    @l
    private final Boolean isDeleted;

    @c("isRead")
    @l
    private final Boolean isRead;

    @c("isSpam")
    @l
    private final Boolean isSpam;

    @c("lastMessage")
    @l
    private final ChatMessage lastMessage;

    @c("pinOrder")
    @l
    private final Long pinOrder;

    @c("readOnly")
    @l
    private final ReadOnlyState readOnlyState;

    @c("suspectMessageId")
    @l
    private final String suspectMessageId;

    @c("tags")
    @l
    private final List<String> tags;

    @c("type")
    @k
    private final String type;

    @c("updated")
    private final long updated;

    @c("users")
    @k
    private final List<ChannelUser> users;

    public Channel(@k String str, @k String str2, @l ChatMessage chatMessage, @k List<ChannelUser> list, long j12, long j13, @k ChannelContext channelContext, @l ReadOnlyState readOnlyState, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l List<String> list2, @l a aVar, @l String str3, @l String str4, @k ChannelInfo channelInfo, @l InputState inputState, @l Long l12) {
        this.channelId = str;
        this.type = str2;
        this.lastMessage = chatMessage;
        this.users = list;
        this.created = j12;
        this.updated = j13;
        this.context = channelContext;
        this.readOnlyState = readOnlyState;
        this.isDeleted = bool;
        this.isRead = bool2;
        this.isSpam = bool3;
        this.isAnswered = bool4;
        this.tags = list2;
        this.contextActions = aVar;
        this.flow = str3;
        this.suspectMessageId = str4;
        this.info = channelInfo;
        this.inputState = inputState;
        this.pinOrder = l12;
    }

    @k
    public final Channel copy(@k String channelId, @k String type, @l ChatMessage lastMessage, @k List<ChannelUser> users, long created, long updated, @k ChannelContext context, @l ReadOnlyState readOnlyState, @l Boolean isDeleted, @l Boolean isRead, @l Boolean isSpam, @l Boolean isAnswered, @l List<String> tags, @l a contextActions, @l String flow, @l String suspectMessageId, @k ChannelInfo info, @l InputState inputState, @l Long pinOrder) {
        return new Channel(channelId, type, lastMessage, users, created, updated, context, readOnlyState, isDeleted, isRead, isSpam, isAnswered, tags, contextActions, flow, suspectMessageId, info, inputState, pinOrder);
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Channel)) {
            return false;
        }
        Channel channel = (Channel) other;
        return L.f(this.channelId, channel.channelId) && L.f(this.type, channel.type) && L.f(this.lastMessage, channel.lastMessage) && L.f(this.users, channel.users) && this.created == channel.created && this.updated == channel.updated && L.f(this.context, channel.context) && L.f(this.readOnlyState, channel.readOnlyState) && L.f(this.isDeleted, channel.isDeleted) && L.f(this.isRead, channel.isRead) && L.f(this.isSpam, channel.isSpam) && L.f(this.isAnswered, channel.isAnswered) && L.f(this.tags, channel.tags) && L.f(this.contextActions, channel.contextActions) && L.f(this.flow, channel.flow) && L.f(this.suspectMessageId, channel.suspectMessageId) && L.f(this.info, channel.info) && L.f(this.inputState, channel.inputState) && L.f(this.pinOrder, channel.pinOrder);
    }

    @k
    public final String getChannelId() {
        return this.channelId;
    }

    @k
    public final ChannelContext getContext() {
        return this.context;
    }

    @l
    public final a getContextActions() {
        return this.contextActions;
    }

    public final long getCreated() {
        return this.created;
    }

    @l
    public final String getFlow() {
        return this.flow;
    }

    @k
    public final ChannelInfo getInfo() {
        return this.info;
    }

    @l
    public final InputState getInputState() {
        return this.inputState;
    }

    @l
    public final ChatMessage getLastMessage() {
        return this.lastMessage;
    }

    @l
    public final Long getPinOrder() {
        return this.pinOrder;
    }

    @l
    public final ReadOnlyState getReadOnlyState() {
        return this.readOnlyState;
    }

    @l
    public final String getSuspectMessageId() {
        return this.suspectMessageId;
    }

    @l
    public final List<String> getTags() {
        return this.tags;
    }

    @k
    public final String getType() {
        return this.type;
    }

    public final long getUpdated() {
        return this.updated;
    }

    @k
    public final List<ChannelUser> getUsers() {
        return this.users;
    }

    public int hashCode() {
        int iD2 = H.d(this.channelId.hashCode() * 31, 31, this.type);
        ChatMessage chatMessage = this.lastMessage;
        int iHashCode = (this.context.hashCode() + r.g(r.g(H.e((iD2 + (chatMessage == null ? 0 : chatMessage.hashCode())) * 31, 31, this.users), 31, this.created), 31, this.updated)) * 31;
        ReadOnlyState readOnlyState = this.readOnlyState;
        int iHashCode2 = (iHashCode + (readOnlyState == null ? 0 : readOnlyState.hashCode())) * 31;
        Boolean bool = this.isDeleted;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isRead;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isSpam;
        int iHashCode5 = (iHashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isAnswered;
        int iHashCode6 = (iHashCode5 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        a aVar = this.contextActions;
        int iHashCode8 = (iHashCode7 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str = this.flow;
        int iHashCode9 = (iHashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.suspectMessageId;
        int iHashCode10 = (this.info.hashCode() + ((iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        InputState inputState = this.inputState;
        int iHashCode11 = (iHashCode10 + (inputState == null ? 0 : inputState.hashCode())) * 31;
        Long l12 = this.pinOrder;
        return iHashCode11 + (l12 != null ? l12.hashCode() : 0);
    }

    @l
    /* renamed from: isAnswered, reason: from getter */
    public final Boolean getIsAnswered() {
        return this.isAnswered;
    }

    @l
    /* renamed from: isDeleted, reason: from getter */
    public final Boolean getIsDeleted() {
        return this.isDeleted;
    }

    @l
    /* renamed from: isRead, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    @l
    /* renamed from: isSpam, reason: from getter */
    public final Boolean getIsSpam() {
        return this.isSpam;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Channel { id = ");
        sb2.append(this.channelId);
        sb2.append(", updated = ");
        return AK.c.j(this.updated, " }", sb2);
    }

    public /* synthetic */ Channel(String str, String str2, ChatMessage chatMessage, List list, long j12, long j13, ChannelContext channelContext, ReadOnlyState readOnlyState, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, List list2, a aVar, String str3, String str4, ChannelInfo channelInfo, InputState inputState, Long l12, int i12, C42822w c42822w) {
        this(str, str2, chatMessage, list, j12, j13, channelContext, readOnlyState, bool, bool2, bool3, bool4, list2, (i12 & 8192) != 0 ? null : aVar, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str3, (i12 & 32768) != 0 ? null : str4, channelInfo, inputState, l12);
    }
}
