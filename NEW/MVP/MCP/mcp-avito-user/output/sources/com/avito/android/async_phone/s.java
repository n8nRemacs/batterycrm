package com.avito.android.async_phone;

import Fc1.E0;
import android.view.View;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.component.snackbar.e;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: AsyncPhoneView.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/async_phone/s;", "Lcom/avito/android/async_phone/o;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class s implements o {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f92289b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f92290c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f92291d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public com.avito.android.component.snackbar.d f92292e;

    public s(@Y61.k View view) {
        this.f92289b = view;
        this.f92290c = view.getResources().getString(R.string.something_went_wrong);
        this.f92291d = view.getResources().getString(R.string.try_again);
    }

    @Override // com.avito.android.async_phone.o
    public final void c() {
        com.avito.android.component.snackbar.d dVar = this.f92292e;
        if (dVar != null) {
            dVar.a();
        }
        this.f92292e = null;
    }

    @Override // com.avito.android.async_phone.o
    public final void e(@Y61.k String str) {
        com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, this.f92289b, com.avito.android.printable_text.b.f(str), null, null, null, null, 0, ToastBarPosition.f181046d, null, false, false, null, null, 4030);
    }

    @Override // com.avito.android.async_phone.o
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.P k(@Y61.k Throwable th2) {
        io.reactivex.rxjava3.subjects.e eVar = new io.reactivex.rxjava3.subjects.e();
        e.b bVar = new e.b(th2);
        p pVar = new p(eVar);
        q qVar = new q(eVar);
        com.avito.android.component.snackbar.d dVarC = com.avito.android.component.snackbar.h.c(this.f92289b, this.f92290c, 0, bVar, this.f92291d, pVar, qVar, 144);
        com.avito.android.component.snackbar.h.b(dVarC);
        com.avito.android.component.snackbar.h.a(dVarC).setMaxLines(2);
        this.f92292e = dVarC;
        return eVar.C0(500L, TimeUnit.MILLISECONDS, io.reactivex.rxjava3.schedulers.b.f404942b).K(new r(this)).J(new E0(this, 8), io.reactivex.rxjava3.internal.functions.a.f401994d);
    }
}
