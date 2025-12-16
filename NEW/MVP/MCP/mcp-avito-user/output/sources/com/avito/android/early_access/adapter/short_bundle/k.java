package com.avito.android.early_access.adapter.short_bundle;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessShortBundle.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<EarlyAccessShortBundleItem> f145209l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<EarlyAccessShortBundleItem, G0> f145210m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f145211n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f145212o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(int i12, Y41.l lVar, v vVar, List list) {
        super(2);
        this.f145209l = list;
        this.f145210m = lVar;
        this.f145211n = vVar;
        this.f145212o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145212o | 1);
        v vVar = this.f145211n;
        List<EarlyAccessShortBundleItem> list = this.f145209l;
        n.b(iA2, this.f145210m, a12, vVar, list);
        return G0.f406611a;
    }
}
