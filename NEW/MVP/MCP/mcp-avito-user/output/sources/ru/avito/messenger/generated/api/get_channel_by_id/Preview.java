package ru.avito.messenger.generated.api.get_channel_by_id;

import Y61.l;
import b91.C25434A;
import b91.C25446M;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001:\u0001\u0013B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/Preview;", "", "Lb91/A;", "imagePreview", "Lb91/M;", "linkPreview", "Lru/avito/messenger/generated/api/get_channel_by_id/Preview$Type;", "type", "<init>", "(Lb91/A;Lb91/M;Lru/avito/messenger/generated/api/get_channel_by_id/Preview$Type;)V", "Lb91/A;", "a", "()Lb91/A;", "Lb91/M;", "b", "()Lb91/M;", "Lru/avito/messenger/generated/api/get_channel_by_id/Preview$Type;", "c", "()Lru/avito/messenger/generated/api/get_channel_by_id/Preview$Type;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Preview {

    @c("imagePreview")
    @l
    private final C25434A imagePreview;

    @c("linkPreview")
    @l
    private final C25446M linkPreview;

    @c("type")
    @l
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelByIdResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/Preview$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {

        @c("0")
        public static final Type Int0;

        @c("1")
        public static final Type Int1;

        @c("2")
        public static final Type Int2;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430924b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430925c;

        static {
            Type type = new Type("Int0", 0, 0);
            Int0 = type;
            Type type2 = new Type("Int1", 1, 1);
            Int1 = type2;
            Type type3 = new Type("Int2", 2, 2);
            Int2 = type3;
            Type[] typeArr = {type, type2, type3};
            f430924b = typeArr;
            f430925c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430924b.clone();
        }
    }

    public Preview(@l C25434A c25434a, @l C25446M c25446m, @l Type type) {
        this.imagePreview = c25434a;
        this.linkPreview = c25446m;
        this.type = type;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C25434A getImagePreview() {
        return this.imagePreview;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25446M getLinkPreview() {
        return this.linkPreview;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final Type getType() {
        return this.type;
    }
}
