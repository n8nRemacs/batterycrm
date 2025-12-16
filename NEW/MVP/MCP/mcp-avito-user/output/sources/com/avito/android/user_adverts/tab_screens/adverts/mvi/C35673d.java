package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import fJ0.InterfaceC40301a;
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
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.d, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35673d implements InterfaceC43160i<InterfaceC40301a.b.f> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f315322b;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.d$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315323b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$mapToStartSearchAction$$inlined$map$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C9762a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315324q;

            /* renamed from: r, reason: collision with root package name */
            public int f315325r;

            public C9762a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315324q = obj;
                this.f315325r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j) {
            this.f315323b = interfaceC43172j;
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
                boolean r0 = r13 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35673d.a.C9762a
                if (r0 == 0) goto L13
                r0 = r13
                com.avito.android.user_adverts.tab_screens.adverts.mvi.d$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35673d.a.C9762a) r0
                int r1 = r0.f315325r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315325r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.d$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.d$a$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f315324q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315325r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r13)
                goto L53
            L29:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L31:
                kotlin.C42729a0.b(r13)
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b r12 = (com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.b) r12
                fJ0.a$b$f r13 = new fJ0.a$b$f
                java.lang.String r6 = r12.f312782a
                java.util.Map<java.lang.String, java.lang.Object> r9 = r12.f312785d
                java.lang.String r7 = r12.f312787f
                com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.UserAdvertsSearchStartFromType r5 = r12.f312786e
                boolean r10 = r12.f312783b
                java.util.Map<java.lang.String, java.lang.Object> r8 = r12.f312784c
                r4 = r13
                r4.<init>(r5, r6, r7, r8, r9, r10)
                r0.f315325r = r3
                kotlinx.coroutines.flow.j r12 = r11.f315323b
                java.lang.Object r12 = r12.emit(r13, r0)
                if (r12 != r1) goto L53
                return r1
            L53:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35673d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35673d(InterfaceC43160i interfaceC43160i) {
        this.f315322b = interfaceC43160i;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC40301a.b.f> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315322b.collect(new a(interfaceC43172j), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
