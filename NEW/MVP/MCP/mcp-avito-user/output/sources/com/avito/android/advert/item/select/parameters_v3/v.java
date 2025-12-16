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
final class v extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f79615l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ y.b f79616m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f79617n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f79618o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Y41.l lVar, y.b bVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f79615l = lVar;
        this.f79616m = bVar;
        this.f79617n = vVar;
        this.f79618o = i12;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f79618o | 1);
        x.c(this.f79615l, this.f79616m, this.f79617n, a12, iA2);
        return G0.f406611a;
    }
}
