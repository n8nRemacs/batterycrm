package com.avito.android.serp.adapter.mini_menu;

import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.onboarding_manager.OnboardingType;
import com.avito.android.remote.model.serp.Onboarding;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import js0.InterfaceC42421a;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.s0;

/* compiled from: MiniMenuBlockPresenter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/mini_menu/m;", "Lcom/avito/android/serp/adapter/mini_menu/h;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class m implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.mini_menu.item.h f270378b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final rs0.c f270379c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding_manager.e f270380d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42421a f270381e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<MiniMenuItem> f270382f = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Q<Integer, Onboarding>> f270383g = new com.jakewharton.rxrelay3.b<>();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<Integer, Onboarding>> f270384h = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<Q<View, Onboarding>> f270385i = new com.jakewharton.rxrelay3.c<>();

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final io.reactivex.rxjava3.disposables.i f270386j = new io.reactivex.rxjava3.disposables.i(0);

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f270387k = new io.reactivex.rxjava3.disposables.c();

    @Inject
    public m(@Y61.k com.avito.android.serp.adapter.mini_menu.item.h hVar, @Y61.k rs0.c cVar, @J40.a @Y61.k com.avito.android.onboarding_manager.e eVar, @Y61.k InterfaceC42421a interfaceC42421a) {
        this.f270378b = hVar;
        this.f270379c = cVar;
        this.f270380d = eVar;
        this.f270381e = interfaceC42421a;
    }

    @Override // com.avito.android.serp.adapter.mini_menu.h
    public final void D5(int i12, @Y61.k Onboarding onboarding) {
        this.f270384h.accept(new Q<>(Integer.valueOf(i12), onboarding));
    }

    @Override // com.avito.android.serp.adapter.mini_menu.h
    @Y61.k
    public final C41981q0 E1() {
        com.jakewharton.rxrelay3.c<Q<View, Onboarding>> cVar = this.f270385i;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        Q q12;
        Object next;
        Onboarding onboarding;
        e eVar2 = (e) eVar;
        MiniMenuBlockItem miniMenuBlockItem = (MiniMenuBlockItem) aVar;
        this.f270378b.Z5(new i(this, i12, miniMenuBlockItem.f270312g));
        List<MiniMenuItem> list = miniMenuBlockItem.f270308c;
        eVar2.XC(list);
        eVar2.e3(this.f270379c.a(miniMenuBlockItem.f270307b));
        eVar2.U6(new j(eVar2, this, miniMenuBlockItem));
        Iterator<T> it = list.iterator();
        while (true) {
            q12 = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Onboarding onboarding2 = ((MiniMenuItem) next).f270350f;
            if (onboarding2 != null) {
                if (this.f270380d.b(onboarding2.getOnceShowId(), OnboardingType.f209409b)) {
                    break;
                }
            }
        }
        MiniMenuItem miniMenuItem = (MiniMenuItem) next;
        int iIndexOf = list.indexOf(miniMenuItem);
        Integer numValueOf = Integer.valueOf(iIndexOf);
        Onboarding onboarding3 = miniMenuItem != null ? miniMenuItem.f270350f : null;
        Q q13 = new Q(numValueOf, onboarding3);
        if (iIndexOf >= 0 && onboarding3 != null) {
            q12 = q13;
        }
        if (q12 != null && (onboarding = (Onboarding) q12.f406620c) != null) {
            this.f270383g.accept(new Q<>(q12.f406619b, onboarding));
        }
        io.reactivex.rxjava3.disposables.i iVar = this.f270386j;
        if (iVar != null) {
            iVar.a(this.f270384h.t0(new l(eVar2, this)));
        }
    }

    @Override // com.avito.android.serp.adapter.mini_menu.h
    public final void clear() {
        io.reactivex.rxjava3.disposables.i iVar = this.f270386j;
        if (iVar != null) {
            iVar.a(null);
        }
        this.f270387k.e();
    }

    @Override // com.avito.android.serp.adapter.mini_menu.h
    @Y61.k
    public final C41981q0 i6() {
        com.jakewharton.rxrelay3.c<MiniMenuItem> cVar = this.f270382f;
        return com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar);
    }

    @Override // com.avito.android.serp.adapter.mini_menu.h
    @Y61.k
    public final C41981q0 x4() {
        com.jakewharton.rxrelay3.b<Q<Integer, Onboarding>> bVar = this.f270383g;
        bVar.getClass();
        return new C41981q0(bVar);
    }
}
