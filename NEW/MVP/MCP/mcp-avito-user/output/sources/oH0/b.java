package OH0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortTermRentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOH0/b;", "LOH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class b implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12156b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12157c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AttributedText f12158d;

    public b(@k String str, @k String str2, @l AttributedText attributedText) {
        this.f12156b = str;
        this.f12157c = str2;
        this.f12158d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f12156b, bVar.f12156b) && L.f(this.f12157c, bVar.f12157c) && L.f(this.f12158d, bVar.f12158d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272246b() {
        return this.f12156b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f12156b.hashCode() * 31, 31, this.f12157c);
        AttributedText attributedText = this.f12158d;
        return iD2 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortTermRentHiddenSwitcherItem(stringId=");
        sb2.append(this.f12156b);
        sb2.append(", title=");
        sb2.append(this.f12157c);
        sb2.append(", disclaimer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f12158d, ')');
    }
}
