package com.avito.android.vas_performance.screens.stickers.edit.ui.compose;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StickersEditScreenContent.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
final class b extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ML0.c f320845l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<ML0.a, G0> f320846m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f320847n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ float f320848o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ v f320849p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ML0.c cVar, Y41.l lVar, Y41.l lVar2, float f12, v vVar, int i12) {
        super(2);
        this.f320845l = cVar;
        this.f320846m = lVar;
        this.f320847n = lVar2;
        this.f320848o = f12;
        this.f320849p = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(9);
        Y41.l<ML0.a, G0> lVar = this.f320846m;
        Y41.l<DeepLink, G0> lVar2 = this.f320847n;
        d.a(this.f320845l, lVar, lVar2, this.f320848o, a12, iA2);
        return G0.f406611a;
    }
}
