package com.avito.android.evidence_request.mvi.domain.evidence_details;

import androidx.compose.runtime.C22026a;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: EvidenceFilesConstraints.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/i;", "", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.evidence_request.mvi.domain.evidence_details.i, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C30389i {

    /* renamed from: a, reason: collision with root package name */
    public final long f148703a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String[] f148704b;

    public C30389i() {
        this(0L, null, 3, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30389i)) {
            return false;
        }
        C30389i c30389i = (C30389i) obj;
        return this.f148703a == c30389i.f148703a && L.f(this.f148704b, c30389i.f148704b);
    }

    public final int hashCode() {
        return (Long.hashCode(this.f148703a) * 31) + Arrays.hashCode(this.f148704b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EvidenceFilesConstraints(maxSizeInBytes=");
        sb2.append(this.f148703a);
        sb2.append(", mimeTypes=");
        return C22026a.c(sb2, Arrays.toString(this.f148704b), ')');
    }

    public C30389i(long j12, @Y61.k String[] strArr) {
        this.f148703a = j12;
        this.f148704b = strArr;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30389i(long j12, String[] strArr, int i12, C42822w c42822w) {
        j12 = (i12 & 1) != 0 ? 16777216L : j12;
        if ((i12 & 2) != 0) {
            C30387g.f148700a.getClass();
            strArr = (String[]) C30387g.f148701b.getValue();
        }
        this(j12, strArr);
    }
}
