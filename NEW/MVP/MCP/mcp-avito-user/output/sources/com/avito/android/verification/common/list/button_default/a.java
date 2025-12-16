package com.avito.android.verification.common.list.button_default;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ButtonDefaultItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/verification/common/list/button_default/a;", "Lcom/avito/conveyor_item/a;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323399b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f323400c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final DeepLink f323401d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f323402e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f323403f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Integer f323404g;

    public a(String str, String str2, DeepLink deepLink, boolean z12, boolean z13, Integer num, int i12, C42822w c42822w) {
        z12 = (i12 & 8) != 0 ? false : z12;
        z13 = (i12 & 16) != 0 ? false : z13;
        num = (i12 & 32) != 0 ? null : num;
        this.f323399b = str;
        this.f323400c = str2;
        this.f323401d = deepLink;
        this.f323402e = z12;
        this.f323403f = z13;
        this.f323404g = num;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f323399b, aVar.f323399b) && L.f(this.f323400c, aVar.f323400c) && L.f(this.f323401d, aVar.f323401d) && this.f323402e == aVar.f323402e && this.f323403f == aVar.f323403f && L.f(this.f323404g, aVar.f323404g);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222258b() {
        return getF323399b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF323399b() {
        return this.f323399b;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(com.avito.android.actions_sheet.a.e(this.f323401d, H.d(this.f323399b.hashCode() * 31, 31, this.f323400c), 31), 31, this.f323402e), 31, this.f323403f);
        Integer num = this.f323404g;
        return i12 + (num == null ? 0 : num.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonDefaultItem(stringId=");
        sb2.append(this.f323399b);
        sb2.append(", text=");
        sb2.append(this.f323400c);
        sb2.append(", uri=");
        sb2.append(this.f323401d);
        sb2.append(", isDisabled=");
        sb2.append(this.f323402e);
        sb2.append(", isLoading=");
        sb2.append(this.f323403f);
        sb2.append(", iconAttr=");
        return s.j(sb2, this.f323404g, ')');
    }
}
