package com.avito.android.user_adverts.tab_screens.adverts.dataProvider;

import Y61.k;
import Y61.l;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListParams;
import com.avito.android.user_adverts.tab_screens.adverts.F;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState;
import k70.C42533a;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import nE.C44240b;

/* compiled from: UserAdvertsListPersonalSelectionsDataProvider.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/adverts/dataProvider/h;", "Lcom/avito/android/personal_selections/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements com.avito.android.personal_selections.domain.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42726C<C44240b> f314945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC42726C<F> f314946b;

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements InterfaceC43160i<UserAdvertsListState> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n2 f314947b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$a$a, reason: collision with other inner class name */
        public static final class C9742a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f314948b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.dataProvider.UserAdvertsListPersonalSelectionsDataProviderKt$createPersonalSelectionsDataProvider$1$getData$$inlined$filter$1$2", f = "UserAdvertsListPersonalSelectionsDataProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$a$a$a, reason: collision with other inner class name */
            public static final class C9743a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f314949q;

                /* renamed from: r, reason: collision with root package name */
                public int f314950r;

                public C9743a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f314949q = obj;
                    this.f314950r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C9742a.this.emit(null, this);
                }
            }

            public C9742a(InterfaceC43172j interfaceC43172j) {
                this.f314948b = interfaceC43172j;
            }

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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.a.C9742a.C9743a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$a$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.a.C9742a.C9743a) r0
                    int r1 = r0.f314950r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f314950r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$a$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f314949q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f314950r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r6 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r6
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState$DataState r6 = r6.f315396n
                    boolean r6 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState.DataState.None
                    if (r6 != 0) goto L48
                    r0.f314950r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f314948b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.a.C9742a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(n2 n2Var) {
            this.f314947b = n2Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super UserAdvertsListState> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f314947b.collect(new C9742a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements InterfaceC43160i<C42533a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f314952b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f314953b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.dataProvider.UserAdvertsListPersonalSelectionsDataProviderKt$createPersonalSelectionsDataProvider$1$getData$$inlined$map$1$2", f = "UserAdvertsListPersonalSelectionsDataProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$b$a$a, reason: collision with other inner class name */
            public static final class C9744a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f314954q;

                /* renamed from: r, reason: collision with root package name */
                public int f314955r;

                public C9744a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f314954q = obj;
                    this.f314955r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f314953b = interfaceC43172j;
            }

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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.b.a.C9744a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$b$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.b.a.C9744a) r0
                    int r1 = r0.f314955r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f314955r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$b$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f314954q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f314955r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r5 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r5
                    k70.a r6 = new k70.a
                    boolean r5 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.a(r5)
                    r6.<init>(r5)
                    r0.f314955r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f314953b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(InterfaceC43160i interfaceC43160i) {
            this.f314952b = interfaceC43160i;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C42533a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f314952b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC43160i<C42533a> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f314957b;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f314958b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.dataProvider.UserAdvertsListPersonalSelectionsDataProviderKt$createPersonalSelectionsDataProvider$1$getData$$inlined$map$2$2", f = "UserAdvertsListPersonalSelectionsDataProvider.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$c$a$a, reason: collision with other inner class name */
            public static final class C9745a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f314959q;

                /* renamed from: r, reason: collision with root package name */
                public int f314960r;

                public C9745a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f314959q = obj;
                    this.f314960r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC43172j interfaceC43172j) {
                this.f314958b = interfaceC43172j;
            }

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
                    boolean r0 = r6 instanceof com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.c.a.C9745a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$c$a$a r0 = (com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.c.a.C9745a) r0
                    int r1 = r0.f314960r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f314960r = r1
                    goto L18
                L13:
                    com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$c$a$a r0 = new com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h$c$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f314959q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f314960r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4a
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState r5 = (com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListState) r5
                    k70.a r6 = new k70.a
                    boolean r5 = com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.a.a(r5)
                    r6.<init>(r5)
                    r0.f314960r = r3
                    kotlinx.coroutines.flow.j r5 = r4.f314958b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L4a
                    return r1
                L4a:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.dataProvider.h.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public c(a aVar) {
            this.f314957b = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C42533a> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = this.f314957b.collect(new a(interfaceC43172j), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: UserAdvertsListPersonalSelectionsDataProvider.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/user_adverts/tab_screens/UserAdvertsListParams;", VoiceInfo.STATE, "Lcom/avito/android/user_adverts/tab_screens/adverts/mvi/entity/UserAdvertsListState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.l<UserAdvertsListState, UserAdvertsListParams> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f314962l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final UserAdvertsListParams invoke(UserAdvertsListState userAdvertsListState) {
            return userAdvertsListState.f315399q;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC42726C<? extends C44240b> interfaceC42726C, InterfaceC42726C<F> interfaceC42726C2) {
        this.f314945a = interfaceC42726C;
        this.f314946b = interfaceC42726C2;
    }

    @Override // com.avito.android.personal_selections.domain.a
    @k
    public final InterfaceC43160i<C42533a> getData() {
        boolean zBooleanValue = this.f314945a.getValue().v().invoke().booleanValue();
        InterfaceC42726C<F> interfaceC42726C = this.f314946b;
        return zBooleanValue ? C43175k.r(new b(C43175k.s(interfaceC42726C.getValue().getState(), d.f314962l))) : C43175k.r(new c(new a(interfaceC42726C.getValue().getState())));
    }
}
