package com.avito.android.mnz_common.compose;

import androidx.compose.runtime.C22066f2;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MnzSegmentedControl.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List<String> f197958l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Integer, G0> f197959m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Integer f197960n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f197961o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f197962p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(List list, Y41.l lVar, Integer num, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f197958l = list;
        this.f197959m = lVar;
        this.f197960n = num;
        this.f197961o = vVar;
        this.f197962p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f197962p | 1);
        Integer num2 = this.f197960n;
        B.a(this.f197958l, this.f197959m, num2, this.f197961o, a12, iA2);
        return G0.f406611a;
    }
}
