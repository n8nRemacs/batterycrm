package sH;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MotivationPayment.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsH/a;", "", "_avito_gig_motivation-payment_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sH.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C48049a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437565a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f437566b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f437567c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final h f437568d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final e f437569e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final d f437570f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final i f437571g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final DeepLink f437572h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final j f437573i;

    public C48049a(@k String str, @k String str2, @k UniversalImage universalImage, @l h hVar, @l e eVar, @l d dVar, @l i iVar, @l DeepLink deepLink, @l j jVar) {
        this.f437565a = str;
        this.f437566b = str2;
        this.f437567c = universalImage;
        this.f437568d = hVar;
        this.f437569e = eVar;
        this.f437570f = dVar;
        this.f437571g = iVar;
        this.f437572h = deepLink;
        this.f437573i = jVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48049a)) {
            return false;
        }
        C48049a c48049a = (C48049a) obj;
        return L.f(this.f437565a, c48049a.f437565a) && L.f(this.f437566b, c48049a.f437566b) && L.f(this.f437567c, c48049a.f437567c) && L.f(this.f437568d, c48049a.f437568d) && L.f(this.f437569e, c48049a.f437569e) && L.f(this.f437570f, c48049a.f437570f) && L.f(this.f437571g, c48049a.f437571g) && L.f(this.f437572h, c48049a.f437572h) && L.f(this.f437573i, c48049a.f437573i);
    }

    public final int hashCode() {
        int iA2 = com.avito.android.actions_sheet.a.a(H.d(this.f437565a.hashCode() * 31, 31, this.f437566b), 31, this.f437567c);
        h hVar = this.f437568d;
        int iHashCode = (iA2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        e eVar = this.f437569e;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        d dVar = this.f437570f;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        i iVar = this.f437571g;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        DeepLink deepLink = this.f437572h;
        int iHashCode5 = (iHashCode4 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        j jVar = this.f437573i;
        return iHashCode5 + (jVar != null ? jVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "MotivationPayment(title=" + this.f437565a + ", subtitle=" + this.f437566b + ", icon=" + this.f437567c + ", primaryButton=" + this.f437568d + ", paymentInfo=" + this.f437569e + ", paymentDetails=" + this.f437570f + ", secondaryButton=" + this.f437571g + ", supportDeepLink=" + this.f437572h + ", toastInfo=" + this.f437573i + ')';
    }

    public /* synthetic */ C48049a(String str, String str2, UniversalImage universalImage, h hVar, e eVar, d dVar, i iVar, DeepLink deepLink, j jVar, int i12, C42822w c42822w) {
        this(str, str2, universalImage, (i12 & 8) != 0 ? null : hVar, (i12 & 16) != 0 ? new e(null, null, null, null, 15, null) : eVar, (i12 & 32) != 0 ? null : dVar, (i12 & 64) != 0 ? null : iVar, (i12 & 128) != 0 ? null : deepLink, (i12 & 256) != 0 ? null : jVar);
    }
}
