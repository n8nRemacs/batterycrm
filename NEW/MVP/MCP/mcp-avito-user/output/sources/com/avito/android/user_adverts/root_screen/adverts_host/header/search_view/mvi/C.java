package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class C implements InterfaceC43160i<Q<? extends BI0.d, ? extends BI0.d>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f312833b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312834b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchViewModel$filterSearchSubmitted$$inlined$filter$1$2", f = "SearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C$a$a, reason: collision with other inner class name */
        public static final class C9571a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312835q;

            /* renamed from: r, reason: collision with root package name */
            public int f312836r;

            public C9571a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312835q = obj;
                this.f312836r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f312834b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r6, @Y61.k kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C.a.C9571a
                if (r0 == 0) goto L13
                r0 = r7
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C.a.C9571a) r0
                int r1 = r0.f312836r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f312836r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f312835q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f312836r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r7)
                goto L61
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.C42729a0.b(r7)
                r7 = r6
                kotlin.Q r7 = (kotlin.Q) r7
                A r2 = r7.f406619b
                BI0.d r2 = (BI0.d) r2
                B r7 = r7.f406620c
                BI0.d r7 = (BI0.d) r7
                boolean r4 = r7 instanceof BI0.d.b
                if (r4 == 0) goto L45
                r4 = r3
                goto L47
            L45:
                boolean r4 = r7 instanceof BI0.d.c
            L47:
                if (r4 == 0) goto L4c
                boolean r7 = r2 instanceof BI0.d.C0052d
                goto L54
            L4c:
                boolean r2 = r7 instanceof BI0.d.C0052d
                if (r2 == 0) goto L64
                BI0.d$d r7 = (BI0.d.C0052d) r7
                boolean r7 = r7.f1327d
            L54:
                if (r7 == 0) goto L61
                r0.f312836r = r3
                kotlinx.coroutines.flow.j r7 = r5.f312834b
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L61
                return r1
            L61:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L64:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.C.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C(InterfaceC43160i interfaceC43160i) {
        this.f312833b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super Q<? extends BI0.d, ? extends BI0.d>> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312833b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
