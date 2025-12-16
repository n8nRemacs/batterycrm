package com.avito.android.profile.pro.impl.interactor;

import Y41.q;
import Y61.k;
import Y61.l;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import hz.InterfaceC41196a;
import javax.inject.Inject;
import jz.C42454e;
import jz.InterfaceC42451b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlinx.coroutines.flow.C1;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileProEmployeeInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/pro/impl/interactor/c;", "Lcom/avito/android/profile/pro/impl/interactor/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.profile.pro.impl.interactor.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC41196a f222684a;

    /* compiled from: ProfileProEmployeeInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends C42801a implements q<InterfaceC42451b, C42454e, Continuation<? super com.avito.android.profile.pro.impl.interactor.a>, Object>, SuspendFunction {

        /* renamed from: b, reason: collision with root package name */
        public static final a f222685b = new a();

        public a() {
            super(3, com.avito.android.profile.pro.impl.interactor.a.class, "<init>", "<init>(Lcom/avito/android/employee_mode_pub/manager/model/EmployeeMode;Lcom/avito/android/employee_mode_pub/manager/model/EmployeePassportModes;)V", 4);
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC42451b interfaceC42451b, C42454e c42454e, Continuation<? super com.avito.android.profile.pro.impl.interactor.a> continuation) {
            return new com.avito.android.profile.pro.impl.interactor.a(interfaceC42451b, c42454e);
        }
    }

    /* compiled from: ProfileProEmployeeInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/pro/impl/interactor/a;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.pro.impl.interactor.ProfileProEmployeeInteractorImpl$loadEmployeeInfo$4", f = "ProfileProEmployeeInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super com.avito.android.profile.pro.impl.interactor.a>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f222686q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f222687r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super com.avito.android.profile.pro.impl.interactor.a> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f222687r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f222686q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f222687r;
                InterfaceC42451b.a aVar = InterfaceC42451b.a.f405966a;
                C42454e.f405979b.getClass();
                com.avito.android.profile.pro.impl.interactor.a aVar2 = new com.avito.android.profile.pro.impl.interactor.a(aVar, C42454e.f405980c);
                this.f222686q = 1;
                if (interfaceC43172j.emit(aVar2, this) == coroutine_suspended) {
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
    public c(@k InterfaceC41196a interfaceC41196a) {
        this.f222684a = interfaceC41196a;
    }

    @Override // com.avito.android.profile.pro.impl.interactor.b
    @l
    public final Object a(@k Continuation<? super com.avito.android.profile.pro.impl.interactor.a> continuation) {
        InterfaceC41196a interfaceC41196a = this.f222684a;
        return C43175k.T(new C43152f0(new C1(interfaceC41196a.f(), interfaceC41196a.n(), a.f222685b), new b(3, null)), (ContinuationImpl) continuation);
    }
}
