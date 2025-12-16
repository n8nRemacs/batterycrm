package c40;

import AK.c;
import Y61.k;
import Y61.l;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: NotificationsSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lc40/b;", "", "a", "b", "Lc40/b$a;", "Lc40/b$b;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c40.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26937b {

    /* compiled from: NotificationsSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc40/b$a;", "Lc40/b;", "<init>", "()V", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c40.b$a */
    public static final class a implements InterfaceC26937b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f57634a = new a();
    }

    /* compiled from: NotificationsSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc40/b$b;", "Lc40/b;", "_avito_notifications-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c40.b$b, reason: collision with other inner class name */
    public static final /* data */ class C2029b implements InterfaceC26937b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f57635a;

        public C2029b(@k PrintableText printableText) {
            this.f57635a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C2029b) && L.f(this.f57635a, ((C2029b) obj).f57635a);
        }

        public final int hashCode() {
            return this.f57635a.hashCode();
        }

        @k
        public final String toString() {
            return c.m(new StringBuilder("ShowErrorToast(error="), this.f57635a, ')');
        }
    }
}
