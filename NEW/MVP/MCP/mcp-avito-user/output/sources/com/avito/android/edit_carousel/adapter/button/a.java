package com.avito.android.edit_carousel.adapter.button;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ly.InterfaceC43848a;

/* compiled from: ButtonItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/button/a;", "Lly/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC43848a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f146278b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f146279c;

    public a(String str, String str2, int i12, C42822w c42822w) {
        this.f146278b = (i12 & 1) != 0 ? "button_item" : str;
        this.f146279c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f146278b, aVar.f146278b) && L.f(this.f146279c, aVar.f146279c);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF146310b() {
        return this.f146278b;
    }

    public final int hashCode() {
        return this.f146279c.hashCode() + (this.f146278b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ButtonItem(stringId=");
        sb2.append(this.f146278b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f146279c, ')');
    }
}
