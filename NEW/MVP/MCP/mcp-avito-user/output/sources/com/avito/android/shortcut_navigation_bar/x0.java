package com.avito.android.shortcut_navigation_bar;

import com.avito.android.remote.model.search.Filter;
import com.avito.android.shortcut_navigation_bar.adapter.CollapsedShortcutItem;
import com.avito.android.shortcut_navigation_bar.adapter.InlineFilterNavigationItem;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItemImpl;
import kotlin.Metadata;

/* compiled from: ShortcutsComparator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/shortcut_navigation_bar/x0;", "Lcom/avito/android/recycler/data_aware/b;", "<init>", "()V", "_avito_shortcut-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class x0 implements com.avito.android.recycler.data_aware.b {
    @Override // com.avito.android.recycler.data_aware.b
    public final boolean a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if ((aVar instanceof CollapsedShortcutItem) && (aVar2 instanceof CollapsedShortcutItem)) {
            CollapsedShortcutItem collapsedShortcutItem = (CollapsedShortcutItem) aVar;
            CollapsedShortcutItem collapsedShortcutItem2 = (CollapsedShortcutItem) aVar2;
            if (collapsedShortcutItem.f283222p == collapsedShortcutItem2.f283222p && kotlin.jvm.internal.L.f(collapsedShortcutItem.f283233h, collapsedShortcutItem2.f283233h) && kotlin.jvm.internal.L.f(collapsedShortcutItem.f283228c, collapsedShortcutItem2.f283228c) && kotlin.jvm.internal.L.f(collapsedShortcutItem.f283221o, collapsedShortcutItem2.f283221o) && kotlin.jvm.internal.L.f(collapsedShortcutItem.f283229d, collapsedShortcutItem2.f283229d) && kotlin.jvm.internal.L.f(collapsedShortcutItem.f283220n, collapsedShortcutItem2.f283220n)) {
                return true;
            }
        } else if ((aVar instanceof InlineFilterNavigationItem) && (aVar2 instanceof InlineFilterNavigationItem)) {
            InlineFilterNavigationItem inlineFilterNavigationItem = (InlineFilterNavigationItem) aVar;
            InlineFilterNavigationItem inlineFilterNavigationItem2 = (InlineFilterNavigationItem) aVar2;
            if (kotlin.jvm.internal.L.f(inlineFilterNavigationItem.f283233h, inlineFilterNavigationItem2.f283233h)) {
                Filter filter = inlineFilterNavigationItem.f283232g;
                Long attrId = filter != null ? filter.getAttrId() : null;
                Filter filter2 = inlineFilterNavigationItem2.f283232g;
                if (kotlin.jvm.internal.L.f(attrId, filter2 != null ? filter2.getAttrId() : null)) {
                    if (kotlin.jvm.internal.L.f(filter != null ? filter.getId() : null, filter2 != null ? filter2.getId() : null) && kotlin.jvm.internal.L.f(inlineFilterNavigationItem.f283228c, inlineFilterNavigationItem2.f283228c) && kotlin.jvm.internal.L.f(inlineFilterNavigationItem.getF283245d(), inlineFilterNavigationItem2.getF283245d()) && kotlin.jvm.internal.L.f(inlineFilterNavigationItem.f283229d, inlineFilterNavigationItem2.f283229d) && kotlin.jvm.internal.L.f(inlineFilterNavigationItem.getF283244c(), inlineFilterNavigationItem2.getF283244c())) {
                        return true;
                    }
                }
            }
        } else if ((aVar instanceof ShortcutNavigationItemImpl) && (aVar2 instanceof ShortcutNavigationItemImpl)) {
            ShortcutNavigationItemImpl shortcutNavigationItemImpl = (ShortcutNavigationItemImpl) aVar;
            ShortcutNavigationItemImpl shortcutNavigationItemImpl2 = (ShortcutNavigationItemImpl) aVar2;
            if (kotlin.jvm.internal.L.f(shortcutNavigationItemImpl.f283244c, shortcutNavigationItemImpl2.f283244c) && kotlin.jvm.internal.L.f(shortcutNavigationItemImpl.f283245d, shortcutNavigationItemImpl2.f283245d) && shortcutNavigationItemImpl.f283247f == shortcutNavigationItemImpl2.f283247f && kotlin.jvm.internal.L.f(shortcutNavigationItemImpl.f283248g, shortcutNavigationItemImpl2.f283248g)) {
                return true;
            }
        }
        return false;
    }
}
