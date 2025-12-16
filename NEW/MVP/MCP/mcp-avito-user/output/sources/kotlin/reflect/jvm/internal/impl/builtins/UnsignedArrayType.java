package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes8.dex */
public final class UnsignedArrayType {

    /* renamed from: c, reason: collision with root package name */
    public static final UnsignedArrayType f407176c;

    /* renamed from: d, reason: collision with root package name */
    public static final UnsignedArrayType f407177d;

    /* renamed from: e, reason: collision with root package name */
    public static final UnsignedArrayType f407178e;

    /* renamed from: f, reason: collision with root package name */
    public static final UnsignedArrayType f407179f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ UnsignedArrayType[] f407180g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407181h;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407182b;

    static {
        UnsignedArrayType unsignedArrayType = new UnsignedArrayType("UBYTEARRAY", 0, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByteArray", false));
        f407176c = unsignedArrayType;
        UnsignedArrayType unsignedArrayType2 = new UnsignedArrayType("USHORTARRAY", 1, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShortArray", false));
        f407177d = unsignedArrayType2;
        UnsignedArrayType unsignedArrayType3 = new UnsignedArrayType("UINTARRAY", 2, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UIntArray", false));
        f407178e = unsignedArrayType3;
        UnsignedArrayType unsignedArrayType4 = new UnsignedArrayType("ULONGARRAY", 3, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULongArray", false));
        f407179f = unsignedArrayType4;
        UnsignedArrayType[] unsignedArrayTypeArr = {unsignedArrayType, unsignedArrayType2, unsignedArrayType3, unsignedArrayType4};
        f407180g = unsignedArrayTypeArr;
        f407181h = kotlin.enums.c.a(unsignedArrayTypeArr);
    }

    public UnsignedArrayType(String str, int i12, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.f407182b = bVar.i();
    }

    public static UnsignedArrayType valueOf(String str) {
        return (UnsignedArrayType) Enum.valueOf(UnsignedArrayType.class, str);
    }

    public static UnsignedArrayType[] values() {
        return (UnsignedArrayType[]) f407180g.clone();
    }
}
