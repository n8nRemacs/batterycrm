package com.avito.android.loyalty.ui.quality_service.items.effects;

import Y61.k;
import Y61.l;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import kotlin.Metadata;
import nX.C44346a;

/* compiled from: EffectsItemView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/quality_service/items/effects/i;", "Lcom/avito/konveyor/adapter/b;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class i extends com.avito.konveyor.adapter.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.d f183841b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TextView f183842c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TextView f183843d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final RecyclerView f183844e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.lib.util.recycler_wrap_height_calculator.c f183845f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public m f183846g;

    public i(@k View view, @k com.avito.konveyor.adapter.d dVar) {
        super(view);
        this.f183841b = dVar;
        this.f183842c = (TextView) this.itemView.findViewById(R.id.item_effects_title);
        this.f183843d = (TextView) this.itemView.findViewById(R.id.item_effects_subtitle);
        RecyclerView recyclerView = (RecyclerView) this.itemView.findViewById(R.id.item_effects_list);
        this.f183844e = recyclerView;
        this.f183845f = new com.avito.android.lib.util.recycler_wrap_height_calculator.c();
        recyclerView.l(new C44346a(), -1);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(dVar);
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        m mVar = this.f183846g;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
    }
}
