package com.avito.android.di.module;

import com.avito.android.remote.model.FavoriteSellersLoadingResult;
import com.avito.android.remote.model.SubscribeResult;
import com.avito.android.remote.model.UnsubscribeResult;
import com.avito.android.util.C35866p0;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: FavoriteSellersJsonModule_ProvideCustomTypeAdaptersFactory.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u0013\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00040\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/di/module/Z4;", "Ldagger/internal/h;", "", "Lcom/avito/android/util/p0;", "LX41/o;", "<init>", "()V", "_avito-discouraged_avito-api_favorite-sellers"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class Z4 implements dagger.internal.h<Set<C35866p0>> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final Z4 f144217a = new Z4();

    @Override // javax.inject.Provider
    public final Object get() {
        Y4.f144209a.getClass();
        return kotlin.collections.b1.g(new C35866p0(FavoriteSellersLoadingResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", FavoriteSellersLoadingResult.Ok.class), new kotlin.Q("list-expired", FavoriteSellersLoadingResult.ListExpiredError.class))), new C35866p0(SubscribeResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", SubscribeResult.SubscribeSuccess.class), new kotlin.Q("error-dialog", SubscribeResult.SubscribeErrorDialog.class), new kotlin.Q("action", SubscribeResult.SubscribeErrorAction.class))), new C35866p0(UnsubscribeResult.class, kotlin.collections.P0.g(new kotlin.Q("ok", UnsubscribeResult.UnsubscribeSuccess.class), new kotlin.Q("error-dialog", UnsubscribeResult.UnsubscribeErrorDialog.class), new kotlin.Q("action", UnsubscribeResult.UnsubscribeErrorAction.class))));
    }
}
