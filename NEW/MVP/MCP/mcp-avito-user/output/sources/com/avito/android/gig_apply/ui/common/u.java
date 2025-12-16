package com.avito.android.gig_apply.ui.common;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SlotProgressWidget.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/gig_apply/ui/common/u;", "", "_avito_gig_slot-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f159978a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f159979b;

    /* renamed from: c, reason: collision with root package name */
    public final float f159980c;

    public u() {
        this(null, null, 0.0f, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f159978a, uVar.f159978a) && L.f(this.f159979b, uVar.f159979b) && Float.compare(this.f159980c, uVar.f159980c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f159980c) + H.d(this.f159978a.hashCode() * 31, 31, this.f159979b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SlotWidgetProgressState(start=");
        sb2.append(this.f159978a);
        sb2.append(", end=");
        sb2.append(this.f159979b);
        sb2.append(", progress=");
        return androidx.appcompat.app.r.k(')', this.f159980c, sb2);
    }

    public u(@Y61.k String str, @Y61.k String str2, float f12) {
        this.f159978a = str;
        this.f159979b = str2;
        this.f159980c = f12;
    }

    public /* synthetic */ u(String str, String str2, float f12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? 0.0f : f12);
    }
}
