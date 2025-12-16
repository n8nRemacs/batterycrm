package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetScaffold.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/U1;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class U1 {

    /* renamed from: b, reason: collision with root package name */
    public static final U1 f35520b;

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ U1[] f35521c;

    /* JADX INFO: Fake field, exist only in values array */
    U1 EF0;

    static {
        U1 u12 = new U1("TopBar", 0);
        U1 u13 = new U1("Body", 1);
        U1 u14 = new U1("Sheet", 2);
        f35520b = u14;
        f35521c = new U1[]{u12, u13, u14, new U1("Snackbar", 3)};
    }

    public U1() {
        throw null;
    }

    public static U1 valueOf(String str) {
        return (U1) Enum.valueOf(U1.class, str);
    }

    public static U1[] values() {
        return (U1[]) f35521c.clone();
    }
}
