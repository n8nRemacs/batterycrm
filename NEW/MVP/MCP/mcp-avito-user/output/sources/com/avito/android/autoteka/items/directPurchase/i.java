package com.avito.android.autoteka.items.directPurchase;

import Y41.l;
import android.view.View;
import com.avito.android.autoteka.deeplinks.DirectPurchaseDetails;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class i implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f96747b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f96748c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ DirectPurchaseDetails.Button f96749d;

    public /* synthetic */ i(l lVar, DirectPurchaseDetails.Button button, int i12) {
        this.f96747b = i12;
        this.f96748c = lVar;
        this.f96749d = button;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        l lVar = this.f96748c;
        DirectPurchaseDetails.Button button = this.f96749d;
        switch (this.f96747b) {
            case 0:
                int i12 = j.f96750f;
                lVar.invoke(button.f96241c);
                break;
            default:
                int i13 = j.f96750f;
                lVar.invoke(button.f96241c);
                break;
        }
    }
}
