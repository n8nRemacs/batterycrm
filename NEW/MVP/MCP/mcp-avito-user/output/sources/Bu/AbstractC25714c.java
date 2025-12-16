package bu;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DasCalendarData.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lbu/c;", "", "<init>", "()V", "a", "b", "Lbu/c$a;", "Lbu/c$b;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bu.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC25714c {

    /* compiled from: DasCalendarData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbu/c$a;", "Lbu/c;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bu.c$a */
    public static final /* data */ class a extends AbstractC25714c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f57532a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57533b;

        public a(@k Date date, boolean z12) {
            super(null);
            this.f57532a = date;
            this.f57533b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f57532a, aVar.f57532a) && this.f57533b == aVar.f57533b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57533b) + (this.f57532a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Day(date=");
            sb2.append(this.f57532a);
            sb2.append(", isAvailable=");
            return r.x(sb2, this.f57533b, ')');
        }
    }

    /* compiled from: DasCalendarData.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbu/c$b;", "Lbu/c;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: bu.c$b */
    public static final /* data */ class b extends AbstractC25714c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f57534a;

        public b(@k Date date) {
            super(null);
            this.f57534a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f57534a, ((b) obj).f57534a);
        }

        public final int hashCode() {
            return this.f57534a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("Empty(nextDate="), this.f57534a, ')');
        }
    }

    public /* synthetic */ AbstractC25714c(C42822w c42822w) {
        this();
    }

    public AbstractC25714c() {
    }
}
