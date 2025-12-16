package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.remote.model.user_profile.UserProfileResult;
import com.avito.android.remote.model.user_profile.items.InfoItem;
import com.avito.android.remote.model.user_profile.items.UserProfileItem;
import com.avito.android.remote.model.user_profile.items.WalletItem;
import java.util.Iterator;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43176k0;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$loadData$1", f = "UserProfileActor.kt", i = {0}, l = {460, 461, 488}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class I extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226224q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226225r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C33388a f226226s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f226227t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f226228u;

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "it", "Lkotlinx/coroutines/flow/i;", "<anonymous>", "(Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$loadData$1$1", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<UserProfileInternalAction, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f226229q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33388a f226230r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C33388a c33388a, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f226230r = c33388a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226230r, continuation);
            aVar.f226229q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(UserProfileInternalAction userProfileInternalAction, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>> continuation) {
            return ((a) create(userProfileInternalAction, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            UserProfileItem userProfileItem;
            Object next;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            UserProfileInternalAction userProfileInternalAction = (UserProfileInternalAction) this.f226229q;
            if (!(userProfileInternalAction instanceof UserProfileInternalAction.DataLoaded)) {
                return new C43210w(userProfileInternalAction);
            }
            UserProfileInternalAction.DataLoaded dataLoaded = (UserProfileInternalAction.DataLoaded) userProfileInternalAction;
            UserProfileResult.UxFeedback uxFeedback = dataLoaded.f226421c.getUxFeedback();
            Boolean boolIsAvitoProControlGroup = uxFeedback != null ? uxFeedback.isAvitoProControlGroup() : null;
            C33388a c33388a = this.f226230r;
            c33388a.getClass();
            if (kotlin.jvm.internal.L.f(boolIsAvitoProControlGroup, Boolean.TRUE)) {
                c33388a.f226295o.b();
            }
            UserProfileResult userProfileResult = dataLoaded.f226421c;
            List<UserProfileItem> items = userProfileResult.getItems();
            if (items != null) {
                Iterator<T> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((UserProfileItem) next) instanceof WalletItem) {
                        break;
                    }
                }
                userProfileItem = (UserProfileItem) next;
            } else {
                userProfileItem = null;
            }
            WalletItem walletItem = userProfileItem instanceof WalletItem ? (WalletItem) userProfileItem : null;
            String updateUri = walletItem != null ? walletItem.getUpdateUri() : null;
            if (updateUri != null && updateUri.length() != 0) {
                c33388a.f226299s.C2(updateUri);
            }
            C43210w c43210w = new C43210w(userProfileInternalAction);
            InterfaceC43160i interfaceC43160iG = C43175k.G(new T(c33388a, null));
            InfoItem info = userProfileResult.getInfo();
            return C43175k.N(c43210w, interfaceC43160iG, info != null ? C43175k.G(new O(c33388a, info, null)) : C43175k.w(), new C43152f0(C43175k.G(new Q(c33388a, null)), new S(3, null)), new C43152f0(new U(kotlinx.coroutines.rx3.y.a(c33388a.f226283c.getCount())), new V(3, null)), C43175k.I(c33388a.f226297q.a(), new C43176k0(C43175k.G(new W(c33388a, userProfileResult, null)), new X(4, null))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(C33388a c33388a, boolean z12, boolean z13, Continuation<? super I> continuation) {
        super(2, continuation);
        this.f226226s = c33388a;
        this.f226227t = z12;
        this.f226228u = z13;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        I i12 = new I(this.f226226s, this.f226227t, this.f226228u, continuation);
        i12.f226225r = obj;
        return i12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((I) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        InterfaceC43172j interfaceC43172j;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226224q;
        C33388a c33388a = this.f226226s;
        if (i12 == 0) {
            C42729a0.b(obj);
            interfaceC43172j = (InterfaceC43172j) this.f226225r;
            io.reactivex.rxjava3.internal.operators.observable.T tO2 = c33388a.f226291k.o();
            this.f226225r = interfaceC43172j;
            this.f226224q = 1;
            obj = C43292o.b(tO2, this);
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
            interfaceC43172j = (InterfaceC43172j) this.f226225r;
            C42729a0.b(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean z12 = this.f226227t;
        boolean z13 = this.f226228u;
        if (zBooleanValue) {
            InterfaceC43160i interfaceC43160iC = C43175k.C(new a(c33388a, null), z12 ? com.avito.android.preloading.coroutines.s.a(c33388a.f226301u, new com.avito.android.profile.user_profile.preloading.e(z13)) : c33388a.f226282b.o(z13));
            this.f226225r = null;
            this.f226224q = 2;
            if (C43175k.u(this, interfaceC43160iC, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            InterfaceC43160i interfaceC43160iA = z12 ? com.avito.android.preloading.coroutines.s.a(c33388a.f226301u, new com.avito.android.profile.user_profile.preloading.e(z13)) : new C43210w(UserProfileInternalAction.AuthorizationError.f226415b);
            this.f226225r = null;
            this.f226224q = 3;
            if (C43175k.u(this, interfaceC43160iA, interfaceC43172j) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return G0.f406611a;
    }
}
