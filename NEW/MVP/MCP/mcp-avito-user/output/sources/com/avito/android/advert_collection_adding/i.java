package com.avito.android.advert_collection_adding;

import com.avito.android.advert_collection_adding.AdvertCollectionAddingDialog;
import com.avito.android.util.C35966w1;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AdvertCollectionAddingDialogFactory.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_collection_adding/i;", "Lcom/avito/android/advert_collection_adding/h;", "<init>", "()V", "_avito_advert-collection-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i implements h {
    @Override // com.avito.android.advert_collection_adding.h
    @Y61.k
    public final AdvertCollectionAddingDialog a(@Y61.l String str, @Y61.k List list) {
        AdvertCollectionAddingDialog.a aVar = AdvertCollectionAddingDialog.f81724n0;
        AdvertCollectionAddingArgument advertCollectionAddingArgument = new AdvertCollectionAddingArgument(list, str);
        aVar.getClass();
        AdvertCollectionAddingDialog advertCollectionAddingDialog = new AdvertCollectionAddingDialog();
        C35966w1.a(advertCollectionAddingDialog, -1, new f(advertCollectionAddingArgument));
        return advertCollectionAddingDialog;
    }
}
