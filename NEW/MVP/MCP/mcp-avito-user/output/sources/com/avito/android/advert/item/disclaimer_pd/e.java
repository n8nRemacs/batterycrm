package com.avito.android.advert.item.disclaimer_pd;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.InterfaceC28153o;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DisclaimerPDPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/disclaimer_pd/e;", "Lcom/avito/android/advert/item/disclaimer_pd/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Ax.e f75227b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC28153o f75228c;

    @Inject
    public e(@k Ax.e eVar, @k InterfaceC28153o interfaceC28153o) {
        this.f75227b = eVar;
        this.f75228c = interfaceC28153o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        this.f75227b.g((com.avito.konveyor.adapter.b) gVar);
        gVar.By(new d(this), ((DisclaimerPDItem) aVar).f75221d);
    }
}
