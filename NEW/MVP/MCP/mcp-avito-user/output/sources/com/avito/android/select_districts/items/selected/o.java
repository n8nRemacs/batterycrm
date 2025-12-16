package com.avito.android.select_districts.items.selected;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectedDistrictsTagsItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select_districts/items/selected/o;", "", "_avito_select-districts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f267003a;

    /* renamed from: b, reason: collision with root package name */
    public final int f267004b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f267005c;

    public o(@Y61.k String str, int i12, @Y61.k String str2) {
        this.f267003a = str;
        this.f267004b = i12;
        this.f267005c = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return L.f(this.f267003a, oVar.f267003a) && this.f267004b == oVar.f267004b && L.f(this.f267005c, oVar.f267005c);
    }

    public final int hashCode() {
        return this.f267005c.hashCode() + r.e(this.f267004b, this.f267003a.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectedTagItem(id=");
        sb2.append(this.f267003a);
        sb2.append(", position=");
        sb2.append(this.f267004b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f267005c, ')');
    }
}
