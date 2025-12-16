package U10;

import U10.d;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientFormState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LU10/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c extends q {

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final a f16107e = new a(null);

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final c f16108f = new c(null, d.f.f16132a, null);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final T10.c f16109b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f16110c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DeepLink f16111d;

    /* compiled from: ApplicationClientFormState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LU10/c$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public c(@l T10.c cVar, @k d dVar, @l DeepLink deepLink) {
        this.f16109b = cVar;
        this.f16110c = dVar;
        this.f16111d = deepLink;
    }

    public static c a(c cVar, T10.c cVar2, d dVar, DeepLink deepLink, int i12) {
        if ((i12 & 1) != 0) {
            cVar2 = cVar.f16109b;
        }
        if ((i12 & 4) != 0) {
            deepLink = cVar.f16111d;
        }
        cVar.getClass();
        return new c(cVar2, dVar, deepLink);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f16109b, cVar.f16109b) && L.f(this.f16110c, cVar.f16110c) && L.f(this.f16111d, cVar.f16111d);
    }

    public final int hashCode() {
        T10.c cVar = this.f16109b;
        int iHashCode = (this.f16110c.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31)) * 31;
        DeepLink deepLink = this.f16111d;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationClientFormState(forms=");
        sb2.append(this.f16109b);
        sb2.append(", viewState=");
        sb2.append(this.f16110c);
        sb2.append(", redirectDeeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f16111d, ')');
    }
}
