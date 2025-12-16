package Q5;

import androidx.view.P0;
import com.avito.android.advert.item.leadauto.viewmodel.c;
import com.avito.android.advert_core.advert.l;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutoNewCarsLeadFormModule_ProvideViewModel$_avito_advert_details_implFactory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<l> f13465a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.advert.item.leadauto.viewmodel.b f13466b;

    public b(Provider provider, com.avito.android.advert.item.leadauto.viewmodel.b bVar) {
        this.f13465a = provider;
        this.f13466b = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = this.f13465a.get();
        com.avito.android.advert.item.leadauto.viewmodel.a aVar = (com.avito.android.advert.item.leadauto.viewmodel.a) this.f13466b.get();
        a.f13464a.getClass();
        return (c) new P0(lVar.getF170531a(), aVar).a(c.class);
    }
}
