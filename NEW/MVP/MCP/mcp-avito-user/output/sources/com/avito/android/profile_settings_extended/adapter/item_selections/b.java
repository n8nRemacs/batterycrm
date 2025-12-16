package com.avito.android.profile_settings_extended.adapter.item_selections;

import Y41.p;
import Y41.q;
import androidx.compose.runtime.internal.P;
import com.avito.android.profile_settings_extended.adapter.item_selections.adapter.selection.SelectionItem;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
import com.avito.android.remote.D0;
import com.avito.android.util.R0;
import com.google.gson.Gson;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSettingsItemSelectionsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_extended/adapter/item_selections/b;", "Lcom/avito/android/profile_settings_extended/adapter/item_selections/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class b implements com.avito.android.profile_settings_extended.adapter.item_selections.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<D0> f229598a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Gson f229599b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f229600c;

    /* compiled from: ExtendedProfileSettingsItemSelectionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.adapter.item_selections.ExtendedProfileSettingsItemSelectionsInteractorImpl$changeSelectionPublic$1", f = "ExtendedProfileSettingsItemSelectionsInteractor.kt", i = {0, 1, 1}, l = {37, 42, 44}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "newSelection"}, s = {"L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SelectionItem f229601q;

        /* renamed from: r, reason: collision with root package name */
        public int f229602r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f229603s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ SelectionItem f229604t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f229605u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SelectionItem selectionItem, b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f229604t = selectionItem;
            this.f229605u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f229604t, this.f229605u, continuation);
            aVar.f229603s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0115  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r30) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 302
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.adapter.item_selections.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSettingsItemSelectionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.adapter.item_selections.ExtendedProfileSettingsItemSelectionsInteractorImpl$changeSelectionPublic$2", f = "ExtendedProfileSettingsItemSelectionsInteractor.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_settings_extended.adapter.item_selections.b$b, reason: collision with other inner class name */
    public static final class C6987b extends SuspendLambda implements q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229606q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f229607r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f229608s;

        public C6987b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C6987b c6987b = new C6987b(3, continuation);
            c6987b.f229607r = interfaceC43172j;
            c6987b.f229608s = th2;
            return c6987b.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229606q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f229607r;
                ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicFail setSelectionPublicFail = new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SetSelectionPublicFail(this.f229608s);
                this.f229607r = null;
                this.f229606q = 1;
                if (interfaceC43172j.emit(setSelectionPublicFail, this) == coroutine_suspended) {
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

    /* compiled from: ExtendedProfileSettingsItemSelectionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.adapter.item_selections.ExtendedProfileSettingsItemSelectionsInteractorImpl$removeSelection$1", f = "ExtendedProfileSettingsItemSelectionsInteractor.kt", i = {0, 1}, l = {58, 61, 63}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229609q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f229610r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f229612t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f229613u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f229612t = str;
            this.f229613u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f229612t, this.f229613u, continuation);
            cVar.f229610r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r19) throws com.avito.android.util.ApiException {
            /*
                r18 = this;
                r0 = r18
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f229609q
                r3 = 0
                java.lang.String r4 = r0.f229613u
                r5 = 3
                r6 = 2
                r7 = 1
                if (r2 == 0) goto L35
                if (r2 == r7) goto L2d
                if (r2 == r6) goto L23
                if (r2 != r5) goto L1b
                kotlin.C42729a0.b(r19)
                goto La5
            L1b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L23:
                java.lang.Object r2 = r0.f229610r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r19)
                r6 = r19
                goto L85
            L2d:
                java.lang.Object r2 = r0.f229610r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r19)
                goto L49
            L35:
                kotlin.C42729a0.b(r19)
                java.lang.Object r2 = r0.f229610r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveLoading r8 = com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveLoading.f230630b
                r0.f229610r = r2
                r0.f229609q = r7
                java.lang.Object r7 = r2.emit(r8, r0)
                if (r7 != r1) goto L49
                return r1
            L49:
                com.avito.android.profile_settings_extended.adapter.item_selections.b r7 = com.avito.android.profile_settings_extended.adapter.item_selections.b.this
                com.google.gson.Gson r8 = r7.f229599b
                com.avito.android.remote.model.extended.modification.SelectionModification$OperationType r9 = com.avito.android.remote.model.extended.modification.SelectionModification.OperationType.REMOVE
                com.avito.android.remote.model.extended.modification.SelectionModification$Operation r10 = new com.avito.android.remote.model.extended.modification.SelectionModification$Operation
                r10.<init>(r9, r4, r3)
                com.avito.android.remote.model.extended.modification.ModificationBody r9 = new com.avito.android.remote.model.extended.modification.ModificationBody
                com.avito.android.remote.model.extended.modification.SelectionModification r17 = new com.avito.android.remote.model.extended.modification.SelectionModification
                java.util.List r13 = java.util.Collections.singletonList(r10)
                java.lang.String r12 = r0.f229612t
                r16 = 0
                r14 = 0
                r15 = 4
                r11 = r17
                r11.<init>(r12, r13, r14, r15, r16)
                java.util.List r10 = java.util.Collections.singletonList(r17)
                r9.<init>(r10)
                java.lang.String r8 = r8.l(r9)
                h31.e<com.avito.android.remote.D0> r7 = r7.f229598a
                java.lang.Object r7 = r7.get()
                com.avito.android.remote.D0 r7 = (com.avito.android.remote.D0) r7
                r0.f229610r = r2
                r0.f229609q = r6
                java.lang.Object r6 = r7.e(r8, r0)
                if (r6 != r1) goto L85
                return r1
            L85:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r7 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r7 == 0) goto La8
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                com.avito.android.remote.model.extended.modification.ModificationResult r6 = (com.avito.android.remote.model.extended.modification.ModificationResult) r6
                com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveSuccess r6 = new com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction$SelectionRemoveSuccess
                java.lang.String r7 = r0.f229612t
                r6.<init>(r7, r4)
                r0.f229610r = r3
                r0.f229609q = r5
                java.lang.Object r2 = r2.emit(r6, r0)
                if (r2 != r1) goto La5
                return r1
            La5:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            La8:
                boolean r1 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r1 == 0) goto Lbb
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r1 = r6.getError()
                java.lang.Throwable r2 = r6.getCause()
                com.avito.android.util.ApiException r1 = com.avito.android.util.C35936s.a(r1, r2)
                throw r1
            Lbb:
                kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
                r1.<init>()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_settings_extended.adapter.item_selections.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileSettingsItemSelectionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction$SelectionsWidgetInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.adapter.item_selections.ExtendedProfileSettingsItemSelectionsInteractorImpl$removeSelection$2", f = "ExtendedProfileSettingsItemSelectionsInteractor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f229614q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f229615r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f229616s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f229615r = interfaceC43172j;
            dVar.f229616s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f229614q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f229615r;
                ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveFail selectionRemoveFail = new ExtendedProfileSettingsInternalAction.SelectionsWidgetInternalAction.SelectionRemoveFail(this.f229616s);
                this.f229615r = null;
                this.f229614q = 1;
                if (interfaceC43172j.emit(selectionRemoveFail, this) == coroutine_suspended) {
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

    @Inject
    public b(@Y61.k h31.e<D0> eVar, @Y61.k Gson gson, @Y61.k R0 r02) {
        this.f229598a = eVar;
        this.f229599b = gson;
        this.f229600c = r02;
    }

    @Override // com.avito.android.profile_settings_extended.adapter.item_selections.a
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> a(@Y61.k SelectionItem selectionItem) {
        return C43175k.I(this.f229600c.a(), new C43152f0(C43175k.G(new a(selectionItem, this, null)), new C6987b(3, null)));
    }

    @Override // com.avito.android.profile_settings_extended.adapter.item_selections.a
    @Y61.k
    public final InterfaceC43160i<ExtendedProfileSettingsInternalAction> b(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f229600c.a(), new C43152f0(C43175k.G(new c(str, str2, null)), new d(3, null)));
    }
}
