package com.avito.android.blueprints.publish.header;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: HeaderItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* synthetic */ class f extends H implements Y41.l<DeepLink, G0> {
    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        ((com.jakewharton.rxrelay3.c) this.receiver).accept(deepLink);
        return G0.f406611a;
    }
}
