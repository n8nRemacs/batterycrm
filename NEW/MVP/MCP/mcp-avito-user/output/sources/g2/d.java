package g2;

import android.view.View;
import android.view.ViewGroup;
import j.D;
import j.P;

/* compiled from: ViewBindings.java */
/* loaded from: classes10.dex */
public class d {
    @P
    public static <T extends View> T a(View view, @D int i12) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            T t12 = (T) viewGroup.getChildAt(i13).findViewById(i12);
            if (t12 != null) {
                return t12;
            }
        }
        return null;
    }
}
