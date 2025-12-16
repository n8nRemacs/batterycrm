package gD;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: ProfileFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LgD/f;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class f extends A0 {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f396389r;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f396390b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f396391c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f396392d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f396393e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f396394f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f396395g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f396396h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f396397i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f396398j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f396399k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final A0.a f396400l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A0.a f396401m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A0.a f396402n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final A0.a f396403o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final A0.a f396404p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final A0.a f396405q;

    static {
        h0 h0Var = new h0(f.class, "premierPartnerEntryInProfile", "getPremierPartnerEntryInProfile()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f396389r = new n[]{n0Var.i(h0Var), C0.k(f.class, "mortgageAccountEntryInProfile", "getMortgageAccountEntryInProfile()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "mortgageApplicationEntryInProfile", "getMortgageApplicationEntryInProfile()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "virtualDealRoomEntryInProfile", "getVirtualDealRoomEntryInProfile()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "callsEntryInProfile", "getCallsEntryInProfile()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "callTrackingCounter", "getCallTrackingCounter()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "extendedProfileScreenWithTabs", "getExtendedProfileScreenWithTabs()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "extendedProfileNotifyHasFloatingBlockForTabs", "getExtendedProfileNotifyHasFloatingBlockForTabs()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "extendedProfileUniversalWidgetGracefulDegradation", "getExtendedProfileUniversalWidgetGracefulDegradation()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "profileHostFragment", "getProfileHostFragment()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "avitoFinanceItem", "getAvitoFinanceItem()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "showAgentAdditionalWidgets", "getShowAgentAdditionalWidgets()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "useAvitoFinanceDynamicWidget", "getUseAvitoFinanceDynamicWidget()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "showProfileAvitoForPrivateUsersUxFeedback", "getShowProfileAvitoForPrivateUsersUxFeedback()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "business360Logout", "getBusiness360Logout()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "changeWayOpenHomeScreenAfterLogout", "getChangeWayOpenHomeScreenAfterLogout()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(f.class, "wrapGetProfileForGlobal", "getWrapGetProfileForGlobal()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public f() {
        Owners owners = Owners.f210526p1;
        Boolean bool = Boolean.TRUE;
        A0.u(this, "Показываем точку входа на экран Заявок Авито Про", "premierPartnerEntryInProfile", bool, false, 0, owners, 56);
        this.f396390b = A0.u(this, "Показываем точку входа на экран Ипотека-центра", "mortgageAccountEntryInProfile", bool, false, 0, Owners.f210534r1, 56);
        this.f396391c = A0.u(this, "REAL-46078: Добавить точку входа в профиле на ипотечную анкету", "mortgageApplicationEntryInProfile", bool, false, 0, owners, 56);
        this.f396392d = A0.u(this, "Точка входа в виртуальный кабинет сделки в профиле", "virtualDealRoomEntryInProfile", bool, false, 0, owners, 56);
        Owners owners2 = Owners.f210442S;
        Boolean bool2 = Boolean.FALSE;
        this.f396393e = A0.u(this, "Показывем точку входа на экран звонков в профиле", "callsEntryInProfile", bool2, false, 0, owners2, 56);
        this.f396394f = A0.u(this, "Отображение каунтера пропущенных звонков на табе профиля", "callTrackingCounter", bool2, false, 0, owners2, 56);
        Owners owners3 = Owners.f210540t;
        this.f396395g = A0.u(this, "Открывать экраны профиля в окне с табами", "extendedProfileScreenWithTabs", bool2, false, 0, owners3, 56);
        this.f396396h = A0.u(this, "Уведомлять фрагмент с табами о наличии плавающих кнопок", "extendedProfileNotifyHasFloatingBlockForTabs", bool2, false, 0, owners3, 56);
        this.f396397i = A0.u(this, "Graceful degradation для универсального виджета", "extendedProfileUniversalWidgetGracefulDegradation", bool2, false, 0, owners3, 56);
        this.f396398j = A0.u(this, "Открытие профиля в родительском фрагменте", "profileHostFragment", bool, false, 0, Owners.f210494h1, 56);
        this.f396399k = A0.u(this, "Показывать виджет Avito Finance, когда он доступен", "avitoFinanceItem", bool, false, 0, Owners.f210509l0, 56);
        this.f396400l = A0.u(this, "Показываем дополнительные виджеты для агента", "showAgentAdditionalFields", bool, false, 0, owners, 56);
        this.f396401m = A0.u(this, "Показываем динамический виджет Авито Финанс", "useAvitoFinanceDynamicWidget", bool2, false, 0, Owners.f210458X0, 56);
        this.f396402n = A0.u(this, "Показываем uxfeedback при открытии профиля для частных пользователей", "showProfileAvitoForPrivateUsersUxFeedback", bool, false, 0, Owners.f210477d0, 56);
        this.f396403o = A0.u(this, "Перезапуск приложения с Главной Авито при логауте из спейса Бизнес360", "business360Logout", bool, false, 0, Owners.f210550w, 56);
        Owners owners4 = Owners.f210390A3;
        this.f396404p = A0.u(this, "После логаута переоткрываем главную через singleTop", "changeWayOpenHomeScreenAfterLogout", bool, false, 0, owners4, 56);
        this.f396405q = A0.u(this, "Замена запроса 4/profile на 1/global/profile/userInfo для глобал сборок", "wrapGetProfileForGlobal", bool, false, 0, owners4, 56);
    }
}
