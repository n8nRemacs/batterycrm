package com.avito.android.vas_performance.screens.applied_services.ui.compose;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.vas_performance.screens.applied_services.mvi.entity.AppliedServicesState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesBanner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class a extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesState.Section.a f320342l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f320343m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AppliedServicesState.Section.a aVar, v vVar, int i12) {
        super(2);
        this.f320342l = aVar;
        this.f320343m = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(49);
        b.a(this.f320342l, this.f320343m, a12, iA2);
        return G0.f406611a;
    }
}
