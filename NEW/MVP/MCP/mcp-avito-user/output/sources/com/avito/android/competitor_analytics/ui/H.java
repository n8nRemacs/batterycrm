package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.competitor_analytics.mvi.entity.b;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsFooter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b.e f124622l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124623m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f124624n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public H(b.e eVar, Y41.l<? super com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> lVar, int i12) {
        super(2);
        this.f124622l = eVar;
        this.f124623m = lVar;
        this.f124624n = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f124624n | 1);
        I.c(this.f124622l, this.f124623m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
