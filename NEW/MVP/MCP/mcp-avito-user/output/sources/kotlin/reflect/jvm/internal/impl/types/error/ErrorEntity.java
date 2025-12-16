package kotlin.reflect.jvm.internal.impl.types.error;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ErrorEntity.kt */
/* loaded from: classes8.dex */
public final class ErrorEntity {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ErrorEntity[] f410134b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f410135c;

    static {
        ErrorEntity[] errorEntityArr = {new ErrorEntity("ERROR_CLASS", 0), new ErrorEntity("ERROR_FUNCTION", 1), new ErrorEntity("ERROR_SCOPE", 2), new ErrorEntity("ERROR_MODULE", 3), new ErrorEntity("ERROR_PROPERTY", 4), new ErrorEntity("ERROR_TYPE", 5), new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6)};
        f410134b = errorEntityArr;
        f410135c = kotlin.enums.c.a(errorEntityArr);
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) f410134b.clone();
    }
}
