package ze0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ScannerState.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lze0/d;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ze0.d, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C50556d {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f444128a;

    public C50556d(boolean z12) {
        this.f444128a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C50556d) && this.f444128a == ((C50556d) obj).f444128a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f444128a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("ScannerState(isLoading="), this.f444128a, ')');
    }
}
