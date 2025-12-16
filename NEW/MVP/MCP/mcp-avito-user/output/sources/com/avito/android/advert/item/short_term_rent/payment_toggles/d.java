package com.avito.android.advert.item.short_term_rent.payment_toggles;

import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.d2;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;

/* compiled from: AdvertDetailsTravelPaymentToggleActionProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/short_term_rent/payment_toggles/d;", "Lcom/avito/android/advert/item/short_term_rent/payment_toggles/c;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e2 f80082a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final d2<b> f80083b;

    @Inject
    public d() {
        e2 e2VarA = f2.a(0, 1, BufferOverflow.f410778c);
        this.f80082a = e2VarA;
        this.f80083b = C43175k.a(e2VarA);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.c
    public final void a(@Y61.k b bVar) {
        this.f80082a.K5(bVar);
    }

    @Override // com.avito.android.advert.item.short_term_rent.payment_toggles.c
    @Y61.k
    public final d2<b> getActions() {
        return this.f80083b;
    }
}
