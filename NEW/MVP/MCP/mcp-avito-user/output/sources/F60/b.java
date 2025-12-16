package f60;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.passport.network.model.BusinessVrfDuplication;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.printable_text.PrintableText;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfilesListEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lf60/b;", "", "a", "b", "c", "d", "Lf60/b$a;", "Lf60/b$b;", "Lf60/b$c;", "Lf60/b$d;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: ProfilesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/b$a;", "Lf60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f395666a;

        public a(@k PrintableText printableText) {
            this.f395666a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f395666a, ((a) obj).f395666a);
        }

        public final int hashCode() {
            return this.f395666a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("Finished(successText="), this.f395666a, ')');
        }
    }

    /* compiled from: ProfilesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/b$b;", "Lf60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: f60.b$b, reason: collision with other inner class name */
    public static final class C11127b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Throwable f395667a;

        public C11127b(@k Throwable th2) {
            this.f395667a = th2;
        }
    }

    /* compiled from: ProfilesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/b$c;", "Lf60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BusinessVrfDuplication f395668a;

        public c(@k BusinessVrfDuplication businessVrfDuplication) {
            this.f395668a = businessVrfDuplication;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395668a, ((c) obj).f395668a);
        }

        public final int hashCode() {
            return this.f395668a.hashCode();
        }

        @k
        public final String toString() {
            return "SelectBusinessVrfDuplication(businessVrfDuplication=" + this.f395668a + ')';
        }
    }

    /* compiled from: ProfilesListEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/b$d;", "Lf60/b;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<MergeAccountsProfile> f395669a;

        public d(@k List<MergeAccountsProfile> list) {
            this.f395669a = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f395669a, ((d) obj).f395669a);
        }

        public final int hashCode() {
            return this.f395669a.hashCode();
        }

        @k
        public final String toString() {
            return H.p(new StringBuilder("SelectProfileToConvert(profilesToConvert="), this.f395669a, ')');
        }
    }
}
