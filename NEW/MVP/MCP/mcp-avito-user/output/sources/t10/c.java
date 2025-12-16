package T10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/c;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e f15282a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final d f15283b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final f f15284c;

    public c(@k e eVar, @k d dVar, @k f fVar) {
        this.f15282a = eVar;
        this.f15283b = dVar;
        this.f15284c = fVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f15282a, cVar.f15282a) && L.f(this.f15283b, cVar.f15283b) && L.f(this.f15284c, cVar.f15284c);
    }

    public final int hashCode() {
        return this.f15284c.hashCode() + ((this.f15283b.hashCode() + (this.f15282a.hashCode() * 31)) * 31);
    }

    @k
    public final String toString() {
        return "ApplicationClientForms(clientSearch=" + this.f15282a + ", clientNew=" + this.f15283b + ", clientSelected=" + this.f15284c + ')';
    }
}
