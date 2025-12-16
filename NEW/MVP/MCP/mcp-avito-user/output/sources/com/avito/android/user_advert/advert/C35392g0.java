package com.avito.android.user_advert.advert;

import Hq0.C14021c;
import com.avito.android.B2;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.internal.operators.observable.C41982q1;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.LinkedHashMap;
import javax.inject.Inject;
import kotlin.Metadata;
import lI0.InterfaceC43640a;

/* compiled from: MyAdvertDetailsInteractor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/g0;", "Lcom/avito/android/user_advert/advert/S;", "Lcom/avito/android/user_advert/advert/g;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35392g0 implements S, InterfaceC35391g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC43640a> f308930a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f308931b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f308932c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B2 f308933d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final C35446q f308934e;

    @Inject
    public C35392g0(@Y61.k h31.e<InterfaceC43640a> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k B2 b22, @Y61.k C35446q c35446q) {
        this.f308930a = eVar;
        this.f308931b = interfaceC35745a5;
        this.f308932c = fVar;
        this.f308933d = b22;
        this.f308934e = c35446q;
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final C41982q1 a(@Y61.k String str) {
        return this.f308934e.a(str);
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L0 b(@Y61.k String str) {
        return this.f308934e.b(str);
    }

    @Override // com.avito.android.user_advert.advert.S
    @Y61.k
    public final C41982q1 c(@Y61.k String str, @Y61.k String str2) {
        return new C42007e(new U(this, str, str2, 1)).F().d0(C35386e0.f308892b).m0(new C35389f0(this)).x0(this.f308931b.a());
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W e(@Y61.k String str, @Y61.k String str2) {
        return this.f308934e.e(str, str2);
    }

    @Override // com.avito.android.user_advert.advert.S
    @Y61.k
    public final C41982q1 f(@Y61.k String str) {
        return new C42007e(new T(this, str, 0)).F().d0(C35380c0.f308518b).m0(new C35383d0(this)).x0(this.f308931b.a());
    }

    @Override // com.avito.android.user_advert.advert.S
    @Y61.k
    public final C41982q1 g(@Y61.k String str, @Y61.l String str2) {
        return new C42007e(new U(this, str, str2, 0)).r(W.f308441b).u(new V(this, 0)).F().x0(this.f308931b.a());
    }

    @Override // com.avito.android.user_advert.advert.S
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W h(@Y61.k String str, @Y61.k String str2, @Y61.k LinkedHashMap linkedHashMap) {
        return new C42007e(new C14021c(this, str, linkedHashMap, str2)).z(this.f308931b.a());
    }

    @Override // com.avito.android.user_advert.advert.InterfaceC35391g
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.W i(@Y61.k String str, @Y61.k String str2) {
        return this.f308934e.i(str, str2);
    }

    @Override // com.avito.android.user_advert.advert.S
    @Y61.k
    public final C41982q1 j(@Y61.k String str) {
        return new C42007e(new T(this, str, 1)).F().d0(Y.f308448b).m0(new Z(this)).x0(this.f308931b.a());
    }
}
