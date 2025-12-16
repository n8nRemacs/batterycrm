package com.avito.android.error_reporting.error_reporter;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RemoteLogEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/error_reporting/error_reporter/v;", "Lcom/avito/android/error_reporting/error_reporter/u;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class v implements u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f147907b;

    public v(@Y61.k String str) {
        this.f147907b = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v) && L.f(this.f147907b, ((v) obj).f147907b);
    }

    @Override // com.avito.android.error_reporting.error_reporter.u
    @Y61.k
    /* renamed from: getName, reason: from getter */
    public final String getF147907b() {
        return this.f147907b;
    }

    public final int hashCode() {
        return this.f147907b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("RemoteLogEventImpl(name="), this.f147907b, ')');
    }
}
