package ft0;

import Y61.k;
import com.avito.android.J0;
import com.avito.android.service_booking_calendar.days_producer.DateRange;
import com.yandex.div2.D8;
import ft0.InterfaceC40478a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import org.threeten.bp.DayOfWeek;
import org.threeten.bp.e;

/* compiled from: CalendarDataProducer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lft0/b;", "Lft0/a;", "_avito-discouraged_avito-libs_service-booking-calendar"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements InterfaceC40478a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f396179a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC40478a.InterfaceC11180a f396180b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC40478a.b f396181c;

    /* renamed from: d, reason: collision with root package name */
    public e f396182d;

    /* compiled from: CalendarDataProducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DayOfWeek.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                DayOfWeek dayOfWeek = DayOfWeek.f421836b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                DayOfWeek dayOfWeek2 = DayOfWeek.f421836b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                DayOfWeek dayOfWeek3 = DayOfWeek.f421836b;
                iArr[3] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                DayOfWeek dayOfWeek4 = DayOfWeek.f421836b;
                iArr[4] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                DayOfWeek dayOfWeek5 = DayOfWeek.f421836b;
                iArr[5] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                DayOfWeek dayOfWeek6 = DayOfWeek.f421836b;
                iArr[6] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public b(@k DateRange dateRange, @k J0 j02, @k InterfaceC40478a.InterfaceC11180a interfaceC11180a, @k InterfaceC40478a.b bVar) {
        this.f396179a = j02;
        this.f396180b = interfaceC11180a;
        this.f396181c = bVar;
        e eVar = dateRange.f275477b;
        this.f396182d = eVar.f421943d != 1 ? e.N(eVar.f421941b, eVar.f421942c, 1) : eVar;
    }

    public /* synthetic */ b(DateRange dateRange, J0 j02, InterfaceC40478a.InterfaceC11180a interfaceC11180a, InterfaceC40478a.b bVar, int i12, C42822w c42822w) {
        this(dateRange, j02, (i12 & 4) != 0 ? new D8(15) : interfaceC11180a, (i12 & 8) != 0 ? new D8(16) : bVar);
    }
}
