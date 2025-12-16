package Ga1;

import java.util.Calendar;
import ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker;

/* loaded from: classes9.dex */
public final class d implements Ha1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePicker f6577a;

    public d(DatePicker datePicker) {
        this.f6577a = datePicker;
    }

    @Override // Ha1.d
    public final void a(Fa1.c cVar) {
        if (cVar == null || !(cVar instanceof Fa1.b)) {
            return;
        }
        f fVar = this.f6577a.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        int iOrdinal = h.a(((Fa1.b) cVar).f4791a).ordinal();
        a aVar = fVar.f6583d;
        aVar.f6573b = iOrdinal;
        int i12 = aVar.f6572a;
        int i13 = aVar.f6574c;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i12);
        calendar.set(2, iOrdinal);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i13 > actualMaximum) {
            i13 = actualMaximum;
        }
        calendar.set(5, i13);
        aVar.a(calendar.getTimeInMillis());
        DatePicker datePicker = fVar.f6580a;
        datePicker.b();
        f fVar2 = datePicker.f436621c;
        a aVar2 = (fVar2 != null ? fVar2 : null).f6583d;
    }
}
