package com.avito.android.mortgage.pre_approval.result.list.items.description;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: DescriptionItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/pre_approval/result/list/items/description/c;", "LT00/a;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements T00.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PrintableText f202037b;

    public c(@k PrintableText printableText) {
        this.f202037b = printableText;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        cVar.getClass();
        return this.f202037b.equals(cVar.f202037b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF199846b() {
        return "DESCRIPTION_ID";
    }

    public final int hashCode() {
        return this.f202037b.hashCode() + 2104365922;
    }

    @k
    public final String toString() {
        return AK.c.m(new StringBuilder("DescriptionItem(stringId=DESCRIPTION_ID, text="), this.f202037b, ')');
    }
}
