package It;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CvParsingResponse.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LIt/a;", "", "_avito_job_cv-upload_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: It.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14156a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final DeepLink f8586a;

    public C14156a(@k DeepLink deepLink) {
        this.f8586a = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C14156a) && L.f(this.f8586a, ((C14156a) obj).f8586a);
    }

    public final int hashCode() {
        return this.f8586a.hashCode();
    }

    @k
    public final String toString() {
        return com.avito.android.actions_sheet.a.v(new StringBuilder("Action(deeplink="), this.f8586a, ')');
    }
}
