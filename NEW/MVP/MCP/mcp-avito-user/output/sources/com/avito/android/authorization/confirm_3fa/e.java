package com.avito.android.authorization.confirm_3fa;

import com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ConfirmEmailListFragment.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/deep_linking/links/DeepLink;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.confirm_3fa.ConfirmEmailListFragment$showDialog$1", f = "ConfirmEmailListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class e extends SuspendLambda implements Y41.p<DeepLink, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f93582q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ConfirmEmailListFragment f93583r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ConfirmEmailListFragment confirmEmailListFragment, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f93583r = confirmEmailListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f93583r, continuation);
        eVar.f93582q = obj;
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(DeepLink deepLink, Continuation<? super G0> continuation) {
        return ((e) create(deepLink, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        DeepLink deepLink = (DeepLink) this.f93582q;
        ConfirmEmailListFragment.a aVar = ConfirmEmailListFragment.f93539z0;
        ConfirmEmailListFragment confirmEmailListFragment = this.f93583r;
        com.avito.android.deeplink_handler.handler.composite.a aVar2 = confirmEmailListFragment.f93544r0;
        if (aVar2 == null) {
            aVar2 = null;
        }
        b.a.a(aVar2, deepLink, null, null, 6);
        confirmEmailListFragment.requireActivity().finish();
        return G0.f406611a;
    }
}
