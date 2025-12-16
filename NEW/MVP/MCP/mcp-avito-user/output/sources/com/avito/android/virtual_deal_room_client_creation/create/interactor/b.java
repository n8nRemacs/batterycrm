package com.avito.android.virtual_deal_room_client_creation.create.interactor;

import VN0.d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.P;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room_client_creation.create.mvi.entity.CreateInternalAction;
import h31.e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CreateInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/create/interactor/b;", "Lcom/avito/android/virtual_deal_room_client_creation/create/interactor/a;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.virtual_deal_room_client_creation.create.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<UN0.a> f326789a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f326790b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a f326791c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ON0.a f326792d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final R0 f326793e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public N0 f326794f;

    /* compiled from: CreateInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.create.interactor.CreateInteractorImpl$createClient$1", f = "CreateInteractor.kt", i = {0, 2, 3, 3, 4, 4}, l = {62, 65, 68, 72, 73, 78, 91}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "it", "$this$flow", "it"}, s = {"L$0", "L$0", "L$0", "L$6", "L$0", "L$6"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super CreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ String f326795A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ String f326796B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ String f326797C;

        /* renamed from: q, reason: collision with root package name */
        public b f326798q;

        /* renamed from: r, reason: collision with root package name */
        public String f326799r;

        /* renamed from: s, reason: collision with root package name */
        public String f326800s;

        /* renamed from: t, reason: collision with root package name */
        public String f326801t;

        /* renamed from: u, reason: collision with root package name */
        public String f326802u;

        /* renamed from: v, reason: collision with root package name */
        public d f326803v;

        /* renamed from: w, reason: collision with root package name */
        public int f326804w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f326805x;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f326807z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3, String str4, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326807z = str;
            this.f326795A = str2;
            this.f326796B = str3;
            this.f326797C = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = b.this.new a(this.f326807z, this.f326795A, this.f326796B, this.f326797C, continuation);
            aVar.f326805x = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CreateInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00c1  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0117 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x016c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 432
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_client_creation.create.interactor.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: CreateInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/virtual_deal_room_client_creation/create/mvi/entity/CreateInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.create.interactor.CreateInteractorImpl$loadSuggestions$1", f = "CreateInteractor.kt", i = {0}, l = {99}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.interactor.b$b, reason: collision with other inner class name */
    public static final class C10112b extends SuspendLambda implements p<I0<? super CreateInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326808q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326809r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f326811t;

        /* compiled from: CreateInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.create.interactor.CreateInteractorImpl$loadSuggestions$1$1", f = "CreateInteractor.kt", i = {}, l = {102, 110, 128}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.create.interactor.b$b$a */
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f326812q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f326813r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f326814s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I0<CreateInternalAction> f326815t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, String str, I0<? super CreateInternalAction> i02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f326813r = bVar;
                this.f326814s = str;
                this.f326815t = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f326813r, this.f326814s, this.f326815t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f326812q;
                b bVar = this.f326813r;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    UN0.a aVar = bVar.f326789a.get();
                    XN0.d dVar = new XN0.d(new XN0.e(this.f326814s));
                    this.f326812q = 1;
                    obj = aVar.b(dVar, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                TypedResult typedResult = (TypedResult) obj;
                boolean z12 = typedResult instanceof TypedResult.Success;
                I0<CreateInternalAction> i02 = this.f326815t;
                if (z12) {
                    List<XN0.b> listA = ((XN0.c) ((TypedResult.Success) typedResult).getResult()).getResult().a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    for (XN0.b bVar2 : listA) {
                        String id2 = bVar2.getId();
                        XN0.a avatar = bVar2.getAvatar();
                        arrayList.add(new PN0.a(avatar != null ? new UniversalImage(avatar.getLightImage(), avatar.getDarkImage()) : null, id2, bVar2.getName(), bVar.f326790b.a(bVar2.getPhone())));
                    }
                    CreateInternalAction.SuggestedClients suggestedClients = new CreateInternalAction.SuggestedClients(arrayList);
                    this.f326812q = 2;
                    if (i02.send(suggestedClients, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(typedResult instanceof TypedResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TypedResult.Error error = (TypedResult.Error) typedResult;
                    CreateInternalAction.LoadingSuggestError loadingSuggestError = new CreateInternalAction.LoadingSuggestError(z.n(C35936s.a(error.getError(), error.getCause())));
                    this.f326812q = 3;
                    if (i02.send(loadingSuggestError, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10112b(String str, Continuation<? super C10112b> continuation) {
            super(2, continuation);
            this.f326811t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C10112b c10112b = b.this.new C10112b(this.f326811t, continuation);
            c10112b.f326809r = obj;
            return c10112b;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super CreateInternalAction> i02, Continuation<? super G0> continuation) {
            return ((C10112b) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            I0 i02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326808q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i03 = (I0) this.f326809r;
                CreateInternalAction.LoadingSuggestion loadingSuggestion = new CreateInternalAction.LoadingSuggestion();
                this.f326809r = i03;
                this.f326808q = 1;
                if (i03.send(loadingSuggestion, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02 = i03;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i02 = (I0) this.f326809r;
                C42729a0.b(obj);
            }
            b bVar = b.this;
            N0 n02 = bVar.f326794f;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            bVar.f326794f = C43259k.d(i02, bVar.f326793e.a(), null, new a(bVar, this.f326811t, i02, null), 2);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k e<UN0.a> eVar, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1, @k com.avito.android.virtual_deal_room_client_creation.create.mvi.validator.a aVar, @k ON0.a aVar2, @k R0 r02) {
        this.f326789a = eVar;
        this.f326790b = interfaceC35945t1;
        this.f326791c = aVar;
        this.f326792d = aVar2;
        this.f326793e = r02;
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.interactor.a
    public final void a() {
        N0 n02 = this.f326794f;
        if (n02 != null) {
            ((V0) n02).c(null);
        }
        this.f326794f = null;
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.interactor.a
    @k
    public final InterfaceC43160i<CreateInternalAction> b(@k String str) {
        return C43175k.h(new C10112b(str, null));
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.create.interactor.a
    @k
    @SuppressLint({"HardcodeStringDetector"})
    public final InterfaceC43160i<CreateInternalAction> c(@k String str, @k String str2, @l String str3, @k String str4) {
        return C43175k.I(this.f326793e.a(), C43175k.G(new a(str, str2, str4, str3, null)));
    }
}
