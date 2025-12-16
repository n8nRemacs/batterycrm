package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.installments_block.entity.InstallmentsProgress;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InstallmentsProgress f172930l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f172931m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f172932n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f172933o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InstallmentsProgress installmentsProgress, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f172930l = installmentsProgress;
        this.f172931m = lVar;
        this.f172932n = vVar;
        this.f172933o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f172933o | 1);
        v vVar = this.f172932n;
        b.d(this.f172930l, this.f172931m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
