package ru.avito.messenger.generated.api.get_channel_by_id;

import Y61.k;
import Y61.l;
import b91.C25450Q;
import b91.C25451S;
import b91.C25452T;
import b91.C25453U;
import b91.C25454V;
import b91.C25455W;
import b91.C25456X;
import b91.C25457Y;
import b91.C25458Z;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.enums.a;

/* compiled from: GetChannelByIdResponse.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\u0018\u00002\u00020\u0001:\u00016Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/Chunk;", "", "Lb91/Q;", "call", "Lb91/S;", "file", "Lb91/T;", "image", "Lb91/U;", "item", "Lb91/V;", "link", "Lb91/W;", "location", "Lb91/X;", "text", "Lru/avito/messenger/generated/api/get_channel_by_id/Chunk$Type;", "type", "Lb91/Y;", "video", "Lb91/Z;", "voice", "<init>", "(Lb91/Q;Lb91/S;Lb91/T;Lb91/U;Lb91/V;Lb91/W;Lb91/X;Lru/avito/messenger/generated/api/get_channel_by_id/Chunk$Type;Lb91/Y;Lb91/Z;)V", "Lb91/Q;", "getCall", "()Lb91/Q;", "Lb91/S;", "a", "()Lb91/S;", "Lb91/T;", "b", "()Lb91/T;", "Lb91/U;", "c", "()Lb91/U;", "Lb91/V;", "getLink", "()Lb91/V;", "Lb91/W;", "d", "()Lb91/W;", "Lb91/X;", "e", "()Lb91/X;", "Lru/avito/messenger/generated/api/get_channel_by_id/Chunk$Type;", "f", "()Lru/avito/messenger/generated/api/get_channel_by_id/Chunk$Type;", "Lb91/Y;", "g", "()Lb91/Y;", "Lb91/Z;", "getVoice", "()Lb91/Z;", "Type", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Chunk {

    @c("call")
    @l
    private final C25450Q call;

    @c("file")
    @l
    private final C25451S file;

    @c("image")
    @l
    private final C25452T image;

    @c("item")
    @l
    private final C25453U item;

    @c("link")
    @l
    private final C25454V link;

    @c("location")
    @l
    private final C25455W location;

    @c("text")
    @l
    private final C25456X text;

    @c("type")
    @k
    private final Type type;

    @c("video")
    @l
    private final C25457Y video;

    @c("voice")
    @l
    private final C25458Z voice;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: GetChannelByIdResponse.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lru/avito/messenger/generated/api/get_channel_by_id/Chunk$Type;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "Int0", "Int1", "Int2", "Int3", "Int4", "Int5", "Int6", "Int7", "Int8", "Int9", "Int10", "Int11", "Int12", "Int13", "Int14", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
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

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ Type[] f430879b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ a f430880c;

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
            f430879b = typeArr;
            f430880c = kotlin.enums.c.a(typeArr);
        }

        private Type(String str, int i12, int i13) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) f430879b.clone();
        }
    }

    public Chunk(@l C25450Q c25450q, @l C25451S c25451s, @l C25452T c25452t, @l C25453U c25453u, @l C25454V c25454v, @l C25455W c25455w, @l C25456X c25456x, @k Type type, @l C25457Y c25457y, @l C25458Z c25458z) {
        this.call = c25450q;
        this.file = c25451s;
        this.image = c25452t;
        this.item = c25453u;
        this.link = c25454v;
        this.location = c25455w;
        this.text = c25456x;
        this.type = type;
        this.video = c25457y;
        this.voice = c25458z;
    }

    @l
    /* renamed from: a, reason: from getter */
    public final C25451S getFile() {
        return this.file;
    }

    @l
    /* renamed from: b, reason: from getter */
    public final C25452T getImage() {
        return this.image;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final C25453U getItem() {
        return this.item;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final C25455W getLocation() {
        return this.location;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final C25456X getText() {
        return this.text;
    }

    @k
    /* renamed from: f, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final C25457Y getVideo() {
        return this.video;
    }
}
