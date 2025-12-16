package androidx.compose.ui.focus;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FocusTransactions.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/focus/CustomDestinationResult;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CustomDestinationResult {

    /* renamed from: b, reason: collision with root package name */
    public static final CustomDestinationResult f39092b;

    /* renamed from: c, reason: collision with root package name */
    public static final CustomDestinationResult f39093c;

    /* renamed from: d, reason: collision with root package name */
    public static final CustomDestinationResult f39094d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CustomDestinationResult[] f39095e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f39096f;

    static {
        CustomDestinationResult customDestinationResult = new CustomDestinationResult("None", 0);
        f39092b = customDestinationResult;
        CustomDestinationResult customDestinationResult2 = new CustomDestinationResult("Cancelled", 1);
        f39093c = customDestinationResult2;
        CustomDestinationResult customDestinationResult3 = new CustomDestinationResult("Redirected", 2);
        f39094d = customDestinationResult3;
        CustomDestinationResult[] customDestinationResultArr = {customDestinationResult, customDestinationResult2, customDestinationResult3, new CustomDestinationResult("RedirectCancelled", 3)};
        f39095e = customDestinationResultArr;
        f39096f = kotlin.enums.c.a(customDestinationResultArr);
    }

    public CustomDestinationResult() {
        throw null;
    }

    public static CustomDestinationResult valueOf(String str) {
        return (CustomDestinationResult) Enum.valueOf(CustomDestinationResult.class, str);
    }

    public static CustomDestinationResult[] values() {
        return (CustomDestinationResult[]) f39095e.clone();
    }
}
