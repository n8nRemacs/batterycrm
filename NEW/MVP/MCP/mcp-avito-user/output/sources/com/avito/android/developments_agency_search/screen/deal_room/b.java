package com.avito.android.developments_agency_search.screen.deal_room;

import Cw.InterfaceC13362a;
import Hs0.InterfaceC14030a;
import android.view.MenuItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class b implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f137462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f137463c;

    public /* synthetic */ b(int i12, Y41.l lVar) {
        this.f137462b = i12;
        this.f137463c = lVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f137462b) {
            case 0:
                this.f137463c.invoke(InterfaceC13362a.k.f2752a);
                break;
            default:
                this.f137463c.invoke(InterfaceC14030a.c.f7780a);
                break;
        }
        return true;
    }
}
