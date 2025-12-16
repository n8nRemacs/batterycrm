package com.avito.android.work;

import Oa1.B;
import Y41.l;
import androidx.work.d0;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.reflect.n;

/* compiled from: WorkerExecutionExceptionHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work/b;", "Lkotlin/Function1;", "Landroidx/work/d0;", "Lkotlin/G0;", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements l<d0, G0> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final InterfaceC28373a f330593b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final P f330594c;

    public b(@Y61.l InterfaceC28373a interfaceC28373a, @Y61.l P p12) {
        this.f330593b = interfaceC28373a;
        this.f330594c = p12;
    }

    @Override // Y41.l
    public final G0 invoke(d0 d0Var) {
        d0 d0Var2 = d0Var;
        P p12 = this.f330594c;
        if (p12 != null) {
            n<Object> nVar = P.f67370w0[13];
            if (((Boolean) p12.f67416k.a().invoke()).booleanValue()) {
                com.avito.android.util.concurrent.b.f318855a.post(new B(4, new a(d0Var2)));
            }
        }
        InterfaceC28373a interfaceC28373a = this.f330593b;
        if (interfaceC28373a != null) {
            String message = d0Var2.f55485a.getMessage();
            if (message == null) {
                message = "";
            }
            interfaceC28373a.c(new NonFatalErrorEvent(message, d0Var2.f55485a, null, NonFatalErrorEvent.a.C4323a.f147930a, 4, null));
        }
        return G0.f406611a;
    }
}
