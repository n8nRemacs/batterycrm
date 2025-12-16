package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SafeCollector.common.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C0 implements InterfaceC43160i<e1> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ A0 f111236b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f111237c;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f111238b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f111239c;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadShortVideos$$inlined$map$1$2", f = "BxContentInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.C0$a$a, reason: collision with other inner class name */
        public static final class C3282a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f111240q;

            /* renamed from: r, reason: collision with root package name */
            public int f111241r;

            public C3282a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f111240q = obj;
                this.f111241r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, boolean z12) {
            this.f111238b = interfaceC43172j;
            this.f111239c = z12;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r12, @Y61.k kotlin.coroutines.Continuation r13) {
            /*
                r11 = this;
                boolean r0 = r13 instanceof com.avito.android.bxcontent.mvi.C0.a.C3282a
                if (r0 == 0) goto L13
                r0 = r13
                com.avito.android.bxcontent.mvi.C0$a$a r0 = (com.avito.android.bxcontent.mvi.C0.a.C3282a) r0
                int r1 = r0.f111241r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f111241r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.C0$a$a r0 = new com.avito.android.bxcontent.mvi.C0$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f111240q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f111241r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r13)
                goto L5c
            L29:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L31:
                kotlin.C42729a0.b(r13)
                com.avito.android.serp.adapter.l1 r12 = (com.avito.android.serp.adapter.l1) r12
                r9 = r12
                Ig.d r9 = (Ig.d) r9
                com.avito.android.bxcontent.mvi.e1 r12 = new com.avito.android.bxcontent.mvi.e1
                java.lang.String r5 = r9.getF84571b()
                java.util.List r6 = r9.d1()
                java.lang.String r7 = r9.getCategoryId()
                java.lang.String r8 = r9.getXHash()
                boolean r10 = r11.f111239c
                r4 = r12
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.f111241r = r3
                kotlinx.coroutines.flow.j r13 = r11.f111238b
                java.lang.Object r12 = r13.emit(r12, r0)
                if (r12 != r1) goto L5c
                return r1
            L5c:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C0(A0 a02, boolean z12) {
        this.f111236b = a02;
        this.f111237c = z12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super e1> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f111236b.collect(new a(interfaceC43172j, this.f111237c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
