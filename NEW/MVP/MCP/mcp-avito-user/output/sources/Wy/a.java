package WY;

import J81.f;
import J81.o;
import Y61.k;
import Y61.l;
import YY.d;
import YY.e;
import aZ.C19843a;
import com.avito.android.remote.model.TypedResult;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: MessengerApi.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u000bH§@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011"}, d2 = {"LWY/a;", "", "Lcom/avito/android/remote/model/TypedResult;", "LXY/a;", "d", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LYY/e;", "request", "LYY/d;", "b", "(LYY/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LZY/b;", "LZY/a;", "c", "(LZY/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LaZ/a;", "a", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes15.dex */
public interface a {
    @f("1/support/informer")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@k Continuation<? super TypedResult<C19843a>> continuation);

    @o("1/messenger/getChannelsCustomTags")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k e eVar, @k Continuation<? super TypedResult<d>> continuation);

    @o("1/messenger/getOnboardingLink")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k ZY.b bVar, @k Continuation<? super TypedResult<ZY.a>> continuation);

    @o("1/assistantSettings/getDeeplink")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@k Continuation<? super TypedResult<XY.a>> continuation);
}
