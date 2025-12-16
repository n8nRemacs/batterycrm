package PZ;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage.applicant_type.model.ApplicantType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicantTypeSelectorState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LPZ/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f13138e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f13139f = new c("", "", ApplicantType.f198304c);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f13140b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f13141c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ApplicantType f13142d;

    /* compiled from: ApplicantTypeSelectorState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LPZ/c$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k String str, @k String str2, @k ApplicantType applicantType) {
        this.f13140b = str;
        this.f13141c = str2;
        this.f13142d = applicantType;
    }

    public static c a(c cVar, String str, String str2, ApplicantType applicantType, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f13140b;
        }
        if ((i12 & 2) != 0) {
            str2 = cVar.f13141c;
        }
        if ((i12 & 4) != 0) {
            applicantType = cVar.f13142d;
        }
        cVar.getClass();
        return new c(str, str2, applicantType);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f13140b, cVar.f13140b) && L.f(this.f13141c, cVar.f13141c) && this.f13142d == cVar.f13142d;
    }

    public final int hashCode() {
        return this.f13142d.hashCode() + H.d(this.f13140b.hashCode() * 31, 31, this.f13141c);
    }

    @k
    public final String toString() {
        return "ApplicantTypeSelectorState(applicationId=" + this.f13140b + ", applicationStage=" + this.f13141c + ", applicantType=" + this.f13142d + ')';
    }
}
