package com.avito.android.user_advert.advert.items.multiaddresses;

import Y61.l;
import com.avito.android.user_advert.advert.MyAdvertDetailsActivity;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MultiAddressItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_advert/advert/items/multiaddresses/g;", "Lcom/avito/android/user_advert/advert/items/multiaddresses/d;", "<init>", "()V", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements d {

    /* renamed from: b, reason: collision with root package name */
    @l
    public MyAdvertDetailsActivity f309732b;

    @Inject
    public g() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        i iVar = (i) eVar;
        a aVar2 = (a) aVar;
        String str = aVar2.f309672d;
        if (str == null) {
            str = aVar2.f309671c;
        }
        iVar.b(str);
        iVar.bp(aVar2.f309673e);
        iVar.LY(aVar2.f309674f);
        iVar.Cg(new e(this, aVar2), aVar2.f309675g);
        iVar.Nn(aVar2.f309676h);
        iVar.dk(new f(this, aVar2));
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.d
    public final void c0() {
        this.f309732b = null;
    }

    @Override // com.avito.android.user_advert.advert.items.multiaddresses.d
    public final void e2(@Y61.k MyAdvertDetailsActivity myAdvertDetailsActivity) {
        this.f309732b = myAdvertDetailsActivity;
    }
}
