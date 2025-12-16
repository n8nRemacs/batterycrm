package T50;

import Y61.k;
import Y61.l;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectSpecificOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LT50/b;", "", "a", "b", "LT50/b$a;", "LT50/b$b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: SelectSpecificOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT50/b$a;", "LT50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Navigation f15367a;

        public a(@k Navigation navigation2) {
            this.f15367a = navigation2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f15367a, ((a) obj).f15367a);
        }

        public final int hashCode() {
            return this.f15367a.hashCode();
        }

        @k
        public final String toString() {
            return "Navigate(navigation=" + this.f15367a + ')';
        }
    }

    /* compiled from: SelectSpecificOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT50/b$b;", "LT50/b;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: T50.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1047b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f15368a;

        public C1047b(@k Throwable th2) {
            this.f15368a = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1047b) && L.f(this.f15368a, ((C1047b) obj).f15368a);
        }

        public final int hashCode() {
            return this.f15368a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("ShowCommonErrorToastBar(throwable="), this.f15368a, ')');
        }
    }
}
