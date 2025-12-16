package com.avito.android.advert_collection_toast;

import com.avito.android.lib.design.toast_bar.k;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.flow.e2;

/* compiled from: AdvertCollectionToastView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class g extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f82405l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(j jVar) {
        super(0);
        this.f82405l = jVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        j jVar = this.f82405l;
        e2 e2Var = jVar.f82411b;
        G0 g02 = G0.f406611a;
        e2Var.K5(g02);
        k kVar = jVar.f82415f;
        if (kVar != null) {
            kVar.f();
        }
        jVar.f82415f = null;
        return g02;
    }
}
