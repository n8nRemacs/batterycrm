package com.avito.android.advert_collection_adding;

import L7.a;
import com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AdvertCollectionAddingStateRenderer.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class v extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<L7.a, G0> f81949l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public v(Y41.l<? super L7.a, G0> lVar) {
        super(1);
        this.f81949l = lVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        ((AdvertCollectionAddingDialog.c) this.f81949l).invoke(new a.b(str));
        return G0.f406611a;
    }
}
