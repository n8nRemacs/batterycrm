package com.avito.android.advert.item.beduin.v2.di;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements com.avito.android.lib.beduin_v2.component.exception.callback.a, SwipeRefreshLayout.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73293b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f73294c;

    public /* synthetic */ b(int i12, Y41.a aVar) {
        this.f73293b = i12;
        this.f73294c = aVar;
    }

    @Override // com.avito.android.lib.beduin_v2.component.exception.callback.a
    public void a(String str, String str2) {
        Y41.a aVar = this.f73294c;
        switch (this.f73293b) {
            case 0:
                c cVar = c.f73295a;
                ((com.avito.android.advert_core.analytics.a) aVar.invoke()).L6(str, str2);
                break;
            default:
                c cVar2 = c.f73295a;
                ((com.avito.android.advert_core.analytics.a) aVar.invoke()).L6(str, str2);
                break;
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        switch (this.f73293b) {
            case 2:
                this.f73294c.invoke();
                break;
            case 3:
                this.f73294c.invoke();
                break;
            default:
                this.f73294c.invoke();
                break;
        }
    }
}
