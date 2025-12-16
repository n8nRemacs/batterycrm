package com.avito.android.mortgage.domain.check_access;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CheckAccessUseCase.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a;", "", "a", "b", "Lcom/avito/android/mortgage/domain/check_access/a$a;", "Lcom/avito/android/mortgage/domain/check_access/a$b;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: CheckAccessUseCase.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a$a;", "Lcom/avito/android/mortgage/domain/check_access/a;", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.mortgage.domain.check_access.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5890a implements a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f199470a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f199471b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Integer f199472c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f199473d;

        public C5890a(@l String str, @l String str2, @l Integer num, @l String str3) {
            this.f199470a = str;
            this.f199471b = str2;
            this.f199472c = num;
            this.f199473d = str3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5890a)) {
                return false;
            }
            C5890a c5890a = (C5890a) obj;
            return L.f(this.f199470a, c5890a.f199470a) && L.f(this.f199471b, c5890a.f199471b) && L.f(this.f199472c, c5890a.f199472c) && L.f(this.f199473d, c5890a.f199473d);
        }

        public final int hashCode() {
            String str = this.f199470a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f199471b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f199472c;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str3 = this.f199473d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Denied(title=");
            sb2.append(this.f199470a);
            sb2.append(", description=");
            sb2.append(this.f199471b);
            sb2.append(", retryTimeoutSeconds=");
            sb2.append(this.f199472c);
            sb2.append(", error=");
            return C22026a.c(sb2, this.f199473d, ')');
        }
    }

    /* compiled from: CheckAccessUseCase.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/domain/check_access/a$b;", "Lcom/avito/android/mortgage/domain/check_access/a;", "<init>", "()V", "_avito_mortgage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f199474a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1985666970;
        }

        @k
        public final String toString() {
            return "Granted";
        }
    }
}
