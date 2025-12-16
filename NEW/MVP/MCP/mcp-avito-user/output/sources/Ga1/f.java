package Ga1;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import ru.mts.biometry.sdk.view.modalcard.wheel.picker.date.DatePicker;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: i, reason: collision with root package name */
    public static final DateFormatSymbols f6579i = new DateFormatSymbols();

    /* renamed from: a, reason: collision with root package name */
    public final DatePicker f6580a;

    /* renamed from: b, reason: collision with root package name */
    public a f6581b;

    /* renamed from: c, reason: collision with root package name */
    public a f6582c;

    /* renamed from: d, reason: collision with root package name */
    public a f6583d;

    /* renamed from: e, reason: collision with root package name */
    public int f6584e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f6585f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f6586g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f6587h;

    public f(DatePicker datePicker) {
        this.f6580a = datePicker;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, 1900);
        calendar.set(2, 0);
        int actualMaximum = calendar.getActualMaximum(5);
        calendar.set(5, 1 <= actualMaximum ? 1 : actualMaximum);
        this.f6582c = new a(calendar.getTimeInMillis());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(1, 2100);
        calendar2.set(2, 11);
        int actualMaximum2 = calendar2.getActualMaximum(5);
        calendar2.set(5, 31 <= actualMaximum2 ? 31 : actualMaximum2);
        this.f6581b = new a(calendar2.getTimeInMillis());
        this.f6585f = true;
        this.f6586g = true;
        this.f6587h = true;
        Calendar calendar3 = Calendar.getInstance();
        calendar3.set(11, 0);
        calendar3.set(12, 0);
        calendar3.set(13, 0);
        calendar3.set(14, 0);
        this.f6583d = new a(calendar3.getTimeInMillis());
    }

    public final void a(int i12) {
        int i13;
        int i14;
        a aVar = this.f6583d;
        aVar.f6572a = i12;
        a aVar2 = this.f6582c;
        if (i12 == aVar2.f6572a && ((i13 = aVar.f6573b) < (i14 = aVar2.f6573b) || i13 > (i14 = this.f6581b.f6573b))) {
            aVar.f6573b = i14;
        }
        int i15 = aVar.f6573b;
        int i16 = aVar.f6574c;
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, i12);
        calendar.set(2, i15);
        int actualMaximum = calendar.getActualMaximum(5);
        if (i16 > actualMaximum) {
            i16 = actualMaximum;
        }
        calendar.set(5, i16);
        aVar.a(calendar.getTimeInMillis());
        DatePicker datePicker = this.f6580a;
        datePicker.c();
        datePicker.b();
        f fVar = datePicker.f436621c;
        if (fVar == null) {
            fVar = null;
        }
        a aVar3 = fVar.f6583d;
    }
}
