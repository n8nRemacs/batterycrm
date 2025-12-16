package ru.avito.messenger.generated.api.get_channels;

import Y61.k;
import Y61.l;
import c91.C26966E;
import c91.S;
import c91.e0;
import c91.f0;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggest;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelsResponse.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\u0018\u00002\u00020\u0001:\u0001DB\u0097\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b$\u0010 R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b.\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u00101R\u001a\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u00102\u001a\u0004\b\u0010\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b\u0011\u00105R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u00108R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00109\u001a\u0004\b:\u0010;R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010<\u001a\u0004\b=\u0010>R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010+\u001a\u0004\b?\u0010-R\u001a\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010@\u001a\u0004\bA\u0010BR\u001a\u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010(\u001a\u0004\bC\u0010*¨\u0006E"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/Message;", "", "", "authorId", "Lc91/S;", "body", "channelId", "Lru/avito/messenger/generated/api/get_channels/MessageContextActionsNullable;", MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS, "", "createdAt", "deletedAt", "id", "Lc91/E;", MessageBody.SystemMessageBody.Platform.INPUT_STATE, "", "isFirstMessage", "isSpam", "Lc91/e0;", PlatformActions.PLATFORM_SUPPORT, "Lc91/f0;", MessageSuggest.PREVIEW, "Lru/avito/messenger/generated/api/get_channels/QuoteNullable;", "quote", "readAt", "Lru/avito/messenger/generated/api/get_channels/Message$Type;", "type", "updatedAt", "<init>", "(Ljava/lang/String;Lc91/S;Ljava/lang/String;Lru/avito/messenger/generated/api/get_channels/MessageContextActionsNullable;JLjava/lang/Long;Ljava/lang/String;Lc91/E;ZLjava/lang/Boolean;Lc91/e0;Lc91/f0;Lru/avito/messenger/generated/api/get_channels/QuoteNullable;Ljava/lang/Long;Lru/avito/messenger/generated/api/get_channels/Message$Type;J)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lc91/S;", "b", "()Lc91/S;", "c", "Lru/avito/messenger/generated/api/get_channels/MessageContextActionsNullable;", "d", "()Lru/avito/messenger/generated/api/get_channels/MessageContextActionsNullable;", "J", "e", "()J", "Ljava/lang/Long;", "f", "()Ljava/lang/Long;", "g", "Lc91/E;", "h", "()Lc91/E;", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Lc91/e0;", "i", "()Lc91/e0;", "Lc91/f0;", "j", "()Lc91/f0;", "Lru/avito/messenger/generated/api/get_channels/QuoteNullable;", "k", "()Lru/avito/messenger/generated/api/get_channels/QuoteNullable;", "l", "Lru/avito/messenger/generated/api/get_channels/Message$Type;", "m", "()Lru/avito/messenger/generated/api/get_channels/Message$Type;", "n", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Message {

    @c("authorId")
    @k
    private final String authorId;

    @c("body")
    @k
    private final S body;

    @c("channelId")
    @k
    private final String channelId;

    @c(MessageBody.SystemMessageBody.Platform.CONTEXT_ACTIONS)
    @l
    private final MessageContextActionsNullable contextActions;

    @c("createdAt")
    private final long createdAt;

    @c("deletedAt")
    @l
    private final Long deletedAt;

    @c("id")
    @k
    private final String id;

    @c(MessageBody.SystemMessageBody.Platform.INPUT_STATE)
    @l
    private final C26966E inputState;

    @c("isFirstMessage")
    private final boolean isFirstMessage;

    @c("isSpam")
    @l
    private final Boolean isSpam;

    @c(PlatformActions.PLATFORM_SUPPORT)
    @l
    private final e0 platformSupport;

    @c(MessageSuggest.PREVIEW)
    @l
    private final f0 preview;

    @c("quote")
    @l
    private final QuoteNullable quote;

    @c("readAt")
    @l
    private final Long readAt;

    @c("type")
    @k
    private final Type type;

    @c("updatedAt")
    private final long updatedAt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/Message$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "Int3", "Int4", "Int5", "Int6", "Int7", "Int8", "Int9", "Int10", "Int11", "Int12", "Int13", "Int14", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        @c("10")
        public static final Type Int10;

        @c("11")
        public static final Type Int11;

        @c("12")
        public static final Type Int12;

        @c("13")
        public static final Type Int13;

        @c("14")
        public static final Type Int14;

        @c("2")
        public static final Type Int2;

        @c("3")
        public static final Type Int3;

        @c("4")
        public static final Type Int4;

        @c("5")
        public static final Type Int5;

        @c("6")
        public static final Type Int6;

        @c("7")
        public static final Type Int7;

        @c("8")
        public static final Type Int8;

        @c("9")
        public static final Type Int9;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430999c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f431000d;

        /* renamed from: b, reason: collision with root package name */
        public final int f431001b;

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
            Type type6 = new Type("Int5", 5, 5);
            Int5 = type6;
            Type type7 = new Type("Int6", 6, 6);
            Int6 = type7;
            Type type8 = new Type("Int7", 7, 7);
            Int7 = type8;
            Type type9 = new Type("Int8", 8, 8);
            Int8 = type9;
            Type type10 = new Type("Int9", 9, 9);
            Int9 = type10;
            Type type11 = new Type("Int10", 10, 10);
            Int10 = type11;
            Type type12 = new Type("Int11", 11, 11);
            Int11 = type12;
            Type type13 = new Type("Int12", 12, 12);
            Int12 = type13;
            Type type14 = new Type("Int13", 13, 13);
            Int13 = type14;
            Type type15 = new Type("Int14", 14, 14);
            Int14 = type15;
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7, type8, type9, type10, type11, type12, type13, type14, type15};
            f430999c = typeArr;
            f431000d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
            this.f431001b = i13;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430999c.clone();
        }
    }

    public Message(@k String str, @k S s5, @k String str2, @l MessageContextActionsNullable messageContextActionsNullable, long j12, @l Long l12, @k String str3, @l C26966E c26966e, boolean z12, @l Boolean bool, @l e0 e0Var, @l f0 f0Var, @l QuoteNullable quoteNullable, @l Long l13, @k Type type, long j13) {
        this.authorId = str;
        this.body = s5;
        this.channelId = str2;
        this.contextActions = messageContextActionsNullable;
        this.createdAt = j12;
        this.deletedAt = l12;
        this.id = str3;
        this.inputState = c26966e;
        this.isFirstMessage = z12;
        this.isSpam = bool;
        this.platformSupport = e0Var;
        this.preview = f0Var;
        this.quote = quoteNullable;
        this.readAt = l13;
        this.type = type;
        this.updatedAt = j13;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final String getAuthorId() {
        return this.authorId;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final S getBody() {
        return this.body;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getChannelId() {
        return this.channelId;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final MessageContextActionsNullable getContextActions() {
        return this.contextActions;
    }

    /* renamed from: e, reason: from getter */
    public final long getCreatedAt() {
        return this.createdAt;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Long getDeletedAt() {
        return this.deletedAt;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final C26966E getInputState() {
        return this.inputState;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final e0 getPlatformSupport() {
        return this.platformSupport;
    }

    @l
    /* renamed from: j, reason: from getter */
    public final f0 getPreview() {
        return this.preview;
    }

    @l
    /* renamed from: k, reason: from getter */
    public final QuoteNullable getQuote() {
        return this.quote;
    }

    @l
    /* renamed from: l, reason: from getter */
    public final Long getReadAt() {
        return this.readAt;
    }

    @k
    /* renamed from: m, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: n, reason: from getter */
    public final long getUpdatedAt() {
        return this.updatedAt;
    }
}
