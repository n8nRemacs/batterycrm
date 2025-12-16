package com.avito.android.advert.notes;

import Lw.InterfaceC14443a;
import android.view.MenuItem;
import com.avito.android.R;
import com.avito.android.advert.notes.v;
import com.avito.android.help_center.L;
import com.avito.android.vas_planning_checkout.z;
import iR.C41336a;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class x implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80949b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80950c;

    public /* synthetic */ x(Object obj, int i12) {
        this.f80949b = i12;
        this.f80950c = obj;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f80949b) {
            case 0:
                ((y) this.f80950c).f80952b.accept(new v.b());
                return true;
            case 1:
                ((com.avito.android.developments_agency_search.screen.realty_agency_search.view_holder.j) this.f80950c).f139026a.invoke(InterfaceC14443a.g.f10202a);
                return true;
            case 2:
                if (menuItem.getItemId() != R.id.home) {
                    return false;
                }
                ((L) this.f80950c).f161613a.accept(G0.f406611a);
                return true;
            case 3:
                C41336a.C11375a.a();
                return ((MenuItem.OnMenuItemClickListener) this.f80950c).onMenuItemClick(menuItem);
            default:
                ((z) this.f80950c).f323033c.q5();
                return true;
        }
    }
}
