package com.avito.android.user_adverts.root_screen.adverts_host.activate;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.user_adverts_actions.model.deeplink.ProfileUserItemsActivateLink;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import hm0.InterfaceC40961a;
import java.util.Set;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ProfileUserItemsActivateLinkHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.activate.ProfileUserItemsActivateLinkHandler$doHandle$1", f = "ProfileUserItemsActivateLinkHandler.kt", i = {}, l = {InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312366q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f312367r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ProfileUserItemsActivateLink f312368s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, ProfileUserItemsActivateLink profileUserItemsActivateLink, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f312367r = bVar;
        this.f312368s = profileUserItemsActivateLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f312367r, this.f312368s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312366q;
        b bVar = this.f312367r;
        if (i12 == 0) {
            C42729a0.b(obj);
            ProfileUserItemsActivateLink profileUserItemsActivateLink = this.f312368s;
            Set setP0 = C42745f0.P0(profileUserItemsActivateLink.f254389b);
            this.f312366q = 1;
            obj = bVar.f312369f.f(setP0, profileUserItemsActivateLink.f254390c, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        TypedResult typedResult = (TypedResult) obj;
        if (typedResult instanceof TypedResult.Error) {
            bVar.j(new ProfileUserItemsActivateLink.b.a(((TypedResult.Error) typedResult).getError()));
        } else if (typedResult instanceof TypedResult.Success) {
            bVar.j(new ProfileUserItemsActivateLink.b.C7613b((InterfaceC40961a) ((TypedResult.Success) typedResult).getResult()));
        }
        return G0.f406611a;
    }
}
