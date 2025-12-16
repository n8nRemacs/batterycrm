package KO;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: JetFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LKO/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_jet-features_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends A0 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f9442h;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f9443b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f9444c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f9445d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f9446e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f9447f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f9448g;

    static {
        h0 h0Var = new h0(a.class, "jetCompetitorAnalyticsItem", "getJetCompetitorAnalyticsItem()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f9442h = new n[]{n0Var.i(h0Var), C0.k(a.class, "jetSearchPositionCompose", "getJetSearchPositionCompose()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "jetCompetitorsPositionInSearch", "getJetCompetitorsPositionInSearch()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "jetSortPositionInSearch", "getJetSortPositionInSearch()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "jetChartsInCompetitorAnalytics", "getJetChartsInCompetitorAnalytics()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "jetNewSuggestsInCompetitorAnalytics", "getJetNewSuggestsInCompetitorAnalytics()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210549v3;
        Boolean bool = Boolean.TRUE;
        this.f9443b = A0.u(this, "Показ кнопки входа в Конкурентную аналитику, на экране моего объявления", "jetCompetitorAnalyticsItem", bool, false, 0, owners, 56);
        Boolean bool2 = Boolean.FALSE;
        this.f9444c = A0.u(this, "Переход фичи \"Позиция в поиске\" на Compose", "jetSearchPositionCompose", bool2, false, 0, owners, 56);
        this.f9445d = A0.u(this, "Показ блока конкурентов на шторке Позиции в поиске", "jetCompetitorsPositionInSearch", bool, false, 0, owners, 56);
        this.f9446e = A0.u(this, "Показ блока сортировки на шторке Позиции в поиске", "jetSortPositionInSearch", bool2, false, 0, owners, 56);
        this.f9447f = A0.u(this, "Показ графиков на экране Конкурентной аналитики", "jetChartsInCompetitorAnalytics", bool2, false, 0, owners, 56);
        this.f9448g = A0.u(this, "Новые подсказки на экране Конкурентной аналитики", "jetNewSuggestsInCompetitorAnalytics", bool2, false, 0, owners, 56);
    }
}
