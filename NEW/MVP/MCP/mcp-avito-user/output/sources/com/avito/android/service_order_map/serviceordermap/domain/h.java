package com.avito.android.service_order_map.serviceordermap.domain;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;

/* compiled from: SafeCollector.common.kt */
@s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements InterfaceC43160i<ServiceOrderMapInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f278665b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f278666c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f278667b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f278668c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.service_order_map.serviceordermap.domain.FindSuggestedLocationsByQueryUseCase$invoke$$inlined$map$1$2", f = "FindSuggestedLocationsByQueryUseCase.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.service_order_map.serviceordermap.domain.h$a$a, reason: collision with other inner class name */
        public static final class C8286a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f278669q;

            /* renamed from: r, reason: collision with root package name */
            public int f278670r;

            public C8286a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                this.f278669q = obj;
                this.f278670r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, String str) {
            this.f278667b = interfaceC43172j;
            this.f278668c = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r7, @Y61.k kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.avito.android.service_order_map.serviceordermap.domain.h.a.C8286a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.service_order_map.serviceordermap.domain.h$a$a r0 = (com.avito.android.service_order_map.serviceordermap.domain.h.a.C8286a) r0
                int r1 = r0.f278670r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f278670r = r1
                goto L18
            L13:
                com.avito.android.service_order_map.serviceordermap.domain.h$a$a r0 = new com.avito.android.service_order_map.serviceordermap.domain.h$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f278669q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f278670r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L9c
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                com.avito.android.remote.model.TypedResult r7 = (com.avito.android.remote.model.TypedResult) r7
                boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r8 == 0) goto L4f
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError r8 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$NetworkError
                com.avito.android.analytics.screens.J$a$a r2 = com.avito.android.analytics.screens.J.a.f90383b
                com.avito.android.remote.model.TypedResult$Error r7 = (com.avito.android.remote.model.TypedResult.Error) r7
                com.avito.android.remote.error.ApiError r7 = r7.getError()
                r2.getClass()
                com.avito.android.analytics.screens.J$a r7 = com.avito.android.analytics.screens.J.a.C2676a.b(r7)
                r8.<init>(r7)
                goto L91
            L4f:
                boolean r8 = r7 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r8 == 0) goto L9f
                com.avito.android.remote.model.TypedResult$Success r7 = (com.avito.android.remote.model.TypedResult.Success) r7
                java.lang.Object r7 = r7.getResult()
                uF.d$c r7 = (uF.d.c) r7
                java.util.List r7 = r7.a()
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.HashSet r8 = new java.util.HashSet
                r8.<init>()
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L6f:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L8a
                java.lang.Object r4 = r7.next()
                r5 = r4
                com.avito.android.geo_common.model.location_picker.AddressSuggestion r5 = (com.avito.android.geo_common.model.location_picker.AddressSuggestion) r5
                java.lang.String r5 = r5.c()
                boolean r5 = r8.add(r5)
                if (r5 == 0) goto L6f
                r2.add(r4)
                goto L6f
            L8a:
                com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdateSearchSuggestions r8 = new com.avito.android.service_order_map.serviceordermap.mvi.entity.ServiceOrderMapInternalAction$UpdateSearchSuggestions
                java.lang.String r7 = r6.f278668c
                r8.<init>(r7, r2)
            L91:
                r0.f278670r = r3
                kotlinx.coroutines.flow.j r7 = r6.f278667b
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L9c
                return r1
            L9c:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L9f:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.service_order_map.serviceordermap.domain.h.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public h(InterfaceC43160i interfaceC43160i, String str) {
        this.f278665b = interfaceC43160i;
        this.f278666c = str;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @l
    public final Object collect(@k InterfaceC43172j<? super ServiceOrderMapInternalAction> interfaceC43172j, @k Continuation continuation) {
        Object objCollect = ((AbstractC43168f) this.f278665b).collect(new a(interfaceC43172j, this.f278666c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
