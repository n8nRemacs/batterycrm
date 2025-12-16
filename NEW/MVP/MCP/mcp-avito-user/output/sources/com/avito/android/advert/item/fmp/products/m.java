package com.avito.android.advert.item.fmp.products;

import android.view.View;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class m implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f75627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Tile f75628d;

    public /* synthetic */ m(Y41.l lVar, Tile tile, int i12) {
        this.f75626b = i12;
        this.f75627c = lVar;
        this.f75628d = tile;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Tile tile = this.f75628d;
        Y41.l lVar = this.f75627c;
        switch (this.f75626b) {
            case 0:
                int i12 = n.f75629i;
                lVar.invoke(tile);
                break;
            default:
                int i13 = n.f75629i;
                lVar.invoke(tile);
                break;
        }
    }
}
