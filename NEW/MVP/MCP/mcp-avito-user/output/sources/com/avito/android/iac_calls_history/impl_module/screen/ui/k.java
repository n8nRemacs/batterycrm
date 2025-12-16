package com.avito.android.iac_calls_history.impl_module.screen.ui;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22066f2;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CallsHistoryScreenUI.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k extends N implements Y41.p<A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164937l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f164938m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f164939n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.l<IacCallsHistoryItem, G0> f164940o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f164941p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(CallsHistoryScreenState callsHistoryScreenState, boolean z12, Y41.a<G0> aVar, Y41.l<? super IacCallsHistoryItem, G0> lVar, int i12) {
        super(2);
        this.f164937l = callsHistoryScreenState;
        this.f164938m = z12;
        this.f164939n = aVar;
        this.f164940o = lVar;
        this.f164941p = i12;
    }

    @Override // Y41.p
    public final G0 invoke(A a12, Integer num) {
        num.intValue();
        int iA2 = C22066f2.a(this.f164941p | 1);
        Y41.a<G0> aVar = this.f164939n;
        Y41.l<IacCallsHistoryItem, G0> lVar = this.f164940o;
        r.c(this.f164937l, this.f164938m, aVar, lVar, a12, iA2);
        return G0.f406611a;
    }
}
