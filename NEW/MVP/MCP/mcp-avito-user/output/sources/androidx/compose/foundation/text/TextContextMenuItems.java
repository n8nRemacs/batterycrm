package androidx.compose.foundation.text;

import android.R;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ContextMenu.android.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/TextContextMenuItems;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextContextMenuItems {

    /* renamed from: c, reason: collision with root package name */
    public static final TextContextMenuItems f30549c;

    /* renamed from: d, reason: collision with root package name */
    public static final TextContextMenuItems f30550d;

    /* renamed from: e, reason: collision with root package name */
    public static final TextContextMenuItems f30551e;

    /* renamed from: f, reason: collision with root package name */
    public static final TextContextMenuItems f30552f;

    /* renamed from: g, reason: collision with root package name */
    public static final TextContextMenuItems f30553g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ TextContextMenuItems[] f30554h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f30555i;

    /* renamed from: b, reason: collision with root package name */
    public final int f30556b;

    static {
        TextContextMenuItems textContextMenuItems = new TextContextMenuItems("Cut", 0, R.string.cut);
        f30549c = textContextMenuItems;
        TextContextMenuItems textContextMenuItems2 = new TextContextMenuItems("Copy", 1, R.string.copy);
        f30550d = textContextMenuItems2;
        TextContextMenuItems textContextMenuItems3 = new TextContextMenuItems("Paste", 2, R.string.paste);
        f30551e = textContextMenuItems3;
        TextContextMenuItems textContextMenuItems4 = new TextContextMenuItems("SelectAll", 3, R.string.selectAll);
        f30552f = textContextMenuItems4;
        TextContextMenuItems textContextMenuItems5 = new TextContextMenuItems("Autofill", 4, R.string.autofill);
        f30553g = textContextMenuItems5;
        TextContextMenuItems[] textContextMenuItemsArr = {textContextMenuItems, textContextMenuItems2, textContextMenuItems3, textContextMenuItems4, textContextMenuItems5};
        f30554h = textContextMenuItemsArr;
        f30555i = kotlin.enums.c.a(textContextMenuItemsArr);
    }

    public TextContextMenuItems(String str, int i12, int i13) {
        this.f30556b = i13;
    }

    public static TextContextMenuItems valueOf(String str) {
        return (TextContextMenuItems) Enum.valueOf(TextContextMenuItems.class, str);
    }

    public static TextContextMenuItems[] values() {
        return (TextContextMenuItems[]) f30554h.clone();
    }
}
