package pz0;

import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lpz0/e;", "", "a", "b", "c", "Lpz0/e$a;", "Lpz0/e$b;", "Lpz0/e$c;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface e {

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/e$a;", "Lpz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f428934a;

        public a(@k ArrayList arrayList) {
            this.f428934a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f428934a.equals(((a) obj).f428934a);
        }

        public final int hashCode() {
            return this.f428934a.hashCode();
        }

        @k
        public final String toString() {
            return androidx.compose.ui.graphics.colorspace.e.p(new StringBuilder("Content(items="), this.f428934a, ')');
        }
    }

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz0/e$b;", "Lpz0/e;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f428935a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final PrintableText f428936b;

        public b(@k PrintableText printableText, @k PrintableText printableText2) {
            this.f428935a = printableText;
            this.f428936b = printableText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f428935a, bVar.f428935a) && L.f(this.f428936b, bVar.f428936b);
        }

        public final int hashCode() {
            return this.f428936b.hashCode() + (this.f428935a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(title=");
            sb2.append(this.f428935a);
            sb2.append(", description=");
            return AK.c.m(sb2, this.f428936b, ')');
        }
    }

    /* compiled from: StrOrdersBuyerState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpz0/e$c;", "Lpz0/e;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f428937a = new c();
    }
}
