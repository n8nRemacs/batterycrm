package androidx.compose.material3;

import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22204y1;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DateRangePicker.kt */
@InterfaceC21537e7
@androidx.compose.runtime.F3
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0012BI\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\u0010\u000f\u001a\u00060\rj\u0002`\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Landroidx/compose/material3/z6;", "Landroidx/compose/material3/N0;", "Landroidx/compose/material3/w6;", "", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/l;", "yearRange", "Landroidx/compose/material3/D6;", "initialDisplayMode", "Landroidx/compose/material3/Ce;", "selectableDates", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/l;ILandroidx/compose/material3/Ce;Ljava/util/Locale;Lkotlin/jvm/internal/w;)V", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.z6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22011z6 extends N0 implements InterfaceC21945w6 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C21669k2> f37843e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C21669k2> f37844f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<D6> f37845g;

    /* compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/z6$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.z6$a */
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

    public C22011z6(Long l12, Long l13, Long l14, kotlin.ranges.l lVar, int i12, Ce ce2, Locale locale, C42822w c42822w) {
        super(l14, lVar, ce2, locale);
        this.f37843e = C22126m3.g(null);
        this.f37844f = C22126m3.g(null);
        C21715m2 c21715m2 = this.f35160c;
        C21669k2 c21669k2B = l12 != null ? c21715m2.b(l12.longValue()) : null;
        C21669k2 c21669k2B2 = l13 != null ? c21715m2.b(l13.longValue()) : null;
        if (c21669k2B != null) {
            int i13 = c21669k2B.f36699b;
            if (!lVar.h(i13)) {
                throw new IllegalArgumentException(("The provided start date year (" + i13 + ") is out of the years range of " + lVar + '.').toString());
            }
        }
        if (c21669k2B2 != null) {
            int i14 = c21669k2B2.f36699b;
            if (!lVar.h(i14)) {
                throw new IllegalArgumentException(("The provided end date year (" + i14 + ") is out of the years range of " + lVar + '.').toString());
            }
        }
        if (c21669k2B2 != null) {
            if (c21669k2B == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.");
            }
            if (c21669k2B.f36702e > c21669k2B2.f36702e) {
                throw new IllegalArgumentException("The provided end date appears before the start date.");
            }
        }
        ((C22082i3) this.f37843e).setValue(c21669k2B);
        ((C22082i3) this.f37844f).setValue(c21669k2B2);
        this.f37845g = C22126m3.g(D6.a(i12));
    }
}
