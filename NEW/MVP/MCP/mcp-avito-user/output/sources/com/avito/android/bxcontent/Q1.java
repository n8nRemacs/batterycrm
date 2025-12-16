package com.avito.android.bxcontent;

import com.avito.android.remote.model.SearchParams;
import java.util.List;
import kotlin.Metadata;

/* compiled from: VacancyInfoProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/Q1;", "", "a", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface Q1 {

    /* compiled from: VacancyInfoProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/Q1$a;", "", "_avito_serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f109420a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f109421b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f109422c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f109423d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f109424e;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, boolean z12) {
            this.f109420a = str;
            this.f109421b = str2;
            this.f109422c = str3;
            this.f109423d = str4;
            this.f109424e = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f109420a, aVar.f109420a) && kotlin.jvm.internal.L.f(this.f109421b, aVar.f109421b) && kotlin.jvm.internal.L.f(this.f109422c, aVar.f109422c) && kotlin.jvm.internal.L.f(this.f109423d, aVar.f109423d) && this.f109424e == aVar.f109424e;
        }

        public final int hashCode() {
            int iD2 = androidx.compose.foundation.H.d(this.f109420a.hashCode() * 31, 31, this.f109421b);
            String str = this.f109422c;
            int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f109423d;
            return Boolean.hashCode(this.f109424e) + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VacancyInfo(advertId=");
            sb2.append(this.f109420a);
            sb2.append(", title=");
            sb2.append(this.f109421b);
            sb2.append(", categoryId=");
            sb2.append(this.f109422c);
            sb2.append(", locationId=");
            sb2.append(this.f109423d);
            sb2.append(", trackVacanciesSurvey=");
            return androidx.appcompat.app.r.x(sb2, this.f109424e, ')');
        }
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.maybe.h0 a(@Y61.k List list, @Y61.k String str, @Y61.l SearchParams searchParams);
}
