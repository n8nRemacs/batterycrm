package com.avito.android.extended_profile_adverts.adapter.placeholder;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.serp.adapter.i1;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PlaceholderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_adverts/adapter/placeholder/a;", "Lcom/avito/android/serp/adapter/i1;", "_avito_extended-profile-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements i1 {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f150588b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150589c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f150590d;

    public a(String str, int i12, String str2, int i13, C42822w c42822w) {
        str2 = (i13 & 4) != 0 ? ChannelContext.Item.PLACEHOLDER : str2;
        this.f150588b = str;
        this.f150589c = i12;
        this.f150590d = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f150588b, aVar.f150588b) && this.f150589c == aVar.f150589c && L.f(this.f150590d, aVar.f150590d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85355b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85358e() {
        return this.f150589c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF106316b() {
        return this.f150590d;
    }

    public final int hashCode() {
        return this.f150590d.hashCode() + r.e(this.f150589c, this.f150588b.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PlaceholderItem(text=");
        sb2.append(this.f150588b);
        sb2.append(", spanCount=");
        sb2.append(this.f150589c);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f150590d, ')');
    }
}
