package com.avito.android.user_advert.advert.deliveryPromoBlock;

import Y61.k;
import Y61.l;
import com.avito.android.user_advert.advert.delegate.deliverySettings.c;
import com.avito.android.util.R0;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.C43259k;
import lI0.InterfaceC43640a;

/* compiled from: DeliveryPromoBlockInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/deliveryPromoBlock/c;", "Lcom/avito/android/user_advert/advert/deliveryPromoBlock/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC43640a> f308888a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f308889b;

    @Inject
    public c(@k R0 r02, @k e eVar) {
        this.f308888a = eVar;
        this.f308889b = r02;
    }

    @Override // com.avito.android.user_advert.advert.deliveryPromoBlock.a
    @l
    public final Object a(@k String str, @k c.b bVar) {
        return C43259k.g(this.f308889b.a(), new b(this, str, null), bVar);
    }
}
