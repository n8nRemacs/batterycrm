package RK0;

import Y61.k;
import java.util.Calendar;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TimeZoneProviderImpl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRK0/b;", "LRK0/a;", "<init>", "()V", "_common-discouraged_utils_android"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // RK0.a
    @k
    public final String a() {
        return Calendar.getInstance().getTimeZone().getID();
    }
}
