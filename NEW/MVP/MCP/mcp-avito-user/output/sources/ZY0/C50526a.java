package zY0;

import android.R;
import android.content.res.ColorStateList;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.color.k;
import j.P;

/* compiled from: SwitchMaterial.java */
/* renamed from: zY0.a, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C50526a extends SwitchCompat {

    /* renamed from: W, reason: collision with root package name */
    public static final int[][] f444063W = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: U, reason: collision with root package name */
    @P
    public ColorStateList f444064U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f444065V;

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        throw null;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f444064U == null) {
            int iD2 = k.d(this, com.google.android.material.R.attr.colorSurface);
            int iD3 = k.d(this, com.google.android.material.R.attr.colorControlActivated);
            int iD4 = k.d(this, com.google.android.material.R.attr.colorOnSurface);
            this.f444064U = new ColorStateList(f444063W, new int[]{k.f(0.54f, iD2, iD3), k.f(0.32f, iD2, iD4), k.f(0.12f, iD2, iD3), k.f(0.12f, iD2, iD4)});
        }
        return this.f444064U;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f444065V && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f444065V && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z12) {
        this.f444065V = z12;
        if (z12) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }
}
