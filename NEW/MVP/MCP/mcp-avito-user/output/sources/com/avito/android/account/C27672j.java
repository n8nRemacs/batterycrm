package com.avito.android.account;

import Hq0.C14021c;
import Wd.InterfaceC15745b;
import Yd.InterfaceC18254a;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.account.X;
import com.avito.android.account.Y;
import com.avito.android.account.analytics.event.SaveSuggestEvent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.InterfaceC34258d;
import com.avito.android.remote.model.AuthResult;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.C35783e4;
import com.avito.android.util.C5;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import fg0.InterfaceC40419c;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.observable.C41986s0;
import io.reactivex.rxjava3.internal.operators.observable.D0;
import io.reactivex.rxjava3.internal.operators.observable.L0;
import io.reactivex.rxjava3.internal.operators.single.C42007e;
import java.util.Locale;
import java.util.Objects;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.rx3.C43292o;
import l41.InterfaceC43543a;

/* compiled from: AccountInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/j;", "Lcom/avito/android/account/a;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.account.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27672j implements InterfaceC27663a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC34258d> f68145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40419c f68146b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B3.c f68147c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f68148d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final O f68149e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E f68150f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.remote.error.f f68151g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC18254a f68152h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f68153i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.P f68154j;

    /* compiled from: AccountInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/LoginResult;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.account.AccountInteractorImpl$loginTfa$2", f = "AccountInteractorImpl.kt", i = {0, 1, 2}, l = {92, 105, 115}, m = "invokeSuspend", n = {"trackerUID", "result", "result"}, s = {"L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.account.j$a */
    public static final class a extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<LoginResult>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f68155q;

        /* renamed from: r, reason: collision with root package name */
        public int f68156r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f68158t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ TfaFlow f68159u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y f68160v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, TfaFlow tfaFlow, Y y12, Continuation<? super a> continuation) {
            super(1, continuation);
            this.f68158t = str;
            this.f68159u = tfaFlow;
            this.f68160v = y12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
            return C27672j.this.new a(this.f68158t, this.f68159u, this.f68160v, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<LoginResult>> continuation) {
            return ((a) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC15745b.C1278b c1278b;
            Object objC;
            TypedResult typedResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f68156r;
            C27672j c27672j = C27672j.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                c1278b = new InterfaceC15745b.C1278b();
                io.reactivex.rxjava3.core.z<TypedResult<LoginResult>> zVarB = c27672j.f68145a.get().b(this.f68158t, this.f68159u.name().toLowerCase(Locale.ROOT), c1278b.f17994a);
                this.f68155q = c1278b;
                this.f68156r = 1;
                objC = C43292o.c(zVarB, this);
                if (objC == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2 && i12 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    typedResult = (TypedResult) this.f68155q;
                    C42729a0.b(obj);
                    return typedResult;
                }
                c1278b = (InterfaceC15745b.C1278b) this.f68155q;
                C42729a0.b(obj);
                objC = obj;
            }
            TypedResult typedResult2 = (TypedResult) objC;
            TypedResult.Success success = typedResult2 instanceof TypedResult.Success ? (TypedResult.Success) typedResult2 : null;
            LoginResult loginResult = success != null ? (LoginResult) success.getResult() : null;
            LoginResult.Ok ok2 = loginResult instanceof LoginResult.Ok ? (LoginResult.Ok) loginResult : null;
            AuthResult authResult = ok2 != null ? ok2.getAuthResult() : null;
            if (authResult == null) {
                return typedResult2;
            }
            C27672j.g(c27672j, authResult, c1278b);
            Y y12 = this.f68160v;
            if (y12 instanceof Y.a) {
                AbstractC41768a abstractC41768aB = InterfaceC27663a.C2131a.b(C27672j.this, authResult.getSession(), authResult.getProfile(), null, "login", null, ((Y.a) y12).f68093a, 64);
                this.f68155q = typedResult2;
                this.f68156r = 2;
                if (C43292o.a(abstractC41768aB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (!(y12 instanceof Y.b)) {
                    return typedResult2;
                }
                Y.b bVar = (Y.b) y12;
                AbstractC41768a abstractC41768aB2 = InterfaceC27663a.C2131a.b(C27672j.this, authResult.getSession(), authResult.getProfile(), bVar.f68094a, "login", bVar.f68095b, null, 96);
                this.f68155q = typedResult2;
                this.f68156r = 3;
                if (C43292o.a(abstractC41768aB2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            typedResult = typedResult2;
            return typedResult;
        }
    }

    @Inject
    public C27672j(@Y61.k h31.e<InterfaceC34258d> eVar, @Y61.k InterfaceC40419c interfaceC40419c, @Y61.k B3.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k O o12, @Y61.k E e12, @Y61.k com.avito.android.remote.error.f fVar, @Y61.k InterfaceC18254a interfaceC18254a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.P p12) {
        this.f68145a = eVar;
        this.f68146b = interfaceC40419c;
        this.f68147c = cVar;
        this.f68148d = interfaceC35745a5;
        this.f68149e = o12;
        this.f68150f = e12;
        this.f68151g = fVar;
        this.f68152h = interfaceC18254a;
        this.f68153i = interfaceC28373a;
        this.f68154j = p12;
    }

    public static final void g(C27672j c27672j, AuthResult authResult, InterfaceC15745b.C1278b c1278b) {
        c27672j.getClass();
        InterfaceC15745b.a.C1277a c1277a = InterfaceC15745b.a.f17990c;
        String userHashId = authResult.getProfile().getUserHashId();
        c1277a.getClass();
        c27672j.f68152h.a(InterfaceC15745b.a.C1277a.a(c1278b, userHashId));
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K a(@Y61.l String str, boolean z12) {
        io.reactivex.rxjava3.internal.operators.observable.W wN2 = new D0(this.f68146b.a().p(new C27673k(this)).x0(this.f68148d.a())).N(new C27685x(C27674l.f68162l));
        l41.o oVar = C27686y.f68184b;
        Objects.requireNonNull(oVar, "selector is null");
        return new C41986s0(new io.reactivex.rxjava3.internal.operators.observable.I(wN2, oVar)).g(this.f68149e.a(str, z12)).l(C27675m.f68163b);
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.l
    public final Object b(@Y61.k String str, @Y61.k TfaFlow tfaFlow, @Y61.k Y y12, @Y61.k Continuation<? super TypedResult<LoginResult>> continuation) {
        return h(new a(str, tfaFlow, y12, null), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.mixed.a c(@Y61.k X.a aVar, @Y61.l String str, @Y61.l String str2) {
        InterfaceC15745b.C1278b c1278b = new InterfaceC15745b.C1278b();
        return new io.reactivex.rxjava3.internal.operators.mixed.a(this.f68150f.o().o(new C27676n(this)), this.f68146b.a().p(new C27670h(this, aVar, str, str2, c1278b)).x0(this.f68148d.a()).d0(C27687z.f68185b).r0(P2.c.f318721a).T(new C27683v(this, c1278b, aVar.f68086a), Integer.MAX_VALUE).l0(new r(this)).m0(new C27684w(this)));
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.completable.K d(@Y61.k Session session, @Y61.k final Profile profile, @Y61.l final String str, @Y61.k String str2, @Y61.l final String str3, @Y61.l final String str4, @Y61.k final SaveSuggestEvent.Source source) {
        return this.f68149e.e(session, C35783e4.a(profile), str2).k(new InterfaceC43543a() { // from class: com.avito.android.account.b
            @Override // l41.InterfaceC43543a
            public final void run() {
                String userHashId = profile.getUserHashId();
                if (userHashId != null) {
                    String str5 = str3;
                    String str6 = str4;
                    String str7 = str;
                    Z z12 = new Z(userHashId, str6, str7, str5);
                    C27672j c27672j = this.f68112b;
                    c27672j.f68147c.d(z12);
                    c27672j.f68153i.c(new SaveSuggestEvent(source, str7 != null ? SaveSuggestEvent.LoginType.f68103e : (str6 == null || !C5.f318567a.e(str6)) ? SaveSuggestEvent.LoginType.f68102d : SaveSuggestEvent.LoginType.f68101c));
                }
            }
        });
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.k
    public final L0 e(@Y61.k X.b bVar, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6) {
        InterfaceC15745b.C1278b c1278b = new InterfaceC15745b.C1278b();
        return this.f68146b.a().p(new C27671i(bVar, this, str, str2, c1278b, str3, str4, str5, str6)).x0(this.f68148d.a()).d0(A.f68030b).T(new C27668f(this, c1278b, bVar), Integer.MAX_VALUE).r0(P2.c.f318721a).l0(new r(this)).m0(new C27669g(this));
    }

    @Override // com.avito.android.account.InterfaceC27663a
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.single.U f(@Y61.k String str, @Y61.k String str2, boolean z12) {
        InterfaceC15745b.C1278b c1278b = new InterfaceC15745b.C1278b();
        return (z12 ? new C42007e(new C14021c(1, str2, this, str, c1278b)) : this.f68146b.a().n(new C27665c(this, str2, str, c1278b))).z(this.f68148d.a()).r(C27666d.f68123b).n(new C27667e(this, c1278b, str2)).t(new C27682u(this)).u(new androidx.room.rxjava3.b(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(Y41.l r7, kotlin.coroutines.jvm.internal.ContinuationImpl r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.avito.android.account.C27677o
            if (r0 == 0) goto L13
            r0 = r8
            com.avito.android.account.o r0 = (com.avito.android.account.C27677o) r0
            int r1 = r0.f68168t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f68168t = r1
            goto L18
        L13:
            com.avito.android.account.o r0 = new com.avito.android.account.o
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f68166r
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f68168t
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L45
            if (r2 == r4) goto L38
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            java.lang.Object r7 = r0.f68165q
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            kotlin.C42729a0.b(r8)
            goto L7b
        L38:
            java.lang.Object r7 = r0.f68165q
            com.avito.android.account.j r7 = (com.avito.android.account.C27672j) r7
            kotlin.C42729a0.b(r8)     // Catch: java.lang.Throwable -> L40
            goto L55
        L40:
            r8 = move-exception
            r5 = r8
            r8 = r7
            r7 = r5
            goto L5a
        L45:
            kotlin.C42729a0.b(r8)
            r0.f68165q = r6     // Catch: java.lang.Throwable -> L58
            r0.f68168t = r4     // Catch: java.lang.Throwable -> L58
            com.avito.android.account.j$a r7 = (com.avito.android.account.C27672j.a) r7     // Catch: java.lang.Throwable -> L58
            java.lang.Object r8 = r7.invoke(r0)     // Catch: java.lang.Throwable -> L58
            if (r8 != r1) goto L55
            return r1
        L55:
            return r8
        L56:
            r8 = r6
            goto L5a
        L58:
            r7 = move-exception
            goto L56
        L5a:
            boolean r2 = com.avito.android.util.K5.d(r7)
            if (r2 == 0) goto L7b
            com.avito.android.account.E r2 = r8.f68150f
            boolean r2 = r2.b()
            if (r2 == 0) goto L7b
            com.avito.android.account.O r8 = r8.f68149e
            java.lang.String r2 = "login_error"
            io.reactivex.rxjava3.internal.operators.completable.K r8 = r8.a(r2, r4)
            r0.f68165q = r7
            r0.f68168t = r3
            java.lang.Object r8 = kotlinx.coroutines.rx3.C43292o.a(r8, r0)
            if (r8 != r1) goto L7b
            return r1
        L7b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.account.C27672j.h(Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
