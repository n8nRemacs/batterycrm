package com.avito.android.leasing_calculator.view;

import kotlin.Metadata;

/* compiled from: LeasingDialogShower.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/view/o;", "Lcom/avito/android/leasing_calculator/view/n;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.design.bottom_sheet.d f175167a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f175168b;

    public o(@Y61.k com.avito.android.lib.design.bottom_sheet.d dVar) {
        this.f175167a = dVar;
    }

    @Override // com.avito.android.leasing_calculator.view.n
    public final void a(boolean z12) {
        this.f175168b = z12;
        this.f175167a.dismiss();
    }

    public final void b() {
        com.avito.android.lib.util.g.a(this.f175167a);
    }
}
