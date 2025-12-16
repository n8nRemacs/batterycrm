package com.avito.android.position_in_search.stats.screen.position_in_search.ui;

import kotlin.G0;
import kotlin.Metadata;

/* compiled from: PositionInSearchNavBar.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class F extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ c90.c f221590l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(c90.c cVar) {
        super(2);
        this.f221590l = cVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        androidx.compose.runtime.A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            c90.c cVar = this.f221590l;
            D.a(cVar.f57706b, cVar.f57707c, cVar.f57715k, cVar.f57716l, null, a13, 0);
        }
        return G0.f406611a;
    }
}
