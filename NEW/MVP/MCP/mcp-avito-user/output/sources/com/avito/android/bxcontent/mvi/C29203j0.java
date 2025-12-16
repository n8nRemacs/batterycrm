package com.avito.android.bxcontent.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
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
/* renamed from: com.avito.android.bxcontent.mvi.j0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29203j0 implements InterfaceC43160i<BxContentInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f112467b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f112468c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l f112469d;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.bxcontent.mvi.j0$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f112470b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l f112471c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f112472d;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadAds$$inlined$map$1$2", f = "BxContentInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.j0$a$a, reason: collision with other inner class name */
        public static final class C3305a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f112473q;

            /* renamed from: r, reason: collision with root package name */
            public int f112474r;

            public C3305a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f112473q = obj;
                this.f112474r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.l lVar, Y41.l lVar2) {
            this.f112470b = interfaceC43172j;
            this.f112471c = lVar;
            this.f112472d = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r6 instanceof com.avito.android.bxcontent.mvi.C29203j0.a.C3305a
                if (r0 == 0) goto L13
                r0 = r6
                com.avito.android.bxcontent.mvi.j0$a$a r0 = (com.avito.android.bxcontent.mvi.C29203j0.a.C3305a) r0
                int r1 = r0.f112474r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f112474r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.j0$a$a r0 = new com.avito.android.bxcontent.mvi.j0$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f112473q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f112474r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r6)
                goto L60
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.C42729a0.b(r6)
                kotlin.Q r5 = (kotlin.Q) r5
                A r6 = r5.f406619b
                com.avito.android.serp.adapter.l1 r6 = (com.avito.android.serp.adapter.l1) r6
                B r5 = r5.f406620c
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                if (r5 == 0) goto L4d
                Y41.l r5 = r4.f112471c
                java.lang.Object r5 = r5.invoke(r6)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction r5 = (com.avito.android.bxcontent.mvi.entity.BxContentInternalAction) r5
                goto L55
            L4d:
                Y41.l r5 = r4.f112472d
                java.lang.Object r5 = r5.invoke(r6)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction r5 = (com.avito.android.bxcontent.mvi.entity.BxContentInternalAction) r5
            L55:
                r0.f112474r = r3
                kotlinx.coroutines.flow.j r6 = r4.f112470b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L60
                return r1
            L60:
                kotlin.G0 r5 = kotlin.G0.f406611a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29203j0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C29203j0(InterfaceC43160i interfaceC43160i, Y41.l lVar, Y41.l lVar2) {
        this.f112467b = interfaceC43160i;
        this.f112468c = lVar;
        this.f112469d = lVar2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f112467b.collect(new a(interfaceC43172j, this.f112468c, this.f112469d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
