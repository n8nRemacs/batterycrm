package ru.avito.messenger.generated.api.send_text_message;

import Y61.l;
import com.google.gson.annotations.c;
import g91.C40557d;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: SendTextMessageResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/Attribute;", "", "Lru/avito/messenger/generated/api/send_text_message/Attribute$Type;", "type", "Lg91/d;", "value", "<init>", "(Lru/avito/messenger/generated/api/send_text_message/Attribute$Type;Lg91/d;)V", "Lru/avito/messenger/generated/api/send_text_message/Attribute$Type;", "a", "()Lru/avito/messenger/generated/api/send_text_message/Attribute$Type;", "Lg91/d;", "b", "()Lg91/d;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Attribute {

    @c("type")
    @l
    private final Type type;

    @c("value")
    @l
    private final C40557d value;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SendTextMessageResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/avito/messenger/generated/api/send_text_message/Attribute$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "Int3", "Int4", "Int5", "Int6", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        @c("5")
        public static final Type Int5;

        @c("6")
        public static final Type Int6;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f431107b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f431108c;

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
            Type[] typeArr = {type, type2, type3, type4, type5, type6, type7};
            f431107b = typeArr;
            f431108c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f431107b.clone();
        }
    }

    public Attribute(@l Type type, @l C40557d c40557d) {
        this.type = type;
        this.value = c40557d;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C40557d getValue() {
        return this.value;
    }
}
