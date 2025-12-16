package com.avito.android.safety.safety_settings.ui;

import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import com.avito.android.safety.safety_settings.mvi.entity.a;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsSessionBottomSheet.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class C extends kotlin.jvm.internal.N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257814l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ SafetySettingsElement.SessionItem.a f257815m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C(Y41.l<? super com.avito.android.safety.safety_settings.mvi.entity.a, G0> lVar, SafetySettingsElement.SessionItem.a aVar) {
        super(0);
        this.f257814l = lVar;
        this.f257815m = aVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        this.f257814l.invoke(a.e.a(this.f257815m));
        return G0.f406611a;
    }
}
