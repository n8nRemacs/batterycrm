package ru.avito.messenger.generated.api.get_channels;

import Y61.k;
import Y61.l;
import c91.C26970a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelsResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001:\u0001\u001aB3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/Action;", "", "", "analytics", "Lc91/a;", "confirmation", "Lru/avito/messenger/generated/api/get_channels/ActionHandler;", "handler", "text", "Lru/avito/messenger/generated/api/get_channels/Action$Type;", "type", "<init>", "(Ljava/lang/String;Lc91/a;Lru/avito/messenger/generated/api/get_channels/ActionHandler;Ljava/lang/String;Lru/avito/messenger/generated/api/get_channels/Action$Type;)V", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Lc91/a;", "b", "()Lc91/a;", "Lru/avito/messenger/generated/api/get_channels/ActionHandler;", "c", "()Lru/avito/messenger/generated/api/get_channels/ActionHandler;", "d", "Lru/avito/messenger/generated/api/get_channels/Action$Type;", "e", "()Lru/avito/messenger/generated/api/get_channels/Action$Type;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Action {

    @c("analytics")
    @l
    private final String analytics;

    @c("confirmation")
    @l
    private final C26970a confirmation;

    @c("handler")
    @k
    private final ActionHandler handler;

    @c("text")
    @k
    private final String text;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelsResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/get_channels/Action$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430932b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430933c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type[] typeArr = {type, type2};
            f430932b = typeArr;
            f430933c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430932b.clone();
        }
    }

    public Action(@l String str, @l C26970a c26970a, @k ActionHandler actionHandler, @k String str2, @k Type type) {
        this.analytics = str;
        this.confirmation = c26970a;
        this.handler = actionHandler;
        this.text = str2;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final String getAnalytics() {
        return this.analytics;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C26970a getConfirmation() {
        return this.confirmation;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ActionHandler getHandler() {
        return this.handler;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
