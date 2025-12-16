package com.avito.android.user_address.suggest.mvi;

import com.avito.android.user_address.suggest.mvi.UserAddressSuggestMviInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserAddressSuggestBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_address/suggest/mvi/a;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "_avito_user-address_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements com.avito.android.arch.mvi.b<UserAddressSuggestMviInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f308091a;

    /* compiled from: UserAddressSuggestBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/user_address/suggest/mvi/UserAddressSuggestMviInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_address.suggest.mvi.UserAddressSuggestBootstrap$produce$1", f = "UserAddressSuggestBootstrap.kt", i = {}, l = {15}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.user_address.suggest.mvi.a$a, reason: collision with other inner class name */
    public static final class C9459a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserAddressSuggestMviInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f308092q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f308093r;

        public C9459a(Continuation<? super C9459a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C9459a c9459a = a.this.new C9459a(continuation);
            c9459a.f308093r = obj;
            return c9459a;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UserAddressSuggestMviInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C9459a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f308092q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f308093r;
                UserAddressSuggestMviInternalAction.SetAddress setAddress = new UserAddressSuggestMviInternalAction.SetAddress(a.this.f308091a);
                this.f308092q = 1;
                if (interfaceC43172j.emit(setAddress, this) == coroutine_suspended) {
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
    public a(@com.avito.android.user_address.suggest.di.b @Y61.k String str) {
        this.f308091a = str;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<UserAddressSuggestMviInternalAction> a() {
        return C43175k.G(new C9459a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
