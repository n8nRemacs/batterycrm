package rw0;

import androidx.compose.foundation.H;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.short_term_rent.soft_booking.mvi.state.viewstate.entity.GuestCountOption;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AccommodationInfo.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lrw0/g;", "", "a", "b", "Lrw0/g$a;", "Lrw0/g$b;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final PrintableText f437206a;

    /* compiled from: AccommodationInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/g$a;", "Lrw0/g;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends g {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f437207b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final GuestCountOption f437208c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final Object f437209d;

        public a(@Y61.k PrintableText printableText, @Y61.k GuestCountOption guestCountOption, @Y61.k List<GuestCountOption> list) {
            super(printableText, null);
            this.f437207b = printableText;
            this.f437208c = guestCountOption;
            this.f437209d = list;
        }

        @Override // rw0.g
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final PrintableText getF437206a() {
            return this.f437207b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f437207b, aVar.f437207b) && L.f(this.f437208c, aVar.f437208c) && L.f(this.f437209d, aVar.f437209d);
        }

        public final int hashCode() {
            return this.f437209d.hashCode() + ((this.f437208c.hashCode() + (this.f437207b.hashCode() * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Adults(title=");
            sb2.append(this.f437207b);
            sb2.append(", selectedOption=");
            sb2.append(this.f437208c);
            sb2.append(", options=");
            return H.n(sb2, this.f437209d, ')');
        }
    }

    /* compiled from: AccommodationInfo.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/g$b;", "Lrw0/g;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends g {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PrintableText f437210b;

        public b(@Y61.k PrintableText printableText) {
            super(printableText, null);
            this.f437210b = printableText;
        }

        @Override // rw0.g
        @Y61.k
        /* renamed from: a, reason: from getter */
        public final PrintableText getF437206a() {
            return this.f437210b;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f437210b, ((b) obj).f437210b);
        }

        public final int hashCode() {
            return this.f437210b.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("AdultsWithChildren(title="), this.f437210b, ')');
        }
    }

    public g(PrintableText printableText, C42822w c42822w) {
        this.f437206a = printableText;
    }

    @Y61.k
    /* renamed from: a, reason: from getter */
    public PrintableText getF437206a() {
        return this.f437206a;
    }
}
