package com.avito.android.advert_stats.detail.tab.items.button;

import Y41.l;
import android.view.View;
import eb.InterfaceC40078a;
import kotlin.G0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f86259b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.jakewharton.rxrelay3.c f86260c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f86261d;

    public /* synthetic */ g(com.jakewharton.rxrelay3.c cVar, l lVar, int i12) {
        this.f86259b = i12;
        this.f86260c = cVar;
        this.f86261d = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f86261d;
        com.jakewharton.rxrelay3.c cVar = this.f86260c;
        switch (this.f86259b) {
            case 0:
                int i12 = h.f86262e;
                cVar.accept(G0.f406611a);
                lVar.invoke(InterfaceC40078a.b.f395235a);
                break;
            default:
                int i13 = com.avito.android.advert_stats.detail.tab.items.funnel.g.f86448c;
                cVar.accept(G0.f406611a);
                lVar.invoke(InterfaceC40078a.d.f395237a);
                break;
        }
    }
}
