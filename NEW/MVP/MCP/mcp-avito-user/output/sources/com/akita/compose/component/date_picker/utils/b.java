package com.akita.compose.component.date_picker.utils;

import Y61.k;
import android.content.Context;
import androidx.compose.runtime.H0;
import com.avito.android.R;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.AbstractC42738c;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.s0;
import kotlin.text.C43044a;

/* compiled from: CalendarModelImpl.kt */
@H0
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/akita/compose/component/date_picker/utils/b;", "Lcom/akita/compose/component/date_picker/utils/a;", "<init>", "()V", "date-picker_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements com.akita.compose.component.date_picker.utils.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ZoneId f61412a = ZoneId.of("UTC");

    /* renamed from: b, reason: collision with root package name */
    public final int f61413b = DayOfWeek.MONDAY.getValue();

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f61414c;

    /* compiled from: CalendarModelImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a<DayOfWeek> f61415a = kotlin.enums.c.a(DayOfWeek.values());
    }

    public b() {
        Locale locale = Locale.getDefault();
        List list = a.f61415a;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        Iterator it = ((AbstractC42738c) list).iterator();
        while (it.hasNext()) {
            arrayList.add(((DayOfWeek) it.next()).getDisplayName(TextStyle.SHORT, locale));
        }
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String string = (String) it2.next();
            if (string.length() > 0) {
                StringBuilder sb2 = new StringBuilder();
                char cCharAt = string.charAt(0);
                sb2.append((Object) (Character.isLowerCase(cCharAt) ? C43044a.f(cCharAt, locale) : String.valueOf(cCharAt)));
                sb2.append(string.substring(1));
                string = sb2.toString();
            }
            arrayList2.add(string);
        }
        this.f61414c = arrayList2;
    }

    public static P2.a p(LocalDate localDate) {
        return new P2.a(localDate.getYear(), localDate.getMonthValue(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * 1000, localDate.getDayOfMonth());
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final boolean a(long j12) {
        return Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate().getDayOfWeek() == DayOfWeek.MONDAY;
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final boolean b(long j12) {
        LocalDate localDate = Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate();
        return localDate.getDayOfMonth() == localDate.lengthOfMonth();
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.b c(@k P2.a aVar) {
        return q(LocalDate.of(aVar.f12783b, aVar.f12784c, 1));
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final boolean d(long j12) {
        LocalDate localDate = Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate();
        return localDate.getDayOfWeek() == DayOfWeek.SATURDAY || localDate.getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final String e(@k Context context, @k P2.b bVar) {
        String str = (String) C42756l.F(bVar.f12788c - 1, context.getResources().getStringArray(R.array.date_picker_month_names));
        return str == null ? context.getString(R.string.month_unknown) : str;
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.a f() {
        LocalDate localDateNow = LocalDate.now();
        return new P2.a(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(this.f61412a).toInstant().toEpochMilli(), localDateNow.getDayOfMonth());
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final boolean g(long j12) {
        return Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate().getDayOfMonth() == 1;
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.a h(@k P2.a aVar) {
        return p(LocalDate.of(aVar.f12783b, aVar.f12784c, aVar.f12785d).plusDays(1));
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final int i(@k P2.b bVar) {
        return LocalDate.of(bVar.f12787b, bVar.f12788c, bVar.f12789d).get(WeekFields.of(DayOfWeek.MONDAY, 1).weekOfMonth());
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.a j(long j12) {
        return p(Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate());
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.b k(long j12) {
        return q(Instant.ofEpochMilli(j12).atZone(this.f61412a).withDayOfMonth(1).toLocalDate());
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    /* renamed from: l, reason: from getter */
    public final ArrayList getF61414c() {
        return this.f61414c;
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.b m(@k P2.b bVar, int i12) {
        return i12 <= 0 ? bVar : q(Instant.ofEpochMilli(bVar.f12791f).atZone(this.f61412a).toLocalDate().plusMonths(i12));
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    @k
    public final P2.a n(@k P2.a aVar) {
        return p(LocalDate.of(aVar.f12783b, aVar.f12784c, aVar.f12785d).minusDays(1));
    }

    @Override // com.akita.compose.component.date_picker.utils.a
    public final boolean o(long j12) {
        return Instant.ofEpochMilli(j12).atZone(this.f61412a).toLocalDate().getDayOfWeek() == DayOfWeek.SUNDAY;
    }

    public final P2.b q(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f61413b;
        if (value < 0) {
            value += 7;
        }
        return new P2.b(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(this.f61412a).toInstant().toEpochMilli());
    }
}
