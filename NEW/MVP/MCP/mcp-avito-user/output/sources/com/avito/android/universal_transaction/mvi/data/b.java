package com.avito.android.universal_transaction.mvi.data;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import h31.e;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import zG0.InterfaceC50459a;

/* compiled from: TransactionRepositoryImpl.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/mvi/data/b;", "Lcom/avito/android/universal_transaction/mvi/data/a;", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements com.avito.android.universal_transaction.mvi.data.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC50459a> f306394a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final R0 f306395b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final RK0.a f306396c;

    /* compiled from: TransactionRepositoryImpl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LAG0/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_transaction.mvi.data.TransactionRepositoryImpl$getTransactionDetails$2", f = "TransactionRepositoryImpl.kt", i = {}, l = {23}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super TypedResult<AG0.a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306397q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ BG0.a f306399s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BG0.a aVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306399s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new a(this.f306399s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super TypedResult<AG0.a>> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306397q;
            if (i12 != 0) {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
                return obj;
            }
            C42729a0.b(obj);
            b bVar = b.this;
            InterfaceC50459a interfaceC50459a = bVar.f306394a.get();
            BG0.a aVar = this.f306399s;
            String str = aVar.f1267a;
            if (str == null) {
                str = "";
            }
            String str2 = aVar.f1268b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = aVar.f1269c;
            String str4 = str3 != null ? str3 : "";
            String strA = bVar.f306396c.a();
            String str5 = aVar.f1273g;
            Long lZ02 = str5 != null ? C43066x.z0(str5) : null;
            this.f306397q = 1;
            Object objA = interfaceC50459a.a(aVar.f1276j, str, str2, str4, strA, aVar.f1270d, aVar.f1271e, aVar.f1272f, lZ02, aVar.f1274h, aVar.f1275i, this);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
    }

    @Inject
    public b(@k e<InterfaceC50459a> eVar, @k R0 r02, @k RK0.a aVar) {
        this.f306394a = eVar;
        this.f306395b = r02;
        this.f306396c = aVar;
    }

    @Override // com.avito.android.universal_transaction.mvi.data.a
    @l
    public final Object a(@k BG0.a aVar, @k Continuation<? super TypedResult<AG0.a>> continuation) {
        return C43259k.g(this.f306395b.a(), new a(aVar, null), continuation);
    }
}
