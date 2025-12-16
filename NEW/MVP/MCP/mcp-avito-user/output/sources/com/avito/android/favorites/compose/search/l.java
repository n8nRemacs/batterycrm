package com.avito.android.favorites.compose.search;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoritesSearch.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class l extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ boolean f156892l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156893m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f156894n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f156895o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(int i12, Y41.a aVar, androidx.compose.ui.v vVar, boolean z12) {
        super(2);
        this.f156892l = z12;
        this.f156893m = aVar;
        this.f156894n = vVar;
        this.f156895o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f156895o | 1);
        boolean z12 = this.f156892l;
        m.a(iA2, this.f156893m, a12, this.f156894n, z12);
        return G0.f406611a;
    }
}
