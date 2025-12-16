package com.avito.android.service.short_task.fingerprint;

import AK0.l;
import Ec.InterfaceC13473b;
import android.content.Context;
import androidx.compose.ui.graphics.colorspace.e;
import androidx.work.F;
import androidx.work.WorkManager;
import androidx.work.impl.Y;
import androidx.work.impl.utils.C23593c;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.y;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC30263o;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import com.avito.android.server_time.f;
import com.avito.android.service.short_task.fingerprint.FingerprintCalculationWorker;
import com.avito.android.util.V2;
import com.avito.security.libfp.FingerprintService;
import f90.q;
import io.reactivex.rxjava3.core.K;
import io.reactivex.rxjava3.core.M;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.collections.P0;
import kotlin.reflect.n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements M {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f274058b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RxWorker f274059c;

    public /* synthetic */ a(RxWorker rxWorker, int i12) {
        this.f274058b = i12;
        this.f274059c = rxWorker;
    }

    @Override // io.reactivex.rxjava3.core.M
    public final void j(K k12) {
        String str;
        String strCalculateFingerprintV2;
        Object bVar;
        RxWorker rxWorker = this.f274059c;
        switch (this.f274058b) {
            case 0:
                FingerprintCalculationWorker.f274053c.getClass();
                Context context = ((FingerprintCalculationWorker) rxWorker).f274054b;
                InterfaceC30263o interfaceC30263o = (InterfaceC30263o) C29972i.a(C29972i.b(context), InterfaceC30263o.class);
                q qVarQk = interfaceC30263o.Qk();
                l lVar = qVarQk.f395703a;
                P pE2 = interfaceC30263o.E();
                InterfaceC28373a interfaceC28373aA = interfaceC30263o.a();
                InterfaceC13473b interfaceC13473bC9 = interfaceC30263o.c9();
                InterfaceC30362a.InterfaceC4322a interfaceC4322aUf = interfaceC30263o.uf();
                f fVarL = interfaceC30263o.l();
                V2.f318762a.c("Fingerprint", "calculateFingerPrint", null);
                if (qVarQk.c() != 0) {
                    long hours = TimeUnit.MILLISECONDS.toHours(System.currentTimeMillis() - qVarQk.c());
                    if (hours >= 24) {
                        n<Object> nVar = P.f67370w0[47];
                        if (((Boolean) pE2.f67380J.a().invoke()).booleanValue()) {
                            interfaceC28373aA.c(new NonFatalErrorEvent(e.i(hours, "Fingerprint calculated ", " hours ago"), null, P0.c(), new NonFatalErrorEvent.a.b(FingerprintTtl.class, PaymentStateKt.PAYMENT_STATE_FAILED, 0, 4, null)));
                        }
                    }
                }
                try {
                    FingerprintCalculationWorker.a.c(interfaceC4322aUf, "Fingerprint_Started");
                    FingerprintService fingerprintServiceInit = FingerprintService.init(context);
                    interfaceC4322aUf.b("fingerprint_calculation_stage", "Fingerprint_Initialized");
                    str = "ERROR<";
                    try {
                        strCalculateFingerprintV2 = fingerprintServiceInit.calculateFingerprintV2(String.valueOf(TimeUnit.MILLISECONDS.toSeconds(fVarL.now())));
                        interfaceC28373aA.c(new y.a(interfaceC13473bC9.getF4113b() + ".fingerprint.success", 0L, 2, null));
                        lVar.putLong("fpx_calc_time", System.currentTimeMillis());
                        FingerprintCalculationWorker.a.a(context, 20L, TimeUnit.HOURS);
                        n<Object> nVar2 = P.f67370w0[46];
                        if (((Boolean) pE2.f67379I.a().invoke()).booleanValue()) {
                            FingerprintCalculationWorker.a.b(context, strCalculateFingerprintV2);
                        }
                        interfaceC4322aUf.b("fingerprint_calculation_stage", "Fingerprint_Finished");
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            WorkManager.f55428a.getClass();
                            C23593c.e(Y.f(context), "FingerprintCalculationTag");
                            C23593c.e(Y.f(context), "FingerprintCalculationTokenTag");
                            interfaceC28373aA.c(new y.a(interfaceC13473bC9.getF4113b() + ".fingerprint.error", 0L, 2, null));
                            interfaceC28373aA.c(new NonFatalErrorEvent("Fingerprint failed", th, P0.c(), new NonFatalErrorEvent.a.b(Fingerprint.class, PaymentStateKt.PAYMENT_STATE_FAILED, 0, 4, null)));
                            strCalculateFingerprintV2 = str + th.getClass().getSimpleName() + '>';
                            lVar.putString("fpx", strCalculateFingerprintV2);
                            k12.onSuccess(new F.a.c());
                            return;
                        } finally {
                            FingerprintCalculationWorker.a.c(interfaceC4322aUf, "Fingerprint_Finished");
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = "ERROR<";
                }
                lVar.putString("fpx", strCalculateFingerprintV2);
                k12.onSuccess(new F.a.c());
                return;
            default:
                int i12 = FingerprintCalculationWorker.TokenCalculationWorker.f274055d;
                FingerprintCalculationWorker.a aVar = FingerprintCalculationWorker.f274053c;
                FingerprintCalculationWorker.TokenCalculationWorker tokenCalculationWorker = (FingerprintCalculationWorker.TokenCalculationWorker) rxWorker;
                String strC = tokenCalculationWorker.f274057c.f55433b.c("fingerprint");
                aVar.getClass();
                Context context2 = tokenCalculationWorker.f274056b;
                InterfaceC30263o interfaceC30263o2 = (InterfaceC30263o) C29972i.a(C29972i.b(context2), InterfaceC30263o.class);
                q qVarQk2 = interfaceC30263o2.Qk();
                InterfaceC28373a interfaceC28373aA2 = interfaceC30263o2.a();
                InterfaceC30362a.InterfaceC4322a interfaceC4322aUf2 = interfaceC30263o2.uf();
                try {
                    FingerprintCalculationWorker.a.c(interfaceC4322aUf2, "Token_Started");
                    FingerprintService fingerprintServiceInit2 = FingerprintService.init(context2);
                    interfaceC4322aUf2.b("fingerprint_calculation_stage", "Token_Sdk_Initialized");
                    String token = fingerprintServiceInit2.getToken(strC);
                    if (token == null) {
                        token = "ERR_TOKEN<NULL_SERVICE>";
                    }
                    qVarQk2.d(token);
                    bVar = new F.a.c();
                    interfaceC4322aUf2.b("fingerprint_calculation_stage", "Token_Finished");
                } catch (Throwable th4) {
                    try {
                        if (!(th4 instanceof IOException)) {
                            interfaceC28373aA2.c(new NonFatalErrorEvent("Fingerprint failed", th4, P0.c(), new NonFatalErrorEvent.a.b(FingerprintToken.class, PaymentStateKt.PAYMENT_STATE_FAILED, 0, 4, null)));
                            qVarQk2.d("ERR_TOKEN<" + th4.getClass().getSimpleName() + '>');
                        }
                        bVar = new F.a.b();
                        FingerprintCalculationWorker.a.c(interfaceC4322aUf2, "Token_Finished");
                    } catch (Throwable th5) {
                        FingerprintCalculationWorker.a.c(interfaceC4322aUf2, "Token_Finished");
                        throw th5;
                    }
                }
                k12.onSuccess(bVar);
                return;
        }
    }
}
