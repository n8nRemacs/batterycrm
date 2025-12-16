package com.avito.android.payment.lib;

import android.content.DialogInterface;
import com.avito.android.remote.model.payment.status.PaymentStatusResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: PaymentMethodsView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/content/DialogInterface;", "it", "Lkotlin/G0;", "invoke", "(Landroid/content/DialogInterface;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class r extends N implements Y41.l<DialogInterface, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C33021f f214689l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ PaymentStatusResult.PaymentStatus f214690m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f214691n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C33021f c33021f, PaymentStatusResult.PaymentStatus paymentStatus, boolean z12) {
        super(1);
        this.f214689l = c33021f;
        this.f214690m = paymentStatus;
        this.f214691n = z12;
    }

    @Override // Y41.l
    public final G0 invoke(DialogInterface dialogInterface) {
        this.f214689l.f214672s.accept(new C33016a(this.f214690m, this.f214691n));
        return G0.f406611a;
    }
}
