package com.avito.android.tariff.cpx.info.limits.ui.items;

import Y41.l;
import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: TariffCpxInfoLimitsHeaderItem.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class c extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AttributedText f296650l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ l<DeepLink, G0> f296651m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ v f296652n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(AttributedText attributedText, l lVar, v vVar, int i12) {
        super(2);
        this.f296650l = attributedText;
        this.f296651m = lVar;
        this.f296652n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(393);
        v vVar = this.f296652n;
        d.a(this.f296650l, this.f296651m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
