package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextEditType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextEditType {

    /* renamed from: b, reason: collision with root package name */
    public static final TextEditType f31472b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextEditType f31473c;

    /* renamed from: d, reason: collision with root package name */
    public static final TextEditType f31474d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ TextEditType[] f31475e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f31476f;

    static {
        TextEditType textEditType = new TextEditType("Insert", 0);
        f31472b = textEditType;
        TextEditType textEditType2 = new TextEditType("Delete", 1);
        f31473c = textEditType2;
        TextEditType textEditType3 = new TextEditType("Replace", 2);
        f31474d = textEditType3;
        TextEditType[] textEditTypeArr = {textEditType, textEditType2, textEditType3};
        f31475e = textEditTypeArr;
        f31476f = c.a(textEditTypeArr);
    }

    public TextEditType() {
        throw null;
    }

    public static TextEditType valueOf(String str) {
        return (TextEditType) Enum.valueOf(TextEditType.class, str);
    }

    public static TextEditType[] values() {
        return (TextEditType[]) f31475e.clone();
    }
}
