package com.avito.android.employee_stub_impl;

import Y61.k;
import android.app.Application;
import android.content.Intent;
import com.avito.android.employee_stub_impl.view.EmployeeStubActivity;
import com.avito.android.employee_stub_public.EmployeeStubData;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmployeeStubIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_stub_impl/g;", "Lcom/avito/android/employee_stub_public/a;", "_avito_employee-stub_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g implements com.avito.android.employee_stub_public.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Application f147596a;

    @Inject
    public g(@k Application application) {
        this.f147596a = application;
    }

    @Override // com.avito.android.employee_stub_public.a
    @k
    public final Intent a(@k EmployeeStubData.FromDeeplink fromDeeplink) {
        EmployeeStubActivity.f147599m.getClass();
        return new Intent(this.f147596a, (Class<?>) EmployeeStubActivity.class).putExtra("key_extra_for_employee_stub_data", fromDeeplink);
    }
}
