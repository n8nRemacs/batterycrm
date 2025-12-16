package lu;

import com.avito.android.lib.design.picker.m;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.Metadata;

/* compiled from: DateTimeDelegate.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b`\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llu/a;", "", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lu.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public interface InterfaceC43831a {

    /* compiled from: DateTimeDelegate.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: lu.a$a, reason: collision with other inner class name */
    public static final class C11806a {
        @Y61.k
        public static m a() {
            return new m(null, true, 0, 5, null);
        }
    }

    @Y61.k
    com.avito.android.lib.design.picker.k a(@Y61.k GregorianCalendar gregorianCalendar);

    void b(@Y61.k com.avito.android.lib.design.picker.k<?> kVar, @Y61.k Calendar calendar);

    @Y61.k
    ArrayList<com.avito.android.lib.design.picker.k<?>> getData();

    @Y61.k
    m getStyle();
}
