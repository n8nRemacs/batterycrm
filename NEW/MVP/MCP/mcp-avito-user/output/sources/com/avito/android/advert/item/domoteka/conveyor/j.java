package com.avito.android.advert.item.domoteka.conveyor;

import androidx.compose.runtime.internal.P;
import com.avito.android.account.E;
import com.avito.android.advert.item.W0;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.atomic.AtomicReference;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDomotekaTeaserPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/domoteka/conveyor/j;", "Lcom/avito/android/advert/item/domoteka/conveyor/d;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class j implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert.item.domoteka.a f75259b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_core.analytics.a f75260c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final E f75261d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f75262e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public W0 f75263f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public AtomicReference f75264g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public AtomicReference f75265h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public l f75266i;

    @Inject
    public j(@Y61.k com.avito.android.advert.item.domoteka.a aVar, @Y61.k com.avito.android.advert_core.analytics.a aVar2, @Y61.k E e12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f75259b = aVar;
        this.f75260c = aVar2;
        this.f75261d = e12;
        this.f75262e = interfaceC35745a5;
        Runnable runnable = io.reactivex.rxjava3.internal.functions.a.f401992b;
        this.f75264g = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
        this.f75265h = (AtomicReference) io.reactivex.rxjava3.disposables.d.E(runnable);
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.d
    public final void N(@Y61.l W0 w02) {
        this.f75263f = w02;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        l lVar = (l) eVar;
        AdvertDetailsDomotekaTeaserItem advertDetailsDomotekaTeaserItem = (AdvertDetailsDomotekaTeaserItem) aVar;
        this.f75266i = lVar;
        this.f75264g.dispose();
        this.f75264g = (AtomicReference) this.f75259b.b(advertDetailsDomotekaTeaserItem.f75244f).j0(this.f75262e.e()).v0(new f(lVar, this, advertDetailsDomotekaTeaserItem), g.f75256b, io.reactivex.rxjava3.internal.functions.a.f401993c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r0v1, types: [io.reactivex.rxjava3.disposables.d, java.util.concurrent.atomic.AtomicReference] */
    @Override // com.avito.android.advert.item.domoteka.conveyor.d
    public final void e0() {
        this.f75264g.dispose();
        this.f75265h.dispose();
    }

    @Override // com.avito.android.advert.item.domoteka.conveyor.d
    public final void l6() {
        this.f75260c.M3();
        l lVar = this.f75266i;
        if (lVar != null) {
            lVar.K40();
        }
    }
}
