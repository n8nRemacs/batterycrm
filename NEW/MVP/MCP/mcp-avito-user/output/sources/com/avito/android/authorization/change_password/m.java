package com.avito.android.authorization.change_password;

import Fc1.E0;
import android.content.Intent;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.utils.D;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.password_tip.PasswordTipInput;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import java.util.Map;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ChangeResettedPasswordPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/authorization/change_password/m;", "Lcom/avito/android/authorization/change_password/f;", "Lcom/avito/android/keyboard_visibility/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class m extends com.avito.android.keyboard_visibility.a implements f {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.authorization.change_password.c f93357b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f93358c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f93359d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public s f93360e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public ChangeResettedPasswordActivity f93361f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93362g = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f93363h = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: i, reason: collision with root package name */
    public boolean f93364i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public String f93365j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public Map<String, String> f93366k;

    /* compiled from: ChangeResettedPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            m mVar = m.this;
            s sVar = mVar.f93360e;
            if (sVar != null) {
                PasswordTipInput passwordTipInput = sVar.f93379d;
                D6.h(passwordTipInput);
                passwordTipInput.setClickable(false);
                Button button = sVar.f93378c;
                button.setClickable(false);
                button.setLoading(true);
            }
            s sVar2 = mVar.f93360e;
            if (sVar2 != null) {
                K2.d(sVar2.f93376a, true);
            }
            mVar.f93364i = true;
        }
    }

    /* compiled from: ChangeResettedPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "invoke", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<G0, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(G0 g02) {
            m mVar = m.this;
            ChangeResettedPasswordActivity changeResettedPasswordActivity = mVar.f93361f;
            if (changeResettedPasswordActivity != null) {
                String str = mVar.f93365j;
                changeResettedPasswordActivity.finish();
                Zd.i iVar = changeResettedPasswordActivity.f93323o;
                if (iVar == null) {
                    iVar = null;
                }
                l90.o oVar = changeResettedPasswordActivity.f93322n;
                Intent intentJ = iVar.j((oVar != null ? oVar : null).b(), (248 & 2) != 0 ? null : Zd.f.b(changeResettedPasswordActivity), (248 & 4) != 0 ? null : str, (248 & 8) == 0, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? false : false, (248 & 64) != 0 ? null : changeResettedPasswordActivity.f93326r, (248 & 128) != 0 ? null : null);
                intentJ.setFlags(603979776);
                changeResettedPasswordActivity.startActivity(intentJ);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: ChangeResettedPasswordPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            m mVar = m.this;
            mVar.getClass();
            if (!(th3 instanceof com.avito.android.remote.error.s)) {
                mVar.f93366k = P0.c();
                z.h(th3, new k(mVar, th3), new l(mVar), null, 60);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public m(@Y61.k com.avito.android.authorization.change_password.c cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Kundle kundle) {
        Map<String, String> mapC;
        String strG;
        Boolean boolA;
        this.f93357b = cVar;
        this.f93358c = interfaceC35745a5;
        this.f93359d = screenPerformanceTracker;
        this.f93364i = (kundle == null || (boolA = kundle.a("password_changing")) == null) ? false : boolA.booleanValue();
        this.f93365j = (kundle == null || (strG = kundle.g("password")) == null) ? "" : strG;
        this.f93366k = (kundle == null || (mapC = kundle.c("messages")) == null) ? P0.c() : mapC;
    }

    @Override // com.avito.android.authorization.change_password.f
    public final void c(@Y61.k s sVar) {
        s sVar2;
        this.f93360e = sVar;
        com.jakewharton.rxrelay3.c<G0> cVar = sVar.f93377b;
        io.reactivex.rxjava3.disposables.d dVarT0 = com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new g(this));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f93363h;
        cVar2.b(dVarT0);
        io.reactivex.rxjava3.core.z<G0> zVarA = C37722i.a(sVar.f93378c);
        PasswordTipInput passwordTipInput = sVar.f93379d;
        cVar2.b(zVarA.i0(passwordTipInput.getDoneCallbacks()).N(new r(sVar)).t0(new h(this)));
        cVar2.b(passwordTipInput.getTextChanges().t0(new i(this)));
        cVar2.b(passwordTipInput.getOnFocused().t0(new j(sVar)));
        passwordTipInput.setPassword(this.f93365j);
        Map<String, String> map = this.f93366k;
        this.f93366k = map;
        String str = (String) C42745f0.F(map.values());
        if (str != null && (sVar2 = this.f93360e) != null) {
            PasswordTipInput passwordTipInput2 = sVar2.f93379d;
            passwordTipInput2.d(str);
            passwordTipInput2.e();
        }
        passwordTipInput.e();
    }

    @Override // com.avito.android.authorization.change_password.f
    public final void c0() {
        this.f93362g.e();
        this.f93361f = null;
    }

    @Override // com.avito.android.authorization.change_password.f
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.h(Boolean.valueOf(this.f93364i), "password_changing");
        kundle.m("password", this.f93365j);
        kundle.n("messages", this.f93366k);
        return kundle;
    }

    @Override // com.avito.android.authorization.change_password.f
    public final void e(@Y61.k ChangeResettedPasswordActivity changeResettedPasswordActivity) {
        this.f93361f = changeResettedPasswordActivity;
        if (this.f93364i) {
            h();
        }
    }

    @Override // com.avito.android.authorization.change_password.f
    public final void e0() {
        this.f93363h.e();
        this.f93360e = null;
    }

    @Override // com.avito.android.keyboard_visibility.a
    @Y61.l
    public final com.avito.android.keyboard_visibility.b f() {
        return this.f93360e;
    }

    @Override // com.avito.android.keyboard_visibility.a
    public final void g() {
        s sVar = this.f93360e;
        if (sVar != null) {
            sVar.b();
        }
    }

    public final void h() {
        this.f93362g.b(D.b(this.f93357b.a(this.f93365j).j0(this.f93358c.e()).J(io.reactivex.rxjava3.internal.functions.a.f401993c, new a()).L(new E0(this, 11)), this.f93359d, null, new b(), new c(), 6));
    }
}
