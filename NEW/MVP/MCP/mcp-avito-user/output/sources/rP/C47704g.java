package rp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deeplink.SubmittingSuccessLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PromoModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrp/g;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rp.g, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47704g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430213a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C47700c f430214b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C47703f f430215c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f430216d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<C47701d> f430217e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SubmittingSuccessLink f430218f;

    public C47704g(@k String str, @l C47700c c47700c, @k C47703f c47703f, @k String str2, @k List list, @k SubmittingSuccessLink submittingSuccessLink) {
        this.f430213a = str;
        this.f430214b = c47700c;
        this.f430215c = c47703f;
        this.f430216d = str2;
        this.f430217e = list;
        this.f430218f = submittingSuccessLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47704g)) {
            return false;
        }
        C47704g c47704g = (C47704g) obj;
        return L.f(this.f430213a, c47704g.f430213a) && this.f430214b.equals(c47704g.f430214b) && this.f430215c.equals(c47704g.f430215c) && L.f(this.f430216d, c47704g.f430216d) && L.f(this.f430217e, c47704g.f430217e) && this.f430218f.equals(c47704g.f430218f);
    }

    public final int hashCode() {
        return this.f430218f.hashCode() + H.e(H.d((this.f430215c.hashCode() + ((this.f430214b.hashCode() + (this.f430213a.hashCode() * 31)) * 31)) * 31, 31, this.f430216d), 31, this.f430217e);
    }

    @k
    public final String toString() {
        return "PromoBody(navbarTitle=" + this.f430213a + ", header=" + this.f430214b + ", phoneInput=" + this.f430215c + ", proceedButtonText=" + this.f430216d + ", items=" + this.f430217e + ", nextLink=" + this.f430218f + ')';
    }
}
