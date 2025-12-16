package com.avito.android.user_adverts.tab_screens.advert_list.disclaimer;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.serp.adapter.O0;
import com.avito.conveyor_item.a;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DisclaimerItem.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/advert_list/disclaimer/b;", "Lcom/avito/android/conveyor_shared_item/single_text/a;", "Lcom/avito/android/serp/adapter/O0;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements com.avito.android.conveyor_shared_item.single_text.a, O0 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f314726b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f314727c;

    /* renamed from: d, reason: collision with root package name */
    public final int f314728d;

    public b(String str, String str2, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? UUID.randomUUID().toString() : str2;
        this.f314726b = str;
        this.f314727c = str2;
        this.f314728d = 1;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f314726b, bVar.f314726b) && L.f(this.f314727c, bVar.f314727c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270468o() {
        return this.f314728d;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF309300b() {
        return this.f314727c;
    }

    @Override // com.avito.android.conveyor_shared_item.single_text.a
    @k
    /* renamed from: getTitle, reason: from getter */
    public final String getF314726b() {
        return this.f314726b;
    }

    public final int hashCode() {
        return this.f314727c.hashCode() + (this.f314726b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DisclaimerItem(title=");
        sb2.append(this.f314726b);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f314727c, ')');
    }
}
