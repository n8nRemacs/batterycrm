package com.avito.android.extended_profile_widgets.adapter.search.search_advert.list;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.di.module.C30070i4;
import com.avito.android.favorite.AbstractC30567a;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.SellerInfoInlineAdvantage;
import com.avito.android.serp.adapter.AdvertItem;
import com.avito.android.serp.adapter.InterfaceC34863v;
import com.avito.android.serp.adapter.rich_snippets.job.m;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.N;
import oB.u;

/* compiled from: JobListItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile_widgets/adapter/search/search_advert/list/d;", "LTV0/d;", "Lcom/avito/android/serp/adapter/rich_snippets/job/m;", "Lcom/avito/android/serp/adapter/AdvertItem;", "_avito_extended-profile-widgets_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements TV0.d<m, AdvertItem> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34863v f154705b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.date_time_formatter.b f154706c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.e f154707d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ru.avito.component.serp.job.geo.b f154708e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f154709f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final l<oB.k, G0> f154710g;

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Action f154712m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Action action) {
            super(0);
            this.f154712m = action;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f154710g.invoke(new u.b(this.f154712m.getDeepLink()));
            return G0.f406611a;
        }
    }

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Action f154714m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Action action) {
            super(0);
            this.f154714m = action;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f154710g.invoke(new u.b(this.f154714m.getDeepLink()));
            return G0.f406611a;
        }
    }

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f154716m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdvertItem advertItem) {
            super(0);
            this.f154716m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            InterfaceC34863v interfaceC34863v = d.this.f154705b;
            AdvertItem advertItem = this.f154716m;
            interfaceC34863v.Ld(advertItem, new AbstractC30567a.d(advertItem.f268388K));
            return G0.f406611a;
        }
    }

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.d$d, reason: collision with other inner class name */
    public static final class C4525d extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f154718m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4525d(AdvertItem advertItem, int i12) {
            super(0);
            this.f154718m = advertItem;
        }

        @Override // Y41.a
        public final G0 invoke() {
            d.this.f154705b.k5(this.f154718m, null);
            return G0.f406611a;
        }
    }

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/AdvertAction;", "action", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/AdvertAction;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements l<AdvertAction, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ AdvertItem f154720m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdvertItem advertItem) {
            super(1);
            this.f154720m = advertItem;
        }

        @Override // Y41.l
        public final G0 invoke(AdvertAction advertAction) {
            DeepLink deepLink = advertAction.getDeepLink();
            if (deepLink != null) {
                d.this.f154710g.invoke(new u.a(deepLink, this.f154720m.f268420a0));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: JobListItemPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f154721l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(m mVar) {
            super(0);
            this.f154721l = mVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = this.f154721l;
            mVar.H0();
            mVar.d(null);
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@Y61.k InterfaceC34863v interfaceC34863v, @C30070i4.d @Y61.k com.avito.android.date_time_formatter.b bVar, @Y61.k ru.avito.component.serp.job.geo.e eVar, @Y61.k ru.avito.component.serp.job.geo.b bVar2, @Y61.k com.avito.android.server_time.f fVar, @Y61.k l<? super oB.k, G0> lVar) {
        this.f154705b = interfaceC34863v;
        this.f154706c = bVar;
        this.f154707d = eVar;
        this.f154708e = bVar2;
        this.f154709f = fVar;
        this.f154710g = lVar;
    }

    @Override // TV0.d
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final void O5(@Y61.k m mVar, @Y61.k AdvertItem advertItem, int i12) {
        String name;
        AdvertSellerInfo advertSellerInfo = advertItem.f268435f0;
        List<SellerInfoInlineAdvantage> inlineAdvantages = advertSellerInfo != null ? advertSellerInfo.getInlineAdvantages() : null;
        if (advertSellerInfo == null || (name = advertSellerInfo.getDisplayName()) == null) {
            name = advertSellerInfo != null ? advertSellerInfo.getName() : null;
        }
        mVar.Vo(inlineAdvantages, name, advertSellerInfo != null ? advertSellerInfo.getOnlineStatus() : null);
        mVar.n1(advertSellerInfo != null ? advertSellerInfo.getAdvantages() : null);
        mVar.K0(advertItem.f268428d, advertItem.f268436g);
        mVar.p(advertItem.f268440i);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        long j12 = advertItem.f268474z;
        mVar.b0((j12 > 0 && ((timeUnit.toMillis(j12) > com.avito.android.date_time_formatter.e.a(this.f154709f) ? 1 : (timeUnit.toMillis(j12) == com.avito.android.date_time_formatter.e.a(this.f154709f) ? 0 : -1)) >= 0)) ? this.f154706c.a(Long.valueOf(j12), timeUnit) : null);
        boolean zA2 = com.avito.android.serp.adapter.rich_snippets.job.multi_addresses.b.a(advertItem);
        List<GeoReference> list = advertItem.f268426c0;
        if (zA2) {
            GeoReference geoReference = list != null ? (GeoReference) C42745f0.G(list) : null;
            ArrayList arrayListA = list != null ? com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.e.a(list) : null;
            this.f154708e.getClass();
            mVar.bk(ru.avito.component.serp.job.geo.b.a(geoReference, advertItem.f268464u, advertItem.f268466v, advertItem.f268462t, arrayListA));
        } else {
            GeoReference geoReference2 = list != null ? (GeoReference) C42745f0.G(list) : null;
            ArrayList arrayListA2 = list != null ? com.avito.android.extended_profile_widgets.adapter.search.search_advert.list.e.a(list) : null;
            this.f154707d.getClass();
            mVar.lo(ru.avito.component.serp.job.geo.e.a(geoReference2, advertItem.f268464u, advertItem.f268466v, advertItem.f268462t, arrayListA2, advertItem.f268383H0));
        }
        mVar.jb(advertItem.f268380G, false);
        mVar.setActive(advertItem.f268376E);
        mVar.setViewed(advertItem.f268394N);
        AdvertActions advertActions = advertItem.f268408U;
        mVar.qD(advertActions != null ? advertActions.getActions() : null, false);
        mVar.FO();
        Action action = advertItem.f268410V;
        if (action == null) {
            mVar.FO();
        } else if (action.getTitleWithSalary() == null) {
            mVar.LS(action, new a(action));
        } else {
            mVar.yT(action, new b(action));
        }
        mVar.o5(advertItem.f268416Y);
        mVar.MU(advertItem.f268375D0);
        mVar.H0();
        mVar.l5(new c(advertItem));
        mVar.X50(new C4525d(advertItem, i12));
        mVar.om(new e(advertItem));
        mVar.d(new f(mVar));
    }
}
