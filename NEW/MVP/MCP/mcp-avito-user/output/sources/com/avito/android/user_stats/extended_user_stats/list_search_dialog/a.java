package com.avito.android.user_stats.extended_user_stats.list_search_dialog;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ListSearchDialogView.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/list_search_dialog/a;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ArrayList f317229a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f317230b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f317231c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final LinkedHashSet f317232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f317233e;

    public a(@k ArrayList arrayList, @k String str, @k String str2, @k LinkedHashSet linkedHashSet, int i12) {
        this.f317229a = arrayList;
        this.f317230b = str;
        this.f317231c = str2;
        this.f317232d = linkedHashSet;
        this.f317233e = i12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f317229a.equals(aVar.f317229a) && L.f(this.f317230b, aVar.f317230b) && L.f(this.f317231c, aVar.f317231c) && L.f(this.f317232d, aVar.f317232d) && this.f317233e == aVar.f317233e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f317233e) + ((this.f317232d.hashCode() + H.d(H.d(this.f317229a.hashCode() * 31, 31, this.f317230b), 31, this.f317231c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetConfigData(items=");
        sb2.append(this.f317229a);
        sb2.append(", title=");
        sb2.append(this.f317230b);
        sb2.append(", hint=");
        sb2.append(this.f317231c);
        sb2.append(", selectedEntity=");
        sb2.append(this.f317232d);
        sb2.append(", reqKey=");
        return r.t(sb2, this.f317233e, ')');
    }
}
