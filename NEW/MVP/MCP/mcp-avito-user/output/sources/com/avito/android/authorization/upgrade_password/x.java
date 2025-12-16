package com.avito.android.authorization.upgrade_password;

import Sm0.InterfaceC15202a;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.lib.design.input.Input;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.remote.model.password.PasswordChangeResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import hD.C40806a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.io.Serializable;
import java.util.Arrays;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import zz.InterfaceC50647a;

/* compiled from: UpgradePasswordPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/upgrade_password/x;", "Lcom/avito/android/authorization/upgrade_password/h;", "Lcom/avito/android/keyboard_visibility/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class x extends com.avito.android.keyboard_visibility.a implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28695e f94833b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.s f94834c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f94835d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94836e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f94837f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f94838g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94839h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C40806a f94840i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f94841j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f94842k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f94843l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f94844m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public E f94845n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public UpgradePasswordFragment f94846o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.y f94847p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94848q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public String f94849r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f94850s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94851t;

    /* compiled from: UpgradePasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            x xVar = x.this;
            xVar.f94851t = true;
            E e12 = xVar.f94845n;
            if (e12 != null) {
                e12.b();
            }
            xVar.f94850s = null;
            E e13 = xVar.f94845n;
            if (e13 != null) {
                PasswordTipInput passwordTipInput = e13.f94753e;
                Input input = passwordTipInput.f213951b;
                int[] f179312e = input.getF179312E();
                Input.f179303W.getClass();
                int[] iArr = Input.f179304a0;
                if (!Arrays.equals(f179312e, iArr)) {
                    input.setState(iArr);
                }
                passwordTipInput.c(passwordTipInput.getText(), true);
            }
        }
    }

    /* compiled from: UpgradePasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lcom/avito/android/remote/model/password/PasswordChangeResult;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<P2<? super PasswordChangeResult>, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f94854m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(1);
            this.f94854m = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke(com.avito.android.util.P2<? super com.avito.android.remote.model.password.PasswordChangeResult> r6) {
            /*
                r5 = this;
                com.avito.android.util.P2 r6 = (com.avito.android.util.P2) r6
                com.avito.android.authorization.upgrade_password.x r0 = com.avito.android.authorization.upgrade_password.x.this
                r0.getClass()
                boolean r1 = r6 instanceof com.avito.android.util.P2.c
                if (r1 == 0) goto L14
                com.avito.android.authorization.upgrade_password.E r6 = r0.f94845n
                if (r6 == 0) goto Le8
                r6.f()
                goto Le8
            L14:
                boolean r1 = r6 instanceof com.avito.android.util.P2.b
                io.reactivex.rxjava3.disposables.c r2 = r0.f94848q
                if (r1 == 0) goto L75
                java.lang.String r6 = r0.f94843l
                if (r6 == 0) goto L70
                int r1 = r6.length()
                if (r1 != 0) goto L25
                goto L70
            L25:
                hD.a r1 = r0.f94840i
                r1.getClass()
                kotlin.reflect.n<java.lang.Object>[] r3 = hD.C40806a.f397105l
                r4 = 0
                r3 = r3[r4]
                com.avito.android.A0$a r1 = r1.f397106b
                DE0.a r1 = r1.a()
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L70
                com.avito.android.credman.s r1 = r0.f94834c
                java.lang.String r3 = r5.f94854m
                io.reactivex.rxjava3.internal.operators.single.S r6 = r1.a(r6, r3)
                com.avito.android.authorization.upgrade_password.s r1 = new com.avito.android.authorization.upgrade_password.s
                r1.<init>(r0)
                io.reactivex.rxjava3.internal.operators.single.t r6 = r6.j(r1)
                com.avito.android.authorization.upgrade_password.i r1 = new com.avito.android.authorization.upgrade_password.i
                r3 = 1
                r1.<init>(r0, r3)
                io.reactivex.rxjava3.internal.operators.single.p r3 = new io.reactivex.rxjava3.internal.operators.single.p
                r3.<init>(r6, r1)
                com.avito.android.authorization.upgrade_password.t r6 = new com.avito.android.authorization.upgrade_password.t
                r6.<init>(r0)
                com.avito.android.authorization.upgrade_password.u r1 = new com.avito.android.authorization.upgrade_password.u
                r1.<init>(r0)
                io.reactivex.rxjava3.disposables.d r6 = r3.x(r6, r1)
                r2.b(r6)
                goto Le8
            L70:
                r0.h()
                goto Le8
            L75:
                boolean r1 = r6 instanceof com.avito.android.util.P2.a
                if (r1 == 0) goto Le8
                com.avito.android.util.P2$a r6 = (com.avito.android.util.P2.a) r6
                com.avito.android.remote.error.ApiError r6 = r6.f318719a
                boolean r1 = r6 instanceof com.avito.android.remote.error.ApiError.IncorrectData
                if (r1 == 0) goto La1
                com.avito.android.remote.error.ApiError$IncorrectData r6 = (com.avito.android.remote.error.ApiError.IncorrectData) r6
                java.util.Map r6 = r6.c()
                java.util.Collection r6 = r6.values()
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.lang.Object r6 = kotlin.collections.C42745f0.F(r6)
                java.lang.String r6 = (java.lang.String) r6
                if (r6 != 0) goto L97
                java.lang.String r6 = ""
            L97:
                r0.f94850s = r6
                com.avito.android.authorization.upgrade_password.E r0 = r0.f94845n
                if (r0 == 0) goto Le8
                r0.e(r6)
                goto Le8
            La1:
                boolean r1 = r6 instanceof com.avito.android.remote.error.ApiError.ErrorDialog
                if (r1 == 0) goto Lc2
                com.avito.android.remote.error.ApiError$ErrorDialog r6 = (com.avito.android.remote.error.ApiError.ErrorDialog) r6
                com.avito.android.remote.model.UserDialog r6 = r6.getUserDialog()
                com.avito.android.dialog.a r1 = r0.f94835d
                io.reactivex.rxjava3.internal.operators.maybe.Y r6 = r1.g(r6)
                com.avito.android.authorization.upgrade_password.v r1 = new com.avito.android.authorization.upgrade_password.v
                r1.<init>(r0)
                com.avito.android.authorization.upgrade_password.w<T> r0 = com.avito.android.authorization.upgrade_password.w.f94832b
                l41.a r3 = io.reactivex.rxjava3.internal.functions.a.f401993c
                io.reactivex.rxjava3.disposables.d r6 = r6.n(r1, r0, r3)
                r2.b(r6)
                goto Le8
            Lc2:
                boolean r1 = r6 instanceof com.avito.android.remote.error.ApiError.NetworkIOError
                if (r1 == 0) goto Ld4
                com.avito.android.authorization.upgrade_password.E r1 = r0.f94845n
                if (r1 == 0) goto Le8
                zz.a r0 = r0.f94837f
                java.lang.String r0 = r0.b(r6)
                r1.d(r6, r0)
                goto Le8
            Ld4:
                com.avito.android.authorization.upgrade_password.E r1 = r0.f94845n
                if (r1 == 0) goto Le8
                Sm0.a r0 = r0.f94836e
                android.content.res.Resources r0 = r0.getF15141a()
                r2 = 2131957826(0x7f131842, float:1.9552247E38)
                java.lang.String r0 = r0.getString(r2)
                r1.d(r6, r0)
            Le8:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.upgrade_password.x.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: UpgradePasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            x xVar = x.this;
            E e12 = xVar.f94845n;
            if (e12 != null) {
                String strC = xVar.f94837f.c(th3);
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, e12.f94749a, com.avito.android.printable_text.b.f(strC), null, null, null, new f.c(th3), 0, null, null, false, false, null, null, 4078);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public x(@Y61.k InterfaceC28695e interfaceC28695e, @Y61.k com.avito.android.credman.s sVar, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k C40806a c40806a, @Y61.l @com.avito.android.authorization.upgrade_password.di.c String str, @com.avito.android.authorization.upgrade_password.di.a @Y61.l String str2, @Y61.l @com.avito.android.authorization.upgrade_password.di.d String str3, @Y61.l Kundle kundle, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        Boolean boolA;
        String strG;
        this.f94833b = interfaceC28695e;
        this.f94834c = sVar;
        this.f94835d = interfaceC30274a;
        this.f94836e = interfaceC15202a;
        this.f94837f = interfaceC50647a;
        this.f94838g = screenPerformanceTracker;
        this.f94839h = interfaceC35745a5;
        this.f94840i = c40806a;
        this.f94841j = str;
        this.f94842k = str2;
        this.f94843l = str3;
        this.f94844m = aVar;
        this.f94849r = (kundle == null || (strG = kundle.g("password")) == null) ? "" : strG;
        this.f94850s = kundle != null ? kundle.g("password_error_message") : null;
        this.f94851t = (kundle == null || (boolA = kundle.a("password_saving")) == null) ? false : boolA.booleanValue();
    }

    @Override // com.avito.android.authorization.upgrade_password.h
    public final void a(@Y61.k E e12) {
        this.f94845n = e12;
        j jVar = new j(this);
        l41.g<? super Throwable> gVar = k.f94820b;
        W w12 = e12.f94756h;
        w12.getClass();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.disposables.d dVarV0 = w12.v0(jVar, gVar, interfaceC43543a);
        io.reactivex.rxjava3.disposables.c cVar = this.f94848q;
        cVar.b(dVarV0);
        l lVar = new l(this);
        l41.g<? super Throwable> gVar2 = m.f94822b;
        C41981q0 c41981q0 = e12.f94757i;
        c41981q0.getClass();
        cVar.b(c41981q0.v0(lVar, gVar2, interfaceC43543a));
        n nVar = new n(this);
        l41.g<? super Throwable> gVar3 = o.f94824b;
        C41981q0 c41981q02 = e12.f94758j;
        c41981q02.getClass();
        cVar.b(c41981q02.v0(nVar, gVar3, interfaceC43543a));
        p pVar = new p(this);
        l41.g<? super Throwable> gVar4 = q.f94826b;
        com.jakewharton.rxbinding4.a aVar = e12.f94759k;
        aVar.getClass();
        cVar.b(aVar.v0(pVar, gVar4, interfaceC43543a));
        cVar.b(e12.f94760l.t0(new r(e12)));
        E e13 = this.f94845n;
        if (e13 != null) {
            e13.f94753e.setPassword(this.f94849r);
            e13.f94755g.setText(this.f94841j);
            String str = this.f94850s;
            if (str != null) {
                e13.e(str);
            }
        }
    }

    @Override // com.avito.android.authorization.upgrade_password.h
    public final void b(@Y61.k UpgradePasswordFragment upgradePasswordFragment) {
        this.f94846o = upgradePasswordFragment;
        if (this.f94851t) {
            i(this.f94849r);
        }
    }

    @Override // com.avito.android.authorization.upgrade_password.h
    public final void c0() {
        this.f94846o = null;
    }

    @Override // com.avito.android.authorization.upgrade_password.h
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("password", this.f94849r);
        kundle.m("password_error_message", this.f94850s);
        kundle.h(Boolean.valueOf(this.f94851t), "password_saving");
        return kundle;
    }

    @Override // com.avito.android.authorization.upgrade_password.h
    public final void e0() {
        E e12 = this.f94845n;
        if (e12 != null) {
            e12.b();
        }
        this.f94845n = null;
        io.reactivex.rxjava3.internal.observers.y yVar = this.f94847p;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f94847p = null;
        this.f94848q.e();
    }

    @Override // com.avito.android.keyboard_visibility.a
    @Y61.l
    public final com.avito.android.keyboard_visibility.b f() {
        return this.f94845n;
    }

    @Override // com.avito.android.keyboard_visibility.a
    public final void g() {
        E e12 = this.f94845n;
        if (e12 != null) {
            e12.c();
        }
    }

    public final void h() {
        E e12 = this.f94845n;
        if (e12 != null) {
            com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, e12.f94749a, com.avito.android.printable_text.b.c(R.string.upgrade_password_success_message, new Serializable[0]), null, null, null, null, 0, null, null, false, false, null, null, 4094);
        }
        UpgradePasswordFragment upgradePasswordFragment = this.f94846o;
        if (upgradePasswordFragment != null) {
            upgradePasswordFragment.q5(true);
        }
    }

    public final void i(String str) {
        io.reactivex.rxjava3.internal.observers.y yVar = this.f94847p;
        if (yVar != null) {
            DisposableHelper.a(yVar);
        }
        this.f94847p = com.avito.android.analytics.screens.utils.D.b(this.f94833b.a(str, this.f94842k).j0(this.f94839h.e()).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new a()).L(new i(this, 0)), this.f94838g, null, new b(str), new c(), 6);
    }
}
