package com.avito.android.tariff_lf_constructor.configure.setting.items.tariff_package;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.tariff_lf_constructor.configure.setting.items.model.ConfigureAttributeModel;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorSettingPackageItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/tariff_lf_constructor/configure/setting/items/tariff_package/a;", "Lcom/avito/conveyor_item/a;", "_avito_tariff-lf-constructor_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f300101b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f300102c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f300103d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f300104e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f300105f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f300106g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300107h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final ConfigureAttributeModel f300108i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f300109j;

    public a(@k String str, @k String str2, @k String str3, @l String str4, @k String str5, @k String str6, @l ConfigureAttributeModel configureAttributeModel, @l ConfigureAttributeModel configureAttributeModel2, boolean z12) {
        this.f300101b = str;
        this.f300102c = str2;
        this.f300103d = str3;
        this.f300104e = str4;
        this.f300105f = str5;
        this.f300106g = str6;
        this.f300107h = configureAttributeModel;
        this.f300108i = configureAttributeModel2;
        this.f300109j = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f300101b, aVar.f300101b) && L.f(this.f300102c, aVar.f300102c) && L.f(this.f300103d, aVar.f300103d) && L.f(this.f300104e, aVar.f300104e) && L.f(this.f300105f, aVar.f300105f) && L.f(this.f300106g, aVar.f300106g) && L.f(this.f300107h, aVar.f300107h) && L.f(this.f300108i, aVar.f300108i) && this.f300109j == aVar.f300109j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83054c() {
        return getF281631b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281631b() {
        return this.f300101b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f300101b.hashCode() * 31, 31, this.f300102c), 31, this.f300103d);
        String str = this.f300104e;
        int iD3 = H.d(H.d((iD2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f300105f), 31, this.f300106g);
        ConfigureAttributeModel configureAttributeModel = this.f300107h;
        int iHashCode = (iD3 + (configureAttributeModel == null ? 0 : configureAttributeModel.hashCode())) * 31;
        ConfigureAttributeModel configureAttributeModel2 = this.f300108i;
        return Boolean.hashCode(this.f300109j) + ((iHashCode + (configureAttributeModel2 != null ? configureAttributeModel2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorSettingPackageItem(stringId=");
        sb2.append(this.f300101b);
        sb2.append(", packageId=");
        sb2.append(this.f300102c);
        sb2.append(", category=");
        sb2.append(this.f300103d);
        sb2.append(", subcategories=");
        sb2.append(this.f300104e);
        sb2.append(", locations=");
        sb2.append(this.f300105f);
        sb2.append(", size=");
        sb2.append(this.f300106g);
        sb2.append(", discount=");
        sb2.append(this.f300107h);
        sb2.append(", price=");
        sb2.append(this.f300108i);
        sb2.append(", isLoading=");
        return r.x(sb2, this.f300109j, ')');
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, ConfigureAttributeModel configureAttributeModel, ConfigureAttributeModel configureAttributeModel2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, configureAttributeModel, configureAttributeModel2, (i12 & 256) != 0 ? false : z12);
    }
}
