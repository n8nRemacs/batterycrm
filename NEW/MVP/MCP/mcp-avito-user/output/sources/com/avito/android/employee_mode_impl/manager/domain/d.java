package com.avito.android.employee_mode_impl.manager.domain;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: EmployeeInfoResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_impl/manager/domain/d;", "", "_avito_employee-mode_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f147367a;

    public d(boolean z12) {
        this.f147367a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f147367a == ((d) obj).f147367a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f147367a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("EmployeeInfoResponse(isApprovedEmployee="), this.f147367a, ')');
    }
}
