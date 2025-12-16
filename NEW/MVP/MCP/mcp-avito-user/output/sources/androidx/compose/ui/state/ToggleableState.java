package androidx.compose.ui.state;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ToggleableState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/state/ToggleableState;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ToggleableState {

    /* renamed from: b, reason: collision with root package name */
    public static final ToggleableState f41896b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToggleableState f41897c;

    /* renamed from: d, reason: collision with root package name */
    public static final ToggleableState f41898d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ToggleableState[] f41899e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f41900f;

    static {
        ToggleableState toggleableState = new ToggleableState("On", 0);
        f41896b = toggleableState;
        ToggleableState toggleableState2 = new ToggleableState("Off", 1);
        f41897c = toggleableState2;
        ToggleableState toggleableState3 = new ToggleableState("Indeterminate", 2);
        f41898d = toggleableState3;
        ToggleableState[] toggleableStateArr = {toggleableState, toggleableState2, toggleableState3};
        f41899e = toggleableStateArr;
        f41900f = c.a(toggleableStateArr);
    }

    public ToggleableState() {
        throw null;
    }

    public static ToggleableState valueOf(String str) {
        return (ToggleableState) Enum.valueOf(ToggleableState.class, str);
    }

    public static ToggleableState[] values() {
        return (ToggleableState[]) f41899e.clone();
    }
}
