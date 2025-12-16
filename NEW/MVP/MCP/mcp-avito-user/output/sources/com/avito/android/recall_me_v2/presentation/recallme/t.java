package com.avito.android.recall_me_v2.presentation.recallme;

import Di0.AbstractC13405c;
import Di0.InterfaceC13403a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.runtime.A;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecallMeScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f252219l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC13403a, G0> f252220m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AbstractC13405c f252221n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f252222o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public t(com.akita.compose.component.toast_bar.u uVar, Y41.l<? super InterfaceC13403a, G0> lVar, AbstractC13405c abstractC13405c, com.avito.android.analytics.screens.mvi.r rVar) {
        super(2);
        this.f252219l = uVar;
        this.f252220m = lVar;
        this.f252221n = abstractC13405c;
        this.f252222o = rVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v.a aVar = androidx.compose.ui.v.f42878y1;
            FillElement fillElement = C20588k2.f28682c;
            aVar.getClass();
            Y41.l<InterfaceC13403a, G0> lVar = this.f252220m;
            com.akita.compose.component.scaffold.g.a(fillElement, androidx.compose.runtime.internal.r.c(1131338297, new q(lVar), a13), null, this.f252219l, null, null, null, androidx.compose.runtime.internal.r.c(1644257872, new s(this.f252221n, lVar, this.f252222o), a13), a13, 12582966, 116);
        }
        return G0.f406611a;
    }
}
