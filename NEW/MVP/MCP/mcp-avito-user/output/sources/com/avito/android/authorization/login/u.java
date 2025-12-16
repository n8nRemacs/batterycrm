package com.avito.android.authorization.login;

import Rh.C15041a;
import Sm0.InterfaceC15202a;
import Tv0.InterfaceC15415a;
import android.content.res.Resources;
import android.os.Parcelable;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.PasswordUpgradeLink;
import com.avito.android.deep_linking.links.auth.ResetPasswordLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.external_apps.deep_linking.SendEmailLink;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.password_tip.NonLoggableString;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.LoginResult;
import com.avito.android.remote.model.TfaFlow;
import com.avito.android.remote.model.TfaSource;
import com.avito.android.remote.model.UserDialog;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.AttributedTextCreator;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.O2;
import com.jakewharton.rxbinding4.view.C37722i;
import hD.C40806a;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: LoginPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/login/u;", "Lcom/avito/android/authorization/login/f;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class u implements InterfaceC28677f {

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public LoginActivity f94061A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public DeepLink f94062B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public String f94063C;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28674c f94064a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94065b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final B3.a f94066c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final C40806a f94067d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final h31.e<K> f94068e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94069f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f94070g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final AttributedTextCreator f94071h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f94072i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f94073j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15415a f94074k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f94075l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.s f94076m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f94077n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94078o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94079p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public io.reactivex.rxjava3.internal.observers.m f94080q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public String f94081r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public String f94082s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f94083t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f94084u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public String f94085v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public Map<String, String> f94086w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public String f94087x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94088y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public Q f94089z;

    /* compiled from: LoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            u uVar = u.this;
            ScreenPerformanceTracker.a.b(uVar.f94075l, null, 3);
            Q q12 = uVar.f94089z;
            if (q12 != null) {
                q12.a();
                q12.h();
                q12.b();
                q12.c();
            }
        }
    }

    /* compiled from: LoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/LoginResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/LoginResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            LoginResult loginResult = (LoginResult) obj;
            u uVar = u.this;
            ScreenPerformanceTracker.a.d(uVar.f94075l, null, null, null, null, 15);
            ScreenPerformanceTracker screenPerformanceTracker = uVar.f94075l;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            if (loginResult instanceof LoginResult.Ok) {
                LoginResult.Ok ok2 = (LoginResult.Ok) loginResult;
                uVar.f(ok2.getAuthResult().getMessage(), ok2.getAuthResult().getPostAuthAction(), !uVar.f94084u);
            } else {
                boolean z12 = loginResult instanceof LoginResult.TfaCheckWithPush;
                com.avito.android.deeplink_handler.handler.composite.a aVar = uVar.f94070g;
                if (z12) {
                    LoginResult.TfaCheckWithPush tfaCheckWithPush = (LoginResult.TfaCheckWithPush) loginResult;
                    TfaFlow flow = tfaCheckWithPush.getFlow();
                    TfaSource src = tfaCheckWithPush.getSrc();
                    String str = uVar.f94081r;
                    String str2 = uVar.f94082s;
                    Parcelable.Creator<NonLoggableString> creator = NonLoggableString.CREATOR;
                    b.a.a(aVar, new CodeCheckLink(new CodeCheckLink.Flow.TfaCheck(flow, src, new CodeCheckLink.Flow.TfaCheck.LoginInfo.ByLogin(str, str2, null)), new CodeCheckLink.Arguments(tfaCheckWithPush.getPhone(), null, 5, tfaCheckWithPush.getPhoneList(), 2, null)), "tfa.code_check", null, 4);
                } else if (loginResult instanceof LoginResult.FollowDeeplink) {
                    uVar.g();
                    b.a.a(aVar, ((LoginResult.FollowDeeplink) loginResult).getDeeplink(), null, null, 6);
                } else if (loginResult instanceof LoginResult.PassportBlocked) {
                    uVar.g();
                    b.a.a(aVar, ((LoginResult.PassportBlocked) loginResult).getDeeplink(), null, null, 6);
                } else if (!(loginResult instanceof LoginResult.ParsingPermission)) {
                    if (!(loginResult instanceof LoginResult.FailedWithDialog ? true : loginResult instanceof LoginResult.FailedWithMessage)) {
                        boolean z13 = loginResult instanceof LoginResult.FailedWithMessages;
                    }
                }
            }
            uVar.f94084u = false;
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, null, null, 7);
        }
    }

    /* compiled from: LoginPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            List<Action> actions;
            CharSequence charSequenceB;
            Action action;
            Throwable th2 = (Throwable) obj;
            J.a aVar = new J.a(th2);
            u uVar = u.this;
            ScreenPerformanceTracker.a.d(uVar.f94075l, null, null, aVar, null, 11);
            ScreenPerformanceTracker screenPerformanceTracker = uVar.f94075l;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            Q q12 = uVar.f94089z;
            if (q12 != null) {
                q12.d();
            }
            uVar.f94086w = P0.c();
            if (th2 instanceof ApiException) {
                ApiError apiError = ((ApiException) th2).f318522b;
                if (apiError instanceof com.avito.android.remote.error.s) {
                    UserDialog userDialog = ((com.avito.android.remote.error.s) apiError).getUserDialog();
                    List<Action> actions2 = userDialog.getActions();
                    boolean z12 = ((actions2 == null || (action = (Action) C42745f0.G(actions2)) == null) ? null : action.getDeepLink()) instanceof SendEmailLink;
                    io.reactivex.rxjava3.disposables.c cVar = uVar.f94079p;
                    InterfaceC30274a interfaceC30274a = uVar.f94072i;
                    if (z12) {
                        List<Action> actions3 = userDialog.getActions();
                        if (actions3 != null) {
                            Action action2 = (Action) C42745f0.E(actions3);
                            AttributedText attributedTextFrom = uVar.f94071h.from(action2.getDeepLink(), action2.getTitle());
                            attributedTextFrom.setOnDeepLinkClickListener(new C15041a(uVar, 13));
                            charSequenceB = uVar.f94073j.b(attributedTextFrom);
                        } else {
                            charSequenceB = null;
                        }
                        if (charSequenceB != null) {
                            interfaceC30274a.a(userDialog.getTitle(), userDialog.getMessage(), charSequenceB);
                        } else {
                            cVar.b(interfaceC30274a.g(userDialog).n(io.reactivex.rxjava3.internal.functions.a.f401994d, io.reactivex.rxjava3.internal.functions.a.f401996f, io.reactivex.rxjava3.internal.functions.a.f401993c));
                        }
                    } else if (!O2.a(userDialog.getActions())) {
                        cVar.b(interfaceC30274a.g(userDialog).n(new C28683l(uVar), C28684m.f94053b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else if (userDialog.getActions().size() == 2) {
                        List<Action> actions4 = userDialog.getActions();
                        if (!(actions4 instanceof Collection) || !actions4.isEmpty()) {
                            Iterator<T> it = actions4.iterator();
                            while (it.hasNext()) {
                                if (!(((Action) it.next()).getDeepLink() instanceof ResetPasswordLink)) {
                                    actions = userDialog.getActions();
                                    if (actions != null && ((Action) C42745f0.E(actions)) != null) {
                                        cVar.b(interfaceC30274a.f(userDialog).n(new s(uVar), t.f94060b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                                    }
                                }
                            }
                        }
                        cVar.b(interfaceC30274a.f(userDialog).n(new C28688q(uVar), r.f94058b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                    } else {
                        actions = userDialog.getActions();
                        if (actions != null) {
                            cVar.b(interfaceC30274a.f(userDialog).n(new s(uVar), t.f94060b, io.reactivex.rxjava3.internal.functions.a.f401993c));
                        }
                    }
                } else {
                    com.avito.android.error.z.g(apiError, new C28685n(uVar), new C28686o(uVar), new C28687p(uVar), null, null, 24);
                }
            } else {
                Q q13 = uVar.f94089z;
                if (q13 != null) {
                    q13.j();
                }
            }
            uVar.f94084u = false;
            ScreenPerformanceTracker.a.c(screenPerformanceTracker, null, aVar, null, 5);
        }
    }

    @Inject
    public u(@Y61.k InterfaceC28674c interfaceC28674c, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k B3.a aVar, @Y61.k C40806a c40806a, @Y61.k h31.e<K> eVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k AttributedTextCreator attributedTextCreator, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k com.avito.android.util.text.a aVar3, @Y61.k InterfaceC15415a interfaceC15415a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k com.avito.android.credman.s sVar, @Y61.l @com.avito.android.authorization.login.di.k Kundle kundle, @Y61.l @Named("suggest_key") String str) {
        Map<String, String> mapC;
        Boolean boolA;
        Boolean boolA2;
        this.f94064a = interfaceC28674c;
        this.f94065b = interfaceC15202a;
        this.f94066c = aVar;
        this.f94067d = c40806a;
        this.f94068e = eVar;
        this.f94069f = interfaceC35745a5;
        this.f94070g = aVar2;
        this.f94071h = attributedTextCreator;
        this.f94072i = interfaceC30274a;
        this.f94073j = aVar3;
        this.f94074k = interfaceC15415a;
        this.f94075l = screenPerformanceTracker;
        this.f94076m = sVar;
        this.f94077n = str;
        this.f94078o = new io.reactivex.rxjava3.disposables.c();
        this.f94079p = new io.reactivex.rxjava3.disposables.c();
        String strG = kundle != null ? kundle.g("login") : null;
        this.f94081r = strG == null ? "" : strG;
        String strG2 = kundle != null ? kundle.g("password") : null;
        this.f94082s = strG2 == null ? "" : strG2;
        boolean zBooleanValue = false;
        this.f94083t = (kundle == null || (boolA2 = kundle.a("is_hidden_login")) == null) ? false : boolA2.booleanValue();
        if (kundle != null && (boolA = kundle.a("auto_login")) != null) {
            zBooleanValue = boolA.booleanValue();
        }
        this.f94084u = zBooleanValue;
        String strG3 = kundle != null ? kundle.g("post_auth_message") : null;
        this.f94085v = strG3 == null ? "" : strG3;
        this.f94086w = (kundle == null || (mapC = kundle.c("messages")) == null) ? P0.c() : mapC;
        String strG4 = kundle != null ? kundle.g("phone_hint") : null;
        this.f94087x = strG4 != null ? strG4 : "";
        this.f94088y = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void a(@Y61.l String str) {
        this.f94063C = str;
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void b(@Y61.k LoginActivity loginActivity) {
        if (this.f94061A == null) {
            this.f94061A = loginActivity;
            DeepLink deepLink = this.f94062B;
            if (deepLink != null) {
                j(deepLink);
                if (G0.f406611a == null) {
                    this.f94062B = deepLink;
                }
            }
        }
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void c(@Y61.k Q q12) throws Resources.NotFoundException {
        this.f94089z = q12;
        e();
        com.jakewharton.rxrelay3.c<G0> cVar = q12.f93992b;
        io.reactivex.rxjava3.disposables.d dVarT0 = com.avito.android.advert.item.delivery_suggests.l.l(cVar, cVar).t0(new C28678g(this));
        io.reactivex.rxjava3.disposables.c cVar2 = this.f94079p;
        cVar2.b(dVarT0);
        io.reactivex.rxjava3.core.z<G0> zVarA = C37722i.a(q12.f94000j);
        Input input = q12.f93999i;
        cVar2.b(io.reactivex.rxjava3.core.z.g0(zVarA, com.avito.android.lib.design.input.n.d(input)).t0(new C28679h(this)));
        com.jakewharton.rxrelay3.c<G0> cVar3 = q12.f93993c;
        cVar2.b(com.avito.android.advert.item.delivery_suggests.l.l(cVar3, cVar3).t0(new C28680i(this)));
        cVar2.b(com.avito.android.lib.design.input.n.e(q12.f93997g).t0(new C28681j(this)));
        cVar2.b(com.avito.android.lib.design.input.n.e(input).t0(new C28682k(this)));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f94070g;
        io.reactivex.rxjava3.disposables.d dVarT02 = aVar.d9().N(z.f94097b).t0(new A(this));
        io.reactivex.rxjava3.disposables.c cVar4 = this.f94088y;
        cVar4.b(dVarT02);
        cVar4.b(aVar.d9().N(B.f93956b).t0(new C(this)));
        cVar4.b(aVar.d9().N(D.f93958b).t0(new E(this)));
        cVar4.b(aVar.d9().N(F.f93960b).t0(new G(this)));
        cVar4.b(aVar.d9().N(H.f93962b).t0(new y(this)));
        if (!this.f94084u || this.f94089z == null) {
            return;
        }
        i();
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void c0() {
        this.f94078o.e();
        io.reactivex.rxjava3.internal.observers.m mVar = this.f94080q;
        if (mVar != null) {
            DisposableHelper.a(mVar);
        }
        this.f94080q = null;
        this.f94061A = null;
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void d(@Y61.l String str, @Y61.l String str2, boolean z12, @Y61.l String str3, boolean z13) throws Resources.NotFoundException {
        String strD;
        if (str == null) {
            strD = this.f94066c.d();
            if (z13) {
                strD = null;
            }
            if (strD == null) {
                strD = "";
            }
        } else {
            strD = str;
        }
        this.f94081r = strD;
        this.f94082s = str2 == null ? "" : str2;
        this.f94083t = z12;
        if (str3 == null) {
            str3 = "";
        }
        this.f94087x = str3;
        this.f94084u = (str == null || str.length() == 0 || str2 == null || str2.length() == 0) ? false : true;
        e();
        if (!this.f94084u || this.f94089z == null) {
            return;
        }
        i();
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.m("login", this.f94081r);
        kundle.m("password", this.f94082s);
        kundle.h(Boolean.valueOf(this.f94083t), "is_hidden_login");
        kundle.h(Boolean.valueOf(this.f94084u), "auto_login");
        kundle.m("post_auth_message", this.f94085v);
        kundle.n("messages", this.f94086w);
        kundle.m("phone_hint", this.f94087x);
        return kundle;
    }

    public final void e() {
        Q q12 = this.f94089z;
        if (q12 != null) {
            Input.t(q12.f93997g, this.f94081r, false, 6);
            Input.t(q12.f93999i, this.f94082s, false, 6);
            q12.e(null);
            boolean z12 = this.f94083t;
            ComponentContainer componentContainer = q12.f93996f;
            TextView textView = q12.f93995e;
            InterfaceC15202a interfaceC15202a = this.f94065b;
            h31.e<K> eVar = this.f94068e;
            if (z12) {
                AttributedText attributedTextA = eVar.get().a(interfaceC15202a.getF15141a(), this.f94081r);
                D6.w(componentContainer);
                com.avito.android.util.text.j.c(textView, attributedTextA, null);
                D6.H(textView);
            } else if (this.f94087x.length() > 0) {
                com.avito.android.util.text.j.c(textView, eVar.get().b(interfaceC15202a.getF15141a(), this.f94087x), null);
                D6.H(textView);
            } else {
                D6.H(componentContainer);
                textView.setText("");
                D6.w(textView);
            }
        }
        h(this.f94086w);
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void e0() {
        this.f94079p.e();
        this.f94088y.e();
        Q q12 = this.f94089z;
        if (q12 != null) {
            q12.f93991a.e();
        }
        this.f94089z = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(java.lang.String r2, com.avito.android.deep_linking.links.DeepLink r3, boolean r4) {
        /*
            r1 = this;
            if (r3 == 0) goto L8
            r1.f94085v = r2
            r1.j(r3)
            goto L73
        L8:
            if (r4 == 0) goto L62
            hD.a r3 = r1.f94067d
            r3.getClass()
            kotlin.reflect.n<java.lang.Object>[] r4 = hD.C40806a.f397105l
            r0 = 0
            r4 = r4[r0]
            com.avito.android.A0$a r3 = r3.f397106b
            DE0.a r3 = r3.a()
            java.lang.Object r3 = r3.invoke()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L62
            java.lang.String r3 = r1.f94081r
            java.lang.String r4 = r1.f94082s
            com.avito.android.credman.s r0 = r1.f94076m
            io.reactivex.rxjava3.internal.operators.single.S r3 = r0.a(r3, r4)
            com.avito.android.authorization.login.v r4 = new com.avito.android.authorization.login.v
            r4.<init>(r1)
            io.reactivex.rxjava3.internal.operators.single.t r3 = r3.j(r4)
            Fc1.E0 r4 = new Fc1.E0
            r0 = 16
            r4.<init>(r1, r0)
            io.reactivex.rxjava3.internal.operators.single.p r0 = new io.reactivex.rxjava3.internal.operators.single.p
            r0.<init>(r3, r4)
            com.avito.android.authorization.login.w r3 = new com.avito.android.authorization.login.w
            r3.<init>(r1)
            com.avito.android.authorization.login.x r4 = new com.avito.android.authorization.login.x
            r4.<init>(r1)
            io.reactivex.rxjava3.disposables.d r3 = r0.x(r3, r4)
            io.reactivex.rxjava3.disposables.c r4 = r1.f94078o
            r4.b(r3)
            if (r2 == 0) goto L73
            com.avito.android.authorization.login.Q r3 = r1.f94089z
            if (r3 == 0) goto L73
            r3.i(r2)
            goto L73
        L62:
            com.avito.android.authorization.login.LoginActivity r3 = r1.f94061A
            if (r3 == 0) goto L6a
            r4 = -1
            r3.a2(r4)
        L6a:
            if (r2 == 0) goto L73
            com.avito.android.authorization.login.Q r3 = r1.f94089z
            if (r3 == 0) goto L73
            r3.i(r2)
        L73:
            com.avito.android.authorization.login.Q r2 = r1.f94089z
            if (r2 == 0) goto L7a
            r2.a()
        L7a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.authorization.login.u.f(java.lang.String, com.avito.android.deep_linking.links.DeepLink, boolean):void");
    }

    public final void g() {
        Q q12 = this.f94089z;
        if (q12 != null) {
            q12.d();
        }
        Q q13 = this.f94089z;
        if (q13 != null) {
            q13.a();
        }
    }

    public final void h(Map<String, String> map) {
        this.f94086w = map;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (kotlin.jvm.internal.L.f(key, "login")) {
                Q q12 = this.f94089z;
                if (q12 != null) {
                    q12.f(value);
                }
                Q q13 = this.f94089z;
                if (q13 != null) {
                    q13.e(Boolean.FALSE);
                }
            } else if (kotlin.jvm.internal.L.f(key, "password")) {
                Q q14 = this.f94089z;
                if (q14 != null) {
                    q14.g(value);
                }
                Q q15 = this.f94089z;
                if (q15 != null) {
                    q15.e(Boolean.TRUE);
                }
            }
        }
    }

    public final void i() throws Resources.NotFoundException {
        Q q12;
        Q q13;
        io.reactivex.rxjava3.internal.observers.m mVar = this.f94080q;
        if (mVar == null || mVar.getF318621e()) {
            if (!C43066x.K(this.f94081r) && !C43066x.K(this.f94082s)) {
                this.f94080q = (io.reactivex.rxjava3.internal.observers.m) this.f94064a.b(this.f94081r, this.f94082s, this.f94077n, this.f94063C).S().s(this.f94069f.e()).j(new a()).x(new b(), new c());
                return;
            }
            String string = this.f94065b.getF15141a().getString(R.string.empty_input_error);
            if (C43066x.K(this.f94081r) && (q13 = this.f94089z) != null) {
                q13.f(string);
            }
            if (C43066x.K(this.f94082s) && (q12 = this.f94089z) != null) {
                q12.g(string);
            }
            Q q14 = this.f94089z;
            if (q14 != null) {
                q14.e(null);
            }
        }
    }

    public final void j(DeepLink deepLink) {
        if (deepLink instanceof PasswordUpgradeLink) {
            PasswordUpgradeLink passwordUpgradeLink = (PasswordUpgradeLink) deepLink;
            deepLink = new PasswordUpgradeLink(passwordUpgradeLink.f133930b, passwordUpgradeLink.f133931c, this.f94081r);
        }
        b.a.a(this.f94070g, deepLink, "post_auth_action_link", null, 4);
        this.f94062B = null;
    }

    @Override // com.avito.android.authorization.login.InterfaceC28677f
    public final void setLoading(boolean z12) {
        if (z12) {
            Q q12 = this.f94089z;
            if (q12 != null) {
                q12.h();
                return;
            }
            return;
        }
        Q q13 = this.f94089z;
        if (q13 != null) {
            q13.d();
        }
    }

    public /* synthetic */ u(InterfaceC28674c interfaceC28674c, InterfaceC15202a interfaceC15202a, B3.a aVar, C40806a c40806a, h31.e eVar, InterfaceC35745a5 interfaceC35745a5, com.avito.android.deeplink_handler.handler.composite.a aVar2, AttributedTextCreator attributedTextCreator, InterfaceC30274a interfaceC30274a, com.avito.android.util.text.a aVar3, InterfaceC15415a interfaceC15415a, ScreenPerformanceTracker screenPerformanceTracker, com.avito.android.credman.s sVar, Kundle kundle, String str, int i12, C42822w c42822w) {
        this(interfaceC28674c, interfaceC15202a, aVar, c40806a, eVar, interfaceC35745a5, aVar2, attributedTextCreator, interfaceC30274a, aVar3, interfaceC15415a, screenPerformanceTracker, sVar, (i12 & 8192) != 0 ? null : kundle, str);
    }
}
