package UN0;

import J81.o;
import VN0.d;
import WN0.f;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VirtualDealRoomClientCreationApi.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LUN0/a;", "", "LVN0/b;", "request", "Lcom/avito/android/remote/model/TypedResult;", "LVN0/d;", "a", "(LVN0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LWN0/a;", "LWN0/f;", "c", "(LWN0/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LXN0/d;", "LXN0/c;", "b", "(LXN0/d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes5.dex */
public interface a {
    @o("1/real-estate/profiles/create")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k VN0.b bVar, @k Continuation<? super TypedResult<d>> continuation);

    @o("1/real-estate/profiles/suggest")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k XN0.d dVar, @k Continuation<? super TypedResult<XN0.c>> continuation);

    @o("1/real-estate/profiles/get-list")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k WN0.a aVar, @k Continuation<? super TypedResult<f>> continuation);
}
