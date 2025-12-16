package com.avito.android.fees_methods.screen.fees_by_package.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class j extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState f158151l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f158152m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<FE.a, G0> f158153n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f158154o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v.a f158155p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f158156q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(FeesByPackageState feesByPackageState, Y41.l lVar, Y41.l lVar2, float f12, v.a aVar, int i12) {
        super(2);
        this.f158151l = feesByPackageState;
        this.f158152m = lVar;
        this.f158153n = lVar2;
        this.f158154o = f12;
        this.f158155p = aVar;
        this.f158156q = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f158156q | 1);
        Y41.l<DeepLink, G0> lVar = this.f158152m;
        Y41.l<FE.a, G0> lVar2 = this.f158153n;
        k.b(this.f158151l, lVar, lVar2, this.f158154o, this.f158155p, a12, iA2);
        return G0.f406611a;
    }
}
