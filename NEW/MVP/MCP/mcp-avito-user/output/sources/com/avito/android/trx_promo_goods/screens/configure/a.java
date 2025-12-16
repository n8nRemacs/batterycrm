package com.avito.android.trx_promo_goods.screens.configure;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f303359b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrxPromoGoodsConfigureFragment f303360c;

    public /* synthetic */ a(TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment, int i12) {
        this.f303359b = i12;
        this.f303360c = trxPromoGoodsConfigureFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f303359b) {
            case 0:
                TrxPromoGoodsConfigureFragment trxPromoGoodsConfigureFragment = this.f303360c;
                RecyclerView recyclerView = trxPromoGoodsConfigureFragment.f303349z0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.post(new a(trxPromoGoodsConfigureFragment, 1));
                break;
            default:
                RecyclerView recyclerView2 = this.f303360c.f303349z0;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.c0();
                break;
        }
    }
}
