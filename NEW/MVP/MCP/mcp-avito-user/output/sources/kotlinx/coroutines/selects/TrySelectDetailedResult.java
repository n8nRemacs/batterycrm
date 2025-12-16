package kotlinx.coroutines.selects;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Select.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class TrySelectDetailedResult {

    /* renamed from: b, reason: collision with root package name */
    public static final TrySelectDetailedResult f412192b;

    /* renamed from: c, reason: collision with root package name */
    public static final TrySelectDetailedResult f412193c;

    /* renamed from: d, reason: collision with root package name */
    public static final TrySelectDetailedResult f412194d;

    /* renamed from: e, reason: collision with root package name */
    public static final TrySelectDetailedResult f412195e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TrySelectDetailedResult[] f412196f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f412197g;

    static {
        TrySelectDetailedResult trySelectDetailedResult = new TrySelectDetailedResult("SUCCESSFUL", 0);
        f412192b = trySelectDetailedResult;
        TrySelectDetailedResult trySelectDetailedResult2 = new TrySelectDetailedResult("REREGISTER", 1);
        f412193c = trySelectDetailedResult2;
        TrySelectDetailedResult trySelectDetailedResult3 = new TrySelectDetailedResult("CANCELLED", 2);
        f412194d = trySelectDetailedResult3;
        TrySelectDetailedResult trySelectDetailedResult4 = new TrySelectDetailedResult("ALREADY_SELECTED", 3);
        f412195e = trySelectDetailedResult4;
        TrySelectDetailedResult[] trySelectDetailedResultArr = {trySelectDetailedResult, trySelectDetailedResult2, trySelectDetailedResult3, trySelectDetailedResult4};
        f412196f = trySelectDetailedResultArr;
        f412197g = kotlin.enums.c.a(trySelectDetailedResultArr);
    }

    public TrySelectDetailedResult() {
        throw null;
    }

    public static TrySelectDetailedResult valueOf(String str) {
        return (TrySelectDetailedResult) Enum.valueOf(TrySelectDetailedResult.class, str);
    }

    public static TrySelectDetailedResult[] values() {
        return (TrySelectDetailedResult[]) f412196f.clone();
    }
}
