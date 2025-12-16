package com.avito.android.search.subscriptions;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.account.G;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.NavigationSource;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.error.z;
import com.avito.android.favorites.FavoritesSpace;
import com.avito.android.libs.saved_searches.deeplinks.SavedSearchArgs;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.CloseableDataSource;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.search_ux_feedback.SearchFeedbackCampaign;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import com.avito.android.util.rx3.C35896f0;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import java.io.IOException;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SearchSubscriptionPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/subscriptions/i;", "Lcom/avito/android/search/subscriptions/d;", "_avito_search_subscriptions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i implements com.avito.android.search.subscriptions.d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35741a1 f263959b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.libs.saved_searches.domain.i f263960c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final l f263961d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final TV.f f263962e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final G f263963f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f263964g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f263965h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final EE0.d f263966i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f263967j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Rp0.b f263968k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final FavoritesSpace f263969l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263970m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f263971n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public w f263972o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public SearchSubscriptionFragment f263973p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f263974q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public UV0.c f263975r;

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/saved_searches/model/SearchSubscription;", "searchSubscriptions", "Lkotlin/G0;", "accept", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) throws IOException {
            i iVar = i.this;
            iVar.f263966i.i();
            EE0.d dVar = iVar.f263966i;
            dVar.k();
            UV0.c cVar = new UV0.c((List) obj);
            Z41.a aVar = iVar.f263975r;
            CloseableDataSource closeableDataSource = aVar instanceof CloseableDataSource ? (CloseableDataSource) aVar : null;
            if (closeableDataSource != null) {
                try {
                    closeableDataSource.close();
                } catch (IOException unused) {
                }
            }
            iVar.f263975r = cVar;
            iVar.f263965h.c(new com.avito.android.search.subscriptions.adapter.c(cVar));
            List<T> list = cVar.f16399b;
            if (!list.isEmpty() || !iVar.f263974q) {
                w wVar = iVar.f263972o;
                if (wVar != null) {
                    RecyclerView recyclerView = wVar.f264028h;
                    if (recyclerView.getAdapter() == null) {
                        recyclerView.setAdapter(new com.avito.konveyor.adapter.j(wVar.f264024d, wVar.f264025e));
                    } else {
                        RecyclerView.Adapter adapter = recyclerView.getAdapter();
                        if (adapter != null) {
                            adapter.notifyDataSetChanged();
                        }
                    }
                }
                iVar.d();
                if (list.isEmpty()) {
                    w wVar2 = iVar.f263972o;
                    if (wVar2 != null) {
                        wVar2.b();
                    }
                } else {
                    w wVar3 = iVar.f263972o;
                    if (wVar3 != null) {
                        D6.w(wVar3.f264027g);
                    }
                }
            }
            dVar.f();
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            V2.f318762a.d("SearchSubscriptionPresenter", "load subscriptions error: " + th2);
            i iVar = i.this;
            iVar.f263966i.g(th2);
            EE0.d dVar = iVar.f263966i;
            dVar.k();
            iVar.d();
            if (K5.a(th2)) {
                w wVar = iVar.f263972o;
                if (wVar != null) {
                    wVar.b();
                }
            } else if (K5.e(th2)) {
                w wVar2 = iVar.f263972o;
                if (wVar2 != null) {
                    wVar2.a();
                }
            } else {
                w wVar3 = iVar.f263972o;
                if (wVar3 != null) {
                    wVar3.a();
                }
                w wVar4 = iVar.f263972o;
                if (wVar4 != null) {
                    wVar4.c(InterfaceC35741a1.a.a(iVar.f263959b, th2, null, null, 6), th2);
                }
            }
            dVar.h(th2);
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/saved_searches/model/SubscriptionResult;", VoiceInfo.STATE, "Lkotlin/G0;", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return;
            }
            boolean z12 = p22 instanceof P2.b;
            i iVar = i.this;
            if (z12) {
                iVar.e();
                return;
            }
            if (p22 instanceof P2.a) {
                iVar.d();
                ApiError apiError = ((P2.a) p22).f318719a;
                if (apiError instanceof ApiError.Unauthorized) {
                    w wVar = iVar.f263972o;
                    if (wVar != null) {
                        wVar.b();
                        return;
                    }
                    return;
                }
                w wVar2 = iVar.f263972o;
                if (wVar2 != null) {
                    wVar2.c(com.avito.android.printable_text.b.f(z.k(apiError)), new Throwable(z.k(apiError)));
                }
            }
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "throwable", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            i iVar = i.this;
            iVar.d();
            w wVar = iVar.f263972o;
            if (wVar != null) {
                wVar.c(InterfaceC35741a1.a.a(iVar.f263959b, th2, null, null, 6), th2);
            }
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "isAuthorized", "Lkotlin/G0;", "accept", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {
        public e() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            i iVar = i.this;
            if (zBooleanValue) {
                w wVar = iVar.f263972o;
                if (wVar != null) {
                    wVar.d();
                }
                iVar.f();
                return;
            }
            w wVar2 = iVar.f263972o;
            if (wVar2 != null) {
                wVar2.b();
            }
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final f<T> f263981b = new f<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.d("SearchSubscriptionPresenter", "initial subscriptions request error: " + ((Throwable) obj));
        }
    }

    /* compiled from: SearchSubscriptionPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            i.this.d();
        }
    }

    @Inject
    public i(@Y61.k InterfaceC35741a1 interfaceC35741a1, @Y61.k com.avito.android.libs.saved_searches.domain.i iVar, @Y61.k l lVar, @Y61.k TV.f fVar, @Y61.k G g12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k EE0.d dVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k Rp0.b bVar, @Y61.k FavoritesSpace favoritesSpace) {
        this.f263959b = interfaceC35741a1;
        this.f263960c = iVar;
        this.f263961d = lVar;
        this.f263962e = fVar;
        this.f263963f = g12;
        this.f263964g = interfaceC35745a5;
        this.f263965h = aVar;
        this.f263966i = dVar;
        this.f263967j = aVar2;
        this.f263968k = bVar;
        this.f263969l = favoritesSpace;
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void I0() {
        this.f263970m.e();
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void N(@Y61.l w wVar) {
        this.f263972o = wVar;
        TV.f fVar = this.f263962e;
        com.jakewharton.rxrelay3.c f15688c = fVar.getF15688c();
        InterfaceC35745a5 interfaceC35745a5 = this.f263964g;
        y yVarG = C35896f0.g(f15688c.j0(interfaceC35745a5.e()), new com.avito.android.search.subscriptions.e(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f263971n;
        cVar.b(yVarG);
        cVar.b(C35896f0.g(fVar.getF15689d().j0(interfaceC35745a5.e()), new com.avito.android.search.subscriptions.f(this)));
        cVar.b(fVar.getF15687b().j0(interfaceC35745a5.e()).v0(new com.avito.android.search.subscriptions.g(this), h.f263958b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void Q(@Y61.l SearchSubscriptionFragment searchSubscriptionFragment) {
        this.f263973p = searchSubscriptionFragment;
    }

    @Override // com.avito.android.search.subscriptions.adapter.e.a
    public final void a(@Y61.k com.avito.android.search.subscriptions.adapter.d dVar) {
        DeepLink deepLink = dVar.f263870h;
        if (deepLink == null) {
            return;
        }
        SavedSearchArgs savedSearchArgs = new SavedSearchArgs(null, null, "favorites", null, null, null, null, 123, null);
        Bundle bundle = new Bundle();
        bundle.putParcelable("saved_search_args", savedSearchArgs);
        this.f263967j.r6(bundle, deepLink, null);
    }

    @Override // com.avito.android.search.subscriptions.adapter.e.a
    public final void b(@Y61.k com.avito.android.search.subscriptions.adapter.d dVar) {
        DeepLink deepLink = dVar.f263871i;
        if (deepLink != null) {
            w wVar = this.f263972o;
            if (wVar != null) {
                wVar.d();
            }
            SearchSubscriptionFragment searchSubscriptionFragment = this.f263973p;
            if (searchSubscriptionFragment != null) {
                com.avito.android.deeplink_handler.handler.composite.a aVar = searchSubscriptionFragment.f263840n0;
                if (aVar == null) {
                    aVar = null;
                }
                Bundle bundle = new Bundle();
                NavigationSource[] navigationSourceArr = NavigationSource.f134362b;
                bundle.putString("DeepLinkNavigationSource", "SearchSubscription");
                G0 g02 = G0.f406611a;
                b.a.a(aVar, deepLink, null, bundle, 2);
            }
            this.f263971n.b(this.f263967j.d9().t0(new g()));
        }
    }

    @Override // com.avito.android.search.subscriptions.adapter.e.a
    public final void c(@Y61.k com.avito.android.search.subscriptions.adapter.d dVar) {
        w wVar = this.f263972o;
        if (wVar != null) {
            wVar.d();
        }
        L0 l0K = this.f263960c.k(dVar.f263864b);
        InterfaceC35745a5 interfaceC35745a5 = this.f263964g;
        this.f263971n.b(l0K.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new c(), new d(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void c0() {
        this.f263973p = null;
    }

    public final void d() {
        w wVar = this.f263972o;
        if (wVar != null) {
            wVar.f264026f.setRefreshing(false);
        }
        w wVar2 = this.f263972o;
        if (wVar2 != null) {
            wVar2.f264029i.j();
        }
    }

    public final void e() {
        C41982q1 c41982q1A = this.f263960c.a(this.f263969l);
        InterfaceC35745a5 interfaceC35745a5 = this.f263964g;
        this.f263970m.b(c41982q1A.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).v0(new a(), new b(), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void e0() throws IOException {
        this.f263971n.e();
        this.f263970m.e();
        Z41.a aVar = this.f263975r;
        CloseableDataSource closeableDataSource = aVar instanceof CloseableDataSource ? (CloseableDataSource) aVar : null;
        if (closeableDataSource != null) {
            try {
                closeableDataSource.close();
            } catch (IOException unused) {
            }
        }
        this.f263972o = null;
    }

    public final void f() {
        this.f263966i.j();
        this.f263974q = true;
        w wVar = this.f263972o;
        if (wVar != null) {
            wVar.f264026f.setRefreshing(true);
        }
        this.f263961d.a();
    }

    @Override // com.avito.android.progress_overlay.g
    public final void j0() {
        f();
    }

    @Override // com.avito.android.search.subscriptions.d
    public final void onResume() {
        this.f263970m.b(this.f263963f.g().j0(this.f263964g.e()).D(io.reactivex.rxjava3.internal.functions.a.f401991a).v0(new e(), f.f263981b, io.reactivex.rxjava3.internal.functions.a.f401993c));
        this.f263968k.a(SearchFeedbackCampaign.f.f264406b);
    }
}
