package com.avito.android.paid_services_impl;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class r implements InterfaceC43160i<Q<? extends DeepLink, ? extends Boolean>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f210676b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n f210677c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f210678b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ n f210679c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.paid_services_impl.PaymentFlowInteractorImpl$observeSuccessFlowUri$$inlined$map$2$2", f = "PaymentFlowInteractorImpl.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.paid_services_impl.r$a$a, reason: collision with other inner class name */
        public static final class C6293a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f210680q;

            /* renamed from: r, reason: collision with root package name */
            public int f210681r;

            public C6293a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f210680q = obj;
                this.f210681r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, n nVar) {
            this.f210678b = interfaceC43172j;
            this.f210679c = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.avito.android.paid_services_impl.r.a.C6293a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.paid_services_impl.r$a$a r0 = (com.avito.android.paid_services_impl.r.a.C6293a) r0
                int r1 = r0.f210681r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f210681r = r1
                goto L18
            L13:
                com.avito.android.paid_services_impl.r$a$a r0 = new com.avito.android.paid_services_impl.r$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f210680q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f210681r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L52
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                com.avito.android.deep_linking.links.DeepLink r5 = (com.avito.android.deep_linking.links.DeepLink) r5
                kotlin.Q r6 = new kotlin.Q
                com.avito.android.paid_services_impl.n r2 = r4.f210679c
                r2.getClass()
                boolean r2 = r5 instanceof com.avito.android.deep_linking.links.DialogDeepLink
                r2 = r2 ^ r3
                java.lang.Boolean r2 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
                r6.<init>(r5, r2)
                r0.f210681r = r3
                kotlinx.coroutines.flow.j r5 = r4.f210678b
                java.lang.Object r5 = r5.emit(r6, r0)
                if (r5 != r1) goto L52
                return r1
            L52:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.paid_services_impl.r.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public r(s sVar, n nVar) {
        this.f210676b = sVar;
        this.f210677c = nVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Q<? extends DeepLink, ? extends Boolean>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f210676b.collect(new a(interfaceC43172j, this.f210677c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
