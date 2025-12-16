package W10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.F3;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import com.avito.android.mortgage_invite.client_search.mvi.entity.PagingState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ClientSearchState.kt */
@F3
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LW10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f17557g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final c f17558h = new c("", "", "", C42784z0.f406748b, PagingState.f205437b);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f17559b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f17560c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f17561d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<MortgageClient> f17562e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final PagingState f17563f;

    /* compiled from: ClientSearchState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LW10/c$a;", "", "<init>", "()V", "", "PAGE_SIZE", "I", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@k String str, @k String str2, @k String str3, @k List<MortgageClient> list, @k PagingState pagingState) {
        this.f17559b = str;
        this.f17560c = str2;
        this.f17561d = str3;
        this.f17562e = list;
        this.f17563f = pagingState;
    }

    public static c a(c cVar, String str, String str2, String str3, List list, PagingState pagingState, int i12) {
        if ((i12 & 1) != 0) {
            str = cVar.f17559b;
        }
        String str4 = str;
        if ((i12 & 2) != 0) {
            str2 = cVar.f17560c;
        }
        String str5 = str2;
        if ((i12 & 4) != 0) {
            str3 = cVar.f17561d;
        }
        String str6 = str3;
        if ((i12 & 8) != 0) {
            list = cVar.f17562e;
        }
        List list2 = list;
        if ((i12 & 16) != 0) {
            pagingState = cVar.f17563f;
        }
        cVar.getClass();
        return new c(str4, str5, str6, list2, pagingState);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f17559b, cVar.f17559b) && L.f(this.f17560c, cVar.f17560c) && L.f(this.f17561d, cVar.f17561d) && L.f(this.f17562e, cVar.f17562e) && this.f17563f == cVar.f17563f;
    }

    public final int hashCode() {
        return this.f17563f.hashCode() + H.e(H.d(H.d(this.f17559b.hashCode() * 31, 31, this.f17560c), 31, this.f17561d), 31, this.f17562e);
    }

    @k
    public final String toString() {
        return "ClientSearchState(screenTitle=" + this.f17559b + ", fieldPlaceholder=" + this.f17560c + ", query=" + this.f17561d + ", clients=" + this.f17562e + ", pagingState=" + this.f17563f + ')';
    }
}
