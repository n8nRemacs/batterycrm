package W20;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: NavigationConfigFeatures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW20/a;", "Lcom/avito/android/A0;", "_avito_navigation-config_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a extends A0 {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f17716j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f17717b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f17718c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f17719d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f17720e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f17721f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f17722g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f17723h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final A0.a f17724i;

    static {
        h0 h0Var = new h0(a.class, "alternativeMainBusiness360", "getAlternativeMainBusiness360()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f17716j = new n[]{n0Var.i(h0Var), C0.k(a.class, "replaceMainUpdateNavigationConfigBeforeHomeActivityCreated", "getReplaceMainUpdateNavigationConfigBeforeHomeActivityCreated()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "showReplaceMainOnboarding", "getShowReplaceMainOnboarding()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "showReplaceMainToast", "getShowReplaceMainToast()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "alternativeMainAvitoNavigationIcon", "getAlternativeMainAvitoNavigationIcon()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "alternativeMainSettingsToggle", "getAlternativeMainSettingsToggle()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "replaceMainPageWidget", "getReplaceMainPageWidget()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "replaceMainExitOnboarding", "getReplaceMainExitOnboarding()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a(@k InterfaceC35950u interfaceC35950u) {
        boolean z12 = !interfaceC35950u.l();
        Owners owners = Owners.f210550w;
        this.f17717b = A0.u(this, "Альтернативная Главная при старте приложения (Бизнес360)", "alternativeMainBusiness360", Boolean.valueOf(z12), false, 0, owners, 56);
        Boolean bool = Boolean.TRUE;
        this.f17718c = A0.u(this, "Обновление конфига замены главной перед созданием HomeActivity", "replaceMainUpdateNavigationConfigBeforeHomeActivityCreated", bool, false, 0, owners, 56);
        this.f17719d = A0.u(this, "Показ онбординга замены главной на Б360", "showReplaceMainOnboarding", bool, false, 0, owners, 56);
        this.f17720e = A0.u(this, "Показ тоста после замены главной на Б360", "showReplaceMainToast", bool, false, 0, owners, 56);
        this.f17721f = A0.u(this, "Иконка выхода на Главной Авито при Бизнес360 по дефолту", "alternativeMainAvitoNavigationIcon", bool, false, 0, owners, 56);
        this.f17722g = A0.u(this, "Тогл замены главной в настройках", "alternativeMainSettingsToggle", bool, false, 0, owners, 56);
        this.f17723h = A0.u(this, "Отображение виджета замены главной в спейсе Б360", "replaceMainPageWidget", bool, false, 0, owners, 56);
        this.f17724i = A0.u(this, "Онбординг стрелки выхода на Главной Авито при Бизнес360 по дефолту", "replaceMainExitOnboarding", bool, false, 0, owners, 56);
    }
}
