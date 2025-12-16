package com.avito.android.early_access.adapter.bundle;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessBundles.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class m extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessBundleItem> f145123l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<EarlyAccessSelectableBundleItem, G0> f145124m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145125n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f145123l = list;
        this.f145124m = lVar;
        this.f145125n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(393);
        v vVar = this.f145125n;
        List<EarlyAccessBundleItem> list = this.f145123l;
        n.a(iA2, this.f145124m, a12, vVar, list);
        return G0.f406611a;
    }
}
