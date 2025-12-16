package kotlin.reflect.jvm.internal.impl.resolve.deprecation;

import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeprecationInfo.kt */
/* loaded from: classes8.dex */
public final class DeprecationLevelValue {

    /* renamed from: b, reason: collision with root package name */
    public static final DeprecationLevelValue f409611b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ DeprecationLevelValue[] f409612c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ a f409613d;

    static {
        DeprecationLevelValue deprecationLevelValue = new DeprecationLevelValue("WARNING", 0);
        DeprecationLevelValue deprecationLevelValue2 = new DeprecationLevelValue("ERROR", 1);
        f409611b = deprecationLevelValue2;
        DeprecationLevelValue[] deprecationLevelValueArr = {deprecationLevelValue, deprecationLevelValue2, new DeprecationLevelValue("HIDDEN", 2)};
        f409612c = deprecationLevelValueArr;
        f409613d = c.a(deprecationLevelValueArr);
    }

    public DeprecationLevelValue() {
        throw null;
    }

    public static DeprecationLevelValue valueOf(String str) {
        return (DeprecationLevelValue) Enum.valueOf(DeprecationLevelValue.class, str);
    }

    public static DeprecationLevelValue[] values() {
        return (DeprecationLevelValue[]) f409612c.clone();
    }
}
