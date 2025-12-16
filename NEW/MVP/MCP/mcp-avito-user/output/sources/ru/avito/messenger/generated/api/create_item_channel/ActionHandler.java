package ru.avito.messenger.generated.api.create_item_channel;

import Y61.k;
import Y61.l;
import a91.C19714M;
import a91.c0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: CreateItemChannelResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/ActionHandler;", "", "Lru/avito/messenger/generated/api/create_item_channel/ActionHandler$Type;", "type", "La91/M;", "valueLink", "La91/c0;", "valueMethodCall", "<init>", "(Lru/avito/messenger/generated/api/create_item_channel/ActionHandler$Type;La91/M;La91/c0;)V", "Lru/avito/messenger/generated/api/create_item_channel/ActionHandler$Type;", "a", "()Lru/avito/messenger/generated/api/create_item_channel/ActionHandler$Type;", "La91/M;", "b", "()La91/M;", "La91/c0;", "c", "()La91/c0;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionHandler {

    @c("type")
    @k
    private final Type type;

    @c("valueLink")
    @l
    private final C19714M valueLink;

    @c("valueMethodCall")
    @l
    private final c0 valueMethodCall;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreateItemChannelResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/create_item_channel/ActionHandler$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430748b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430749c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type[] typeArr = {type, type2};
            f430748b = typeArr;
            f430749c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430748b.clone();
        }
    }

    public ActionHandler(@k Type type, @l C19714M c19714m, @l c0 c0Var) {
        this.type = type;
        this.valueLink = c19714m;
        this.valueMethodCall = c0Var;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C19714M getValueLink() {
        return this.valueLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final c0 getValueMethodCall() {
        return this.valueMethodCall;
    }
}
