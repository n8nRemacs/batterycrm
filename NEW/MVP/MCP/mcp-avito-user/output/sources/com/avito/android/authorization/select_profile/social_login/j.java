package com.avito.android.authorization.select_profile.social_login;

import Rh.C15041a;
import Sm0.InterfaceC15202a;
import android.annotation.SuppressLint;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import com.avito.android.R;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.analytics.screens.utils.D;
import com.avito.android.authorization.SocialRegistrationSuggestsParams;
import com.avito.android.authorization.event.AuthWarningPhoneInOtherAccEvent;
import com.avito.android.authorization.gorelkin.ParsingPermissionFormContent;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.PpFlow;
import com.avito.android.authorization.select_profile.adapter.AttributeParams;
import com.avito.android.authorization.select_profile.adapter.SelectProfileField;
import com.avito.android.deep_linking.links.HelpCenterUrlShowLink;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.model.Profile;
import com.avito.android.remote.model.Session;
import com.avito.android.remote.model.SocialProceedResult;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.registration.ProfileSocial;
import com.avito.android.remote.model.registration.RegisteredProfile;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P2;
import com.jakewharton.rxbinding4.view.C37722i;
import he.q;
import io.reactivex.rxjava3.core.AbstractC41768a;
import io.reactivex.rxjava3.internal.operators.completable.K;
import io.reactivex.rxjava3.internal.operators.single.C42016n;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import zz.InterfaceC50647a;

/* compiled from: SocialRegistrationSuggestsPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/authorization/select_profile/social_login/j;", "Lcom/avito/android/authorization/select_profile/social_login/d;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements com.avito.android.authorization.select_profile.social_login.d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC27663a f94393a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final SocialRegistrationSuggestsParams f94394b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.a f94395c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<SelectProfileField> f94396d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f94397e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15202a f94398f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f94399g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f94400h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f94401i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.text.a f94402j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f94403k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public p f94404l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public SocialRegistrationSuggestsFragment f94405m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f94406n = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public SelectProfileField.Profile f94407o;

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {
        public a() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p pVar = j.this.f94404l;
            if (pVar != null) {
                pVar.c();
            }
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2$b;", "Lcom/avito/android/remote/model/SocialProceedResult;", "result", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<P2.b<SocialProceedResult>, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(P2.b<SocialProceedResult> bVar) {
            SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment;
            SocialProceedResult socialProceedResult = bVar.f318720a;
            j jVar = j.this;
            jVar.getClass();
            if (socialProceedResult instanceof SocialProceedResult.Ok) {
                SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment2 = jVar.f94405m;
                if (socialRegistrationSuggestsFragment2 != null) {
                    socialRegistrationSuggestsFragment2.r5();
                }
            } else if (socialProceedResult instanceof SocialProceedResult.ErrorDialog) {
                jVar.f94406n.b(jVar.f94401i.g(((SocialProceedResult.ErrorDialog) socialProceedResult).getUserDialog()).m(new l(jVar)));
            } else if ((socialProceedResult instanceof SocialProceedResult.ParsingPermission) && (socialRegistrationSuggestsFragment = jVar.f94405m) != null) {
                SocialProceedResult.ParsingPermission parsingPermission = (SocialProceedResult.ParsingPermission) socialProceedResult;
                String name = parsingPermission.getName();
                List<String> phones = parsingPermission.getPhones();
                ParsingPermissionFormContent parsingPermissionFormContent = new ParsingPermissionFormContent(name, phones != null ? (String) C42745f0.G(phones) : null);
                H hE2 = socialRegistrationSuggestsFragment.getParentFragmentManager().e();
                ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
                PpFlow ppFlow = PpFlow.f93889d;
                aVar.getClass();
                hE2.j(R.id.fragment_container, ParsingPermissionFragment.a.c(parsingPermissionFormContent, ppFlow), null, 1);
                hE2.e();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2$c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<P2.c, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final c f94410l = new c();

        public c() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(P2.c cVar) {
            return G0.f406611a;
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/util/P2$a;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/util/P2$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<P2.a, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(P2.a aVar) {
            P2.a aVar2 = aVar;
            j jVar = j.this;
            p pVar = jVar.f94404l;
            if (pVar != null) {
                pVar.b(jVar.f94399g.b(aVar2.f318719a));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<Throwable, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            Throwable th3 = th2;
            j jVar = j.this;
            p pVar = jVar.f94404l;
            if (pVar != null) {
                pVar.b(jVar.f94399g.c(th3));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/disposables/d;", "it", "Lkotlin/G0;", "accept", "(Lio/reactivex/rxjava3/disposables/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f<T> implements l41.g {
        public f() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            p pVar = j.this.f94404l;
            if (pVar != null) {
                pVar.c();
            }
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g<T> implements l41.g {
        public g() {
        }

        @Override // l41.g
        public final void accept(Object obj) {
            Throwable th2 = (Throwable) obj;
            j jVar = j.this;
            p pVar = jVar.f94404l;
            if (pVar != null) {
                pVar.b(jVar.f94399g.c(th2));
            }
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ SelectProfileField.Profile f94416m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(SelectProfileField.Profile profile) {
            super(0);
            this.f94416m = profile;
        }

        @Override // Y41.a
        public final G0 invoke() {
            j.this.d(this.f94416m.f94260c);
            return G0.f406611a;
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "accept", "(Lkotlin/G0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f94417b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(Y41.a<G0> aVar) {
            this.f94417b = (N) aVar;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [Y41.a, kotlin.jvm.internal.N] */
        @Override // l41.g
        public final void accept(Object obj) {
            this.f94417b.invoke();
        }
    }

    /* compiled from: SocialRegistrationSuggestsPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.authorization.select_profile.social_login.j$j, reason: collision with other inner class name */
    public static final class C2801j<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public static final C2801j<T> f94418b = new C2801j<>();

        @Override // l41.g
        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    @Inject
    public j(@Y61.k InterfaceC27663a interfaceC27663a, @Y61.k SocialRegistrationSuggestsParams socialRegistrationSuggestsParams, @Y61.k com.avito.konveyor.adapter.a aVar, @Y61.k com.jakewharton.rxrelay3.c<SelectProfileField> cVar, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k InterfaceC15202a interfaceC15202a, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k com.avito.android.util.text.a aVar2, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Kundle kundle) {
        this.f94393a = interfaceC27663a;
        this.f94394b = socialRegistrationSuggestsParams;
        this.f94395c = aVar;
        this.f94396d = cVar;
        this.f94397e = interfaceC35745a5;
        this.f94398f = interfaceC15202a;
        this.f94399g = interfaceC50647a;
        this.f94400h = interfaceC28373a;
        this.f94401i = interfaceC30274a;
        this.f94402j = aVar2;
        this.f94403k = screenPerformanceTracker;
        this.f94407o = kundle != null ? (SelectProfileField.Profile) kundle.d("first_profile") : null;
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    public final void a(@Y61.k SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment) {
        this.f94405m = socialRegistrationSuggestsFragment;
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    public final void b(@Y61.k Profile profile, @Y61.k Session session) {
        AbstractC41768a abstractC41768aB = InterfaceC27663a.C2131a.b(this.f94393a, session, profile, this.f94394b.f92752d, "proceed_social", null, null, 112);
        InterfaceC35745a5 interfaceC35745a5 = this.f94397e;
        K kN2 = abstractC41768aB.x(interfaceC35745a5.a()).q(interfaceC35745a5.e()).n(new f());
        com.avito.android.authorization.select_profile.social_login.e eVar = new com.avito.android.authorization.select_profile.social_login.e(this, 1);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        this.f94406n.b(kN2.m(gVar, gVar, interfaceC43543a, interfaceC43543a, eVar, interfaceC43543a).v(new com.avito.android.authorization.select_profile.social_login.e(this, 2), new g()));
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    @SuppressLint({"HardcodeStringDetector"})
    public final void c(@Y61.k p pVar) {
        Object next;
        this.f94404l = pVar;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f94396d.t0(new com.avito.android.authorization.select_profile.social_login.f(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f94406n;
        cVar.b(dVarT0);
        cVar.b(pVar.f94441i.t0(new com.avito.android.authorization.select_profile.social_login.g(this)));
        cVar.b(C37722i.a(pVar.f94438f).t0(new com.avito.android.authorization.select_profile.social_login.h(this)));
        cVar.b(C37722i.a(pVar.f94439g).t0(new com.avito.android.authorization.select_profile.social_login.i(this)));
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = this.f94394b;
        Iterator<T> it = socialRegistrationSuggestsParams.f92751c.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (L.f(((RegisteredProfile) next).isPassport(), Boolean.TRUE)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        int i12 = 0;
        boolean z12 = next != null;
        p pVar2 = this.f94404l;
        if (pVar2 != null) {
            com.avito.android.printable_text.a.c(pVar2.f94434b, com.avito.android.printable_text.b.c(R.string.registration_select_passport_profile_title, new Serializable[0]));
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new SelectProfileField.Text(0L, com.avito.android.printable_text.b.c(R.string.registration_select_passport_profile_message, new Serializable[0]), z12 ? new AttributeParams(null, R.string.registration_passport_suggests_create_link_text, new HelpCenterUrlShowLink("sections/349?articleId=2806"), 1, null) : null));
        List<RegisteredProfile> list = socialRegistrationSuggestsParams.f92751c;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(list, 10));
        for (Object obj : list) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C42745f0.H0();
                throw null;
            }
            arrayList2.add(new SelectProfileField.Profile(i13, (RegisteredProfile) obj));
            i12 = i13;
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList.add((SelectProfileField.Profile) it2.next());
        }
        SelectProfileField.Profile profile = (SelectProfileField.Profile) C42745f0.G(arrayList2);
        if (profile != null) {
            this.f94407o = profile;
        }
        com.avito.konveyor.util.a.a(this.f94395c, arrayList);
        p pVar3 = this.f94404l;
        if (pVar3 != null) {
            pVar3.f94436d.notifyDataSetChanged();
        }
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    public final void c0() {
        this.f94405m = null;
    }

    public final void d(RegisteredProfile registeredProfile) {
        SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment;
        G0 g02;
        List<ProfileSocial> social = registeredProfile.getSocial();
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = this.f94394b;
        if (social != null) {
            SocialRegistrationSuggestsFragment socialRegistrationSuggestsFragment2 = this.f94405m;
            if (socialRegistrationSuggestsFragment2 != null) {
                String str = socialRegistrationSuggestsParams.f92750b;
                Zd.i iVar = socialRegistrationSuggestsFragment2.f94347r0;
                if (iVar == null) {
                    iVar = null;
                }
                ActivityC22955m activityC22955mRequireActivity = socialRegistrationSuggestsFragment2.requireActivity();
                InterfaceC28373a interfaceC28373a = socialRegistrationSuggestsFragment2.f94349t0;
                if (interfaceC28373a == null) {
                    interfaceC28373a = null;
                }
                socialRegistrationSuggestsFragment2.startActivity(iVar.f(Zd.n.b(activityC22955mRequireActivity, interfaceC28373a), social, str));
                g02 = G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 != null) {
                return;
            }
        }
        String login = registeredProfile.getLogin();
        if (login == null || (socialRegistrationSuggestsFragment = this.f94405m) == null) {
            return;
        }
        String str2 = socialRegistrationSuggestsParams.f92750b;
        Zd.i iVar2 = socialRegistrationSuggestsFragment.f94347r0;
        Zd.i iVar3 = iVar2 != null ? iVar2 : null;
        ActivityC22955m activityC22955mRequireActivity2 = socialRegistrationSuggestsFragment.requireActivity();
        InterfaceC28373a interfaceC28373a2 = socialRegistrationSuggestsFragment.f94349t0;
        socialRegistrationSuggestsFragment.startActivity(iVar3.j(Zd.n.b(activityC22955mRequireActivity2, interfaceC28373a2 != null ? interfaceC28373a2 : null), (248 & 2) != 0 ? null : login, (248 & 4) != 0 ? null : null, (248 & 8) == 0, (248 & 16) != 0 ? null : str2, (248 & 32) != 0 ? false : false, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null));
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f94407o, "first_profile");
        return kundle;
    }

    public final void e() {
        this.f94400h.c(new q(true));
        SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = this.f94394b;
        this.f94406n.b(D.c(new C42016n(this.f94393a.f(socialRegistrationSuggestsParams.f92750b, socialRegistrationSuggestsParams.f92752d, socialRegistrationSuggestsParams.f92754f).s(this.f94397e.e()).j(new a()), new com.avito.android.authorization.select_profile.social_login.e(this, 0)), this.f94403k, new b(), c.f94410l, new d(), new e()));
    }

    @Override // com.avito.android.authorization.select_profile.social_login.d
    public final void e0() {
        this.f94406n.e();
        this.f94404l = null;
    }

    public final void f(SelectProfileField.Profile profile) {
        q qVar = new q(false);
        InterfaceC28373a interfaceC28373a = this.f94400h;
        interfaceC28373a.c(qVar);
        if (L.f(profile.f94260c.isNeedWarning(), Boolean.TRUE)) {
            SocialRegistrationSuggestsParams socialRegistrationSuggestsParams = this.f94394b;
            if (socialRegistrationSuggestsParams.f92753e != null) {
                interfaceC28373a.c(new AuthWarningPhoneInOtherAccEvent(AuthWarningPhoneInOtherAccEvent.Source.f93834d));
                g(socialRegistrationSuggestsParams.f92753e, new h(profile));
                return;
            }
        }
        d(profile.f94260c);
    }

    public final void g(AttributedText attributedText, Y41.a<G0> aVar) {
        InterfaceC15202a interfaceC15202a = this.f94398f;
        String string = interfaceC15202a.getF15141a().getString(R.string.phone_is_bound_error_re23);
        attributedText.setOnDeepLinkClickListener(new C15041a(this, 15));
        p pVar = this.f94404l;
        this.f94406n.b(this.f94401i.e(string, pVar != null ? this.f94402j.c(pVar.f94440h, attributedText) : null, interfaceC15202a.getF15141a().getString(R.string.phone_is_bound_error_continue_button), interfaceC15202a.getF15141a().getString(R.string.phone_is_bound_error_back_button), true).n(new i(aVar), C2801j.f94418b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }
}
