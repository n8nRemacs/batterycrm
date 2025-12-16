package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.inset.ItemsRequestParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import lr0.InterfaceC43821a;

/* compiled from: CarouselItemState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/r;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43821a f112412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final a f112413b;

    /* compiled from: CarouselItemState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/r$a;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ItemsRequestParams f112414a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Location f112415b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f112416c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Integer f112417d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.k
        public final String f112418e;

        public a(@Y61.k ItemsRequestParams itemsRequestParams, @Y61.l Location location, @Y61.l String str, @Y61.l Integer num, @Y61.k String str2) {
            this.f112414a = itemsRequestParams;
            this.f112415b = location;
            this.f112416c = str;
            this.f112417d = num;
            this.f112418e = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f112414a, aVar.f112414a) && L.f(this.f112415b, aVar.f112415b) && L.f(this.f112416c, aVar.f112416c) && L.f(this.f112417d, aVar.f112417d) && L.f(this.f112418e, aVar.f112418e);
        }

        public final int hashCode() {
            int iHashCode = this.f112414a.hashCode() * 31;
            Location location = this.f112415b;
            int iHashCode2 = (iHashCode + (location == null ? 0 : location.hashCode())) * 31;
            String str = this.f112416c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f112417d;
            return this.f112418e.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CarouselItemParams(params=");
            sb2.append(this.f112414a);
            sb2.append(", location=");
            sb2.append(this.f112415b);
            sb2.append(", feedId=");
            sb2.append(this.f112416c);
            sb2.append(", showedPageCount=");
            sb2.append(this.f112417d);
            sb2.append(", xHash=");
            return C22026a.c(sb2, this.f112418e, ')');
        }
    }

    public r(@Y61.k InterfaceC43821a interfaceC43821a, @Y61.k a aVar) {
        this.f112412a = interfaceC43821a;
        this.f112413b = aVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f112412a, rVar.f112412a) && L.f(this.f112413b, rVar.f112413b);
    }

    public final int hashCode() {
        return this.f112413b.hashCode() + (this.f112412a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        return "CarouselItemState(item=" + this.f112412a + ", params=" + this.f112413b + ')';
    }
}
