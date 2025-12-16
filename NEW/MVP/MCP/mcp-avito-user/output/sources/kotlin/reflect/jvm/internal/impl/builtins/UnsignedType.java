package kotlin.reflect.jvm.internal.impl.builtins;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes8.dex */
public final class UnsignedType {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ UnsignedType[] f407183e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f407184f;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f407185b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.f f407186c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final kotlin.reflect.jvm.internal.impl.name.b f407187d;

    static {
        UnsignedType[] unsignedTypeArr = {new UnsignedType("UBYTE", 0, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UByte", false)), new UnsignedType("USHORT", 1, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UShort", false)), new UnsignedType("UINT", 2, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/UInt", false)), new UnsignedType("ULONG", 3, kotlin.reflect.jvm.internal.impl.name.b.e("kotlin/ULong", false))};
        f407183e = unsignedTypeArr;
        f407184f = kotlin.enums.c.a(unsignedTypeArr);
    }

    public UnsignedType(String str, int i12, kotlin.reflect.jvm.internal.impl.name.b bVar) {
        this.f407185b = bVar;
        kotlin.reflect.jvm.internal.impl.name.f fVarI = bVar.i();
        this.f407186c = fVarI;
        this.f407187d = new kotlin.reflect.jvm.internal.impl.name.b(bVar.g(), kotlin.reflect.jvm.internal.impl.name.f.e(fVarI.b() + "Array"));
    }

    public static UnsignedType valueOf(String str) {
        return (UnsignedType) Enum.valueOf(UnsignedType.class, str);
    }

    public static UnsignedType[] values() {
        return (UnsignedType[]) f407183e.clone();
    }
}
