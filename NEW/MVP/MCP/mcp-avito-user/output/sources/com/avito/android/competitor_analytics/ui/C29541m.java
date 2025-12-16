package com.avito.android.competitor_analytics.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: CompetitorAnalyticsCommon.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.competitor_analytics.ui.m, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
final class C29541m extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f124811l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f124812m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f124813n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29541m(AttributedText attributedText, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f124811l = attributedText;
        this.f124812m = vVar;
        this.f124813n = i12;
    }

    @Override // Y41.p
    public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f124813n | 1);
        r.b(this.f124811l, this.f124812m, a12, iA2);
        return kotlin.G0.f406611a;
    }
}
