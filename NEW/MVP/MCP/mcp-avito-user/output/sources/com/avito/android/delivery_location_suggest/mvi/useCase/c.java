package com.avito.android.delivery_location_suggest.mvi.useCase;

import Fv.C13838a;
import Y61.k;
import com.avito.android.delivery_location_suggest.l;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;

/* compiled from: LoadCoordsUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/delivery_location_suggest/mvi/useCase/c;", "", "_avito_delivery-location-suggest_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l f135196a;

    @Inject
    public c(@k l lVar) {
        this.f135196a = lVar;
    }

    @k
    public final C43152f0 a(@k C13838a c13838a) {
        return new C43152f0(C43175k.L(new a(c13838a, null), this.f135196a.b(c13838a.f6017a + ' ' + c13838a.f6018b)), new b(3, null));
    }
}
