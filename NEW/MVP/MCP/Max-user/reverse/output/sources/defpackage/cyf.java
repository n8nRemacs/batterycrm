package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes.dex */
public class cyf implements c85 {
    public static cyf a;

    public static RectF b(TabLayout tabLayout, View view) {
        if (view == null) {
            return new RectF();
        }
        if (tabLayout.Q0 || !(view instanceof kyf)) {
            return new RectF(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        kyf kyfVar = (kyf) view;
        int contentWidth = kyfVar.getContentWidth();
        int contentHeight = kyfVar.getContentHeight();
        int iB = (int) yqi.b(kyfVar.getContext(), 24);
        if (contentWidth < iB) {
            contentWidth = iB;
        }
        int right = (kyfVar.getRight() + kyfVar.getLeft()) / 2;
        int bottom = (kyfVar.getBottom() + kyfVar.getTop()) / 2;
        int i = contentWidth / 2;
        return new RectF(right - i, bottom - (contentHeight / 2), i + right, (right / 2) + bottom);
    }

    @Override // defpackage.c85
    public u70 a(Context context, String str, b85 b85Var) {
        u70 u70Var = new u70();
        int iA = b85Var.a(context, str, true);
        u70Var.c = iA;
        if (iA != 0) {
            u70Var.d = 1;
            return u70Var;
        }
        int iC = b85Var.c(context, str);
        u70Var.b = iC;
        if (iC != 0) {
            u70Var.d = -1;
        }
        return u70Var;
    }

    public void c(TabLayout tabLayout, View view, View view2, float f, Drawable drawable) {
        RectF rectFB = b(tabLayout, view);
        RectF rectFB2 = b(tabLayout, view2);
        drawable.setBounds(rg.c((int) rectFB.left, f, (int) rectFB2.left), drawable.getBounds().top, rg.c((int) rectFB.right, f, (int) rectFB2.right), drawable.getBounds().bottom);
    }
}
