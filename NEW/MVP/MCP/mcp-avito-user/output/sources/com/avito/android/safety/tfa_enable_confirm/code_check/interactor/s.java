package com.avito.android.safety.tfa_enable_confirm.code_check.interactor;

import androidx.compose.runtime.internal.P;
import com.avito.android.code_check_public.a;
import com.squareup.anvil.annotations.ContributesBinding;
import io0.InterfaceC42082a;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: TfaEnableCodeCheckPreRequestInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/s;", "Lcom/avito/android/safety/tfa_enable_confirm/code_check/interactor/r;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class s implements r {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42082a f258189a;

    @Inject
    public s(@Y61.k InterfaceC42082a interfaceC42082a) {
        this.f258189a = interfaceC42082a;
    }

    @Override // com.avito.android.safety.tfa_enable_confirm.code_check.interactor.r
    @Y61.k
    public final y a(@Y61.k a.InterfaceC3494a.d dVar, @Y61.k a.InterfaceC3494a.d dVar2, @Y61.k a.InterfaceC3494a.d dVar3) {
        return new y(this.f258189a, dVar, dVar2, dVar3);
    }
}
