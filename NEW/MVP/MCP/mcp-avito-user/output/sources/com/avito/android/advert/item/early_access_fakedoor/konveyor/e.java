package com.avito.android.advert.item.early_access_fakedoor.konveyor;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.Z0;
import com.avito.android.di.module.InterfaceC30174s;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EarlyAccessAdvertPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/e;", "Lcom/avito/android/advert/item/early_access_fakedoor/konveyor/c;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f75306b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.early_access_advert.a f75307c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public Z0 f75308d;

    @Inject
    public e(@k @InterfaceC30174s String str, @k com.avito.android.early_access_advert.a aVar) {
        this.f75306b = str;
        this.f75307c = aVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        g gVar = (g) eVar;
        EarlyAccessAdvertItem earlyAccessAdvertItem = (EarlyAccessAdvertItem) aVar;
        EarlyAccessAdvert earlyAccessAdvert = earlyAccessAdvertItem.f75299g;
        gVar.b(earlyAccessAdvert.getTitle());
        gVar.j(earlyAccessAdvert.getSubtitle());
        gVar.V0(earlyAccessAdvert.getButtonText());
        gVar.Y(new d(this, earlyAccessAdvertItem));
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.c
    public final void c0() {
        this.f75308d = null;
    }

    @Override // com.avito.android.advert.item.early_access_fakedoor.konveyor.c
    public final void s5(@k Z0 z02) {
        this.f75308d = z02;
    }
}
