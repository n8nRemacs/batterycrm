package com.avito.android.bbip_common.ui.chips;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.chips.InterfaceC27333b;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: BbipChipable.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bbip_common/ui/chips/b;", "Lcom/akita/compose/component/chips/b;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class b implements InterfaceC27333b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f99067b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f99068c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f99069d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99070e;

    public b(@k String str, @l String str2, boolean z12, boolean z13) {
        this.f99067b = str;
        this.f99068c = str2;
        this.f99069d = z12;
        this.f99070e = z13;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: c */
    public final Integer getF60871f() {
        return null;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @InterfaceC42165v
    @l
    /* renamed from: d */
    public final Integer getF60870e() {
        return null;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f99067b, bVar.f99067b) && L.f(this.f99068c, bVar.f99068c) && this.f99069d == bVar.f99069d && this.f99070e == bVar.f99070e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF99067b() {
        return this.f99067b;
    }

    public final int hashCode() {
        int iHashCode = this.f99067b.hashCode() * 31;
        String str = this.f99068c;
        return Boolean.hashCode(this.f99070e) + r.i((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f99069d);
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isActive, reason: from getter */
    public final boolean getF99070e() {
        return this.f99070e;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isEnabled */
    public final boolean getF60869d() {
        return true;
    }

    @Override // com.akita.compose.component.chips.InterfaceC27333b
    /* renamed from: isSelected, reason: from getter */
    public final boolean getF99069d() {
        return this.f99069d;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BbipChipable(title=");
        sb2.append(this.f99067b);
        sb2.append(", chipSubTitle=");
        sb2.append(this.f99068c);
        sb2.append(", isSelected=");
        sb2.append(this.f99069d);
        sb2.append(", isActive=");
        return r.x(sb2, this.f99070e, ')');
    }

    public /* synthetic */ b(String str, String str2, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? true : z13);
    }
}
