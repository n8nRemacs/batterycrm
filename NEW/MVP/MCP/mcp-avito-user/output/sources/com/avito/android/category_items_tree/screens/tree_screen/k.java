package com.avito.android.category_items_tree.screens.tree_screen;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TreeItemModel.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/category_items_tree/screens/tree_screen/k;", "", "_avito_category-items-tree_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f117145a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f117146b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f117147c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f117148d;

    /* renamed from: e, reason: collision with root package name */
    public final int f117149e;

    public k(int i12, @Y61.k String str, @Y61.k String str2, boolean z12, boolean z13) {
        this.f117145a = str;
        this.f117146b = str2;
        this.f117147c = z12;
        this.f117148d = z13;
        this.f117149e = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f117145a, kVar.f117145a) && L.f(this.f117146b, kVar.f117146b) && this.f117147c == kVar.f117147c && this.f117148d == kVar.f117148d && this.f117149e == kVar.f117149e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117149e) + r.i(r.i(H.d(this.f117145a.hashCode() * 31, 31, this.f117146b), 31, this.f117147c), 31, this.f117148d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TreeItemModel(id=");
        sb2.append(this.f117145a);
        sb2.append(", name=");
        sb2.append(this.f117146b);
        sb2.append(", hasItems=");
        sb2.append(this.f117147c);
        sb2.append(", isVertical=");
        sb2.append(this.f117148d);
        sb2.append(", level=");
        return r.t(sb2, this.f117149e, ')');
    }

    public /* synthetic */ k(String str, String str2, boolean z12, boolean z13, int i12, int i13, C42822w c42822w) {
        this((i13 & 16) != 0 ? 0 : i12, str, str2, z12, z13);
    }
}
