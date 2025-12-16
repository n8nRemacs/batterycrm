package com.avito.android.profile.pro.impl.network;

import Y61.k;
import Y61.l;
import com.avito.android.profile.pro.impl.generated.api.ProfileProApi;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import h31.e;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: ProEnabledInfoProviderImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/network/b;", "Ls90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements s90.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<ProfileProApi> f222841a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f222842b;

    @Inject
    public b(@k R0 r02, @k e eVar) {
        this.f222841a = eVar;
        this.f222842b = r02;
    }

    @Override // s90.b
    @l
    public final Object a(@k SuspendLambda suspendLambda) {
        return C43259k.g(this.f222842b.a(), new a(this, null), suspendLambda);
    }
}
