package e00;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Document.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Le00/a;", "", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: e00.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C39840a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f394243a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f394244b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f394245c;

    /* renamed from: d, reason: collision with root package name */
    public final long f394246d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f394247e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Float f394248f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f394249g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f394250h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f394251i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f394252j;

    public C39840a(@l String str, @l String str2, @k String str3, long j12, boolean z12, @l Float f12, boolean z13) {
        this.f394243a = str;
        this.f394244b = str2;
        this.f394245c = str3;
        this.f394246d = j12;
        this.f394247e = z12;
        this.f394248f = f12;
        this.f394249g = z13;
        boolean z14 = false;
        boolean z15 = str2 != null;
        this.f394250h = z15;
        this.f394251i = str != null;
        if (z15 && z12) {
            z14 = true;
        }
        this.f394252j = z14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39840a)) {
            return false;
        }
        C39840a c39840a = (C39840a) obj;
        return L.f(this.f394243a, c39840a.f394243a) && L.f(this.f394244b, c39840a.f394244b) && L.f(this.f394245c, c39840a.f394245c) && this.f394246d == c39840a.f394246d && this.f394247e == c39840a.f394247e && L.f(this.f394248f, c39840a.f394248f) && this.f394249g == c39840a.f394249g;
    }

    public final int hashCode() {
        String str = this.f394243a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f394244b;
        int i12 = r.i(r.g(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f394245c), 31, this.f394246d), 31, this.f394247e);
        Float f12 = this.f394248f;
        return Boolean.hashCode(this.f394249g) + ((i12 + (f12 != null ? f12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Document(remoteId=");
        sb2.append(this.f394243a);
        sb2.append(", localId=");
        sb2.append(this.f394244b);
        sb2.append(", name=");
        sb2.append(this.f394245c);
        sb2.append(", size=");
        sb2.append(this.f394246d);
        sb2.append(", isError=");
        sb2.append(this.f394247e);
        sb2.append(", progress=");
        sb2.append(this.f394248f);
        sb2.append(", isDeleting=");
        return r.x(sb2, this.f394249g, ')');
    }

    public /* synthetic */ C39840a(String str, String str2, String str3, long j12, boolean z12, Float f12, boolean z13, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, str3, j12, z12, f12, z13);
    }
}
