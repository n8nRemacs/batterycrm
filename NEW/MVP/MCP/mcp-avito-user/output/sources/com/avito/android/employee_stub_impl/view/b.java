package com.avito.android.employee_stub_impl.view;

import android.view.View;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.employee_stub_impl.view.EmployeeStubFragment;
import com.avito.android.employee_stub_public.EmployeeStubData;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f147611b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ EmployeeStubFragment f147612c;

    public /* synthetic */ b(EmployeeStubFragment employeeStubFragment) {
        this.f147611b = 2;
        this.f147612c = employeeStubFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        EmployeeStubFragment employeeStubFragment = this.f147612c;
        switch (this.f147611b) {
            case 0:
                com.avito.android.deeplink_handler.handler.composite.a aVar = employeeStubFragment.f147601n0;
                if (aVar == null) {
                    aVar = null;
                }
                b.a.a(aVar, EmployeeStubData.Favorites.f147616c, null, null, 6);
                break;
            case 1:
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = employeeStubFragment.f147601n0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, EmployeeStubData.Search.f147624c, null, null, 6);
                break;
            default:
                EmployeeStubFragment.a aVar3 = EmployeeStubFragment.f147600s0;
                employeeStubFragment.requireActivity().getF21241d().c();
                break;
        }
    }

    public /* synthetic */ b(EmployeeStubFragment employeeStubFragment, EmployeeStubData employeeStubData, int i12) {
        this.f147611b = i12;
        this.f147612c = employeeStubFragment;
    }
}
