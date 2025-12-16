package ED;

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

/* compiled from: HomeFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LED/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_home"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class a extends A0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f3880g;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f3881b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f3882c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f3883d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f3884e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f3885f;

    static {
        h0 h0Var = new h0(a.class, "executePendingTransactionsResearch", "getExecutePendingTransactionsResearch()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f3880g = new n[]{n0Var.i(h0Var), C0.k(a.class, "gigUxFeedbackOnMain", "getGigUxFeedbackOnMain()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "openAppAtTabFromNotificationAb", "getOpenAppAtTabFromNotificationAb()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "recsReloadButton", "getRecsReloadButton()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "recsReloadButtonMode", "getRecsReloadButtonMode()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210440R0;
        Boolean bool = Boolean.TRUE;
        this.f3881b = A0.u(this, "Рубильник для записи логов в рамках ислледования бага MA-2652", "ma_executeTransactionsResearch", bool, false, 0, owners, 56);
        this.f3882c = A0.u(this, "Показ uxFeedback на СЕРПе подработки", "gigUxFeedbackOnMain", bool, false, 0, Owners.f210525p0, 56);
        this.f3883d = A0.u(this, "АБ Открываем приложение на вкладке мессенджера по параметру из пуша", "openAppAtTabFromNotificationAb", bool, false, 0, Owners.f210393B3, 56);
        Owners owners2 = Owners.f210497i0;
        this.f3884e = A0.u(this, "Кнопка перезагрузки рекоммендаций на главной", "recsReloadButton", bool, false, 0, owners2, 56);
        this.f3885f = A0.u(this, "Кнопка перезагрузки рекоммендаций на главной. Переключатель групп", "recsReloadButtonMode", new OptionSet("none", C42745f0.U("none", "control", "test")), false, 0, owners2, 40);
    }
}
