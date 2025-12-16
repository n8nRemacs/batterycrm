package fp;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import bn0.C25683a;
import com.avito.android.analytics.screens.mvi.q;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ClientRoomState.kt */
@P
@J41.b
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lfp/g;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class g extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f396117f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396118b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f396119c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final c f396120d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final C25683a f396121e;

    /* compiled from: ClientRoomState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfp/g$a;", "", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ g(String str, String str2, c cVar, C25683a c25683a, int i12, C42822w c42822w) {
        this(str, str2, cVar, (i12 & 8) != 0 ? null : c25683a);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f396118b, gVar.f396118b) && L.f(this.f396119c, gVar.f396119c) && L.f(this.f396120d, gVar.f396120d) && L.f(this.f396121e, gVar.f396121e);
    }

    public final int hashCode() {
        int iHashCode = this.f396118b.hashCode() * 31;
        String str = this.f396119c;
        int iHashCode2 = (this.f396120d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        C25683a c25683a = this.f396121e;
        return iHashCode2 + (c25683a != null ? c25683a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ClientRoomState(title=" + this.f396118b + ", subtitle=" + this.f396119c + ", partnerInfo=" + this.f396120d + ", review=" + this.f396121e + ')';
    }

    public g(@k String str, @l String str2, @k c cVar, @l C25683a c25683a) {
        this.f396118b = str;
        this.f396119c = str2;
        this.f396120d = cVar;
        this.f396121e = c25683a;
    }
}
