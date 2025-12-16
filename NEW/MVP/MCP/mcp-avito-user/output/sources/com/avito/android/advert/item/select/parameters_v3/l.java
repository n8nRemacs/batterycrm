package com.avito.android.advert.item.select.parameters_v3;

import androidx.compose.runtime.C22066f2;
import com.avito.android.advert.item.select.parameters_v3.y;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AutoSelectParametersV3Screen.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final class l extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ y.a f79590l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79591m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f79592n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f79593o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f79594p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(y.a aVar, Y41.l lVar, androidx.compose.ui.v vVar, boolean z12, int i12) {
        super(2);
        this.f79590l = aVar;
        this.f79591m = lVar;
        this.f79592n = vVar;
        this.f79593o = z12;
        this.f79594p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f79594p | 1);
        Y41.l<DeepLink, G0> lVar = this.f79591m;
        androidx.compose.ui.v vVar = this.f79592n;
        x.a(this.f79590l, lVar, vVar, this.f79593o, a12, iA2);
        return G0.f406611a;
    }
}
