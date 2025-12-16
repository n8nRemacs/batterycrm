package com.avito.android.publish.price_list.domain;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
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
/* loaded from: classes16.dex */
public final class k implements InterfaceC43160i<List<? extends com.avito.conveyor_item.a>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f238567b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f238568c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f238569b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f238570c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.publish.price_list.domain.SelectPriceListSearchInteractorImpl$observeSearchResult$$inlined$map$1$2", f = "SelectPriceListSearchInteractor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.publish.price_list.domain.k$a$a, reason: collision with other inner class name */
        public static final class C7171a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f238571q;

            /* renamed from: r, reason: collision with root package name */
            public int f238572r;

            public C7171a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f238571q = obj;
                this.f238572r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, m mVar) {
            this.f238569b = interfaceC43172j;
            this.f238570c = mVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r8, @Y61.k kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof com.avito.android.publish.price_list.domain.k.a.C7171a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.publish.price_list.domain.k$a$a r0 = (com.avito.android.publish.price_list.domain.k.a.C7171a) r0
                int r1 = r0.f238572r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f238572r = r1
                goto L18
            L13:
                com.avito.android.publish.price_list.domain.k$a$a r0 = new com.avito.android.publish.price_list.domain.k$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f238571q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f238572r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r9)
                goto La1
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                kotlin.C42729a0.b(r9)
                java.lang.String r8 = (java.lang.String) r8
                boolean r9 = kotlin.text.C43066x.K(r8)
                com.avito.android.publish.price_list.domain.m r2 = r7.f238570c
                if (r9 == 0) goto L42
                java.util.ArrayList r8 = r2.f238578d
                goto L96
            L42:
                java.util.ArrayList r9 = r2.f238579e
                java.util.ArrayList r4 = new java.util.ArrayList
                r4.<init>()
                java.util.Iterator r9 = r9.iterator()
            L4d:
                boolean r5 = r9.hasNext()
                if (r5 == 0) goto L68
                java.lang.Object r5 = r9.next()
                r6 = r5
                com.avito.android.publish.price_list.items.selectable.d r6 = (com.avito.android.publish.price_list.items.selectable.d) r6
                java.lang.String r6 = r6.f238674e
                if (r6 == 0) goto L4d
                boolean r6 = kotlin.text.C43066x.q(r6, r8, r3)
                if (r6 != r3) goto L4d
                r4.add(r5)
                goto L4d
            L68:
                boolean r8 = r4.isEmpty()
                if (r8 == 0) goto L93
                java.util.ArrayList r8 = r2.f238579e
                java.util.Iterator r8 = r8.iterator()
            L74:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L8c
                java.lang.Object r9 = r8.next()
                r4 = r9
                com.avito.android.publish.price_list.items.selectable.d r4 = (com.avito.android.publish.price_list.items.selectable.d) r4
                java.lang.String r4 = r4.f238671b
                java.lang.String r5 = r2.f238575a
                boolean r4 = kotlin.jvm.internal.L.f(r4, r5)
                if (r4 == 0) goto L74
                goto L8d
            L8c:
                r9 = 0
            L8d:
                com.avito.android.publish.price_list.items.selectable.d r9 = (com.avito.android.publish.price_list.items.selectable.d) r9
                java.util.List r4 = kotlin.collections.C42745f0.V(r9)
            L93:
                r8 = r4
                java.util.List r8 = (java.util.List) r8
            L96:
                r0.f238572r = r3
                kotlinx.coroutines.flow.j r9 = r7.f238569b
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto La1
                return r1
            La1:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.publish.price_list.domain.k.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public k(InterfaceC43160i interfaceC43160i, m mVar) {
        this.f238567b = interfaceC43160i;
        this.f238568c = mVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super List<? extends com.avito.conveyor_item.a>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f238567b.collect(new a(interfaceC43172j, this.f238568c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
