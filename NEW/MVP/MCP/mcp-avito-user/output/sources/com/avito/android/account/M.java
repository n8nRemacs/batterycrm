package com.avito.android.account;

import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SessionKt;
import f90.InterfaceC40259h;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccountStorageInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/M;", "Lcom/avito/android/account/G;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class M implements G {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40259h f68046a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l90.g f68047b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B3.g f68048c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final B3.h f68049d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f68050e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a0 f68051f;

    /* renamed from: h, reason: collision with root package name */
    @J41.a
    @Y61.l
    public Session f68053h;

    /* renamed from: i, reason: collision with root package name */
    @J41.a
    @Y61.l
    public ProfileInfo f68054i;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Object f68052g = new Object();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<ProfileInfo> f68055j = com.jakewharton.rxrelay3.b.N0(ProfileInfo.INSTANCE.getNULL());

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.b<Session> f68056k = com.jakewharton.rxrelay3.b.N0(Session.INSTANCE.getNULL());

    @Inject
    public M(@Y61.k InterfaceC40259h interfaceC40259h, @Y61.k l90.g gVar, @Y61.k B3.g gVar2, @Y61.k B3.h hVar, @Y61.k com.avito.android.util.C c12, @Y61.k a0 a0Var) {
        this.f68046a = interfaceC40259h;
        this.f68047b = gVar;
        this.f68048c = gVar2;
        this.f68049d = hVar;
        this.f68050e = c12;
        this.f68051f = a0Var;
    }

    @Override // com.avito.android.account.E
    @Y61.l
    public final String a() {
        return e().getUserId();
    }

    @Override // com.avito.android.account.E
    public final boolean b() {
        return SessionKt.isAuthorized(p());
    }

    @Override // com.avito.android.account.E
    public final boolean c() {
        return this.f68049d.c();
    }

    @Override // com.avito.android.account.G
    @Y61.k
    /* renamed from: d, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF68056k() {
        return this.f68056k;
    }

    @Override // com.avito.android.account.G
    @Y61.k
    public final ProfileInfo e() {
        ProfileInfo profileInfoE;
        synchronized (this.f68052g) {
            profileInfoE = this.f68054i;
            if (profileInfoE == null) {
                profileInfoE = this.f68047b.e();
                this.f68054i = profileInfoE;
                this.f68055j.accept(profileInfoE);
            }
        }
        return profileInfoE;
    }

    @Override // com.avito.android.account.G
    @Y61.k
    /* renamed from: f, reason: from getter */
    public final com.jakewharton.rxrelay3.b getF68055j() {
        return this.f68055j;
    }

    @Override // com.avito.android.account.E
    @Y61.k
    public final B0 g() {
        return this.f68056k.d0(J.f68043b);
    }

    @Override // com.avito.android.account.G
    @Y61.k
    public final C41816g h(@Y61.l ProfileInfo profileInfo, @Y61.l Session session) {
        return new C41816g(new FX0.b(profileInfo, session, this, 4));
    }

    @Override // com.avito.android.account.G
    @Y61.k
    public final K i() {
        return new K(this);
    }

    @Override // com.avito.android.account.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.A j() {
        com.jakewharton.rxrelay3.b<ProfileInfo> bVar = this.f68055j;
        bVar.getClass();
        return (io.reactivex.rxjava3.internal.operators.maybe.A) new io.reactivex.rxjava3.internal.operators.observable.S(bVar).g(H.f68042b);
    }

    @Override // com.avito.android.account.E
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.maybe.A k() {
        return (io.reactivex.rxjava3.internal.operators.maybe.A) new io.reactivex.rxjava3.internal.operators.observable.S(m()).g(F.f68041b);
    }

    @Override // com.avito.android.account.G
    public final void l(boolean z12) {
        this.f68049d.d(z12);
    }

    @Override // com.avito.android.account.E
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.L m() {
        return this.f68055j.d0(L.f68045b).D(io.reactivex.rxjava3.internal.functions.a.f401991a);
    }

    @Override // com.avito.android.account.G
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.r n() {
        return new io.reactivex.rxjava3.internal.operators.completable.r(new VH0.c(this, 3));
    }

    @Override // com.avito.android.account.E
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.T o() {
        return g().S();
    }

    @Y61.k
    public final Session p() {
        Session sessionA;
        synchronized (this.f68052g) {
            sessionA = this.f68053h;
            if (sessionA == null) {
                sessionA = this.f68046a.a();
                if (sessionA == null) {
                    sessionA = Session.INSTANCE.getNULL();
                }
                this.f68053h = sessionA;
                this.f68056k.accept(sessionA == null ? Session.INSTANCE.getNULL() : sessionA);
            }
        }
        return sessionA;
    }
}
