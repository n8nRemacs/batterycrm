package androidx.compose.foundation.content;

import Y61.k;
import Y61.l;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.foundation.H;
import androidx.compose.foundation.W0;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TransferableContent.android.kt */
@W0
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/content/b;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Uri f26976a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Bundle f26977b;

    public b(@l Uri uri, @k Bundle bundle) {
        this.f26976a = uri;
        this.f26977b = bundle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f26976a, bVar.f26976a) && L.f(this.f26977b, bVar.f26977b);
    }

    public final int hashCode() {
        Uri uri = this.f26976a;
        return this.f26977b.hashCode() + ((uri != null ? uri.hashCode() : 0) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlatformTransferableContent(linkUri=");
        sb2.append(this.f26976a);
        sb2.append(", extras=");
        return H.m(sb2, this.f26977b, ')');
    }
}
