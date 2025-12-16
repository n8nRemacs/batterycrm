package com.avito.android.employee_mode_impl.manager.state;

import android.os.SystemClock;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: EmployeeModeStateTime.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/state/v;", "Lcom/avito/android/employee_mode_impl/manager/state/u;", "<init>", "()V", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class v implements u {
    @Inject
    public v() {
    }

    @Override // com.avito.android.employee_mode_impl.manager.state.u
    public final long a() {
        return SystemClock.elapsedRealtime();
    }
}
