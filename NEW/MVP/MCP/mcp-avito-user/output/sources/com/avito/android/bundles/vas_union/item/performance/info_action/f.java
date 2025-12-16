package com.avito.android.bundles.vas_union.item.performance.info_action;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import io.reactivex.rxjava3.core.z;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: InfoActionItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bundles/vas_union/item/performance/info_action/f;", "Lcom/avito/android/bundles/vas_union/item/performance/info_action/d;", "<init>", "()V", "_avito_vas-bundles_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e<DeepLink> f108617b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.subjects.e f108618c;

    @Inject
    public f() {
        io.reactivex.rxjava3.subjects.e<DeepLink> eVar = new io.reactivex.rxjava3.subjects.e<>();
        this.f108617b = eVar;
        this.f108618c = eVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        h hVar = (h) eVar;
        a aVar2 = (a) aVar;
        hVar.setTitle(aVar2.f108609b);
        hVar.c(new e(this, aVar2));
    }

    @Override // com.avito.android.deep_linking.K
    @k
    public final z<DeepLink> k() {
        return this.f108618c;
    }
}
