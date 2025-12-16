package com.avito.android.authorization.auth;

import com.avito.android.account.InterfaceC27663a;
import com.avito.android.account.X;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import hD.C40806a;
import io.reactivex.rxjava3.internal.operators.observable.H0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AuthInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/r;", "Lcom/avito/android/authorization/auth/o;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class r implements InterfaceC28636o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f93049a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final B3.c f93050b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93051c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C40806a f93052d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f93053e;

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final a<T, R> f93054b = new a<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return io.reactivex.rxjava3.core.z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return io.reactivex.rxjava3.core.z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: TypedResults.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lcom/avito/android/util/P2;", VoiceInfo.STATE, "Lio/reactivex/rxjava3/core/E;", "apply", "(Lcom/avito/android/util/P2;)Lio/reactivex/rxjava3/core/E;", "com/avito/android/util/a6", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T, R> implements l41.o {

        /* renamed from: b, reason: collision with root package name */
        public static final b<T, R> f93055b = new b<>();

        @Override // l41.o
        public final Object apply(Object obj) {
            P2 p22 = (P2) obj;
            if (p22 instanceof P2.c) {
                return H0.f403644b;
            }
            if (p22 instanceof P2.b) {
                return io.reactivex.rxjava3.core.z.c0(((P2.b) p22).f318720a);
            }
            if (p22 instanceof P2.a) {
                return io.reactivex.rxjava3.core.z.M(C35936s.a(((P2.a) p22).f318719a, null));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public r(@Y61.k InterfaceC27663a interfaceC27663a, @Y61.k B3.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C40806a c40806a, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f93049a = interfaceC27663a;
        this.f93050b = cVar;
        this.f93051c = interfaceC35745a5;
        this.f93052d = c40806a;
        this.f93053e = interfaceC28373a;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28636o
    @Y61.k
    public final io.reactivex.rxjava3.core.z<SocialAuthResult> c(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f93049a.e(new X.b.a(str, str2), str3, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : null, (124 & 16) != 0 ? null : null, (124 & 32) != 0 ? null : null, (124 & 64) != 0 ? null : null).T(b.f93055b, Integer.MAX_VALUE).S().F();
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28636o
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.M d(@Y61.k Profile profile, @Y61.k Session session, @Y61.l String str) {
        return InterfaceC27663a.C2131a.b(this.f93049a, session, profile, str, null, null, null, 120).x(this.f93051c.a());
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28636o
    @Y61.k
    public final io.reactivex.rxjava3.core.z<SocialAuthResult> e(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8) {
        return this.f93049a.e(new X.b.C2130b(str2, str3, str), str4, (124 & 4) != 0 ? null : null, (124 & 8) != 0 ? null : str5, (124 & 16) != 0 ? null : str6, (124 & 32) != 0 ? null : str7, (124 & 64) != 0 ? null : str8).T(a.f93054b, Integer.MAX_VALUE).S().F();
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28636o
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.O f(@Y61.l String str) {
        C40806a c40806a = this.f93052d;
        c40806a.getClass();
        kotlin.reflect.n<Object> nVar = C40806a.f397105l[2];
        return (((Boolean) c40806a.f397108d.a().invoke()).booleanValue() ? new io.reactivex.rxjava3.internal.operators.single.G(new VH0.c(this, 11)).r(C28639s.f93056b).z(this.f93051c.a()) : io.reactivex.rxjava3.core.I.q(0)).k(new C28637p(this, str)).r(C28638q.f93048b);
    }
}
