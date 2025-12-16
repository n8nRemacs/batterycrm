package com.avito.android.account;

import A3.a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AccountUpdateInteractorImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/U;", "Lcom/avito/android/account/O;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U implements O {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f68076a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final G f68077b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final e0 f68078c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final h31.e<Set<A3.b>> f68079d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final B3.f f68080e;

    @Inject
    public U(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k G g12, @Y61.k e0 e0Var, @Y61.k h31.e<Set<A3.b>> eVar, @Y61.k B3.f fVar) {
        this.f68076a = interfaceC28373a;
        this.f68077b = g12;
        this.f68078c = e0Var;
        this.f68079d = eVar;
        this.f68080e = fVar;
    }

    @Override // com.avito.android.account.O
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K a(@Y61.l String str, boolean z12) {
        return this.f68077b.n().k(new P(0, this, str, z12));
    }

    @Override // com.avito.android.account.O
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K b(@Y61.l String str, @Y61.k Session session, @Y61.l String str2) {
        return i(session, null, str2).k(new Q(this, session, str, 0));
    }

    @Override // com.avito.android.account.O
    public final void c(@Y61.k a.InterfaceC0003a.b bVar) {
        Iterator<T> it = j().iterator();
        while (it.hasNext()) {
            ((A3.b) it.next()).l(bVar);
        }
    }

    @Override // com.avito.android.account.O
    public final void d(@Y61.l Boolean bool, @Y61.k String str) {
        Iterator<T> it = j().iterator();
        while (it.hasNext()) {
            ((A3.b) it.next()).m(bool, str);
        }
    }

    @Override // com.avito.android.account.O
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K e(@Y61.k Session session, @Y61.k ProfileInfo profileInfo, @Y61.l String str) {
        return i(session, profileInfo, str).k(new S(profileInfo, this, session, 1));
    }

    @Override // com.avito.android.account.O
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K f(@Y61.k ProfileInfo profileInfo, @Y61.k Session session) {
        return i(session, profileInfo, null).k(new S(profileInfo, this, session, 0));
    }

    @Override // com.avito.android.account.O
    public final void g(@Y61.k a.InterfaceC0003a.C0004a c0004a) {
        Iterator<T> it = j().iterator();
        while (it.hasNext()) {
            ((A3.b) it.next()).d(c0004a);
        }
    }

    @Override // com.avito.android.account.O
    public final void h() {
        Iterator<T> it = j().iterator();
        while (it.hasNext()) {
            ((A3.b) it.next()).i(a.b.f75a);
        }
    }

    public final io.reactivex.rxjava3.internal.operators.completable.K i(Session session, ProfileInfo profileInfo, String str) {
        return this.f68077b.h(profileInfo, session).n(new T(this)).k(new Q(this, session, str, 1));
    }

    public final Set<A3.b> j() {
        return this.f68079d.get();
    }
}
