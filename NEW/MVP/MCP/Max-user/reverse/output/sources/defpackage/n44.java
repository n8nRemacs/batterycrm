package defpackage;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

/* loaded from: classes.dex */
public abstract class n44 {
    public static Context a(Context context, String str) {
        return context.createAttributionContext(str);
    }

    public static String b(Context context) {
        return context.getAttributionTag();
    }

    public static void c(EditorInfo editorInfo, CharSequence charSequence) {
        editorInfo.setInitialSurroundingSubText(charSequence, 0);
    }
}
