package com.avito.android.lib.design.tab_bar;

import Y61.k;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.avito.android.R;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.d;
import com.avito.android.lib.design.tab_bar.b;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: TabBarItemView.kt */
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002R\u001a\u0010\b\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R*\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/avito/android/lib/design/tab_bar/c;", "Landroid/view/ViewGroup;", "Lcom/avito/android/lib/design/tab_bar/a;", "", "d", "I", "getIconSize$_design_modules_components", "()I", "iconSize", "Lcom/avito/android/lib/design/tab_bar/b;", "value", "e", "Lcom/avito/android/lib/design/tab_bar/b;", "getTabBarItem", "()Lcom/avito/android/lib/design/tab_bar/b;", "setTabBarItem", "(Lcom/avito/android/lib/design/tab_bar/b;)V", "tabBarItem", "Landroidx/appcompat/widget/AppCompatImageView;", "f", "Landroidx/appcompat/widget/AppCompatImageView;", "getIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "icon", "Lcom/avito/android/lib/design/badge/Badge;", "g", "Lcom/avito/android/lib/design/badge/Badge;", "getNotification", "()Lcom/avito/android/lib/design/badge/Badge;", NotificationsSettings.Section.SECTION_PAID_SERVICES, "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c extends ViewGroup implements a {

    /* renamed from: b, reason: collision with root package name */
    public final int f180702b;

    /* renamed from: c, reason: collision with root package name */
    public final int f180703c;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int iconSize;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    public b tabBarItem;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public final AppCompatImageView icon;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public final Badge notification;

    /* JADX WARN: Illegal instructions before constructor call */
    public c(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) throws Resources.NotFoundException {
        attributeSet = (i13 & 2) != 0 ? null : attributeSet;
        i12 = (i13 & 4) != 0 ? R.attr.tabBarItemIconWithMediumBadge : i12;
        super(context, attributeSet);
        this.tabBarItem = b.e.f180697c;
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setId(R.id.tab_bar_item_icon);
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        appCompatImageView.setDuplicateParentStateEnabled(true);
        this.icon = appCompatImageView;
        Badge badge = new Badge(context, null, 0, 0, 12, null);
        badge.setId(R.id.tab_bar_item_badge);
        badge.setTextViewId(R.id.tab_bar_item_badge_text);
        badge.setVisibility(8);
        this.notification = badge;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.n.f178928J0, i12, 0);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.iconSize = dimensionPixelSize;
        this.f180702b = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f180703c = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        typedArrayObtainStyledAttributes.recycle();
        getNotification().setAppearance(resourceId);
        addView(getIcon(), dimensionPixelSize, dimensionPixelSize);
        addView(getNotification());
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public AppCompatImageView getIcon() {
        return this.icon;
    }

    /* renamed from: getIconSize$_design_modules_components, reason: from getter */
    public final int getIconSize() {
        return this.iconSize;
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public Badge getNotification() {
        return this.notification;
    }

    @Override // com.avito.android.lib.design.tab_bar.a
    @k
    public b getTabBarItem() {
        return this.tabBarItem;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        getIcon().layout(0, 0, getIcon().getMeasuredWidth(), getIcon().getMeasuredHeight());
        int measuredWidth = (getIcon().getMeasuredWidth() - (getNotification().getMeasuredWidth() / 2)) + this.f180702b;
        int i16 = (-(getNotification().getMeasuredHeight() / 2)) + this.f180703c;
        getNotification().layout(measuredWidth, i16, getNotification().getMeasuredWidth() + measuredWidth, getNotification().getMeasuredHeight() + i16);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.iconSize, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        getIcon().measure(iMakeMeasureSpec, iMakeMeasureSpec);
        getNotification().measure(iMakeMeasureSpec2, iMakeMeasureSpec2);
        setMeasuredDimension(getIcon().getMeasuredWidth(), getIcon().getMeasuredHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    @Override // com.avito.android.lib.design.tab_bar.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setTabBarItem(@Y61.k com.avito.android.lib.design.tab_bar.b r5) {
        /*
            r4 = this;
            r4.tabBarItem = r5
            boolean r0 = r5 instanceof com.avito.android.lib.design.tab_bar.b.g
            if (r0 == 0) goto L2b
            r1 = r5
            com.avito.android.lib.design.tab_bar.b$g r1 = (com.avito.android.lib.design.tab_bar.b.g) r1
            com.avito.android.lib.design.tab_bar.b$g$a r1 = r1.f180699c
            boolean r2 = r1 instanceof com.avito.android.lib.design.tab_bar.b.g.a.C5308b
            if (r2 == 0) goto L2b
            androidx.appcompat.widget.AppCompatImageView r2 = r4.getIcon()
            com.avito.android.lib.design.tab_bar.b$g$a$b r1 = (com.avito.android.lib.design.tab_bar.b.g.a.C5308b) r1
            android.view.ViewParent r3 = r4.getParent()
            boolean r3 = r3 instanceof com.avito.android.lib.design.tab_bar.d
            r1.getClass()
            if (r3 == 0) goto L24
            r1 = 2131231639(0x7f080397, float:1.8079365E38)
            goto L27
        L24:
            r1 = 2131231638(0x7f080396, float:1.8079363E38)
        L27:
            r2.setBackgroundResource(r1)
            goto L33
        L2b:
            androidx.appcompat.widget.AppCompatImageView r1 = r4.getIcon()
            r2 = 0
            r1.setBackground(r2)
        L33:
            if (r0 == 0) goto L3e
            r0 = r5
            com.avito.android.lib.design.tab_bar.b$g r0 = (com.avito.android.lib.design.tab_bar.b.g) r0
            com.avito.android.lib.design.tab_bar.b$g$a r0 = r0.f180699c
            boolean r0 = r0 instanceof com.avito.android.lib.design.tab_bar.b.g.a.C5308b
            if (r0 != 0) goto L47
        L3e:
            androidx.appcompat.widget.AppCompatImageView r0 = r4.getIcon()
            int r5 = r5.f180693a
            r0.setImageResource(r5)
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.lib.design.tab_bar.c.setTabBarItem(com.avito.android.lib.design.tab_bar.b):void");
    }
}
