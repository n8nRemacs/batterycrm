package com.avito.android.advert_collection;

import I7.a;
import android.view.MenuItem;
import androidx.appcompat.widget.Toolbar;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.avito.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class p implements Toolbar.h, SwipeRefreshLayout.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f81688b;

    public /* synthetic */ p(z zVar) {
        this.f81688b = zVar;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        this.f81688b.f81707e.accept(a.r.f7972a);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        A a12 = this.f81688b.f81707e;
        if (itemId == R.id.more) {
            a12.accept(a.n.f7967a);
            return true;
        }
        if (itemId != R.id.share) {
            return true;
        }
        a12.accept(a.t.f7974a);
        return true;
    }
}
