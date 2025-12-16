package com.avito.android.free_delivery;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class g extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FreeDeliveryActivity f158698l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f158699m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ FreeDeliveryLink f158700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FreeDeliveryActivity freeDeliveryActivity, boolean z12, FreeDeliveryLink freeDeliveryLink) {
        super(2);
        this.f158698l = freeDeliveryActivity;
        this.f158699m = z12;
        this.f158700n = freeDeliveryLink;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            FreeDeliveryActivity freeDeliveryActivity = this.f158698l;
            com.avito.android.analytics.screens.compose.q.b((com.avito.android.analytics.screens.compose.a) freeDeliveryActivity.f158640p.getValue(), androidx.compose.runtime.internal.r.c(-1003566573, new f(freeDeliveryActivity, this.f158699m, this.f158700n), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
