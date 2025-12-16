package Q00;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.pre_approval.model.PreApprovalArguments;
import com.avito.android.select.Arguments;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PreApprovalFormOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LQ00/b;", "", "a", "b", "c", "d", "e", "LQ00/b$a;", "LQ00/b$b;", "LQ00/b$c;", "LQ00/b$d;", "LQ00/b$e;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PreApprovalFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/b$a;", "LQ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f13415a = new a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -653860252;
        }

        @k
        public final String toString() {
            return "CloseForm";
        }
    }

    /* compiled from: PreApprovalFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/b$b;", "LQ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Q00.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0880b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0880b f13416a = new C0880b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0880b);
        }

        public final int hashCode() {
            return 1614513857;
        }

        @k
        public final String toString() {
            return "HideKeyboard";
        }
    }

    /* compiled from: PreApprovalFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LQ00/b$c;", "LQ00/b;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f13417a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1507469783;
        }

        @k
        public final String toString() {
            return "OpenAuthorization";
        }
    }

    /* compiled from: PreApprovalFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/b$d;", "LQ00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PreApprovalArguments f13418a;

        public d(@k PreApprovalArguments preApprovalArguments) {
            this.f13418a = preApprovalArguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f13418a, ((d) obj).f13418a);
        }

        public final int hashCode() {
            return this.f13418a.hashCode();
        }

        @k
        public final String toString() {
            return "OpenNextScreen(arguments=" + this.f13418a + ')';
        }
    }

    /* compiled from: PreApprovalFormOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ00/b$e;", "LQ00/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f13419a;

        public e(@k Arguments arguments) {
            this.f13419a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f13419a, ((e) obj).f13419a);
        }

        public final int hashCode() {
            return this.f13419a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("OpenSelector(args="), this.f13419a, ')');
        }
    }
}
