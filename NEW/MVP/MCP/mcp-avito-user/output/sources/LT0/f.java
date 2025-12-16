package Lt0;

import Y61.k;
import com.avito.android.J0;
import com.avito.android.service_booking_calendar.data.model.Day;
import com.avito.android.service_booking_calendar.days_producer.DateRange;
import com.avito.android.service_booking_calendar.view.day.d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;
import org.threeten.bp.n;
import org.threeten.bp.q;
import org.threeten.bp.temporal.ChronoUnit;
import ys0.InterfaceC50291b;

/* compiled from: ScheduleRepetitionDaysConverter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLt0/f;", "LLt0/e;", "_avito_service-booking-schedule-repetition_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class f implements e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f10169a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC50291b f10170b;

    /* compiled from: ScheduleRepetitionDaysConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10171a;

        static {
            int[] iArr = new int[Day.Type.values().length];
            try {
                iArr[Day.Type.WITH_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Day.Type.NEED_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Day.Type.COMPLETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f10171a = iArr;
        }
    }

    /* compiled from: Comparisons.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t12, T t13) {
            return kotlin.comparisons.a.b(((Day) t12).getTime(), ((Day) t13).getTime());
        }
    }

    @Inject
    public f(@k J0 j02, @k InterfaceC50291b interfaceC50291b) {
        this.f10169a = j02;
        this.f10170b = interfaceC50291b;
    }

    @Override // Lt0.e
    @k
    public final List<com.avito.android.service_booking_calendar.a> a(@k List<Day> list) throws NumberFormatException {
        int i12;
        int i13;
        List<Day> list2 = list;
        List listB0 = C42745f0.B0(list2, new b());
        long j12 = Long.parseLong(((Day) C42745f0.E(listB0)).getTime());
        q qVar = q.f422106g;
        int i14 = 0;
        DateRange dateRange = new DateRange(org.threeten.bp.f.H(j12, 0, qVar).f421948b, org.threeten.bp.f.H(Long.parseLong(((Day) C42745f0.Q(listB0)).getTime()), 0, qVar).f421948b);
        int iF2 = P0.f(C42745f0.q(list2, 10));
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (Object obj : list2) {
            linkedHashMap.put(org.threeten.bp.f.H(Long.parseLong(((Day) obj).getTime()), 0, q.f422106g).f421948b, obj);
        }
        ft0.b bVar = new ft0.b(dateRange, this.f10169a, new Ae0.c(linkedHashMap, this), new Ae0.c(this, this.f10170b.a()));
        ArrayList arrayList = new ArrayList();
        n nVarO = n.o(dateRange.f275477b);
        n nVarO2 = n.o(dateRange.f275478c);
        ChronoUnit chronoUnit = ChronoUnit.MONTHS;
        chronoUnit.getClass();
        int iT2 = (int) nVarO.t(nVarO2, chronoUnit);
        int i15 = 1;
        int i16 = iT2 + 1;
        int i17 = 0;
        while (i17 < i16) {
            org.threeten.bp.e eVar = bVar.f396182d;
            arrayList.size();
            String strE = bVar.f396181c.e(eVar);
            ArrayList arrayList2 = new ArrayList();
            J0 j02 = bVar.f396179a;
            arrayList2.add(new com.avito.android.service_booking_calendar.view.month.d(String.valueOf(j02.a()), strE));
            org.threeten.bp.e eVar2 = bVar.f396182d;
            ArrayList arrayList3 = new ArrayList();
            switch (eVar2.E().ordinal()) {
                case 0:
                    i12 = i14;
                    break;
                case 1:
                    i12 = i15;
                    break;
                case 2:
                    i12 = 2;
                    break;
                case 3:
                    i12 = 3;
                    break;
                case 4:
                    i12 = 4;
                    break;
                case 5:
                    i12 = 5;
                    break;
                case 6:
                    i12 = 6;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            for (int i18 = i14; i18 < i12; i18++) {
                arrayList3.add(new d.c(String.valueOf(j02.a())));
            }
            arrayList2.addAll(arrayList3);
            ArrayList arrayList4 = new ArrayList();
            int iJ2 = bVar.f396182d.J();
            for (int i19 = 0; i19 < iJ2; i19++) {
                arrayList4.add(new d.a(String.valueOf(j02.a()), bVar.f396180b.f(bVar.f396182d)));
                bVar.f396182d = bVar.f396182d.S(1L);
            }
            arrayList2.addAll(arrayList4);
            ArrayList arrayList5 = new ArrayList();
            switch (bVar.f396182d.E().ordinal()) {
                case 0:
                    i13 = 0;
                    break;
                case 1:
                    i13 = 6;
                    break;
                case 2:
                    i13 = 5;
                    break;
                case 3:
                    i13 = 4;
                    break;
                case 4:
                    i13 = 3;
                    break;
                case 5:
                    i13 = 2;
                    break;
                case 6:
                    i13 = 1;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            for (int i22 = 0; i22 < i13; i22++) {
                arrayList5.add(new d.c(String.valueOf(j02.a())));
            }
            arrayList2.addAll(arrayList5);
            arrayList.addAll(arrayList2);
            i17++;
            i15 = 1;
            i14 = 0;
        }
        return arrayList;
    }
}
