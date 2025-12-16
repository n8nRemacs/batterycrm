package com.avito.android.installmentsblock.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InstallmentsBlock.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class s extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<dO.e> f172956l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f172957m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f172958n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f172959o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f172956l = list;
        this.f172957m = lVar;
        this.f172958n = vVar;
        this.f172959o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f172959o | 1);
        b.i(this.f172956l, this.f172957m, a12, iA2);
        return G0.f406611a;
    }
}
