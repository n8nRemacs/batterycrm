package com.avito.android.error_reporting.error_reporter;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: CrashRecorderImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/b;", "Lcom/avito/android/error_reporting/error_reporter/a;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.h f147864a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AK0.l f147865b;

    @Inject
    public b(@Y61.k com.avito.android.server_time.h hVar, @Y61.k AK0.l lVar) {
        this.f147864a = hVar;
        this.f147865b = lVar;
    }

    @Override // com.avito.android.error_reporting.error_reporter.a
    public final long a() {
        return this.f147865b.getLong("LAST_UNCAUGHT_CRASH_TIME", 0L);
    }

    @Override // com.avito.android.error_reporting.error_reporter.a
    public final void b() {
        this.f147865b.putLong("LAST_UNCAUGHT_CRASH_TIME", 0L);
    }

    @Override // com.avito.android.error_reporting.error_reporter.a
    public final void c() {
        this.f147865b.putLong("LAST_UNCAUGHT_CRASH_TIME", this.f147864a.now());
    }
}
