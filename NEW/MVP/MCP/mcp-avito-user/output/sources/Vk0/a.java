package VK0;

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

/* compiled from: UxFeedbackFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LVK0/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_ux-feedback_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public class a extends A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f17075f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f17076b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f17077c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f17078d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f17079e;

    static {
        h0 h0Var = new h0(a.class, "uxFeedbackServiceKey", "getUxFeedbackServiceKey()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f17075f = new n[]{n0Var.i(h0Var), C0.k(a.class, "uxFeedbackEnabler", "getUxFeedbackEnabler()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "uxFeedbackSendUserId", "getUxFeedbackSendUserId()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "uxFeedbackLogger", "getUxFeedbackLogger()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        OptionSet optionSet = new OptionSet("prod", C42745f0.U("prod", "test"));
        Owners owners = Owners.f210391B;
        this.f17076b = A0.u(this, "Переключение используемых ключей для работы с UxFeedback", "uxfeedback_service_key", optionSet, false, 0, owners, 40);
        Boolean bool = Boolean.TRUE;
        this.f17077c = A0.u(this, "Использование библиотеки UxFeedback для опросов", "uxfeedback_enableLibInApp", bool, false, 0, owners, 56);
        this.f17078d = A0.u(this, "Временно продолжаем отправлять userId в UX feedback в открытом виде, параллельно отправляя и hashUserId, после переходного периода следует спилить отправку userId, а данный тогл отключить", "uxfeedback_send_user_id", bool, false, 0, owners, 56);
        this.f17079e = A0.u(this, "Логировать вызовы методов startCampaign", "uxfeedback_logger", Boolean.FALSE, false, 0, owners, 40);
    }
}
