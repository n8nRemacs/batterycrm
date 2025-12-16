package com.avito.android.adapter.gallery;

import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.V0;

/* compiled from: GalleryItemPresenter.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f68446l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ k f68447m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, k kVar) {
        super(0);
        this.f68446l = iVar;
        this.f68447m = kVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        i iVar = this.f68446l;
        if (!iVar.f68459f) {
            ((V0) C43259k.d(iVar.f68460g, null, null, new g(iVar, this.f68447m, null), 3)).k(new h(iVar));
        }
        return G0.f406611a;
    }
}
