package OH0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShortTermRentItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOH0/e;", "LOH0/c;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class e implements c {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f12162b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f12163c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f12164d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f12165e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f12166f;

    public e(@k String str, @k String str2, boolean z12, boolean z13, @l AttributedText attributedText) {
        this.f12162b = str;
        this.f12163c = str2;
        this.f12164d = z12;
        this.f12165e = z13;
        this.f12166f = attributedText;
    }

    public static e a(e eVar, boolean z12, boolean z13) {
        String str = eVar.f12162b;
        String str2 = eVar.f12163c;
        AttributedText attributedText = eVar.f12166f;
        eVar.getClass();
        return new e(str, str2, z12, z13, attributedText);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f12162b, eVar.f12162b) && L.f(this.f12163c, eVar.f12163c) && this.f12164d == eVar.f12164d && this.f12165e == eVar.f12165e && L.f(this.f12166f, eVar.f12166f);
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
        return this.f12162b;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(H.d(this.f12162b.hashCode() * 31, 31, this.f12163c), 31, this.f12164d), 31, this.f12165e);
        AttributedText attributedText = this.f12166f;
        return i12 + (attributedText == null ? 0 : attributedText.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShortTermRentSwitcherItem(stringId=");
        sb2.append(this.f12162b);
        sb2.append(", title=");
        sb2.append(this.f12163c);
        sb2.append(", isEnabled=");
        sb2.append(this.f12164d);
        sb2.append(", isChecked=");
        sb2.append(this.f12165e);
        sb2.append(", disclaimer=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f12166f, ')');
    }
}
