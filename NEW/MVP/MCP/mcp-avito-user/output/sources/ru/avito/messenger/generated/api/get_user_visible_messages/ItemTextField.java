package ru.avito.messenger.generated.api.get_user_visible_messages;

import Y61.k;
import com.google.gson.annotations.c;
import d91.o;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetUserVisibleMessagesResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField;", "", "Ld91/o;", "content", "Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField$Type;", "type", "<init>", "(Ld91/o;Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField$Type;)V", "Ld91/o;", "a", "()Ld91/o;", "Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField$Type;", "b", "()Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField$Type;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ItemTextField {

    @c("content")
    @k
    private final o content;

    @c("type")
    @k
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetUserVisibleMessagesResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/get_user_visible_messages/ItemTextField$Type;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Unknown", "Text", "Geo", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("geo")
        public static final Type Geo;

        @c("text")
        public static final Type Text;

        @c("unknown")
        public static final Type Unknown;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ Type[] f431067c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ a f431068d;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f431069b;

        static {
            Type type = new Type("Unknown", 0, "unknown");
            Unknown = type;
            Type type2 = new Type("Text", 1, "text");
            Text = type2;
            Type type3 = new Type("Geo", 2, "geo");
            Geo = type3;
            Type[] typeArr = {type, type2, type3};
            f431067c = typeArr;
            f431068d = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, String str2) {
            this.f431069b = str2;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f431067c.clone();
        }
    }

    public ItemTextField(@k o oVar, @k Type type) {
        this.content = oVar;
        this.type = type;
    }

    @k
    /* renamed from: a, reason: from getter */
    public final o getContent() {
        return this.content;
    }

    @k
    /* renamed from: b, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
