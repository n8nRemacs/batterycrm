package com.avito.android.tariff_lf.edit_info.item.prolongation;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffProlongationItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf/edit_info/item/prolongation/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f299035b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f299036c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f299037d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f299038e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f299039f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f299040g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f299041h;

    public a(@Y61.k String str, @Y61.k String str2, @l String str3, @l AttributedText attributedText, boolean z12, boolean z13, @l AttributedText attributedText2) {
        this.f299035b = str;
        this.f299036c = str2;
        this.f299037d = str3;
        this.f299038e = attributedText;
        this.f299039f = z12;
        this.f299040g = z13;
        this.f299041h = attributedText2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f299035b, aVar.f299035b) && L.f(this.f299036c, aVar.f299036c) && L.f(this.f299037d, aVar.f299037d) && L.f(this.f299038e, aVar.f299038e) && this.f299039f == aVar.f299039f && this.f299040g == aVar.f299040g && L.f(this.f299041h, aVar.f299041h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF287660b() {
        return getF298724b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF298724b() {
        return this.f299035b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f299035b.hashCode() * 31, 31, this.f299036c);
        String str = this.f299037d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f299038e;
        int i12 = r.i(r.i((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.f299039f), 31, this.f299040g);
        AttributedText attributedText2 = this.f299041h;
        return i12 + (attributedText2 != null ? attributedText2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffProlongationItem(stringId=");
        sb2.append(this.f299035b);
        sb2.append(", title=");
        sb2.append(this.f299036c);
        sb2.append(", currentText=");
        sb2.append(this.f299037d);
        sb2.append(", description=");
        sb2.append(this.f299038e);
        sb2.append(", isSwitchOn=");
        sb2.append(this.f299039f);
        sb2.append(", isSwitchEnabled=");
        sb2.append(this.f299040g);
        sb2.append(", offDescription=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f299041h, ')');
    }
}
