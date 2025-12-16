package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldEditUndoBehavior {

    /* renamed from: b, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f31477b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextFieldEditUndoBehavior f31478c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ TextFieldEditUndoBehavior[] f31479d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f31480e;

    static {
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = new TextFieldEditUndoBehavior("MergeIfPossible", 0);
        f31477b = textFieldEditUndoBehavior;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = new TextFieldEditUndoBehavior("ClearHistory", 1);
        TextFieldEditUndoBehavior textFieldEditUndoBehavior3 = new TextFieldEditUndoBehavior("NeverMerge", 2);
        f31478c = textFieldEditUndoBehavior3;
        TextFieldEditUndoBehavior[] textFieldEditUndoBehaviorArr = {textFieldEditUndoBehavior, textFieldEditUndoBehavior2, textFieldEditUndoBehavior3};
        f31479d = textFieldEditUndoBehaviorArr;
        f31480e = c.a(textFieldEditUndoBehaviorArr);
    }

    public TextFieldEditUndoBehavior() {
        throw null;
    }

    public static TextFieldEditUndoBehavior valueOf(String str) {
        return (TextFieldEditUndoBehavior) Enum.valueOf(TextFieldEditUndoBehavior.class, str);
    }

    public static TextFieldEditUndoBehavior[] values() {
        return (TextFieldEditUndoBehavior[]) f31479d.clone();
    }
}
