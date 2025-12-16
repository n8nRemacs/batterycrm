package com.avito.android.profile.user_profile.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$handleCardAction$27", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile.user_profile.mvi.w, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33409w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UserProfileInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C33388a f226541q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ CardItem f226542r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33409w(CardItem cardItem, C33388a c33388a, Continuation continuation) {
        super(2, continuation);
        this.f226541q = c33388a;
        this.f226542r = cardItem;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C33409w(this.f226542r, this.f226541q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C33409w) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C33388a c33388a = this.f226541q;
        InterfaceC28373a interfaceC28373a = c33388a.f226296p;
        CardItem.WalletCardItem walletCardItem = (CardItem.WalletCardItem) this.f226542r;
        interfaceC28373a.c(new N90.u(walletCardItem.f224624f));
        b.a.a(c33388a.f226289i, walletCardItem.f224623e, null, null, 6);
        return G0.f406611a;
    }
}
