package com.avito.android.publish.free_delivery;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.compose.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FreeDeliveryFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FreeDeliveryFragment f235793l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f235794m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f235795n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(FreeDeliveryFragment freeDeliveryFragment, boolean z12, InterfaceC22204y1 interfaceC22204y1) {
        super(2);
        this.f235793l = freeDeliveryFragment;
        this.f235794m = z12;
        this.f235795n = interfaceC22204y1;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            FreeDeliveryFragment freeDeliveryFragment = this.f235793l;
            q.b((com.avito.android.analytics.screens.compose.a) freeDeliveryFragment.f235748s0.getValue(), r.c(-1451545252, new d(freeDeliveryFragment, this.f235794m, this.f235795n), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
