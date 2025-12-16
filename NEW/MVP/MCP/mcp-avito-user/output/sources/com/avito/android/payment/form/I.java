package com.avito.android.payment.form;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PaymentGenericFormView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class I extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ J f214323l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(J j12) {
        super(0);
        this.f214323l = j12;
    }

    @Override // Y41.a
    public final G0 invoke() {
        com.jakewharton.rxrelay3.c<G0> cVar = this.f214323l.f214329e;
        G0 g02 = G0.f406611a;
        cVar.accept(g02);
        return g02;
    }
}
