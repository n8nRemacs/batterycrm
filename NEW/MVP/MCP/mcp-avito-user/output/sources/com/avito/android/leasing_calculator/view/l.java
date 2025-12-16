package com.avito.android.leasing_calculator.view;

import android.content.Context;
import android.view.View;
import com.avito.android.R;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.util.I5;
import jR.InterfaceC42298a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import oR.InterfaceC44683b;

/* compiled from: LeasingBottomSheetDialogFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/view/l;", "Lcom/avito/android/leasing_calculator/view/j;", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class l implements j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f175160a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42298a f175161b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44683b f175162c;

    /* compiled from: LeasingBottomSheetDialogFactory.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f175163l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.lib.design.bottom_sheet.d dVar) {
            super(0);
            this.f175163l = dVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            this.f175163l.dismiss();
            return G0.f406611a;
        }
    }

    @Inject
    public l(@Y61.k p pVar, @Y61.k InterfaceC42298a interfaceC42298a, @Y61.k InterfaceC44683b interfaceC44683b) {
        this.f175160a = pVar;
        this.f175161b = interfaceC42298a;
        this.f175162c = interfaceC44683b;
    }

    @Override // com.avito.android.leasing_calculator.view.j
    public final void a(@Y61.k Context context, @Y61.k String str) {
        View viewInflate = View.inflate(context, R.layout.leasing_tooltip_dialog_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        A aC2 = this.f175160a.c(viewInflate);
        I5.a(aC2.f175124a, str, false);
        aC2.f175125b.setOnClickListener(new com.avito.android.guests_selector.items.children_add_button.g(27, new a(dVar)));
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // com.avito.android.leasing_calculator.view.j
    @Y61.k
    public final o b(@Y61.k Context context, @Y61.k LeasingCalculator.LeasingInfo.InfoModal infoModal, @Y61.k u uVar) {
        View viewInflate = View.inflate(context, R.layout.leasing_info_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, 0, 2, null);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        o oVar = new o(dVar);
        dVar.setOnDismissListener(new k(uVar, oVar, this, 0));
        uVar.b(this.f175160a.a(viewInflate), infoModal);
        return oVar;
    }

    @Override // com.avito.android.leasing_calculator.view.j
    @Y61.k
    public final o c(@Y61.k Context context, @Y61.k LeasingCalculator.LeasingApplication leasingApplication, @Y61.k InterfaceC31101a interfaceC31101a) {
        View viewInflate = View.inflate(context, R.layout.leasing_application_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.LeasingApplicationDialog);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, leasingApplication.getTitle(), true, true, 2);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        o oVar = new o(dVar);
        dVar.setOnDismissListener(new k(interfaceC31101a, oVar, this, 1));
        interfaceC31101a.b(this.f175160a.b(viewInflate), leasingApplication);
        return oVar;
    }
}
