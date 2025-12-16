package b20;

import Y61.k;
import Y61.l;
import a20.C19669a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import b20.e;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.mortgage_invite.client_search.model.MortgageClient;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationContactInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lb20/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d extends q {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final a f56842g = new a(null);

    /* renamed from: h, reason: collision with root package name */
    @k
    public static final d f56843h = new d(null, null, null, true, e.d.f56851a);

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C19669a f56844b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final MortgageClient f56845c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f56846d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f56847e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final e f56848f;

    /* compiled from: ApplicationContactInfoState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb20/d$a;", "", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public d(@l C19669a c19669a, @l MortgageClient mortgageClient, @l String str, boolean z12, @k e eVar) {
        this.f56844b = c19669a;
        this.f56845c = mortgageClient;
        this.f56846d = str;
        this.f56847e = z12;
        this.f56848f = eVar;
    }

    public static d a(d dVar, C19669a c19669a, MortgageClient mortgageClient, String str, boolean z12, e eVar, int i12) {
        if ((i12 & 1) != 0) {
            c19669a = dVar.f56844b;
        }
        C19669a c19669a2 = c19669a;
        if ((i12 & 2) != 0) {
            mortgageClient = dVar.f56845c;
        }
        MortgageClient mortgageClient2 = mortgageClient;
        if ((i12 & 4) != 0) {
            str = dVar.f56846d;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z12 = dVar.f56847e;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            eVar = dVar.f56848f;
        }
        dVar.getClass();
        return new d(c19669a2, mortgageClient2, str2, z13, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f56844b, dVar.f56844b) && L.f(this.f56845c, dVar.f56845c) && L.f(this.f56846d, dVar.f56846d) && this.f56847e == dVar.f56847e && L.f(this.f56848f, dVar.f56848f);
    }

    public final int hashCode() {
        C19669a c19669a = this.f56844b;
        int iHashCode = (c19669a == null ? 0 : c19669a.hashCode()) * 31;
        MortgageClient mortgageClient = this.f56845c;
        int iHashCode2 = (iHashCode + (mortgageClient == null ? 0 : mortgageClient.hashCode())) * 31;
        String str = this.f56846d;
        return this.f56848f.hashCode() + r.i((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f56847e);
    }

    @k
    public final String toString() {
        return "ApplicationContactInfoState(form=" + this.f56844b + ", client=" + this.f56845c + ", sourceType=" + this.f56846d + ", isLoading=" + this.f56847e + ", viewState=" + this.f56848f + ')';
    }
}
