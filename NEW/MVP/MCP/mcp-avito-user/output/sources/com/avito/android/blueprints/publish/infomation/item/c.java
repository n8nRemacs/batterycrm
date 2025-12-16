package com.avito.android.blueprints.publish.infomation.item;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: DisclaimerItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class c extends H implements l<DeepLink, G0> {
    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        ((io.reactivex.rxjava3.subjects.e) this.receiver).onNext(deepLink);
        return G0.f406611a;
    }
}
