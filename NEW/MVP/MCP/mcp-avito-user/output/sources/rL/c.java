package Rl;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.printable_text.PrintableText;
import java.time.LocalDate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CalendarSelectState.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"LRl/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "<init>", "()V", "a", "b", "c", "d", "LRl/c$b;", "LRl/c$c;", "LRl/c$d;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class c extends q {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f14592b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0974c f14593c = C0974c.f14595d;

    /* compiled from: CalendarSelectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/c$a;", "", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CalendarSelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRl/c$b;", "LRl/c;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f14594d;

        public b(@k PrintableText printableText) {
            super(null);
            this.f14594d = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f14594d, ((b) obj).f14594d);
        }

        public final int hashCode() {
            return this.f14594d.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Error(errorMessage="), this.f14594d, ')');
        }
    }

    /* compiled from: CalendarSelectState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRl/c$c;", "LRl/c;", "<init>", "()V", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Rl.c$c, reason: collision with other inner class name */
    public static final class C0974c extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C0974c f14595d = new C0974c();

        public C0974c() {
            super(null);
        }
    }

    /* compiled from: CalendarSelectState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRl/c$d;", "LRl/c;", "_avito_calendar-select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends c {

        /* renamed from: d, reason: collision with root package name */
        @k
        public final PrintableText f14596d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final PrintableText f14597e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f14598f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f14599g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final List<TV0.a> f14600h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Integer f14601i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final List<LocalDate> f14602j;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k PrintableText printableText, @k PrintableText printableText2, boolean z12, boolean z13, @k List<? extends TV0.a> list, @l Integer num, @k List<LocalDate> list2) {
            super(null);
            this.f14596d = printableText;
            this.f14597e = printableText2;
            this.f14598f = z12;
            this.f14599g = z13;
            this.f14600h = list;
            this.f14601i = num;
            this.f14602j = list2;
        }

        public static d a(d dVar, boolean z12, boolean z13, List list, List list2) {
            return new d(dVar.f14596d, dVar.f14597e, z12, z13, list, null, list2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14596d, dVar.f14596d) && L.f(this.f14597e, dVar.f14597e) && this.f14598f == dVar.f14598f && this.f14599g == dVar.f14599g && L.f(this.f14600h, dVar.f14600h) && L.f(this.f14601i, dVar.f14601i) && L.f(this.f14602j, dVar.f14602j);
        }

        public final int hashCode() {
            int iE2 = H.e(r.i(r.i(com.avito.android.actions_sheet.a.f(this.f14597e, this.f14596d.hashCode() * 31, 31), 31, this.f14598f), 31, this.f14599g), 31, this.f14600h);
            Integer num = this.f14601i;
            return this.f14602j.hashCode() + ((iE2 + (num == null ? 0 : num.hashCode())) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowContent(title=");
            sb2.append(this.f14596d);
            sb2.append(", selectButtonText=");
            sb2.append(this.f14597e);
            sb2.append(", isSelectButtonVisible=");
            sb2.append(this.f14598f);
            sb2.append(", canClear=");
            sb2.append(this.f14599g);
            sb2.append(", items=");
            sb2.append(this.f14600h);
            sb2.append(", itemToScrollTo=");
            sb2.append(this.f14601i);
            sb2.append(", selectedDates=");
            return H.p(sb2, this.f14602j, ')');
        }
    }

    public /* synthetic */ c(C42822w c42822w) {
        this();
    }

    public c() {
    }
}
