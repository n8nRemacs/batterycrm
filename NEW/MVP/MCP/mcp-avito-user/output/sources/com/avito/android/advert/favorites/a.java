package com.avito.android.advert.favorites;

import Y61.k;
import Y61.l;
import com.avito.android.advert_details.AdvertDetailsStyle;
import com.avito.android.remote.model.AdvertDetails;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import io.reactivex.rxjava3.internal.operators.observable.C41960j0;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.Metadata;

/* compiled from: AdvertDetailsFavoriteInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/favorites/a;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface a {

    /* compiled from: AdvertDetailsFavoriteInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.favorites.a$a, reason: collision with other inner class name */
    public static final class C2169a {
    }

    @k
    W b(@k String str, boolean z12);

    @k
    B0 c();

    @k
    C41960j0 d(@k String str);

    @k
    W e(@k AdvertDetailsStyle advertDetailsStyle, @k AdvertDetails advertDetails, @l String str, boolean z12);
}
