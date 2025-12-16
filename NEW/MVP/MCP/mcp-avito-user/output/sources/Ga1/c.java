package Ga1;

import java.util.Calendar;
import ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker;

/* loaded from: classes9.dex */
public final class c implements Ha1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DatePicker f6576a;

    public c(DatePicker datePicker) {
        this.f6576a = datePicker;
    }

    @Override // Ha1.d
    public final void a(Fa1.c cVar) throws NumberFormatException {
        if (cVar == null || !(cVar instanceof Fa1.b)) {
            return;
        }
        f fVar = this.f6576a.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        int i12 = Integer.parseInt(((Fa1.b) cVar).f4791a);
        a aVar = fVar.f6583d;
        aVar.f6574c = i12;
        int i13 = aVar.f6572a;
        int i14 = aVar.f6573b;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i13);
        calendar.set(2, i14);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i12 > actualMaximum) {
            i12 = actualMaximum;
        }
        calendar.set(5, i12);
        aVar.a(calendar.getTimeInMillis());
        f fVar2 = fVar.f6580a.f436621c;
        a aVar2 = (fVar2 != null ? fVar2 : null).f6583d;
    }
}
