package It;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIt/c;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f8590a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f8591b;

    public c(@k String str, @k String str2) {
        this.f8590a = str;
        this.f8591b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f8590a, cVar.f8590a) && L.f(this.f8591b, cVar.f8591b);
    }

    public final int hashCode() {
        return this.f8591b.hashCode() + (this.f8590a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CvUploadContent(title=");
        sb2.append(this.f8590a);
        sb2.append(", subtitle=");
        return C22026a.c(sb2, this.f8591b, ')');
    }
}
