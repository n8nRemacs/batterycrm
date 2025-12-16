package com.avito.android.publish.slots.address_from_profile.publish_item;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PublishAddressViewItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/address_from_profile/publish_item/r;", "Lcom/avito/android/publish/slots/address_from_profile/publish_item/s;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class r implements s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f242945b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<k> f242946c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f242947d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f242948e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Boolean f242949f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final CharSequence f242950g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f242951h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f242952i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f242953j;

    public r(@Y61.k String str, @Y61.k List<k> list, @Y61.l String str2, @Y61.l String str3, @Y61.l Boolean bool, @Y61.l CharSequence charSequence, @Y61.l String str4, @Y61.l String str5, boolean z12) {
        this.f242945b = str;
        this.f242946c = list;
        this.f242947d = str2;
        this.f242948e = str3;
        this.f242949f = bool;
        this.f242950g = charSequence;
        this.f242951h = str4;
        this.f242952i = str5;
        this.f242953j = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return L.f(this.f242945b, rVar.f242945b) && L.f(this.f242946c, rVar.f242946c) && L.f(this.f242947d, rVar.f242947d) && L.f(this.f242948e, rVar.f242948e) && L.f(this.f242949f, rVar.f242949f) && L.f(this.f242950g, rVar.f242950g) && L.f(this.f242951h, rVar.f242951h) && L.f(this.f242952i, rVar.f242952i) && this.f242953j == rVar.f242953j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80070b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF97993b() {
        return this.f242945b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f242945b.hashCode() * 31, 31, this.f242946c);
        String str = this.f242947d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f242948e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f242949f;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        CharSequence charSequence = this.f242950g;
        int iHashCode4 = (iHashCode3 + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str3 = this.f242951h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f242952i;
        return Boolean.hashCode(this.f242953j) + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PublishAddressViewItem(stringId=");
        sb2.append(this.f242945b);
        sb2.append(", addresses=");
        sb2.append(this.f242946c);
        sb2.append(", esid=");
        sb2.append(this.f242947d);
        sb2.append(", loadErrorText=");
        sb2.append(this.f242948e);
        sb2.append(", needSearch=");
        sb2.append(this.f242949f);
        sb2.append(", searchErrorText=");
        sb2.append((Object) this.f242950g);
        sb2.append(", searchPlaceholder=");
        sb2.append(this.f242951h);
        sb2.append(", validationErrorText=");
        sb2.append(this.f242952i);
        sb2.append(", showError=");
        return androidx.appcompat.app.r.x(sb2, this.f242953j, ')');
    }

    public /* synthetic */ r(String str, List list, String str2, String str3, Boolean bool, CharSequence charSequence, String str4, String str5, boolean z12, int i12, C42822w c42822w) {
        this(str, list, str2, str3, bool, charSequence, str4, str5, (i12 & 256) != 0 ? false : z12);
    }
}
