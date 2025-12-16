package com.avito.android.advert.item.neighboring_dates;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.advert.item.I1;
import com.avito.android.advert_details_items.neighboring_dates.AdvertDetailsNeighboringDatesItem;
import com.avito.android.remote.model.AdvertDetails;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NeighboringDatesPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/d;", "", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface d {

    /* compiled from: NeighboringDatesPresenter.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/neighboring_dates/d$a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f77755a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Uri f77756b;

        public a(@k String str, @k Uri uri) {
            this.f77755a = str;
            this.f77756b = uri;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f77755a, aVar.f77755a) && L.f(this.f77756b, aVar.f77756b);
        }

        public final int hashCode() {
            return this.f77756b.hashCode() + (this.f77755a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangedDates(title=");
            sb2.append(this.f77755a);
            sb2.append(", uri=");
            return com.avito.android.actions_sheet.a.t(sb2, this.f77756b, ')');
        }
    }

    void a(long j12, @k String str, @l a aVar, @k Y41.l<? super AdvertDetailsNeighboringDatesItem, G0> lVar);

    void b(@l String str, @k AdvertDetails advertDetails, @k Y41.l<? super AdvertDetailsNeighboringDatesItem, G0> lVar);

    void c(@k String str);

    void d(@k String str);

    void e0();

    void k(@k I1 i12);
}
