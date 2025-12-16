package Rj;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: BottomNavigationFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRj/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_bottom-navigation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Rj.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C15047a extends A0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f14573m;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f14574b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f14575c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f14576d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f14577e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f14578f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f14579g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f14580h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final A0.a f14581i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final A0.a f14582j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final A0.a f14583k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final A0.a f14584l;

    static {
        h0 h0Var = new h0(C15047a.class, "redesignNoLabelNavbar", "getRedesignNoLabelNavbar()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f14573m = new n[]{n0Var.i(h0Var), C0.k(C15047a.class, "redesignNoLabelNavbarMode", "getRedesignNoLabelNavbarMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "aiAssistantTab", "getAiAssistantTab()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "aiAssistantTabMode", "getAiAssistantTabMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "avitoBusiness360NavbarMode", "getAvitoBusiness360NavbarMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "business360NavbarForceDisable", "getBusiness360NavbarForceDisable()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "business360NavbarForceEnable", "getBusiness360NavbarForceEnable()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "business360NavbarEdgeToEdge", "getBusiness360NavbarEdgeToEdge()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "business360NavbarOnboarding", "getBusiness360NavbarOnboarding()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "business360NavbarCartCounter", "getBusiness360NavbarCartCounter()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C15047a.class, "publishFromTabBar", "getPublishFromTabBar()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C15047a() {
        Owners owners = Owners.f210493h0;
        Boolean bool = Boolean.TRUE;
        this.f14574b = A0.u(this, "Редизайн навбара без заголовков", "redesign_no_label_navbar", bool, false, 0, owners, 56);
        this.f14575c = A0.u(this, "Редизайн навбара без заголовков. Переключатель групп", "redesign_no_label_navbar_mode", new OptionSet("none", C42745f0.U("none", "control", "test")), false, 0, owners, 40);
        this.f14576d = A0.u(this, "Редизайн навбара, таб AI ассистента", "ai_assistant_tab", bool, false, 0, owners, 56);
        this.f14577e = A0.u(this, "Редизайн навбара, таб AI ассистента. Переключатель групп", "ai_assistant_tab_mode", new OptionSet("none", C42745f0.U("none", "control", "test")), false, 0, owners, 40);
        OptionSet optionSet = new OptionSet("none", C42745f0.U("none", "control", "test"));
        Owners owners2 = Owners.f210550w;
        this.f14578f = A0.u(this, "Авито Бизнес 360, Navbar. Переключатель групп", "avito_business360_navbar_mode", optionSet, false, 0, owners2, 40);
        Boolean bool2 = Boolean.FALSE;
        this.f14579g = A0.u(this, "Force отключение навбара в Бизнес360", "business360_navbar_force_disable", bool2, false, 0, owners2, 56);
        this.f14580h = A0.u(this, "Force включение навбара в Бизнес360", "business360_navbar_force_enable", bool2, false, 0, owners2, 56);
        this.f14581i = A0.u(this, "Навбар Бизнес360 с EdgeToEdge (Android 15+)", "business360_navbar_edge_to_edge", bool, false, 0, owners2, 56);
        this.f14582j = A0.u(this, "Включение онбординга иконки 'стрелка назад' в навбаре Бизнес360", "business360_navbar_onboarding", bool, false, 0, owners2, 56);
        this.f14583k = A0.u(this, "Включение каунтера и точки на иконке корзины в навбаре Бизнес360", "business360_navbar_cart_counter", bool, false, 0, owners2, 56);
        this.f14584l = A0.u(this, "Замена таба Мои объявления на Разместить объявление в глобал-сборках", "publish_tab_bar_for_global", bool2, false, 0, Owners.f210456W2, 56);
    }
}
