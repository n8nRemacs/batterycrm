package com.avito.android.fees_methods.screen.fees_by_package.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.fees_methods.screen.fees_by_package.mvi.entity.FeesByPackageState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FeesByPackageBannerItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ FeesByPackageState.a f158115l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f158116m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f158117n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f158118o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FeesByPackageState.a aVar, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f158115l = aVar;
        this.f158116m = lVar;
        this.f158117n = vVar;
        this.f158118o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f158118o | 1);
        v vVar = this.f158117n;
        c.a(this.f158115l, this.f158116m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
