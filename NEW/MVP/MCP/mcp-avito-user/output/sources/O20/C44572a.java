package o20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantBlock.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo20/a;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: o20.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final /* data */ class C44572a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419314a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<d> f419315b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f419316c;

    public C44572a(@k String str, @k List<d> list, boolean z12) {
        this.f419314a = str;
        this.f419315b = list;
        this.f419316c = z12;
    }

    public static C44572a a(C44572a c44572a, ArrayList arrayList, int i12) {
        String str = c44572a.f419314a;
        boolean z12 = (i12 & 4) != 0 ? c44572a.f419316c : true;
        c44572a.getClass();
        return new C44572a(str, arrayList, z12);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44572a)) {
            return false;
        }
        C44572a c44572a = (C44572a) obj;
        return L.f(this.f419314a, c44572a.f419314a) && L.f(this.f419315b, c44572a.f419315b) && this.f419316c == c44572a.f419316c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f419316c) + H.e(this.f419314a.hashCode() * 31, 31, this.f419315b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantBlock(title=");
        sb2.append(this.f419314a);
        sb2.append(", content=");
        sb2.append(this.f419315b);
        sb2.append(", isUpdated=");
        return r.x(sb2, this.f419316c, ')');
    }
}
