package com.avito.android.advert.item.scroll_up;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.consultation.B;
import com.avito.android.advert.item.scroll_up.c;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsScrollUpPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/scroll_up/d;", "Lcom/avito/android/advert/item/scroll_up/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final c.a f79333b;

    @Inject
    public d(@k c.a aVar) {
        this.f79333b = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        f fVar = (f) eVar;
        fVar.setTitle(((AdvertDetailsScrollUpItem) aVar).f79328g);
        fVar.U8(new B(this, 7));
    }
}
