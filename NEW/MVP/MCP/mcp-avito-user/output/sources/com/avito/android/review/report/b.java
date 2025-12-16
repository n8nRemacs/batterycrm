package com.avito.android.review.report;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealReviewsActivity.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class b extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ComfortableDealReviewsActivity f255385l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f255386m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ComfortableDealReviewsActivity comfortableDealReviewsActivity, int i12) {
        super(2);
        this.f255385l = comfortableDealReviewsActivity;
        this.f255386m = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f255386m | 1);
        ComfortableDealReviewsActivity.a2(this.f255385l, a12, iA2);
        return G0.f406611a;
    }
}
