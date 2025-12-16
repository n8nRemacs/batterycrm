package com.avito.android.vas_performance.screens.applied_services.ui;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.compose.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: AppliedServicesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesFragment f320382l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.lib.design.bottom_sheet.d f320383m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AppliedServicesFragment appliedServicesFragment, com.avito.android.lib.design.bottom_sheet.d dVar) {
        super(2);
        this.f320382l = appliedServicesFragment;
        this.f320383m = dVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            AppliedServicesFragment appliedServicesFragment = this.f320382l;
            q.b((com.avito.android.analytics.screens.compose.a) appliedServicesFragment.f320331l0.getValue(), r.c(-176127324, new e(appliedServicesFragment, this.f320383m, C22126m3.b(((h) appliedServicesFragment.f320328i0.getValue()).getState(), a13)), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
