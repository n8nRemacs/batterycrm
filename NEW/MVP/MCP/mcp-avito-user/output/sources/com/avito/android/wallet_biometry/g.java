package com.avito.android.wallet_biometry;

import CP0.a;
import CP0.c;
import Y41.p;
import android.app.Activity;
import androidx.biometric.p;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.E;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import java.util.Set;
import javax.crypto.Cipher;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Z;
import kotlin.collections.B0;
import kotlin.collections.b1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.text.C43047d;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: WalletPinBiometryInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet_biometry/g;", "Lcom/avito/android/wallet_biometry/f;", "a", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f329479a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet_biometry.data.g f329480b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet_biometry.data.a f329481c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final d f329482d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f329483e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet_biometry.data.c f329484f;

    /* compiled from: WalletPinBiometryInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/wallet_biometry/g$a;", "", "<init>", "()V", "", "ALLOWED_AUTHENTICATORS", "I", "_avito_wallet-biometry_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: WalletPinBiometryInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCP0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCP0/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryInteractorImpl$decrypt$2", f = "WalletPinBiometryInteractorImpl.kt", i = {0}, l = {140}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super CP0.a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f329485q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f329486r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Activity f329488t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AP0.b f329489u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ CP0.d f329490v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Activity activity, AP0.b bVar, CP0.d dVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f329488t = activity;
            this.f329489u = bVar;
            this.f329490v = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = g.this.new b(this.f329488t, this.f329489u, this.f329490v, continuation);
            bVar.f329486r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super CP0.a> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Cipher cipher;
            Object bVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f329485q;
            CP0.d dVar = this.f329490v;
            g gVar = g.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                T t12 = (T) this.f329486r;
                d dVar2 = gVar.f329482d;
                ActivityC22955m activityC22955m = (ActivityC22955m) this.f329488t;
                Cipher cipher2 = dVar.f2174b;
                this.f329486r = t12;
                this.f329485q = 1;
                obj = C43259k.g(dVar2.f329471a.b(), new com.avito.android.wallet_biometry.b(dVar2, activityC22955m, this.f329489u, cipher2, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            CP0.c cVar = (CP0.c) obj;
            if (cVar instanceof c.b) {
                return new a.C0107a(((c.b) cVar).f2170a);
            }
            if (cVar instanceof c.C0109c) {
                return a.d.f2162a;
            }
            if (cVar instanceof c.a) {
                return new a.b(((c.a) cVar).f2169a);
            }
            if (!(cVar instanceof c.d)) {
                throw new NoWhenBranchMatchedException();
            }
            p.c cVar2 = ((c.d) cVar).f2172a.f22770a;
            if (cVar2 == null || (cipher = cVar2.f22773b) == null) {
                return new a.C0107a("cipher is null");
            }
            try {
                int i13 = Z.f406624c;
                com.avito.android.wallet_biometry.data.c cVar3 = gVar.f329484f;
                bVar = new String(cipher.doFinal(dVar.f2173a), C43047d.f410589b);
            } catch (Throwable th2) {
                int i14 = Z.f406624c;
                bVar = new Z.b(th2);
            }
            Throwable thB = Z.b(bVar);
            if (thB == null) {
                return new a.c((String) bVar);
            }
            String strA = gVar.f329479a.a();
            if (strA != null) {
                gVar.f329481c.a(strA, true);
            }
            return new a.C0107a(thB.getMessage());
        }
    }

    /* compiled from: WalletPinBiometryInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet_biometry.WalletPinBiometryInteractorImpl$setBiometryDisabled$2", f = "WalletPinBiometryInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f329492r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f329492r = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return g.this.new c(this.f329492r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            g gVar = g.this;
            String strA = gVar.f329479a.a();
            if (strA == null) {
                return G0.f406611a;
            }
            AK0.l lVar = gVar.f329481c.f329476b;
            Set<String> setF = lVar.f("wallet_bm_disabled");
            if (setF == null) {
                setF = B0.f406639b;
            }
            lVar.putStringSet("wallet_bm_disabled", this.f329492r ? b1.i(setF, strA) : b1.e(setF, strA));
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public g(@Y61.k E e12, @Y61.k com.avito.android.wallet_biometry.data.g gVar, @Y61.k com.avito.android.wallet_biometry.data.a aVar, @Y61.k d dVar, @Y61.k R0 r02, @Y61.k com.avito.android.wallet_biometry.data.c cVar) {
        this.f329479a = e12;
        this.f329480b = gVar;
        this.f329481c = aVar;
        this.f329482d = dVar;
        this.f329483e = r02;
        this.f329484f = cVar;
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object a(boolean z12, @Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f329483e.c(), new c(z12, null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object b(@Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f329483e.c(), new j(this, null), continuationImpl);
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object c(@Y61.k ContinuationImpl continuationImpl) {
        d dVar = this.f329482d;
        return C43259k.g(dVar.f329471a.c(), new com.avito.android.wallet_biometry.c(dVar, null), continuationImpl);
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object d(boolean z12, @Y61.k ContinuationImpl continuationImpl) {
        Object objG = C43259k.g(this.f329483e.c(), new h(this, z12, null), continuationImpl);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object e(@Y61.k Activity activity, @Y61.l AP0.b bVar, @Y61.k CP0.d dVar, @Y61.k Continuation<? super CP0.a> continuation) {
        return C43259k.g(this.f329483e.c(), new b(activity, bVar, dVar, null), continuation);
    }

    @Override // com.avito.android.wallet_biometry.f
    @Y61.l
    public final Object f(@Y61.k Activity activity, @Y61.k String str, @Y61.l AP0.b bVar, boolean z12, @Y61.k ContinuationImpl continuationImpl) {
        return C43259k.g(this.f329483e.c(), new i(this, z12, activity, bVar, str, null), continuationImpl);
    }
}
