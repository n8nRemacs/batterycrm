package com.avito.android.str_insurance.screen;

import Xy0.AbstractC17061a;
import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.str_insurance.screen.StrInsuranceFragment;
import com.avito.android.util.C35976x4;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: StrInsuranceFragment.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class b extends H implements l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        StrInsuranceFragment strInsuranceFragment = (StrInsuranceFragment) this.receiver;
        StrInsuranceFragment.a aVar = StrInsuranceFragment.f288620p0;
        strInsuranceFragment.getClass();
        View viewFindViewById = view.findViewById(R.id.str_insurance_content);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        strInsuranceFragment.requireContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        com.avito.konveyor.adapter.d dVar = strInsuranceFragment.f288624k0;
        if (dVar == null) {
            dVar = null;
        }
        recyclerView.setAdapter(dVar);
        C35976x4.a(recyclerView);
        AbstractC17061a abstractC17061a = strInsuranceFragment.f288626m0;
        RecyclerView.l lVar = (abstractC17061a != null ? abstractC17061a : null).f19172b;
        if (lVar != null) {
            recyclerView.l(lVar, -1);
        }
        return G0.f406611a;
    }
}
