package com.google.android.material.navigation;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.p;
import androidx.core.view.accessibility.f;
import com.google.android.material.shape.q;
import j.N;
import j.P;
import j.U;
import j.f0;
import j.r;

/* compiled from: NavigationBarMenuView.java */
@RestrictTo
/* loaded from: classes6.dex */
public abstract class f extends ViewGroup implements p {

    /* renamed from: b, reason: collision with root package name */
    public int f356868b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public ColorStateList f356869c;

    /* renamed from: d, reason: collision with root package name */
    @r
    public int f356870d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f356871e;

    /* renamed from: f, reason: collision with root package name */
    @f0
    public int f356872f;

    /* renamed from: g, reason: collision with root package name */
    @f0
    public int f356873g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f356874h;

    /* renamed from: i, reason: collision with root package name */
    @P
    public ColorStateList f356875i;

    /* renamed from: j, reason: collision with root package name */
    public int f356876j;

    /* renamed from: k, reason: collision with root package name */
    public int f356877k;

    /* renamed from: l, reason: collision with root package name */
    public int f356878l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f356879m;

    /* renamed from: n, reason: collision with root package name */
    public int f356880n;

    /* renamed from: o, reason: collision with root package name */
    public int f356881o;

    /* renamed from: p, reason: collision with root package name */
    public int f356882p;

    /* renamed from: q, reason: collision with root package name */
    public q f356883q;

    /* renamed from: r, reason: collision with root package name */
    public ColorStateList f356884r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.appcompat.view.menu.h f356885s;

    private b getNewItem() {
        throw null;
    }

    private void setBadgeIfNeeded(@N b bVar) {
        if (bVar.getId() != -1) {
            throw null;
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public final void b(@N androidx.appcompat.view.menu.h hVar) {
        this.f356885s = hVar;
    }

    public SparseArray<com.google.android.material.badge.b> getBadgeDrawables() {
        return null;
    }

    @P
    public ColorStateList getIconTintList() {
        return this.f356869c;
    }

    @P
    public ColorStateList getItemActiveIndicatorColor() {
        return this.f356884r;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.f356879m;
    }

    @U
    public int getItemActiveIndicatorHeight() {
        return this.f356881o;
    }

    @U
    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f356882p;
    }

    @P
    public q getItemActiveIndicatorShapeAppearance() {
        return this.f356883q;
    }

    @U
    public int getItemActiveIndicatorWidth() {
        return this.f356880n;
    }

    @P
    public Drawable getItemBackground() {
        return this.f356874h;
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.f356876j;
    }

    @r
    public int getItemIconSize() {
        return this.f356870d;
    }

    @U
    public int getItemPaddingBottom() {
        return this.f356878l;
    }

    @U
    public int getItemPaddingTop() {
        return this.f356877k;
    }

    @P
    public ColorStateList getItemRippleColor() {
        return this.f356875i;
    }

    @f0
    public int getItemTextAppearanceActive() {
        return this.f356873g;
    }

    @f0
    public int getItemTextAppearanceInactive() {
        return this.f356872f;
    }

    @P
    public ColorStateList getItemTextColor() {
        return this.f356871e;
    }

    public int getLabelVisibilityMode() {
        return this.f356868b;
    }

    @P
    public androidx.appcompat.view.menu.h getMenu() {
        return this.f356885s;
    }

    public int getSelectedItemId() {
        return 0;
    }

    public int getSelectedItemPosition() {
        return 0;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@N AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new androidx.core.view.accessibility.f(accessibilityNodeInfo).m(f.C1754f.a(1, this.f356885s.l().size(), 1));
    }

    public void setIconTintList(@P ColorStateList colorStateList) {
        this.f356869c = colorStateList;
    }

    public void setItemActiveIndicatorColor(@P ColorStateList colorStateList) {
        this.f356884r = colorStateList;
    }

    public void setItemActiveIndicatorEnabled(boolean z12) {
        this.f356879m = z12;
    }

    public void setItemActiveIndicatorHeight(@U int i12) {
        this.f356881o = i12;
    }

    public void setItemActiveIndicatorMarginHorizontal(@U int i12) {
        this.f356882p = i12;
    }

    public void setItemActiveIndicatorShapeAppearance(@P q qVar) {
        this.f356883q = qVar;
    }

    public void setItemActiveIndicatorWidth(@U int i12) {
        this.f356880n = i12;
    }

    public void setItemBackground(@P Drawable drawable) {
        this.f356874h = drawable;
    }

    public void setItemBackgroundRes(int i12) {
        this.f356876j = i12;
    }

    public void setItemIconSize(@r int i12) {
        this.f356870d = i12;
    }

    public void setItemPaddingBottom(@U int i12) {
        this.f356878l = i12;
    }

    public void setItemPaddingTop(@U int i12) {
        this.f356877k = i12;
    }

    public void setItemRippleColor(@P ColorStateList colorStateList) {
        this.f356875i = colorStateList;
    }

    public void setItemTextAppearanceActive(@f0 int i12) {
        this.f356873g = i12;
    }

    public void setItemTextAppearanceInactive(@f0 int i12) {
        this.f356872f = i12;
    }

    public void setItemTextColor(@P ColorStateList colorStateList) {
        this.f356871e = colorStateList;
    }

    public void setLabelVisibilityMode(int i12) {
        this.f356868b = i12;
    }

    public void setItemActiveIndicatorResizeable(boolean z12) {
    }

    public void setPresenter(@N NavigationBarPresenter navigationBarPresenter) {
    }
}
