package ru.avito.messenger.generated.api.get_user_visible_messages;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.google.gson.annotations.c;
import d91.C39540b;
import d91.p;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable;", "", "Ld91/b;", "actions", "Ld91/p;", PlatformActions.ItemsList.TYPE, "", PlatformActions.MESSAGE_ID, "Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable$Type;", "type", "", "version", "<init>", "(Ld91/b;Ld91/p;Ljava/lang/String;Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable$Type;J)V", "Ld91/b;", "a", "()Ld91/b;", "Ld91/p;", "b", "()Ld91/p;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable$Type;", "d", "()Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable$Type;", "J", "e", "()J", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MessageContextActionsNullable {

    @c("actions")
    @l
    private final C39540b actions;

    @c(PlatformActions.ItemsList.TYPE)
    @l
    private final p itemsList;

    @c(PlatformActions.MESSAGE_ID)
    @k
    private final String messageId;

    @c("type")
    @k
    private final Type type;

    @c("version")
    private final long version;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetUserVisibleMessagesResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/MessageContextActionsNullable$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        @c("2")
        public static final Type Int2;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f431085b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f431086c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type type3 = new Type("Int2", 2, 2);
            Int2 = type3;
            Type[] typeArr = {type, type2, type3};
            f431085b = typeArr;
            f431086c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f431085b.clone();
        }
    }

    public MessageContextActionsNullable(@l C39540b c39540b, @l p pVar, @k String str, @k Type type, long j12) {
        this.actions = c39540b;
        this.itemsList = pVar;
        this.messageId = str;
        this.type = type;
        this.version = j12;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C39540b getActions() {
        return this.actions;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final p getItemsList() {
        return this.itemsList;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: e, reason: from getter */
    public final long getVersion() {
        return this.version;
    }
}
