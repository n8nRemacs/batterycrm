package com.avito.android.profile_tab.summary.domain;

import Cc0.InterfaceC13241a;
import Fc0.InterfaceC13557a;
import Gc0.C13865a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import h31.e;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ProfileSummaryInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_tab/summary/domain/c;", "Lcom/avito/android/profile_tab/summary/domain/a;", "_avito_profile-tab_summary_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.profile_tab.summary.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC13557a> f230864a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f230865b;

    /* compiled from: ProfileSummaryInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCc0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCc0/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_tab.summary.domain.ProfileSummaryRemoteInteractor$profileSummary$2", f = "ProfileSummaryInteractor.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super InterfaceC13241a>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f230866q;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super InterfaceC13241a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f230866q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC13557a interfaceC13557a = c.this.f230864a.get();
                this.f230866q = 1;
                obj = interfaceC13557a.a(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Error) {
                TypedResult.Error error = (TypedResult.Error) typedResult;
                return new InterfaceC13241a.b(error.getError(), error.getCause());
            }
            if (typedResult instanceof TypedResult.Success) {
                return new InterfaceC13241a.C0115a(((C13865a) ((TypedResult.Success) typedResult).getResult()).getLayout());
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    @Inject
    public c(@k R0 r02, @k e eVar) {
        this.f230864a = eVar;
        this.f230865b = r02;
    }

    @l
    public final Object a(@k Continuation<? super InterfaceC13241a> continuation) {
        return C43259k.g(this.f230865b.a(), new a(null), continuation);
    }
}
