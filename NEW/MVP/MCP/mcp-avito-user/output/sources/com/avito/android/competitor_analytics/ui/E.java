package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22066f2;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsFooter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class E extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.competitor_analytics.mvi.entity.b f124604l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124605m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f124606n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f124607o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(com.avito.android.competitor_analytics.mvi.entity.b bVar, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f124604l = bVar;
        this.f124605m = lVar;
        this.f124606n = vVar;
        this.f124607o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f124607o | 1);
        androidx.compose.ui.v vVar = this.f124606n;
        I.a(this.f124604l, this.f124605m, vVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
