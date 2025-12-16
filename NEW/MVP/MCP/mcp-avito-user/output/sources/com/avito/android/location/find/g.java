package com.avito.android.location.find;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import kotlin.Metadata;
import qW.C47352a;

/* compiled from: DetectLocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/g;", "Lcom/avito/android/location/find/DetectLocationInteractor;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements DetectLocationInteractor {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C47352a f181752a;

    /* renamed from: b, reason: collision with root package name */
    public final int f181753b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f181754c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo.j f181755d;

    public g(@Y61.k C47352a c47352a, int i12, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.geo.j jVar) {
        this.f181752a = c47352a;
        this.f181753b = i12;
        this.f181754c = interfaceC35745a5;
        this.f181755d = jVar;
    }

    @Override // com.avito.android.location.find.DetectLocationInteractor
    @Y61.k
    public final C41982q1 a(boolean z12) {
        return new C(new s(this, z12)).x0(this.f181754c.e());
    }
}
