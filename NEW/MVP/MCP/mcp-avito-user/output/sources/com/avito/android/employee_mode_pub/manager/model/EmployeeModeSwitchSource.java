package com.avito.android.employee_mode_pub.manager.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EmployeeModeSwitchSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_mode_pub/manager/model/EmployeeModeSwitchSource;", "", "_avito_employee-mode_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmployeeModeSwitchSource {

    /* renamed from: b, reason: collision with root package name */
    public static final EmployeeModeSwitchSource f147572b;

    /* renamed from: c, reason: collision with root package name */
    public static final EmployeeModeSwitchSource f147573c;

    /* renamed from: d, reason: collision with root package name */
    public static final EmployeeModeSwitchSource f147574d;

    /* renamed from: e, reason: collision with root package name */
    public static final EmployeeModeSwitchSource f147575e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EmployeeModeSwitchSource[] f147576f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ a f147577g;

    static {
        EmployeeModeSwitchSource employeeModeSwitchSource = new EmployeeModeSwitchSource("PROFILE", 0);
        f147572b = employeeModeSwitchSource;
        EmployeeModeSwitchSource employeeModeSwitchSource2 = new EmployeeModeSwitchSource("BLOCKER", 1);
        f147573c = employeeModeSwitchSource2;
        EmployeeModeSwitchSource employeeModeSwitchSource3 = new EmployeeModeSwitchSource("SWITCH_PROFILE_DEEPLINK", 2);
        f147574d = employeeModeSwitchSource3;
        EmployeeModeSwitchSource employeeModeSwitchSource4 = new EmployeeModeSwitchSource("SWITCH_MODE_DEEPLINK", 3);
        f147575e = employeeModeSwitchSource4;
        EmployeeModeSwitchSource[] employeeModeSwitchSourceArr = {employeeModeSwitchSource, employeeModeSwitchSource2, employeeModeSwitchSource3, employeeModeSwitchSource4};
        f147576f = employeeModeSwitchSourceArr;
        f147577g = c.a(employeeModeSwitchSourceArr);
    }

    public EmployeeModeSwitchSource() {
        throw null;
    }

    public static EmployeeModeSwitchSource valueOf(String str) {
        return (EmployeeModeSwitchSource) Enum.valueOf(EmployeeModeSwitchSource.class, str);
    }

    public static EmployeeModeSwitchSource[] values() {
        return (EmployeeModeSwitchSource[]) f147576f.clone();
    }
}
