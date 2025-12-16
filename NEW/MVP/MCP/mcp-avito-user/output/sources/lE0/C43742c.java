package le0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: InputImeiState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lle0/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: le0.c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C43742c extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f413973d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final C43742c f413974e = new C43742c("", null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f413975b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Boolean f413976c;

    /* compiled from: InputImeiState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lle0/c$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: le0.c$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C43742c(@k String str, @l Boolean bool) {
        this.f413975b = str;
        this.f413976c = bool;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43742c)) {
            return false;
        }
        C43742c c43742c = (C43742c) obj;
        return L.f(this.f413975b, c43742c.f413975b) && L.f(this.f413976c, c43742c.f413976c);
    }

    public final int hashCode() {
        int iHashCode = this.f413975b.hashCode() * 31;
        Boolean bool = this.f413976c;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InputImeiState(imeiText=");
        sb2.append(this.f413975b);
        sb2.append(", shouldSaveDraft=");
        return C0.g(sb2, this.f413976c, ')');
    }
}
