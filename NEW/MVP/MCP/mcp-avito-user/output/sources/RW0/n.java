package rw0;

import com.avito.android.printable_text.PrintableText;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RangeState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lrw0/n;", "", "<init>", "()V", "a", "b", "Lrw0/n$a;", "Lrw0/n$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class n {

    /* compiled from: RangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/n$a;", "Lrw0/n;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f437237a;

        public a(@Y61.k PrintableText printableText) {
            super(null);
            this.f437237a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f437237a, ((a) obj).f437237a);
        }

        public final int hashCode() {
            return this.f437237a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("Empty(message="), this.f437237a, ')');
        }
    }

    /* compiled from: RangeState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/n$b;", "Lrw0/n;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends n {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Date f437238a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Date f437239b;

        public b(@Y61.k Date date, @Y61.k Date date2) {
            super(null);
            this.f437238a = date;
            this.f437239b = date2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f437238a, bVar.f437238a) && L.f(this.f437239b, bVar.f437239b);
        }

        public final int hashCode() {
            return this.f437239b.hashCode() + (this.f437238a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Selected(checkIn=");
            sb2.append(this.f437238a);
            sb2.append(", checkOut=");
            return com.avito.android.bxcontent.mvi.entity.f.n(sb2, this.f437239b, ')');
        }
    }

    public /* synthetic */ n(C42822w c42822w) {
        this();
    }

    public n() {
    }
}
