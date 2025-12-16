package com.avito.android.publish.slots.sleeping_places.sleeping_places_dialog.dialog_items.bed_type;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BedTypeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/sleeping_places/sleeping_places_dialog/dialog_items/bed_type/a;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f244992b;

    /* renamed from: c, reason: collision with root package name */
    public final int f244993c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f244994d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f244995e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Image f244996f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f244997g;

    public a(@k String str, int i12, @l String str2, @l String str3, @l Image image, boolean z12) {
        this.f244992b = str;
        this.f244993c = i12;
        this.f244994d = str2;
        this.f244995e = str3;
        this.f244996f = image;
        this.f244997g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f244992b, aVar.f244992b) && this.f244993c == aVar.f244993c && L.f(this.f244994d, aVar.f244994d) && L.f(this.f244995e, aVar.f244995e) && L.f(this.f244996f, aVar.f244996f) && this.f244997g == aVar.f244997g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287650b() {
        return getF289058e().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF289058e() {
        return this.f244992b;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f244993c, this.f244992b.hashCode() * 31, 31);
        String str = this.f244994d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f244995e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Image image = this.f244996f;
        return Boolean.hashCode(this.f244997g) + ((iHashCode2 + (image != null ? image.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BedTypeItem(stringId=");
        sb2.append(this.f244992b);
        sb2.append(", bedTypeId=");
        sb2.append(this.f244993c);
        sb2.append(", title=");
        sb2.append(this.f244994d);
        sb2.append(", subtitle=");
        sb2.append(this.f244995e);
        sb2.append(", image=");
        sb2.append(this.f244996f);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f244997g, ')');
    }
}
