package com.avito.android.user_advert.advert.realty_verification;

import Y61.k;
import com.avito.android.advert.deeplinks.delivery.p;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: RealtyVerificationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/realty_verification/c;", "Lcom/avito/android/user_advert/advert/realty_verification/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC43640a> f310592a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35745a5 f310593b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.remote.error.f f310594c;

    @Inject
    public c(@k com.avito.android.remote.error.f fVar, @k InterfaceC35745a5 interfaceC35745a5, @k h31.e eVar) {
        this.f310592a = eVar;
        this.f310593b = interfaceC35745a5;
        this.f310594c = fVar;
    }

    @Override // com.avito.android.user_advert.advert.realty_verification.a
    @k
    public final C41982q1 a(@k String str, @k String str2) {
        return z.p(z.J0(z.c0(P2.c.f318721a)), new C42007e(new p(this, str, str2, 17)).r(new b(this)).u(new androidx.room.rxjava3.b(this, 22)).F()).x0(this.f310593b.a());
    }
}
