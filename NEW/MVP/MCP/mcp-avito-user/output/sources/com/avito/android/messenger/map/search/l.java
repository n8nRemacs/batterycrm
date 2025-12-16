package com.avito.android.messenger.map.search;

import androidx.compose.runtime.internal.P;
import com.avito.android.messenger.map.search.h;
import com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c;
import com.avito.android.mvi.rx3.with_monolithic_state.F;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.util.InterfaceC35745a5;
import java.util.concurrent.atomic.AtomicLong;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.Metadata;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: GeoSearchInteractor.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/messenger/map/search/l;", "Lcom/avito/android/messenger/map/search/h;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/c;", "Lcom/avito/android/messenger/map/search/h$a;", "a", "b", "c", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class l extends AbstractC32892c<h.a> implements h {

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final String f196572V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final GeoPoint f196573W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f196574X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f196575Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.k
    public final AtomicLong f196576Z;

    /* compiled from: GeoSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/l$a;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/map/search/h$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends com.avito.android.mvi.rx3.with_monolithic_state.p<h.a> {
        public a() {
            throw null;
        }
    }

    /* compiled from: GeoSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/l$b;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/p;", "Lcom/avito/android/messenger/map/search/h$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class b extends com.avito.android.mvi.rx3.with_monolithic_state.p<h.a> {
        public b() {
            throw null;
        }
    }

    /* compiled from: GeoSearchInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/map/search/l$c;", "Lcom/avito/android/mvi/rx3/with_monolithic_state/o;", "Lcom/avito/android/messenger/map/search/h$a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class c extends com.avito.android.mvi.rx3.with_monolithic_state.o<h.a> {
        public c() {
            throw null;
        }
    }

    public l() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public l(@Y61.k @Named("channel_id") String str, @Y61.l @Named("item_location") GeoPoint geoPoint, @Y61.l @Named("center_point") GeoPoint geoPoint2, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        F f12 = new F(interfaceC35745a5.a(), null, 2, 0 == true ? 1 : 0);
        h.a.f196562c.getClass();
        super("GeoSearchInteractor", h.a.f196563d, interfaceC35745a5, null, f12, null, null, null, 232, null);
        this.f196572V = str;
        this.f196573W = geoPoint2;
        this.f196574X = interfaceC47842z;
        this.f196575Y = new io.reactivex.rxjava3.disposables.c();
        this.f196576Z = new AtomicLong(0L);
        le().s(new b(null, null, new n(this, geoPoint), 3, null));
    }

    @Override // com.avito.android.messenger.map.search.h
    public final void ee(@Y61.k String str) {
        long andIncrement = this.f196576Z.getAndIncrement();
        le().s(new c(null, "requestId = " + andIncrement + ", query = " + str, new o(andIncrement, this, str), 1, null));
    }

    @Override // com.avito.android.mvi.rx3.with_monolithic_state.AbstractC32892c, androidx.view.M0
    public final void onCleared() {
        this.f196575Y.e();
        super.onCleared();
    }
}
