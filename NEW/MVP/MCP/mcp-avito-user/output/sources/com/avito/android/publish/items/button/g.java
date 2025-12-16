package com.avito.android.publish.items.button;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: DeepLinkActionButtonPresenter.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/items/button/g;", "Lcom/avito/android/publish/items/button/f;", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class g implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<DeepLink> f236791b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c f236792c;

    @Inject
    public g() {
        com.jakewharton.rxrelay3.c<DeepLink> cVar = new com.jakewharton.rxrelay3.c<>();
        this.f236791b = cVar;
        this.f236792c = cVar;
    }

    @Override // com.avito.android.publish.items.button.f
    @k
    public final z<DeepLink> B() {
        return this.f236792c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        DeepLinkActionButtonItem deepLinkActionButtonItem = (DeepLinkActionButtonItem) aVar;
        ((c) eVar).qV(deepLinkActionButtonItem.f236784d, deepLinkActionButtonItem.f236783c, new com.avito.android.profile.pro.impl.screen.item.recommendations.h(21, this, deepLinkActionButtonItem));
    }
}
