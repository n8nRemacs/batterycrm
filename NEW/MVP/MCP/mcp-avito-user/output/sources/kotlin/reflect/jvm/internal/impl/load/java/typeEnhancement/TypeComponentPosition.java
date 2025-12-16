package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeComponentPosition.kt */
/* loaded from: classes8.dex */
public final class TypeComponentPosition {

    /* renamed from: b, reason: collision with root package name */
    public static final TypeComponentPosition f408316b;

    /* renamed from: c, reason: collision with root package name */
    public static final TypeComponentPosition f408317c;

    /* renamed from: d, reason: collision with root package name */
    public static final TypeComponentPosition f408318d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TypeComponentPosition[] f408319e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f408320f;

    static {
        TypeComponentPosition typeComponentPosition = new TypeComponentPosition("FLEXIBLE_LOWER", 0);
        f408316b = typeComponentPosition;
        TypeComponentPosition typeComponentPosition2 = new TypeComponentPosition("FLEXIBLE_UPPER", 1);
        f408317c = typeComponentPosition2;
        TypeComponentPosition typeComponentPosition3 = new TypeComponentPosition("INFLEXIBLE", 2);
        f408318d = typeComponentPosition3;
        TypeComponentPosition[] typeComponentPositionArr = {typeComponentPosition, typeComponentPosition2, typeComponentPosition3};
        f408319e = typeComponentPositionArr;
        f408320f = kotlin.enums.c.a(typeComponentPositionArr);
    }

    public TypeComponentPosition() {
        throw null;
    }

    public static TypeComponentPosition valueOf(String str) {
        return (TypeComponentPosition) Enum.valueOf(TypeComponentPosition.class, str);
    }

    public static TypeComponentPosition[] values() {
        return (TypeComponentPosition[]) f408319e.clone();
    }
}
