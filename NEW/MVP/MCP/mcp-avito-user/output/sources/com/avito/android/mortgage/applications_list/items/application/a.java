package com.avito.android.mortgage.applications_list.items.application;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplicationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/applications_list/items/application/a;", "Lcom/avito/conveyor_item/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f198404b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final i f198405c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f198406d;

    /* renamed from: e, reason: collision with root package name */
    public final int f198407e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f198408f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f198409g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AttributedText f198410h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final UniversalColor f198411i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final DeepLink f198412j;

    public a(@k String str, @l i iVar, @k ArrayList arrayList, int i12, @l String str2, @l String str3, @l AttributedText attributedText, @k UniversalColor universalColor, @k DeepLink deepLink) {
        this.f198404b = str;
        this.f198405c = iVar;
        this.f198406d = arrayList;
        this.f198407e = i12;
        this.f198408f = str2;
        this.f198409g = str3;
        this.f198410h = attributedText;
        this.f198411i = universalColor;
        this.f198412j = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f198404b, aVar.f198404b) && L.f(this.f198405c, aVar.f198405c) && this.f198406d.equals(aVar.f198406d) && this.f198407e == aVar.f198407e && L.f(this.f198408f, aVar.f198408f) && L.f(this.f198409g, aVar.f198409g) && L.f(this.f198410h, aVar.f198410h) && this.f198411i.equals(aVar.f198411i) && L.f(this.f198412j, aVar.f198412j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF82706b() {
        return getF82707c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF82707c() {
        return this.f198404b;
    }

    public final int hashCode() {
        int iHashCode = this.f198404b.hashCode() * 31;
        i iVar = this.f198405c;
        int iE2 = r.e(this.f198407e, androidx.compose.ui.graphics.colorspace.e.g(this.f198406d, (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31), 31);
        String str = this.f198408f;
        int iHashCode2 = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f198409g;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AttributedText attributedText = this.f198410h;
        return this.f198412j.hashCode() + com.avito.android.actions_sheet.a.i(this.f198411i, (iHashCode3 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ApplicationItem(applicationId=");
        sb2.append(this.f198404b);
        sb2.append(", banksImageConfig=");
        sb2.append(this.f198405c);
        sb2.append(", steps=");
        sb2.append(this.f198406d);
        sb2.append(", currentStep=");
        sb2.append(this.f198407e);
        sb2.append(", description=");
        sb2.append(this.f198408f);
        sb2.append(", label=");
        sb2.append(this.f198409g);
        sb2.append(", stepDescription=");
        sb2.append(this.f198410h);
        sb2.append(", backgroundColor=");
        sb2.append(this.f198411i);
        sb2.append(", deeplink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f198412j, ')');
    }
}
