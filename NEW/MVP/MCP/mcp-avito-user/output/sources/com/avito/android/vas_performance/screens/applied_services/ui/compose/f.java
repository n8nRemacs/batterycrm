package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesState.Section.Item f320349l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IL0.a, G0> f320350m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f320351n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f320352o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AppliedServicesState.Section.Item item, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f320349l = item;
        this.f320350m = lVar;
        this.f320351n = vVar;
        this.f320352o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f320352o | 1);
        v vVar = this.f320351n;
        g.a(this.f320349l, this.f320350m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
