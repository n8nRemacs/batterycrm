package com.avito.android.advert_collection_core;

import Y61.k;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlinx.coroutines.channels.A;
import kotlinx.coroutines.channels.C43108m;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AdvertCollectionEventBus.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert_collection_core/a;", "Lcom/avito/android/advert_collection_core/d;", "Lcom/avito/android/advert_collection_core/c;", "<init>", "()V", "_avito-discouraged_avito-libs_advert-collection-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements d, c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C43108m f81965a = A.a(-1, null, null, 6);

    @Inject
    public a() {
    }

    @Override // com.avito.android.advert_collection_core.c
    public final void a() {
        this.f81965a.w(G0.f406611a);
    }

    @Override // com.avito.android.advert_collection_core.d
    @k
    public final InterfaceC43160i<G0> b() {
        return C43175k.Q(this.f81965a);
    }
}
