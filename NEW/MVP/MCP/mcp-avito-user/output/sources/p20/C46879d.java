package p20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import p20.e;

/* compiled from: ParticipantState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lp20/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: p20.d, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C46879d extends q {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f428144f = new a(null);

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final C46879d f428145g = new C46879d(null, null, true, e.d.f428152a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final o20.c f428146b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final MortgageClient f428147c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f428148d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final e f428149e;

    /* compiled from: ParticipantState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp20/d$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: p20.d$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public C46879d(@l o20.c cVar, @l MortgageClient mortgageClient, boolean z12, @k e eVar) {
        this.f428146b = cVar;
        this.f428147c = mortgageClient;
        this.f428148d = z12;
        this.f428149e = eVar;
    }

    public static C46879d a(C46879d c46879d, o20.c cVar, MortgageClient mortgageClient, boolean z12, e eVar, int i12) {
        if ((i12 & 1) != 0) {
            cVar = c46879d.f428146b;
        }
        if ((i12 & 2) != 0) {
            mortgageClient = c46879d.f428147c;
        }
        c46879d.getClass();
        if ((i12 & 8) != 0) {
            z12 = c46879d.f428148d;
        }
        if ((i12 & 16) != 0) {
            eVar = c46879d.f428149e;
        }
        c46879d.getClass();
        return new C46879d(cVar, mortgageClient, z12, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46879d)) {
            return false;
        }
        C46879d c46879d = (C46879d) obj;
        return L.f(this.f428146b, c46879d.f428146b) && L.f(this.f428147c, c46879d.f428147c) && L.f(null, null) && this.f428148d == c46879d.f428148d && L.f(this.f428149e, c46879d.f428149e);
    }

    public final int hashCode() {
        o20.c cVar = this.f428146b;
        int iHashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        MortgageClient mortgageClient = this.f428147c;
        return this.f428149e.hashCode() + r.i((iHashCode + (mortgageClient != null ? mortgageClient.hashCode() : 0)) * 961, 31, this.f428148d);
    }

    @k
    public final String toString() {
        return "ParticipantState(form=" + this.f428146b + ", client=" + this.f428147c + ", source=null, isLoading=" + this.f428148d + ", viewState=" + this.f428149e + ')';
    }
}
