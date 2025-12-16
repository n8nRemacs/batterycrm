package sz0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.str_seller_orders.orders_seller.domain.models.FiltersDisplaying;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lsz0/b;", "", "a", "b", "c", "Lsz0/b$a;", "Lsz0/b$b;", "Lsz0/b$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC48441b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f438969a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f438970b;

    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/b$a;", "Lsz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.b$a */
    public static final /* data */ class a extends AbstractC48441b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f438971c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f438972d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f438973e;

        public a(@k String str, @k String str2, boolean z12) {
            super(str, str2, null);
            this.f438971c = str;
            this.f438972d = str2;
            this.f438973e = z12;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438969a() {
            return this.f438971c;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: b, reason: from getter */
        public final String getF438970b() {
            return this.f438972d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f438971c, aVar.f438971c) && L.f(this.f438972d, aVar.f438972d) && this.f438973e == aVar.f438973e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f438973e) + H.d(this.f438971c.hashCode() * 31, 31, this.f438972d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(id=");
            sb2.append(this.f438971c);
            sb2.append(", text=");
            sb2.append(this.f438972d);
            sb2.append(", value=");
            return r.x(sb2, this.f438973e, ')');
        }
    }

    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/b$b;", "Lsz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12655b extends AbstractC48441b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f438974c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f438975d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final FiltersDisplaying f438976e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<C48442c> f438977f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<String> f438978g;

        public C12655b(@k String str, @k String str2, @k FiltersDisplaying filtersDisplaying, @k List<C48442c> list, @l List<String> list2) {
            super(str, str2, null);
            this.f438974c = str;
            this.f438975d = str2;
            this.f438976e = filtersDisplaying;
            this.f438977f = list;
            this.f438978g = list2;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438969a() {
            return this.f438974c;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: b, reason: from getter */
        public final String getF438970b() {
            return this.f438975d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12655b)) {
                return false;
            }
            C12655b c12655b = (C12655b) obj;
            return L.f(this.f438974c, c12655b.f438974c) && L.f(this.f438975d, c12655b.f438975d) && L.f(this.f438976e, c12655b.f438976e) && L.f(this.f438977f, c12655b.f438977f) && L.f(this.f438978g, c12655b.f438978g);
        }

        public final int hashCode() {
            int iE2 = H.e((this.f438976e.hashCode() + H.d(this.f438974c.hashCode() * 31, 31, this.f438975d)) * 31, 31, this.f438977f);
            List<String> list = this.f438978g;
            return iE2 + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Multiselect(id=");
            sb2.append(this.f438974c);
            sb2.append(", text=");
            sb2.append(this.f438975d);
            sb2.append(", displaying=");
            sb2.append(this.f438976e);
            sb2.append(", options=");
            sb2.append(this.f438977f);
            sb2.append(", value=");
            return H.p(sb2, this.f438978g, ')');
        }
    }

    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/b$c;", "Lsz0/b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.b$c */
    public static final /* data */ class c extends AbstractC48441b {

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f438979c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final String f438980d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final FiltersDisplaying f438981e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final List<C48442c> f438982f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final String f438983g;

        public c(@k String str, @k String str2, @k FiltersDisplaying filtersDisplaying, @k List<C48442c> list, @l String str3) {
            super(str, str2, null);
            this.f438979c = str;
            this.f438980d = str2;
            this.f438981e = filtersDisplaying;
            this.f438982f = list;
            this.f438983g = str3;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438969a() {
            return this.f438979c;
        }

        @Override // sz0.AbstractC48441b
        @k
        /* renamed from: b, reason: from getter */
        public final String getF438970b() {
            return this.f438980d;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f438979c, cVar.f438979c) && L.f(this.f438980d, cVar.f438980d) && L.f(this.f438981e, cVar.f438981e) && L.f(this.f438982f, cVar.f438982f) && L.f(this.f438983g, cVar.f438983g);
        }

        public final int hashCode() {
            int iE2 = H.e((this.f438981e.hashCode() + H.d(this.f438979c.hashCode() * 31, 31, this.f438980d)) * 31, 31, this.f438982f);
            String str = this.f438983g;
            return iE2 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(id=");
            sb2.append(this.f438979c);
            sb2.append(", text=");
            sb2.append(this.f438980d);
            sb2.append(", displaying=");
            sb2.append(this.f438981e);
            sb2.append(", options=");
            sb2.append(this.f438982f);
            sb2.append(", value=");
            return C22026a.c(sb2, this.f438983g, ')');
        }
    }

    public AbstractC48441b(String str, String str2, C42822w c42822w) {
        this.f438969a = str;
        this.f438970b = str2;
    }

    @k
    /* renamed from: a, reason: from getter */
    public String getF438969a() {
        return this.f438969a;
    }

    @k
    /* renamed from: b, reason: from getter */
    public String getF438970b() {
        return this.f438970b;
    }
}
