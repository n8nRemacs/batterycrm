package PE0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileHeaderBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/g;", "", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AttributedText f12899a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f12900b;

    public g(@k AttributedText attributedText, @k AttributedText attributedText2) {
        this.f12899a = attributedText;
        this.f12900b = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f12899a, gVar.f12899a) && L.f(this.f12900b, gVar.f12900b);
    }

    public final int hashCode() {
        return this.f12900b.hashCode() + (this.f12899a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProfileHeaderBlackListInfo(title=");
        sb2.append(this.f12899a);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f12900b, ')');
    }
}
