package It;

import Y61.k;
import Y61.l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIt/d;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f8592a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final c f8593b;

    public d(@l String str, @l c cVar) {
        this.f8592a = str;
        this.f8593b = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f8592a, dVar.f8592a) && L.f(this.f8593b, dVar.f8593b);
    }

    public final int hashCode() {
        String str = this.f8592a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        c cVar = this.f8593b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CvUploadResponse(id=" + this.f8592a + ", cvUploadContent=" + this.f8593b + ')';
    }
}
