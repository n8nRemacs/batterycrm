package com.avito.android.screens.bbip.ui.items.duration;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DurationItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/screens/bbip/ui/items/duration/b;", "Lcom/avito/conveyor_item/a;", "_avito_bbip_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class b implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f260340b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f260341c;

    /* renamed from: d, reason: collision with root package name */
    public final int f260342d;

    /* renamed from: e, reason: collision with root package name */
    public final int f260343e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f260344f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f260345g;

    /* renamed from: h, reason: collision with root package name */
    public final int f260346h;

    /* renamed from: i, reason: collision with root package name */
    public final int f260347i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f260348j;

    public b(@Y61.k String str, @Y61.k String str2, int i12, int i13, @Y61.k List<Integer> list, @Y61.k List<Integer> list2, int i14, int i15, @Y61.k String str3) {
        this.f260340b = str;
        this.f260341c = str2;
        this.f260342d = i12;
        this.f260343e = i13;
        this.f260344f = list;
        this.f260345g = list2;
        this.f260346h = i14;
        this.f260347i = i15;
        this.f260348j = str3;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f260340b, bVar.f260340b) && L.f(this.f260341c, bVar.f260341c) && this.f260342d == bVar.f260342d && this.f260343e == bVar.f260343e && L.f(this.f260344f, bVar.f260344f) && L.f(this.f260345g, bVar.f260345g) && this.f260346h == bVar.f260346h && this.f260347i == bVar.f260347i && L.f(this.f260348j, bVar.f260348j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF189214d().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF189214d() {
        return this.f260340b;
    }

    public final int hashCode() {
        return this.f260348j.hashCode() + r.e(this.f260347i, r.e(this.f260346h, H.e(H.e(r.e(this.f260343e, r.e(this.f260342d, H.d(this.f260340b.hashCode() * 31, 31, this.f260341c), 31), 31), 31, this.f260344f), 31, this.f260345g), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DurationItem(stringId=");
        sb2.append(this.f260340b);
        sb2.append(", title=");
        sb2.append(this.f260341c);
        sb2.append(", minDuration=");
        sb2.append(this.f260342d);
        sb2.append(", maxDuration=");
        sb2.append(this.f260343e);
        sb2.append(", recommendedDurations=");
        sb2.append(this.f260344f);
        sb2.append(", showDurations=");
        sb2.append(this.f260345g);
        sb2.append(", preselectedDuration=");
        sb2.append(this.f260346h);
        sb2.append(", selectedDuration=");
        sb2.append(this.f260347i);
        sb2.append(", moreButtonLabel=");
        return C22026a.c(sb2, this.f260348j, ')');
    }
}
