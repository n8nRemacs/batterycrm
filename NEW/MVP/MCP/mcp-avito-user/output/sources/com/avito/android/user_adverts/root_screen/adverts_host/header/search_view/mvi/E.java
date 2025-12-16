package com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
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
/* loaded from: classes5.dex */
public final class E implements InterfaceC43160i<com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D f312843b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f312844b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.SearchViewModel$searchDataFlow$2$invoke$$inlined$map$1$2", f = "SearchViewModel.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E$a$a, reason: collision with other inner class name */
        public static final class C9573a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312845q;

            /* renamed from: r, reason: collision with root package name */
            public int f312846r;

            public C9573a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f312845q = obj;
                this.f312846r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f312844b = interfaceC43172j;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r14, @Y61.k kotlin.coroutines.Continuation r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E.a.C9573a
                if (r0 == 0) goto L13
                r0 = r15
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E$a$a r0 = (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E.a.C9573a) r0
                int r1 = r0.f312846r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f312846r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E$a$a r0 = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.f312845q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f312846r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r15)
                goto L88
            L29:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L31:
                kotlin.C42729a0.b(r15)
                BI0.d r14 = (BI0.d) r14
                boolean r15 = r14 instanceof BI0.d.b
                if (r15 == 0) goto L3c
                r15 = r3
                goto L3e
            L3c:
                boolean r15 = r14 instanceof BI0.d.c
            L3e:
                if (r15 == 0) goto L50
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b r14 = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b
                r9 = 0
                r10 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                r11 = 63
                r12 = 0
                r4 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                goto L7d
            L50:
                boolean r15 = r14 instanceof BI0.d.C0052d
                if (r15 == 0) goto L8b
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b r15 = new com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b
                BI0.d$d r14 = (BI0.d.C0052d) r14
                BI0.d$a<java.lang.String> r2 = r14.f1328e
                T r2 = r2.f1321d
                java.lang.String r2 = (java.lang.String) r2
                java.lang.CharSequence r2 = kotlin.text.C43066x.A0(r2)
                java.lang.String r6 = r2.toString()
                BI0.d$a<java.lang.Boolean> r2 = r14.f1329f
                T r2 = r2.f1321d
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r10 = r2.booleanValue()
                java.util.Map<java.lang.String, java.lang.Object> r8 = r14.f1330g
                java.util.Map<java.lang.String, java.lang.Object> r9 = r14.f1331h
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType r5 = r14.f1332i
                java.lang.String r7 = r14.f1333j
                r4 = r15
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r14 = r15
            L7d:
                r0.f312846r = r3
                kotlinx.coroutines.flow.j r15 = r13.f312844b
                java.lang.Object r14 = r15.emit(r14, r0)
                if (r14 != r1) goto L88
                return r1
            L88:
                kotlin.G0 r14 = kotlin.G0.f406611a
                return r14
            L8b:
                kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
                r14.<init>()
                throw r14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.mvi.E.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public E(D d12) {
        this.f312843b = d12;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f312843b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
