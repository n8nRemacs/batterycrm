package com.avito.android.profile_tab.summary;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileSummaryParams.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile_tab/summary/e;", "", "a", "b", "Lcom/avito/android/profile_tab/summary/e$a;", "Lcom/avito/android/profile_tab/summary/e$b;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface e {

    /* compiled from: ProfileSummaryParams.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/e$a;", "Lcom/avito/android/profile_tab/summary/e;", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<String> f230868a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f230869b;

        public a(@k List<String> list, @k String str) {
            this.f230868a = list;
            this.f230869b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f230868a, aVar.f230868a) && L.f(this.f230869b, aVar.f230869b);
        }

        public final int hashCode() {
            return this.f230869b.hashCode() + (this.f230868a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(blockIdsToRequest=");
            sb2.append(this.f230868a);
            sb2.append(", idempotencyKey=");
            return C22026a.c(sb2, this.f230869b, ')');
        }
    }

    /* compiled from: ProfileSummaryParams.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_tab/summary/e$b;", "Lcom/avito/android/profile_tab/summary/e;", "<init>", "()V", "_avito_profile-tab_summary_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f230870a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1833974780;
        }

        @k
        public final String toString() {
            return "Empty";
        }
    }
}
