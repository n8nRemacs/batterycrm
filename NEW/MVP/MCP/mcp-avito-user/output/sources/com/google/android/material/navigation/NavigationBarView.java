package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.m;
import com.google.android.material.shape.q;
import j.D;
import j.InterfaceC42161q;
import j.InterfaceC42165v;
import j.N;
import j.P;
import j.U;
import j.f0;
import j.r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes6.dex */
public abstract class NavigationBarView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public c f356845b;

    /* renamed from: c, reason: collision with root package name */
    public b f356846c;

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* renamed from: d, reason: collision with root package name */
        @P
        public Bundle f356847d;

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

        public SavedState(@N Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f356847d = parcel.readBundle(classLoader == null ? getClass().getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(@N Parcel parcel, int i12) {
            super.writeToParcel(parcel, i12);
            parcel.writeBundle(this.f356847d);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface a {
    }

    public interface b {
    }

    public interface c {
    }

    private MenuInflater getMenuInflater() {
        return null;
    }

    @P
    public ColorStateList getItemActiveIndicatorColor() {
        throw null;
    }

    @U
    public int getItemActiveIndicatorHeight() {
        throw null;
    }

    @U
    public int getItemActiveIndicatorMarginHorizontal() {
        throw null;
    }

    @P
    public q getItemActiveIndicatorShapeAppearance() {
        throw null;
    }

    @U
    public int getItemActiveIndicatorWidth() {
        throw null;
    }

    @P
    public Drawable getItemBackground() {
        throw null;
    }

    @InterfaceC42165v
    @Deprecated
    public int getItemBackgroundResource() {
        throw null;
    }

    @r
    public int getItemIconSize() {
        throw null;
    }

    @P
    public ColorStateList getItemIconTintList() {
        throw null;
    }

    @U
    public int getItemPaddingBottom() {
        throw null;
    }

    @U
    public int getItemPaddingTop() {
        throw null;
    }

    @P
    public ColorStateList getItemRippleColor() {
        throw null;
    }

    @f0
    public int getItemTextAppearanceActive() {
        throw null;
    }

    @f0
    public int getItemTextAppearanceInactive() {
        throw null;
    }

    @P
    public ColorStateList getItemTextColor() {
        throw null;
    }

    public int getLabelVisibilityMode() {
        throw null;
    }

    public abstract int getMaxItemCount();

    @N
    public Menu getMenu() {
        return null;
    }

    @N
    @RestrictTo
    public p getMenuView() {
        return null;
    }

    @N
    @RestrictTo
    public NavigationBarPresenter getPresenter() {
        return null;
    }

    @D
    public int getSelectedItemId() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        m.d(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(@P Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            super.onRestoreInstanceState(((SavedState) parcelable).f45355b);
            throw null;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    @N
    public final Parcelable onSaveInstanceState() {
        new SavedState(super.onSaveInstanceState()).f356847d = new Bundle();
        throw null;
    }

    @Override // android.view.View
    public void setElevation(float f12) {
        super.setElevation(f12);
        m.b(this, f12);
    }

    public void setItemActiveIndicatorColor(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setItemActiveIndicatorEnabled(boolean z12) {
        throw null;
    }

    public void setItemActiveIndicatorHeight(@U int i12) {
        throw null;
    }

    public void setItemActiveIndicatorMarginHorizontal(@U int i12) {
        throw null;
    }

    public void setItemActiveIndicatorShapeAppearance(@P q qVar) {
        throw null;
    }

    public void setItemActiveIndicatorWidth(@U int i12) {
        throw null;
    }

    public void setItemBackground(@P Drawable drawable) {
        throw null;
    }

    public void setItemBackgroundResource(@InterfaceC42165v int i12) {
        throw null;
    }

    public void setItemIconSize(@r int i12) {
        throw null;
    }

    public void setItemIconSizeRes(@InterfaceC42161q int i12) {
        setItemIconSize(getResources().getDimensionPixelSize(i12));
    }

    public void setItemIconTintList(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setItemPaddingBottom(@U int i12) {
        throw null;
    }

    public void setItemPaddingTop(@U int i12) {
        throw null;
    }

    public void setItemRippleColor(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setItemTextAppearanceActive(@f0 int i12) {
        throw null;
    }

    public void setItemTextAppearanceInactive(@f0 int i12) {
        throw null;
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        throw null;
    }

    public void setLabelVisibilityMode(int i12) {
        throw null;
    }

    public void setOnItemReselectedListener(@P b bVar) {
        this.f356846c = bVar;
    }

    public void setOnItemSelectedListener(@P c cVar) {
        this.f356845b = cVar;
    }

    public void setSelectedItemId(@D int i12) {
        throw null;
    }
}
