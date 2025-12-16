package com.avito.android.profile_vk_linking.group_management;

import Mc0.InterfaceC14468a;
import Pc0.d;
import Vc0.b;
import com.avito.android.deep_linking.x;
import com.avito.android.error.z;
import com.avito.android.util.R0;
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

/* compiled from: VkLinkingGroupManagementInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_vk_linking/group_management/c;", "Lcom/avito/android/profile_vk_linking/group_management/b;", "_avito_profile-vk-linking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class c implements com.avito.android.profile_vk_linking.group_management.b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC14468a f231119a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.group_management.mvi.c f231120b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.profile_vk_linking.group_management.mvi.a f231121c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final x f231122d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f231123e;

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$linkGroup$1", f = "VkLinkingGroupManagementInteractor.kt", i = {0, 1, 2, 2}, l = {74, 76, 82, 83, 91, 99}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$2"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Vc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public c f231124q;

        /* renamed from: r, reason: collision with root package name */
        public d.c f231125r;

        /* renamed from: s, reason: collision with root package name */
        public int f231126s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f231127t;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f231129v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f231130w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f231129v = str;
            this.f231130w = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = c.this.new a(this.f231129v, this.f231130w, continuation);
            aVar.f231127t = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:113:0x024b  */
        /* JADX WARN: Removed duplicated region for block: B:114:0x0252  */
        /* JADX WARN: Removed duplicated region for block: B:117:0x0278 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:133:0x02d2  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0064 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:18:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x0171  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r24) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 766
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.group_management.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$linkGroup$2", f = "VkLinkingGroupManagementInteractor.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Vc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231131q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231132r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231133s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f231132r = interfaceC43172j;
            bVar.f231133s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231131q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231132r;
                b.d dVar = new b.d(z.l(this.f231133s));
                this.f231132r = null;
                this.f231131q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$loadGroups$1", f = "VkLinkingGroupManagementInteractor.kt", i = {0, 1}, l = {43, 45, 49}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.profile_vk_linking.group_management.c$c, reason: collision with other inner class name */
    public static final class C7034c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Vc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231134q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231135r;

        public C7034c(Continuation<? super C7034c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C7034c c7034c = c.this.new C7034c(continuation);
            c7034c.f231135r = obj;
            return c7034c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C7034c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) throws com.avito.android.util.ApiException {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f231134q
                com.avito.android.profile_vk_linking.group_management.c r2 = com.avito.android.profile_vk_linking.group_management.c.this
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L30
                if (r1 == r5) goto L28
                if (r1 == r4) goto L20
                if (r1 != r3) goto L18
                kotlin.C42729a0.b(r11)
                goto Lcb
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                java.lang.Object r1 = r10.f231135r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L52
            L28:
                java.lang.Object r1 = r10.f231135r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L45
            L30:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f231135r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                Vc0.b$g r1 = Vc0.b.g.f17297a
                r10.f231135r = r11
                r10.f231134q = r5
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L44
                return r0
            L44:
                r1 = r11
            L45:
                Mc0.a r11 = r2.f231119a
                r10.f231135r = r1
                r10.f231134q = r4
                java.lang.Object r11 = r11.f(r10)
                if (r11 != r0) goto L52
                return r0
            L52:
                com.avito.android.remote.model.TypedResult r11 = (com.avito.android.remote.model.TypedResult) r11
                boolean r6 = r11 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r6 == 0) goto Ld4
                com.avito.android.remote.model.TypedResult$Success r11 = (com.avito.android.remote.model.TypedResult.Success) r11
                java.lang.Object r11 = r11.getResult()
                Oc0.e r11 = (Oc0.e) r11
                r2.getClass()
                Oc0.j r6 = r11.getWithGroups()
                r7 = 0
                com.avito.android.deep_linking.x r8 = r2.f231122d
                com.avito.android.profile_vk_linking.group_management.mvi.a r2 = r2.f231121c
                if (r6 == 0) goto L89
                Vc0.b$o r5 = new Vc0.b$o
                Oc0.j r6 = r11.getWithGroups()
                Oc0.g r6 = r6.getPopup()
                Oc0.j r11 = r11.getWithGroups()
                java.util.List r11 = r11.a()
                r9 = 4
                Wc0.a$b r11 = com.avito.android.profile_vk_linking.group_management.mvi.a.b(r2, r6, r11, r8, r9)
                r5.<init>(r11, r7, r4, r7)
                goto Lc0
            L89:
                Oc0.a r4 = r11.getWithoutGroups()
                if (r4 == 0) goto Lce
                Oc0.a r4 = r11.getWithoutGroups()
                java.util.List r4 = r4.a()
                java.lang.Object r4 = kotlin.collections.C42745f0.E(r4)
                Oc0.g r4 = (Oc0.g) r4
                r6 = 6
                Wc0.a$b r4 = com.avito.android.profile_vk_linking.group_management.mvi.a.b(r2, r4, r7, r8, r6)
                Oc0.a r11 = r11.getWithoutGroups()
                java.util.List r11 = r11.a()
                java.lang.Object r11 = kotlin.collections.C42745f0.K(r5, r11)
                Oc0.g r11 = (Oc0.g) r11
                if (r11 == 0) goto Lba
                r2.getClass()
                com.avito.android.profile_vk_linking.common.mvi.entity.VkPopup r11 = com.avito.android.profile_vk_linking.group_management.mvi.a.a(r11, r8)
                goto Lbb
            Lba:
                r11 = r7
            Lbb:
                Vc0.b$o r5 = new Vc0.b$o
                r5.<init>(r4, r11)
            Lc0:
                r10.f231135r = r7
                r10.f231134q = r3
                java.lang.Object r11 = r1.emit(r5, r10)
                if (r11 != r0) goto Lcb
                return r0
            Lcb:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            Lce:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                r11.<init>()
                throw r11
            Ld4:
                boolean r0 = r11 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto Le7
                com.avito.android.remote.model.TypedResult$Error r11 = (com.avito.android.remote.model.TypedResult.Error) r11
                com.avito.android.remote.error.ApiError r0 = r11.getError()
                java.lang.Throwable r11 = r11.getCause()
                com.avito.android.util.ApiException r11 = com.avito.android.util.C35936s.a(r0, r11)
                throw r11
            Le7:
                kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.group_management.c.C7034c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$loadGroups$2", f = "VkLinkingGroupManagementInteractor.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Vc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231137q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231138r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231139s;

        public d() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            d dVar = new d(3, continuation);
            dVar.f231138r = interfaceC43172j;
            dVar.f231139s = th2;
            return dVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231137q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231138r;
                b.h hVar = new b.h(z.l(this.f231139s));
                this.f231138r = null;
                this.f231137q = 1;
                if (interfaceC43172j.emit(hVar, this) == coroutine_suspended) {
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

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$sendVkTokens$1", f = "VkLinkingGroupManagementInteractor.kt", i = {0, 1}, l = {116, 118, 123, 125, 133}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Vc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231140q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231141r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f231143t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f231144u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f231143t = str;
            this.f231144u = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = c.this.new e(this.f231143t, this.f231144u, continuation);
            eVar.f231141r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) throws com.avito.android.util.ApiException {
            /*
                Method dump skipped, instructions count: 240
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.group_management.c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$sendVkTokens$2", f = "VkLinkingGroupManagementInteractor.kt", i = {}, l = {146}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Vc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231145q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231146r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231147s;

        public f() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            f fVar = new f(3, continuation);
            fVar.f231146r = interfaceC43172j;
            fVar.f231147s = th2;
            return fVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231145q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231146r;
                b.j jVar = new b.j(z.l(this.f231147s));
                this.f231146r = null;
                this.f231145q = 1;
                if (interfaceC43172j.emit(jVar, this) == coroutine_suspended) {
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

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$startLinkingGroup$1", f = "VkLinkingGroupManagementInteractor.kt", i = {0, 1}, l = {55, 57, 59}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Vc0.b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231148q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f231149r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f231151t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(long j12, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f231151t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = c.this.new g(this.f231151t, continuation);
            gVar.f231149r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0059  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) throws com.avito.android.util.ApiException {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r5.f231148q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r6)
                goto L78
            L15:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1d:
                java.lang.Object r1 = r5.f231149r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L53
            L25:
                java.lang.Object r1 = r5.f231149r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r6)
                goto L42
            L2d:
                kotlin.C42729a0.b(r6)
                java.lang.Object r6 = r5.f231149r
                kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                Vc0.b$f r1 = Vc0.b.f.f17296a
                r5.f231149r = r6
                r5.f231148q = r4
                java.lang.Object r1 = r6.emit(r1, r5)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r6
            L42:
                com.avito.android.profile_vk_linking.group_management.c r6 = com.avito.android.profile_vk_linking.group_management.c.this
                Mc0.a r6 = r6.f231119a
                r5.f231149r = r1
                r5.f231148q = r3
                long r3 = r5.f231151t
                java.lang.Object r6 = r6.b(r3, r5)
                if (r6 != r0) goto L53
                return r0
            L53:
                com.avito.android.remote.model.TypedResult r6 = (com.avito.android.remote.model.TypedResult) r6
                boolean r3 = r6 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r3 == 0) goto L7b
                com.avito.android.remote.model.TypedResult$Success r6 = (com.avito.android.remote.model.TypedResult.Success) r6
                java.lang.Object r6 = r6.getResult()
                Tc0.a r6 = (Tc0.C15351a) r6
                Vc0.b$b r3 = new Vc0.b$b
                com.avito.android.deep_linking.links.DeepLink r6 = r6.getDeeplink()
                java.lang.String r4 = "vk_group_management_link_req_key"
                r3.<init>(r6, r4)
                r6 = 0
                r5.f231149r = r6
                r5.f231148q = r2
                java.lang.Object r6 = r1.emit(r3, r5)
                if (r6 != r0) goto L78
                return r0
            L78:
                kotlin.G0 r6 = kotlin.G0.f406611a
                return r6
            L7b:
                boolean r0 = r6 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r0 == 0) goto L8e
                com.avito.android.remote.model.TypedResult$Error r6 = (com.avito.android.remote.model.TypedResult.Error) r6
                com.avito.android.remote.error.ApiError r0 = r6.getError()
                java.lang.Throwable r6 = r6.getCause()
                com.avito.android.util.ApiException r6 = com.avito.android.util.C35936s.a(r0, r6)
                throw r6
            L8e:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile_vk_linking.group_management.c.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: VkLinkingGroupManagementInteractor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LVc0/b;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementInteractorImpl$startLinkingGroup$2", f = "VkLinkingGroupManagementInteractor.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super Vc0.b>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f231152q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f231153r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f231154s;

        public h() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super Vc0.b> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            h hVar = new h(3, continuation);
            hVar.f231153r = interfaceC43172j;
            hVar.f231154s = th2;
            return hVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f231152q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f231153r;
                b.d dVar = new b.d(z.l(this.f231154s));
                this.f231153r = null;
                this.f231152q = 1;
                if (interfaceC43172j.emit(dVar, this) == coroutine_suspended) {
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
    public c(@Y61.k InterfaceC14468a interfaceC14468a, @Y61.k com.avito.android.profile_vk_linking.group_management.mvi.c cVar, @Y61.k com.avito.android.profile_vk_linking.group_management.mvi.a aVar, @Y61.k x xVar, @Y61.k R0 r02) {
        this.f231119a = interfaceC14468a;
        this.f231120b = cVar;
        this.f231121c = aVar;
        this.f231122d = xVar;
        this.f231123e = r02;
    }

    @Override // com.avito.android.profile_vk_linking.group_management.b
    @Y61.k
    public final InterfaceC43160i<Vc0.b> b(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f231123e.a(), new C43152f0(C43175k.G(new e(str, str2, null)), new f(3, null)));
    }

    @Override // com.avito.android.profile_vk_linking.group_management.b
    @Y61.k
    public final InterfaceC43160i<Vc0.b> c(long j12) {
        return C43175k.I(this.f231123e.a(), new C43152f0(C43175k.G(new g(j12, null)), new h(3, null)));
    }

    @Override // com.avito.android.profile_vk_linking.group_management.b
    @Y61.k
    public final InterfaceC43160i<Vc0.b> d(@Y61.k String str, @Y61.k String str2) {
        return C43175k.I(this.f231123e.a(), new C43152f0(C43175k.G(new a(str, str2, null)), new b(3, null)));
    }

    @Override // com.avito.android.profile_vk_linking.group_management.b
    @Y61.k
    public final InterfaceC43160i<Vc0.b> e() {
        return C43175k.I(this.f231123e.a(), new C43152f0(C43175k.G(new C7034c(null)), new d(3, null)));
    }
}
