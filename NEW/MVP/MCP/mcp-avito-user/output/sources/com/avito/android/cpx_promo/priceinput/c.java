package com.avito.android.cpx_promo.priceinput;

import Y41.p;
import androidx.compose.runtime.A;
import com.avito.android.cpx_promo.v2.compose.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CpxPromoPriceInputFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes12.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ a.C3789a f127294l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a.C3789a c3789a) {
        super(2);
        this.f127294l = c3789a;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            com.avito.android.cpx_promo.v2.compose.b.a(this.f127294l, null, a13, 0, 2);
        }
        return G0.f406611a;
    }
}
