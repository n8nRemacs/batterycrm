package com.avito.android.account;

import A3.a;
import com.avito.android.remote.model.ProfileInfo;
import com.avito.android.remote.model.Session;
import kotlin.Metadata;

/* compiled from: AccountUpdateInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/O;", "", "_avito_account-storage_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface O {

    /* compiled from: AccountUpdateInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K a(@Y61.l String str, boolean z12);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K b(@Y61.l String str, @Y61.k Session session, @Y61.l String str2);

    void c(@Y61.k a.InterfaceC0003a.b bVar);

    void d(@Y61.l Boolean bool, @Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K e(@Y61.k Session session, @Y61.k ProfileInfo profileInfo, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.completable.K f(@Y61.k ProfileInfo profileInfo, @Y61.k Session session);

    void g(@Y61.k a.InterfaceC0003a.C0004a c0004a);

    void h();
}
