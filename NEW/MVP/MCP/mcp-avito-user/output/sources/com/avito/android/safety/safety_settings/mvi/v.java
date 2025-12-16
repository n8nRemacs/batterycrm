package com.avito.android.safety.safety_settings.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsInternalAction;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: SafetySettingsBootstrap.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/safety/safety_settings/mvi/v;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsInternalAction;", "_avito_safety_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class v implements com.avito.android.arch.mvi.b<SafetySettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.safety_settings.domain.a f257800a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f257801b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.safety.safety_settings.domain.a f257802c;

    @Inject
    public v(@Y61.k com.avito.android.safety.safety_settings.domain.a aVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar2, @Y61.k com.avito.android.safety.safety_settings.domain.a aVar3) {
        this.f257800a = aVar;
        this.f257801b = aVar2;
        this.f257802c = aVar3;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<SafetySettingsInternalAction> a() {
        return C43175k.N(this.f257800a.b(), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f257801b.d9()), new s(null, this)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
