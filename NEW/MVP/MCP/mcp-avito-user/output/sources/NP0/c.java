package NP0;

import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CategoryParameter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNP0/c;", "Lcom/avito/android/lib/design/selector_card/r;", "_avito_widget-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.android.lib.design.selector_card.r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f11427b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f11428c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f11429d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f11430e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11431f;

    public c(@Y61.l String str, @Y61.l String str2, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, boolean z12) {
        this.f11427b = str;
        this.f11428c = str2;
        this.f11429d = universalImage;
        this.f11430e = universalImage2;
        this.f11431f = z12;
    }

    public static c b(c cVar, boolean z12) {
        String str = cVar.f11427b;
        String str2 = cVar.f11428c;
        UniversalImage universalImage = cVar.f11429d;
        UniversalImage universalImage2 = cVar.f11430e;
        cVar.getClass();
        return new c(str, str2, universalImage, universalImage2, z12);
    }

    @Override // com.avito.android.lib.design.selector_card.r
    public final boolean a(@Y61.k com.avito.android.lib.design.selector_card.r rVar) {
        return (rVar instanceof c) && equals(rVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11427b, cVar.f11427b) && L.f(this.f11428c, cVar.f11428c) && L.f(this.f11429d, cVar.f11429d) && L.f(this.f11430e, cVar.f11430e) && this.f11431f == cVar.f11431f;
    }

    public final int hashCode() {
        String str = this.f11427b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f11428c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f11429d;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f11430e;
        return Boolean.hashCode(this.f11431f) + ((iHashCode3 + (universalImage2 != null ? universalImage2.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.lib.design.selector_card.r
    /* renamed from: isEnabled */
    public final boolean getF309669f() {
        return true;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CategoryCard(id=");
        sb2.append(this.f11427b);
        sb2.append(", title=");
        sb2.append(this.f11428c);
        sb2.append(", imageActive=");
        sb2.append(this.f11429d);
        sb2.append(", imageInactive=");
        sb2.append(this.f11430e);
        sb2.append(", isSelected=");
        return androidx.appcompat.app.r.x(sb2, this.f11431f, ')');
    }
}
