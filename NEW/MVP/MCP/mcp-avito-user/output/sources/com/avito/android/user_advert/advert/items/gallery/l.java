package com.avito.android.user_advert.advert.items.gallery;

import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import com.avito.android.user_advert.advert.items.F;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertGalleryItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/gallery/l;", "Lcom/avito/android/user_advert/advert/items/gallery/h;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class l implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public MyAdvertDetailsActivity f309434b;

    @Inject
    public l() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((n) eVar, (c) aVar);
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.h
    public final void c0() {
        this.f309434b = null;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        n nVar = (n) eVar;
        c cVar = (c) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof F) {
                obj = obj2;
            }
        }
        if (!(obj instanceof F)) {
            obj = null;
        }
        F f12 = (F) obj;
        if (f12 == null) {
            k(nVar, cVar);
            return;
        }
        nVar.z10(null);
        nVar.K20(f12.f308960a);
        nVar.z10(new i(this, cVar));
    }

    public final void k(@Y61.k n nVar, @Y61.k c cVar) {
        nVar.z10(null);
        nVar.iK(cVar.f309413e, cVar.f309414f, cVar.f309415g);
        nVar.K20(cVar.f309412d);
        nVar.i10(new j(this, cVar));
        nVar.z10(new k(this, cVar));
    }

    @Override // com.avito.android.user_advert.advert.items.gallery.h
    public final void p2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309434b = myAdvertDetailsActivity;
    }
}
