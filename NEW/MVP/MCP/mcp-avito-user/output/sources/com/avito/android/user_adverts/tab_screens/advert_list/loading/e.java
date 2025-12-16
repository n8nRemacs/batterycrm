package com.avito.android.user_adverts.tab_screens.advert_list.loading;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.serp.adapter.O0;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LoadingMoreItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/loading/e;", "Lcom/avito/android/serp/adapter/O0;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements O0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f314745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f314746c;

    public e() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && L.f(this.f314745b, ((e) obj).f314745b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269930b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF279738f() {
        return this.f314746c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF312954b() {
        return this.f314745b;
    }

    public final int hashCode() {
        return this.f314745b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("LoadingMoreItem(stringId="), this.f314745b, ')');
    }

    public e(String str, int i12, C42822w c42822w) {
        this.f314745b = (i12 & 1) != 0 ? "loading_more_item" : str;
        this.f314746c = 1;
    }
}
