package com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionCheckableItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_checkbox/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266364b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266365c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f266366d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f266367e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f266368f;

    public a(@k String str, @k String str2, @l UniversalImage universalImage, boolean z12, boolean z13) {
        this.f266364b = str;
        this.f266365c = str2;
        this.f266366d = universalImage;
        this.f266367e = z12;
        this.f266368f = z13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266364b, aVar.f266364b) && L.f(this.f266365c, aVar.f266365c) && L.f(this.f266366d, aVar.f266366d) && this.f266367e == aVar.f266367e && this.f266368f == aVar.f266368f;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return getF266350b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266350b() {
        return this.f266364b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f266364b.hashCode() * 31, 31, this.f266365c);
        UniversalImage universalImage = this.f266366d;
        return Boolean.hashCode(this.f266368f) + r.i((iD2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31, 31, this.f266367e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionCheckableItem(stringId=");
        sb2.append(this.f266364b);
        sb2.append(", title=");
        sb2.append(this.f266365c);
        sb2.append(", icon=");
        sb2.append(this.f266366d);
        sb2.append(", selected=");
        sb2.append(this.f266367e);
        sb2.append(", isEnable=");
        return r.x(sb2, this.f266368f, ')');
    }
}
