package com.avito.android.code_check.pre_request.mvi;

import Y41.p;
import com.avito.android.code_check.pre_request.mvi.entity.PreRequestInternalAction;
import com.avito.android.code_check_public.model.Phone;
import com.avito.android.code_check_public.screen.g;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PreRequestBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/code_check/pre_request/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "_avito_code-check_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a implements com.avito.android.arch.mvi.b<PreRequestInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final g.a f119189a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.code_check.d f119190b;

    /* compiled from: PreRequestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/code_check/pre_request/mvi/entity/PreRequestInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.code_check.pre_request.mvi.PreRequestBootstrap$produce$2", f = "PreRequestBootstrap.kt", i = {}, l = {AvailableCode.ERROR_NO_ACTIVITY}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.code_check.pre_request.mvi.a$a, reason: collision with other inner class name */
    public static final class C3491a extends SuspendLambda implements p<InterfaceC43172j<? super PreRequestInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f119191q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f119192r;

        public C3491a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C3491a c3491a = new C3491a(2, continuation);
            c3491a.f119192r = obj;
            return c3491a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super PreRequestInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3491a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f119191q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f119192r;
                PreRequestInternalAction.Loading loading = new PreRequestInternalAction.Loading();
                this.f119191q = 1;
                if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
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
    public a(@Y61.k g.a aVar, @Y61.k com.avito.android.code_check.d dVar) {
        this.f119189a = aVar;
        this.f119190b = dVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<PreRequestInternalAction> a() {
        ArrayList arrayList;
        com.avito.android.code_check.d dVar = this.f119190b;
        String strA = dVar.G3().a();
        String strA2 = strA != null ? To.c.a(strA) : null;
        List<String> listA = dVar.R5().a();
        if (listA != null) {
            List<String> list = listA;
            arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Phone.a(To.c.a((String) it.next())));
            }
        } else {
            arrayList = null;
        }
        return new C43137a0(new C3491a(2, null), new C43152f0(new b(this.f119189a.b(strA2, arrayList), dVar), new c(3, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
