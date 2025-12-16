package com.avito.android.favorites.compose.search;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: FavoritesSearch.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class t extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f156913l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f156914m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f156915n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f156916o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f156917p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f156918q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f156919r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(String str, String str2, boolean z12, Y41.l lVar, Y41.a aVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f156913l = str;
        this.f156914m = str2;
        this.f156915n = z12;
        this.f156916o = lVar;
        this.f156917p = aVar;
        this.f156918q = vVar;
        this.f156919r = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f156919r | 1);
        Y41.l<String, G0> lVar = this.f156916o;
        Y41.a<G0> aVar = this.f156917p;
        m.d(this.f156913l, this.f156914m, this.f156915n, lVar, aVar, this.f156918q, a12, iA2);
        return G0.f406611a;
    }
}
