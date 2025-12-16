package com.avito.android.vas_performance.ui.applied_services;

import androidx.fragment.app.ActivityC22955m;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppliedServicesDialogFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AppliedServicesDialogFragment f321423l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AppliedServicesDialogFragment appliedServicesDialogFragment) {
        super(0);
        this.f321423l = appliedServicesDialogFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        ActivityC22955m activityC22955mL1 = this.f321423l.l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.finish();
        }
        return G0.f406611a;
    }
}
