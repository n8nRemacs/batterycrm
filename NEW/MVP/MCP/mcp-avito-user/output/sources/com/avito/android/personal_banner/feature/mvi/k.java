package com.avito.android.personal_banner.feature.mvi;

import com.avito.android.personal_banner.feature.domain.model.BannerContext;
import com.avito.android.personal_banner.feature.mvi.a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.flow.Z1;

/* compiled from: BannerActor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class k extends C42801a implements Y41.p<BannerContext, Continuation<? super G0>, Object>, SuspendFunction {
    @Override // Y41.p
    public final Object invoke(BannerContext bannerContext, Continuation<? super G0> continuation) {
        Object value;
        BannerContext bannerContext2 = bannerContext;
        a.C6453a c6453a = (a.C6453a) this.receiver;
        c6453a.getClass();
        Z1<ValueT> z12 = c6453a.f215612b.f92113b;
        do {
            value = z12.getValue();
        } while (!z12.N3(value, bannerContext2));
        return G0.f406611a;
    }
}
