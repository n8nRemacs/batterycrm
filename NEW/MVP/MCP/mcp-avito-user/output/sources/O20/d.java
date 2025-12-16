package o20;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantFieldId;
import com.avito.android.mortgage_invite.participant.domain.model.ParticipantType;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ParticipantItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo20/d;", "", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ParticipantFieldId f419328a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ParticipantType f419329b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f419330c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f419331d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f419332e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f419333f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f419334g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final PrintableText f419335h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f419336i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f419337j;

    public d(@k ParticipantFieldId participantFieldId, @k ParticipantType participantType, @k String str, @k String str2, boolean z12, boolean z13, @k String str3, @l PrintableText printableText, boolean z14, boolean z15) {
        this.f419328a = participantFieldId;
        this.f419329b = participantType;
        this.f419330c = str;
        this.f419331d = str2;
        this.f419332e = z12;
        this.f419333f = z13;
        this.f419334g = str3;
        this.f419335h = printableText;
        this.f419336i = z14;
        this.f419337j = z15;
    }

    public static d a(d dVar, boolean z12, String str, PrintableText printableText, boolean z13, int i12) {
        return new d(dVar.f419328a, dVar.f419329b, dVar.f419330c, dVar.f419331d, dVar.f419332e, (i12 & 32) != 0 ? dVar.f419333f : z12, (i12 & 64) != 0 ? dVar.f419334g : str, (i12 & 128) != 0 ? dVar.f419335h : printableText, (i12 & 256) != 0 ? dVar.f419336i : false, (i12 & 512) != 0 ? dVar.f419337j : z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f419328a == dVar.f419328a && this.f419329b == dVar.f419329b && L.f(this.f419330c, dVar.f419330c) && L.f(this.f419331d, dVar.f419331d) && this.f419332e == dVar.f419332e && this.f419333f == dVar.f419333f && L.f(this.f419334g, dVar.f419334g) && L.f(this.f419335h, dVar.f419335h) && this.f419336i == dVar.f419336i && this.f419337j == dVar.f419337j;
    }

    public final int hashCode() {
        int iD2 = H.d(r.i(r.i(H.d(H.d((this.f419329b.hashCode() + (this.f419328a.hashCode() * 31)) * 31, 31, this.f419330c), 31, this.f419331d), 31, this.f419332e), 31, this.f419333f), 31, this.f419334g);
        PrintableText printableText = this.f419335h;
        return Boolean.hashCode(this.f419337j) + r.i((iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31, 31, this.f419336i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParticipantItem(id=");
        sb2.append(this.f419328a);
        sb2.append(", type=");
        sb2.append(this.f419329b);
        sb2.append(", title=");
        sb2.append(this.f419330c);
        sb2.append(", placeholder=");
        sb2.append(this.f419331d);
        sb2.append(", isRequired=");
        sb2.append(this.f419332e);
        sb2.append(", isVisible=");
        sb2.append(this.f419333f);
        sb2.append(", value=");
        sb2.append(this.f419334g);
        sb2.append(", error=");
        sb2.append(this.f419335h);
        sb2.append(", isMasked=");
        sb2.append(this.f419336i);
        sb2.append(", isEmptyByMasked=");
        return r.x(sb2, this.f419337j, ')');
    }

    public /* synthetic */ d(ParticipantFieldId participantFieldId, ParticipantType participantType, String str, String str2, boolean z12, boolean z13, String str3, PrintableText printableText, boolean z14, boolean z15, int i12, C42822w c42822w) {
        this(participantFieldId, participantType, str, str2, z12, z13, str3, printableText, z14, (i12 & 512) != 0 ? false : z15);
    }
}
