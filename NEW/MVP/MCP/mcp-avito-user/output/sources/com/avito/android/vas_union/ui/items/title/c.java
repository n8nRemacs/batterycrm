package com.avito.android.vas_union.ui.items.title;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasUnionV2TitleItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_union/ui/items/title/c;", "Lcom/avito/conveyor_item/a;", "_avito_vas-union_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f323262b;

    public c(@k String str) {
        this.f323262b = str;
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
        return L.f(this.f323262b, cVar.f323262b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83595b() {
        return -1685371791;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF318502b() {
        return "key_vas_union_title";
    }

    public final int hashCode() {
        return this.f323262b.hashCode() - 706917969;
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("VasUnionV2TitleItem(stringId=key_vas_union_title, title="), this.f323262b, ')');
    }
}
