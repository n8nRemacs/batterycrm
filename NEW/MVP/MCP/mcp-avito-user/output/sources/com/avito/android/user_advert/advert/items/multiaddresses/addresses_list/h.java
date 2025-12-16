package com.avito.android.user_advert.advert.items.multiaddresses.addresses_list;

import Y61.k;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.konveyor.adapter.j;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertAddressesListView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/addresses_list/h;", "", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final View f309700a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final j f309701b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.konveyor.adapter.a f309702c;

    public h(@k View view, @k com.avito.konveyor.adapter.a aVar, @k j jVar) {
        this.f309700a = view;
        this.f309701b = jVar;
        this.f309702c = aVar;
        View viewFindViewById = view.findViewById(R.id.address_list_view);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        ((RecyclerView) viewFindViewById).setAdapter(jVar);
    }
}
