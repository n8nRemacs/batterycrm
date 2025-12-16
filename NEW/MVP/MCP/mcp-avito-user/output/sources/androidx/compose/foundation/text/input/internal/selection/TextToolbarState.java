package androidx.compose.foundation.text.input.internal.selection;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextFieldSelectionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/TextToolbarState;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextToolbarState {

    /* renamed from: b, reason: collision with root package name */
    public static final TextToolbarState f31344b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextToolbarState f31345c;

    /* renamed from: d, reason: collision with root package name */
    public static final TextToolbarState f31346d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TextToolbarState[] f31347e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f31348f;

    static {
        TextToolbarState textToolbarState = new TextToolbarState("None", 0);
        f31344b = textToolbarState;
        TextToolbarState textToolbarState2 = new TextToolbarState("Cursor", 1);
        f31345c = textToolbarState2;
        TextToolbarState textToolbarState3 = new TextToolbarState("Selection", 2);
        f31346d = textToolbarState3;
        TextToolbarState[] textToolbarStateArr = {textToolbarState, textToolbarState2, textToolbarState3};
        f31347e = textToolbarStateArr;
        f31348f = kotlin.enums.c.a(textToolbarStateArr);
    }

    public TextToolbarState() {
        throw null;
    }

    public static TextToolbarState valueOf(String str) {
        return (TextToolbarState) Enum.valueOf(TextToolbarState.class, str);
    }

    public static TextToolbarState[] values() {
        return (TextToolbarState[]) f31347e.clone();
    }
}
