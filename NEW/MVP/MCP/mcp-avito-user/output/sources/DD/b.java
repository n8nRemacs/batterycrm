package dD;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: OrderFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LdD/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_order_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b extends A0 {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f393739f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f393740b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f393741c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f393742d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f393743e;

    static {
        h0 h0Var = new h0(b.class, "enableRedesignedOrderScreen", "getEnableRedesignedOrderScreen()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f393739f = new n[]{n0Var.i(h0Var), C0.k(b.class, "usePollingOnRedesignedOrderScreen", "getUsePollingOnRedesignedOrderScreen()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "orderTemplateVersion", "getOrderTemplateVersion()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(b.class, "clearEngineStateAfterOrderReload", "getClearEngineStateAfterOrderReload()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public b() {
        Owners owners = Owners.f210399D3;
        Boolean bool = Boolean.FALSE;
        this.f393740b = A0.u(this, "Включение работы диплинка на новый экран заказа", "enableRedesignedOrderScreen", bool, false, 0, owners, 56);
        this.f393741c = A0.u(this, "Использование полинга на новом экране заказа", "usePollingOnRedesignedOrderScreen", bool, false, 0, owners, 56);
        this.f393742d = A0.u(this, "Запрашиваемая версия шаблона для страницы заказа", "order_template_version", "", false, 0, owners, 40);
        this.f393743e = A0.u(this, "Очистка состояния сценария при перезагрузки сценария", "clearEngineStateAfterOrderReload", Boolean.TRUE, false, 0, owners, 56);
    }
}
