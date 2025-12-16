package com.avito.android.crm_candidates.domain;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FilterData.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Lcom/avito/android/crm_candidates/domain/b$a;", "Lcom/avito/android/crm_candidates/domain/b$b;", "Lcom/avito/android/crm_candidates/domain/b$c;", "Lcom/avito/android/crm_candidates/domain/b$d;", "Lcom/avito/android/crm_candidates/domain/b$e;", "Lcom/avito/android/crm_candidates/domain/b$f;", "Lcom/avito/android/crm_candidates/domain/b$g;", "Lcom/avito/android/crm_candidates/domain/b$h;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface b {

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$a;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final Long f129345a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Long f129346b;

        public a(@Y61.l Long l12, @Y61.l Long l13) {
            this.f129345a = l12;
            this.f129346b = l13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f129345a, aVar.f129345a) && L.f(this.f129346b, aVar.f129346b);
        }

        public final int hashCode() {
            Long l12 = this.f129345a;
            int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
            Long l13 = this.f129346b;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Age(from=");
            sb2.append(this.f129345a);
            sb2.append(", to=");
            return androidx.media3.exoplayer.analytics.m.m(sb2, this.f129346b, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$b;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_candidates.domain.b$b, reason: collision with other inner class name */
    public static final /* data */ class C3844b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f129347a;

        public C3844b(@Y61.k ArrayList arrayList) {
            this.f129347a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3844b) && this.f129347a.equals(((C3844b) obj).f129347a);
        }

        public final int hashCode() {
            return this.f129347a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("ApplicationStatuses(ids="), this.f129347a, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$c;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f129348a;

        /* renamed from: b, reason: collision with root package name */
        public final long f129349b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f129350c;

        public c(long j12, long j13, @Y61.k String str) {
            this.f129348a = j12;
            this.f129349b = j13;
            this.f129350c = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f129348a == cVar.f129348a && this.f129349b == cVar.f129349b && L.f(this.f129350c, cVar.f129350c);
        }

        public final int hashCode() {
            return this.f129350c.hashCode() + androidx.appcompat.app.r.g(Long.hashCode(this.f129348a) * 31, 31, this.f129349b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Date(from=");
            sb2.append(this.f129348a);
            sb2.append(", to=");
            sb2.append(this.f129349b);
            sb2.append(", dateFilterId=");
            return C22026a.c(sb2, this.f129350c, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$d;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f129351a;

        public d(@Y61.k ArrayList arrayList) {
            this.f129351a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f129351a.equals(((d) obj).f129351a);
        }

        public final int hashCode() {
            return this.f129351a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Employee(ids="), this.f129351a, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$e;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        public final long f129352a;

        public e(long j12) {
            this.f129352a = j12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f129352a == ((e) obj).f129352a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f129352a);
        }

        @Y61.k
        public final String toString() {
            return androidx.appcompat.app.r.u(new StringBuilder("Gender(value="), this.f129352a, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$f;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f129353a;

        public f(@Y61.k ArrayList arrayList) {
            this.f129353a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f129353a.equals(((f) obj).f129353a);
        }

        public final int hashCode() {
            return this.f129353a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Locations(ids="), this.f129353a, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$g;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final List<String> f129354a;

        public g(@Y61.k List<String> list) {
            this.f129354a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f129354a, ((g) obj).f129354a);
        }

        public final int hashCode() {
            return this.f129354a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("Statuses(ids="), this.f129354a, ')');
        }
    }

    /* compiled from: FilterData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_candidates/domain/b$h;", "Lcom/avito/android/crm_candidates/domain/b;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f129355a;

        public h(@Y61.k ArrayList arrayList) {
            this.f129355a = arrayList;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f129355a.equals(((h) obj).f129355a);
        }

        public final int hashCode() {
            return this.f129355a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Vacancies(ids="), this.f129355a, ')');
        }
    }
}
