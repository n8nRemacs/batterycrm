package com.avito.android.memory.consumption;

import Y41.p;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.F;
import com.avito.android.memory.consumption.f;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: MemoryConsumptionTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/memory/consumption/e;", "Landroidx/lifecycle/L;", "_avito_memory-consumption_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f.a f186110b;

    /* compiled from: MemoryConsumptionTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186111a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f186111a = iArr;
        }
    }

    public e(f.a aVar) {
        this.f186110b = aVar;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
        if (a.f186111a[event.ordinal()] == 1) {
            f.a aVar = this.f186110b;
            if (aVar.f186121f == null || !aVar.f186118c) {
                g gVarB = aVar.f186117b.b();
                F f12 = aVar.f186119d;
                f12.getClass();
                f12.f90354a = 0L;
                g gVar = new g(Math.max(0L, gVarB.f186124a), Math.max(0L, gVarB.f186125b), Math.max(0L, gVarB.f186126c), Math.max(0L, gVarB.f186127d), Math.max(0L, gVarB.f186128e), Math.max(0L, gVarB.f186129f), Math.max(0L, gVarB.f186130g), Math.max(0L, gVarB.f186131h), Math.max(0L, gVarB.f186132i), Math.max(0L, gVarB.f186133j));
                aVar.f186121f = gVar;
                p<? super g, ? super Long, G0> pVar = aVar.f186120e;
                if (pVar != null) {
                    ((f.b) pVar).invoke(gVar, Long.valueOf(aVar.f186119d.b()));
                }
            }
        }
    }
}
