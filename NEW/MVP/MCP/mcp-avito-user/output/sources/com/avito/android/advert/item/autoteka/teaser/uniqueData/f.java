package com.avito.android.advert.item.autoteka.teaser.uniqueData;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.di.module.InterfaceC30174s;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AutotekaUniqueDataPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/autoteka/teaser/uniqueData/f;", "Lcom/avito/android/advert/item/autoteka/teaser/uniqueData/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.autoteka.data.a f73065b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f73066c;

    @Inject
    public f(@k com.avito.android.autoteka.data.a aVar, @k @InterfaceC30174s String str) {
        this.f73065b = aVar;
        this.f73066c = str;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        c cVar = (c) aVar;
        hVar.setTitle(cVar.f73060d);
        hVar.Wu(cVar.f73061e);
        hVar.P00(cVar.f73062f);
        hVar.setImage(cVar.f73063g);
        hVar.Nr(new e(this));
    }
}
