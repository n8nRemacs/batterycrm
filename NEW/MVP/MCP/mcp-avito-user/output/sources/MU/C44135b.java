package mu;

import Y61.k;
import com.avito.android.date_time_picker.DateTimeWheel;
import kotlin.Metadata;
import lu.InterfaceC43831a;

/* compiled from: HourDelegateFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmu/b;", "Lmu/a;", "<init>", "()V", "_avito_date-time-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: mu.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C44135b implements InterfaceC44134a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final C44135b f414793a = new C44135b();

    @Override // mu.InterfaceC44134a
    public final InterfaceC43831a a(DateTimeWheel dateTimeWheel) {
        Integer num = dateTimeWheel.f132590b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = dateTimeWheel.f132591c;
        return new lu.e(iIntValue, num2 != null ? num2.intValue() : 23);
    }
}
