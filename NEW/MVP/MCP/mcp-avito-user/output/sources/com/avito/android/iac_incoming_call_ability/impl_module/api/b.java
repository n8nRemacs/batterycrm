package com.avito.android.iac_incoming_call_ability.impl_module.api;

import Y41.l;
import Y61.k;
import com.avito.android.remote.model.TypedResult;
import com.squareup.anvil.annotations.ContributesBinding;
import io.reactivex.rxjava3.core.I;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;

/* compiled from: IacIncomingCallAbilityApiImpl.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/iac_incoming_call_ability/impl_module/api/b;", "Lcom/avito/android/iac_incoming_call_ability/impl_module/api/a;", "_avito_iac-incoming-call-ability_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class b implements com.avito.android.iac_incoming_call_ability.impl_module.api.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h31.e<com.avito.android.iac_incoming_call_ability.impl_module.api.e> f168189a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.iac_api_utils.util_module.a f168190b;

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f168192m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f168193n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f168194o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, String str3) {
            super(0);
            this.f168192m = str;
            this.f168193n = str2;
            this.f168194o = str3;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f168189a.get().e(this.f168192m, this.f168193n, this.f168194o);
        }
    }

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/TypedResult;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.iac_incoming_call_ability.impl_module.api.IacIncomingCallAbilityApiImpl$deleteDevice$2", f = "IacIncomingCallAbilityApiImpl.kt", i = {}, l = {95}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_incoming_call_ability.impl_module.api.b$b, reason: collision with other inner class name */
    public static final class C4975b extends SuspendLambda implements l<Continuation<? super TypedResult<Object>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f168195q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f168197s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f168198t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4975b(String str, String str2, Continuation<? super C4975b> continuation) {
            super(1, continuation);
            this.f168197s = str;
            this.f168198t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new C4975b(this.f168197s, this.f168198t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<Object>> continuation) {
            return ((C4975b) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f168195q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_incoming_call_ability.impl_module.api.e eVar = b.this.f168189a.get();
                this.f168195q = 1;
                obj = eVar.f(this.f168197s, this.f168198t, this);
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

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Boolean f168200m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Boolean f168201n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f168202o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Boolean bool, Boolean bool2, String str) {
            super(0);
            this.f168200m = bool;
            this.f168201n = bool2;
            this.f168202o = str;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f168189a.get().g(this.f168200m, this.f168201n, this.f168202o);
        }
    }

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ boolean f168204m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z12) {
            super(0);
            this.f168204m = z12;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f168189a.get().b(this.f168204m);
        }
    }

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<I<TypedResult<Object>>> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ String f168206m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ String f168207n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f168208o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, String str3) {
            super(0);
            this.f168206m = str;
            this.f168207n = str2;
            this.f168208o = str3;
        }

        @Override // Y41.a
        public final I<TypedResult<Object>> invoke() {
            return b.this.f168189a.get().a(this.f168206m, this.f168207n, this.f168208o);
        }
    }

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/reactivex/rxjava3/core/I;", "Lcom/avito/android/remote/model/TypedResult;", "LDL/a;", "invoke", "()Lio/reactivex/rxjava3/core/I;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<I<TypedResult<DL.a>>> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final I<TypedResult<DL.a>> invoke() {
            return b.this.f168189a.get().c(null);
        }
    }

    /* compiled from: IacIncomingCallAbilityApiImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LDL/a;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_incoming_call_ability.impl_module.api.IacIncomingCallAbilityApiImpl$voipOptions3Suspend$2", f = "IacIncomingCallAbilityApiImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements l<Continuation<? super TypedResult<DL.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f168210q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Boolean f168212s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Boolean f168213t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Boolean bool, Boolean bool2, Continuation<? super g> continuation) {
            super(1, continuation);
            this.f168212s = bool;
            this.f168213t = bool2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@k Continuation<?> continuation) {
            return b.this.new g(this.f168212s, this.f168213t, continuation);
        }

        @Override // Y41.l
        public final Object invoke(Continuation<? super TypedResult<DL.a>> continuation) {
            return ((g) create(continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f168210q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.iac_incoming_call_ability.impl_module.api.e eVar = b.this.f168189a.get();
                this.f168210q = 1;
                obj = eVar.d(this.f168212s, this.f168213t, this);
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
    public b(@k h31.e<com.avito.android.iac_incoming_call_ability.impl_module.api.e> eVar, @k com.avito.android.iac_api_utils.util_module.a aVar) {
        this.f168189a = eVar;
        this.f168190b = aVar;
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<Object>> a(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        e eVar = new e(str, str2, str3);
        return this.f168190b.a("userAvailable", new String[0], eVar);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<Object>> b(boolean z12) {
        d dVar = new d(z12);
        return this.f168190b.a("userAvailable", new String[0], dVar);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<DL.a>> c(@Y61.l Boolean bool) {
        f fVar = new f();
        return this.f168190b.a("getOptions2", new String[0], fVar);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @Y61.l
    public final Object d(@Y61.l Boolean bool, @Y61.l Boolean bool2, @k Continuation<? super TypedResult<DL.a>> continuation) {
        return this.f168190b.c("getOptions3", new String[0], new g(bool, bool2, null), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<Object>> e(@k String str, @k String str2, @k String str3) {
        a aVar = new a(str, str2, str3);
        return this.f168190b.a("askForCall", new String[0], aVar);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @Y61.l
    public final Object f(@k String str, @Y61.l String str2, @k Continuation<? super TypedResult<Object>> continuation) {
        return this.f168190b.c("deleteDevice", new String[0], new C4975b(str, str2, null), (ContinuationImpl) continuation);
    }

    @Override // com.avito.android.iac_incoming_call_ability.impl_module.api.a
    @k
    public final I<TypedResult<Object>> g(@Y61.l Boolean bool, @Y61.l Boolean bool2, @Y61.l String str) {
        c cVar = new c(bool, bool2, str);
        return this.f168190b.a("deviceAvailable", new String[0], cVar);
    }
}
