package com.avito.android.mortgage_invite.participant.result;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage_invite.model.ApplicationCreateResult;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import q20.InterfaceC47187a;
import q20.InterfaceC47188b;

/* compiled from: ApplicationCreateResultHandler.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/mortgage_invite/participant/result/a;", "Lq20/a;", "Lq20/b;", "<init>", "()V", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Singleton
@ContributesBinding.b
/* loaded from: classes15.dex */
public final class a implements InterfaceC47187a, InterfaceC47188b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e2 f206252a = f2.b(0, 1, null, 5);

    @Inject
    public a() {
    }

    @Override // q20.InterfaceC47187a
    @k
    /* renamed from: a, reason: from getter */
    public final e2 getF206252a() {
        return this.f206252a;
    }

    @Override // q20.InterfaceC47188b
    public final void b(@k ApplicationCreateResult applicationCreateResult) {
        this.f206252a.K5(applicationCreateResult);
    }
}
