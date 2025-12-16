package androidx.compose.material3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LegacyCalendarModelImpl.jvm.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/material3/V8;", "Landroidx/compose/material3/l2;", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class V8 extends AbstractC21692l2 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f35668b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final TimeZone f35669c = TimeZone.getTimeZone("UTC");

    /* compiled from: LegacyCalendarModelImpl.jvm.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/V8$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final String a(long j12, @Y61.k String str, @Y61.k Locale locale) {
        LinkedHashMap linkedHashMap = this.f36772a;
        a aVar = f35668b;
        aVar.getClass();
        String str2 = str + locale.toLanguageTag();
        Object obj = linkedHashMap.get(str2);
        TimeZone timeZone = f35669c;
        Object obj2 = obj;
        if (obj == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
            aVar.getClass();
            simpleDateFormat.setTimeZone(timeZone);
            linkedHashMap.put(str2, simpleDateFormat);
            obj2 = simpleDateFormat;
        }
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.setTimeInMillis(j12);
        return ((SimpleDateFormat) obj2).format(Long.valueOf(calendar.getTimeInMillis()));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21669k2 b(long j12) {
        Calendar calendar = Calendar.getInstance(f35669c);
        calendar.setTimeInMillis(j12);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new C21669k2(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis(), calendar.get(5));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final M3 c(@Y61.k Locale locale) {
        return C21738n2.a(((SimpleDateFormat) DateFormat.getDateInstance(3, locale)).toPattern());
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    /* renamed from: d */
    public final int getF36821b() {
        return 0;
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 e(int i12, int i13) {
        Calendar calendar = Calendar.getInstance(f35669c);
        calendar.clear();
        calendar.set(1, i12);
        calendar.set(2, i13 - 1);
        calendar.set(5, 1);
        return l(calendar);
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 f(long j12) {
        Calendar calendar = Calendar.getInstance(f35669c);
        calendar.setTimeInMillis(j12);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return l(calendar);
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 g(@Y61.k C21669k2 c21669k2) {
        return e(c21669k2.f36699b, c21669k2.f36700c);
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21669k2 h() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new C21669k2(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15), calendar.get(5));
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final List<kotlin.Q<String, String>> i() {
        return null;
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.l
    public final C21669k2 j(@Y61.k String str, @Y61.k String str2) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
        TimeZone timeZone = f35669c;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date = simpleDateFormat.parse(str);
            if (date == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date);
            return new C21669k2(calendar.get(1), calendar.get(2) + 1, calendar.getTimeInMillis(), calendar.get(5));
        } catch (ParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.AbstractC21692l2
    @Y61.k
    public final C21784p2 k(@Y61.k C21784p2 c21784p2, int i12) {
        if (i12 <= 0) {
            return c21784p2;
        }
        Calendar calendar = Calendar.getInstance(f35669c);
        calendar.setTimeInMillis(c21784p2.f37014e);
        calendar.add(2, i12);
        return l(calendar);
    }

    public final C21784p2 l(Calendar calendar) {
        int i12 = (calendar.get(7) + 6) % 7;
        int i13 = i12 != 0 ? i12 : 7;
        if (i13 < 0) {
            i13 += 7;
        }
        return new C21784p2(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), i13, calendar.getTimeInMillis());
    }

    @Y61.k
    public final String toString() {
        return "LegacyCalendarModel";
    }
}
