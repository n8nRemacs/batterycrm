package com.avito.android.mortgage_category;

import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: MortgageCategoryScreen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final class s extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ O10.b f204974l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.screens.mvi.r f204975m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f204976n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f204977o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f204978p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(O10.b bVar, com.avito.android.analytics.screens.mvi.r rVar, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f204974l = bVar;
        this.f204975m = rVar;
        this.f204976n = aVar;
        this.f204977o = vVar;
        this.f204978p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f204978p | 1);
        com.avito.android.analytics.screens.mvi.r rVar = this.f204975m;
        Y41.a<G0> aVar = this.f204976n;
        A.d(this.f204974l, rVar, aVar, this.f204977o, a12, iA2);
        return G0.f406611a;
    }
}
