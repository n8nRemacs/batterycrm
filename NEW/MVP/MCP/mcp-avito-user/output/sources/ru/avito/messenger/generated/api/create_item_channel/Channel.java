package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import a91.C19706E;
import a91.C19737r;
import a91.InterfaceC19740u;
import a91.j0;
import a91.q0;
import com.avito.android.remote.model.messenger.RequestReviewResultKt;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CreateItemChannelResponse.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b3\u0018\u00002\u00020\u0001:\u0001RBË\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a\u0012\u0006\u0010\"\u001a\u00020\b¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b1\u0010'R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010%\u001a\u0004\b2\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b4\u00105R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\b7\u00108R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00109\u001a\u0004\b:\u0010;R\u001a\u0010\u0012\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\b<\u0010;R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010BR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010C\u001a\u0004\bD\u0010ER\u001a\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010.\u001a\u0004\bF\u00100R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010%\u001a\u0004\bG\u0010'R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010\u001d\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010K\u001a\u0004\bL\u0010MR\u001a\u0010\u001e\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010.\u001a\u0004\bN\u00100R\u001a\u0010\u001f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010%\u001a\u0004\bO\u0010'R\"\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010H\u001a\u0004\bP\u0010JR\u001a\u0010\"\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010.\u001a\u0004\bQ\u00100¨\u0006S"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/Channel;", "", "", "authorId", "La91/u;", "context", "Lru/avito/messenger/generated/api/create_item_channel/ChannelContextActionsNullable;", MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, "", "created", MessageBody.SystemMessageBody.Platform.FLOW, "id", "La91/r;", RequestReviewResultKt.INFO_TYPE, "La91/E;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "", "isAnswered", "isRead", "Lru/avito/messenger/generated/api/create_item_channel/Message;", "lastMessage", "pinOrder", "La91/j0;", "readOnly", "sortingTimestamp", "suspectMessageId", "", "tags", "Lru/avito/messenger/generated/api/create_item_channel/Channel$Type;", "type", "updated", ChannelContext.Item.USER_ID, "La91/q0;", "users", "version", "<init>", "(Ljava/lang/String;La91/u;Lru/avito/messenger/generated/api/create_item_channel/ChannelContextActionsNullable;JLjava/lang/String;Ljava/lang/String;La91/r;La91/E;ZZLru/avito/messenger/generated/api/create_item_channel/Message;Ljava/lang/Long;La91/j0;JLjava/lang/String;Ljava/util/List;Lru/avito/messenger/generated/api/create_item_channel/Channel$Type;JLjava/lang/String;Ljava/util/List;J)V", "Ljava/lang/String;", "getAuthorId", "()Ljava/lang/String;", "La91/u;", "a", "()La91/u;", "Lru/avito/messenger/generated/api/create_item_channel/ChannelContextActionsNullable;", "b", "()Lru/avito/messenger/generated/api/create_item_channel/ChannelContextActionsNullable;", "J", "c", "()J", "d", "e", "La91/r;", "f", "()La91/r;", "La91/E;", "g", "()La91/E;", "Z", "q", "()Z", "r", "Lru/avito/messenger/generated/api/create_item_channel/Message;", "h", "()Lru/avito/messenger/generated/api/create_item_channel/Message;", "Ljava/lang/Long;", "i", "()Ljava/lang/Long;", "La91/j0;", "j", "()La91/j0;", "k", "l", "Ljava/util/List;", "m", "()Ljava/util/List;", "Lru/avito/messenger/generated/api/create_item_channel/Channel$Type;", "n", "()Lru/avito/messenger/generated/api/create_item_channel/Channel$Type;", "getUpdated", "getUserId", "o", "p", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Channel {

    @c("authorId")
    @k
    private final String authorId;

    @c("context")
    @k
    private final InterfaceC19740u context;

    @c(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS)
    @l
    private final ChannelContextActionsNullable contextActions;

    @c("created")
    private final long created;

    @c(MessageBody.SystemMessageBody.Platform.FLOW)
    @l
    private final String flow;

    @c("id")
    @k
    private final String id;

    @c(RequestReviewResultKt.INFO_TYPE)
    @k
    private final C19737r info;

    @c(MessageBody.SystemMessageBody.Platform.INPUT_STATE)
    @l
    private final C19706E inputState;

    @c("isAnswered")
    private final boolean isAnswered;

    @c("isRead")
    private final boolean isRead;

    @c("lastMessage")
    @l
    private final Message lastMessage;

    @c("pinOrder")
    @l
    private final Long pinOrder;

    @c("readOnly")
    @l
    private final j0 readOnly;

    @c("sortingTimestamp")
    private final long sortingTimestamp;

    @c("suspectMessageId")
    @l
    private final String suspectMessageId;

    @c("tags")
    @k
    private final List<Long> tags;

    @c("type")
    @k
    private final Type type;

    @c("updated")
    private final long updated;

    @c(ChannelContext.Item.USER_ID)
    @k
    private final String userId;

    @c("users")
    @l
    private final List<q0> users;

    @c("version")
    private final long version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateItemChannelResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/Channel$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "Int3", "Int4", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        @c("2")
        public static final Type Int2;

        @c("3")
        public static final Type Int3;

        @c("4")
        public static final Type Int4;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430783b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430784c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type type3 = new Type("Int2", 2, 2);
            Int2 = type3;
            Type type4 = new Type("Int3", 3, 3);
            Int3 = type4;
            Type type5 = new Type("Int4", 4, 4);
            Int4 = type5;
            Type[] typeArr = {type, type2, type3, type4, type5};
            f430783b = typeArr;
            f430784c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430783b.clone();
        }
    }

    public Channel(@k String str, @k InterfaceC19740u interfaceC19740u, @l ChannelContextActionsNullable channelContextActionsNullable, long j12, @l String str2, @k String str3, @k C19737r c19737r, @l C19706E c19706e, boolean z12, boolean z13, @l Message message, @l Long l12, @l j0 j0Var, long j13, @l String str4, @k List<Long> list, @k Type type, long j14, @k String str5, @l List<q0> list2, long j15) {
        this.authorId = str;
        this.context = interfaceC19740u;
        this.contextActions = channelContextActionsNullable;
        this.created = j12;
        this.flow = str2;
        this.id = str3;
        this.info = c19737r;
        this.inputState = c19706e;
        this.isAnswered = z12;
        this.isRead = z13;
        this.lastMessage = message;
        this.pinOrder = l12;
        this.readOnly = j0Var;
        this.sortingTimestamp = j13;
        this.suspectMessageId = str4;
        this.tags = list;
        this.type = type;
        this.updated = j14;
        this.userId = str5;
        this.users = list2;
        this.version = j15;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final InterfaceC19740u getContext() {
        return this.context;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final ChannelContextActionsNullable getContextActions() {
        return this.contextActions;
    }

    /* renamed from: c, reason: from getter */
    public final long getCreated() {
        return this.created;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getFlow() {
        return this.flow;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final C19737r getInfo() {
        return this.info;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final C19706E getInputState() {
        return this.inputState;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final Message getLastMessage() {
        return this.lastMessage;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final Long getPinOrder() {
        return this.pinOrder;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final j0 getReadOnly() {
        return this.readOnly;
    }

    /* renamed from: k, reason: from getter */
    public final long getSortingTimestamp() {
        return this.sortingTimestamp;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final String getSuspectMessageId() {
        return this.suspectMessageId;
    }

    @k
    public final List<Long> m() {
        return this.tags;
    }

    @k
    /* renamed from: n, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    public final List<q0> o() {
        return this.users;
    }

    /* renamed from: p, reason: from getter */
    public final long getVersion() {
        return this.version;
    }

    /* renamed from: q, reason: from getter */
    public final boolean getIsAnswered() {
        return this.isAnswered;
    }

    /* renamed from: r, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }
}
