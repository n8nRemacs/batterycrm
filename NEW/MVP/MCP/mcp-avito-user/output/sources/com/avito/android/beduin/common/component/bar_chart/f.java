package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.beduin_models.BeduinAction;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinBarChartComponent.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class f extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f100737l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(d dVar) {
        super(0);
        this.f100737l = dVar;
    }

    @Override // Y41.a
    public final G0 invoke() {
        d dVar = this.f100737l;
        List<BeduinAction> onScrollActions = dVar.f100732e.getOnScrollActions();
        if (onScrollActions != null) {
            Iterator<T> it = onScrollActions.iterator();
            while (it.hasNext()) {
                dVar.f100733f.o((BeduinAction) it.next());
            }
        }
        return G0.f406611a;
    }
}
