package androidx.compose.foundation.text;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CoreTextField.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/HandleState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HandleState {

    /* renamed from: b, reason: collision with root package name */
    public static final HandleState f30333b;

    /* renamed from: c, reason: collision with root package name */
    public static final HandleState f30334c;

    /* renamed from: d, reason: collision with root package name */
    public static final HandleState f30335d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ HandleState[] f30336e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f30337f;

    static {
        HandleState handleState = new HandleState("None", 0);
        f30333b = handleState;
        HandleState handleState2 = new HandleState("Selection", 1);
        f30334c = handleState2;
        HandleState handleState3 = new HandleState("Cursor", 2);
        f30335d = handleState3;
        HandleState[] handleStateArr = {handleState, handleState2, handleState3};
        f30336e = handleStateArr;
        f30337f = kotlin.enums.c.a(handleStateArr);
    }

    public HandleState() {
        throw null;
    }

    public static HandleState valueOf(String str) {
        return (HandleState) Enum.valueOf(HandleState.class, str);
    }

    public static HandleState[] values() {
        return (HandleState[]) f30336e.clone();
    }
}
