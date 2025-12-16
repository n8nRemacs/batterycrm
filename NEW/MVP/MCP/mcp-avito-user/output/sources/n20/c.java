package n20;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage_invite.lead.mvi.entity.LeadType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationLeadState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln20/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f414862e = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f414863b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f414864c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LeadType f414865d;

    /* compiled from: ApplicationLeadState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln20/c$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l String str, @l String str2, @k LeadType leadType) {
        this.f414863b = str;
        this.f414864c = str2;
        this.f414865d = leadType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f414863b, cVar.f414863b) && L.f(this.f414864c, cVar.f414864c) && this.f414865d == cVar.f414865d;
    }

    public final int hashCode() {
        String str = this.f414863b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f414864c;
        return this.f414865d.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ApplicationLeadState(sourceType=" + this.f414863b + ", utmSource=" + this.f414864c + ", selectedLead=" + this.f414865d + ')';
    }
}
