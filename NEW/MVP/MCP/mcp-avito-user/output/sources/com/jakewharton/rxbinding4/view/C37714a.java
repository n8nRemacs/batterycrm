package com.jakewharton.rxbinding4.view;

import android.view.MenuItem;
import kotlin.Metadata;

/* compiled from: MenuItemActionViewEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/jakewharton/rxbinding4/view/a;", "Lcom/jakewharton/rxbinding4/view/b;", "rxbinding_release"}, k = 1, mv = {1, 4, 0})
/* renamed from: com.jakewharton.rxbinding4.view.a, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* data */ class C37714a extends AbstractC37715b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MenuItem f364171a;

    public C37714a(@Y61.k MenuItem menuItem) {
        super(null);
        this.f364171a = menuItem;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C37714a) {
            return kotlin.jvm.internal.L.f(this.f364171a, ((C37714a) obj).f364171a);
        }
        return false;
    }

    public final int hashCode() {
        MenuItem menuItem = this.f364171a;
        if (menuItem != null) {
            return menuItem.hashCode();
        }
        return 0;
    }

    @Y61.k
    public final String toString() {
        return "MenuItemActionViewCollapseEvent(menuItem=" + this.f364171a + ")";
    }
}
