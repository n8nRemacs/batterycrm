package MZ;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.api.model.landing.LandingHeader;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LandingLayout.kt */
@P
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"LMZ/h;", "", "Lcom/avito/android/mortgage/api/model/landing/LandingHeader;", "header", "LMZ/j;", "offersConfig", "LMZ/i;", "managerUsp", "LMZ/f;", "actionBanner", "LMZ/c;", "applicationFlow", "LMZ/b;", "faq", "<init>", "(Lcom/avito/android/mortgage/api/model/landing/LandingHeader;LMZ/j;LMZ/i;LMZ/f;LMZ/c;LMZ/b;)V", "Lcom/avito/android/mortgage/api/model/landing/LandingHeader;", "d", "()Lcom/avito/android/mortgage/api/model/landing/LandingHeader;", "LMZ/j;", "f", "()LMZ/j;", "LMZ/i;", "e", "()LMZ/i;", "LMZ/f;", "a", "()LMZ/f;", "LMZ/c;", "b", "()LMZ/c;", "LMZ/b;", "c", "()LMZ/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class h {

    @com.google.gson.annotations.c("actionBanner")
    @Y61.l
    private final f actionBanner;

    @com.google.gson.annotations.c("applicationFlow")
    @Y61.l
    private final c applicationFlow;

    @com.google.gson.annotations.c("faq")
    @Y61.l
    private final b faq;

    @com.google.gson.annotations.c("header")
    @Y61.l
    private final LandingHeader header;

    @com.google.gson.annotations.c("managerUsp")
    @Y61.l
    private final i managerUsp;

    @com.google.gson.annotations.c("offersConfig")
    @Y61.l
    private final j offersConfig;

    public h(@Y61.l LandingHeader landingHeader, @Y61.l j jVar, @Y61.l i iVar, @Y61.l f fVar, @Y61.l c cVar, @Y61.l b bVar) {
        this.header = landingHeader;
        this.offersConfig = jVar;
        this.managerUsp = iVar;
        this.actionBanner = fVar;
        this.applicationFlow = cVar;
        this.faq = bVar;
    }

    @Y61.l
    /* renamed from: a, reason: from getter */
    public final f getActionBanner() {
        return this.actionBanner;
    }

    @Y61.l
    /* renamed from: b, reason: from getter */
    public final c getApplicationFlow() {
        return this.applicationFlow;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final b getFaq() {
        return this.faq;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final LandingHeader getHeader() {
        return this.header;
    }

    @Y61.l
    /* renamed from: e, reason: from getter */
    public final i getManagerUsp() {
        return this.managerUsp;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.header, hVar.header) && L.f(this.offersConfig, hVar.offersConfig) && L.f(this.managerUsp, hVar.managerUsp) && L.f(this.actionBanner, hVar.actionBanner) && L.f(this.applicationFlow, hVar.applicationFlow) && L.f(this.faq, hVar.faq);
    }

    @Y61.l
    /* renamed from: f, reason: from getter */
    public final j getOffersConfig() {
        return this.offersConfig;
    }

    public final int hashCode() {
        LandingHeader landingHeader = this.header;
        int iHashCode = (landingHeader == null ? 0 : landingHeader.hashCode()) * 31;
        j jVar = this.offersConfig;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        i iVar = this.managerUsp;
        int iHashCode3 = (iHashCode2 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        f fVar = this.actionBanner;
        int iHashCode4 = (iHashCode3 + (fVar == null ? 0 : fVar.hashCode())) * 31;
        c cVar = this.applicationFlow;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        b bVar = this.faq;
        return iHashCode5 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "LandingLayout(header=" + this.header + ", offersConfig=" + this.offersConfig + ", managerUsp=" + this.managerUsp + ", actionBanner=" + this.actionBanner + ", applicationFlow=" + this.applicationFlow + ", faq=" + this.faq + ')';
    }
}
