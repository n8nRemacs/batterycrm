package KN;

import Y61.k;
import Y61.l;
import com.avito.android.inline_filters.dialog.calendar.models.CalendarPickerConstraints;
import com.avito.android.util.K;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.operators.observable.C41998x0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import wy0.C49704a;

/* compiled from: FiltersCalendarPickerInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LKN/g;", "LKN/f;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.server_time.f f9439a;

    @Inject
    public g(@k com.avito.android.server_time.f fVar) {
        this.f9439a = fVar;
    }

    @Override // KN.f
    @k
    public final C41998x0 a(@l CalendarPickerConstraints calendarPickerConstraints) {
        Calendar calendarA = C49704a.a();
        Date date = calendarPickerConstraints != null ? calendarPickerConstraints.f171254b : null;
        com.avito.android.server_time.f fVar = this.f9439a;
        if (date != null) {
            calendarA.setTimeInMillis(calendarPickerConstraints.f171254b.getTime());
        } else {
            calendarA.setTimeInMillis(fVar.now());
        }
        K.a(calendarA);
        Calendar calendarA2 = C49704a.a();
        if ((calendarPickerConstraints != null ? calendarPickerConstraints.f171255c : null) != null) {
            calendarA2.setTimeInMillis(calendarPickerConstraints.f171255c.getTime());
        } else {
            calendarA2.setTimeInMillis(fVar.now());
            calendarA2.add(2, 7);
        }
        int i12 = (calendarPickerConstraints == null || !calendarPickerConstraints.f171256d) ? 1 : 0;
        ArrayList arrayList = new ArrayList();
        while (calendarA.getTimeInMillis() <= calendarA2.getTimeInMillis()) {
            arrayList.add(new MN.c(calendarA.getTime(), i12));
            calendarA.add(6, 1);
        }
        return z.c0(new P2.b(C42745f0.M0(arrayList)));
    }
}
