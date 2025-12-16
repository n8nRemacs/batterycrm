package com.avito.android.advert.item.domoteka;

import Gx.InterfaceC13925a;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.DomotekaTeaserResponse;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.observable.C41984r1;
import io.reactivex.rxjava3.internal.operators.observable.F;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;
import l41.o;

/* compiled from: DomotekaTeaserInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/domoteka/c;", "Lcom/avito/android/advert/item/domoteka/a;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c implements com.avito.android.advert.item.domoteka.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC13925a> f75236a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f75237b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AtomicReference<DomotekaTeaserResponse> f75238c;

    /* compiled from: DomotekaTeaserInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/DomotekaTeaserResponse;", "it", "Lcom/avito/android/util/P2;", "apply", "(Lcom/avito/android/remote/DomotekaTeaserResponse;)Lcom/avito/android/util/P2;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f75239b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            return new P2.b((DomotekaTeaserResponse) obj);
        }
    }

    @Inject
    public c(@k h31.e eVar, @k InterfaceC35745a5 interfaceC35745a5, @l @g Kundle kundle) {
        this.f75236a = eVar;
        this.f75237b = interfaceC35745a5;
        this.f75238c = new AtomicReference<>(kundle != null ? (DomotekaTeaserResponse) kundle.d("domoteka_teaser_key") : null);
    }

    @Override // com.avito.android.advert.item.domoteka.a
    @k
    public final C41982q1 a(@k String str) {
        return new F(new b(this, str, 1)).x0(this.f75237b.a());
    }

    @Override // com.avito.android.advert.item.domoteka.a
    @k
    public final z<P2<DomotekaTeaserResponse>> b(@k String str) {
        int i12 = 0;
        DomotekaTeaserResponse domotekaTeaserResponse = this.f75238c.get();
        z zVarC0 = domotekaTeaserResponse == null ? U.f403867b : z.c0(domotekaTeaserResponse);
        C41982q1 c41982q1X0 = new F(new b(this, str, i12)).K(new d(this)).x0(this.f75237b.a());
        zVarC0.getClass();
        return z.q(z.c0(P2.c.f318721a), new C41984r1(zVarC0, c41982q1X0).d0(a.f75239b));
    }

    @Override // com.avito.android.advert.item.domoteka.a
    @k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f75238c.get(), "domoteka_teaser_key");
        return kundle;
    }
}
