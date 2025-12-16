package com.avito.android.review.report;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import bn0.C25683a;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: ComfortableDealReviewsScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
final class j extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f255404l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ List<C25683a> f255405m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f255406n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i12, int i13, List list) {
        super(2);
        this.f255404l = i12;
        this.f255405m = list;
        this.f255406n = i13;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f255406n | 1);
        h.b(this.f255404l, this.f255405m, a12, iA2);
        return G0.f406611a;
    }
}
