package com.avito.android.email.email_update.mvi;

import Y41.p;
import Y41.q;
import com.avito.android.email.email_update.mvi.entity.EmailUpdateInternalAction;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.remote.model.ProfileShort;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: EmailUpdateBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/email/email_update/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class f implements com.avito.android.arch.mvi.b<EmailUpdateInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34401z0 f147230a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f147231b;

    /* compiled from: EmailUpdateBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.email.email_update.mvi.EmailUpdateBootstrap$produce$1", f = "EmailUpdateBootstrap.kt", i = {0}, l = {22, 23}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EmailUpdateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147232q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f147233r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f147233r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EmailUpdateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147232q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f147233r;
                I<ProfileShort> iO2 = f.this.f147230a.o();
                this.f147233r = interfaceC43172j;
                this.f147232q = 1;
                obj = C43292o.b(iO2, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f147233r;
                C42729a0.b(obj);
            }
            EmailUpdateInternalAction.ProfileLoaded profileLoaded = new EmailUpdateInternalAction.ProfileLoaded((ProfileShort) obj);
            this.f147233r = null;
            this.f147232q = 2;
            if (interfaceC43172j.emit(profileLoaded, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EmailUpdateBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.email.email_update.mvi.EmailUpdateBootstrap$produce$2", f = "EmailUpdateBootstrap.kt", i = {}, l = {AvailableCode.ERROR_ON_ACTIVITY_RESULT}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements q<InterfaceC43172j<? super EmailUpdateInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f147235q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f147236r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super EmailUpdateInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f147236r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f147235q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f147236r;
                EmailUpdateInternalAction.ErrorLoadingProfile errorLoadingProfile = EmailUpdateInternalAction.ErrorLoadingProfile.f147227b;
                this.f147235q = 1;
                if (interfaceC43172j.emit(errorLoadingProfile, this) == coroutine_suspended) {
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
    public f(@Y61.k InterfaceC34401z0 interfaceC34401z0, @Y61.k R0 r02) {
        this.f147230a = interfaceC34401z0;
        this.f147231b = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EmailUpdateInternalAction> a() {
        return C43175k.I(this.f147231b.a(), new C43152f0(C43175k.G(new a(null)), new b(3, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
