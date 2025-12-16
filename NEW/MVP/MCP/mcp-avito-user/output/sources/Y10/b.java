package Y10;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFieldId;
import com.avito.android.mortgage_invite.common.domain.model.ContactInfoFormItemType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationContactInfoFormItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LY10/b;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ContactInfoFieldId f19261a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ContactInfoFormItemType f19262b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f19263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f19264d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f19265e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f19266f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f19267g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f19268h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f19269i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final PrintableText f19270j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f19271k;

    public b(@k ContactInfoFieldId contactInfoFieldId, @k ContactInfoFormItemType contactInfoFormItemType, boolean z12, @k String str, @k String str2, boolean z13, boolean z14, boolean z15, @k String str3, @l PrintableText printableText, boolean z16) {
        this.f19261a = contactInfoFieldId;
        this.f19262b = contactInfoFormItemType;
        this.f19263c = z12;
        this.f19264d = str;
        this.f19265e = str2;
        this.f19266f = z13;
        this.f19267g = z14;
        this.f19268h = z15;
        this.f19269i = str3;
        this.f19270j = printableText;
        this.f19271k = z16;
    }

    public static b a(b bVar, boolean z12, String str, PrintableText printableText, boolean z13, int i12) {
        return new b(bVar.f19261a, bVar.f19262b, (i12 & 4) != 0 ? bVar.f19263c : false, bVar.f19264d, bVar.f19265e, bVar.f19266f, (i12 & 64) != 0 ? bVar.f19267g : z12, bVar.f19268h, (i12 & 256) != 0 ? bVar.f19269i : str, (i12 & 512) != 0 ? bVar.f19270j : printableText, (i12 & 1024) != 0 ? bVar.f19271k : z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19261a == bVar.f19261a && this.f19262b == bVar.f19262b && this.f19263c == bVar.f19263c && L.f(this.f19264d, bVar.f19264d) && L.f(this.f19265e, bVar.f19265e) && this.f19266f == bVar.f19266f && this.f19267g == bVar.f19267g && this.f19268h == bVar.f19268h && L.f(this.f19269i, bVar.f19269i) && L.f(this.f19270j, bVar.f19270j) && this.f19271k == bVar.f19271k;
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(r.i(r.i(H.d(H.d(r.i((this.f19262b.hashCode() + (this.f19261a.hashCode() * 31)) * 31, 31, this.f19263c), 31, this.f19264d), 31, this.f19265e), 31, this.f19266f), 31, this.f19267g), 31, this.f19268h), 31, this.f19269i);
        PrintableText printableText = this.f19270j;
        return Boolean.hashCode(this.f19271k) + ((iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationContactInfoFormItem(id=");
        sb2.append(this.f19261a);
        sb2.append(", type=");
        sb2.append(this.f19262b);
        sb2.append(", isMasked=");
        sb2.append(this.f19263c);
        sb2.append(", title=");
        sb2.append(this.f19264d);
        sb2.append(", placeholder=");
        sb2.append(this.f19265e);
        sb2.append(", isRequired=");
        sb2.append(this.f19266f);
        sb2.append(", isVisible=");
        sb2.append(this.f19267g);
        sb2.append(", canClear=");
        sb2.append(this.f19268h);
        sb2.append(", value=");
        sb2.append(this.f19269i);
        sb2.append(", error=");
        sb2.append(this.f19270j);
        sb2.append(", isEmptyByMasked=");
        return r.x(sb2, this.f19271k, ')');
    }

    public /* synthetic */ b(ContactInfoFieldId contactInfoFieldId, ContactInfoFormItemType contactInfoFormItemType, boolean z12, String str, String str2, boolean z13, boolean z14, boolean z15, String str3, PrintableText printableText, boolean z16, int i12, C42822w c42822w) {
        this(contactInfoFieldId, contactInfoFormItemType, z12, str, str2, z13, z14, z15, str3, printableText, (i12 & 1024) != 0 ? false : z16);
    }
}
