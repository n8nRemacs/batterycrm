package com.avito.android.service_orders.list;

import Mu0.InterfaceC14531a;
import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f279384b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f279385c;

    public /* synthetic */ k(l lVar, int i12) {
        this.f279384b = i12;
        this.f279385c = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f279384b) {
            case 0:
                this.f279385c.f279388c.accept(InterfaceC14531a.b.f11051a);
                break;
            default:
                this.f279385c.f279388c.accept(InterfaceC14531a.k.f11062a);
                break;
        }
    }
}
