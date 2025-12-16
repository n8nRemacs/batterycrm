package com.avito.android.send_esia_data_screen.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.TypedResult;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import dr0.AbstractC39790b;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nG.InterfaceC44249a;
import oG.C44636a;

/* compiled from: SendEsiaDataInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/send_esia_data_screen/domain/a;", "", "_avito_gig_send-esia-data-screen_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f268249a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC44249a f268250b;

    /* compiled from: SendEsiaDataInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Ldr0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.send_esia_data_screen.domain.SendEsiaDataInteractor$sendData$1", f = "SendEsiaDataInteractor.kt", i = {0}, l = {15, InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.send_esia_data_screen.domain.a$a, reason: collision with other inner class name */
    public static final class C8029a extends SuspendLambda implements p<InterfaceC43172j<? super AbstractC39790b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f268251q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f268252r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f268254t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f268255u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8029a(String str, String str2, Continuation<? super C8029a> continuation) {
            super(2, continuation);
            this.f268254t = str;
            this.f268255u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8029a c8029a = a.this.new C8029a(this.f268254t, this.f268255u, continuation);
            c8029a.f268252r = obj;
            return c8029a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super AbstractC39790b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8029a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            AbstractC39790b dVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f268251q;
            a aVar = a.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f268252r;
                InterfaceC44249a interfaceC44249a = aVar.f268250b;
                this.f268252r = interfaceC43172j;
                this.f268251q = 1;
                obj = interfaceC44249a.a(this.f268254t, this.f268255u, this);
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
                interfaceC43172j = (InterfaceC43172j) this.f268252r;
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                dVar = new AbstractC39790b.d(aVar.f268249a.b(((C44636a) ((TypedResult.Success) typedResult).getResult()).getUrl()));
            } else {
                if (!(typedResult instanceof TypedResult.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                dVar = AbstractC39790b.C11042b.f394155a;
            }
            this.f268252r = null;
            this.f268251q = 2;
            if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k x xVar, @k InterfaceC44249a interfaceC44249a) {
        this.f268249a = xVar;
        this.f268250b = interfaceC44249a;
    }

    @k
    public final InterfaceC43160i<AbstractC39790b> a(@k String str, @k String str2) {
        return C43175k.G(new C8029a(str, str2, null));
    }
}
