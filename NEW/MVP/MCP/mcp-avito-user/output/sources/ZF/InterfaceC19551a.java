package Zf;

import J81.e;
import J81.f;
import J81.o;
import J81.t;
import Y61.k;
import Y61.l;
import ag.C19885a;
import bg.C25646a;
import cg.C27188b;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import eg.C40102a;
import fg.C40416c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: AdvertDetailsApi.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001JB\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u000fJL\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u00052\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u0011\u0010\u0012J,\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\b2\b\b\u0001\u0010\u0013\u001a\u00020\u00052\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"LZf/a;", "", "", "categoryId", "itemId", "", "messageText", "previewText", "Lcom/avito/android/remote/model/TypedResult;", "Lag/a;", "b", "(JLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lbg/a;", "d", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Leg/a;", "c", "(JJLjava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ContextActionHandler.Link.URL, "key", "Lcg/b;", "e", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cvId", "stateId", "Lfg/c;", "a", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_avito-api_advert-details"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: Zf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC19551a {
    @o("2/job/seekers/cv/set-state")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object a(@J81.c("cvId") @l Long l12, @J81.c("stateId") @l Long l13, @k Continuation<? super TypedResult<C40416c>> continuation);

    @o("1/chat/user-icebreakers/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object b(@J81.c("category_id") long j12, @J81.c("itemId") @l Long l12, @J81.c("messageText") @k String str, @J81.c("previewText") @l String str2, @k Continuation<? super TypedResult<C19885a>> continuation);

    @o("1/chat/user-icebreakers/update")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object c(@J81.c("category_id") long j12, @J81.c("id") long j13, @J81.c("itemId") @l Long l12, @J81.c("messageText") @k String str, @J81.c("previewText") @l String str2, @k Continuation<? super TypedResult<C40102a>> continuation);

    @o("1/chat/user-icebreakers/delete")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @e
    @l
    Object d(@J81.c("category_id") long j12, @J81.c("id") long j13, @k Continuation<? super TypedResult<C25646a>> continuation);

    @f("1/modelCard/detailedSpecsGroups")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @J81.k({"X-Geo-required: true", "X-Infm-Version-required: true"})
    @l
    Object e(@t(ContextActionHandler.Link.URL) @k String str, @l @t("key") String str2, @k Continuation<? super TypedResult<C27188b>> continuation);
}
