package com.avito.android.bottom_navigation.ui;

import Xj.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.R;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.y;
import com.avito.android.util.C35835l0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GlobalBottomNavigationLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/GlobalBottomNavigationLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXj/c;", "listener", "Lkotlin/G0;", "setOnTabClickListener", "(LXj/c;)V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GlobalBottomNavigationLayout extends LinearLayoutCompat {

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f107095q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public c f107096r;

    public GlobalBottomNavigationLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public final void n(@k NavigationTabSetItem navigationTabSetItem) {
        LinkedHashMap linkedHashMap = this.f107095q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        GlobalBottomNavigationTabView globalBottomNavigationTabView = (GlobalBottomNavigationTabView) linkedHashMap.get(navigationTabSetItem);
        if (globalBottomNavigationTabView == null || globalBottomNavigationTabView.isSelected()) {
            return;
        }
        LinkedHashMap linkedHashMap2 = this.f107095q;
        for (Map.Entry entry : (linkedHashMap2 != null ? linkedHashMap2 : null).entrySet()) {
            NavigationTabSetItem navigationTabSetItem2 = (NavigationTabSetItem) entry.getKey();
            GlobalBottomNavigationTabView globalBottomNavigationTabView2 = (GlobalBottomNavigationTabView) entry.getValue();
            globalBottomNavigationTabView2.setSelected(false);
            if (y.a(navigationTabSetItem2)) {
                globalBottomNavigationTabView2.getIcon$_avito_bottom_navigation_impl().setColorFilter(C35835l0.d(R.attr.components_tabBar_default, getContext()));
            }
        }
        globalBottomNavigationTabView.setSelected(true);
        if (y.a(navigationTabSetItem)) {
            globalBottomNavigationTabView.getIcon$_avito_bottom_navigation_impl().setColorFilter(C35835l0.d(R.attr.components_control_text_primary, getContext()));
        }
    }

    public final void setOnTabClickListener(@k c listener) {
        this.f107096r = listener;
    }
}
