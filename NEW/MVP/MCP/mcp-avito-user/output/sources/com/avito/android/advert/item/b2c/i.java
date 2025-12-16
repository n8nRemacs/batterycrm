package com.avito.android.advert.item.b2c;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.deep_linking.links.DeepLink;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsB2CPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/item/b2c/i;", "Lcom/avito/android/advert/item/b2c/h;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements h {

    /* renamed from: a, reason: collision with root package name */
    @l
    public Z0 f73204a;

    @Inject
    public i() {
    }

    @Override // com.avito.android.advert.item.b2c.f.b
    public final void a(@k DeepLink deepLink) {
        Z0 z02 = this.f73204a;
        if (z02 != null) {
            z02.g(null, deepLink, null);
        }
    }

    @Override // com.avito.android.advert.item.b2c.h
    public final void c0() {
        this.f73204a = null;
    }

    @Override // com.avito.android.advert.item.b2c.h
    public final void j0(@k Z0 z02) {
        this.f73204a = z02;
    }
}
