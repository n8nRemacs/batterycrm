package com.avito.android.advert.item.hotel.hotel_offer.floating_view;

import com.avito.android.util.D6;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75991b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f75992c;

    public /* synthetic */ h(i iVar, int i12) {
        this.f75991b = i12;
        this.f75992c = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f75991b) {
            case 0:
                D6.g(this.f75992c.f75993a);
                break;
            default:
                D6.H(this.f75992c.f75993a);
                break;
        }
    }
}
