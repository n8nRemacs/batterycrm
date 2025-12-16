package com.yandex.div.core.player;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: DivVideoResolution.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/core/player/i;", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final int f367623a;

    /* renamed from: b, reason: collision with root package name */
    public final int f367624b;

    public i(int i12, int i13) {
        this.f367623a = i12;
        this.f367624b = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f367623a == iVar.f367623a && this.f367624b == iVar.f367624b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f367624b) + (Integer.hashCode(this.f367623a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DivVideoResolution(width=");
        sb2.append(this.f367623a);
        sb2.append(", height=");
        return r.t(sb2, this.f367624b, ')');
    }
}
