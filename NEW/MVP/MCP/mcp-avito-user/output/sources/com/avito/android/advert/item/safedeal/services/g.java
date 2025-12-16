package com.avito.android.advert.item.safedeal.services;

import Y61.k;
import Y61.l;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.AdvertDetailsFragment;
import com.avito.android.advert_core.safedeal.h;
import com.avito.android.advert_core.safedeal.q;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.MyAdvertSafeDeal;
import com.avito.android.remote.safedeal.SafeDeal;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsSafeDealServicesView.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/safedeal/services/g;", "Lcom/avito/android/advert/item/safedeal/services/f;", "Lcom/avito/konveyor/adapter/b;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ViewGroup f79024b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final x f79025c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public h f79026d;

    public g(@k ViewGroup viewGroup, @k x xVar) {
        super(viewGroup);
        this.f79024b = viewGroup;
        this.f79025c = xVar;
    }

    @Override // com.avito.android.advert.item.safedeal.services.f
    public final void ZO(@k SafeDeal safeDeal, @k q qVar, @k com.jakewharton.rxrelay3.d dVar, @k h.a aVar, @k AdvertDetailsFragment advertDetailsFragment) {
        if (this.f79026d == null) {
            this.f79026d = new h(this.f79024b, qVar, this.f79025c, aVar, advertDetailsFragment);
        }
        List<MyAdvertSafeDeal.Service> listF = safeDeal.f();
        if (listF != null) {
            dVar.accept(new MyAdvertSafeDeal(listF));
        }
    }
}
