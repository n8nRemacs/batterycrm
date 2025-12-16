package com.avito.android.payment.lib;

import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PaymentMethodsViewModel.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/payment/lib/a;", "", "_avito_payment-lib_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.payment.lib.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C33016a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final PaymentStatusResult.PaymentStatus f214563a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f214564b;

    public C33016a(@Y61.l PaymentStatusResult.PaymentStatus paymentStatus, boolean z12) {
        this.f214563a = paymentStatus;
        this.f214564b = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C33016a)) {
            return false;
        }
        C33016a c33016a = (C33016a) obj;
        return L.f(this.f214563a, c33016a.f214563a) && this.f214564b == c33016a.f214564b;
    }

    public final int hashCode() {
        PaymentStatusResult.PaymentStatus paymentStatus = this.f214563a;
        return Boolean.hashCode(this.f214564b) + ((paymentStatus == null ? 0 : paymentStatus.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DialogCloseResult(paymentResult=");
        sb2.append(this.f214563a);
        sb2.append(", shouldCloseActivity=");
        return androidx.appcompat.app.r.x(sb2, this.f214564b, ')');
    }
}
