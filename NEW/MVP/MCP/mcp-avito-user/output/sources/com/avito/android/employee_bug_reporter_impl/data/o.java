package com.avito.android.employee_bug_reporter_impl.data;

import Oy.InterfaceC14753f;
import com.avito.android.employee_bug_reporter_impl.domain.PositionOnScreen;
import kotlin.Metadata;

/* compiled from: BugReporterPositionStorageImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/o;", "LOy/f;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class o implements InterfaceC14753f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f147288a;

    public o(@Y61.k AK0.l lVar) {
        this.f147288a = lVar;
    }

    @Override // Oy.InterfaceC14753f
    public final void a(@Y61.k PositionOnScreen positionOnScreen) {
        this.f147288a.putString("br-position", positionOnScreen.name());
    }

    @Override // Oy.InterfaceC14753f
    @Y61.k
    public final PositionOnScreen getPosition() {
        String string = this.f147288a.getString("br-position");
        if (string == null) {
            PositionOnScreen.f147289b.getClass();
            return PositionOnScreen.f147290c;
        }
        try {
            return PositionOnScreen.valueOf(string);
        } catch (Exception unused) {
            PositionOnScreen.f147289b.getClass();
            return PositionOnScreen.f147290c;
        }
    }
}
