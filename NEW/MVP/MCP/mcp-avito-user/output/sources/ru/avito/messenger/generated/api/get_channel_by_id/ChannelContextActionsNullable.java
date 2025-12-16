package ru.avito.messenger.generated.api.get_channel_by_id;

import Y61.k;
import Y61.l;
import b91.C25442I;
import b91.C25460b;
import b91.c0;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001:\u0001\u001fB?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable;", "", "Lb91/b;", "actions", "", MessageBody.SystemMessageBody.Platform.FLOW, "Lb91/I;", PlatformActions.ItemsList.TYPE, PlatformActions.MESSAGE_ID, "Lb91/c0;", PlatformActions.PLATFORM_SUPPORT, "Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable$Type;", "type", "<init>", "(Lb91/b;Ljava/lang/String;Lb91/I;Ljava/lang/String;Lb91/c0;Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable$Type;)V", "Lb91/b;", "a", "()Lb91/b;", "Ljava/lang/String;", "getFlow", "()Ljava/lang/String;", "Lb91/I;", "b", "()Lb91/I;", "c", "Lb91/c0;", "d", "()Lb91/c0;", "Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable$Type;", "e", "()Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable$Type;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ChannelContextActionsNullable {

    @c("actions")
    @l
    private final C25460b actions;

    @c(MessageBody.SystemMessageBody.Platform.FLOW)
    @l
    private final String flow;

    @c(PlatformActions.ItemsList.TYPE)
    @l
    private final C25442I itemsList;

    @c(PlatformActions.MESSAGE_ID)
    @k
    private final String messageId;

    @c(PlatformActions.PLATFORM_SUPPORT)
    @l
    private final c0 platformSupport;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelByIdResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/ChannelContextActionsNullable$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        @c("2")
        public static final Type Int2;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430876b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430877c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type type3 = new Type("Int2", 2, 2);
            Int2 = type3;
            Type[] typeArr = {type, type2, type3};
            f430876b = typeArr;
            f430877c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430876b.clone();
        }
    }

    public ChannelContextActionsNullable(@l C25460b c25460b, @l String str, @l C25442I c25442i, @k String str2, @l c0 c0Var, @k Type type) {
        this.actions = c25460b;
        this.flow = str;
        this.itemsList = c25442i;
        this.messageId = str2;
        this.platformSupport = c0Var;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C25460b getActions() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25442I getItemsList() {
        return this.itemsList;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final c0 getPlatformSupport() {
        return this.platformSupport;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
