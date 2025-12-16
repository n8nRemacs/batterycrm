package com.avito.android.service_orders.list;

import Mu0.InterfaceC14531a;
import android.view.View;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_orders.mvi.entity.a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f279380b = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f279381c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a.C8311a f279382d;

    public /* synthetic */ i(l lVar, a.C8311a c8311a) {
        this.f279381c = lVar;
        this.f279382d = c8311a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f279381c;
        a.C8311a c8311a = this.f279382d;
        switch (this.f279380b) {
            case 0:
                int i12 = l.f279386r;
                DeepLink deepLink = c8311a.f279591e;
                if (deepLink != null) {
                    lVar.f279388c.accept(new InterfaceC14531a.e(deepLink));
                    break;
                }
                break;
            default:
                int i13 = l.f279386r;
                lVar.f279388c.accept(new InterfaceC14531a.c(c8311a.f279593g));
                break;
        }
    }

    public /* synthetic */ i(a.C8311a c8311a, l lVar) {
        this.f279382d = c8311a;
        this.f279381c = lVar;
    }
}
