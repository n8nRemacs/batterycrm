package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsCommon.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.l, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29540l extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f124805l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.competitor_analytics.mvi.entity.a, kotlin.G0> f124806m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f124807n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f124808o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29540l(AttributedText attributedText, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f124805l = attributedText;
        this.f124806m = lVar;
        this.f124807n = vVar;
        this.f124808o = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f124808o | 1);
        androidx.compose.ui.v vVar = this.f124807n;
        r.a(this.f124805l, this.f124806m, vVar, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
