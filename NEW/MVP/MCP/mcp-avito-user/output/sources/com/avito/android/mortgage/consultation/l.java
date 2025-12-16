package com.avito.android.mortgage.consultation;

import androidx.compose.runtime.InterfaceC22204y1;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageConsultationDialog.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ MortgageConsultationDialog f198587l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f198588m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f198589n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(MortgageConsultationDialog mortgageConsultationDialog, com.avito.android.lib.design.bottom_sheet.d dVar, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f198587l = mortgageConsultationDialog;
        this.f198588m = dVar;
        this.f198589n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-304023272, new k(this.f198587l, this.f198588m, this.f198589n), a13), a13, 48, 1);
        }
        return G0.f406611a;
    }
}
