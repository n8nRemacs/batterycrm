package com.avito.android.user_advert.advert;

import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertDetailsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/q;", "Lcom/avito/android/user_advert/advert/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35446q implements InterfaceC35391g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43640a> f310579a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f310580b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f310581c;

    @Inject
    public C35446q(@Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k h31.e eVar) {
        this.f310579a = eVar;
        this.f310580b = interfaceC35745a5;
        this.f310581c = fVar;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final C41982q1 a(@Y61.k String str) {
        return new io.reactivex.rxjava3.internal.operators.observable.F(new C35394h(this, str, 0)).d0(C35428k.f310424b).m0(new C35431l(this)).x0(this.f310580b.a());
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L0 b(@Y61.k String str) {
        io.reactivex.rxjava3.internal.operators.observable.B0 b0D0 = new io.reactivex.rxjava3.internal.operators.observable.F(new C35394h(this, str, 1)).d0(C35434m.f310430b);
        InterfaceC35745a5 interfaceC35745a5 = this.f310580b;
        return b0D0.x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).m0(new C35437n(this));
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W e(@Y61.k String str, @Y61.k String str2) {
        return new C42007e(new C35397i(this, str, str2, 1)).r(C35440o.f310571b).u(new C35425j(this, 1)).z(this.f310580b.a());
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W i(@Y61.k String str, @Y61.k String str2) {
        return new C42007e(new C35397i(this, str2, str, 0)).r(C35443p.f310576b).u(new C35425j(this, 0)).z(this.f310580b.a());
    }
}
