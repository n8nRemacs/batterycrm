package com.avito.android.profile.user_profile.mvi;

import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction$RemovePromoBlock;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handlePromoBlockAction$1$1", f = "UserProfileActor.kt", i = {}, l = {804, 806}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class G extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction.RemovePromoBlock>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f226216q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f226217r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CardItem.PromoBlockItem f226218s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C33388a f226219t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(CardItem.PromoBlockItem promoBlockItem, C33388a c33388a, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f226218s = promoBlockItem;
        this.f226219t = c33388a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f226218s, this.f226219t, continuation);
        g12.f226217r = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction.RemovePromoBlock> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((G) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f226216q;
        CardItem.PromoBlockItem promoBlockItem = this.f226218s;
        try {
        } catch (Throwable th2) {
            V2.f318762a.f(th2);
        }
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f226217r;
            UserProfileInternalAction.RemovePromoBlock removePromoBlock = new UserProfileInternalAction.RemovePromoBlock(promoBlockItem);
            this.f226216q = 1;
            if (interfaceC43172j.emit(removePromoBlock, this) == coroutine_suspended) {
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
            C42729a0.b(obj);
        }
        com.avito.android.profile.user_profile.j jVar = this.f226219t.f226282b;
        String str = promoBlockItem.f224499c;
        String str2 = promoBlockItem.f224500d;
        this.f226216q = 2;
        if (jVar.e(str, str2, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return G0.f406611a;
    }
}
