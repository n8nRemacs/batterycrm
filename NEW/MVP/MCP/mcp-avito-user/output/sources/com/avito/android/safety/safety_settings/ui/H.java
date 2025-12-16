package com.avito.android.safety.safety_settings.ui;

import androidx.compose.runtime.C22066f2;
import com.avito.android.safety.safety_settings.mvi.entity.SafetySettingsElement;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: SafetySettingsSessions.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class H extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SafetySettingsElement.SessionItem f257826l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Y41.l<com.avito.android.safety.safety_settings.mvi.entity.a, G0> f257827m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.v f257828n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(SafetySettingsElement.SessionItem sessionItem, Y41.l lVar, androidx.compose.ui.v vVar, int i12) {
        super(2);
        this.f257826l = sessionItem;
        this.f257827m = lVar;
        this.f257828n = vVar;
    }

    @Override // Y41.p
    public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(385);
        androidx.compose.ui.v vVar = this.f257828n;
        L.a(this.f257826l, this.f257827m, vVar, a12, iA2);
        return G0.f406611a;
    }
}
