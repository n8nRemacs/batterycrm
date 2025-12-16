package hE;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: SoccomFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LhE/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_soccom"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class b extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f397121d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f397122b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f397123c;

    static {
        h0 h0Var = new h0(b.class, "showUxFeedbackForFeed", "getShowUxFeedbackForFeed()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f397121d = new n[]{n0Var.i(h0Var), C0.k(b.class, "showUxFeedbackForGroups", "getShowUxFeedbackForGroups()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "mixedGroupsFavTest", "getMixedGroupsFavTest()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "mixedGroupsMainTest", "getMixedGroupsMainTest()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "thematicGroupsFavTest", "getThematicGroupsFavTest()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "thematicGroupsMainTest", "getThematicGroupsMainTest()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public b() {
        Owners owners = Owners.f210394C;
        Boolean bool = Boolean.FALSE;
        A0.u(this, "Показывать/не показывать UXFeedback после просмотра ленты", "exps_showUxFeedbackForFeed", bool, false, 0, owners, 56);
        A0.u(this, "Показывать/не показывать UXFeedback после просмотра группы", "exps_showUxFeedbackForGroups", bool, false, 0, owners, 56);
        this.f397122b = A0.u(this, "АБ-тест локальных и тематических групп в избранном", "exps_mixedGroupsFavTest", bool, false, 0, owners, 56);
        A0.u(this, "АБ-тест локальных и тематических групп на главной", "exps_mixedGroupsMainTest", bool, false, 0, owners, 56);
        this.f397123c = A0.u(this, "АБ-тест тематических групп в избранном", "exps_thematicGroupsFavTest", bool, false, 0, owners, 56);
        A0.u(this, "АБ-тест тематических групп на главной", "exps_thematicGroupsMainTest", bool, false, 0, owners, 56);
    }
}
