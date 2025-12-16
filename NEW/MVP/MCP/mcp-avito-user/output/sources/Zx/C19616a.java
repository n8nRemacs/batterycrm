package Zx;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: EasyMoneyFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LZx/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_easy-money-features_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Zx.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C19616a extends A0 {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f20576q;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f20577b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f20578c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f20579d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f20580e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f20581f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f20582g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f20583h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final A0.a f20584i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final A0.a f20585j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final A0.a f20586k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final A0.a f20587l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final A0.a f20588m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final A0.a f20589n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final A0.a f20590o;

    /* renamed from: p, reason: collision with root package name */
    @k
    public final A0.a f20591p;

    static {
        h0 h0Var = new h0(C19616a.class, "easyMoneyBBL3", "getEasyMoneyBBL3()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f20576q = new n[]{n0Var.i(h0Var), C0.k(C19616a.class, "easyMoneyVisualVasMvi", "getEasyMoneyVisualVasMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyCompetitiveVasMvi", "getEasyMoneyCompetitiveVasMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyAppliedServicesMvi", "getEasyMoneyAppliedServicesMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyBBLAdvert", "getEasyMoneyBBLAdvert()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyBbipWidget", "getEasyMoneyBbipWidget()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyStickersBuyMvi", "getEasyMoneyStickersBuyMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyBulkActivateNewUI", "getEasyMoneyBulkActivateNewUI()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyBBLContactHistory", "getEasyMoneyBBLContactHistory()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyStickersEditMvi", "getEasyMoneyStickersEditMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyCheckoutFreemium", "getEasyMoneyCheckoutFreemium()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyDiscountMvi", "getEasyMoneyDiscountMvi()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyBblConfigureV4", "getEasyMoneyBblConfigureV4()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyCpxPromoGeoTriggers", "getEasyMoneyCpxPromoGeoTriggers()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C19616a.class, "easyMoneyAdvertsCpxPromoWidget", "getEasyMoneyAdvertsCpxPromoWidget()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C19616a() {
        Owners owners = Owners.f210478d1;
        Boolean bool = Boolean.FALSE;
        this.f20577b = A0.u(this, "Показ неограниченных контактов на BBL Flow", "easyMoneyBBL3", bool, false, 0, owners, 56);
        this.f20578c = A0.u(this, "MVI версия экрана Visual Vas", "easyMoneyVisualVasMvi", bool, false, 0, owners, 56);
        this.f20579d = A0.u(this, "Показ экрана CompetitiveVas на MVI", "easyMoneyCompetitiveVasMvi", bool, false, 0, owners, 56);
        this.f20580e = A0.u(this, "MVI версия экрана Applied Services", "easyMoneyAppliedServicesMvi", bool, false, 0, owners, 56);
        this.f20581f = A0.u(this, "Отображение BBL в сниппетах и карточке", "easyMoneyBBLAdvert", bool, false, 0, owners, 56);
        this.f20582g = A0.u(this, "Виджет конкурентов на BBIP Private", "easyMoneyBbipWidget", bool, false, 0, owners, 56);
        this.f20583h = A0.u(this, "MVI версия экрана StickersBuy", "easyMoneyStickersBuyMvi", bool, false, 0, owners, 56);
        this.f20584i = A0.u(this, "Обновление UI экрана ProfileItemsActivateCpt", "easyMoneyBulkActivateNewUI", bool, false, 0, owners, 56);
        this.f20585j = A0.u(this, "Отображение истории контактов BBL в карточке", "easyMoneyBBLContactHistory", bool, false, 0, owners, 56);
        this.f20586k = A0.u(this, "MVI версия экрана StickersEdit", "easyMoneyStickersEditMvi", bool, false, 0, owners, 56);
        this.f20587l = A0.u(this, "Перевод экрана Checkout на поддержку Freemium", "easyMoneyCheckoutFreemium", bool, false, 0, owners, 56);
        this.f20588m = A0.u(this, "MVI версия экрана Vas Discount", "easyMoneyDiscountMvi", bool, false, 0, owners, 56);
        this.f20589n = A0.u(this, "BBL Configure V4 - Редизайн", "easyMoneyBblConfigureV4", bool, false, 0, owners, 56);
        this.f20590o = A0.u(this, "Триггеры в Cpx Promo Geo", "easyMoneyCpxPromoGeoTriggers", bool, false, 0, owners, 56);
        this.f20591p = A0.u(this, "Виджет со ставкой CPx Promo на сниппете объявления", "easyMoneyAdvertsCpxPromoWidget", bool, false, 0, owners, 56);
    }
}
