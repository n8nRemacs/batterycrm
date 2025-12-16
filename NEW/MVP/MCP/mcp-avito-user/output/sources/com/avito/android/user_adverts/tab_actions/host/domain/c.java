package com.avito.android.user_adverts.tab_actions.host.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import bm0.InterfaceC25677b;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import dm0.InterfaceC39755a;
import gm0.C40708a;
import hm0.InterfaceC40961a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
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
import kotlinx.coroutines.T;

/* compiled from: UserAdvertsActionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_actions/host/domain/c;", "Lcom/avito/android/user_adverts/tab_actions/host/domain/a;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.user_adverts.tab_actions.host.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC25677b> f314234a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final h31.e<InterfaceC39755a> f314235b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f314236c;

    /* compiled from: UserAdvertsActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsActionsInteractorImpl$delete$2", f = "UserAdvertsActionsInteractor.kt", i = {}, l = {59, 61}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<InterfaceC40961a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314237q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ boolean f314238r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f314239s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Set<String> f314240t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z12, c cVar, Set<String> set, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f314238r = z12;
            this.f314239s = cVar;
            this.f314240t = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f314238r, this.f314239s, this.f314240t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314237q;
            if (i12 != 0) {
                if (i12 == 1) {
                    C42729a0.b(obj);
                    return (TypedResult) obj;
                }
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return (TypedResult) obj;
            }
            C42729a0.b(obj);
            boolean z12 = this.f314238r;
            Set<String> set = this.f314240t;
            c cVar = this.f314239s;
            if (z12) {
                InterfaceC25677b interfaceC25677b = cVar.f314234a.get();
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(set, "draftIds");
                this.f314237q = 1;
                obj = interfaceC25677b.d(mapH, "profile", this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (TypedResult) obj;
            }
            InterfaceC25677b interfaceC25677b2 = cVar.f314234a.get();
            A4.f318516a.getClass();
            Map<String, String> mapH2 = A4.h(set, "itemIds");
            this.f314237q = 2;
            obj = interfaceC25677b2.c(mapH2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (TypedResult) obj;
        }
    }

    /* compiled from: UserAdvertsActionsInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsActionsInteractorImpl$prepareActivate$2", f = "UserAdvertsActionsInteractor.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super TypedResult<DeepLink>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314241q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set<String> f314243s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Set<String> set, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f314243s = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new b(this.f314243s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<DeepLink>> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314241q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC39755a interfaceC39755a = c.this.f314235b.get();
                Set<String> set = this.f314243s;
                ArrayList arrayList = new ArrayList(C42745f0.q(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    C31685o.q((String) it.next(), arrayList);
                }
                this.f314241q = 1;
                obj = interfaceC39755a.a(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            TypedResult typedResult = (TypedResult) obj;
            if (typedResult instanceof TypedResult.Success) {
                return new TypedResult.Success(((C40708a) ((TypedResult.Success) typedResult).getResult()).getUri());
            }
            if (typedResult instanceof TypedResult.Error) {
                return typedResult;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: UserAdvertsActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsActionsInteractorImpl$restore$2", f = "UserAdvertsActionsInteractor.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_adverts.tab_actions.host.domain.c$c, reason: collision with other inner class name */
    public static final class C9696c extends SuspendLambda implements p<T, Continuation<? super TypedResult<InterfaceC40961a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314244q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set<String> f314246s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9696c(Set<String> set, Continuation<? super C9696c> continuation) {
            super(2, continuation);
            this.f314246s = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new C9696c(this.f314246s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
            return ((C9696c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314244q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC25677b interfaceC25677b = c.this.f314234a.get();
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(this.f314246s, "itemIds");
                this.f314244q = 1;
                obj = interfaceC25677b.a(mapH, this);
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

    /* compiled from: UserAdvertsActionsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "Lhm0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.tab_actions.host.domain.UserAdvertsActionsInteractorImpl$stop$2", f = "UserAdvertsActionsInteractor.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super TypedResult<InterfaceC40961a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f314247q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Set<String> f314249s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Set<String> set, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f314249s = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new d(this.f314249s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f314247q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC25677b interfaceC25677b = c.this.f314234a.get();
                A4.f318516a.getClass();
                Map<String, String> mapH = A4.h(this.f314249s, "itemIds");
                this.f314247q = 1;
                obj = interfaceC25677b.e(mapH, null, this);
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

    @Inject
    public c(@k R0 r02, @k h31.e eVar, @k h31.e eVar2) {
        this.f314234a = eVar;
        this.f314235b = eVar2;
        this.f314236c = r02;
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    public final Object a(@k Set<String> set, @k Continuation<? super TypedResult<DeepLink>> continuation) {
        return C43259k.g(this.f314236c.a(), new b(set, null), continuation);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    public final Object b(@k Set<String> set, boolean z12, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
        return C43259k.g(this.f314236c.a(), new a(z12, this, set, null), continuation);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    public final Object c(@k Set<String> set, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
        return C43259k.g(this.f314236c.a(), new d(set, null), continuation);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    @SuppressLint({"HardcodeStringDetector"})
    public final TypedResult.Success d(@l DeepLink deepLink, @k Set set) {
        if (deepLink != null) {
            return new TypedResult.Success(new InterfaceC40961a.d(deepLink));
        }
        Set set2 = set;
        ArrayList arrayList = new ArrayList(C42745f0.q(set2, 10));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            C31685o.q((String) it.next(), arrayList);
        }
        return new TypedResult.Success(new InterfaceC40961a.C11277a("No deeplink was passed to copy", C42745f0.P0(arrayList)));
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    public final Object e(@k Set<String> set, @k Continuation<? super TypedResult<InterfaceC40961a>> continuation) {
        return C43259k.g(this.f314236c.a(), new C9696c(set, null), continuation);
    }

    @Override // com.avito.android.user_adverts.tab_actions.host.domain.a
    @l
    public final Object f(@k Set set, @l Map map, @k SuspendLambda suspendLambda) {
        return C43259k.g(this.f314236c.a(), new com.avito.android.user_adverts.tab_actions.host.domain.b(this, set, map, null), suspendLambda);
    }
}
