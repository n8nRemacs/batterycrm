package androidx.compose.material;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SnackbarHost.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material/SnackbarResult;", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SnackbarResult {

    /* renamed from: b, reason: collision with root package name */
    public static final SnackbarResult f33188b;

    /* renamed from: c, reason: collision with root package name */
    public static final SnackbarResult f33189c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ SnackbarResult[] f33190d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33191e;

    static {
        SnackbarResult snackbarResult = new SnackbarResult("Dismissed", 0);
        f33188b = snackbarResult;
        SnackbarResult snackbarResult2 = new SnackbarResult("ActionPerformed", 1);
        f33189c = snackbarResult2;
        SnackbarResult[] snackbarResultArr = {snackbarResult, snackbarResult2};
        f33190d = snackbarResultArr;
        f33191e = kotlin.enums.c.a(snackbarResultArr);
    }

    public SnackbarResult() {
        throw null;
    }

    public static SnackbarResult valueOf(String str) {
        return (SnackbarResult) Enum.valueOf(SnackbarResult.class, str);
    }

    public static SnackbarResult[] values() {
        return (SnackbarResult[]) f33190d.clone();
    }
}
