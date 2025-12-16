package com.avito.android.social_management;

import android.content.Intent;
import android.os.Parcelable;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.social.SocialNetwork;
import com.avito.android.social_management.adapter.SocialItem;
import com.avito.android.social_management.generated.api.vk_profile_info_v_1.VkProfileInfoWidgetValueRowStatus;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.P5;
import io.reactivex.rxjava3.internal.operators.observable.I0;
import io.reactivex.rxjava3.internal.operators.single.C42023v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import l41.InterfaceC43543a;
import zz.InterfaceC50647a;

/* compiled from: SocialManagementPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/social_management/t;", "Lcom/avito/android/social_management/r;", "_avito_social-network-editor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class t implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35044k f284697a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.social.D> f284698b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<com.avito.android.social.D> f284699c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.recycler.data_aware.c f284700d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<SocialItem> f284701e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j> f284702f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC50647a f284703g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30274a f284704h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final M f284705i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f284706j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f284707k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.social.M f284708l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final ScreenPerformanceTracker f284709m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public Q f284710n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public SocialManagementActivity f284711o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f284712p = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f284713q = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public List<? extends SocialItem> f284714r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public String f284715s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f284716t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final ArrayList f284717u;

    /* renamed from: v, reason: collision with root package name */
    public int f284718v;

    /* compiled from: SocialManagementPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f284719a;

        static {
            int[] iArr = new int[VkProfileInfoWidgetValueRowStatus.Type.values().length];
            try {
                iArr[VkProfileInfoWidgetValueRowStatus.Type.f284676Ok.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkProfileInfoWidgetValueRowStatus.Type.Error.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f284719a = iArr;
        }
    }

    /* compiled from: SocialManagementPresenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/social_management/adapter/SocialItem;", "items", "Lkotlin/G0;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends SocialItem>, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(List<? extends SocialItem> list) {
            List<? extends SocialItem> list2 = list;
            t tVar = t.this;
            tVar.f284715s = null;
            tVar.f284714r = list2;
            com.avito.konveyor.util.a.a(tVar.f284700d, list2);
            return G0.f406611a;
        }
    }

    /* compiled from: SocialManagementPresenter.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "error", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Throwable, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            t tVar = t.this;
            String strC = tVar.f284703g.c(th2);
            Q q12 = tVar.f284710n;
            if (q12 != null) {
                q12.b(strC);
            }
            tVar.f284715s = strC;
            return G0.f406611a;
        }
    }

    @Inject
    public t(@Y61.k InterfaceC35044k interfaceC35044k, @com.avito.android.social_management.di.d @Y61.k List<com.avito.android.social.D> list, @com.avito.android.social_management.di.a @Y61.k List<com.avito.android.social.D> list2, @Y61.k com.avito.android.recycler.data_aware.c cVar, @Y61.k com.jakewharton.rxrelay3.c<SocialItem> cVar2, @Y61.k com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j> cVar3, @Y61.k InterfaceC50647a interfaceC50647a, @Y61.k InterfaceC30274a interfaceC30274a, @Y61.k M m12, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC35745a5 interfaceC35745a5, @Y61.k com.avito.android.social.M m13, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.l Kundle kundle) {
        Parcelable avitoFake;
        Boolean boolA;
        this.f284697a = interfaceC35044k;
        this.f284698b = list;
        this.f284699c = list2;
        this.f284700d = cVar;
        this.f284701e = cVar2;
        this.f284702f = cVar3;
        this.f284703g = interfaceC50647a;
        this.f284704h = interfaceC30274a;
        this.f284705i = m12;
        this.f284706j = interfaceC28373a;
        this.f284707k = interfaceC35745a5;
        this.f284708l = m13;
        this.f284709m = screenPerformanceTracker;
        this.f284714r = kundle != null ? kundle.e("items") : null;
        this.f284715s = kundle != null ? kundle.g("error") : null;
        this.f284716t = (kundle == null || (boolA = kundle.a("changed")) == null) ? false : boolA.booleanValue();
        List<com.avito.android.social.D> list3 = list2;
        ArrayList arrayList = new ArrayList(C42745f0.q(list3, 10));
        Iterator<T> it = list3.iterator();
        while (it.hasNext()) {
            String strD = this.f284708l.d(((com.avito.android.social.D) it.next()).getType());
            int iHashCode = strD.hashCode();
            M m14 = this.f284705i;
            switch (iHashCode) {
                case -1905968092:
                    if (!strD.equals("avitofake")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.AvitoFake(m14.getF284461c());
                    break;
                case -1459150334:
                    if (!strD.equals("esia-id")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.Esia(m14.getF284460b());
                    break;
                case 3305:
                    if (!strD.equals("gp")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.Google(m14.c());
                    break;
                case 3548:
                    if (!strD.equals("ok")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.Odnoklassniki(m14.b());
                    break;
                case 3765:
                    if (!strD.equals("vk")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.Vkontakte(m14.d());
                    break;
                case 93029210:
                    if (!strD.equals("apple")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.Apple(m14.a());
                    break;
                case 112209715:
                    if (!strD.equals("vk-id")) {
                        throw new IllegalStateException("Unknown social manager");
                    }
                    avitoFake = new SocialNetwork.VkId(m14.d());
                    break;
                default:
                    throw new IllegalStateException("Unknown social manager");
            }
            arrayList.add(avitoFake);
        }
        this.f284717u = arrayList;
    }

    public static final void f(t tVar, Throwable th2) {
        InterfaceC50647a interfaceC50647a = tVar.f284703g;
        ApiError apiErrorA = interfaceC50647a.a(th2);
        if (apiErrorA instanceof ApiError.ErrorDialog) {
            tVar.f284713q.b(tVar.f284704h.g(((ApiError.ErrorDialog) apiErrorA).getUserDialog()).m(new F(tVar)));
        } else {
            Q q12 = tVar.f284710n;
            if (q12 != null) {
                q12.c(interfaceC50647a.b(apiErrorA), th2);
            }
        }
    }

    @Override // com.avito.android.social_management.r
    public final void a() {
        Q q12 = this.f284710n;
        if (q12 != null) {
            q12.c(this.f284705i.i(), null);
        }
    }

    @Override // com.avito.android.social_management.r
    public final void b(@Y61.k Q q12) {
        this.f284710n = q12;
        io.reactivex.rxjava3.disposables.d dVarT0 = this.f284701e.t0(new y(this));
        io.reactivex.rxjava3.disposables.c cVar = this.f284713q;
        cVar.b(dVarT0);
        z zVar = new z(this);
        l41.g<? super Throwable> gVar = A.f284434b;
        com.jakewharton.rxrelay3.c<com.avito.android.social_management.adapter.notification.j> cVar2 = this.f284702f;
        cVar2.getClass();
        cVar.b(cVar2.v0(zVar, gVar, io.reactivex.rxjava3.internal.functions.a.f401993c));
        cVar.b(P5.g(q12.f284463a.f10415d).t0(new B(this)));
        cVar.b(q12.f284464b.e().t0(new C(this)));
        String str = this.f284715s;
        if (str != null) {
            q12.b(str);
        } else {
            g();
        }
    }

    @Override // com.avito.android.social_management.r
    public final void c(@Y61.k String str, @Y61.k String str2) {
        this.f284716t = true;
        I0 i0J0 = this.f284697a.a(str, str2).j0(this.f284707k.e());
        u uVar = new u(this);
        InterfaceC43543a interfaceC43543a = io.reactivex.rxjava3.internal.functions.a.f401993c;
        io.reactivex.rxjava3.internal.operators.observable.P pJ2 = i0J0.J(interfaceC43543a, uVar);
        C35051s c35051s = new C35051s(this, 2);
        l41.g<Object> gVar = io.reactivex.rxjava3.internal.functions.a.f401994d;
        this.f284712p.b(com.avito.android.analytics.screens.utils.D.b(pJ2.H(gVar, gVar, interfaceC43543a, c35051s), this.f284709m, "addSocialAttempt", new v(this), new w(1, this, t.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0), 4));
    }

    @Override // com.avito.android.social_management.r
    public final void c0() {
        this.f284712p.e();
        this.f284711o = null;
    }

    @Override // com.avito.android.social_management.r
    public final void d() {
        this.f284714r = null;
        g();
    }

    @Override // com.avito.android.social_management.r
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.k("items", this.f284714r);
        kundle.m("error", this.f284715s);
        kundle.h(Boolean.valueOf(this.f284716t), "changed");
        return kundle;
    }

    @Override // com.avito.android.social_management.r
    public final void e(@Y61.k SocialManagementActivity socialManagementActivity) {
        this.f284711o = socialManagementActivity;
    }

    @Override // com.avito.android.social_management.r
    public final void e0() {
        this.f284713q.e();
        this.f284710n = null;
    }

    public final void g() {
        List<? extends SocialItem> list = this.f284714r;
        this.f284712p.b(com.avito.android.analytics.screens.utils.D.a(list != null ? io.reactivex.rxjava3.core.I.q(list) : new C42023v(this.f284697a.b().S().s(this.f284707k.e()).j(new D(this)), new C35051s(this, 1)).r(new E(this)), this.f284709m, "socialInfoAttempt", new b(), new c(), 16));
    }

    @Override // com.avito.android.social_management.r
    public final void i0() {
        SocialManagementActivity socialManagementActivity = this.f284711o;
        if (socialManagementActivity != null) {
            socialManagementActivity.setResult(this.f284716t ? -1 : 0);
            Intent intent = socialManagementActivity.f304538c;
            if (intent != null) {
                socialManagementActivity.startActivity(intent);
            }
            socialManagementActivity.finish();
        }
    }
}
