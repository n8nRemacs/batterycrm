package com.avito.android.safety.safety_settings.domain;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import io0.InterfaceC42082a;
import javax.inject.Inject;
import ko0.C42722a;
import ko0.InterfaceC42723b;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: TfaSettingsInteractor.kt */
@P
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/safety/safety_settings/domain/e;", "Lcom/avito/android/safety/safety_settings/domain/d;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC42082a f257636a;

    @Inject
    public e(@k InterfaceC42082a interfaceC42082a) {
        this.f257636a = interfaceC42082a;
    }

    @Override // com.avito.android.safety.safety_settings.domain.d
    @l
    public final Object a(@k String str, @k Continuation<? super TypedResult<InterfaceC42723b>> continuation) {
        return this.f257636a.b(new C42722a(str), continuation);
    }
}
