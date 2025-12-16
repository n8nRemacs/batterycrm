package com.avito.android.code_check.otp;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.view.result.ActivityResult;
import androidx.view.result.h;
import com.avito.android.code_check.otp.c.a;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.google.android.gms.auth.api.phone.g;
import com.google.android.gms.common.api.Status;
import i.b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlin.text.C43059p;
import kotlin.text.InterfaceC43057n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: SmsOtpHelper.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/otp/c;", "Landroid/content/BroadcastReceiver;", "Lcom/avito/android/code_check/otp/a;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends BroadcastReceiver implements com.avito.android.code_check.otp.a {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f118848f = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final g f118849b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C43238h f118850c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e2 f118851d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final h<Intent> f118852e;

    /* compiled from: SmsOtpHelper.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.otp.SmsOtpHelperImpl$consentResultLauncher$1$1$1", f = "SmsOtpHelper.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f118853q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f118855s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f118855s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(this.f118855s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f118853q;
            if (i12 == 0) {
                C42729a0.b(obj);
                e2 e2Var = c.this.f118851d;
                this.f118853q = 1;
                if (e2Var.emit(this.f118855s, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k g gVar, @k Context context, @k R0 r02, @k androidx.view.result.b bVar) {
        this.f118849b = gVar;
        context.registerReceiver(this, new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED"), 2);
        this.f118850c = U.a(r02.a());
        this.f118851d = f2.b(0, 0, null, 7);
        this.f118852e = bVar.registerForActivityResult(new b.m(), new androidx.view.result.a() { // from class: com.avito.android.code_check.otp.b
            @Override // androidx.view.result.a
            public final void a(Object obj) {
                String stringExtra;
                InterfaceC43057n interfaceC43057nB;
                ActivityResult activityResult = (ActivityResult) obj;
                int i12 = c.f118848f;
                if (activityResult.f21242b == -1) {
                    Intent intent = activityResult.f21243c;
                    String value = (intent == null || (stringExtra = intent.getStringExtra("com.google.android.gms.auth.api.phone.EXTRA_SMS_MESSAGE")) == null || (interfaceC43057nB = C43059p.b(new C43059p("\\d{5}"), stringExtra)) == null) ? null : interfaceC43057nB.getValue();
                    if (value != null) {
                        c cVar = this.f118847b;
                        C43259k.d(cVar.f118850c, null, null, cVar.new a(value, null), 3);
                    }
                }
            }
        });
    }

    @Override // com.avito.android.code_check.otp.a
    @k
    public final e2 a() {
        this.f118849b.startSmsUserConsent(null);
        return this.f118851d;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@l Context context, @l Intent intent) {
        G0 g02;
        if ("com.google.android.gms.auth.api.phone.SMS_RETRIEVED".equals(intent != null ? intent.getAction() : null)) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = new Bundle(0);
            }
            int i12 = Build.VERSION.SDK_INT;
            Status status = (Status) (i12 >= 34 ? (Parcelable) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS", Status.class) : extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_STATUS"));
            Integer numValueOf = status != null ? Integer.valueOf(status.f348905b) : null;
            if (numValueOf != null && numValueOf.intValue() == 0) {
                Intent intent2 = (Intent) (i12 >= 34 ? (Parcelable) extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT", Intent.class) : extras.getParcelable("com.google.android.gms.auth.api.phone.EXTRA_CONSENT_INTENT"));
                if (intent2 != null) {
                    try {
                        this.f118852e.b(intent2);
                    } catch (IllegalStateException unused) {
                        V2.f318762a.c("SmsOtpHelperImpl", "consentResultLauncher is not registered", null);
                    }
                    g02 = G0.f406611a;
                } else {
                    g02 = null;
                }
                if (g02 == null) {
                    V2.f318762a.c("SmsOtpHelperImpl", "SMS consent intent is null", null);
                }
            } else if (numValueOf != null && numValueOf.intValue() == 15) {
                V2.f318762a.c("SMS", "Timeout", null);
            } else {
                V2.f318762a.d("SmsOtpHelperImpl", "Unknown status " + numValueOf);
            }
            this.f118849b.startSmsUserConsent(null);
        }
    }
}
