package fq0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: InitResultInfo.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lfq0/a;", "", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: fq0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C40466a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f396160a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f396161b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f396162c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f396163d;

    public C40466a(@k ArrayList arrayList, @k ArrayList arrayList2, @k ArrayList arrayList3, @k ArrayList arrayList4) {
        this.f396160a = arrayList;
        this.f396161b = arrayList2;
        this.f396162c = arrayList3;
        this.f396163d = arrayList4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40466a)) {
            return false;
        }
        C40466a c40466a = (C40466a) obj;
        return this.f396160a.equals(c40466a.f396160a) && this.f396161b.equals(c40466a.f396161b) && this.f396162c.equals(c40466a.f396162c) && this.f396163d.equals(c40466a.f396163d);
    }

    public final int hashCode() {
        return this.f396163d.hashCode() + e.g(this.f396162c, e.g(this.f396161b, this.f396160a.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InitResultInfo(uiItemList=");
        sb2.append(this.f396160a);
        sb2.append(", regionStateList=");
        sb2.append(this.f396161b);
        sb2.append(", uiChipsList=");
        sb2.append(this.f396162c);
        sb2.append(", isDistrictSelectByIndexList=");
        return e.p(sb2, this.f396163d, ')');
    }
}
