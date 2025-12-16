package Vz;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceFilesConstraints.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LVz/a;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Vz.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C15731a {

    /* renamed from: a, reason: collision with root package name */
    public final long f17534a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String[] f17535b;

    public C15731a() {
        this(0L, null, 3, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15731a)) {
            return false;
        }
        C15731a c15731a = (C15731a) obj;
        return this.f17534a == c15731a.f17534a && L.f(this.f17535b, c15731a.f17535b);
    }

    public final int hashCode() {
        return (Long.hashCode(this.f17534a) * 31) + Arrays.hashCode(this.f17535b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceFilesConstraints(maxSizeInBytes=");
        sb2.append(this.f17534a);
        sb2.append(", mimeTypes=");
        return C22026a.c(sb2, Arrays.toString(this.f17535b), ')');
    }

    public C15731a(long j12, @k String[] strArr) {
        this.f17534a = j12;
        this.f17535b = strArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C15731a(long j12, String[] strArr, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? 16777216L : j12;
        if ((i12 & 2) != 0) {
            com.avito.android.evidence_request.details.files.a.f148439a.getClass();
            strArr = (String[]) com.avito.android.evidence_request.details.files.a.f148440b.getValue();
        }
        this(j12, strArr);
    }
}
