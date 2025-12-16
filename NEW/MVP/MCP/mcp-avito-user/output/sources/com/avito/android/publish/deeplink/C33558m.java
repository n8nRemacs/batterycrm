package com.avito.android.publish.deeplink;

import com.avito.android.deep_linking.links.InterfaceC29681g;
import com.avito.android.remote.model.PublishParamsSendingResult;
import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: CollectPublishParamsDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/PublishParamsSendingResult;", "response", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.publish.deeplink.m, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33558m extends N implements Y41.l<TypedResult<PublishParamsSendingResult>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ n f232582l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33558m(n nVar) {
        super(1);
        this.f232582l = nVar;
    }

    @Override // Y41.l
    public final G0 invoke(TypedResult<PublishParamsSendingResult> typedResult) {
        TypedResult<PublishParamsSendingResult> typedResult2 = typedResult;
        boolean z12 = typedResult2 instanceof TypedResult.Success;
        n nVar = this.f232582l;
        if (z12) {
            nVar.i(InterfaceC29681g.b.f134004b, nVar.f232585h, ((PublishParamsSendingResult) ((TypedResult.Success) typedResult2).getResult()).getDeeplink());
        } else if (typedResult2 instanceof TypedResult.Error) {
            nVar.f232583f.g(nVar.d(), false);
            nVar.j(new InterfaceC29681g.a(((TypedResult.Error) typedResult2).getError().getF244063c()));
        }
        return G0.f406611a;
    }
}
