package nE;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: UserAdvertsFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LnE/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_user-adverts"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: nE.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C44240b extends A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f414940f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f414941b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f414942c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f414943d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f414944e;

    static {
        h0 h0Var = new h0(C44240b.class, "showAppRater", "getShowAppRater()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f414940f = new n[]{n0Var.i(h0Var), C0.k(C44240b.class, "userAdvertsMultiItemGroupOnboarding", "getUserAdvertsMultiItemGroupOnboarding()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44240b.class, "userAdvertsShowPromoHubBadge", "getUserAdvertsShowPromoHubBadge()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C44240b.class, "userAdvertsUseHostRenderer", "getUserAdvertsUseHostRenderer()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C44240b() {
        Owners owners = Owners.f210494h1;
        Boolean bool = Boolean.FALSE;
        this.f414941b = A0.u(this, "Запрашивать оценку приложения у пользователя", "showAppRater", bool, true, 0, owners, 40);
        this.f414942c = A0.u(this, "Онбординг селлера для точки входа на листинг", "st_user_adverts_multi_item_group_onboarding", bool, false, 0, Owners.f210448U, 56);
        this.f414943d = A0.u(this, "Показывать бейдж на плитке промохаба", "userAdvertsShowPromoHubBadge", bool, false, 0, Owners.f210392B0, 56);
        this.f414944e = A0.u(this, "Используем HostRenderer в разделе \"Мои объявления\"", "st_user_adverts_use_view_pager_2_renderer", Boolean.TRUE, false, 0, Owners.f210450U2, 56);
    }

    @k
    public final DE0.a<Boolean> v() {
        n<Object> nVar = f414940f[3];
        return this.f414944e.a();
    }
}
