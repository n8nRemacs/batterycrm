package wI;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: HomeActiveOrdersFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LwI/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C49514a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f441365d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f441366b = A0.u(this, "Обновление блока активных заказов на главной (BxContentFRagment) с использованием клиентской шины данных", "bxContentFragmentActiveOrdersUseClientEventBus", Boolean.FALSE, false, 0, Owners.f210421K0, 56);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f441367c = A0.u(this, "Выполнять принудительное обновление списка активных заказов по таймауту на главной (BxContentFRagment)", "bxContentFragmentActiveOrdersClientEventBusForceUpdate", Boolean.TRUE, false, 0, Owners.f210418J0, 56);

    static {
        h0 h0Var = new h0(C49514a.class, "bxContentFragmentActiveOrdersUseClientEventBus", "getBxContentFragmentActiveOrdersUseClientEventBus()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f441365d = new n[]{n0Var.i(h0Var), C0.k(C49514a.class, "bxContentFragmentActiveOrdersClientEventBusForceUpdate", "getBxContentFragmentActiveOrdersClientEventBusForceUpdate()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }
}
