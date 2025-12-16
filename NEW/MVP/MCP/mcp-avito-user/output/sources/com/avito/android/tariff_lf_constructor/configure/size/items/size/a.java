package com.avito.android.tariff_lf_constructor.configure.size.items.size;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConfigureSizeItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/size/items/size/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300304b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f300305c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f300306d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f300307e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final AttributedText f300308f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final com.avito.android.tariff_lf_constructor.configure.size.ui.h f300309g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f300310h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f300311i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f300312j;

    public a(@k String str, @k String str2, @k String str3, @l String str4, @l AttributedText attributedText, @l com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar, boolean z12, boolean z13, boolean z14) {
        this.f300304b = str;
        this.f300305c = str2;
        this.f300306d = str3;
        this.f300307e = str4;
        this.f300308f = attributedText;
        this.f300309g = hVar;
        this.f300310h = z12;
        this.f300311i = z13;
        this.f300312j = z14;
    }

    public static a a(a aVar, String str, AttributedText attributedText, boolean z12, boolean z13, int i12) {
        String str2 = aVar.f300304b;
        String str3 = aVar.f300305c;
        String str4 = aVar.f300306d;
        if ((i12 & 8) != 0) {
            str = aVar.f300307e;
        }
        String str5 = str;
        if ((i12 & 16) != 0) {
            attributedText = aVar.f300308f;
        }
        AttributedText attributedText2 = attributedText;
        com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar = aVar.f300309g;
        boolean z14 = aVar.f300310h;
        if ((i12 & 128) != 0) {
            z12 = aVar.f300311i;
        }
        boolean z15 = z12;
        if ((i12 & 256) != 0) {
            z13 = aVar.f300312j;
        }
        aVar.getClass();
        return new a(str2, str3, str4, str5, attributedText2, hVar, z14, z15, z13);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f300304b, aVar.f300304b) && L.f(this.f300305c, aVar.f300305c) && L.f(this.f300306d, aVar.f300306d) && L.f(this.f300307e, aVar.f300307e) && L.f(this.f300308f, aVar.f300308f) && L.f(this.f300309g, aVar.f300309g) && this.f300310h == aVar.f300310h && this.f300311i == aVar.f300311i && this.f300312j == aVar.f300312j;
    }

    @Override // TV0.a
    public final long getId() {
        return getF296160b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF296160b() {
        return this.f300304b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f300304b.hashCode() * 31, 31, this.f300305c), 31, this.f300306d);
        String str = this.f300307e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f300308f;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar = this.f300309g;
        return Boolean.hashCode(this.f300312j) + r.i(r.i((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31, 31, this.f300310h), 31, this.f300311i);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConfigureSizeItem(stringId=");
        sb2.append(this.f300304b);
        sb2.append(", sizeId=");
        sb2.append(this.f300305c);
        sb2.append(", title=");
        sb2.append(this.f300306d);
        sb2.append(", subTitle=");
        sb2.append(this.f300307e);
        sb2.append(", description=");
        sb2.append(this.f300308f);
        sb2.append(", totalInfo=");
        sb2.append(this.f300309g);
        sb2.append(", isPublishFlow=");
        sb2.append(this.f300310h);
        sb2.append(", isSelected=");
        sb2.append(this.f300311i);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f300312j, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, AttributedText attributedText, com.avito.android.tariff_lf_constructor.configure.size.ui.h hVar, boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, attributedText, hVar, z12, z13, (i12 & 256) != 0 ? false : z14);
    }
}
