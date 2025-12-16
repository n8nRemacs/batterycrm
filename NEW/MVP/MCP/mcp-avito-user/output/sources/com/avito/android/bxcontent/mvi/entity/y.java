package com.avito.android.bxcontent.mvi.entity;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BxContentState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/y;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class y {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f112444a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final RecsReloadingState f112445b;

    /* JADX WARN: Multi-variable type inference failed */
    public y() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f112444a == yVar.f112444a && this.f112445b == yVar.f112445b;
    }

    public final int hashCode() {
        return this.f112445b.hashCode() + (Boolean.hashCode(this.f112444a) * 31);
    }

    @Y61.k
    public final String toString() {
        return "RecsReloadState(recsReloadButtonVisibility=" + this.f112444a + ", recsReloadingState=" + this.f112445b + ')';
    }

    public y(boolean z12, @Y61.k RecsReloadingState recsReloadingState) {
        this.f112444a = z12;
        this.f112445b = recsReloadingState;
    }

    public /* synthetic */ y(boolean z12, RecsReloadingState recsReloadingState, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12, (i12 & 2) != 0 ? RecsReloadingState.f112049b : recsReloadingState);
    }
}
