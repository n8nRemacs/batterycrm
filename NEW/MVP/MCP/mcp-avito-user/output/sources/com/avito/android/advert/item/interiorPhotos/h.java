package com.avito.android.advert.item.interiorPhotos;

import com.avito.android.advert.item.Z0;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: InteriorPhotosPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/interiorPhotos/h;", "Lcom/avito/android/interior_photos_block/m;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h implements com.avito.android.interior_photos_block.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f76596a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f76597b;

    /* JADX WARN: Multi-variable type inference failed */
    public h(Y41.l<? super String, G0> lVar, j jVar) {
        this.f76596a = lVar;
        this.f76597b = jVar;
    }

    @Override // com.avito.android.interior_photos_block.m
    public final void a(int i12, @Y61.l String str, @Y61.k List list) {
        ((i) this.f76596a).invoke(str);
        j jVar = this.f76597b;
        Z0 z02 = jVar.f76602d;
        if (z02 != null) {
            z02.H(i12, null, null, null, null, null, null, null, list, jVar.f76601c.Q5(false), null, null, null, null, null, null, null, null, null, false, null, null, null);
        }
    }
}
