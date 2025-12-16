package com.avito.android.messenger.flower.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.U;
import com.avito.android.util.R0;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;

/* compiled from: FlowerRedirectUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/flower/domain/c;", "Lcom/avito/android/messenger/flower/domain/a;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f196339a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final U f196340b;

    @Inject
    public c(@k R0 r02, @k U u12) {
        this.f196339a = r02;
        this.f196340b = u12;
    }

    @Override // com.avito.android.messenger.flower.domain.a
    @l
    public final Object a(@k String str, @l Map map, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f196339a.a(), new b(this, str, map, null), suspendLambda);
    }
}
