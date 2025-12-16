package com.avito.android.home.default_search_location;

import android.app.Activity;
import android.location.Location;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

/* compiled from: DefaultSearchLocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/default_search_location/d;", "Lcom/avito/android/home/default_search_location/c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f162381a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.location.find.l f162382b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final WeakReference<Activity> f162383c;

    public d(@Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k Activity activity, @Y61.k com.avito.android.location.find.l lVar) {
        this.f162381a = interfaceC35745a5;
        this.f162382b = lVar;
        this.f162383c = new WeakReference<>(activity);
    }

    @Override // com.avito.android.home.default_search_location.c
    @Y61.k
    public final I<Location> a() {
        Activity activity = this.f162383c.get();
        C41964k1 c41964k1 = activity != null ? new C41964k1(this.f162382b.b(activity, (4 & 2) == 0, (4 & 4) == 0).j0(this.f162381a.a()), null) : null;
        return c41964k1 == null ? I.l(new IllegalArgumentException(" DefaultSearchLocationInteractorImpl: no activity reference found")) : c41964k1;
    }
}
