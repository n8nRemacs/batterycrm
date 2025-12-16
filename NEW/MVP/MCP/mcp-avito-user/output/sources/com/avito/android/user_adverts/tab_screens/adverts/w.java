package com.avito.android.user_adverts.tab_screens.adverts;

import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.tab_actions.host.e;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import com.avito.android.util.R0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: UserAdvertsListMviFragment.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectSelectedActionV2$1", f = "UserAdvertsListMviFragment.kt", i = {}, l = {509}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class w extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315730q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UserAdvertsListMviFragment f315731r;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<e.a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f315732b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ UserAdvertsListMviFragment f315733c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.w$a$a, reason: collision with other inner class name */
        public static final class C9782a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f315734b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$collectSelectedActionV2$1$invokeSuspend$$inlined$map$1$2", f = "UserAdvertsListMviFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.w$a$a$a, reason: collision with other inner class name */
            public static final class C9783a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f315735q;

                /* renamed from: r, reason: collision with root package name */
                public int f315736r;

                public C9783a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    this.f315735q = obj;
                    this.f315736r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9782a.this.emit(null, this);
                }
            }

            public C9782a(InterfaceC43172j interfaceC43172j, UserAdvertsListMviFragment userAdvertsListMviFragment) {
                this.f315734b = interfaceC43172j;
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
                    boolean r0 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.w.a.C9782a.C9783a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.avito.android.user_adverts.tab_screens.adverts.w$a$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.w.a.C9782a.C9783a) r0
                    int r1 = r0.f315736r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f315736r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.w$a$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.w$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f315735q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f315736r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r8)
                    goto L84
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    kotlin.C42729a0.b(r8)
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r7 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r7
                    com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment$a r8 = com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment.f314828R0
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$DataState r8 = r7.f315396n
                    boolean r8 = r8 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.Loaded
                    java.lang.String r2 = r7.f315384b
                    if (r8 == 0) goto L74
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode r7 = r7.f315397o
                    boolean r8 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Multiply
                    if (r8 == 0) goto L5c
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode$Multiply r7 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Multiply) r7
                    com.avito.android.user_adverts.model.UserAdvertsGroupData r8 = r7.f315400b
                    int r4 = r8.f312183c
                    if (r4 <= 0) goto L56
                    com.avito.android.user_adverts.tab_actions.host.e$a$a r4 = new com.avito.android.user_adverts.tab_actions.host.e$a$a
                    com.avito.android.user_adverts.tab_screens.adverts.domain.model.UserAdvertActionsInfoDomain r7 = r7.f315401c
                    r4.<init>(r2, r8, r7)
                    goto L79
                L56:
                    com.avito.android.user_adverts.tab_actions.host.e$a$c r4 = new com.avito.android.user_adverts.tab_actions.host.e$a$c
                    r4.<init>(r2)
                    goto L79
                L5c:
                    boolean r8 = r7 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single.Loaded
                    if (r8 == 0) goto L6e
                    com.avito.android.user_adverts.tab_actions.host.e$a$b r4 = new com.avito.android.user_adverts.tab_actions.host.e$a$b
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$ChoiceMode$Single$Loaded r7 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.ChoiceMode.Single.Loaded) r7
                    java.lang.String r8 = r7.f315403b
                    java.lang.String r5 = r7.f315404c
                    com.avito.android.user_adverts.tab_actions.host.domain.model.AvailableActionsDomain r7 = r7.f315405d
                    r4.<init>(r2, r8, r5, r7)
                    goto L79
                L6e:
                    com.avito.android.user_adverts.tab_actions.host.e$a$c r4 = new com.avito.android.user_adverts.tab_actions.host.e$a$c
                    r4.<init>(r2)
                    goto L79
                L74:
                    com.avito.android.user_adverts.tab_actions.host.e$a$c r4 = new com.avito.android.user_adverts.tab_actions.host.e$a$c
                    r4.<init>(r2)
                L79:
                    r0.f315736r = r3
                    kotlinx.coroutines.flow.j r7 = r6.f315734b
                    java.lang.Object r7 = r7.emit(r4, r0)
                    if (r7 != r1) goto L84
                    return r1
                L84:
                    kotlin.G0 r7 = kotlin.G0.f406611a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.w.a.C9782a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(n2 n2Var, UserAdvertsListMviFragment userAdvertsListMviFragment) {
            this.f315732b = n2Var;
            this.f315733c = userAdvertsListMviFragment;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @Y61.l
        public final Object collect(@Y61.k InterfaceC43172j<? super e.a> interfaceC43172j, @Y61.k Continuation continuation) {
            Object objCollect = this.f315732b.collect(new C9782a(interfaceC43172j, this.f315733c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(UserAdvertsListMviFragment userAdvertsListMviFragment, Continuation<? super w> continuation) {
        super(2, continuation);
        this.f315731r = userAdvertsListMviFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new w(this.f315731r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((w) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f315730q;
        if (i12 == 0) {
            C42729a0.b(obj);
            UserAdvertsListMviFragment.C35649a c35649a = UserAdvertsListMviFragment.f314828R0;
            UserAdvertsListMviFragment userAdvertsListMviFragment = this.f315731r;
            InterfaceC43160i interfaceC43160iR = C43175k.r(new a(userAdvertsListMviFragment.u5().getState(), userAdvertsListMviFragment));
            R0 r02 = userAdvertsListMviFragment.f314855x0;
            if (r02 == null) {
                r02 = null;
            }
            InterfaceC43160i interfaceC43160iI = C43175k.I(r02.c(), interfaceC43160iR);
            com.avito.android.user_adverts.tab_actions.host.e eVar = userAdvertsListMviFragment.f314854w0;
            com.avito.android.user_adverts.tab_actions.host.e eVar2 = eVar != null ? eVar : null;
            this.f315730q = 1;
            if (interfaceC43160iI.collect(eVar2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
