package X4;

import androidx.view.P0;
import com.avito.android.advert.item.consultation.view_model.c;
import com.avito.android.advert_core.advert.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsConsultationModule_ProvideViewModel$_avito_advert_details_implFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<com.avito.android.advert.item.consultation.view_model.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f18575a;

    /* renamed from: b, reason: collision with root package name */
    public final c f18576b;

    public b(Provider provider, c cVar) {
        this.f18575a = provider;
        this.f18576b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f18575a.get();
        com.avito.android.advert.item.consultation.view_model.b bVar = (com.avito.android.advert.item.consultation.view_model.b) this.f18576b.get();
        a.f18574a.getClass();
        return (com.avito.android.advert.item.consultation.view_model.a) new P0(lVar.getF170531a(), bVar).a(com.avito.android.advert.item.consultation.view_model.e.class);
    }
}
