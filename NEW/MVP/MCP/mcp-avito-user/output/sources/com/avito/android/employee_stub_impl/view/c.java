package com.avito.android.employee_stub_impl.view;

import androidx.view.x;
import com.avito.android.employee_stub_public.EmployeeStubData;
import kotlin.Metadata;

/* compiled from: EmployeeStubFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_stub_impl/view/c;", "Landroidx/activity/x;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c extends x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ EmployeeStubFragment f147613d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ EmployeeStubData.FromDeeplink f147614e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(EmployeeStubFragment employeeStubFragment, EmployeeStubData.FromDeeplink fromDeeplink) {
        super(true);
        this.f147613d = employeeStubFragment;
        this.f147614e = fromDeeplink;
    }

    @Override // androidx.view.x
    public final void c() {
        EmployeeStubFragment employeeStubFragment = this.f147613d;
        com.avito.android.deeplink_handler.handler.composite.a aVar = employeeStubFragment.f147601n0;
        if (aVar == null) {
            aVar = null;
        }
        com.avito.android.deeplink_handler.handler.composite.b.a(aVar, this.f147614e.f147621f);
        employeeStubFragment.requireActivity().finish();
    }
}
