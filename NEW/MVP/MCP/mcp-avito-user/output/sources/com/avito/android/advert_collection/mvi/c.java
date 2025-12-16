package com.avito.android.advert_collection.mvi;

import Ju.InterfaceC14249c;
import android.os.Bundle;
import com.avito.android.advert_collection.adapter.title.CollectionTitleItem;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionInternalAction;
import com.avito.android.advert_collection.mvi.entity.AdvertCollectionState;
import com.avito.android.beduin.v2.page.m;
import com.avito.conveyor_item.ParcelableItem;
import com.facebook.imageutils.JfifUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AdvertCollectionActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/advert_collection/mvi/entity/AdvertCollectionInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.advert_collection.mvi.AdvertCollectionActor$process$4", f = "AdvertCollectionActor.kt", i = {}, l = {JfifUtil.MARKER_RST7}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super AdvertCollectionInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f81558q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f81559r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14249c f81560s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdvertCollectionState f81561t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC14249c interfaceC14249c, AdvertCollectionState advertCollectionState, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f81560s = interfaceC14249c;
        this.f81561t = advertCollectionState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f81560s, this.f81561t, continuation);
        cVar.f81559r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AdvertCollectionInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        String string;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f81558q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f81559r;
            Bundle bundle = ((m.c) this.f81560s).f105170b;
            if (bundle != null) {
                List<ParcelableItem> list = this.f81561t.f81615b;
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (obj2 instanceof CollectionTitleItem) {
                        arrayList.add(obj2);
                    }
                }
                CollectionTitleItem collectionTitleItem = (CollectionTitleItem) C42745f0.G(arrayList);
                String string2 = bundle.getString("name");
                if (string2 == null) {
                    string2 = "";
                }
                String string3 = bundle.getString("description");
                if (string3 == null) {
                    string3 = "";
                }
                CollectionTitleItem.ModerationStatusInfo moderationStatusInfo = null;
                String str = collectionTitleItem != null ? collectionTitleItem.f81309c : null;
                String string4 = bundle.getString("badgeText");
                if (string4 != null && string4.length() != 0 && (string = bundle.getString("badgeColor")) != null && string.length() != 0) {
                    String string5 = bundle.getString("badgeText");
                    if (string5 == null) {
                        string5 = "";
                    }
                    String string6 = bundle.getString("badgeColor");
                    moderationStatusInfo = new CollectionTitleItem.ModerationStatusInfo(string5, string6 != null ? string6 : "");
                } else if (collectionTitleItem != null) {
                    moderationStatusInfo = collectionTitleItem.f81311e;
                }
                AdvertCollectionInternalAction.UpdateCollectionInfo updateCollectionInfo = new AdvertCollectionInternalAction.UpdateCollectionInfo(new CollectionTitleItem(string2, str, string3, moderationStatusInfo));
                this.f81558q = 1;
                if (interfaceC43172j.emit(updateCollectionInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
