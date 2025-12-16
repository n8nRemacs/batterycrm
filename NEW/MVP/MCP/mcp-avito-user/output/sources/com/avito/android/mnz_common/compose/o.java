package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.internal.C22096n;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzNavBar.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/akita/compose/component/navbar/i;", "Lkotlin/G0;", "invoke", "(Lcom/akita/compose/component/navbar/i;Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class o extends N implements Y41.q<com.akita.compose.component.navbar.i, androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f197925l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C22096n f197926m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C22096n c22096n, boolean z12) {
        super(3);
        this.f197925l = z12;
        this.f197926m = c22096n;
    }

    @Override // Y41.q
    public final G0 invoke(com.akita.compose.component.navbar.i iVar, androidx.compose.runtime.A a12, Integer num) {
        C22096n c22096n;
        com.akita.compose.component.navbar.i iVar2 = iVar;
        androidx.compose.runtime.A a13 = a12;
        int iIntValue = num.intValue();
        if ((iIntValue & 14) == 0) {
            iIntValue |= a13.B(iVar2) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && a13.c()) {
            a13.f();
        } else if (this.f197925l && (c22096n = this.f197926m) != null) {
            c22096n.invoke(iVar2, a13, Integer.valueOf(iIntValue & 14));
        }
        return G0.f406611a;
    }
}
