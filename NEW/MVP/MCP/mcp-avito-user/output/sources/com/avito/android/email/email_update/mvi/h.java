package com.avito.android.email.email_update.mvi;

import Fy.C13855c;
import Fy.InterfaceC13853a;
import Fy.InterfaceC13854b;
import com.avito.android.analytics.screens.mvi.o;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.arch.mvi.q;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: EmailUpdateFeatureBuilder.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005*\u001a\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/avito/android/arch/mvi/q;", "LFy/a;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "LFy/c;", "LFy/b;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/arch/mvi/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class h extends N implements Y41.l<q<InterfaceC13853a, EmailUpdateInternalAction, C13855c, InterfaceC13854b>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f147239l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ d f147240m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ ScreenPerformanceTracker f147241n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ m f147242o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ k f147243p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, d dVar, ScreenPerformanceTracker screenPerformanceTracker, m mVar, k kVar) {
        super(1);
        this.f147239l = fVar;
        this.f147240m = dVar;
        this.f147241n = screenPerformanceTracker;
        this.f147242o = mVar;
        this.f147243p = kVar;
    }

    @Override // Y41.l
    public final G0 invoke(q<InterfaceC13853a, EmailUpdateInternalAction, C13855c, InterfaceC13854b> qVar) {
        q<InterfaceC13853a, EmailUpdateInternalAction, C13855c, InterfaceC13854b> qVar2 = qVar;
        qVar2.f92008d = this.f147239l;
        qVar2.f92009e = this.f147240m;
        qVar2.f92011g = new o(this.f147241n, this.f147242o);
        qVar2.f92010f = this.f147243p;
        AW.f fVar = AW.f.f434a;
        com.avito.android.arch.mvi.log.g.f91991f.getClass();
        qVar2.c(fVar, com.avito.android.arch.mvi.log.g.f91993h);
        return G0.f406611a;
    }
}
