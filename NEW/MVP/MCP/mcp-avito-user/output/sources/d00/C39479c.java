package d00;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LocalFile.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld00/c;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d00.c, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C39479c {

    /* renamed from: a, reason: collision with root package name */
    public final long f393604a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f393605b;

    /* renamed from: c, reason: collision with root package name */
    public final long f393606c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f393607d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Uri f393608e;

    public C39479c(long j12, @k String str, long j13, @k d dVar, @k Uri uri) {
        this.f393604a = j12;
        this.f393605b = str;
        this.f393606c = j13;
        this.f393607d = dVar;
        this.f393608e = uri;
    }

    public static C39479c a(C39479c c39479c, d dVar) {
        long j12 = c39479c.f393604a;
        String str = c39479c.f393605b;
        long j13 = c39479c.f393606c;
        Uri uri = c39479c.f393608e;
        c39479c.getClass();
        return new C39479c(j12, str, j13, dVar, uri);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39479c)) {
            return false;
        }
        C39479c c39479c = (C39479c) obj;
        return this.f393604a == c39479c.f393604a && L.f(this.f393605b, c39479c.f393605b) && this.f393606c == c39479c.f393606c && L.f(this.f393607d, c39479c.f393607d) && L.f(this.f393608e, c39479c.f393608e);
    }

    public final int hashCode() {
        return this.f393608e.hashCode() + ((this.f393607d.hashCode() + r.g(H.d(Long.hashCode(this.f393604a) * 31, 31, this.f393605b), 31, this.f393606c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocalFile(id=");
        sb2.append(this.f393604a);
        sb2.append(", name=");
        sb2.append(this.f393605b);
        sb2.append(", sizeBytes=");
        sb2.append(this.f393606c);
        sb2.append(", state=");
        sb2.append(this.f393607d);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.t(sb2, this.f393608e, ')');
    }
}
