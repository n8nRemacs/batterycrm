package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
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
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35674e implements InterfaceC43160i<UserAdvertsListInternalAction> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i f315327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ UserAdvertItemDomain f315328c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.e$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315329b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertItemDomain f315330c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processAdvertSelected$$inlined$map$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.e$a$a, reason: collision with other inner class name */
        public static final class C9763a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315331q;

            /* renamed from: r, reason: collision with root package name */
            public int f315332r;

            public C9763a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315331q = obj;
                this.f315332r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, UserAdvertItemDomain userAdvertItemDomain) {
            this.f315329b = interfaceC43172j;
            this.f315330c = userAdvertItemDomain;
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
                boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.C35674e.a.C9763a
                if (r0 == 0) goto L13
                r0 = r8
                com.avito.android.user_adverts.tab_screens.adverts.mvi.e$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.C35674e.a.C9763a) r0
                int r1 = r0.f315332r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315332r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.e$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.e$a$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f315331q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315332r
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.C42729a0.b(r8)
                goto L64
            L29:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L31:
                kotlin.C42729a0.b(r8)
                XI0.b r7 = (XI0.b) r7
                boolean r8 = r7 instanceof XI0.b.a
                com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain r2 = r6.f315330c
                java.lang.String r4 = r2.f315032c
                java.lang.String r2 = r2.f315030P
                if (r8 == 0) goto L4a
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$SingeSelectLoaded r8 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$SingeSelectLoaded
                XI0.b$a r7 = (XI0.b.a) r7
                com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain r7 = r7.f18823a
                r8.<init>(r2, r4, r7)
                goto L59
            L4a:
                boolean r8 = r7 instanceof XI0.b.C1327b
                if (r8 == 0) goto L67
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$SingleSelectError r8 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction$SingleSelectError
                XI0.b$b r7 = (XI0.b.C1327b) r7
                com.avito.android.remote.error.ApiError r5 = r7.f18824a
                java.lang.Throwable r7 = r7.f18825b
                r8.<init>(r2, r4, r5, r7)
            L59:
                r0.f315332r = r3
                kotlinx.coroutines.flow.j r7 = r6.f315329b
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L64
                return r1
            L64:
                kotlin.G0 r7 = kotlin.G0.f406611a
                return r7
            L67:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35674e.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public C35674e(InterfaceC43160i interfaceC43160i, UserAdvertItemDomain userAdvertItemDomain) {
        this.f315327b = interfaceC43160i;
        this.f315328c = userAdvertItemDomain;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315327b.collect(new a(interfaceC43172j, this.f315328c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
