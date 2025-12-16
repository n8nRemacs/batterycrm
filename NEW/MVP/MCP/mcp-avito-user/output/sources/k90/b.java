package K90;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.RemoveActionDeeplink;
import com.avito.android.profile.remove.confirm.ProfileRemoveConfirmDialogParams;
import com.avito.android.profile.remove.screen.get_money.HowToReturnMoneyParams;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileRemoveOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LK90/b;", "", "a", "b", "c", "d", "e", "LK90/b$a;", "LK90/b$b;", "LK90/b$c;", "LK90/b$d;", "LK90/b$e;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ProfileRemoveOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/b$a;", "LK90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9286a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final HowToReturnMoneyParams f9287b;

        public a(@k String str, @k HowToReturnMoneyParams howToReturnMoneyParams) {
            this.f9286a = str;
            this.f9287b = howToReturnMoneyParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f9286a, aVar.f9286a) && L.f(this.f9287b, aVar.f9287b);
        }

        public final int hashCode() {
            return this.f9287b.hashCode() + (this.f9286a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenHowGetMoneyScreen(screenKey=" + this.f9286a + ", params=" + this.f9287b + ')';
        }
    }

    /* compiled from: ProfileRemoveOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/b$b;", "LK90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: K90.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0557b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9288a;

        public C0557b(@k String str) {
            this.f9288a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0557b) && L.f(this.f9288a, ((C0557b) obj).f9288a);
        }

        public final int hashCode() {
            return this.f9288a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenItemsScreen(screenKey="), this.f9288a, ')');
        }
    }

    /* compiled from: ProfileRemoveOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/b$c;", "LK90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ProfileRemoveConfirmDialogParams f9289a;

        public c(@l ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams) {
            this.f9289a = profileRemoveConfirmDialogParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f9289a, ((c) obj).f9289a);
        }

        public final int hashCode() {
            ProfileRemoveConfirmDialogParams profileRemoveConfirmDialogParams = this.f9289a;
            if (profileRemoveConfirmDialogParams == null) {
                return 0;
            }
            return profileRemoveConfirmDialogParams.hashCode();
        }

        @k
        public final String toString() {
            return "ShowConfirmDialog(params=" + this.f9289a + ')';
        }
    }

    /* compiled from: ProfileRemoveOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/b$d;", "LK90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final RemoveActionDeeplink f9290a;

        public d(@k RemoveActionDeeplink removeActionDeeplink) {
            this.f9290a = removeActionDeeplink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f9290a, ((d) obj).f9290a);
        }

        public final int hashCode() {
            return this.f9290a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowConfirmScreen(deeplink=" + this.f9290a + ')';
        }
    }

    /* compiled from: ProfileRemoveOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LK90/b$e;", "LK90/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f9291a;

        public e(@k String str) {
            this.f9291a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f9291a, ((e) obj).f9291a);
        }

        public final int hashCode() {
            return this.f9291a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSnackbar(message="), this.f9291a, ')');
        }
    }
}
