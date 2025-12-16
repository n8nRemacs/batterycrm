package kotlin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Annotations.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/DeprecationLevel;", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DeprecationLevel {

    /* renamed from: b, reason: collision with root package name */
    public static final DeprecationLevel f406607b;

    /* renamed from: c, reason: collision with root package name */
    public static final DeprecationLevel f406608c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevel[] f406609d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f406610e;

    static {
        DeprecationLevel deprecationLevel = new DeprecationLevel("WARNING", 0);
        f406607b = deprecationLevel;
        DeprecationLevel deprecationLevel2 = new DeprecationLevel("ERROR", 1);
        f406608c = deprecationLevel2;
        DeprecationLevel[] deprecationLevelArr = {deprecationLevel, deprecationLevel2, new DeprecationLevel("HIDDEN", 2)};
        f406609d = deprecationLevelArr;
        f406610e = kotlin.enums.c.a(deprecationLevelArr);
    }

    public DeprecationLevel() {
        throw null;
    }

    public static DeprecationLevel valueOf(String str) {
        return (DeprecationLevel) Enum.valueOf(DeprecationLevel.class, str);
    }

    public static DeprecationLevel[] values() {
        return (DeprecationLevel[]) f406609d.clone();
    }
}
