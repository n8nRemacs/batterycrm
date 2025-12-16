package com.avito.android.safety.safety_settings;

import Y41.p;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.compose.q;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: SafetySettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class e extends N implements p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ SafetySettingsFragment f257637l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(SafetySettingsFragment safetySettingsFragment) {
        super(2);
        this.f257637l = safetySettingsFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            SafetySettingsFragment.a aVar = SafetySettingsFragment.f257523w0;
            SafetySettingsFragment safetySettingsFragment = this.f257637l;
            q.b((com.avito.android.analytics.screens.compose.a) safetySettingsFragment.f257529s0.getValue(), r.c(-254298485, new d(safetySettingsFragment, C22126m3.b(safetySettingsFragment.q5().getState(), a13)), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
