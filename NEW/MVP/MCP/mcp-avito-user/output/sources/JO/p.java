package JO;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJO/p;", "LJO/o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class p implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f8980b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final UniversalImage f8981c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f8982d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f8983e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final AttributedText f8984f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final b f8985g;

    public p(@Y61.k String str, @Y61.k UniversalImage universalImage, @Y61.k String str2, @Y61.k String str3, @Y61.l AttributedText attributedText, @Y61.k b bVar) {
        this.f8980b = str;
        this.f8981c = universalImage;
        this.f8982d = str2;
        this.f8983e = str3;
        this.f8984f = attributedText;
        this.f8985g = bVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return L.f(this.f8980b, pVar.f8980b) && L.f(this.f8981c, pVar.f8981c) && L.f(this.f8982d, pVar.f8982d) && L.f(this.f8983e, pVar.f8983e) && L.f(this.f8984f, pVar.f8984f) && L.f(this.f8985g, pVar.f8985g);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    public final String getStringId() {
        return this.f8980b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.a(this.f8980b.hashCode() * 31, 31, this.f8981c), 31, this.f8982d), 31, this.f8983e);
        AttributedText attributedText = this.f8984f;
        return this.f8985g.hashCode() + ((iD2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "VerificationItemBlock(stringId=" + this.f8980b + ", universalImage=" + this.f8981c + ", title=" + this.f8982d + ", description=" + this.f8983e + ", link=" + this.f8984f + ", action=" + this.f8985g + ')';
    }
}
