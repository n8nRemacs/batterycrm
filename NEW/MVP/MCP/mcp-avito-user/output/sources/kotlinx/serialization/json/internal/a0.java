package kotlinx.serialization.json.internal;

import kotlin.AbstractC42799j;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlinx.serialization.json.JsonElement;

/* compiled from: JsonTreeReader.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/j;", "Lkotlin/G0;", "Lkotlinx/serialization/json/JsonElement;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes8.dex */
final class a0 extends RestrictedSuspendLambda implements Y41.q<AbstractC42799j<G0, JsonElement>, G0, Continuation<? super JsonElement>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f413053q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ AbstractC42799j f413054r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ c0 f413055s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Continuation<? super a0> continuation) {
        super(3, continuation);
        this.f413055s = c0Var;
    }

    @Override // Y41.q
    public final Object invoke(AbstractC42799j<G0, JsonElement> abstractC42799j, G0 g02, Continuation<? super JsonElement> continuation) {
        a0 a0Var = new a0(this.f413055s, continuation);
        a0Var.f413054r = abstractC42799j;
        return a0Var.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f413053q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC42799j abstractC42799j = this.f413054r;
            c0 c0Var = this.f413055s;
            AbstractC43450a abstractC43450a = c0Var.f413066a;
            byte bV2 = abstractC43450a.v();
            if (bV2 == 1) {
                return c0Var.d(true);
            }
            if (bV2 == 0) {
                return c0Var.d(false);
            }
            if (bV2 != 6) {
                if (bV2 == 8) {
                    return c0Var.c();
                }
                AbstractC43450a.q(abstractC43450a, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.f413053q = 1;
            obj = c0.a(c0Var, abstractC42799j, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return (JsonElement) obj;
    }
}
