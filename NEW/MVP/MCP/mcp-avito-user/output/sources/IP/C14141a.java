package Ip;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: PremierPartnerFeatures.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LIp/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Ip.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C14141a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f8546e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f8547b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f8548c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f8549d;

    static {
        h0 h0Var = new h0(C14141a.class, "showDigitalRegistrationWidget", "getShowDigitalRegistrationWidget()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f8546e = new n[]{n0Var.i(h0Var), C0.k(C14141a.class, "comfortableDealVdrRedirect", "getComfortableDealVdrRedirect()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C14141a.class, "showCompletionBanner", "getShowCompletionBanner()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C14141a() {
        Owners owners = Owners.f210526p1;
        Boolean bool = Boolean.TRUE;
        this.f8547b = A0.u(this, "Включает показ баннера электронной регистрации на экране агента в комфортной сделке", "showDigitalRegistrationWidget", bool, false, 0, owners, 56);
        this.f8548c = A0.u(this, "TRXVAS-2773: Редирект в VDR для диплинка 1/comfortable-deal/clients", "comfortableDealVdrRedirect", Boolean.FALSE, false, 0, owners, 56);
        this.f8549d = A0.u(this, "Показывать баннер `Поздравляем с продажей`", "showCompletionBanner", bool, false, 0, owners, 56);
    }
}
