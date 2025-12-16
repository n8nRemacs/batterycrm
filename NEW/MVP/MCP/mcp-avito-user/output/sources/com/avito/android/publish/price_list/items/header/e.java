package com.avito.android.publish.price_list.items.header;

import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelfServicesHeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/header/e;", "Lcom/avito/conveyor_item/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class e implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f238659b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f238660c;

    public e(@Y61.k String str) {
        this.f238659b = str;
        this.f238660c = String.valueOf(str.hashCode());
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f238659b, ((e) obj).f238659b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF222267b() {
        return getF228671b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF228671b() {
        return this.f238660c;
    }

    public final int hashCode() {
        return this.f238659b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("SelfServicesHeaderItem(title="), this.f238659b, ')');
    }
}
