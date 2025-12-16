package com.avito.android.sx_address.entry.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction;
import h31.e;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SxAddressEntryUseCase.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/sx_address/entry/domain/c;", "", "_avito_sx-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<EA0.a> f292933a;

    /* compiled from: SxAddressEntryUseCase.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/sx_address/entry/mvi/entity/SxAddressEntryInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.sx_address.entry.domain.SxAddressEntryUseCase$invoke$1", f = "SxAddressEntryUseCase.kt", i = {0, 1}, l = {15, 16, 18, 21}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super SxAddressEntryInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f292934q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f292935r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = c.this.new a(continuation);
            aVar.f292935r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super SxAddressEntryInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f292934q
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L32
                if (r1 == r5) goto L2a
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                goto L1d
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                kotlin.C42729a0.b(r11)
                goto Lda
            L22:
                java.lang.Object r1 = r10.f292935r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L5f
            L2a:
                java.lang.Object r1 = r10.f292935r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L4a
            L32:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f292935r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$ShowLoading r1 = new com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$ShowLoading
                r1.<init>()
                r10.f292935r = r11
                r10.f292934q = r5
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L49
                return r0
            L49:
                r1 = r11
            L4a:
                com.avito.android.sx_address.entry.domain.c r11 = com.avito.android.sx_address.entry.domain.c.this
                h31.e<EA0.a> r11 = r11.f292933a
                java.lang.Object r11 = r11.get()
                EA0.a r11 = (EA0.a) r11
                r10.f292935r = r1
                r10.f292934q = r4
                java.lang.Object r11 = r11.j(r10)
                if (r11 != r0) goto L5f
                return r0
            L5f:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r4 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                r5 = 0
                if (r4 == 0) goto Lb4
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                IA0.b r11 = (IA0.b) r11
                com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$LoadedList r2 = new com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$LoadedList
                java.util.List r11 = r11.a()
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r4 = new java.util.ArrayList
                r6 = 10
                int r6 = kotlin.collections.C42745f0.q(r11, r6)
                r4.<init>(r6)
                java.util.Iterator r11 = r11.iterator()
            L85:
                boolean r6 = r11.hasNext()
                if (r6 == 0) goto La6
                java.lang.Object r6 = r11.next()
                IA0.a r6 = (IA0.a) r6
                com.avito.android.sx_address.entry.domain.a r7 = new com.avito.android.sx_address.entry.domain.a
                java.lang.String r8 = r6.getDescription()
                java.lang.String r9 = r6.getTitle()
                com.avito.android.deep_linking.links.DeepLink r6 = r6.getUrl()
                r7.<init>(r8, r9, r6)
                r4.add(r7)
                goto L85
            La6:
                r2.<init>(r4)
                r10.f292935r = r5
                r10.f292934q = r3
                java.lang.Object r11 = r1.emit(r2, r10)
                if (r11 != r0) goto Lda
                return r0
            Lb4:
                boolean r3 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r3 == 0) goto Ldd
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r3 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r3, r11)
                com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$LoadingError r3 = new com.avito.android.sx_address.entry.mvi.entity.SxAddressEntryInternalAction$LoadingError
                com.avito.android.remote.error.ApiError r11 = com.avito.android.error.z.n(r11)
                r3.<init>(r11)
                r10.f292935r = r5
                r10.f292934q = r2
                java.lang.Object r11 = r1.emit(r3, r10)
                if (r11 != r0) goto Lda
                return r0
            Lda:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Ldd:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sx_address.entry.domain.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public c(@k e<EA0.a> eVar) {
        this.f292933a = eVar;
    }

    @k
    public final InterfaceC43160i<SxAddressEntryInternalAction> a() {
        return C43175k.G(new a(null));
    }
}
