package com.avito.android.error_reporting.error_reporter;

import com.avito.android.analytics.InterfaceC28464o;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.util.C35822j3;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35881r2;
import com.avito.android.util.V2;
import io.reactivex.rxjava3.core.H;
import j.k0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ErrorEventTracker.kt */
@k0
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/i;", "Lcom/avito/android/analytics/r;", "Lcom/avito/android/error_reporting/error_reporter/u;", "Lcom/avito/android/util/r2;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class i implements com.avito.android.analytics.r<u>, InterfaceC35881r2 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f147871a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f147872b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C35822j3 f147873c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final H f147874d;

    @Inject
    public i(@Y61.k n nVar, @Y61.k l lVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f147871a = nVar;
        this.f147872b = lVar;
        this.f147873c = new C35822j3(nVar, lVar);
        this.f147874d = interfaceC35745a5.d();
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    public final void a() {
        this.f147873c.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.analytics.r
    public final void c(InterfaceC28464o interfaceC28464o) {
        u uVar = (u) interfaceC28464o;
        if (uVar instanceof NonFatalErrorEvent) {
            this.f147874d.d(new Me.m((Throwable) uVar, this, ((NonFatalErrorEvent) uVar).f147928d, 17));
        } else {
            String f147929e = uVar.getF147929e();
            V2.f318762a.c("CrashlyticsEventTracker", f147929e, null);
            this.f147871a.log(f147929e);
        }
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    /* renamed from: h, reason: from getter */
    public final H getF147874d() {
        return this.f147874d;
    }

    @Override // com.avito.android.analytics.r
    @Y61.k
    public final Class<u> i() {
        return u.class;
    }

    @Override // com.avito.android.util.InterfaceC35881r2
    /* renamed from: isInitialized */
    public final boolean getF437917g() {
        return this.f147873c.f318637a;
    }
}
