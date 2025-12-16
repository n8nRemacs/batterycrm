package com.avito.android.payment.lib;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentMethodsView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class s extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33021f f214692l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PaymentStatusResult.PaymentStatus f214693m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f214694n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(C33021f c33021f, PaymentStatusResult.PaymentStatus paymentStatus, boolean z12) {
        super(0);
        this.f214692l = c33021f;
        this.f214693m = paymentStatus;
        this.f214694n = z12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f214692l.f214672s.accept(new C33016a(this.f214693m, this.f214694n));
        return G0.f406611a;
    }
}
