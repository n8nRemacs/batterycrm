package com.avito.android.navigation.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.S;
import androidx.compose.runtime.internal.r;
import androidx.view.AbstractC23301M0;
import androidx.view.C23404y0;
import androidx.view.compose.C23358x;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: BaseNavActivity.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f207195l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar) {
        super(2);
        this.f207195l = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            C23404y0 c23404y0B = C23358x.b(new AbstractC23301M0[0], a13);
            d dVar = this.f207195l;
            dVar.f207196m = c23404y0B;
            S.a(com.avito.android.lib.compose.design.shared.navigation.b.f177675a.b(c23404y0B), r.c(-629929470, new b(c23404y0B, dVar), a13), a13, 56);
        }
        return G0.f406611a;
    }
}
