package com.avito.android.advert.item.short_term_rent.payment_toggles;

import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35976x4;
import com.avito.android.util.y6;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsTravelPaymentTogglesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/o;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/n;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class o extends com.avito.konveyor.adapter.b implements n {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final TextView f80106b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f80107c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f80108d;

    public o(@Y61.k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.title);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.f80106b = (TextView) viewFindViewById;
        View viewFindViewById2 = view.findViewById(R.id.payment_toggles);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f80107c = recyclerView;
        SV.a aVar = new SV.a(8388611, 0);
        C35976x4.a(recyclerView);
        recyclerView.l(new a(y6.b(6)), -1);
        view.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        aVar.b(recyclerView);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void Di(@Y61.l Parcelable parcelable) {
        RecyclerView.m layoutManager = this.f80107c.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.X0(parcelable);
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void Tt() {
        RecyclerView recyclerView = this.f80107c;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), y6.b(50) + recyclerView.getPaddingStart(), recyclerView.getPaddingBottom());
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void Wo(@Y61.l com.avito.konveyor.adapter.d dVar) {
        this.f80107c.setAdapter(dVar);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void is() {
        RecyclerView recyclerView = this.f80107c;
        recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingStart(), recyclerView.getPaddingBottom());
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        Y41.a<G0> aVar = this.f80108d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void t(@Y61.k Y41.a<G0> aVar) {
        this.f80108d = aVar;
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    public final void w(@Y61.l AttributedText attributedText) {
        com.avito.android.util.text.j.a(this.f80106b, attributedText, null);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.n
    @Y61.l
    public final Parcelable yd() {
        RecyclerView.m layoutManager = this.f80107c.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.Y0();
        }
        return null;
    }
}
