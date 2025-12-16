package PE0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EmptyStateBannerBlock.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LPE0/a;", "LOE0/a;", "_avito_travel-guest-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements OE0.a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f12879a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AttributedText f12880b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f12881c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final b f12882d;

    public a(@l String str, @k AttributedText attributedText, @k AttributedText attributedText2, @l b bVar) {
        this.f12879a = str;
        this.f12880b = attributedText;
        this.f12881c = attributedText2;
        this.f12882d = bVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f12879a, aVar.f12879a) && L.f(this.f12880b, aVar.f12880b) && L.f(this.f12881c, aVar.f12881c) && L.f(this.f12882d, aVar.f12882d);
    }

    public final int hashCode() {
        String str = this.f12879a;
        int iB2 = com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.f12880b), 31, this.f12881c);
        b bVar = this.f12882d;
        return iB2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "EmptyStateBannerBlock(bannerType=" + this.f12879a + ", title=" + this.f12880b + ", subtitle=" + this.f12881c + ", button=" + this.f12882d + ')';
    }
}
