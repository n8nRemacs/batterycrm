package com.avito.android.lf_levels.ui.items.business_tools_header;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: LfBusinessToolHeaderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lf_levels/ui/items/business_tools_header/a;", "LBR/a;", "_avito_lf-levels_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements BR.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f175425b;

    /* renamed from: c, reason: collision with root package name */
    public final int f175426c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AttributedText f175427d;

    public a(int i12, @k AttributedText attributedText, @k String str) {
        this.f175425b = str;
        this.f175426c = i12;
        this.f175427d = attributedText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f175425b, aVar.f175425b) && this.f175426c == aVar.f175426c && L.f(this.f175427d, aVar.f175427d);
    }

    @Override // BR.a
    /* renamed from: g, reason: from getter */
    public final int getF175426c() {
        return this.f175426c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF171703b() {
        return this.f175425b;
    }

    public final int hashCode() {
        return this.f175427d.hashCode() + r.e(this.f175426c, this.f175425b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LfBusinessToolHeaderItem(stringId=");
        sb2.append(this.f175425b);
        sb2.append(", levelId=");
        sb2.append(this.f175426c);
        sb2.append(", title=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f175427d, ')');
    }
}
