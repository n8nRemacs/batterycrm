package com.avito.android.advert_collection_list.mvi;

import Ju.InterfaceC14249c;
import Q7.a;
import android.net.Uri;
import android.os.Bundle;
import com.avito.android.advert_collection_list.mvi.entity.AdvertCollectionListInternalAction;
import com.avito.android.beduin.v2.page.m;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.text.TooltipAttribute;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: AdvertCollectionListActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection_list/mvi/entity/AdvertCollectionListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection_list.mvi.AdvertCollectionListActor$process$6", f = "AdvertCollectionListActor.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionListInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f82187q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f82188r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Q7.a f82189s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g f82190t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Q7.a aVar, g gVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f82189s = aVar;
        this.f82190t = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f82189s, this.f82190t, continuation);
        dVar.f82188r = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AdvertCollectionListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f82187q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f82188r;
            C43501a c43501a = ((a.d) this.f82189s).f13511a;
            com.avito.android.deeplink_handler.handler.bundle.a aVar = c43501a.f413260a;
            InterfaceC14249c interfaceC14249c = c43501a.f413261b;
            boolean z12 = interfaceC14249c instanceof m.c;
            String str = aVar.f134521b;
            g gVar = this.f82190t;
            if (z12 && L.f(str, "create_collection")) {
                Bundle bundle = ((m.c) interfaceC14249c).f105170b;
                if (bundle != null) {
                    String string = bundle.getString("collectionId");
                    String str2 = string == null ? "" : string;
                    String string2 = bundle.getString("name");
                    String str3 = string2 == null ? "" : string2;
                    x xVar = gVar.f82228e;
                    String string3 = bundle.getString(TooltipAttribute.PARAM_DEEP_LINK);
                    if (string3 == null) {
                        string3 = "";
                    }
                    DeepLink deepLinkB = xVar.b(string3);
                    String string4 = bundle.getString("description");
                    String str4 = string4 == null ? "" : string4;
                    String string5 = bundle.getString("image");
                    AdvertCollectionListInternalAction.CollectionCreated collectionCreated = new AdvertCollectionListInternalAction.CollectionCreated(deepLinkB, ImageKt.toSingleImage(Uri.parse(string5 != null ? string5 : "")), str2, str3, str4);
                    this.f82187q = 1;
                    if (interfaceC43172j.emit(collectionCreated, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (z12 && L.f(str, "editCollection") && ((m.c) interfaceC14249c).f105170b != null) {
                gVar.c();
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
