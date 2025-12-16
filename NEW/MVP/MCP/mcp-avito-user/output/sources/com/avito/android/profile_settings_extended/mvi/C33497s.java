package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.deep_linking.action_select_link.ActionSelectLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.profile_settings_extended.InterfaceC33507u;
import com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processPromoBlockItemAction$1", f = "ExtendedProfileSettingsActor.kt", i = {0, 1}, l = {346, 346, 352}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
/* renamed from: com.avito.android.profile_settings_extended.mvi.s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33497s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public InterfaceC43172j f230728q;

    /* renamed from: r, reason: collision with root package name */
    public int f230729r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f230730s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33480a f230731t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.promoblock.a f230732u;

    /* compiled from: ExtendedProfileSettingsActor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processPromoBlockItemAction$1$1$1$1", f = "ExtendedProfileSettingsActor.kt", i = {0}, l = {353, 366, 375, 368, 375, 375}, m = "invokeSuspend", n = {"$this$supervisorScope"}, s = {"L$0"})
    /* renamed from: com.avito.android.profile_settings_extended.mvi.s$a */
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f230733q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f230734r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43172j<ExtendedProfileSettingsInternalAction> f230735s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ PromoBlockItem f230736t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ DeepLink f230737u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C33480a f230738v;

        /* compiled from: ExtendedProfileSettingsActor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/deep_linking/action_select_link/ActionSelectLink;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/deep_linking/action_select_link/ActionSelectLink;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$processPromoBlockItemAction$1$1$1$1$deferred$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.profile_settings_extended.mvi.s$a$a, reason: collision with other inner class name */
        public static final class C7019a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super ActionSelectLink>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f230739q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ C33480a f230740r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C7019a(C33480a c33480a, Continuation<? super C7019a> continuation) {
                super(2, continuation);
                this.f230740r = c33480a;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C7019a(this.f230740r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super ActionSelectLink> continuation) {
                return ((C7019a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f230739q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC33507u interfaceC33507u = this.f230740r.f230500a;
                    this.f230739q = 1;
                    obj = interfaceC33507u.a(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, PromoBlockItem promoBlockItem, DeepLink deepLink, C33480a c33480a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f230735s = interfaceC43172j;
            this.f230736t = promoBlockItem;
            this.f230737u = deepLink;
            this.f230738v = c33480a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f230735s, this.f230736t, this.f230737u, this.f230738v, continuation);
            aVar.f230734r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0076 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x008f A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r11.f230733q
                com.avito.android.deep_linking.links.DeepLink r2 = r11.f230737u
                com.avito.android.profile_settings_extended.adapter.alert.PromoBlockItem r3 = r11.f230736t
                r4 = 0
                r5 = 0
                kotlinx.coroutines.flow.j<com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction> r6 = r11.f230735s
                switch(r1) {
                    case 0: goto L41;
                    case 1: goto L39;
                    case 2: goto L2f;
                    case 3: goto L2a;
                    case 4: goto L22;
                    case 5: goto L2a;
                    case 6: goto L19;
                    default: goto L11;
                }
            L11:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L19:
                java.lang.Object r0 = r11.f230734r
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                kotlin.C42729a0.b(r12)
                goto Lc5
            L22:
                kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L27
                goto La1
            L27:
                r12 = move-exception
                goto Lb3
            L2a:
                kotlin.C42729a0.b(r12)
                goto Lb0
            L2f:
                java.lang.Object r1 = r11.f230734r
                com.avito.android.profile_settings_extended.mvi.a r1 = (com.avito.android.profile_settings_extended.mvi.C33480a) r1
                kotlin.C42729a0.b(r12)     // Catch: java.lang.Throwable -> L37
                goto L7a
            L37:
                r12 = move-exception
                goto L90
            L39:
                java.lang.Object r1 = r11.f230734r
                kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                kotlin.C42729a0.b(r12)
                goto L5a
            L41:
                kotlin.C42729a0.b(r12)
                java.lang.Object r12 = r11.f230734r
                r1 = r12
                kotlinx.coroutines.T r1 = (kotlinx.coroutines.T) r1
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton r12 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton
                r7 = 1
                r12.<init>(r3, r2, r7)
                r11.f230734r = r1
                r11.f230733q = r7
                java.lang.Object r12 = r6.emit(r12, r11)
                if (r12 != r0) goto L5a
                return r0
            L5a:
                com.avito.android.profile_settings_extended.mvi.a r12 = r11.f230738v
                com.avito.android.util.R0 r7 = r12.f230513n
                kotlinx.coroutines.scheduling.b r7 = r7.a()
                com.avito.android.profile_settings_extended.mvi.s$a$a r8 = new com.avito.android.profile_settings_extended.mvi.s$a$a
                r8.<init>(r12, r5)
                r9 = 2
                kotlinx.coroutines.a0 r1 = kotlinx.coroutines.C43259k.b(r1, r7, r8, r9)
                r11.f230734r = r12     // Catch: java.lang.Throwable -> L37
                r11.f230733q = r9     // Catch: java.lang.Throwable -> L37
                java.lang.Object r1 = r1.F(r11)     // Catch: java.lang.Throwable -> L37
                if (r1 != r0) goto L77
                return r0
            L77:
                r10 = r1
                r1 = r12
                r12 = r10
            L7a:
                com.avito.android.deep_linking.links.DeepLink r12 = (com.avito.android.deep_linking.links.DeepLink) r12     // Catch: java.lang.Throwable -> L37
                r1.e(r5, r12, r5)     // Catch: java.lang.Throwable -> L37
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton r12 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton
                r12.<init>(r3, r2, r4)
                r11.f230734r = r5
                r1 = 3
                r11.f230733q = r1
                java.lang.Object r12 = r6.emit(r12, r11)
                if (r12 != r0) goto Lb0
                return r0
            L90:
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar r1 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SnackbarAndDialogInternalAction$ShowCommonErrorToastBar     // Catch: java.lang.Throwable -> L27
                r1.<init>(r12, r5)     // Catch: java.lang.Throwable -> L27
                r11.f230734r = r5     // Catch: java.lang.Throwable -> L27
                r12 = 4
                r11.f230733q = r12     // Catch: java.lang.Throwable -> L27
                java.lang.Object r12 = r6.emit(r1, r11)     // Catch: java.lang.Throwable -> L27
                if (r12 != r0) goto La1
                return r0
            La1:
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton r12 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton
                r12.<init>(r3, r2, r4)
                r1 = 5
                r11.f230733q = r1
                java.lang.Object r12 = r6.emit(r12, r11)
                if (r12 != r0) goto Lb0
                return r0
            Lb0:
                kotlin.G0 r12 = kotlin.G0.f406611a
                return r12
            Lb3:
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton r1 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$PromoBlockWidgetInternalAction$UpdatePromoBlockButton
                r1.<init>(r3, r2, r4)
                r11.f230734r = r12
                r2 = 6
                r11.f230733q = r2
                java.lang.Object r1 = r6.emit(r1, r11)
                if (r1 != r0) goto Lc4
                return r0
            Lc4:
                r0 = r12
            Lc5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.C33497s.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33497s(C33480a c33480a, com.avito.android.promoblock.a aVar, Continuation<? super C33497s> continuation) {
        super(2, continuation);
        this.f230731t = c33480a;
        this.f230732u = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33497s c33497s = new C33497s(this.f230731t, this.f230732u, continuation);
        c33497s.f230730s = obj;
        return c33497s;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33497s) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0107  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.mvi.C33497s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
