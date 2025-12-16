package com.avito.android.error_reporting.error_reporter;

import com.avito.android.util.J5;
import com.avito.android.util.V2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: MultipleTargetsErrorReporter.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/t;", "Lcom/avito/android/error_reporting/error_reporter/n;", "Lcom/avito/android/util/J5;", "_common_error-reporting_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t extends J5 implements n {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<n> f147905c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f147906d;

    public t(@Y61.k ArrayList arrayList) {
        this.f147905c = C42745f0.M0(arrayList);
        this.f147906d = C42727D.c(new s(arrayList));
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void b(@Y61.k String str, @Y61.k String str2) {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).b(str, str2);
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final int d() {
        return ((Number) this.f147906d.getValue()).intValue();
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void e(@Y61.k String str) {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).e(str);
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void g(@Y61.k Throwable th2) {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).g(th2);
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void log(@Y61.k String str) {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).log(str);
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }

    @Override // com.avito.android.error_reporting.error_reporter.n
    public final void n(int i12, @Y61.k String str) {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).n(i12, str);
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }

    @Override // com.avito.android.util.J5
    public final void o() {
        Iterator<T> it = this.f147905c.iterator();
        while (it.hasNext()) {
            try {
                ((n) it.next()).a();
            } catch (Exception e12) {
                V2.f318762a.a("DEFAULT_TAG", "MultipleCrashReporter", e12);
            }
        }
    }
}
