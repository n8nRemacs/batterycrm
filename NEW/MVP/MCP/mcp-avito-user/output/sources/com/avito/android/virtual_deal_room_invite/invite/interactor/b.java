package com.avito.android.virtual_deal_room_invite.invite.interactor;

import Y41.p;
import Y61.k;
import Y61.l;
import bO0.InterfaceC25538b;
import cO0.C27081e;
import cO0.CountDownTimerC27077a;
import cO0.InterfaceC27080d;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import gO0.InterfaceC40606a;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lO0.InterfaceC43664a;

/* compiled from: InviteInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/interactor/b;", "Lcom/avito/android/virtual_deal_room_invite/invite/interactor/a;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.virtual_deal_room_invite.invite.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC40606a f326998a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InvitationArguments f326999b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC43664a f327000c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final e f327001d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.connection_quality.connectivity.a f327002e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final R0 f327003f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<Category, InterfaceC25538b> f327004g;

    /* compiled from: InviteInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f327005a;

        static {
            int[] iArr = new int[GetInvitationApiV1Response.Status.values().length];
            try {
                iArr[GetInvitationApiV1Response.Status.Active.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GetInvitationApiV1Response.Status.Outdated.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GetInvitationApiV1Response.Status.Rejected.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GetInvitationApiV1Response.Status.Withdrawn.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f327005a = iArr;
        }
    }

    /* compiled from: InviteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl$acceptInvitation$1", f = "InviteInteractor.kt", i = {0, 1, 2, 3}, l = {110, 111, 115, 115, 117, 120}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0", "L$0"})
    /* renamed from: com.avito.android.virtual_deal_room_invite.invite.interactor.b$b, reason: collision with other inner class name */
    public static final class C10130b extends SuspendLambda implements p<InterfaceC43172j<? super InviteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC43172j f327006q;

        /* renamed from: r, reason: collision with root package name */
        public int f327007r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f327008s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Category f327010u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10130b(Category category, Continuation<? super C10130b> continuation) {
            super(2, continuation);
            this.f327010u = category;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C10130b c10130b = b.this.new C10130b(this.f327010u, continuation);
            c10130b.f327008s = obj;
            return c10130b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InviteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C10130b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x009d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b5  */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.j] */
        /* JADX WARN: Type inference failed for: r1v10 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r7) {
            /*
                Method dump skipped, instructions count: 248
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.interactor.b.C10130b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InviteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl$loadInvitation$1", f = "InviteInteractor.kt", i = {0, 2, 3, 3, 5, 6, 8}, l = {49, 51, 54, 57, 63, 68, 68, 70, 75, 80, 88}, m = "invokeSuspend", n = {"$this$channelFlow", "$this$channelFlow", "$this$channelFlow", "it", "$this$channelFlow", "$this$channelFlow", "it"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$1"})
    public static final class c extends SuspendLambda implements p<I0<? super InviteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public Object f327011q;

        /* renamed from: r, reason: collision with root package name */
        public GetInvitationApiV1Response f327012r;

        /* renamed from: s, reason: collision with root package name */
        public boolean f327013s;

        /* renamed from: t, reason: collision with root package name */
        public int f327014t;

        /* renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f327015u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ boolean f327017w;

        /* compiled from: InviteInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl$loadInvitation$1$1$1", f = "InviteInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ b f327018q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b bVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f327018q = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f327018q, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                CountDownTimerC27077a countDownTimerC27077a = this.f327018q.f327001d.f57849b;
                if (countDownTimerC27077a != null) {
                    countDownTimerC27077a.cancel();
                }
                return G0.f406611a;
            }
        }

        /* compiled from: InviteInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl$loadInvitation$1$1$2", f = "InviteInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.interactor.b$c$b, reason: collision with other inner class name */
        public static final class C10131b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public final /* synthetic */ b f327019q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ GetInvitationApiV1Response f327020r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10131b(b bVar, GetInvitationApiV1Response getInvitationApiV1Response, Continuation<? super C10131b> continuation) {
                super(2, continuation);
                this.f327019q = bVar;
                this.f327020r = getInvitationApiV1Response;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C10131b(this.f327019q, this.f327020r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10131b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                b bVar = this.f327019q;
                InterfaceC27080d.b bVarA = InterfaceC27080d.b.a(((a.b) this.f327020r.getDetails()).getSecondsUntilExpires());
                e eVar = bVar.f327001d;
                CountDownTimerC27077a countDownTimerC27077a = eVar.f57849b;
                if (countDownTimerC27077a != null) {
                    countDownTimerC27077a.cancel();
                }
                CountDownTimerC27077a countDownTimerC27077a2 = new CountDownTimerC27077a(eVar, C27081e.a(bVarA), C27081e.a(eVar.f57848a));
                eVar.f57849b = countDownTimerC27077a2;
                countDownTimerC27077a2.start();
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z12, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f327017w = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = b.this.new c(this.f327017w, continuation);
            cVar.f327015u = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super InviteInternalAction> i02, Continuation<? super G0> continuation) {
            return ((c) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x012b A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0164  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x01b6 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:79:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x01bb  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x01ce  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x020a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x020b  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 628
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.interactor.b.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: InviteInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.interactor.InviteInteractorImpl$rejectInvitation$1", f = "InviteInteractor.kt", i = {0, 1, 1, 2, 2, 3, 3}, l = {94, 96, 100, 102, 105}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "isSuccess", "$this$flow", "isSuccess", "$this$flow", "isSuccess"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1"})
    public static final class d extends SuspendLambda implements p<InterfaceC43172j<? super InviteInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public l0.a f327021q;

        /* renamed from: r, reason: collision with root package name */
        public int f327022r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f327023s;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            d dVar = b.this.new d(continuation);
            dVar.f327023s = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InviteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r13) {
            /*
                Method dump skipped, instructions count: 224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.interactor.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public b(@k InterfaceC40606a interfaceC40606a, @k InvitationArguments invitationArguments, @k InterfaceC43664a interfaceC43664a, @k e eVar, @k com.avito.android.connection_quality.connectivity.a aVar, @k R0 r02, @k Map<Category, InterfaceC25538b> map) {
        this.f326998a = interfaceC40606a;
        this.f326999b = invitationArguments;
        this.f327000c = interfaceC43664a;
        this.f327001d = eVar;
        this.f327002e = aVar;
        this.f327003f = r02;
        this.f327004g = map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (r6 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.virtual_deal_room_invite.invite.interactor.b r4, com.avito.android.virtual_deal_room.deeplink.model.Category r5, kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_invite.invite.interactor.c
            if (r0 == 0) goto L16
            r0 = r6
            com.avito.android.virtual_deal_room_invite.invite.interactor.c r0 = (com.avito.android.virtual_deal_room_invite.invite.interactor.c) r0
            int r1 = r0.f327027s
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f327027s = r1
            goto L1b
        L16:
            com.avito.android.virtual_deal_room_invite.invite.interactor.c r0 = new com.avito.android.virtual_deal_room_invite.invite.interactor.c
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.f327025q
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f327027s
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r6)
            goto L4e
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            kotlin.C42729a0.b(r6)
            java.util.Map<com.avito.android.virtual_deal_room.deeplink.model.Category, bO0.b> r6 = r4.f327004g
            java.lang.Object r5 = r6.get(r5)
            bO0.b r5 = (bO0.InterfaceC25538b) r5
            if (r5 == 0) goto L52
            com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments r4 = r4.f326999b
            java.lang.String r4 = r4.f327042b
            r0.f327027s = r3
            java.lang.Object r6 = r5.c(r4, r0)
            if (r6 != r1) goto L4e
            goto L56
        L4e:
            com.avito.android.deep_linking.links.DeepLink r6 = (com.avito.android.deep_linking.links.DeepLink) r6
            r1 = r6
            goto L54
        L52:
            r4 = 0
            r1 = r4
        L54:
            if (r1 == 0) goto L57
        L56:
            return r1
        L57:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Required value was null."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.interactor.b.d(com.avito.android.virtual_deal_room_invite.invite.interactor.b, com.avito.android.virtual_deal_room.deeplink.model.Category, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.virtual_deal_room_invite.invite.interactor.a
    @k
    public final InterfaceC43160i<InviteInternalAction> a() {
        return C43175k.I(this.f327003f.a(), C43175k.G(new d(null)));
    }

    @Override // com.avito.android.virtual_deal_room_invite.invite.interactor.a
    @k
    public final InterfaceC43160i<InviteInternalAction> b(boolean z12) {
        return C43175k.I(this.f327003f.a(), C43175k.h(new c(z12, null)));
    }

    @Override // com.avito.android.virtual_deal_room_invite.invite.interactor.a
    @k
    public final InterfaceC43160i<InviteInternalAction> c(@k Category category) {
        return C43175k.I(this.f327003f.a(), C43175k.G(new C10130b(category, null)));
    }
}
