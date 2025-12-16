package rw0;

import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ItemShortcut.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrw0/h;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Uri f437211a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f437212b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f437213c;

    public h(@Y61.k Uri uri, @Y61.k String str, @Y61.k String str2) {
        this.f437211a = uri;
        this.f437212b = str;
        this.f437213c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f437211a, hVar.f437211a) && L.f(this.f437212b, hVar.f437212b) && L.f(this.f437213c, hVar.f437213c);
    }

    public final int hashCode() {
        return this.f437213c.hashCode() + H.d(this.f437211a.hashCode() * 31, 31, this.f437212b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ItemShortcut(iconUri=");
        sb2.append(this.f437211a);
        sb2.append(", title=");
        sb2.append(this.f437212b);
        sb2.append(", address=");
        return C22026a.c(sb2, this.f437213c, ')');
    }
}
