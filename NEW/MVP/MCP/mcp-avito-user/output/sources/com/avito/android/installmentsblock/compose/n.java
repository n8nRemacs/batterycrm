package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsOfferDetailsItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class n extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsOfferDetailsItem f172936l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172937m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f172938n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f172939o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InstallmentsOfferDetailsItem installmentsOfferDetailsItem, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f172936l = installmentsOfferDetailsItem;
        this.f172937m = lVar;
        this.f172938n = vVar;
        this.f172939o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f172939o | 1);
        v vVar = this.f172938n;
        b.f(this.f172936l, this.f172937m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
