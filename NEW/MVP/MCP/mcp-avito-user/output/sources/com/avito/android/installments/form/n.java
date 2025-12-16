package com.avito.android.installments.form;

import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.C28484f;
import com.avito.android.analytics.screens.tracker.InterfaceC28483e;
import com.avito.android.analytics.screens.tracker.InterfaceC28499v;
import com.avito.android.analytics.screens.tracker.InterfaceC28501x;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InstallmentsFormTracker.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/n;", "Lcom/avito/android/installments/form/m;", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28499v f172798a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28501x f172799b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.analytics.screens.o f172800c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public InterfaceC28483e f172801d;

    @Inject
    public n(@Y61.k InterfaceC28499v interfaceC28499v, @Y61.k InterfaceC28501x interfaceC28501x, @Y61.k com.avito.android.analytics.screens.o oVar) {
        this.f172798a = interfaceC28499v;
        this.f172799b = interfaceC28501x;
        this.f172800c = oVar;
    }

    @Override // com.avito.android.installments.form.m
    public final void a(long j12) {
        this.f172798a.a(j12);
    }

    @Override // com.avito.android.installments.form.m
    public final void b() {
        InterfaceC28483e interfaceC28483e = this.f172801d;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, J.b.f90385a);
        }
        this.f172801d = null;
    }

    @Override // com.avito.android.installments.form.m
    public final void c(@Y61.k RuntimeException runtimeException) {
        InterfaceC28483e interfaceC28483e = this.f172801d;
        if (interfaceC28483e != null) {
            interfaceC28483e.d(null, new J.a(runtimeException));
        }
        this.f172801d = null;
    }

    @Override // com.avito.android.installments.form.m
    public final void d() {
        this.f172799b.b(-1L);
    }

    @Override // com.avito.android.installments.form.m
    public final void e() {
        this.f172799b.start();
    }

    @Override // com.avito.android.installments.form.m
    public final void f() {
        C28484f c28484fH = this.f172800c.h("installmentsForm");
        c28484fH.start();
        this.f172801d = c28484fH;
    }
}
