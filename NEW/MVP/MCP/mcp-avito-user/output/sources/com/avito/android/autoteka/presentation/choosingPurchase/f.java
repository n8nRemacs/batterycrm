package com.avito.android.autoteka.presentation.choosingPurchase;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y61.k;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AutotekaChoosingTypePurchaseViewImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/presentation/choosingPurchase/f;", "Lcom/avito/android/autoteka/presentation/choosingPurchase/d;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AutotekaChoosingPurchaseActivity f97112a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.j f97113b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f97114c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Y41.a<G0> f97115d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.lib.design.bottom_sheet.d f97116e;

    public f(@k AutotekaChoosingPurchaseActivity autotekaChoosingPurchaseActivity, @k com.avito.konveyor.adapter.j jVar, @k com.avito.konveyor.adapter.a aVar, @k Y41.a aVar2) {
        this.f97112a = autotekaChoosingPurchaseActivity;
        this.f97113b = jVar;
        this.f97114c = aVar;
        this.f97115d = aVar2;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(autotekaChoosingPurchaseActivity, 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, null, false, 0, 0, 0, 127);
        dVar.C(R.layout.autoteka_recycler_activity, new e(1, this, f.class, "onViewInflated", "onViewInflated(Landroid/view/View;)V", 0));
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 12));
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        com.avito.android.lib.util.g.a(dVar);
        this.f97116e = dVar;
    }
}
