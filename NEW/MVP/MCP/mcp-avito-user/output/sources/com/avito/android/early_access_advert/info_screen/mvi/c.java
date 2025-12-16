package com.avito.android.early_access_advert.info_screen.mvi;

import Y41.p;
import Y61.l;
import com.avito.android.early_access_advert.info_screen.mvi.entity.EarlyAccessAdvertInfoInternalAction;
import com.avito.android.remote.model.early_access_advert.EarlyAccessAdvert;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: EarlyAccessAdvertInfoBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/early_access_advert/info_screen/mvi/c;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "_avito_early-access-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class c implements com.avito.android.arch.mvi.b<EarlyAccessAdvertInfoInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final EarlyAccessAdvert f145729a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f145730b;

    /* compiled from: EarlyAccessAdvertInfoBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/early_access_advert/info_screen/mvi/entity/EarlyAccessAdvertInfoInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.early_access_advert.info_screen.mvi.EarlyAccessAdvertInfoBootstrap$produce$1", f = "EarlyAccessAdvertInfoBootstrap.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super EarlyAccessAdvertInfoInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f145731q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f145732r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f145732r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super EarlyAccessAdvertInfoInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f145731q;
            c cVar = c.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f145732r;
                if (!cVar.f145730b) {
                    EarlyAccessAdvertInfoInternalAction.Content content = new EarlyAccessAdvertInfoInternalAction.Content(cVar.f145729a);
                    this.f145731q = 1;
                    if (interfaceC43172j.emit(content, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
            cVar.f145730b = true;
            return G0.f406611a;
        }
    }

    @Inject
    public c(@Y61.k EarlyAccessAdvert earlyAccessAdvert) {
        this.f145729a = earlyAccessAdvert;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EarlyAccessAdvertInfoInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
