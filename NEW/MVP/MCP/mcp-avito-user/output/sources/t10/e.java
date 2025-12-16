package T10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/e;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15290a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f15291b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f15292c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15293d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f15294e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f15295f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f15296g;

    public e(@k String str, @l String str2, @k AttributedText attributedText, @k String str3, @l a aVar, @k b bVar, @k String str4) {
        this.f15290a = str;
        this.f15291b = str2;
        this.f15292c = attributedText;
        this.f15293d = str3;
        this.f15294e = aVar;
        this.f15295f = bVar;
        this.f15296g = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f15290a, eVar.f15290a) && L.f(this.f15291b, eVar.f15291b) && L.f(this.f15292c, eVar.f15292c) && L.f(this.f15293d, eVar.f15293d) && L.f(this.f15294e, eVar.f15294e) && L.f(this.f15295f, eVar.f15295f) && L.f(this.f15296g, eVar.f15296g);
    }

    public final int hashCode() {
        int iHashCode = this.f15290a.hashCode() * 31;
        String str = this.f15291b;
        int iD2 = H.d(com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15292c), 31, this.f15293d);
        a aVar = this.f15294e;
        return this.f15296g.hashCode() + ((this.f15295f.hashCode() + ((iD2 + (aVar != null ? aVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientFormSearch(screenTitle=");
        sb2.append(this.f15290a);
        sb2.append(", screenSubtitle=");
        sb2.append(this.f15291b);
        sb2.append(", title=");
        sb2.append(this.f15292c);
        sb2.append(", actionButton=");
        sb2.append(this.f15293d);
        sb2.append(", actionBanner=");
        sb2.append(this.f15294e);
        sb2.append(", searchField=");
        sb2.append(this.f15295f);
        sb2.append(", emptySearchFieldError=");
        return C22026a.c(sb2, this.f15296g, ')');
    }
}
