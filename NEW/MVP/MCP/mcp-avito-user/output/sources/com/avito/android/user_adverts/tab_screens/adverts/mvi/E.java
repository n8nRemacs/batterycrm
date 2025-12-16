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
@Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E implements InterfaceC43160i<InterfaceC40301a> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.internal.m f315193b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.a f315194c;

    /* compiled from: Emitters.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j f315195b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a f315196c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processSelectSingleAction$$inlined$filter$1$2", f = "UserAdvertsListActor.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.E$a$a, reason: collision with other inner class name */
        public static final class C9750a extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f315197q;

            /* renamed from: r, reason: collision with root package name */
            public int f315198r;

            public C9750a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f315197q = obj;
                this.f315198r |= BeduinInputModel.MIN_TEXT_VERSION;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC43172j interfaceC43172j, Y41.a aVar) {
            this.f315195b = interfaceC43172j;
            this.f315196c = aVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:41:0x009c  */
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
                boolean r0 = r9 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.E.a.C9750a
                if (r0 == 0) goto L13
                r0 = r9
                com.avito.android.user_adverts.tab_screens.adverts.mvi.E$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.E.a.C9750a) r0
                int r1 = r0.f315198r
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f315198r = r1
                goto L18
            L13:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.E$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.mvi.E$a$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f315197q
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f315198r
                r3 = 1
                if (r2 == 0) goto L32
                if (r2 != r3) goto L2a
                kotlin.C42729a0.b(r9)
                goto La7
            L2a:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L32:
                kotlin.C42729a0.b(r9)
                r9 = r8
                fJ0.a r9 = (fJ0.InterfaceC40301a) r9
                Y41.a r2 = r7.f315196c
                java.lang.Object r2 = r2.invoke()
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r2
                boolean r4 = r9 instanceof fJ0.InterfaceC40301a.d
                if (r4 == 0) goto L89
                fJ0.a$d r9 = (fJ0.InterfaceC40301a.d) r9
                java.lang.String r4 = r9.getF395832a()
                com.avito.android.user_adverts.tab_screens.adverts.domain.model.item.UserAdvertItemDomain r4 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.c(r2, r4)
                boolean r5 = r9 instanceof fJ0.InterfaceC40301a.d.C11143a
                r6 = 0
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode r2 = r2.f315397o
                if (r5 == 0) goto L6a
                if (r4 == 0) goto La7
                boolean r9 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single
                if (r9 == 0) goto L67
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode$Single r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single) r2
                java.lang.String r9 = r2.getF315406b()
                java.lang.String r2 = r4.f315030P
                boolean r6 = kotlin.jvm.internal.L.f(r9, r2)
            L67:
                if (r6 != 0) goto La7
                goto L9c
            L6a:
                boolean r9 = r9 instanceof fJ0.InterfaceC40301a.d.b
                if (r9 == 0) goto L83
                if (r4 == 0) goto La7
                boolean r9 = r2 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single
                if (r9 == 0) goto L80
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode$Single r2 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single) r2
                java.lang.String r9 = r2.getF315406b()
                java.lang.String r2 = r4.f315030P
                boolean r6 = kotlin.jvm.internal.L.f(r9, r2)
            L80:
                if (r6 == 0) goto La7
                goto L9c
            L83:
                kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                r8.<init>()
                throw r8
            L89:
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode r9 = r2.f315397o
                boolean r2 = r9 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single
                r4 = 0
                if (r2 == 0) goto L93
                com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode$Single r9 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single) r9
                goto L94
            L93:
                r9 = r4
            L94:
                if (r9 == 0) goto L9a
                java.lang.String r4 = r9.getF315406b()
            L9a:
                if (r4 == 0) goto La7
            L9c:
                r0.f315198r = r3
                kotlinx.coroutines.flow.j r9 = r7.f315195b
                java.lang.Object r8 = r9.emit(r8, r0)
                if (r8 != r1) goto La7
                return r1
            La7:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.E.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public E(kotlinx.coroutines.flow.internal.m mVar, Y41.a aVar) {
        this.f315193b = mVar;
        this.f315194c = aVar;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC43160i
    @Y61.l
    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC40301a> interfaceC43172j, @Y61.k Continuation continuation) {
        Object objCollect = this.f315193b.collect(new a(interfaceC43172j, this.f315194c), continuation);
        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
    }
}
