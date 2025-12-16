package com.avito.android.payment.processing;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.P2;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: PaymentGenericPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/processing/k;", "Lcom/avito/android/payment/processing/h;", "_avito_payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class k implements h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final z f214800a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deep_linking.x f214801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f214802c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f214803d = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public q f214804e;

    public k(@Y61.k f fVar, @Y61.k z zVar, @Y61.k com.avito.android.deep_linking.x xVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f214800a = zVar;
        this.f214801b = xVar;
        this.f214802c = interfaceC35745a5;
    }

    public static final void a(int i12, k kVar, String str, String str2) {
        io.reactivex.rxjava3.core.z<P2<PaymentStatusResult>> zVarA = kVar.f214800a.a(str);
        long jC2 = kotlin.math.b.c((float) Math.pow(2.0f, i12));
        TimeUnit timeUnit = TimeUnit.SECONDS;
        InterfaceC35745a5 interfaceC35745a5 = kVar.f214802c;
        kVar.f214803d.b(zVarA.z(jC2, timeUnit, interfaceC35745a5.c()).x0(interfaceC35745a5.a()).j0(interfaceC35745a5.e()).t0(new i(i12, kVar, str, str2)));
    }
}
