package com.avito.android.vas_performance.screens.competitive.ui.compose.items;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CompetitiveVasV2InfoAction.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class m extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f320521l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f320522m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320523n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ v f320524o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, DeepLink deepLink, Y41.l lVar, v vVar, int i12) {
        super(2);
        this.f320521l = str;
        this.f320522m = deepLink;
        this.f320523n = lVar;
        this.f320524o = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(3137);
        n.a(this.f320521l, this.f320522m, this.f320523n, this.f320524o, a12, iA2);
        return G0.f406611a;
    }
}
