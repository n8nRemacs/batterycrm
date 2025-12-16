package com.avito.android.entry_point_client_room.report.mvi;

import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.entry_point_client_room.report.mvi.entity.SendReportInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import sz.AbstractC48438c;
import sz.AbstractC48439d;

/* compiled from: SendReportFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "Lsz/c;", "Lcom/avito/android/entry_point_client_room/report/mvi/entity/SendReportInternalAction;", "Lsz/e;", "Lsz/d;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class d extends N implements Y41.l<q<AbstractC48438c, SendReportInternalAction, sz.e, AbstractC48439d>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f147711l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f147712m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ i f147713n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ g f147714o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, ScreenPerformanceTracker screenPerformanceTracker, i iVar, g gVar) {
        super(1);
        this.f147711l = bVar;
        this.f147712m = screenPerformanceTracker;
        this.f147713n = iVar;
        this.f147714o = gVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<AbstractC48438c, SendReportInternalAction, sz.e, AbstractC48439d> qVar) {
        q<AbstractC48438c, SendReportInternalAction, sz.e, AbstractC48439d> qVar2 = qVar;
        qVar2.f92009e = this.f147711l;
        qVar2.f92011g = new o(this.f147712m, this.f147713n);
        qVar2.f92010f = this.f147714o;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
