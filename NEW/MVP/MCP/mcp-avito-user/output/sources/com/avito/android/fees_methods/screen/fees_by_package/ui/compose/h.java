package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.A;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.v;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageScreen.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v f158103l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState f158104m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158105n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f158106o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(v vVar, FeesByPackageState feesByPackageState, InterfaceC22204y1 interfaceC22204y1, InterfaceC22204y1 interfaceC22204y12) {
        super(2);
        this.f158103l = vVar;
        this.f158104m = feesByPackageState;
        this.f158105n = interfaceC22204y1;
        this.f158106o = interfaceC22204y12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            v vVarD0 = this.f158103l.d0(C20588k2.f28682c);
            InterfaceC22204y1 interfaceC22204y1 = this.f158105n;
            FeesByPackageState feesByPackageState = this.f158104m;
            com.akita.compose.component.scaffold.g.a(vVarD0, r.c(-1097148514, new c(feesByPackageState, interfaceC22204y1), a13), r.c(-324106563, new d(feesByPackageState, interfaceC22204y1), a13), null, null, null, null, r.c(-496741643, new g(feesByPackageState, interfaceC22204y1, this.f158106o), a13), a13, 12583344, 120);
        }
        return G0.f406611a;
    }
}
