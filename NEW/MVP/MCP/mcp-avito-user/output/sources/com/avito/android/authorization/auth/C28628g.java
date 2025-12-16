package com.avito.android.authorization.auth;

import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.remote.model.UserDialog;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: AuthFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.auth.AuthFragment$showUserDialog$1", f = "AuthFragment.kt", i = {}, l = {299}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.authorization.auth.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28628g extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93019q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AuthFragment f93020r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ UserDialog f93021s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28628g(AuthFragment authFragment, UserDialog userDialog, Continuation<? super C28628g> continuation) {
        super(2, continuation);
        this.f93020r = authFragment;
        this.f93021s = userDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C28628g(this.f93020r, this.f93021s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((C28628g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f93019q;
        AuthFragment authFragment = this.f93020r;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC30274a interfaceC30274a = authFragment.f92821E0;
            if (interfaceC30274a == null) {
                interfaceC30274a = null;
            }
            io.reactivex.rxjava3.core.q qVarF = interfaceC30274a.f(this.f93021s);
            this.f93019q = 1;
            obj = C43292o.g(qVarF, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        DeepLink deepLink = (DeepLink) obj;
        if (deepLink != null) {
            com.avito.android.deeplink_handler.handler.composite.a aVar = authFragment.f92820D0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink, null, null, 6);
        }
        return G0.f406611a;
    }
}
