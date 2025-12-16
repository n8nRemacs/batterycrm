package com.avito.android.rating_form.item.description;

import Y61.l;
import androidx.compose.foundation.H;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/rating_form/item/description/a;", "Lcom/avito/conveyor_item/a;", "_avito_rating-form_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f248368b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final List<String> f248369c;

    public a(@l String str, @l List list) {
        this.f248368b = str;
        this.f248369c = list;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return L.f(this.f248368b, aVar.f248368b) && L.f(this.f248369c, aVar.f248369c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return -1724546052;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public final String getF248946b() {
        return "description";
    }

    public final int hashCode() {
        String str = this.f248368b;
        int iHashCode = ((-1921320060) + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.f248369c;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DescriptionItem(stringId=description, title=");
        sb2.append(this.f248368b);
        sb2.append(", values=");
        return H.p(sb2, this.f248369c, ')');
    }
}
