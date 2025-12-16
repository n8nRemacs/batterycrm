package yG0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: TransactionFeatures.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LyG0/a;", "Lcom/avito/android/A0;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yG0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C50113a extends A0 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f443005d;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f443006b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f443007c;

    static {
        h0 h0Var = new h0(C50113a.class, "clearEngineStateAfterTransactionReload", "getClearEngineStateAfterTransactionReload()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f443005d = new n[]{n0Var.i(h0Var), C0.k(C50113a.class, "enableUniversalTransactionDebugMode", "getEnableUniversalTransactionDebugMode()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    @Inject
    public C50113a(@k InterfaceC35950u interfaceC35950u) {
        Owners owners = Owners.f210399D3;
        this.f443006b = A0.u(this, "Очистка состояния сценария при перезагрузке сценария", "clearEngineStateAfterTransactionReload", Boolean.TRUE, false, 0, owners, 56);
        this.f443007c = A0.u(this, "Показывать дебаг меню для универсальной страницы транзакции", "enableUniversalTransactionDebugMode", C0.d(interfaceC35950u, false), false, 0, owners, 40);
    }
}
