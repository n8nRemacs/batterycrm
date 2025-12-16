package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import androidx.compose.ui.v;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class f extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164902l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v f164903m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f164904n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CallsHistoryScreenState callsHistoryScreenState, v vVar, int i12) {
        super(2);
        this.f164902l = callsHistoryScreenState;
        this.f164903m = vVar;
        this.f164904n = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f164904n | 1);
        r.b(this.f164902l, this.f164903m, a12, iA2);
        return G0.f406611a;
    }
}
