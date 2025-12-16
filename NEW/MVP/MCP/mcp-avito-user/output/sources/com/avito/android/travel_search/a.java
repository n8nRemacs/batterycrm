package com.avito.android.travel_search;

import Y61.k;
import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import pF0.InterfaceC46946b;

/* compiled from: TravelSearchIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/travel_search/a;", "LpF0/b;", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements InterfaceC46946b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Context f302766a;

    @Inject
    public a(@k Context context) {
        this.f302766a = context;
    }

    @Override // pF0.InterfaceC46946b
    @k
    public final Intent a(@k TravelSearchOpenParams travelSearchOpenParams) {
        TravelSearchActivity.f302762n.getClass();
        return new Intent(this.f302766a, (Class<?>) TravelSearchActivity.class).putExtra("open_params", travelSearchOpenParams);
    }
}
