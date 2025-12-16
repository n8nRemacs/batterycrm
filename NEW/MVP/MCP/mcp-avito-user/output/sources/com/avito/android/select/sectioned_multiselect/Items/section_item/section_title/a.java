package com.avito.android.select.sectioned_multiselect.Items.section_item.section_title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionTitleItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/sectioned_multiselect/Items/section_item/section_title/a;", "Lcom/avito/conveyor_item/a;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f266382b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f266383c;

    public a(@k String str, @k String str2) {
        this.f266382b = str;
        this.f266383c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f266382b, aVar.f266382b) && L.f(this.f266383c, aVar.f266383c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF248508b() {
        return getF266834b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF266834b() {
        return this.f266382b;
    }

    public final int hashCode() {
        return this.f266383c.hashCode() + (this.f266382b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTitleItem(stringId=");
        sb2.append(this.f266382b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f266383c, ')');
    }
}
