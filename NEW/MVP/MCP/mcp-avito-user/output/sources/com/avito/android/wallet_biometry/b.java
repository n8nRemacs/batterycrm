package com.avito.android.wallet_biometry;

import CP0.c;
import Y41.p;
import android.app.Activity;
import android.content.res.Resources;
import androidx.biometric.BiometricFragment;
import androidx.biometric.p;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.FragmentManager;
import androidx.view.P0;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.r;

/* compiled from: WalletPinBiometryAuthenticator.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCP0/c;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCP0/c;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryAuthenticator$authenticate$2", f = "WalletPinBiometryAuthenticator.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements p<T, Continuation<? super CP0.c>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329462q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f329463r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Activity f329464s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AP0.b f329465t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Cipher f329466u;

    /* compiled from: WalletPinBiometryAuthenticator.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<Throwable, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.biometric.p f329467l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.biometric.p pVar) {
            super(1);
            this.f329467l = pVar;
        }

        @Override // Y41.l
        public final G0 invoke(Throwable th2) {
            BiometricFragment biometricFragment;
            FragmentManager fragmentManager = this.f329467l.f22769a;
            if (fragmentManager != null && (biometricFragment = (BiometricFragment) fragmentManager.H("androidx.biometric.BiometricFragment")) != null) {
                biometricFragment.b5(3);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletPinBiometryAuthenticator.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/wallet_biometry/b$b", "Landroidx/biometric/p$a;", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.wallet_biometry.b$b, reason: collision with other inner class name */
    public static final class C10233b extends p.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f329468a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f329469b;

        public C10233b(r rVar, d dVar) {
            this.f329468a = rVar;
            this.f329469b = dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        @Override // androidx.biometric.p.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void a(int r5, @Y61.k java.lang.CharSequence r6) {
            /*
                r4 = this;
                java.lang.String r0 = " errString: "
                java.lang.String r1 = "errCode: "
                r2 = 7
                com.avito.android.wallet_biometry.d r3 = r4.f329469b
                if (r5 == r2) goto L33
                r2 = 13
                if (r5 == r2) goto L30
                r2 = 9
                if (r5 == r2) goto L33
                r2 = 10
                if (r5 == r2) goto L30
                CP0.c$b r2 = new CP0.c$b
                r3.getClass()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r1)
                r3.append(r5)
                r3.append(r0)
                r3.append(r6)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5)
                goto L4d
            L30:
                CP0.c$c r2 = CP0.c.C0109c.f2171a
                goto L4d
            L33:
                CP0.c$a r2 = new CP0.c$a
                r3.getClass()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>(r1)
                r3.append(r5)
                r3.append(r0)
                r3.append(r6)
                java.lang.String r5 = r3.toString()
                r2.<init>(r5)
            L4d:
                int r5 = kotlin.Z.f406624c
                kotlinx.coroutines.r r5 = r4.f329468a
                r5.resumeWith(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet_biometry.b.C10233b.a(int, java.lang.CharSequence):void");
        }

        @Override // androidx.biometric.p.a
        public final void b(@Y61.k p.b bVar) {
            int i12 = Z.f406624c;
            this.f329468a.resumeWith(new c.d(bVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, Activity activity, AP0.b bVar, Cipher cipher, Continuation continuation) {
        super(2, continuation);
        this.f329463r = dVar;
        this.f329464s = activity;
        this.f329465t = bVar;
        this.f329466u = cipher;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Cipher cipher = this.f329466u;
        return new b(this.f329463r, this.f329464s, this.f329465t, cipher, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super CP0.c> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) throws Resources.NotFoundException {
        String cancelButton;
        String description;
        String subtitle;
        String title;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329462q;
        if (i12 == 0) {
            C42729a0.b(obj);
            d dVar = this.f329463r;
            Activity activity = this.f329464s;
            AP0.b bVar = this.f329465t;
            Cipher cipher = this.f329466u;
            this.f329462q = 1;
            r rVar = new r(1, IntrinsicsKt.intercepted(this));
            rVar.p();
            Executor mainExecutor = androidx.core.content.d.getMainExecutor(dVar.f329472b);
            C10233b c10233b = new C10233b(rVar, dVar);
            ActivityC22955m activityC22955m = (ActivityC22955m) activity;
            androidx.biometric.p pVar = new androidx.biometric.p();
            FragmentManager supportFragmentManager = activityC22955m.getSupportFragmentManager();
            androidx.biometric.r rVar2 = (androidx.biometric.r) new P0(activityC22955m).a(androidx.biometric.r.class);
            pVar.f22769a = supportFragmentManager;
            rVar2.f22788E = mainExecutor;
            rVar2.f22789J = c10233b;
            p.d.a aVar = new p.d.a();
            if (bVar != null && (title = bVar.getTitle()) != null) {
                aVar.f22782a = title;
            }
            if (bVar != null && (subtitle = bVar.getSubtitle()) != null) {
                aVar.f22783b = subtitle;
            }
            if (bVar != null && (description = bVar.getDescription()) != null) {
                aVar.f22784c = description;
            }
            if (bVar != null && (cancelButton = bVar.getCancelButton()) != null) {
                aVar.f22785d = cancelButton;
            }
            aVar.f22786e = false;
            aVar.f22787f = 15;
            pVar.a(aVar.a(), new p.c(cipher));
            rVar.r(new a(pVar));
            obj = rVar.o();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(this);
            }
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
