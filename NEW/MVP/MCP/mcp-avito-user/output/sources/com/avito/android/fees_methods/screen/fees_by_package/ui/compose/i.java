package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FeesByPackageScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class i extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState f158107l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<FE.b> f158108m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f158109n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FE.a, G0> f158110o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f158111p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ v f158112q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(FeesByPackageState feesByPackageState, InterfaceC43160i interfaceC43160i, Y41.a aVar, Y41.l lVar, Y41.l lVar2, v vVar, int i12) {
        super(2);
        this.f158107l = feesByPackageState;
        this.f158108m = interfaceC43160i;
        this.f158109n = aVar;
        this.f158110o = lVar;
        this.f158111p = lVar2;
        this.f158112q = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(65);
        Y41.a<G0> aVar = this.f158109n;
        Y41.l<FE.a, G0> lVar = this.f158110o;
        k.a(this.f158107l, this.f158108m, aVar, lVar, this.f158111p, a12, iA2);
        return G0.f406611a;
    }
}
