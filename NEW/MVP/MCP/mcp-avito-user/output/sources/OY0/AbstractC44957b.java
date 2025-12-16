package oy0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.bxcontent.mvi.entity.f;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StrBookingCalendarData.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Loy0/b;", "", "<init>", "()V", "a", "b", "Loy0/b$a;", "Loy0/b$b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: oy0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC44957b {

    /* compiled from: StrBookingCalendarData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loy0/b$a;", "Loy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oy0.b$a */
    public static final /* data */ class a extends AbstractC44957b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f422376a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f422377b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f422378c;

        public a(@k Date date, boolean z12, @l String str) {
            super(null);
            this.f422376a = date;
            this.f422377b = z12;
            this.f422378c = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f422376a, aVar.f422376a) && this.f422377b == aVar.f422377b && L.f(this.f422378c, aVar.f422378c);
        }

        public final int hashCode() {
            int i12 = r.i(this.f422376a.hashCode() * 31, 31, this.f422377b);
            String str = this.f422378c;
            return i12 + (str == null ? 0 : str.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Day(date=");
            sb2.append(this.f422376a);
            sb2.append(", isCheckinAvailable=");
            sb2.append(this.f422377b);
            sb2.append(", minimalDurationCaption=");
            return C22026a.c(sb2, this.f422378c, ')');
        }
    }

    /* compiled from: StrBookingCalendarData.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Loy0/b$b;", "Loy0/b;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: oy0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12250b extends AbstractC44957b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Date f422379a;

        public C12250b(@k Date date) {
            super(null);
            this.f422379a = date;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C12250b) && L.f(this.f422379a, ((C12250b) obj).f422379a);
        }

        public final int hashCode() {
            return this.f422379a.hashCode();
        }

        @k
        public final String toString() {
            return f.n(new StringBuilder("Empty(nextDate="), this.f422379a, ')');
        }
    }

    public /* synthetic */ AbstractC44957b(C42822w c42822w) {
        this();
    }

    public AbstractC44957b() {
    }
}
