package rv;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: FragmentResult.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrv/b;", "", "_avito-discouraged_avito-libs_deeplink-handler"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rv.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C47919b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f437158a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Bundle f437159b;

    public C47919b(@k Bundle bundle, @k String str) {
        this.f437158a = str;
        this.f437159b = bundle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47919b)) {
            return false;
        }
        C47919b c47919b = (C47919b) obj;
        return L.f(this.f437158a, c47919b.f437158a) && L.f(this.f437159b, c47919b.f437159b);
    }

    public final int hashCode() {
        return this.f437159b.hashCode() + (this.f437158a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentResult(requestKey=");
        sb2.append(this.f437158a);
        sb2.append(", bundle=");
        return H.m(sb2, this.f437159b, ')');
    }
}
