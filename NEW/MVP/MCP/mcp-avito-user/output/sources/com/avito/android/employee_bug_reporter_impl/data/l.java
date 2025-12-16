package com.avito.android.employee_bug_reporter_impl.data;

import Oy.InterfaceC14752e;
import Oy.InterfaceC14753f;
import com.avito.android.employee_bug_reporter_impl.domain.PositionOnScreen;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: BugReporterPositionRepositoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/employee_bug_reporter_impl/data/l;", "LOy/e;", "_avito_employee-bug-reporter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements InterfaceC14752e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14753f f147284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public PositionOnScreen f147285b;

    @Inject
    public l(@Y61.k InterfaceC14753f interfaceC14753f) {
        this.f147284a = interfaceC14753f;
        PositionOnScreen.f147289b.getClass();
        this.f147285b = PositionOnScreen.f147290c;
        this.f147285b = interfaceC14753f.getPosition();
    }

    @Override // Oy.InterfaceC14752e
    public final void a(@Y61.k PositionOnScreen positionOnScreen) {
        this.f147284a.a(positionOnScreen);
        this.f147285b = positionOnScreen;
    }

    @Override // Oy.InterfaceC14752e
    @Y61.k
    /* renamed from: getPosition, reason: from getter */
    public final PositionOnScreen getF147285b() {
        return this.f147285b;
    }
}
