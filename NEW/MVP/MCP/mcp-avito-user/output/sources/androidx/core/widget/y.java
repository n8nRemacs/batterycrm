package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import j.P;

/* compiled from: TintableCompoundButton.java */
/* loaded from: classes.dex */
public interface y {
    @P
    ColorStateList getSupportButtonTintList();

    void setSupportButtonTintList(@P ColorStateList colorStateList);

    void setSupportButtonTintMode(@P PorterDuff.Mode mode);
}
