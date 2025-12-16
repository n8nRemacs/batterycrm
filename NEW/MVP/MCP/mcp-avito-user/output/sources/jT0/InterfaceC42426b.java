package jt0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalendarHeaderOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Ljt0/b;", "", "a", "b", "Ljt0/b$a;", "Ljt0/b$b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: jt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC42426b {

    /* compiled from: CalendarHeaderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ljt0/b$a;", "Ljt0/b;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.b$a */
    public static final class a implements InterfaceC42426b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f405885a = new a();
    }

    /* compiled from: CalendarHeaderOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljt0/b$b;", "Ljt0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: jt0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C11588b implements InterfaceC42426b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f405886a;

        public C11588b(@k DeepLink deepLink) {
            this.f405886a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11588b) && L.f(this.f405886a, ((C11588b) obj).f405886a);
        }

        public final int hashCode() {
            return this.f405886a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("LaunchDeepLink(deepLink="), this.f405886a, ')');
        }
    }
}
