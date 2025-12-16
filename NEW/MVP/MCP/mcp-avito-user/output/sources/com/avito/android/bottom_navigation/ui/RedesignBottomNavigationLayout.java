package com.avito.android.bottom_navigation.ui;

import Xj.c;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.LinearLayoutCompat;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: RedesignBottomNavigationLayout.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/avito/android/bottom_navigation/ui/RedesignBottomNavigationLayout;", "Landroidx/appcompat/widget/LinearLayoutCompat;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "LXj/c;", "listener", "Lkotlin/G0;", "setOnTabClickListener", "(LXj/c;)V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RedesignBottomNavigationLayout extends LinearLayoutCompat {

    /* renamed from: q, reason: collision with root package name */
    public LinkedHashMap f107106q;

    /* renamed from: r, reason: collision with root package name */
    @l
    public c f107107r;

    public RedesignBottomNavigationLayout(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public final void n(@k NavigationTabSetItem navigationTabSetItem) {
        LinkedHashMap linkedHashMap = this.f107106q;
        if (linkedHashMap == null) {
            linkedHashMap = null;
        }
        BottomNavigationTabView bottomNavigationTabView = (BottomNavigationTabView) linkedHashMap.get(navigationTabSetItem);
        if (bottomNavigationTabView == null || bottomNavigationTabView.isSelected()) {
            return;
        }
        LinkedHashMap linkedHashMap2 = this.f107106q;
        Iterator it = (linkedHashMap2 != null ? linkedHashMap2 : null).values().iterator();
        while (it.hasNext()) {
            ((BottomNavigationTabView) it.next()).setSelected(false);
        }
        bottomNavigationTabView.setSelected(true);
    }

    public final void setOnTabClickListener(@k c listener) {
        this.f107107r = listener;
    }
}
