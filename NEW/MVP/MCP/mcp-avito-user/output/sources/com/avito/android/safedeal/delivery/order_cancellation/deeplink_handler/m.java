package com.avito.android.safedeal.delivery.order_cancellation.deeplink_handler;

import android.content.DialogInterface;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: DeliveryOrderCancelDialogNavigator.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class m extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ DialogInterface f256144l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f256145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Y41.a aVar, DialogInterface dialogInterface) {
        super(0);
        this.f256144l = dialogInterface;
        this.f256145m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f256144l.dismiss();
        this.f256145m.invoke();
        return G0.f406611a;
    }
}
