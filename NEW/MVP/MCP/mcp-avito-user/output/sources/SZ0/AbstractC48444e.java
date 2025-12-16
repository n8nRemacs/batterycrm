package sz0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersFilterUpdate.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lsz0/e;", "", "a", "b", "c", "Lsz0/e$a;", "Lsz0/e$b;", "Lsz0/e$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC48444e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f438989a;

    /* compiled from: StrSellerOrdersFilterUpdate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/e$a;", "Lsz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.e$a */
    public static final /* data */ class a extends AbstractC48444e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f438990b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Boolean f438991c;

        public a(@k String str, @l Boolean bool) {
            super(str, null);
            this.f438990b = str;
            this.f438991c = bool;
        }

        @Override // sz0.AbstractC48444e
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438989a() {
            return this.f438990b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f438990b, aVar.f438990b) && L.f(this.f438991c, aVar.f438991c);
        }

        public final int hashCode() {
            int iHashCode = this.f438990b.hashCode() * 31;
            Boolean bool = this.f438991c;
            return iHashCode + (bool == null ? 0 : bool.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Chip(filterId=");
            sb2.append(this.f438990b);
            sb2.append(", newValue=");
            return C0.g(sb2, this.f438991c, ')');
        }
    }

    /* compiled from: StrSellerOrdersFilterUpdate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/e$b;", "Lsz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.e$b */
    public static final /* data */ class b extends AbstractC48444e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f438992b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final ArrayList f438993c;

        public b(@k String str, @l ArrayList arrayList) {
            super(str, null);
            this.f438992b = str;
            this.f438993c = arrayList;
        }

        @Override // sz0.AbstractC48444e
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438989a() {
            return this.f438992b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f438992b, bVar.f438992b) && L.f(this.f438993c, bVar.f438993c);
        }

        public final int hashCode() {
            int iHashCode = this.f438992b.hashCode() * 31;
            ArrayList arrayList = this.f438993c;
            return iHashCode + (arrayList == null ? 0 : arrayList.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Multiselect(filterId=");
            sb2.append(this.f438992b);
            sb2.append(", newValue=");
            return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f438993c, ')');
        }
    }

    /* compiled from: StrSellerOrdersFilterUpdate.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/e$c;", "Lsz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.e$c */
    public static final /* data */ class c extends AbstractC48444e {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f438994b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f438995c;

        public c(@k String str, @l String str2) {
            super(str, null);
            this.f438994b = str;
            this.f438995c = str2;
        }

        @Override // sz0.AbstractC48444e
        @k
        /* renamed from: a, reason: from getter */
        public final String getF438989a() {
            return this.f438994b;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f438994b, cVar.f438994b) && L.f(this.f438995c, cVar.f438995c);
        }

        public final int hashCode() {
            int iHashCode = this.f438994b.hashCode() * 31;
            String str = this.f438995c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Select(filterId=");
            sb2.append(this.f438994b);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f438995c, ')');
        }
    }

    public AbstractC48444e(String str, C42822w c42822w) {
        this.f438989a = str;
    }

    @k
    /* renamed from: a, reason: from getter */
    public String getF438989a() {
        return this.f438989a;
    }
}
