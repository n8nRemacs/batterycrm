package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.z;
import com.google.android.material.shape.m;
import j.D;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.f0;
import j.r;

/* loaded from: classes6.dex */
public class NavigationView extends z {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f356848d = 0;

    /* renamed from: c, reason: collision with root package name */
    public a f356849c;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @P
        public Bundle f356850d;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @N
            public final SavedState createFromParcel(@N Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @N
            public final Object[] newArray(int i12) {
                return new SavedState[i12];
            }

            @Override // android.os.Parcelable.Creator
            @P
            public final Object createFromParcel(@N Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(@N Parcel parcel, @P ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f356850d = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeBundle(this.f356850d);
        }
    }

    public interface a {
    }

    private MenuInflater getMenuInflater() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@N Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @P
    public MenuItem getCheckedItem() {
        throw null;
    }

    @U
    public int getDividerInsetEnd() {
        throw null;
    }

    @U
    public int getDividerInsetStart() {
        throw null;
    }

    public int getHeaderCount() {
        throw null;
    }

    @P
    public Drawable getItemBackground() {
        throw null;
    }

    @r
    public int getItemHorizontalPadding() {
        throw null;
    }

    @r
    public int getItemIconPadding() {
        throw null;
    }

    @P
    public ColorStateList getItemIconTintList() {
        throw null;
    }

    public int getItemMaxLines() {
        throw null;
    }

    @P
    public ColorStateList getItemTextColor() {
        throw null;
    }

    @U
    public int getItemVerticalPadding() {
        throw null;
    }

    @N
    public Menu getMenu() {
        return null;
    }

    @U
    public int getSubheaderInsetEnd() {
        throw null;
    }

    @U
    public int getSubheaderInsetStart() {
        throw null;
    }

    @Override // com.google.android.material.internal.z, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.d(this);
    }

    @Override // com.google.android.material.internal.z, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        if (mode == Integer.MIN_VALUE) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i12), 0), 1073741824);
        } else if (mode == 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState) parcelable).f45355b);
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f356850d = new Bundle();
        throw null;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i12, int i13, int i14, int i15) {
        super.onSizeChanged(i12, i13, i14, i15);
        boolean z12 = getParent() instanceof DrawerLayout;
        throw null;
    }

    public void setCheckedItem(@D int i12) {
        throw null;
    }

    public void setDividerInsetEnd(@U int i12) {
        throw null;
    }

    public void setDividerInsetStart(@U int i12) {
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        m.b(this, f12);
    }

    public void setItemBackground(@P Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(@InterfaceC42165v int i12) {
        setItemBackground(androidx.core.content.d.getDrawable(getContext(), i12));
    }

    public void setItemHorizontalPadding(@r int i12) {
        throw null;
    }

    public void setItemHorizontalPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        getResources().getDimensionPixelSize(i12);
        throw null;
    }

    public void setItemIconPadding(@r int i12) {
        throw null;
    }

    public void setItemIconPaddingResource(int i12) throws Resources.NotFoundException {
        getResources().getDimensionPixelSize(i12);
        throw null;
    }

    public void setItemIconSize(@r int i12) {
        throw null;
    }

    public void setItemIconTintList(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setItemMaxLines(int i12) {
        throw null;
    }

    public void setItemTextAppearance(@f0 int i12) {
        throw null;
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setItemVerticalPadding(@U int i12) {
        throw null;
    }

    public void setItemVerticalPaddingResource(@InterfaceC42161q int i12) throws Resources.NotFoundException {
        getResources().getDimensionPixelSize(i12);
        throw null;
    }

    public void setNavigationItemSelectedListener(@P a aVar) {
        this.f356849c = aVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i12) {
        super.setOverScrollMode(i12);
    }

    public void setSubheaderInsetEnd(@U int i12) {
        throw null;
    }

    public void setSubheaderInsetStart(@U int i12) {
        throw null;
    }

    public void setCheckedItem(@N MenuItem menuItem) {
        menuItem.getItemId();
        throw null;
    }

    public void setBottomInsetScrimEnabled(boolean z12) {
    }

    public void setTopInsetScrimEnabled(boolean z12) {
    }
}
