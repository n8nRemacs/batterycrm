package com.avito.android.str_cancellation_settings;

import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.r;
import com.avito.android.analytics.screens.compose.q;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StrCancellationSettingsFragment.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes4.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ StrCancellationSettingsFragment f288381l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(StrCancellationSettingsFragment strCancellationSettingsFragment) {
        super(2);
        this.f288381l = strCancellationSettingsFragment;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        A a13 = a12;
        if ((num.intValue() & 11) == 2 && a13.c()) {
            a13.f();
        } else {
            StrCancellationSettingsFragment strCancellationSettingsFragment = this.f288381l;
            q.b((com.avito.android.analytics.screens.compose.a) strCancellationSettingsFragment.f288115k0.getValue(), r.c(-318962343, new e(strCancellationSettingsFragment), a13), a13, 48);
        }
        return G0.f406611a;
    }
}
