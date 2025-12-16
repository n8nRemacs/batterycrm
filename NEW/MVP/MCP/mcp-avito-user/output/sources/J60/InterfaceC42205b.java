package j60;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.profiles_list.ProfilesListResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PassportProfilesListOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lj60/b;", "", "a", "b", "Lj60/b$a;", "Lj60/b$b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: j60.b, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC42205b {

    /* compiled from: PassportProfilesListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lj60/b$a;", "Lj60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.b$a */
    public static final /* data */ class a implements InterfaceC42205b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ProfilesListResult f405434a;

        public a(@k ProfilesListResult profilesListResult) {
            this.f405434a = profilesListResult;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f405434a, ((a) obj).f405434a);
        }

        public final int hashCode() {
            return this.f405434a.hashCode();
        }

        @k
        public final String toString() {
            return "Close(result=" + this.f405434a + ')';
        }
    }

    /* compiled from: PassportProfilesListOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj60/b$b;", "Lj60/b;", "<init>", "()V", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: j60.b$b, reason: collision with other inner class name */
    public static final class C11548b implements InterfaceC42205b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11548b f405435a = new C11548b();
    }
}
