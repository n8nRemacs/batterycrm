package com.avito.android.select.bottom_sheet.blueprints.icon_button_right;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ItemWithIconButtonRight.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/bottom_sheet/blueprints/icon_button_right/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f265132b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f265133c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f265134d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f265135e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f265136f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final com.avito.android.select.variant.a f265137g;

    public a(@k String str, @l String str2, @l String str3, @l String str4, @l String str5, @l com.avito.android.select.variant.a aVar) {
        this.f265132b = str;
        this.f265133c = str2;
        this.f265134d = str3;
        this.f265135e = str4;
        this.f265136f = str5;
        this.f265137g = aVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f265132b, aVar.f265132b) && L.f(this.f265133c, aVar.f265133c) && L.f(this.f265134d, aVar.f265134d) && L.f(this.f265135e, aVar.f265135e) && L.f(this.f265136f, aVar.f265136f) && L.f(this.f265137g, aVar.f265137g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124042b() {
        return getF265132b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265132b() {
        return this.f265132b;
    }

    public final int hashCode() {
        int iHashCode = this.f265132b.hashCode() * 31;
        String str = this.f265133c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f265134d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f265135e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f265136f;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        com.avito.android.select.variant.a aVar = this.f265137g;
        return iHashCode5 + (aVar != null ? aVar.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "ItemWithIconButtonRight(stringId=" + this.f265132b + ", title=" + this.f265133c + ", leftIconName=" + this.f265134d + ", rightIconName=" + this.f265135e + ", rightIconColor=" + this.f265136f + ", rightIconItem=" + this.f265137g + ')';
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, com.avito.android.select.variant.a aVar, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, (i12 & 16) != 0 ? null : str5, aVar);
    }
}
