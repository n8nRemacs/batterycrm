package com.avito.android.campaigns_sale;

import android.view.MenuItem;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes12.dex */
public final /* synthetic */ class y implements MenuItem.OnMenuItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f114450b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f114451c;

    public /* synthetic */ y(int i12, Y41.a aVar) {
        this.f114450b = i12;
        this.f114451c = aVar;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(MenuItem menuItem) {
        Y41.a aVar = this.f114451c;
        switch (this.f114450b) {
            case 0:
                int i12 = z.f114452s;
                aVar.invoke();
                break;
            default:
                int i13 = com.avito.android.search.subscriptions.adapter.m.f263885h;
                aVar.invoke();
                break;
        }
        return true;
    }
}
