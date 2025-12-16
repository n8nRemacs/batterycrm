package com.avito.android.advert.item.abuse;

import A91.p;
import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.abuse.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsAbusePresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/abuse/d;", "Lcom/avito/android/advert/item/abuse/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c.a f72524b;

    @Inject
    public d(@k c.a aVar) {
        this.f72524b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.ws(((AdvertDetailsAbuseItem) aVar).f72517g);
        fVar.U8(new p(this, 29));
    }
}
