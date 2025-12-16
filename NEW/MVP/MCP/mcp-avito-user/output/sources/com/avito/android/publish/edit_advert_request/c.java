package com.avito.android.publish.edit_advert_request;

import Y41.p;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.deep_linking.links.AuctionOfferLink;
import com.avito.android.publish.edit_advert_request.a;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.publish.EditAdvertResult;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import sj0.InterfaceC48373a;
import vj0.C49338a;

/* compiled from: AuctionOfferChecker.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/publish/edit_advert_request/a$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/publish/edit_advert_request/a$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.edit_advert_request.AuctionOfferChecker$isAuctionAvailableViaContracts$1", f = "AuctionOfferChecker.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super a.InterfaceC7097a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f235460q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a f235461r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f235462s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ EditAdvertResult.Ok f235463t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(a aVar, String str, EditAdvertResult.Ok ok2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f235461r = aVar;
        this.f235462s = str;
        this.f235463t = ok2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f235461r, this.f235462s, this.f235463t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a.InterfaceC7097a> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f235460q;
        EditAdvertResult.Ok ok2 = this.f235463t;
        String str = this.f235462s;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC48373a interfaceC48373a = this.f235461r.f235452b;
                this.f235460q = 1;
                obj = interfaceC48373a.b(null, null, str, this);
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
            if (!(typedResult instanceof TypedResult.Success)) {
                if (typedResult instanceof TypedResult.Error) {
                    return new a.InterfaceC7097a.b(new TypedResult.Success(ok2));
                }
                throw new NoWhenBranchMatchedException();
            }
            if (!((C49338a) ((TypedResult.Success) typedResult).getResult()).getIsAvailable()) {
                return new a.InterfaceC7097a.b(new TypedResult.Success(ok2));
            }
            AuctionOfferLink auctionOfferLink = new AuctionOfferLink(str, null, "lot-from-item-edit", "lot-from-item-edit");
            AuctionOfferLink.b bVar = AuctionOfferLink.f133020f;
            C22777e.a();
            bVar.getClass();
            Bundle bundle = new Bundle();
            bundle.putParcelable("previous_response_key", ok2);
            bundle.putString("item_id_key", str);
            return new a.InterfaceC7097a.C7098a(auctionOfferLink, bundle);
        } catch (Exception unused) {
            return new a.InterfaceC7097a.b(new TypedResult.Success(ok2));
        }
    }
}
