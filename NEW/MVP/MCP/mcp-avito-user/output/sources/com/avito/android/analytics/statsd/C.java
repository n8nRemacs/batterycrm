package com.avito.android.analytics.statsd;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.C43066x;

/* compiled from: StatsdEventValidator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/C;", "", "a", "b", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface C {

    /* compiled from: StatsdEventValidator.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/C$a;", "Lcom/avito/android/analytics/statsd/C;", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements C {
        @Override // com.avito.android.analytics.statsd.C
        public final void a(@Y61.k y yVar) {
            String strK;
            C43059p c43059p = (C43059p) D.f91026a.getValue();
            String str = yVar.f91091b;
            if (!c43059p.e(str)) {
                Iterator it = C42745f0.U("apps.mobile.", "tm.", "c.", "g.").iterator();
                while (true) {
                    if (!it.hasNext()) {
                        strK = null;
                        break;
                    }
                    String str2 = (String) it.next();
                    if (C43066x.h0(str, str2, false)) {
                        strK = AK.c.k("Invalid prefix: ", str2, " is not allowed");
                        break;
                    }
                }
            } else {
                strK = "Invalid symbols. Use statdSeriesElement() to replace them.";
            }
            if (strK == null) {
                return;
            }
            throw new C28510b("Invalid event: id=" + str + ' ' + yVar.f91092c + " \nReason: " + strK + " \nYou can disable this validation by statsd_strict_mode feature toggle.");
        }
    }

    void a(@Y61.k y yVar);

    /* compiled from: StatsdEventValidator.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/statsd/C$b;", "Lcom/avito/android/analytics/statsd/C;", "<init>", "()V", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements C {
        @Override // com.avito.android.analytics.statsd.C
        public final void a(@Y61.k y yVar) {
        }
    }
}
