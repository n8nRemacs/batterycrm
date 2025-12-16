package com.avito.android.developments_agency_search.adapter.gallery;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GalleryItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/adapter/gallery/a;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f136278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Image> f136279c;

    /* renamed from: d, reason: collision with root package name */
    public final int f136280d;

    /* renamed from: e, reason: collision with root package name */
    public final float f136281e;

    public /* synthetic */ a(String str, List list, int i12, float f12, int i13, C42822w c42822w) {
        this(list, i12, (i13 & 8) != 0 ? 1.0f : f12, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f136278b, aVar.f136278b) && L.f(this.f136279c, aVar.f136279c) && this.f136280d == aVar.f136280d && Float.compare(this.f136281e, aVar.f136281e) == 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83798f() {
        return getF135507b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF135507b() {
        return this.f136278b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f136281e) + r.e(this.f136280d, H.e(this.f136278b.hashCode() * 31, 31, this.f136279c), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GalleryItem(stringId=");
        sb2.append(this.f136278b);
        sb2.append(", images=");
        sb2.append(this.f136279c);
        sb2.append(", horizontalPaddingDp=");
        sb2.append(this.f136280d);
        sb2.append(", opacity=");
        return r.k(')', this.f136281e, sb2);
    }

    public a(@k List list, int i12, float f12, @k String str) {
        this.f136278b = str;
        this.f136279c = list;
        this.f136280d = i12;
        this.f136281e = f12;
    }
}
