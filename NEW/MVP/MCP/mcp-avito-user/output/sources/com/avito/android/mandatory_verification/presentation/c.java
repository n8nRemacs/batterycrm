package com.avito.android.mandatory_verification.presentation;

import UX.a;
import Y41.l;
import Y41.p;
import Y61.k;
import com.avito.android.mandatory_verification.items.uploader.a;
import com.avito.android.util.R0;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: MandatoryVerificationItemPresentersDelegate.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/presentation/c;", "Lcom/avito/android/mandatory_verification/presentation/a;", "_avito_mandatory-verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class c implements com.avito.android.mandatory_verification.presentation.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final l<UX.a, G0> f184727a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43238h f184728b;

    /* compiled from: MandatoryVerificationItemPresentersDelegate.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mandatory_verification.presentation.MandatoryVerificationItemPresentersDelegateImpl$process$1$1", f = "MandatoryVerificationItemPresentersDelegate.kt", i = {}, l = {38, 44, 50}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f184729q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ TV0.d<?, ?> f184730r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f184731s;

        /* compiled from: MandatoryVerificationItemPresentersDelegate.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mandatory_verification/items/uploader/a;", "action", "Lkotlin/G0;", "emit", "(Lcom/avito/android/mandatory_verification/items/uploader/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mandatory_verification.presentation.c$a$a, reason: collision with other inner class name */
        public static final class C5424a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c f184732b;

            public C5424a(c cVar) {
                this.f184732b = cVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                com.avito.android.mandatory_verification.items.uploader.a aVar = (com.avito.android.mandatory_verification.items.uploader.a) obj;
                boolean z12 = aVar instanceof a.b;
                c cVar = this.f184732b;
                if (z12) {
                    cVar.f184727a.invoke(new a.d(((a.b) aVar).f184689a));
                } else if (aVar instanceof a.C5423a) {
                    cVar.f184727a.invoke(new a.b(((a.C5423a) aVar).f184687a));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TV0.d<?, ?> dVar, c cVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f184730r = dVar;
            this.f184731s = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new a(this.f184730r, this.f184731s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f184729q;
            if (i12 == 0) {
                C42729a0.b(obj);
                TV0.d<?, ?> dVar = this.f184730r;
                boolean z12 = dVar instanceof com.avito.android.mandatory_verification.items.header.e;
                c cVar = this.f184731s;
                if (z12) {
                    e2 f236837c = ((com.avito.android.mandatory_verification.items.header.e) dVar).getF236837c();
                    this.f184729q = 1;
                    cVar.getClass();
                    Object objCollect = f236837c.collect(new b(cVar), this);
                    if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect = G0.f406611a;
                    }
                    if (objCollect == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (dVar instanceof com.avito.android.mandatory_verification.items.accountVerification.e) {
                    e2 f236837c2 = ((com.avito.android.mandatory_verification.items.accountVerification.e) dVar).getF236837c();
                    this.f184729q = 2;
                    cVar.getClass();
                    Object objCollect2 = f236837c2.collect(new b(cVar), this);
                    if (objCollect2 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objCollect2 = G0.f406611a;
                    }
                    if (objCollect2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (dVar instanceof com.avito.android.mandatory_verification.items.uploader.f) {
                    e2 f236837c3 = ((com.avito.android.mandatory_verification.items.uploader.f) dVar).getF236837c();
                    C5424a c5424a = new C5424a(cVar);
                    this.f184729q = 3;
                    f236837c3.getClass();
                    if (e2.g(f236837c3, c5424a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public c(@k l<? super UX.a, G0> lVar, @k R0 r02) {
        this.f184727a = lVar;
        this.f184728b = U.a(r02.b());
    }

    @Override // com.avito.android.mandatory_verification.presentation.a
    public final void a(@k Set<? extends TV0.d<?, ?>> set) {
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            C43259k.d(this.f184728b, null, null, new a((TV0.d) it.next(), this, null), 3);
        }
    }

    @Override // com.avito.android.mandatory_verification.presentation.a
    public final void e() {
        U.b(this.f184728b, null);
    }
}
