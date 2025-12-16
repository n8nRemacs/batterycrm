package com.avito.android.user_adverts.root_screen.adverts_host.safety_info;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.user_adverts.root_screen.adverts_host.safety_info.b;
import io.reactivex.rxjava3.internal.operators.maybe.d0;
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

/* compiled from: SafetyInfoViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/safety_info/b$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/user_adverts/root_screen/adverts_host/safety_info/b$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.safety_info.SafetyInfoViewModelImpl$loadSafetyInfo$2", f = "SafetyInfoViewModel.kt", i = {0}, l = {87}, m = "invokeSuspend", n = {"$this$withContext"}, s = {"L$0"})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super b.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f313817q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f313818r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f313819s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f313820t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, String str, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f313819s = bVar;
        this.f313820t = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        d dVar = new d(this.f313819s, this.f313820t, continuation);
        dVar.f313818r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super b.a> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        T t12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f313817q;
        String str = this.f313820t;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t13 = (T) this.f313818r;
            try {
                b bVar = this.f313819s;
                com.avito.android.user_adverts_common.safety.b bVar2 = bVar.f313807E;
                String strA = bVar.f313809K.a();
                if (strA == null) {
                    strA = "";
                }
                d0 d0VarA = bVar2.a(str, strA);
                this.f313818r = t13;
                this.f313817q = 1;
                Object objG = C43292o.g(d0VarA, this);
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
            t12 = (T) this.f313818r;
            try {
                C42729a0.b(obj);
            } catch (Throwable unused2) {
                Q0.e(t12.getF399611e());
                return null;
            }
        }
        DetailsSheetLinkBody detailsSheetLinkBody = (DetailsSheetLinkBody) obj;
        if (detailsSheetLinkBody != null) {
            return new b.a(new DetailsSheetLink(detailsSheetLinkBody, null, 2, null), str);
        }
        return null;
    }
}
