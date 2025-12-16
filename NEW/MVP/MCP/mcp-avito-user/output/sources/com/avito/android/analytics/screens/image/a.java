package com.avito.android.analytics.screens.image;

import Y61.k;
import java.util.Map;
import java.util.TreeMap;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ImageBucketProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/screens/image/a;", "", "a", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface a {

    /* compiled from: ImageBucketProvider.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/screens/image/a$a;", "Lcom/avito/android/analytics/screens/image/a;", "<init>", "()V", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics.screens.image.a$a, reason: collision with other inner class name */
    public static final class C2679a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final TreeMap f90610a;

        @Inject
        public C2679a() {
            Q[] qArr = {new Q(10000, "10000"), new Q(50000, "50000"), new Q(100000, "100000"), new Q(250000, "250000"), new Q(500000, "500000"), new Q(750000, "750000"), new Q(1000000, "1000000"), new Q(1500000, "1500000"), new Q(2000000, "2000000"), new Q(4000000, "4000000")};
            TreeMap treeMap = new TreeMap();
            P0.n(treeMap, qArr);
            this.f90610a = treeMap;
        }

        @Override // com.avito.android.analytics.screens.image.a
        @k
        public final String a(int i12, int i13) {
            int i14 = i12 * i13;
            for (Map.Entry entry : this.f90610a.entrySet()) {
                if (i14 < ((Number) entry.getKey()).intValue()) {
                    return (String) entry.getValue();
                }
            }
            return "big";
        }
    }

    @k
    String a(int i12, int i13);
}
