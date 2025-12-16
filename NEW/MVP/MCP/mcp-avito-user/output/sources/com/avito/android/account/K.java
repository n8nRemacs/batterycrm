package com.avito.android.account;

import com.avito.android.remote.model.ProfileInfo;
import kotlin.Metadata;

/* compiled from: AccountStorageInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/account/K;", "Lcom/avito/android/account/W;", "_avito_account-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class K implements W {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ M f68044a;

    public K(M m12) {
        this.f68044a = m12;
    }

    @Override // com.avito.android.account.W
    @Y61.k
    public final ProfileInfo a() {
        return this.f68044a.e();
    }

    @Override // com.avito.android.account.W
    @Y61.l
    public final String b() {
        return this.f68044a.e().getUserId();
    }

    @Y61.k
    public final String c() {
        return this.f68044a.p().getAccessToken();
    }
}
