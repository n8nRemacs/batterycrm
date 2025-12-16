package com.avito.android.gig_apply.ui.common;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TextWithShowMoreWidget.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/y;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f159991a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f159992b;

    /* JADX WARN: Multi-variable type inference failed */
    public y() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return L.f(this.f159991a, yVar.f159991a) && L.f(this.f159992b, yVar.f159992b);
    }

    public final int hashCode() {
        return this.f159992b.hashCode() + (this.f159991a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextWithShowMoreWidgetState(title=");
        sb2.append(this.f159991a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f159992b, ')');
    }

    public y(@Y61.k String str, @Y61.k String str2) {
        this.f159991a = str;
        this.f159992b = str2;
    }

    public /* synthetic */ y(String str, String str2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2);
    }
}
