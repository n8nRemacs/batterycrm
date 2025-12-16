package androidx.compose.material3;

import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DatePicker.kt */
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B?\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\u0010\u000e\u001a\u00060\fj\u0002`\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/material3/I5;", "Landroidx/compose/material3/N0;", "Landroidx/compose/material3/F5;", "", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/D6;", "initialDisplayMode", "Landroidx/compose/material3/Ce;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/Ce;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class I5 extends N0 implements F5 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C21669k2> f34866e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<D6> f34867f;

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/I5$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public I5(Long l12, Long l13, kotlin.ranges.l lVar, int i12, Ce ce2, Locale locale, C42822w c42822w) {
        C21669k2 c21669k2B;
        super(l13, lVar, ce2, locale);
        if (l12 != null) {
            c21669k2B = this.f35160c.b(l12.longValue());
            int i13 = c21669k2B.f36699b;
            if (!lVar.h(i13)) {
                throw new IllegalArgumentException(("The provided initial date's year (" + i13 + ") is out of the years range of " + lVar + '.').toString());
            }
        } else {
            c21669k2B = null;
        }
        this.f34866e = C22126m3.g(c21669k2B);
        this.f34867f = C22126m3.g(D6.a(i12));
    }
}
