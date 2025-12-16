package com.yandex.metrica.profile;

import android.annotation.SuppressLint;
import com.avito.android.beduin.common.component.select_calendar.BeduinSelectCalendarModel;
import com.yandex.metrica.impl.ob.Dn;
import com.yandex.metrica.impl.ob.InterfaceC38705bf;
import com.yandex.metrica.impl.ob.Ke;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Xe;
import com.yandex.metrica.impl.ob.Ye;
import com.yandex.metrica.impl.ob.Ym;
import j.N;
import j.k0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes7.dex */
public class BirthDateAttribute {

    /* renamed from: a, reason: collision with root package name */
    public final Pe f382487a = new Pe("appmetrica_birth_date", new Dn(), new Xe());

    @k0
    @SuppressLint({"SimpleDateFormat"})
    public final UserProfileUpdate<? extends InterfaceC38705bf> a(@N Calendar calendar, @N String str, @N Ke ke2) {
        return new UserProfileUpdate<>(new Ye(this.f382487a.a(), new SimpleDateFormat(str).format(calendar.getTime()), new Ym(), new Dn(), ke2));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withAge(int i12) {
        int i13 = Calendar.getInstance(Locale.US).get(1) - i12;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        return a(gregorianCalendar, "yyyy", new Me(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withAgeIfUndefined(int i12) {
        int i13 = Calendar.getInstance(Locale.US).get(1) - i12;
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i13);
        return a(gregorianCalendar, "yyyy", new We(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDate(int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        return a(gregorianCalendar, "yyyy", new Me(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDateIfUndefined(int i12) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        return a(gregorianCalendar, "yyyy", new We(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(0, this.f382487a.a(), new Dn(), new Xe()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDate(int i12, int i13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new Me(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDateIfUndefined(int i12, int i13) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, 1);
        return a(gregorianCalendar, "yyyy-MM", new We(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDate(int i12, int i13, int i14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, i14);
        return a(gregorianCalendar, BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Me(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDateIfUndefined(int i12, int i13, int i14) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(1, i12);
        gregorianCalendar.set(2, i13 - 1);
        gregorianCalendar.set(5, i14);
        return a(gregorianCalendar, BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new We(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDate(@N Calendar calendar) {
        return a(calendar, BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new Me(this.f382487a.c()));
    }

    public UserProfileUpdate<? extends InterfaceC38705bf> withBirthDateIfUndefined(@N Calendar calendar) {
        return a(calendar, BeduinSelectCalendarModel.DEFAULT_DATE_FORMAT, new We(this.f382487a.c()));
    }
}
