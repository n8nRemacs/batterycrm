package com.avito.android.user_adverts.root_screen.adverts_host.charity_info;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.charity.CharitySource;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.user_adverts.root_screen.adverts_host.charity_info.b;
import io.reactivex.rxjava3.internal.operators.maybe.h0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: CharityViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/charity_info/b$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/user_adverts/root_screen/adverts_host/charity_info/b$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.charity_info.CharityViewModelImpl$loadCharityInfo$2", f = "CharityViewModel.kt", i = {0}, l = {81}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super b.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312539q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f312540r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f312541s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f312542t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, String str, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f312541s = bVar;
        this.f312542t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        c cVar = new c(this.f312541s, this.f312542t, continuation);
        cVar.f312540r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super b.a> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312539q;
        String str = this.f312542t;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f312540r;
            try {
                h0 h0VarA = this.f312541s.f312531E.a(str, CharitySource.f118045b);
                this.f312540r = t13;
                this.f312539q = 1;
                Object objG = C43292o.g(h0VarA, this);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                t12 = t13;
                obj = objG;
            } catch (Throwable unused) {
                t12 = t13;
                Q0.e(t12.getF399611e());
                return null;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t12 = (T) this.f312540r;
            try {
                C42729a0.b(obj);
            } catch (Throwable unused2) {
                Q0.e(t12.getF399611e());
                return null;
            }
        }
        DeepLink deepLink = (DeepLink) obj;
        if (deepLink != null) {
            return new b.a(str, deepLink);
        }
        return null;
    }
}
