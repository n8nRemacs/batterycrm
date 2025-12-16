package com.avito.android.select.sectioned_multiselect.Items.section_item;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionImageItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266318b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266319c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f266320d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f266321e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f266322f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f266323g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Image f266324h;

    public a(String str, String str2, String str3, boolean z12, boolean z13, boolean z14, Image image, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? true : z12;
        z13 = (i12 & 16) != 0 ? true : z13;
        image = (i12 & 64) != 0 ? null : image;
        this.f266318b = str;
        this.f266319c = str2;
        this.f266320d = str3;
        this.f266321e = z12;
        this.f266322f = z13;
        this.f266323g = z14;
        this.f266324h = image;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266318b, aVar.f266318b) && L.f(this.f266319c, aVar.f266319c) && L.f(this.f266320d, aVar.f266320d) && this.f266321e == aVar.f266321e && this.f266322f == aVar.f266322f && this.f266323g == aVar.f266323g && L.f(this.f266324h, aVar.f266324h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF266834b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266834b() {
        return this.f266318b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f266318b.hashCode() * 31, 31, this.f266319c);
        String str = this.f266320d;
        int i12 = r.i(r.i(r.i((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f266321e), 31, this.f266322f), 31, this.f266323g);
        Image image = this.f266324h;
        return i12 + (image != null ? image.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionImageItem(stringId=");
        sb2.append(this.f266318b);
        sb2.append(", title=");
        sb2.append(this.f266319c);
        sb2.append(", subtitle=");
        sb2.append(this.f266320d);
        sb2.append(", isMultiselect=");
        sb2.append(this.f266321e);
        sb2.append(", isEnable=");
        sb2.append(this.f266322f);
        sb2.append(", selected=");
        sb2.append(this.f266323g);
        sb2.append(", image=");
        return AK.c.o(sb2, this.f266324h, ')');
    }
}
