package com.avito.android.early_access.adapter.banner;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EarlyAccessBanner.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ EarlyAccessBannerItem f145090l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f145091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f145092n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(EarlyAccessBannerItem earlyAccessBannerItem, v vVar, int i12) {
        super(2);
        this.f145090l = earlyAccessBannerItem;
        this.f145091m = vVar;
        this.f145092n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f145092n | 1);
        v vVar = this.f145091m;
        a.b(this.f145090l, vVar, a12, iA2);
        return G0.f406611a;
    }
}
