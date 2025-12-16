package com.avito.android.vas_performance.screens.stickers.buy.item.stickers;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StickersItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_performance/screens/stickers/buy/item/stickers/b;", "Lcom/avito/conveyor_item/a;", "_avito_vas-performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f320665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f320666c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<a> f320667d;

    public b(@Y61.k String str, int i12, @Y61.k List<a> list) {
        this.f320665b = str;
        this.f320666c = i12;
        this.f320667d = list;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f320665b, bVar.f320665b) && this.f320666c == bVar.f320666c && L.f(this.f320667d, bVar.f320667d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF268996b() {
        return getF320665b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF320665b() {
        return this.f320665b;
    }

    public final int hashCode() {
        return this.f320667d.hashCode() + r.e(this.f320666c, this.f320665b.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StickersItem(stringId=");
        sb2.append(this.f320665b);
        sb2.append(", maxSelect=");
        sb2.append(this.f320666c);
        sb2.append(", stickers=");
        return H.p(sb2, this.f320667d, ')');
    }
}
