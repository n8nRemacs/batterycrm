package com.avito.android.autoteka.presentation.choosingPurchase;

import Y41.l;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: AutotekaChoosingTypePurchaseViewImpl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class e extends H implements l<View, G0> {
    @Override // Y41.l
    public final G0 invoke(View view) {
        f fVar = (f) this.receiver;
        fVar.getClass();
        View viewFindViewById = view.findViewById(R.id.autoteka_list);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        recyclerView.setAdapter(fVar.f97113b);
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        return G0.f406611a;
    }
}
