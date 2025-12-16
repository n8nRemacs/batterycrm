package androidx.compose.foundation.text.input.internal.undo;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TextUndoOperation.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/undo/TextDeleteType;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextDeleteType {

    /* renamed from: b, reason: collision with root package name */
    public static final TextDeleteType f31466b;

    /* renamed from: c, reason: collision with root package name */
    public static final TextDeleteType f31467c;

    /* renamed from: d, reason: collision with root package name */
    public static final TextDeleteType f31468d;

    /* renamed from: e, reason: collision with root package name */
    public static final TextDeleteType f31469e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ TextDeleteType[] f31470f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f31471g;

    static {
        TextDeleteType textDeleteType = new TextDeleteType("Start", 0);
        f31466b = textDeleteType;
        TextDeleteType textDeleteType2 = new TextDeleteType("End", 1);
        f31467c = textDeleteType2;
        TextDeleteType textDeleteType3 = new TextDeleteType("Inner", 2);
        f31468d = textDeleteType3;
        TextDeleteType textDeleteType4 = new TextDeleteType("NotByUser", 3);
        f31469e = textDeleteType4;
        TextDeleteType[] textDeleteTypeArr = {textDeleteType, textDeleteType2, textDeleteType3, textDeleteType4};
        f31470f = textDeleteTypeArr;
        f31471g = c.a(textDeleteTypeArr);
    }

    public TextDeleteType() {
        throw null;
    }

    public static TextDeleteType valueOf(String str) {
        return (TextDeleteType) Enum.valueOf(TextDeleteType.class, str);
    }

    public static TextDeleteType[] values() {
        return (TextDeleteType[]) f31470f.clone();
    }
}
