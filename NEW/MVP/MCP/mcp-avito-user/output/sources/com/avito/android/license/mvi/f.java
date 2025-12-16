package com.avito.android.license.mvi;

import YV.a;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.u;
import com.avito.android.license.mvi.entity.LicenseInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: LicenseReducer.kt */
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/license/mvi/f;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/license/mvi/entity/LicenseInternalAction;", "LYV/a;", "<init>", "()V", "_avito_license_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class f implements u<LicenseInternalAction, YV.a> {
    @Inject
    public f() {
    }

    @Override // com.avito.android.arch.mvi.u
    public final YV.a a(LicenseInternalAction licenseInternalAction, YV.a aVar) {
        LicenseInternalAction licenseInternalAction2 = licenseInternalAction;
        if (licenseInternalAction2 instanceof LicenseInternalAction.Loading) {
            return a.C1380a.f19485b;
        }
        if (licenseInternalAction2 instanceof LicenseInternalAction.ShowLicenses) {
            return new a.b(((LicenseInternalAction.ShowLicenses) licenseInternalAction2).f181536b);
        }
        throw new NoWhenBranchMatchedException();
    }
}
