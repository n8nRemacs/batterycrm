package com.avito.android.favorite;

import Ag.CallableC13028a;
import com.avito.android.advertising.loaders.beduin.CallableC28348b;
import com.avito.android.analytics.InterfaceC28467s;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.AbstractC41777j;
import io.reactivex.rxjava3.internal.operators.single.C42026y;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import qC.InterfaceC47276b;

/* compiled from: FavoriteAdvertsInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/favorite/l;", "Lcom/avito/android/favorite/h;", "Lcom/avito/android/favorite/g;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements h, InterfaceC30573g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final x f155215a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final r f155216b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30570d f155217c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28467s f155218d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47276b f155219e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f155220f;

    @Inject
    public l(@Y61.k x xVar, @Y61.k r rVar, @Y61.k InterfaceC30570d interfaceC30570d, @Y61.k InterfaceC28467s interfaceC28467s, @Y61.k InterfaceC47276b interfaceC47276b, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f155215a = xVar;
        this.f155216b = rVar;
        this.f155217c = interfaceC30570d;
        this.f155218d = interfaceC28467s;
        this.f155219e = interfaceC47276b;
        this.f155220f = interfaceC35745a5;
    }

    @Override // com.avito.android.favorite.h
    @Y61.k
    public final W b(@Y61.k String str, boolean z12) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC28348b(this, str, z12)).z(this.f155220f.a());
    }

    @Override // com.avito.android.favorite.InterfaceC30573g
    @Y61.k
    public final AbstractC41777j<AbstractC30569c> c() {
        return this.f155217c.c();
    }

    @Override // com.avito.android.favorite.h
    @Y61.k
    public final W d(@Y61.k List list) {
        return new io.reactivex.rxjava3.internal.operators.single.G(new CallableC13028a(12, this, list)).z(this.f155220f.a());
    }

    @Override // com.avito.android.favorite.h
    @Y61.k
    public final ArrayList e(@Y61.k ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (this.f155215a.f(str)) {
                arrayList2.add(str);
            }
        }
        return arrayList2;
    }

    @Override // com.avito.android.favorite.h
    @Y61.k
    public final Map<String, Boolean> f(@Y61.k List<String> list) {
        return this.f155215a.d(list);
    }

    @Override // com.avito.android.favorite.h
    @Y61.k
    public final C42026y g(@Y61.k String str, @Y61.k AbstractC30567a abstractC30567a, boolean z12, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Double d12, @Y61.l String str2, @Y61.l Boolean bool, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, boolean z13) {
        return b(str, z12).n(new k(abstractC30567a, this, advertisementVerticalAlias, bool, d12, str, str2, str5, str3, str4, z13));
    }
}
