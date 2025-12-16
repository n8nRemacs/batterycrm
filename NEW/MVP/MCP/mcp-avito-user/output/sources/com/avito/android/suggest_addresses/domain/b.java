package com.avito.android.suggest_addresses.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.suggest_addresses.entity.SuggestAddressesParams;
import com.avito.android.suggest_addresses.model.ResolvedAddressResult;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import h31.e;
import java.util.ArrayList;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lA0.InterfaceC43610a;
import tF.AbstractC48544a;

/* compiled from: SuggestAddressesInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/b;", "Lcom/avito/android/suggest_addresses/domain/a;", "a", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.suggest_addresses.domain.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC43610a> f291874a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SuggestAddressesParams f291875b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f291876c;

    /* compiled from: SuggestAddressesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/suggest_addresses/domain/b$a;", "", "<init>", "()V", "", "HOUSE", "Ljava/lang/String;", "STREET", "_avito_suggest-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SuggestAddressesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "LtF/a$c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.suggest_addresses.domain.SuggestAddressesInteractorImpl$getSuggests$1", f = "SuggestAddressesInteractor.kt", i = {0}, l = {30, 36}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.suggest_addresses.domain.b$b, reason: collision with other inner class name */
    public static final class C8843b extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<AbstractC48544a.c>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291877q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291878r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f291880t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8843b(String str, Continuation<? super C8843b> continuation) {
            super(2, continuation);
            this.f291880t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C8843b c8843b = b.this.new C8843b(this.f291880t, continuation);
            c8843b.f291878r = obj;
            return c8843b;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<AbstractC48544a.c>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C8843b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object objF;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f291877q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f291878r;
                b bVar = b.this;
                InterfaceC43610a interfaceC43610a = bVar.f291874a.get();
                String str = bVar.f291875b.f291889b;
                A4 a42 = A4.f318516a;
                ArrayList arrayListJ = C42745f0.j("house", "street");
                a42.getClass();
                Map<String, String> mapH = A4.h(arrayListJ, "types");
                this.f291878r = interfaceC43172j;
                this.f291877q = 1;
                objF = interfaceC43610a.f(this.f291880t, null, null, null, null, null, str, mapH, this);
                if (objF == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                InterfaceC43172j interfaceC43172j2 = (InterfaceC43172j) this.f291878r;
                C42729a0.b(obj);
                interfaceC43172j = interfaceC43172j2;
                objF = obj;
            }
            this.f291878r = null;
            this.f291877q = 2;
            if (interfaceC43172j.emit((TypedResult) objF, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SuggestAddressesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/suggest_addresses/model/ResolvedAddressResult;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.suggest_addresses.domain.SuggestAddressesInteractorImpl$resolveAddress$1", f = "SuggestAddressesInteractor.kt", i = {0}, l = {44, 46}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class c extends SuspendLambda implements p<InterfaceC43172j<? super TypedResult<ResolvedAddressResult>>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f291881q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f291882r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f291883s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f291884t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ b f291885u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, b bVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f291883s = str;
            this.f291884t = str2;
            this.f291885u = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            c cVar = new c(this.f291883s, this.f291884t, this.f291885u, continuation);
            cVar.f291882r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super TypedResult<ResolvedAddressResult>> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f291881q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f291882r;
                String str = this.f291883s + ", " + this.f291884t;
                InterfaceC43610a interfaceC43610a = this.f291885u.f291874a.get();
                this.f291882r = interfaceC43172j;
                this.f291881q = 1;
                obj = interfaceC43610a.a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f291882r;
                C42729a0.b(obj);
            }
            this.f291882r = null;
            this.f291881q = 2;
            if (interfaceC43172j.emit((TypedResult) obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public b(@k e<InterfaceC43610a> eVar, @k SuggestAddressesParams suggestAddressesParams, @k R0 r02) {
        this.f291874a = eVar;
        this.f291875b = suggestAddressesParams;
        this.f291876c = r02;
    }

    @Override // com.avito.android.suggest_addresses.domain.a
    @k
    public final InterfaceC43160i<TypedResult<AbstractC48544a.c>> a(@k String str) {
        return C43175k.I(this.f291876c.a(), C43175k.G(new C8843b(str, null)));
    }

    @Override // com.avito.android.suggest_addresses.domain.a
    @k
    public final InterfaceC43160i<TypedResult<ResolvedAddressResult>> b(@k String str, @k String str2) {
        return C43175k.I(this.f291876c.a(), C43175k.G(new c(str, str2, this, null)));
    }
}
