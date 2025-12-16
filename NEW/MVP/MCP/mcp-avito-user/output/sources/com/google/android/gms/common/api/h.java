package com.google.android.gms.common.api;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.collection.C20203c;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C36687f;
import com.google.android.gms.common.api.C36616a;
import com.google.android.gms.common.api.C36616a.d;
import com.google.android.gms.common.api.i;
import com.google.android.gms.common.api.internal.AbstractC36669t;
import com.google.android.gms.common.api.internal.B0;
import com.google.android.gms.common.api.internal.BinderC36624a1;
import com.google.android.gms.common.api.internal.C36625b;
import com.google.android.gms.common.api.internal.C36628c;
import com.google.android.gms.common.api.internal.C36634e;
import com.google.android.gms.common.api.internal.C36646i;
import com.google.android.gms.common.api.internal.C36654l;
import com.google.android.gms.common.api.internal.C36658n;
import com.google.android.gms.common.api.internal.C36660o;
import com.google.android.gms.common.api.internal.C36671u;
import com.google.android.gms.common.api.internal.C36676w0;
import com.google.android.gms.common.api.internal.I;
import com.google.android.gms.common.api.internal.InterfaceC36656m;
import com.google.android.gms.common.api.internal.InterfaceC36679y;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.O0;
import com.google.android.gms.common.api.internal.ServiceConnectionC36662p;
import com.google.android.gms.common.api.internal.l1;
import com.google.android.gms.common.api.internal.n1;
import com.google.android.gms.common.api.internal.o1;
import com.google.android.gms.common.internal.AbstractC36699e;
import com.google.android.gms.common.internal.C36703g;
import com.google.android.gms.common.internal.C36727t;
import com.google.android.gms.common.internal.C36729v;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.C37028k;
import com.google.android.gms.tasks.Task;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import j.K;
import j.N;
import j.P;
import j.l0;
import java.util.Collection;
import java.util.Collections;
import r61.InterfaceC47501c;

/* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
/* loaded from: classes6.dex */
public abstract class h<O extends C36616a.d> implements j<O> {

    /* renamed from: a, reason: collision with root package name */
    public final Context f348920a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f348921b;

    /* renamed from: c, reason: collision with root package name */
    public final C36616a f348922c;

    /* renamed from: d, reason: collision with root package name */
    public final C36616a.d f348923d;

    /* renamed from: e, reason: collision with root package name */
    public final C36628c f348924e;

    /* renamed from: f, reason: collision with root package name */
    public final Looper f348925f;

    /* renamed from: g, reason: collision with root package name */
    public final int f348926g;

    /* renamed from: h, reason: collision with root package name */
    @InterfaceC47501c
    public final B0 f348927h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC36679y f348928i;

    /* renamed from: j, reason: collision with root package name */
    @N
    public final C36646i f348929j;

    /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
    @RX0.a
    public static class a {

        /* renamed from: c, reason: collision with root package name */
        @N
        @RX0.a
        public static final a f348930c = new C10621a().a();

        /* renamed from: a, reason: collision with root package name */
        @N
        public final InterfaceC36679y f348931a;

        /* renamed from: b, reason: collision with root package name */
        @N
        public final Looper f348932b;

        /* compiled from: com.google.android.gms:play-services-base@@18.3.0 */
        @RX0.a
        /* renamed from: com.google.android.gms.common.api.h$a$a, reason: collision with other inner class name */
        public static class C10621a {

            /* renamed from: a, reason: collision with root package name */
            public InterfaceC36679y f348933a;

            /* renamed from: b, reason: collision with root package name */
            public Looper f348934b;

            @RX0.a
            public C10621a() {
            }

            @N
            @RX0.a
            public final a a() {
                if (this.f348933a == null) {
                    this.f348933a = new C36625b();
                }
                if (this.f348934b == null) {
                    this.f348934b = Looper.getMainLooper();
                }
                return new a(this.f348933a, null, this.f348934b, null);
            }
        }

        public a(InterfaceC36679y interfaceC36679y, Account account, Looper looper, A a12) {
            this.f348931a = interfaceC36679y;
            this.f348932b = looper;
        }
    }

    @RX0.a
    @K
    public h(@N Activity activity, @N C36616a<O> c36616a, @N O o12, @N a aVar) {
        this(activity, activity, c36616a, o12, aVar);
    }

    @N
    @RX0.a
    public final C36703g.a a() {
        GoogleSignInAccount googleSignInAccountD;
        GoogleSignInAccount googleSignInAccountD2;
        C36703g.a aVar = new C36703g.a();
        C36616a.d dVar = this.f348923d;
        boolean z12 = dVar instanceof C36616a.d.b;
        Account accountG = null;
        if (z12 && (googleSignInAccountD2 = ((C36616a.d.b) dVar).d()) != null) {
            String str = googleSignInAccountD2.f348723e;
            if (str != null) {
                accountG = new Account(str, "com.google");
            }
        } else if (dVar instanceof C36616a.d.InterfaceC10619a) {
            accountG = ((C36616a.d.InterfaceC10619a) dVar).g();
        }
        aVar.f349432a = accountG;
        Collection collectionEmptySet = (!z12 || (googleSignInAccountD = ((C36616a.d.b) dVar).d()) == null) ? Collections.emptySet() : googleSignInAccountD.h();
        if (aVar.f349433b == null) {
            aVar.f349433b = new C20203c();
        }
        aVar.f349433b.addAll(collectionEmptySet);
        Context context = this.f348920a;
        aVar.f349435d = context.getClass().getName();
        aVar.f349434c = context.getPackageName();
        return aVar;
    }

    @N
    @RX0.a
    public i asGoogleApiClient() {
        return this.f348927h;
    }

    public final void b(int i12, @N C36634e.a aVar) {
        aVar.zak();
        C36646i c36646i = this.f348929j;
        c36646i.getClass();
        O0 o02 = new O0(new l1(i12, aVar), c36646i.f349129j.get(), this);
        zau zauVar = c36646i.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(4, o02));
    }

    public final Task c(int i12, @N com.google.android.gms.common.api.internal.A a12) {
        C37028k c37028k = new C37028k();
        C36646i c36646i = this.f348929j;
        c36646i.getClass();
        c36646i.g(c37028k, a12.f348951c, this);
        O0 o02 = new O0(new n1(i12, a12, c37028k, this.f348928i), c36646i.f349129j.get(), this);
        zau zauVar = c36646i.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(4, o02));
        return c37028k.f355672a;
    }

    @N
    @RX0.a
    public <A extends C36616a.b, T extends C36634e.a<? extends r, A>> T doBestEffortWrite(@N T t12) {
        b(2, t12);
        return t12;
    }

    @N
    @RX0.a
    public <A extends C36616a.b, T extends C36634e.a<? extends r, A>> T doRead(@N T t12) {
        b(0, t12);
        return t12;
    }

    @ResultIgnorabilityUnspecified
    @N
    @Deprecated
    @RX0.a
    public <A extends C36616a.b, T extends AbstractC36669t<A, ?>, U extends com.google.android.gms.common.api.internal.C<A, ?>> Task<Void> doRegisterEventListener(@N T t12, @N U u12) {
        C36729v.j(t12);
        C36729v.j(u12);
        C36729v.k(t12.f349208a.f349180c, "Listener has already been released.");
        C36729v.k(u12.f348981a, "Listener has already been released.");
        C36729v.a("Listener registration and unregistration methods must be constructed with the same ListenerHolder.", C36727t.a(t12.f349208a.f349180c, u12.f348981a));
        return this.f348929j.i(this, t12, u12, new Runnable() { // from class: com.google.android.gms.common.api.z
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public Task<Boolean> doUnregisterEventListener(@N C36658n.a<?> aVar) {
        return doUnregisterEventListener(aVar, 0);
    }

    @N
    @RX0.a
    public <A extends C36616a.b, T extends C36634e.a<? extends r, A>> T doWrite(@N T t12) {
        b(1, t12);
        return t12;
    }

    @N
    public final C36628c<O> getApiKey() {
        return this.f348924e;
    }

    @N
    @RX0.a
    public O getApiOptions() {
        return (O) this.f348923d;
    }

    @N
    @RX0.a
    public Context getApplicationContext() {
        return this.f348920a;
    }

    @N
    @RX0.a
    public Looper getLooper() {
        return this.f348925f;
    }

    @N
    @RX0.a
    public <L> C36658n<L> registerListener(@N L l12, @N String str) {
        return C36660o.a(this.f348925f, l12, str);
    }

    public final int zaa() {
        return this.f348926g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l0
    public final C36616a.f zab(Looper looper, C36676w0 c36676w0) {
        C36703g.a aVarA = a();
        C36703g c36703g = new C36703g(aVarA.f349432a, aVarA.f349433b, null, aVarA.f349434c, aVarA.f349435d, aVarA.f349436e);
        C36616a.AbstractC10618a abstractC10618a = this.f348922c.f348910a;
        C36729v.j(abstractC10618a);
        C36616a.f fVarBuildClient = abstractC10618a.buildClient(this.f348920a, looper, c36703g, (C36703g) this.f348923d, (i.b) c36676w0, (i.c) c36676w0);
        String str = this.f348921b;
        if (str != null && (fVarBuildClient instanceof AbstractC36699e)) {
            ((AbstractC36699e) fVarBuildClient).setAttributionTag(str);
        }
        if (str != null && (fVarBuildClient instanceof ServiceConnectionC36662p)) {
            ((ServiceConnectionC36662p) fVarBuildClient).getClass();
        }
        return fVarBuildClient;
    }

    public final BinderC36624a1 zac(Context context, Handler handler) {
        C36703g.a aVarA = a();
        return new BinderC36624a1(context, handler, new C36703g(aVarA.f349432a, aVarA.f349433b, null, aVarA.f349434c, aVarA.f349435d, aVarA.f349436e));
    }

    @RX0.a
    @Deprecated
    public h(@N Activity activity, @N C36616a<O> c36616a, @N O o12, @N InterfaceC36679y interfaceC36679y) {
        a.C10621a c10621a = new a.C10621a();
        C36729v.k(interfaceC36679y, "StatusExceptionMapper must not be null.");
        c10621a.f348933a = interfaceC36679y;
        Looper mainLooper = activity.getMainLooper();
        C36729v.k(mainLooper, "Looper must not be null.");
        c10621a.f348934b = mainLooper;
        this(activity, (C36616a) c36616a, (C36616a.d) o12, c10621a.a());
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <TResult, A extends C36616a.b> Task<TResult> doBestEffortWrite(@N com.google.android.gms.common.api.internal.A<A, TResult> a12) {
        return c(2, a12);
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <TResult, A extends C36616a.b> Task<TResult> doRead(@N com.google.android.gms.common.api.internal.A<A, TResult> a12) {
        return c(0, a12);
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public Task<Boolean> doUnregisterEventListener(@N C36658n.a<?> aVar, int i12) {
        C36729v.k(aVar, "Listener key cannot be null.");
        C36646i c36646i = this.f348929j;
        c36646i.getClass();
        C37028k c37028k = new C37028k();
        c36646i.g(c37028k, i12, this);
        O0 o02 = new O0(new o1(aVar, c37028k), c36646i.f349129j.get(), this);
        zau zauVar = c36646i.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(13, o02));
        return c37028k.f355672a;
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <TResult, A extends C36616a.b> Task<TResult> doWrite(@N com.google.android.gms.common.api.internal.A<A, TResult> a12) {
        return c(1, a12);
    }

    public h(@N Context context, @P Activity activity, C36616a c36616a, C36616a.d dVar, a aVar) {
        C36729v.k(context, "Null context is not permitted.");
        C36729v.k(c36616a, "Api must not be null.");
        C36729v.k(aVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        C36729v.k(applicationContext, "The provided context did not have an application context.");
        this.f348920a = applicationContext;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : null;
        this.f348921b = attributionTag;
        this.f348922c = c36616a;
        this.f348923d = dVar;
        this.f348925f = aVar.f348932b;
        C36628c c36628c = new C36628c(c36616a, dVar, attributionTag);
        this.f348924e = c36628c;
        this.f348927h = new B0(this);
        C36646i c36646iH = C36646i.h(applicationContext);
        this.f348929j = c36646iH;
        this.f348926g = c36646iH.f349128i.getAndIncrement();
        this.f348928i = aVar.f348931a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            InterfaceC36656m interfaceC36656mC = LifecycleCallback.c(new C36654l(activity));
            I i12 = (I) interfaceC36656mC.w(I.class, "ConnectionlessLifecycleHelper");
            i12 = i12 == null ? new I(interfaceC36656mC, c36646iH, C36687f.f349287e) : i12;
            i12.f349011g.add(c36628c);
            c36646iH.b(i12);
        }
        zau zauVar = c36646iH.f349134o;
        zauVar.sendMessage(zauVar.obtainMessage(7, this));
    }

    @ResultIgnorabilityUnspecified
    @N
    @RX0.a
    public <A extends C36616a.b> Task<Void> doRegisterEventListener(@N C36671u<A, ?> c36671u) {
        C36729v.j(c36671u);
        C36729v.k(c36671u.f349216a.f349208a.f349180c, "Listener has already been released.");
        C36729v.k(c36671u.f349217b.f348981a, "Listener has already been released.");
        return this.f348929j.i(this, c36671u.f349216a, c36671u.f349217b, c36671u.f349218c);
    }

    @aZ0.l
    @RX0.a
    @Deprecated
    public h(@N Context context, @N C36616a<O> c36616a, @N O o12, @N Looper looper, @N InterfaceC36679y interfaceC36679y) {
        a.C10621a c10621a = new a.C10621a();
        C36729v.k(looper, "Looper must not be null.");
        c10621a.f348934b = looper;
        C36729v.k(interfaceC36679y, "StatusExceptionMapper must not be null.");
        c10621a.f348933a = interfaceC36679y;
        this(context, c36616a, o12, c10621a.a());
    }

    @RX0.a
    public h(@N Context context, @N C36616a<O> c36616a, @N O o12, @N a aVar) {
        this(context, (Activity) null, c36616a, o12, aVar);
    }

    @aZ0.l
    @RX0.a
    @Deprecated
    public h(@N Context context, @N C36616a<O> c36616a, @N O o12, @N InterfaceC36679y interfaceC36679y) {
        a.C10621a c10621a = new a.C10621a();
        C36729v.k(interfaceC36679y, "StatusExceptionMapper must not be null.");
        c10621a.f348933a = interfaceC36679y;
        this(context, c36616a, o12, c10621a.a());
    }
}
