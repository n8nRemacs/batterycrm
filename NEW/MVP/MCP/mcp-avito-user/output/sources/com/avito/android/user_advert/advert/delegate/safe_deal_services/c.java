package com.avito.android.user_advert.advert.delegate.safe_deal_services;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_advert.advert.delegate.safe_deal_services.b;
import com.avito.android.user_advert.advert.items.safe_deal_services.c;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l41.g;

/* compiled from: SafeDealServicesPresenterDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/delegate/safe_deal_services/c;", "LfH0/a;", "Lcom/avito/android/user_advert/advert/delegate/safe_deal_services/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements com.avito.android.user_advert.advert.delegate.safe_deal_services.a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.safedeal.d f308801d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f308802e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final com.avito.android.advert_core.safedeal.b f308803f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final HashMap<String, io.reactivex.rxjava3.disposables.d> f308804g = new HashMap<>();

    /* compiled from: SafeDealServicesPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "it", "accept", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c.b.a f308806c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f308807d;

        public a(c.b.a aVar, boolean z12) {
            this.f308806c = aVar;
            this.f308807d = z12;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            P2 p22 = (P2) obj;
            boolean z12 = p22 instanceof P2.c;
            boolean z13 = this.f308807d;
            c.b.a aVar = this.f308806c;
            c cVar = c.this;
            if (z12) {
                cVar.f395801b.accept(new b.a(c.b.a.P(aVar, z13, true)));
                return;
            }
            if (!(p22 instanceof P2.a)) {
                if (p22 instanceof P2.b) {
                    cVar.f395801b.accept(new b.a(c.b.a.P(aVar, z13, false)));
                }
            } else {
                com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar2 = cVar.f395801b;
                c.b.a aVarP = c.b.a.P(aVar, !z13, false);
                com.avito.android.advert_core.safedeal.b bVar = cVar.f308803f;
                cVar2.accept(new b.C9477b(aVarP, z13 ? bVar.f84184a : bVar.f84185b));
            }
        }
    }

    /* compiled from: SafeDealServicesPresenterDelegate.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements g {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T> f308808b = new b<>();

        @Override // l41.g
        public final void accept(Object obj) {
            V2.f318762a.f((Throwable) obj);
        }
    }

    @Inject
    public c(@k com.avito.android.advert_core.safedeal.d dVar, @k InterfaceC35745a5 interfaceC35745a5, @k com.avito.android.advert_core.safedeal.b bVar) {
        this.f308801d = dVar;
        this.f308802e = interfaceC35745a5;
        this.f308803f = bVar;
    }

    @Override // com.avito.android.user_advert.advert.delegate.safe_deal_services.a
    public final void P1(@k c.b.a aVar, boolean z12) {
        HashMap<String, io.reactivex.rxjava3.disposables.d> map = this.f308804g;
        String str = aVar.f310040h;
        if (map.get(str) == null ? false : !r2.getF318621e()) {
            return;
        }
        map.put(str, this.f308801d.a(str, z12).j0(this.f308802e.e()).v0(new a(aVar, z12), b.f308808b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // com.avito.android.user_advert.advert.delegate.safe_deal_services.a
    public final void X0(@k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    @Override // fH0.AbstractC40291a, io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        Iterator<Map.Entry<String, io.reactivex.rxjava3.disposables.d>> it = this.f308804g.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().dispose();
        }
        super.dispose();
    }
}
