package com.avito.android.advert_core.equipments.redesign.bottom_sheet;

import Ba.ViewOnClickListenerC13121a;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.lib.design.button.Button;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EquipmentsDialogView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/o;", "Lcom/avito/android/advert_core/equipments/redesign/bottom_sheet/l;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f83530a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f83531b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final TextView f83532c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f83533d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Button f83534e;

    public o(@Y61.k View view, @Y61.k com.avito.konveyor.a aVar, @Y61.k com.avito.konveyor.adapter.a aVar2) {
        this.f83530a = aVar2;
        View viewFindViewById = view.findViewById(R.id.equipment_bottom_sheet_title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83531b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.equipment_bottom_sheet_sub_title);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f83532c = (TextView) viewFindViewById2;
        View viewFindViewById3 = view.findViewById(R.id.bottom_sheet_recycler);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById3;
        this.f83533d = recyclerView;
        View viewFindViewById4 = view.findViewById(R.id.bottom_sheet_button);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
        }
        this.f83534e = (Button) viewFindViewById4;
        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(aVar2, aVar));
    }

    public final void a(int i12, @Y61.l Y41.a aVar, @Y61.l String str) {
        Button button = this.f83534e;
        com.avito.android.lib.design.button.b.a(button, str, false);
        button.setAppearanceFromAttr(i12);
        button.setOnClickListener(new ViewOnClickListenerC13121a(9, aVar));
    }
}
