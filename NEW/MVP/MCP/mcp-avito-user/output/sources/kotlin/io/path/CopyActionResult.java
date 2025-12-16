package kotlin.io.path;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CopyActionResult.kt */
@e
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/path/CopyActionResult;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42733c0
/* loaded from: classes8.dex */
public final class CopyActionResult {

    /* renamed from: b, reason: collision with root package name */
    public static final CopyActionResult f406792b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ CopyActionResult[] f406793c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f406794d;

    static {
        CopyActionResult copyActionResult = new CopyActionResult("CONTINUE", 0);
        f406792b = copyActionResult;
        CopyActionResult[] copyActionResultArr = {copyActionResult, new CopyActionResult("SKIP_SUBTREE", 1), new CopyActionResult("TERMINATE", 2)};
        f406793c = copyActionResultArr;
        f406794d = kotlin.enums.c.a(copyActionResultArr);
    }

    public CopyActionResult() {
        throw null;
    }

    public static CopyActionResult valueOf(String str) {
        return (CopyActionResult) Enum.valueOf(CopyActionResult.class, str);
    }

    public static CopyActionResult[] values() {
        return (CopyActionResult[]) f406793c.clone();
    }
}
