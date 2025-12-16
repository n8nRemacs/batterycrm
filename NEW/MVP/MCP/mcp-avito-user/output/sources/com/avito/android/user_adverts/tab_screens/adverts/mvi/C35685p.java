package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
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
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.p, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35685p implements InterfaceC43160i<UserAdvertsListInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f315462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListState f315463c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.p$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315464b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListState f315465c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoadMore$$inlined$map$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.p$a$a, reason: collision with other inner class name */
        public static final class C9768a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315466q;

            /* renamed from: r, reason: collision with root package name */
            public int f315467r;

            public C9768a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315466q = obj;
                this.f315467r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, UserAdvertsListState userAdvertsListState) {
            this.f315464b = interfaceC43172j;
            this.f315465c = userAdvertsListState;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r13, @Y61.k kotlin.coroutines.Continuation r14) {
            /*
                r12 = this;
                boolean r0 = r14 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35685p.a.C9768a
                if (r0 == 0) goto L13
                r0 = r14
                com.avito.android.user_adverts.tab_screens.adverts.mvi.p$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35685p.a.C9768a) r0
                int r1 = r0.f315467r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315467r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.p$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.p$a$a
                r0.<init>(r14)
            L18:
                java.lang.Object r14 = r0.f315466q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315467r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r14)
                goto L6d
            L29:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r14)
                throw r13
            L31:
                kotlin.C42729a0.b(r14)
                eJ0.c r13 = (eJ0.C40016c) r13
                eJ0.b r13 = r13.f395108a
                boolean r14 = r13 instanceof eJ0.InterfaceC40015b.a
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r2 = r12.f315465c
                if (r14 == 0) goto L4d
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError r14 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingError
                r5 = r13
                eJ0.b$a r5 = (eJ0.InterfaceC40015b.a) r5
                r9 = 0
                r7 = 0
                java.lang.String r6 = r2.f315384b
                r8 = 4
                r4 = r14
                r4.<init>(r5, r6, r7, r8, r9)
                goto L62
            L4d:
                boolean r14 = r13 instanceof eJ0.InterfaceC40015b.C11066b
                if (r14 == 0) goto L70
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult r14 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$LoadingResult
                r5 = r13
                eJ0.b$b r5 = (eJ0.InterfaceC40015b.C11066b) r5
                r8 = 0
                r9 = 0
                r6 = 1
                java.lang.String r7 = r2.f315384b
                r10 = 24
                r11 = 0
                r4 = r14
                r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            L62:
                r0.f315467r = r3
                kotlinx.coroutines.flow.j r13 = r12.f315464b
                java.lang.Object r13 = r13.emit(r14, r0)
                if (r13 != r1) goto L6d
                return r1
            L6d:
                kotlin.G0 r13 = kotlin.G0.f406611a
                return r13
            L70:
                kotlin.NoWhenBranchMatchedException r13 = new kotlin.NoWhenBranchMatchedException
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35685p.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35685p(InterfaceC43160i interfaceC43160i, UserAdvertsListState userAdvertsListState) {
        this.f315462b = interfaceC43160i;
        this.f315463c = userAdvertsListState;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315462b.collect(new a(interfaceC43172j, this.f315463c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
