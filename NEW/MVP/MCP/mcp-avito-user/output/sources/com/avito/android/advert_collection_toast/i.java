package com.avito.android.advert_collection_toast;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;

/* compiled from: AdvertCollectionToastView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class i extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f82407l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ DeepLink f82408m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.h<com.avito.android.lib.design.toast_bar.i> f82409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, DeepLink deepLink, l0.h<com.avito.android.lib.design.toast_bar.i> hVar) {
        super(0);
        this.f82407l = jVar;
        this.f82408m = deepLink;
        this.f82409n = hVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f82407l.f82413d.K5(this.f82408m);
        com.avito.android.lib.design.toast_bar.i iVar = this.f82409n.f406842b;
        if (iVar != null) {
            iVar.f();
        }
        return G0.f406611a;
    }
}
