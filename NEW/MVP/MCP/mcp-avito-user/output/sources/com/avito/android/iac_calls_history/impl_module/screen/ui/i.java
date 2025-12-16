package com.avito.android.iac_calls_history.impl_module.screen.ui;

import android.content.res.Resources;
import androidx.compose.foundation.lazy.InterfaceC20793y;
import androidx.compose.runtime.A;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.CallsHistoryScreenState;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.IacCallsHistoryItem;
import com.avito.android.iac_calls_history.impl_module.screen.mvi.entity.items.LoadingCallsHistoryItem;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: LazyDsl.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\b\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"T", "Landroidx/compose/foundation/lazy/y;", "", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/foundation/lazy/y;ILandroidx/compose/runtime/A;I)V", "androidx/compose/foundation/lazy/t", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class i extends N implements Y41.r<InterfaceC20793y, Integer, A, Integer, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ List f164906l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ CallsHistoryScreenState f164907m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l0.a f164908n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Y41.a f164909o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Y41.l f164910p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(List list, CallsHistoryScreenState callsHistoryScreenState, l0.a aVar, Y41.a aVar2, Y41.l lVar) {
        super(4);
        this.f164906l = list;
        this.f164907m = callsHistoryScreenState;
        this.f164908n = aVar;
        this.f164909o = aVar2;
        this.f164910p = lVar;
    }

    @Override // Y41.r
    public final G0 invoke(InterfaceC20793y interfaceC20793y, Integer num, A a12, Integer num2) throws Resources.NotFoundException {
        int i12;
        InterfaceC20793y interfaceC20793y2 = interfaceC20793y;
        int iIntValue = num.intValue();
        A a13 = a12;
        int iIntValue2 = num2.intValue();
        if ((iIntValue2 & 6) == 0) {
            i12 = (a13.B(interfaceC20793y2) ? 4 : 2) | iIntValue2;
        } else {
            i12 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i12 |= a13.m(iIntValue) ? 32 : 16;
        }
        if (a13.p(i12 & 1, (i12 & 147) != 146)) {
            CallsHistoryScreenState.Item item = (CallsHistoryScreenState.Item) this.f164906l.get(iIntValue);
            a13.C(382175860);
            CallsHistoryScreenState callsHistoryScreenState = this.f164907m;
            if (iIntValue >= callsHistoryScreenState.f164827e.size() - 2) {
                l0.a aVar = this.f164908n;
                if (!aVar.f406838b) {
                    this.f164909o.invoke();
                    aVar.f406838b = true;
                }
            }
            if (item instanceof IacCallsHistoryItem) {
                a13.C(1674905853);
                com.avito.android.iac_calls_history.impl_module.screen.ui.items.g.a((IacCallsHistoryItem) item, callsHistoryScreenState.f164828f, this.f164910p, a13, 64);
                a13.h();
            } else if (item instanceof LoadingCallsHistoryItem) {
                a13.C(1674913151);
                com.avito.android.iac_calls_history.impl_module.screen.ui.items.j.a(null, a13, 0);
                a13.h();
            } else {
                a13.C(382739966);
                a13.h();
            }
            a13.h();
        } else {
            a13.f();
        }
        return G0.f406611a;
    }
}
