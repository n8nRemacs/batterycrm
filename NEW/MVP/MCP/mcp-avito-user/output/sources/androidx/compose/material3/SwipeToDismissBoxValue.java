package androidx.compose.material3;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SwipeToDismissBox.kt */
@InterfaceC21537e7
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/material3/SwipeToDismissBoxValue;", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SwipeToDismissBoxValue {

    /* renamed from: b, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f35445b;

    /* renamed from: c, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f35446c;

    /* renamed from: d, reason: collision with root package name */
    public static final SwipeToDismissBoxValue f35447d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SwipeToDismissBoxValue[] f35448e;

    static {
        SwipeToDismissBoxValue swipeToDismissBoxValue = new SwipeToDismissBoxValue("StartToEnd", 0);
        f35445b = swipeToDismissBoxValue;
        SwipeToDismissBoxValue swipeToDismissBoxValue2 = new SwipeToDismissBoxValue("EndToStart", 1);
        f35446c = swipeToDismissBoxValue2;
        SwipeToDismissBoxValue swipeToDismissBoxValue3 = new SwipeToDismissBoxValue("Settled", 2);
        f35447d = swipeToDismissBoxValue3;
        f35448e = new SwipeToDismissBoxValue[]{swipeToDismissBoxValue, swipeToDismissBoxValue2, swipeToDismissBoxValue3};
    }

    public SwipeToDismissBoxValue() {
        throw null;
    }

    public static SwipeToDismissBoxValue valueOf(String str) {
        return (SwipeToDismissBoxValue) Enum.valueOf(SwipeToDismissBoxValue.class, str);
    }

    public static SwipeToDismissBoxValue[] values() {
        return (SwipeToDismissBoxValue[]) f35448e.clone();
    }
}
