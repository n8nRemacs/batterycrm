package Ot;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.cv_upload.screens.cv_upload.mvi.entity.CvUploadButton;
import com.avito.android.util.ApiException;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CvUploadState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOt/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c extends q {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f12652b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final It.c f12653c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Throwable f12654d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final CvUploadButton f12655e;

    public c() {
        this(false, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    public static c a(c cVar, It.c cVar2, ApiException apiException, int i12) {
        boolean z12 = (i12 & 1) != 0 ? cVar.f12652b : true;
        if ((i12 & 2) != 0) {
            cVar2 = cVar.f12653c;
        }
        ApiException apiException2 = apiException;
        if ((i12 & 4) != 0) {
            apiException2 = cVar.f12654d;
        }
        CvUploadButton cvUploadButton = cVar.f12655e;
        cVar.getClass();
        return new c(z12, cVar2, apiException2, cvUploadButton);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f12652b == cVar.f12652b && L.f(this.f12653c, cVar.f12653c) && L.f(this.f12654d, cVar.f12654d) && this.f12655e == cVar.f12655e;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f12652b) * 31;
        It.c cVar = this.f12653c;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Throwable th2 = this.f12654d;
        int iHashCode3 = (iHashCode2 + (th2 == null ? 0 : th2.hashCode())) * 31;
        CvUploadButton cvUploadButton = this.f12655e;
        return iHashCode3 + (cvUploadButton != null ? cvUploadButton.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CvUploadState(isLoading=" + this.f12652b + ", content=" + this.f12653c + ", error=" + this.f12654d + ", button=" + this.f12655e + ')';
    }

    public /* synthetic */ c(boolean z12, It.c cVar, Throwable th2, CvUploadButton cvUploadButton, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? null : cVar, (i12 & 4) != 0 ? null : th2, (i12 & 8) != 0 ? null : cvUploadButton);
    }

    public c(boolean z12, @l It.c cVar, @l Throwable th2, @l CvUploadButton cvUploadButton) {
        this.f12652b = z12;
        this.f12653c = cVar;
        this.f12654d = th2;
        this.f12655e = cvUploadButton;
    }
}
