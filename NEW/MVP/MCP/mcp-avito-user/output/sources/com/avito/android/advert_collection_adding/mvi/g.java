package com.avito.android.advert_collection_adding.mvi;

import com.avito.android.advert_collection_adding.mvi.entity.AdvertCollectionAddingInternalAction;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionAddingBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_collection_adding/mvi/g;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/advert_collection_adding/mvi/entity/AdvertCollectionAddingInternalAction;", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class g implements com.avito.android.arch.mvi.b<AdvertCollectionAddingInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.advert_collection_adding.k f81901a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<String> f81902b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f81903c;

    @Inject
    public g(@Y61.k com.avito.android.advert_collection_adding.k kVar, @Y61.k List<String> list, boolean z12) {
        this.f81901a = kVar;
        this.f81902b = list;
        this.f81903c = z12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<AdvertCollectionAddingInternalAction> a() {
        return this.f81903c ? C43175k.w() : this.f81902b.isEmpty() ? new C43210w(AdvertCollectionAddingInternalAction.ShowCreateCollectionScreen.f81888b) : this.f81901a.a();
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
