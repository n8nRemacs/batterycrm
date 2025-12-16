package com.avito.android.blueprints.selector_card_group_bottom_sheet;

import androidx.compose.runtime.internal.P;
import com.avito.android.lib.design.selector_card.r;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectorCardGroupBottomSheetItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprints/selector_card_group_bottom_sheet/j;", "Lcom/avito/android/lib/design/selector_card/r;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class j implements r {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f106698b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final ParcelableEntity<String> f106699c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f106700d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f106701e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f106702f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f106703g;

    public j(@Y61.k String str, @Y61.k ParcelableEntity<String> parcelableEntity, @Y61.l String str2, @Y61.l UniversalImage universalImage, @Y61.l UniversalImage universalImage2, boolean z12) {
        this.f106698b = str;
        this.f106699c = parcelableEntity;
        this.f106700d = str2;
        this.f106701e = universalImage;
        this.f106702f = universalImage2;
        this.f106703g = z12;
    }

    @Override // com.avito.android.lib.design.selector_card.r
    public final boolean a(@Y61.k r rVar) {
        return (rVar instanceof j) && equals(rVar);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f106698b, jVar.f106698b) && L.f(this.f106699c, jVar.f106699c) && L.f(this.f106700d, jVar.f106700d) && L.f(this.f106701e, jVar.f106701e) && L.f(this.f106702f, jVar.f106702f) && this.f106703g == jVar.f106703g;
    }

    public final int hashCode() {
        int iHashCode = (this.f106699c.hashCode() + (this.f106698b.hashCode() * 31)) * 31;
        String str = this.f106700d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        UniversalImage universalImage = this.f106701e;
        int iHashCode3 = (iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f106702f;
        return Boolean.hashCode(this.f106703g) + ((iHashCode3 + (universalImage2 != null ? universalImage2.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.lib.design.selector_card.r
    /* renamed from: isEnabled */
    public final boolean getF309669f() {
        return true;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectorCardGroupBottomSheetItem(title=");
        sb2.append(this.f106698b);
        sb2.append(", value=");
        sb2.append(this.f106699c);
        sb2.append(", subtitle=");
        sb2.append(this.f106700d);
        sb2.append(", imageSelected=");
        sb2.append(this.f106701e);
        sb2.append(", imageUnselected=");
        sb2.append(this.f106702f);
        sb2.append(", isSelected=");
        return androidx.appcompat.app.r.x(sb2, this.f106703g, ')');
    }

    public /* synthetic */ j(String str, ParcelableEntity parcelableEntity, String str2, UniversalImage universalImage, UniversalImage universalImage2, boolean z12, int i12, C42822w c42822w) {
        this(str, parcelableEntity, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : universalImage, (i12 & 16) != 0 ? null : universalImage2, z12);
    }
}
