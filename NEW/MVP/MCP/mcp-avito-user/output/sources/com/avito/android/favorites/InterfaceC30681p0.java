package com.avito.android.favorites;

import android.net.Uri;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import io.reactivex.rxjava3.internal.operators.observable.C41964k1;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsListInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/p0;", "", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.favorites.p0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public interface InterfaceC30681p0 {
    @Y61.k
    C41964k1 a();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.L0 b(@Y61.k Uri uri);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.H c(@Y61.k String str, boolean z12, @Y61.l String str2, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l Map map);

    void d(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.single.S e();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.M f();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.L0 g(@Y61.k Map map, @Y61.k Map map2, @Y61.l Boolean bool, @Y61.l String str);

    boolean h(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.M i();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.B0 j();
}
