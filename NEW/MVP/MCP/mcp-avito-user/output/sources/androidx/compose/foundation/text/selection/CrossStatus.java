package androidx.compose.foundation.text.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SelectionLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/CrossStatus;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CrossStatus {

    /* renamed from: b, reason: collision with root package name */
    public static final CrossStatus f31829b;

    /* renamed from: c, reason: collision with root package name */
    public static final CrossStatus f31830c;

    /* renamed from: d, reason: collision with root package name */
    public static final CrossStatus f31831d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ CrossStatus[] f31832e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f31833f;

    static {
        CrossStatus crossStatus = new CrossStatus("CROSSED", 0);
        f31829b = crossStatus;
        CrossStatus crossStatus2 = new CrossStatus("NOT_CROSSED", 1);
        f31830c = crossStatus2;
        CrossStatus crossStatus3 = new CrossStatus("COLLAPSED", 2);
        f31831d = crossStatus3;
        CrossStatus[] crossStatusArr = {crossStatus, crossStatus2, crossStatus3};
        f31832e = crossStatusArr;
        f31833f = kotlin.enums.c.a(crossStatusArr);
    }

    public CrossStatus() {
        throw null;
    }

    public static CrossStatus valueOf(String str) {
        return (CrossStatus) Enum.valueOf(CrossStatus.class, str);
    }

    public static CrossStatus[] values() {
        return (CrossStatus[]) f31832e.clone();
    }
}
