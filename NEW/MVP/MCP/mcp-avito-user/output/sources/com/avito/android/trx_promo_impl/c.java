package com.avito.android.trx_promo_impl;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f303907b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TrxPromoFragment f303908c;

    public /* synthetic */ c(TrxPromoFragment trxPromoFragment, int i12) {
        this.f303907b = i12;
        this.f303908c = trxPromoFragment;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f303907b) {
            case 0:
                TrxPromoFragment trxPromoFragment = this.f303908c;
                RecyclerView recyclerView = trxPromoFragment.f303883z0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                recyclerView.post(new c(trxPromoFragment, 1));
                break;
            default:
                RecyclerView recyclerView2 = this.f303908c.f303883z0;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.c0();
                break;
        }
    }
}
