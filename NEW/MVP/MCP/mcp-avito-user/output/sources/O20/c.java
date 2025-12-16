package o20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantForm.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo20/c;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f419321a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f419322b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f419323c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f419324d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C44572a f419325e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C44572a f419326f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f419327g;

    public c(@k String str, @l String str2, @k String str3, boolean z12, @k C44572a c44572a, @k C44572a c44572a2, @k b bVar) {
        this.f419321a = str;
        this.f419322b = str2;
        this.f419323c = str3;
        this.f419324d = z12;
        this.f419325e = c44572a;
        this.f419326f = c44572a2;
        this.f419327g = bVar;
    }

    public static c a(c cVar, boolean z12, C44572a c44572a, C44572a c44572a2, int i12) {
        String str = cVar.f419321a;
        String str2 = cVar.f419322b;
        String str3 = cVar.f419323c;
        if ((i12 & 8) != 0) {
            z12 = cVar.f419324d;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            c44572a = cVar.f419325e;
        }
        C44572a c44572a3 = c44572a;
        if ((i12 & 32) != 0) {
            c44572a2 = cVar.f419326f;
        }
        b bVar = cVar.f419327g;
        cVar.getClass();
        return new c(str, str2, str3, z13, c44572a3, c44572a2, bVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f419321a, cVar.f419321a) && L.f(this.f419322b, cVar.f419322b) && L.f(this.f419323c, cVar.f419323c) && this.f419324d == cVar.f419324d && L.f(this.f419325e, cVar.f419325e) && L.f(this.f419326f, cVar.f419326f) && L.f(this.f419327g, cVar.f419327g);
    }

    public final int hashCode() {
        int iHashCode = this.f419321a.hashCode() * 31;
        String str = this.f419322b;
        return this.f419327g.hashCode() + ((this.f419326f.hashCode() + ((this.f419325e.hashCode() + r.i(H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f419323c), 31, this.f419324d)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ParticipantForm(screenTitle=" + this.f419321a + ", title=" + this.f419322b + ", actionTitle=" + this.f419323c + ", isActionLoading=" + this.f419324d + ", clientBlock=" + this.f419325e + ", agentBlock=" + this.f419326f + ", closeDialog=" + this.f419327g + ')';
    }
}
