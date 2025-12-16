package com.avito.android.inline_filters;

import com.avito.android.geo_common.interactor.InterfaceC30715a;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: LocationDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/inline_filters/s;", "Lcom/avito/android/inline_filters/W;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.inline_filters.s, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C31058s implements W {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.geo_common.interactor.g f172365a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30715a f172366b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f172367c;

    @Inject
    public C31058s(@Y61.k com.avito.android.geo_common.interactor.g gVar, @Y61.k InterfaceC30715a interfaceC30715a, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f172365a = gVar;
        this.f172366b = interfaceC30715a;
        this.f172367c = interfaceC35745a5;
    }

    @Override // com.avito.android.inline_filters.W
    @Y61.k
    public final I0 a(@Y61.k String str) {
        io.reactivex.rxjava3.internal.operators.observable.F f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new r(this, str, 2));
        InterfaceC35745a5 interfaceC35745a5 = this.f172367c;
        return f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }

    @Override // com.avito.android.inline_filters.W
    @Y61.k
    public final I0 h(@Y61.k String str) {
        io.reactivex.rxjava3.internal.operators.observable.F f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new r(this, str, 1));
        InterfaceC35745a5 interfaceC35745a5 = this.f172367c;
        return f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }

    @Override // com.avito.android.inline_filters.W
    @Y61.k
    public final I0 i(@Y61.k String str) {
        io.reactivex.rxjava3.internal.operators.observable.F f12 = new io.reactivex.rxjava3.internal.operators.observable.F(new r(this, str, 0));
        InterfaceC35745a5 interfaceC35745a5 = this.f172367c;
        return f12.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e());
    }
}
