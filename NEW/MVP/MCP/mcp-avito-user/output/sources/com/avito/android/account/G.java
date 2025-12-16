package com.avito.android.account;

import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import io.reactivex.rxjava3.internal.operators.completable.C41816g;
import kotlin.Metadata;

/* compiled from: AccountStorageInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/G;", "Lcom/avito/android/account/E;", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface G extends E {

    /* compiled from: AccountStorageInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    /* renamed from: d */
    com.jakewharton.rxrelay3.b getF68056k();

    @Y61.k
    ProfileInfo e();

    @Y61.k
    /* renamed from: f */
    com.jakewharton.rxrelay3.b getF68055j();

    @Y61.k
    C41816g h(@Y61.l ProfileInfo profileInfo, @Y61.l Session session);

    @Y61.k
    K i();

    @Y61.k
    io.reactivex.rxjava3.internal.operators.maybe.A j();

    void l(boolean z12);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.r n();
}
