package com.avito.android.authorization.auto_recovery.recovery_availability;

import androidx.fragment.app.ActivityC22955m;
import com.avito.android.authorization.auto_recovery.recovery_availability.RecoveryAvailabilityFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: RecoveryAvailabilityFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class c extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ RecoveryAvailabilityFragment f93287l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(RecoveryAvailabilityFragment recoveryAvailabilityFragment) {
        super(0);
        this.f93287l = recoveryAvailabilityFragment;
    }

    @Override // Y41.a
    public final G0 invoke() {
        RecoveryAvailabilityFragment recoveryAvailabilityFragment = this.f93287l;
        RecoveryAvailabilityFragment.a aVar = RecoveryAvailabilityFragment.f93270y0;
        ActivityC22955m activityC22955mRequireActivity = recoveryAvailabilityFragment.requireActivity();
        activityC22955mRequireActivity.setResult(-1);
        activityC22955mRequireActivity.finish();
        return G0.f406611a;
    }
}
