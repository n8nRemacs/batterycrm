package rA0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SuggestInstitute.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LrA0/a;", "Lcom/avito/conveyor_item/a;", "_avito_job_suggest-institutes-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C47519a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f429646b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f429647c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f429648d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f429649e;

    public C47519a(String str, boolean z12, boolean z13, String str2, int i12, C42822w c42822w) {
        z12 = (i12 & 2) != 0 ? false : z12;
        z13 = (i12 & 4) != 0 ? false : z13;
        str2 = (i12 & 8) != 0 ? String.valueOf(str.hashCode()) : str2;
        this.f429646b = str;
        this.f429647c = z12;
        this.f429648d = z13;
        this.f429649e = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47519a)) {
            return false;
        }
        C47519a c47519a = (C47519a) obj;
        return L.f(this.f429646b, c47519a.f429646b) && this.f429647c == c47519a.f429647c && this.f429648d == c47519a.f429648d && L.f(this.f429649e, c47519a.f429649e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF275352b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF275352b() {
        return this.f429649e;
    }

    public final int hashCode() {
        return this.f429649e.hashCode() + r.i(r.i(this.f429646b.hashCode() * 31, 31, this.f429647c), 31, this.f429648d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestInstitute(title=");
        sb2.append(this.f429646b);
        sb2.append(", isSelected=");
        sb2.append(this.f429647c);
        sb2.append(", isCustom=");
        sb2.append(this.f429648d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f429649e, ')');
    }
}
