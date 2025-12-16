package com.avito.android.employee_stub_impl;

import Y61.k;
import androidx.core.os.C22777e;
import com.avito.android.employee_stub_impl.view.EmployeeStubFragment;
import com.avito.android.employee_stub_public.EmployeeStubData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import mz.InterfaceC44154b;

/* compiled from: EmployeeStubFragmentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_stub_impl/d;", "Lmz/b;", "<init>", "()V", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements InterfaceC44154b {
    @Inject
    public d() {
    }

    @k
    public final EmployeeStubFragment a(@k EmployeeStubData employeeStubData) {
        EmployeeStubFragment.f147600s0.getClass();
        EmployeeStubFragment employeeStubFragment = new EmployeeStubFragment();
        employeeStubFragment.setArguments(C22777e.b(new Q("key_bundle_for_employee_stub_data", employeeStubData)));
        return employeeStubFragment;
    }
}
