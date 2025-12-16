package ru.avito.messenger.generated.api.get_channel_by_id;

import Y61.k;
import Y61.l;
import b91.C25444K;
import b91.a0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler;", "", "Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler$Type;", "type", "Lb91/K;", "valueLink", "Lb91/a0;", "valueMethodCall", "<init>", "(Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler$Type;Lb91/K;Lb91/a0;)V", "Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler$Type;", "a", "()Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler$Type;", "Lb91/K;", "b", "()Lb91/K;", "Lb91/a0;", "c", "()Lb91/a0;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ActionHandler {

    @c("type")
    @k
    private final Type type;

    @c("valueLink")
    @l
    private final C25444K valueLink;

    @c("valueMethodCall")
    @l
    private final a0 valueMethodCall;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelByIdResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/ActionHandler$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430842b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430843c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type[] typeArr = {type, type2};
            f430842b = typeArr;
            f430843c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430842b.clone();
        }
    }

    public ActionHandler(@k Type type, @l C25444K c25444k, @l a0 a0Var) {
        this.type = type;
        this.valueLink = c25444k;
        this.valueMethodCall = a0Var;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25444K getValueLink() {
        return this.valueLink;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final a0 getValueMethodCall() {
        return this.valueMethodCall;
    }
}
