package K0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import androidx.annotation.RestrictTo;
import androidx.core.view.AbstractC22810b;
import j.N;
import j.P;

/* compiled from: SupportMenuItem.java */
@RestrictTo
/* loaded from: classes.dex */
public interface b extends MenuItem {
    @P
    AbstractC22810b a();

    @N
    b b(@P AbstractC22810b abstractC22810b);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    @P
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    @P
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    @P
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    @P
    CharSequence getTooltipText();

    @Override // android.view.MenuItem
    @N
    MenuItem setAlphabeticShortcut(char c12, int i12);

    @Override // android.view.MenuItem
    @N
    b setContentDescription(@P CharSequence charSequence);

    @Override // android.view.MenuItem
    @N
    MenuItem setIconTintList(@P ColorStateList colorStateList);

    @Override // android.view.MenuItem
    @N
    MenuItem setIconTintMode(@P PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    @N
    MenuItem setNumericShortcut(char c12, int i12);

    @Override // android.view.MenuItem
    @N
    MenuItem setShortcut(char c12, char c13, int i12, int i13);

    @Override // android.view.MenuItem
    @N
    b setTooltipText(@P CharSequence charSequence);
}
