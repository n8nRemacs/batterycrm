package com.avito.android.user_advert.advert.delegate.installments;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.user_advert.advert.items.installments_promoblock.a;
import com.avito.android.user_advert.advert.items.installments_promoblock.l;
import com.avito.android.util.A4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.W;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/installments/f;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/installments/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f extends AbstractC40291a implements a {

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h f308608d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f308609e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f308610f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f308611g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final j f308612h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f308613i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public Object f308614j = EmptyDisposable.f401988b;

    @Inject
    public f(@Y61.k h hVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k j jVar, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f308608d = hVar;
        this.f308609e = interfaceC35745a5;
        this.f308610f = fVar;
        this.f308611g = aVar;
        this.f308612h = jVar;
        this.f308613i = interfaceC28373a;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.installments.a
    public final void G(@Y61.k com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        String str;
        a.C9491a c9491a = aVar.f309495g;
        if (c9491a == null || (str = c9491a.f309503e) == null) {
            return;
        }
        this.f308614j.dispose();
        h hVar = this.f308608d;
        this.f308614j = S(hVar.f308621a.c(str).z(hVar.f308622b.a()), aVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // com.avito.android.user_advert.advert.delegate.installments.a
    public final void P0(@Y61.k com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        List<l> list;
        ParametrizedClickStreamEvent parametrizedClickStreamEvent;
        this.f308614j.dispose();
        a.C9491a c9491a = aVar.f309495g;
        if (c9491a == null || (list = c9491a.f309506h) == null) {
            return;
        }
        for (l lVar : list) {
            if (lVar instanceof l.c) {
                l.c cVar = (l.c) lVar;
                String str = cVar.f309538a;
                if (str != null) {
                    this.f308614j.dispose();
                    h hVar = this.f308608d;
                    hVar.getClass();
                    this.f308614j = S(hVar.f308621a.a(str, A4.j(A4.f318516a, cVar.f309539b)).z(hVar.f308622b.a()), aVar);
                }
            } else if (lVar instanceof l.b) {
                DeepLink deepLink = ((l.b) lVar).f309537a;
                if (deepLink != null) {
                    b.a.a(this.f308611g, deepLink, null, null, 6);
                }
            } else if ((lVar instanceof l.a) && (parametrizedClickStreamEvent = ((l.a) lVar).f309536a) != null) {
                this.f308613i.c(parametrizedClickStreamEvent);
            }
        }
    }

    public final y S(W w12, com.avito.android.user_advert.advert.items.installments_promoblock.a aVar) {
        I0 i0J0 = w12.r(c.f308604b).u(new androidx.room.rxjava3.b(this, 21)).F().r0(P2.c.f318721a).j0(this.f308609e.e());
        d dVar = new d(this, aVar);
        final V2 v22 = V2.f318762a;
        return (y) i0J0.v0(dVar, new l41.g() { // from class: com.avito.android.user_advert.advert.delegate.installments.e
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.lang.Object] */
    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        this.f308614j.dispose();
        super.dispose();
    }
}
