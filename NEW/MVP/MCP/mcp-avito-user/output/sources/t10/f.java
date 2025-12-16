package T10;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationClientForms.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LT10/f;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f15297a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f15298b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f15299c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f15300d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final a f15301e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final b f15302f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final b f15303g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final b f15304h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f15305i;

    public f(@k String str, @l String str2, @k AttributedText attributedText, @k String str3, @l a aVar, @k b bVar, @k b bVar2, @k b bVar3, @l String str4) {
        this.f15297a = str;
        this.f15298b = str2;
        this.f15299c = attributedText;
        this.f15300d = str3;
        this.f15301e = aVar;
        this.f15302f = bVar;
        this.f15303g = bVar2;
        this.f15304h = bVar3;
        this.f15305i = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f15297a, fVar.f15297a) && L.f(this.f15298b, fVar.f15298b) && L.f(this.f15299c, fVar.f15299c) && L.f(this.f15300d, fVar.f15300d) && L.f(this.f15301e, fVar.f15301e) && L.f(this.f15302f, fVar.f15302f) && L.f(this.f15303g, fVar.f15303g) && L.f(this.f15304h, fVar.f15304h) && L.f(this.f15305i, fVar.f15305i);
    }

    public final int hashCode() {
        int iHashCode = this.f15297a.hashCode() * 31;
        String str = this.f15298b;
        int iD2 = H.d(com.avito.android.actions_sheet.a.b((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15299c), 31, this.f15300d);
        a aVar = this.f15301e;
        int iHashCode2 = (this.f15304h.hashCode() + ((this.f15303g.hashCode() + ((this.f15302f.hashCode() + ((iD2 + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.f15305i;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ClientFormSelected(screenTitle=");
        sb2.append(this.f15297a);
        sb2.append(", screenSubtitle=");
        sb2.append(this.f15298b);
        sb2.append(", title=");
        sb2.append(this.f15299c);
        sb2.append(", actionButton=");
        sb2.append(this.f15300d);
        sb2.append(", actionBanner=");
        sb2.append(this.f15301e);
        sb2.append(", fullName=");
        sb2.append(this.f15302f);
        sb2.append(", phone=");
        sb2.append(this.f15303g);
        sb2.append(", email=");
        sb2.append(this.f15304h);
        sb2.append(", clientId=");
        return C22026a.c(sb2, this.f15305i, ')');
    }

    public /* synthetic */ f(String str, String str2, AttributedText attributedText, String str3, a aVar, b bVar, b bVar2, b bVar3, String str4, int i12, C42822w c42822w) {
        this(str, str2, attributedText, str3, aVar, bVar, bVar2, bVar3, (i12 & 256) != 0 ? null : str4);
    }
}
