package com.avito.android.realty_agency.inline_filters.location_suggest;

import Y41.l;
import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import com.avito.android.R;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.n;
import com.avito.konveyor.adapter.j;
import ji0.InterfaceC42386a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;

/* compiled from: LocationSuggestViewHolder.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/realty_agency/inline_filters/location_suggest/g;", "", "_avito_realty-agency_inline-filters_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<InterfaceC42386a, G0> f251673a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f251674b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f251675c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.progress_overlay.l f251676d;

    public g(@k View view, @k l lVar, @k j jVar, @k com.avito.konveyor.adapter.a aVar, @k a aVar2) {
        this.f251673a = lVar;
        this.f251674b = jVar;
        this.f251675c = aVar;
        View viewFindViewById = view.findViewById(R.id.locations);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById).setAdapter(jVar);
        View viewFindViewById2 = view.findViewById(R.id.search_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.input.Input");
        }
        com.avito.android.progress_overlay.l lVar2 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.progress_overlay_container), R.id.locations, null, 0, 0, 28, null);
        lVar2.f231600j = new f(this);
        this.f251676d = lVar2;
        C43175k.K(new C43152f0(new C43197r1(new d(this, null), y.a(n.e((Input) viewFindViewById2))), new e(3, null)), C22981N.a(aVar2.getLifecycle()));
    }
}
