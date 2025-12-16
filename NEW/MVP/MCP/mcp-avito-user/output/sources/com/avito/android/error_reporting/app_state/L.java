package com.avito.android.error_reporting.app_state;

import android.os.SystemClock;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.util.J5;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AppStateCollectorUptime.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/app_state/L;", "Lcom/avito/android/error_reporting/app_state/a;", "Lcom/avito/android/util/J5;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class L extends J5 implements InterfaceC30362a {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30362a.InterfaceC4322a f147796c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147797d = C42727D.c(a.f147798l);

    /* compiled from: AppStateCollectorUptime.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f147798l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() {
            return Long.valueOf(SystemClock.uptimeMillis());
        }
    }

    @Inject
    public L(@Y61.k InterfaceC30362a.InterfaceC4322a interfaceC4322a) {
        this.f147796c = interfaceC4322a;
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        ((Number) this.f147797d.getValue()).longValue();
    }
}
