package com.avito.android.search.filter.adapter.action_with_placeholders;

import Y41.l;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.H;

/* compiled from: ActionWithPlaceholdersItemPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class e extends H implements l<DeepLink, G0> {
    @Override // Y41.l
    public final G0 invoke(DeepLink deepLink) {
        ((com.jakewharton.rxrelay3.c) this.receiver).accept(deepLink);
        return G0.f406611a;
    }
}
