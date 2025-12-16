package PZ;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import kotlin.Metadata;

/* compiled from: ApplicantTypeSelectorAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LPZ/a;", "", "a", "b", "LPZ/a$a;", "LPZ/a$b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface a {

    /* compiled from: ApplicantTypeSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPZ/a$a;", "LPZ/a;", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: PZ.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0850a implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0850a f13135a = new C0850a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C0850a);
        }

        public final int hashCode() {
            return -911877902;
        }

        @k
        public final String toString() {
            return "Accept";
        }
    }

    /* compiled from: ApplicantTypeSelectorAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPZ/a$b;", "LPZ/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ApplicantType f13136a;

        public b(@k ApplicantType applicantType) {
            this.f13136a = applicantType;
        }
    }
}
