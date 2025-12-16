package It;

import Y61.k;
import Y61.l;
import com.avito.android.cv_upload.domain.model.CvParsing;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvParsingResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIt/b;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CvParsing f8587a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C14156a f8588b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final c f8589c;

    public b(@k CvParsing cvParsing, @l C14156a c14156a, @l c cVar) {
        this.f8587a = cvParsing;
        this.f8588b = c14156a;
        this.f8589c = cVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f8587a == bVar.f8587a && L.f(this.f8588b, bVar.f8588b) && L.f(this.f8589c, bVar.f8589c);
    }

    public final int hashCode() {
        int iHashCode = this.f8587a.hashCode() * 31;
        C14156a c14156a = this.f8588b;
        int iHashCode2 = (iHashCode + (c14156a == null ? 0 : c14156a.f8586a.hashCode())) * 31;
        c cVar = this.f8589c;
        return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CvParsingResponse(state=" + this.f8587a + ", action=" + this.f8588b + ", cvUploadContent=" + this.f8589c + ')';
    }
}
