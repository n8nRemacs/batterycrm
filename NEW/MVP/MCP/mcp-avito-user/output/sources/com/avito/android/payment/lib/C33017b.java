package com.avito.android.payment.lib;

import A60.a;
import Ju.InterfaceC14249c;
import kotlin.Metadata;
import kv.C43501a;

/* compiled from: PaymentActivity.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "accept", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.payment.lib.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C33017b<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PaymentActivity f214565b;

    public C33017b(PaymentActivity paymentActivity) {
        this.f214565b = paymentActivity;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        InterfaceC14249c interfaceC14249c = ((C43501a) obj).f413261b;
        if (interfaceC14249c instanceof a.C0007a) {
            t tVar = this.f214565b.f214534m;
            if (tVar == null) {
                tVar = null;
            }
            tVar.f214724l0.accept(((a.C0007a) interfaceC14249c).f104b);
        }
    }
}
