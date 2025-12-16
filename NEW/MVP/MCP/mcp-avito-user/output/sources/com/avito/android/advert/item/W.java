package com.avito.android.advert.item;

import com.avito.android.serp.adapter.PersistableSpannedItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.internal.C42801a;

/* compiled from: AdvertDetailsItemsPresenter.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* synthetic */ class W extends C42801a implements Y41.q<List<? extends PersistableSpannedItem>, com.avito.android.advert.item.commercials.a, Continuation<? super com.avito.android.advert.item.similars.t>, Object>, SuspendFunction {

    /* renamed from: b, reason: collision with root package name */
    public static final W f72279b = new W();

    public W() {
        super(3, com.avito.android.advert.item.similars.t.class, "<init>", "<init>(Ljava/util/List;Lcom/avito/android/advert/item/commercials/AdvertCommercials;)V", 4);
    }

    @Override // Y41.q
    public final Object invoke(List<? extends PersistableSpannedItem> list, com.avito.android.advert.item.commercials.a aVar, Continuation<? super com.avito.android.advert.item.similars.t> continuation) {
        int i12 = T.f71797Z5;
        return new com.avito.android.advert.item.similars.t(list, aVar);
    }
}
