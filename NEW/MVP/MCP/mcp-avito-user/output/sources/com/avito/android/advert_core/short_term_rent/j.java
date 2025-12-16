package com.avito.android.advert_core.short_term_rent;

import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.d1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertStrBlockInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/short_term_rent/j;", "Lcom/avito/android/advert_core/short_term_rent/g;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f84349a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<d1> f84350b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f84351c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f84352d;

    @Inject
    public j(@Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar, @Y61.k @InterfaceC30174s String str) {
        this.f84349a = str;
        this.f84350b = eVar;
        this.f84351c = interfaceC35745a5;
        this.f84352d = fVar;
    }

    @Override // com.avito.android.advert_core.short_term_rent.g
    @Y61.k
    public final C41982q1 a(boolean z12) {
        return z.q(z.c0(P2.c.f318721a), new F(new com.avito.android.advert.item.consultation.view_model.d(1, this, z12)).d0(h.f84347b).m0(new i(this))).x0(this.f84351c.a());
    }
}
