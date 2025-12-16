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
/* loaded from: classes12.dex */
public final class D0 implements InterfaceC43160i<BxContentInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.C0 f111244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l f111245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l f111246d;

    /* compiled from: Emitters.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f111247b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l f111248c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l f111249d;

        /* compiled from: Emitters.kt */
        @kotlin.jvm.internal.s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentInteractorImpl$loadShortVideos$$inlined$map$2$2", f = "BxContentInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.D0$a$a, reason: collision with other inner class name */
        public static final class C3283a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f111250q;

            /* renamed from: r, reason: collision with root package name */
            public int f111251r;

            public C3283a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f111250q = obj;
                this.f111251r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.l lVar, Y41.l lVar2) {
            this.f111247b = interfaceC43172j;
            this.f111248c = lVar;
            this.f111249d = lVar2;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
                boolean r0 = r8 instanceof com.avito.android.bxcontent.mvi.D0.a.C3283a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.bxcontent.mvi.D0$a$a r0 = (com.avito.android.bxcontent.mvi.D0.a.C3283a) r0
                int r1 = r0.f111251r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f111251r = r1
                goto L18
            L13:
                com.avito.android.bxcontent.mvi.D0$a$a r0 = new com.avito.android.bxcontent.mvi.D0$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f111250q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f111251r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r8)
                goto Lb1
            L2a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L32:
                kotlin.C42729a0.b(r8)
                kotlin.Q r7 = (kotlin.Q) r7
                A r8 = r7.f406619b
                com.avito.android.bxcontent.mvi.e1 r8 = (com.avito.android.bxcontent.mvi.e1) r8
                B r7 = r7.f406620c
                com.avito.android.util.P2 r7 = (com.avito.android.util.P2) r7
                boolean r2 = r7 instanceof com.avito.android.util.P2.a
                if (r2 == 0) goto L4b
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId r7 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$RemoveItem$ByStringId
                java.lang.String r8 = r8.f111792a
                r7.<init>(r8)
                goto La6
            L4b:
                boolean r2 = r7 instanceof com.avito.android.util.P2.b
                if (r2 == 0) goto La4
                com.avito.android.util.P2$b r7 = (com.avito.android.util.P2.b) r7
                T r7 = r7.f318720a
                java.util.List r7 = (java.util.List) r7
                if (r7 == 0) goto L74
                java.lang.Iterable r7 = (java.lang.Iterable) r7
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r7 = r7.iterator()
            L62:
                boolean r4 = r7.hasNext()
                if (r4 == 0) goto L75
                java.lang.Object r4 = r7.next()
                boolean r5 = r4 instanceof com.avito.android.avl_public.repo.BaseAvlVideoItem
                if (r5 == 0) goto L62
                r2.add(r4)
                goto L62
            L74:
                r2 = 0
            L75:
                if (r2 == 0) goto L99
                boolean r7 = r2.isEmpty()
                if (r7 == 0) goto L7e
                goto L99
            L7e:
                Ig.d r7 = r8.f111796e
                if (r7 == 0) goto L91
                boolean r8 = r8.f111797f
                com.avito.android.avl_entry.impl.ui.external_item.ShortVideosItemImpl r7 = r7.h1(r2, r8)
                Y41.l r8 = r6.f111249d
                java.lang.Object r7 = r8.invoke(r7)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction r7 = (com.avito.android.bxcontent.mvi.entity.BxContentInternalAction) r7
                goto La6
            L91:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "wrong item type passed to video wrapper"
                r7.<init>(r8)
                throw r7
            L99:
                java.lang.String r7 = r8.f111792a
                Y41.l r8 = r6.f111248c
                java.lang.Object r7 = r8.invoke(r7)
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction r7 = (com.avito.android.bxcontent.mvi.entity.BxContentInternalAction) r7
                goto La6
            La4:
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$Stub r7 = com.avito.android.bxcontent.mvi.entity.BxContentInternalAction.Stub.f111981b
            La6:
                r0.f111251r = r3
                kotlinx.coroutines.flow.j r8 = r6.f111247b
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto Lb1
                return r1
            Lb1:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.D0.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public D0(kotlinx.coroutines.flow.C0 c02, Y41.l lVar, Y41.l lVar2) {
        this.f111244b = c02;
        this.f111245c = lVar;
        this.f111246d = lVar2;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f111244b.collect(new a(interfaceC43172j, this.f111245c, this.f111246d), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : kotlin.G0.f406611a;
    }
}
