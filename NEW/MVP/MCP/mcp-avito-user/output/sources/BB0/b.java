package BB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoSfTermsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LBB0/b;", "", "a", "b", "c", "d", "LBB0/b$a;", "LBB0/b$b;", "LBB0/b$c;", "LBB0/b$d;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface b {

    /* compiled from: TariffCpxInfoSfTermsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBB0/b$a;", "LBB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f1231a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1278987049;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: TariffCpxInfoSfTermsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBB0/b$b;", "LBB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: BB0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0046b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApiException f1232a;

        public C0046b(@k ApiException apiException) {
            this.f1232a = apiException;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0046b) && this.f1232a.equals(((C0046b) obj).f1232a);
        }

        public final int hashCode() {
            return this.f1232a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.q(new StringBuilder("ShowError(error="), this.f1232a, ')');
        }
    }

    /* compiled from: TariffCpxInfoSfTermsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LBB0/b$c;", "LBB0/b;", "<init>", "()V", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f1233a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -934583885;
        }

        @k
        public final String toString() {
            return "ShowSaveLoading";
        }
    }

    /* compiled from: TariffCpxInfoSfTermsOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBB0/b$d;", "LBB0/b;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f1234a;

        public d(@k String str) {
            this.f1234a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f1234a, ((d) obj).f1234a);
        }

        public final int hashCode() {
            return this.f1234a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowToastMessageAndClose(message="), this.f1234a, ')');
        }
    }
}
