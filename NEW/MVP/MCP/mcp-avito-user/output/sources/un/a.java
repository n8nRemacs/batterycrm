package UN;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: InstallmentsFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUN/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_installments_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f16363d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f16364b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f16365c;

    static {
        h0 h0Var = new h0(a.class, "showPostMessageDialog", "getShowPostMessageDialog()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f16363d = new n[]{n0Var.i(h0Var), C0.k(a.class, "animateInstallmentsStickyBlock", "getAnimateInstallmentsStickyBlock()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210505k0;
        this.f16364b = A0.u(this, "Отображать постмесседжи в кредитной анкете партнера", "installmentsPostMessageDialog", Boolean.FALSE, false, 0, owners, 40);
        this.f16365c = A0.u(this, "Использовать анимацию в блоке закрепа рассрочек на карточке товара", "installmentsAnimateStickyBlock", Boolean.TRUE, true, 0, owners, 40);
    }
}
