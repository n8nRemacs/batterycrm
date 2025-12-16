package com.avito.android.user_favorites;

import com.avito.android.ab_tests.groups.SimpleTestGroup;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.event.D0;
import com.avito.android.bxcontent.N1;
import com.avito.android.user_favorites.adapter.FavoritesTab;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.R0;
import iE.InterfaceC41272a;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import jc.C42352a;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: UserFavoritesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_favorites/B;", "Lcom/avito/android/user_favorites/w;", "_avito_user-favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class B implements w {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q f316767a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f316768b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.lib.deprecated_design.tab.adapter.j<FavoritesTab> f316769c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC41272a f316770d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f316771e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f316772f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final M f316773g;

    /* renamed from: h, reason: collision with root package name */
    public final int f316774h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final N1 f316775i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.timestamp_storage.domain.d f316776j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final BE0.a f316777k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public L f316778l;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final C43238h f316780n;

    /* renamed from: p, reason: collision with root package name */
    public int f316782p;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f316779m = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public List<? extends FavoritesTab> f316781o = C42784z0.f406748b;

    @Inject
    public B(@Y61.k q qVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k R0 r02, @Y61.k com.avito.android.lib.deprecated_design.tab.adapter.j jVar, @Y61.k InterfaceC41272a interfaceC41272a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.account.G g12, @Y61.k M m12, @com.avito.android.user_favorites.di.d int i12, @Y61.k N1 n12, @Y61.k com.avito.android.timestamp_storage.domain.d dVar, @Y61.k BE0.a aVar, @Y61.l Kundle kundle) {
        Integer numB;
        this.f316767a = qVar;
        this.f316768b = interfaceC35745a5;
        this.f316769c = jVar;
        this.f316770d = interfaceC41272a;
        this.f316771e = interfaceC28373a;
        this.f316772f = g12;
        this.f316773g = m12;
        this.f316774h = i12;
        this.f316775i = n12;
        this.f316776j = dVar;
        this.f316777k = aVar;
        this.f316780n = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.b()));
        if (kundle != null && (numB = kundle.b("selected_tab")) != null) {
            i12 = numB.intValue();
        }
        this.f316782p = i12;
        if (i12 != -1) {
            return;
        }
        if (((SimpleTestGroup) interfaceC41272a.a().a()).a() || ((SimpleTestGroup) interfaceC41272a.b().a()).a()) {
            this.f316782p = 1;
        }
    }

    public final void a(List<? extends FavoritesTab> list) {
        this.f316781o = list;
        boolean z12 = list.size() >= 2;
        L l12 = this.f316778l;
        if (l12 != null) {
            l12.f316792d.setVisibility(z12 ? 0 : 8);
        }
        this.f316773g.f316796E.setValue(Boolean.valueOf(z12));
        this.f316769c.E5(this.f316781o);
    }

    public final int b(int i12) {
        Iterator<? extends FavoritesTab> it = this.f316781o.iterator();
        int i13 = 0;
        while (true) {
            if (!it.hasNext()) {
                i13 = -1;
                break;
            }
            if (it.next().getF316858f() == i12) {
                break;
            }
            i13++;
        }
        if (i13 < 0) {
            return 0;
        }
        return i13;
    }

    public final void c(int i12) {
        InterfaceC28373a interfaceC28373a = this.f316771e;
        if (i12 == 1) {
            interfaceC28373a.c(new C42352a());
        } else if (i12 == 2) {
            interfaceC28373a.c(new D0());
        } else {
            if (i12 != 5) {
                return;
            }
            interfaceC28373a.c(new JJ0.a(this.f316772f.a()));
        }
    }
}
