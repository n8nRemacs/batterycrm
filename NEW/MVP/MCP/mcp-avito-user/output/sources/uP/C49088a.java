package up;

import Y61.k;
import Y61.l;
import android.net.Uri;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.item.callrecord.PlaySpeed;
import com.avito.android.printable_text.PrintableText;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CallRecordItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lup/a;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: up.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C49088a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f440286b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f440287c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f440288d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LocalDateTime f440289e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f440290f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Uri f440291g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final PlaySpeed f440292h;

    public C49088a(@k String str, @k String str2, @k PrintableText printableText, @k LocalDateTime localDateTime, @l Long l12, @l Uri uri, @k PlaySpeed playSpeed) {
        this.f440286b = str;
        this.f440287c = str2;
        this.f440288d = printableText;
        this.f440289e = localDateTime;
        this.f440290f = l12;
        this.f440291g = uri;
        this.f440292h = playSpeed;
    }

    public static C49088a a(C49088a c49088a, Uri uri, PlaySpeed playSpeed, int i12) {
        String str = c49088a.f440286b;
        String str2 = c49088a.f440287c;
        PrintableText printableText = c49088a.f440288d;
        LocalDateTime localDateTime = c49088a.f440289e;
        Long l12 = c49088a.f440290f;
        if ((i12 & 32) != 0) {
            uri = c49088a.f440291g;
        }
        Uri uri2 = uri;
        if ((i12 & 64) != 0) {
            playSpeed = c49088a.f440292h;
        }
        c49088a.getClass();
        return new C49088a(str, str2, printableText, localDateTime, l12, uri2, playSpeed);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C49088a)) {
            return false;
        }
        C49088a c49088a = (C49088a) obj;
        return L.f(this.f440286b, c49088a.f440286b) && L.f(this.f440287c, c49088a.f440287c) && L.f(this.f440288d, c49088a.f440288d) && L.f(this.f440289e, c49088a.f440289e) && L.f(this.f440290f, c49088a.f440290f) && L.f(this.f440291g, c49088a.f440291g) && this.f440292h == c49088a.f440292h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF115847b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF115847b() {
        return this.f440286b;
    }

    public final int hashCode() {
        int iHashCode = (this.f440289e.hashCode() + com.avito.android.actions_sheet.a.f(this.f440288d, H.d(this.f440286b.hashCode() * 31, 31, this.f440287c), 31)) * 31;
        Long l12 = this.f440290f;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Uri uri = this.f440291g;
        return this.f440292h.hashCode() + ((iHashCode2 + (uri != null ? uri.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "CallRecordItem(stringId=" + this.f440286b + ", callId=" + this.f440287c + ", author=" + this.f440288d + ", dateTime=" + this.f440289e + ", duration=" + this.f440290f + ", uri=" + this.f440291g + ", selectedSpeed=" + this.f440292h + ')';
    }

    public /* synthetic */ C49088a(String str, String str2, PrintableText printableText, LocalDateTime localDateTime, Long l12, Uri uri, PlaySpeed playSpeed, int i12, C42822w c42822w) {
        this(str, str2, printableText, localDateTime, l12, (i12 & 32) != 0 ? null : uri, (i12 & 64) != 0 ? PlaySpeed.f121202d : playSpeed);
    }
}
