package com.avito.android.authorization.auth;

import Sm0.InterfaceC15202a;
import android.content.Intent;
import android.os.Build;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.R;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.PlaceholderType;
import com.avito.android.authorization.SocialCredentials;
import com.avito.android.authorization.auth.g0;
import com.avito.android.authorization.duplicate_pd.DuplicatePdArgs;
import com.avito.android.authorization.gorelkin.ParsingPermissionFormContent;
import com.avito.android.code_check_public.CodeCheckLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.ActualizePhonesStatusLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SocialAuthResult;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.ApiException;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.K2;
import com.avito.android.util.Kundle;
import com.jakewharton.rxbinding4.view.C37722i;
import com.vk.id.group.subscription.xml.GroupSubscriptionSheet;
import de.C39715a;
import hD.C40806a;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import io.reactivex.rxjava3.internal.operators.single.C42018p;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import zz.InterfaceC50647a;

/* compiled from: AuthPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/auth/A;", "Lcom/avito/android/authorization/auth/x;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements InterfaceC28644x {

    /* renamed from: A, reason: collision with root package name */
    public boolean f92771A;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28636o f92772a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f92773b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f92774c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f92775d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f92776e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f92777f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C40806a f92778g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f92779h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Zd.p f92780i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f92781j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.credman.i f92782k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f92783l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f92784m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92785n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f92786o = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public h0 f92787p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public AuthFragment f92788q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public SocialCredentials f92789r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f92790s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public String f92791t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public FastLoginState f92792u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f92793v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f92794w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public DeepLink f92795x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f92796y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public OnboardingState f92797z;

    /* compiled from: AuthPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[FastLoginState.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Parcelable.Creator<FastLoginState> creator = FastLoginState.CREATOR;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Parcelable.Creator<FastLoginState> creator2 = FastLoginState.CREATOR;
                iArr[0] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[OnboardingState.values().length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator3 = OnboardingState.CREATOR;
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator4 = OnboardingState.CREATOR;
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator5 = OnboardingState.CREATOR;
                iArr2[3] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator6 = OnboardingState.CREATOR;
                iArr2[4] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator7 = OnboardingState.CREATOR;
                iArr2[5] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                Parcelable.Creator<OnboardingState> creator8 = OnboardingState.CREATOR;
                iArr2[6] = 7;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {
        public b() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            A a12 = A.this;
            h0 h0Var = a12.f92787p;
            if (h0Var != null) {
                h0Var.i();
            }
            h0 h0Var2 = a12.f92787p;
            if (h0Var2 != null) {
                h0Var2.f();
            }
        }
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c<T> implements l41.g {
        public c() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            A a12 = A.this;
            h0 h0Var = a12.f92787p;
            if (h0Var != null) {
                g0.a.a(h0Var, a12.f92775d.getF15141a().getString(R.string.social_error_authentication), null, th2, 2);
            }
        }
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d<T> implements l41.g {
        public d() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            A a12 = A.this;
            h0 h0Var = a12.f92787p;
            if (h0Var != null) {
                h0Var.i();
            }
            h0 h0Var2 = a12.f92787p;
            if (h0Var2 != null) {
                h0Var2.f();
            }
        }
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/SocialAuthResult;", "result", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/SocialAuthResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ SocialCredentials f92801b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A f92802c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AuthFragment f92803d;

        public e(SocialCredentials socialCredentials, A a12, AuthFragment authFragment) {
            this.f92801b = socialCredentials;
            this.f92802c = a12;
            this.f92803d = authFragment;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            SocialAuthResult socialAuthResult = (SocialAuthResult) obj;
            SocialCredentials socialCredentials = this.f92801b;
            boolean zF2 = kotlin.jvm.internal.L.f(socialCredentials.f92742b, "vk-id");
            A a12 = this.f92802c;
            if (zF2) {
                C40806a c40806a = a12.f92778g;
                c40806a.getClass();
                kotlin.reflect.n<Object> nVar = C40806a.f397105l[8];
                if (((Boolean) c40806a.f397114j.a().invoke()).booleanValue() && a12.f92778g.w().invoke().booleanValue()) {
                    a12.f92796y = true;
                }
            }
            if (socialAuthResult instanceof SocialAuthResult.Ok) {
                h0 h0Var = a12.f92787p;
                if (h0Var != null) {
                    h0Var.h();
                }
                a12.j();
                return;
            }
            boolean z12 = socialAuthResult instanceof SocialAuthResult.TfaCheckWithPush;
            String str = socialCredentials.f92742b;
            if (z12) {
                SocialAuthResult.TfaCheckWithPush tfaCheckWithPush = (SocialAuthResult.TfaCheckWithPush) socialAuthResult;
                b.a.a(a12.f92783l, new CodeCheckLink(new CodeCheckLink.Flow.TfaCheck(tfaCheckWithPush.getFlow(), tfaCheckWithPush.getSrc(), new CodeCheckLink.Flow.TfaCheck.LoginInfo.BySocial(str, a12.f92790s)), new CodeCheckLink.Arguments(tfaCheckWithPush.getPhone(), null, 5, tfaCheckWithPush.getPhoneList(), 2, null)), "tfa_code_check", null, 4);
                return;
            }
            boolean z13 = socialAuthResult instanceof SocialAuthResult.ParsingPermission;
            AuthFragment authFragment = this.f92803d;
            if (z13) {
                SocialAuthResult.ParsingPermission parsingPermission = (SocialAuthResult.ParsingPermission) socialAuthResult;
                String name = parsingPermission.getName();
                List<String> phones = parsingPermission.getPhones();
                authFragment.J5(new ParsingPermissionFormContent(name, phones != null ? (String) C42745f0.G(phones) : null));
                return;
            }
            if (socialAuthResult instanceof SocialAuthResult.PassportBlocked) {
                b.a.a(a12.f92783l, ((SocialAuthResult.PassportBlocked) socialAuthResult).getDeeplink(), null, null, 6);
                return;
            }
            if (socialAuthResult instanceof SocialAuthResult.FollowDeeplink) {
                h0 h0Var2 = a12.f92787p;
                if (h0Var2 != null) {
                    D6.w(h0Var2.f93024b);
                }
                b.a.a(a12.f92783l, ((SocialAuthResult.FollowDeeplink) socialAuthResult).getDeeplink(), null, null, 6);
                return;
            }
            if (socialAuthResult instanceof SocialAuthResult.NeedPhoneVerification) {
                a12.f92791t = str;
                String phone = ((SocialAuthResult.NeedPhoneVerification) socialAuthResult).getPhone();
                com.avito.android.deeplink_handler.handler.composite.a aVar = authFragment.f92820D0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, new CodeCheckLink(new CodeCheckLink.Flow.SocReg(str), new CodeCheckLink.Arguments(phone != null ? To.c.a(phone) : null, null, null, null, 14, null)), "auth.codecheck.socreg", null, 4);
                return;
            }
            if (!(socialAuthResult instanceof SocialAuthResult.DuplicatedPD)) {
                if (socialAuthResult instanceof SocialAuthResult.BlockedAccount ? true : socialAuthResult instanceof SocialAuthResult.FailedWithDialog) {
                    return;
                }
                boolean z14 = socialAuthResult instanceof SocialAuthResult.WrongSocialUser;
                return;
            }
            SocialAuthResult.DuplicatedPD duplicatedPD = (SocialAuthResult.DuplicatedPD) socialAuthResult;
            String phoneHint = duplicatedPD.getPhoneHint();
            if (phoneHint == null) {
                phoneHint = "";
            }
            String supportLink = duplicatedPD.getSupportLink();
            if (supportLink == null) {
                supportLink = "";
            }
            SocialAuthResult.DuplicatedPD.Button firstButton = duplicatedPD.getFirstButton();
            String name2 = firstButton != null ? firstButton.getName() : null;
            if (name2 == null) {
                name2 = "";
            }
            SocialAuthResult.DuplicatedPD.Button firstButton2 = duplicatedPD.getFirstButton();
            String url = firstButton2 != null ? firstButton2.getUrl() : null;
            if (url == null) {
                url = "";
            }
            DuplicatePdArgs.Button button = new DuplicatePdArgs.Button(name2, url);
            SocialAuthResult.DuplicatedPD.Button secondButton = duplicatedPD.getSecondButton();
            String name3 = secondButton != null ? secondButton.getName() : null;
            if (name3 == null) {
                name3 = "";
            }
            SocialAuthResult.DuplicatedPD.Button secondButton2 = duplicatedPD.getSecondButton();
            String url2 = secondButton2 != null ? secondButton2.getUrl() : null;
            authFragment.f92828L0.b(new DuplicatePdArgs(phoneHint, supportLink, button, new DuplicatePdArgs.Button(name3, url2 != null ? url2 : "")));
        }
    }

    /* compiled from: AuthPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AuthFragment f92805c;

        public f(AuthFragment authFragment) {
            this.f92805c = authFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            boolean z12 = th2 instanceof ApiException;
            A a12 = A.this;
            if (!z12) {
                h0 h0Var = a12.f92787p;
                if (h0Var != null) {
                    g0.a.a(h0Var, a12.f92775d.getF15141a().getString(R.string.social_error_authentication), null, th2, 2);
                    return;
                }
                return;
            }
            ApiError apiError = ((ApiException) th2).f318522b;
            if (apiError instanceof com.avito.android.remote.error.s) {
                h0 h0Var2 = a12.f92787p;
                if (h0Var2 != null) {
                    h0Var2.h();
                }
                a12.f92785n.b(a12.f92779h.g(((com.avito.android.remote.error.s) apiError).getUserDialog()).m(new d0(this.f92805c)));
                return;
            }
            if (apiError instanceof ApiError.NetworkIOError) {
                h0 h0Var3 = a12.f92787p;
                if (h0Var3 != null) {
                    g0.a.a(h0Var3, ((ApiError.NetworkIOError) apiError).getF244063c(), apiError, null, 4);
                    return;
                }
                return;
            }
            h0 h0Var4 = a12.f92787p;
            if (h0Var4 != null) {
                g0.a.a(h0Var4, a12.f92775d.getF15141a().getString(R.string.social_error_authentication), apiError, null, 4);
            }
        }
    }

    @Inject
    public A(@Y61.k InterfaceC28636o interfaceC28636o, @Y61.k InterfaceC27663a interfaceC27663a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k C40806a c40806a, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k Zd.p pVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.credman.i iVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.l @com.avito.android.authorization.auth.di.m Kundle kundle, @com.avito.android.authorization.auth.di.k @Y61.l String str) {
        Boolean boolA;
        OnboardingState onboardingState;
        Boolean boolA2;
        Boolean boolA3;
        Boolean boolA4;
        FastLoginState fastLoginState;
        this.f92772a = interfaceC28636o;
        this.f92773b = interfaceC27663a;
        this.f92774c = interfaceC35745a5;
        this.f92775d = interfaceC15202a;
        this.f92776e = screenPerformanceTracker;
        this.f92777f = interfaceC50647a;
        this.f92778g = c40806a;
        this.f92779h = interfaceC30274a;
        this.f92780i = pVar;
        this.f92781j = interfaceC28373a;
        this.f92782k = iVar;
        this.f92783l = aVar;
        this.f92784m = str;
        this.f92789r = kundle != null ? (SocialCredentials) kundle.d("credentials") : null;
        this.f92790s = kundle != null ? kundle.g("social_id") : null;
        this.f92791t = kundle != null ? kundle.g("socreg_type") : null;
        this.f92792u = (kundle == null || (fastLoginState = (FastLoginState) kundle.d("fast_login")) == null) ? FastLoginState.f92852b : fastLoginState;
        boolean zBooleanValue = false;
        this.f92793v = (kundle == null || (boolA4 = kundle.a("skip_saved_login")) == null) ? false : boolA4.booleanValue();
        this.f92794w = (kundle == null || (boolA3 = kundle.a("notify_argreement_is_needed")) == null) ? false : boolA3.booleanValue();
        this.f92795x = kundle != null ? (DeepLink) kundle.d("post_auth_deeplink") : null;
        this.f92796y = (kundle == null || (boolA2 = kundle.a("show_vkid_group_subscription_suggest")) == null) ? false : boolA2.booleanValue();
        this.f92797z = (kundle == null || (onboardingState = (OnboardingState) kundle.d("onboarding")) == null) ? OnboardingState.f92869b : onboardingState;
        if (kundle != null && (boolA = kundle.a("business_registration_onboarding_is_needed")) != null) {
            zBooleanValue = boolA.booleanValue();
        }
        this.f92771A = zBooleanValue;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void a() {
        h0 h0Var = this.f92787p;
        if (h0Var != null) {
            h0Var.g();
        }
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void b(@Y61.k Profile profile, @Y61.k Session session) {
        SocialCredentials socialCredentials = this.f92789r;
        io.reactivex.rxjava3.internal.operators.completable.K kN2 = this.f92772a.d(profile, session, socialCredentials != null ? socialCredentials.f92742b : null).q(this.f92774c.e()).n(new b());
        C28645y c28645y = new C28645y(this, 0);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f92785n.b(kN2.m(gVar, gVar, interfaceC43543a, c28645y, interfaceC43543a, interfaceC43543a).v(new C28645y(this, 1), new c()));
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void c() {
        h0 h0Var = this.f92787p;
        if (h0Var != null) {
            h0Var.g();
        }
        h0 h0Var2 = this.f92787p;
        if (h0Var2 != null) {
            g0.a.a(h0Var2, this.f92775d.getF15141a().getString(R.string.social_error_authentication), null, null, 6);
        }
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void c0() {
        this.f92786o.e();
        this.f92788q = null;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void d(@Y61.k AuthFragment authFragment) {
        if (this.f92788q == null) {
            this.f92788q = authFragment;
            if (m()) {
                return;
            }
            int iOrdinal = this.f92792u.ordinal();
            if (iOrdinal == 1) {
                l(authFragment);
            } else if (iOrdinal != 2) {
                final L l12 = new L(this, authFragment);
                this.f92786o.b(new C42018p(this.f92782k.load().j(new I(this)), new InterfaceC43543a() { // from class: com.avito.android.authorization.auth.z
                    @Override // l41.InterfaceC43543a
                    public final void run() {
                        h0 h0Var = this.f93066b.f92787p;
                        if (h0Var != null) {
                            h0Var.h();
                        }
                        ((L) l12).invoke();
                    }
                }).x(new J(l12, this, authFragment), new K(l12)));
            }
        }
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f92789r, "credentials");
        kundle.j(this.f92792u, "fast_login");
        kundle.m("social_id", this.f92790s);
        kundle.m("socreg_type", this.f92791t);
        kundle.h(Boolean.valueOf(this.f92793v), "skip_saved_login");
        kundle.j(this.f92795x, "post_auth_deeplink");
        kundle.h(Boolean.valueOf(this.f92796y), "show_vkid_group_subscription_suggest");
        kundle.h(Boolean.valueOf(this.f92794w), "notify_argreement_is_needed");
        kundle.h(Boolean.valueOf(this.f92771A), "business_registration_onboarding_is_needed");
        kundle.j(this.f92797z, "onboarding");
        return kundle;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void e(@Y61.k h0 h0Var) {
        this.f92787p = h0Var;
        AttributedText attributedTextA = this.f92780i.a(this.f92775d.getF15141a(), PlaceholderType.f92738b);
        h0Var.f93036n = attributedTextA;
        com.avito.android.util.text.j.c(h0Var.f93033k, attributedTextA, null);
        io.reactivex.rxjava3.disposables.d dVarT0 = C37722i.a(h0Var.f93031i).t0(new B(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f92785n;
        cVar.b(dVarT0);
        cVar.b(C37722i.a(h0Var.f93032j).t0(new C(this)));
        AttributedText attributedText = h0Var.f93036n;
        cVar.b((attributedText != null ? attributedText : null).linkClicksV3().i0(h0Var.f93034l).t0(new D(this)));
        com.jakewharton.rxrelay3.c<G0> cVar2 = h0Var.f93035m;
        cVar.b(com.avito.android.advert.item.delivery_suggests.l.l(cVar2, cVar2).t0(new E(this)));
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f92783l;
        cVar.b(aVar.d9().N(U.f92876b).t0(new V(this)));
        cVar.b(aVar.d9().N(W.f92878b).t0(new X(this)));
        cVar.b(aVar.d9().N(Y.f92880b).t0(new Z(this)));
        cVar.b(aVar.d9().N(a0.f92882b).t0(new b0(this)));
        cVar.b(aVar.d9().N(c0.f92929b).t0(new Q(this)));
        cVar.b(aVar.d9().N(S.f92874b).t0(new T(this)));
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void e0() {
        this.f92785n.e();
        this.f92787p = null;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void f(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8) {
        if (str == null || str2 == null) {
            c();
        } else {
            this.f92789r = new SocialCredentials(str, str2, str3, str4, str5, str6, str7, str8);
            m();
        }
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void g() {
        this.f92771A = true;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void h() {
        this.f92793v = true;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void i() {
        this.f92794w = true;
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void j() {
        while (true) {
            h0 h0Var = this.f92787p;
            if (h0Var != null) {
                h0Var.i();
            }
            OnboardingState onboardingState = (OnboardingState) C42745f0.K(this.f92797z.ordinal() + 1, OnboardingState.f92871d);
            if (onboardingState == null) {
                return;
            }
            this.f92797z = onboardingState;
            int iOrdinal = onboardingState.ordinal();
            com.avito.android.deeplink_handler.handler.composite.a aVar = this.f92783l;
            G0 g02 = null;
            Intent intent = null;
            G0 g03 = null;
            G0 g04 = null;
            switch (iOrdinal) {
                case 1:
                    if (!this.f92771A) {
                        break;
                    } else {
                        b.a.a(aVar, C39715a.f393985a, "post_auth_link", null, 4);
                        return;
                    }
                case 2:
                    DeepLink deepLink = this.f92795x;
                    if (deepLink != null) {
                        b.a.a(aVar, deepLink, "post_auth_link", null, 4);
                        g04 = G0.f406611a;
                    }
                    if (g04 == null) {
                        break;
                    } else {
                        return;
                    }
                case 3:
                    if (this.f92796y) {
                        h0 h0Var2 = this.f92787p;
                        if (h0Var2 != null) {
                            FrameLayout frameLayout = h0Var2.f93026d;
                            GroupSubscriptionSheet groupSubscriptionSheet = new GroupSubscriptionSheet(frameLayout.getContext(), null, 0, 6, null);
                            groupSubscriptionSheet.setGroupId("5755934");
                            groupSubscriptionSheet.setCallbacks(new i0(h0Var2), new j0(h0Var2));
                            groupSubscriptionSheet.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
                            frameLayout.addView(groupSubscriptionSheet);
                            groupSubscriptionSheet.post(new com.avito.android.app.coldstart.d(groupSubscriptionSheet, 4));
                            g03 = G0.f406611a;
                        }
                        AuthFragment authFragment = this.f92788q;
                        if (authFragment != null) {
                            authFragment.E5();
                        }
                        if (g03 == null) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                case 4:
                    b.a.a(aVar, ActualizePhonesStatusLink.f133880b, "auth.actualize.status", null, 4);
                    return;
                case 5:
                    if (this.f92794w) {
                        AuthFragment authFragment2 = this.f92788q;
                        if (authFragment2 != null) {
                            authFragment2.E5();
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = authFragment2.f92820D0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            InterfaceC28641u interfaceC28641u = authFragment2.f92818B0;
                            if (interfaceC28641u == null) {
                                interfaceC28641u = null;
                            }
                            b.a.a(aVar2, interfaceC28641u.build(), "notificationsAgreement", null, 4);
                            g02 = G0.f406611a;
                        }
                        if (g02 == null) {
                            break;
                        } else {
                            return;
                        }
                    } else {
                        continue;
                    }
                case 6:
                    AuthFragment authFragment3 = this.f92788q;
                    if (authFragment3 != null) {
                        K2.e(authFragment3);
                        Intent intent2 = C28634m.a(authFragment3).f92811c;
                        if (intent2 != null) {
                            authFragment3.startActivity(intent2);
                        }
                        ActivityC22955m activityC22955mRequireActivity = authFragment3.requireActivity();
                        Intent intent3 = authFragment3.requireActivity().getIntent();
                        Parcelable parcelableExtra = Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent3.getParcelableExtra("successAuthData", Parcelable.class) : intent3.getParcelableExtra("successAuthData");
                        if (parcelableExtra != null) {
                            intent = new Intent();
                            intent.putExtra("SuccessAuthResultData", parcelableExtra);
                        }
                        activityC22955mRequireActivity.setResult(-1, intent);
                        authFragment3.requireActivity().finish();
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.avito.android.authorization.auth.InterfaceC28644x
    public final void k(@Y61.l String str) {
        this.f92790s = str;
    }

    public final void l(AuthFragment authFragment) {
        C42023v c42023v = new C42023v(new C42016n(this.f92772a.f(this.f92784m).s(this.f92774c.e()), new C28645y(this, 4)).j(new F(this)), new C28645y(this, 5));
        ScreenPerformanceTracker.LoadingType loadingType = ScreenPerformanceTracker.LoadingType.f90785b;
        this.f92786o.b(com.avito.android.analytics.screens.utils.D.a(c42023v, this.f92776e, null, new G(authFragment), H.f92858l, 2));
    }

    public final boolean m() {
        AuthFragment authFragment;
        io.reactivex.rxjava3.core.z<SocialAuthResult> zVarE;
        SocialCredentials socialCredentials = this.f92789r;
        if (socialCredentials == null || (authFragment = this.f92788q) == null) {
            return false;
        }
        if (kotlin.jvm.internal.L.f(socialCredentials.f92742b, "apple")) {
            zVarE = this.f92772a.c(socialCredentials.f92743c, socialCredentials.f92745e, this.f92790s);
        } else {
            zVarE = this.f92772a.e(socialCredentials.f92742b, socialCredentials.f92743c, socialCredentials.f92744d, this.f92790s, socialCredentials.f92746f, socialCredentials.f92747g, socialCredentials.f92748h, socialCredentials.f92749i);
        }
        I0 i0J0 = zVarE.j0(this.f92774c.e());
        d dVar = new d();
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = i0J0.J(interfaceC43543a, dVar);
        C28645y c28645y = new C28645y(this, 2);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        this.f92786o.b(pJ2.H(gVar, gVar, interfaceC43543a, c28645y).v0(new e(socialCredentials, this, authFragment), new f(authFragment), interfaceC43543a));
        return true;
    }
}
