package com.avito.android.loyalty.ui.items.collapse;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: CollapseItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/loyalty/ui/items/collapse/a;", "Lcom/avito/conveyor_item/a;", "_avito_loyalty_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f183665b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f183666c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f183667d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<com.avito.conveyor_item.a> f183668e;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k String str, @k String str2, boolean z12, @k List<? extends com.avito.conveyor_item.a> list) {
        this.f183665b = str;
        this.f183666c = str2;
        this.f183667d = z12;
        this.f183668e = list;
    }

    public static a a(a aVar, boolean z12) {
        String str = aVar.f183665b;
        String str2 = aVar.f183666c;
        List<com.avito.conveyor_item.a> list = aVar.f183668e;
        aVar.getClass();
        return new a(str, str2, z12, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f183665b, aVar.f183665b) && L.f(this.f183666c, aVar.f183666c) && this.f183667d == aVar.f183667d && L.f(this.f183668e, aVar.f183668e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return getF183665b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183665b() {
        return this.f183665b;
    }

    public final int hashCode() {
        return this.f183668e.hashCode() + r.i(H.d(this.f183665b.hashCode() * 31, 31, this.f183666c), 31, this.f183667d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CollapseItem(stringId=");
        sb2.append(this.f183665b);
        sb2.append(", title=");
        sb2.append(this.f183666c);
        sb2.append(", isExpanded=");
        sb2.append(this.f183667d);
        sb2.append(", content=");
        return H.p(sb2, this.f183668e, ')');
    }

    public /* synthetic */ a(String str, String str2, boolean z12, List list, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? false : z12, list);
    }
}
