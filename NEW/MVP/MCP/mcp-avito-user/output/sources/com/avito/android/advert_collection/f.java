package com.avito.android.advert_collection;

import android.app.Application;
import android.content.Intent;
import com.avito.android.L;
import com.avito.android.advert_collection.AdvertCollectionActivity;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertCollectionIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/f;", "Lcom/avito/android/advert_collection/e;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class f implements InterfaceC28257e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Application f81490a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final L f81491b;

    @Inject
    public f(@Y61.k Application application, @Y61.k L l12) {
        this.f81490a = application;
        this.f81491b = l12;
    }

    @Override // com.avito.android.advert_collection.InterfaceC28257e
    @Y61.k
    public final Intent a(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l NavigationTabSetItem navigationTabSetItem) {
        if (navigationTabSetItem != null) {
            return this.f81491b.d(new AdvertCollectionFragmentData(new AdvertCollectionArguments(str, str2, str3), navigationTabSetItem));
        }
        new AdvertCollectionActivity.a();
        Intent intentPutExtra = new Intent(this.f81490a, (Class<?>) AdvertCollectionActivity.class).putExtra("arguments", new AdvertCollectionArguments(str, str2, str3));
        intentPutExtra.setFlags(603979776);
        return intentPutExtra;
    }
}
