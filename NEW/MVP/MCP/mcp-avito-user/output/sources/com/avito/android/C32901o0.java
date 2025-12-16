package com.avito.android;

import com.avito.android.remote.model.FavoriteSellersCount;
import kotlin.Metadata;

/* compiled from: FavoriteSellersCounterLoader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/remote/model/FavoriteSellersCount;", "apply", "(Lcom/avito/android/remote/model/FavoriteSellersCount;)Ljava/lang/Integer;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.o0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C32901o0<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final C32901o0<T, R> f208204b = new C32901o0<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        return Integer.valueOf(((FavoriteSellersCount) obj).getCount());
    }
}
