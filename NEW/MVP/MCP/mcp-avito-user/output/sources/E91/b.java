package E91;

import kotlin.jvm.internal.L;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final f f3815a;

    /* renamed from: b, reason: collision with root package name */
    public final g f3816b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3817c;

    /* renamed from: d, reason: collision with root package name */
    public final c f3818d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3819e;

    /* renamed from: f, reason: collision with root package name */
    public final P91.e f3820f;

    /* renamed from: g, reason: collision with root package name */
    public final a f3821g;

    public /* synthetic */ b() {
        this(null, null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f3815a, bVar.f3815a) && L.f(this.f3816b, bVar.f3816b) && L.f(this.f3817c, bVar.f3817c) && L.f(this.f3818d, bVar.f3818d) && L.f(this.f3819e, bVar.f3819e) && L.f(this.f3820f, bVar.f3820f) && L.f(this.f3821g, bVar.f3821g);
    }

    public final int hashCode() {
        f fVar = this.f3815a;
        int iHashCode = (fVar == null ? 0 : fVar.hashCode()) * 31;
        g gVar = this.f3816b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        h hVar = this.f3817c;
        int iHashCode3 = (iHashCode2 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        c cVar = this.f3818d;
        int iHashCode4 = (iHashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.f3819e;
        int iHashCode5 = (iHashCode4 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        P91.e eVar = this.f3820f;
        int iHashCode6 = (iHashCode5 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        a aVar = this.f3821g;
        return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        return "CurrentState(error=" + this.f3815a + ", onboarding=" + this.f3816b + ", photoCapture=" + this.f3817c + ", documentConfirmation=" + this.f3818d + ", documentData=" + this.f3819e + ", selectedDocument=" + this.f3820f + ", chooseDocumentState=" + this.f3821g + ')';
    }

    public b(f fVar, g gVar, h hVar, c cVar, d dVar, P91.e eVar, a aVar) {
        this.f3815a = fVar;
        this.f3816b = gVar;
        this.f3817c = hVar;
        this.f3818d = cVar;
        this.f3819e = dVar;
        this.f3820f = eVar;
        this.f3821g = aVar;
    }
}
