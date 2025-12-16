package com.avito.android.advert.item.ownership_cost.dialogs;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Y61.k;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.advert.item.ownership_cost.items.input_form.OwnershipCostInputsItem;
import com.avito.android.advert.item.ownership_cost.items.input_form.a;
import com.avito.android.advert.item.ownership_cost.items.input_form.l;
import com.avito.android.advert.item.ownership_cost.items.m;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.OwnershipCostResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.N0;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OwnershipCostDialogFactory.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/ownership_cost/dialogs/b;", "Lcom/avito/android/advert/item/ownership_cost/dialogs/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.avito.android.advert.item.ownership_cost.dialogs.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f77884a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.advert.item.ownership_cost.items.input_form.a f77885b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final m f77886c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a.InterfaceC2309a f77887d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f77888e;

    /* compiled from: OwnershipCostDialogFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/advert/item/ownership_cost/dialogs/b$a", "Lcom/avito/android/advert/item/ownership_cost/items/input_form/a$a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements a.InterfaceC2309a {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f77890c;

        public a(com.avito.android.lib.design.bottom_sheet.d dVar) {
            this.f77890c = dVar;
        }

        @Override // com.avito.android.advert.item.ownership_cost.items.input_form.a.InterfaceC2309a
        public final void b1() {
            b.this.f77887d.b1();
            N0.a(this.f77890c);
        }
    }

    @Inject
    public b(@k e eVar, @k com.avito.android.advert.item.ownership_cost.items.input_form.a aVar, @k m mVar, @k a.InterfaceC2309a interfaceC2309a, @k InterfaceC35745a5 interfaceC35745a5) {
        this.f77884a = eVar;
        this.f77885b = aVar;
        this.f77886c = mVar;
        this.f77887d = interfaceC2309a;
        this.f77888e = interfaceC35745a5;
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.a
    public final void a(@k Context context, @k OwnershipCostResponse.OwnershipCostDisclaimer ownershipCostDisclaimer) {
        View viewInflate = View.inflate(context, R.layout.ownership_cost_disclaimer_view, null);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.OwnershipCostDialog);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        View viewFindViewById = viewInflate.findViewById(R.id.container);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f77884a.a((LinearLayout) viewFindViewById, ownershipCostDisclaimer);
        View viewFindViewById2 = viewInflate.findViewById(R.id.floating_button);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        Button button = (Button) viewFindViewById2;
        button.setText(ownershipCostDisclaimer.getButtonText());
        button.setOnClickListener(new S7.a(dVar, 3));
        com.avito.android.lib.util.g.a(dVar);
    }

    @Override // com.avito.android.advert.item.ownership_cost.dialogs.a
    public final void b(@k Context context, @k OwnershipCostResponse ownershipCostResponse, @k String str) {
        OwnershipCostInputsItem ownershipCostInputsItemA = this.f77886c.a(ownershipCostResponse, str);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        int iB2 = y6.b(8);
        linearLayout.setPadding(iB2, y6.b(6), iB2, y6.b(12));
        View viewInflate = View.inflate(context, R.layout.ownership_cost_inputs, linearLayout);
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(context, R.style.OwnershipCostDialog);
        dVar.setContentView(viewInflate);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        l lVar = new l(viewInflate, this.f77888e);
        a aVar = new a(dVar);
        com.avito.android.advert.item.ownership_cost.items.input_form.a aVar2 = this.f77885b;
        aVar2.U2(aVar);
        dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 6));
        aVar2.O5(lVar, ownershipCostInputsItemA, 0);
        com.avito.android.lib.util.g.a(dVar);
    }
}
