package com.avito.android.auction;

import com.avito.android.auction.remote.model.AuctionSendingResult;
import com.avito.android.deep_linking.links.InterfaceC29675a;
import com.avito.android.remote.model.TypedResult;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: AuctionAddDeepLinkHandler.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/auction/remote/model/AuctionSendingResult;", "response", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class e extends N implements Y41.l<TypedResult<AuctionSendingResult>, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ f f92396l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(1);
        this.f92396l = fVar;
    }

    @Override // Y41.l
    public final G0 invoke(TypedResult<AuctionSendingResult> typedResult) {
        TypedResult<AuctionSendingResult> typedResult2 = typedResult;
        boolean z12 = typedResult2 instanceof TypedResult.Success;
        f fVar = this.f92396l;
        if (z12) {
            fVar.i(InterfaceC29675a.b.f133879b, fVar.f92399h, ((AuctionSendingResult) ((TypedResult.Success) typedResult2).getResult()).getDeepLink());
        } else if (typedResult2 instanceof TypedResult.Error) {
            fVar.f92397f.g(fVar.d(), false);
            fVar.j(new InterfaceC29675a.C4022a(((TypedResult.Error) typedResult2).getError().getF244063c()));
        }
        return G0.f406611a;
    }
}
