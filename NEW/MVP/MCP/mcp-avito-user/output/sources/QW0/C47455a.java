package qw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LoaderInfo.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqw0/a;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: qw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C47455a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f429506a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429507b;

    public C47455a(@k String str, @k String str2) {
        this.f429506a = str;
        this.f429507b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47455a)) {
            return false;
        }
        C47455a c47455a = (C47455a) obj;
        return L.f(this.f429506a, c47455a.f429506a) && L.f(this.f429507b, c47455a.f429507b);
    }

    public final int hashCode() {
        return this.f429507b.hashCode() + (this.f429506a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LoaderInfo(lottieUrl=");
        sb2.append(this.f429506a);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f429507b, ')');
    }
}
