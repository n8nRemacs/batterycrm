package hu.akarnokd.rxjava3.async;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class AnyValue {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AnyValue[] f397449b = {new AnyValue("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    AnyValue EF5;

    public AnyValue() {
        throw null;
    }

    public static AnyValue valueOf(String str) {
        return (AnyValue) Enum.valueOf(AnyValue.class, str);
    }

    public static AnyValue[] values() {
        return (AnyValue[]) f397449b.clone();
    }
}
