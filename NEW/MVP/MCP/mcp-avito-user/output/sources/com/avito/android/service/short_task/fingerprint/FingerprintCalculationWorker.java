package com.avito.android.service.short_task.fingerprint;

import Y61.k;
import android.content.Context;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.F;
import androidx.work.J;
import androidx.work.NetworkType;
import androidx.work.WorkManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.Y;
import androidx.work.impl.utils.C23593c;
import androidx.work.rxjava3.RxWorker;
import com.avito.android.error_reporting.app_state.InterfaceC30362a;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.operators.single.C42006d;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: FingerprintCalculationWorker.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/avito/android/service/short_task/fingerprint/FingerprintCalculationWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "a", "TokenCalculationWorker", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public final class FingerprintCalculationWorker extends RxWorker {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f274053c = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f274054b;

    /* compiled from: FingerprintCalculationWorker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/service/short_task/fingerprint/FingerprintCalculationWorker$TokenCalculationWorker;", "Landroidx/work/rxjava3/RxWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @InterfaceC42830m
    public static final class TokenCalculationWorker extends RxWorker {

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int f274055d = 0;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Context f274056b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final WorkerParameters f274057c;

        public TokenCalculationWorker(@k Context context, @k WorkerParameters workerParameters) {
            super(context, workerParameters);
            this.f274056b = context;
            this.f274057c = workerParameters;
        }

        @Override // androidx.work.rxjava3.RxWorker
        @k
        public final I<F.a> b() {
            return new C42006d(new com.avito.android.service.short_task.fingerprint.a(this, 1));
        }
    }

    /* compiled from: FingerprintCalculationWorker.kt */
    @s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/avito/android/service/short_task/fingerprint/FingerprintCalculationWorker$a;", "", "<init>", "()V", "", "FINGERPRINT_ERROR_VALUE", "Ljava/lang/String;", "", "FINGERPRINT_LIFE_TIME_HOURS", "J", "FINGERPRINT_LIFE_TIME_THRESHOLD", "FINGERPRINT_TAG", "FINGERPRINT_TOKEN_ERROR_VALUE", "FINGERPRINT_TOKEN_TAG", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static void a(@k Context context, long j12, @k TimeUnit timeUnit) {
            J jB2 = new J.a(FingerprintCalculationWorker.class).g(j12, timeUnit).a("FingerprintCalculationTag").b();
            WorkManager.a aVar = WorkManager.f55428a;
            aVar.getClass();
            C23593c.e(Y.f(context), "FingerprintCalculationTag");
            C23593c.e(Y.f(context), "FingerprintCalculationTokenTag");
            aVar.getClass();
            Y yF2 = Y.f(context);
            yF2.getClass();
            yF2.e(Collections.singletonList(jB2));
        }

        public static void b(Context context, String str) {
            J.a aVar = new J.a(TokenCalculationWorker.class);
            C23542f.a aVar2 = new C23542f.a();
            aVar2.b(NetworkType.f55396c);
            aVar2.f55500e = true;
            J.a aVarF = aVar.f(aVar2.a());
            C23544h.a aVar3 = new C23544h.a();
            aVar3.f55511a.put("fingerprint", str);
            J jB2 = aVarF.h(aVar3.a()).a("FingerprintCalculationTokenTag").b();
            WorkManager.a aVar4 = WorkManager.f55428a;
            aVar4.getClass();
            C23593c.e(Y.f(context), "FingerprintCalculationTokenTag");
            aVar4.getClass();
            Y yF2 = Y.f(context);
            yF2.getClass();
            yF2.e(Collections.singletonList(jB2));
        }

        public static void c(InterfaceC30362a.InterfaceC4322a interfaceC4322a, String str) {
            interfaceC4322a.b("fingerprint_calculation_stage", str);
        }

        public a() {
        }
    }

    public FingerprintCalculationWorker(@k Context context, @k WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f274054b = context;
    }

    @Override // androidx.work.rxjava3.RxWorker
    @k
    public final I<F.a> b() {
        return new C42006d(new com.avito.android.service.short_task.fingerprint.a(this, 0));
    }
}
