package Z81;

import J81.o;
import Y61.k;
import Y61.l;
import a91.C19741v;
import a91.C19742w;
import c91.C26962A;
import com.avito.android.remote.model.TypedResult;
import d91.i;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import e91.C39974c;
import e91.C39975d;
import f91.C40264a;
import g91.H;
import g91.I;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.avito.messenger.generated.api.get_channel_by_id.GetChannelByIdResponse;
import ru.avito.messenger.generated.api.get_channel_by_id.GetChatByIdRequest;
import ru.avito.messenger.generated.api.get_channels.GetChannelsRequest;
import ru.avito.messenger.generated.api.get_user_visible_messages.GetUserVisibleMessagesRequest;
import ru.avito.messenger.generated.api.read_chats.ReadChatsRequest;

/* compiled from: MessengerApi.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0018H§@¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u001cH§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"LZ81/a;", "", "La91/v;", "request", "Lcom/avito/android/remote/model/TypedResult;", "La91/w;", "c", "(La91/v;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/avito/messenger/generated/api/get_channel_by_id/GetChatByIdRequest;", "Lru/avito/messenger/generated/api/get_channel_by_id/GetChannelByIdResponse;", "f", "(Lru/avito/messenger/generated/api/get_channel_by_id/GetChatByIdRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest;", "Lc91/A;", "e", "(Lru/avito/messenger/generated/api/get_channels/GetChannelsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest;", "Ld91/i;", "g", "(Lru/avito/messenger/generated/api/get_user_visible_messages/GetUserVisibleMessagesRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Le91/c;", "Le91/d;", "b", "(Le91/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lru/avito/messenger/generated/api/read_chats/ReadChatsRequest;", "Lf91/a;", "a", "(Lru/avito/messenger/generated/api/read_chats/ReadChatsRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lg91/H;", "Lg91/I;", "d", "(Lg91/H;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* loaded from: classes9.dex */
public interface a {
    @o("1/messenger/readChats")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@J81.a @k ReadChatsRequest readChatsRequest, @k Continuation<? super TypedResult<C40264a>> continuation);

    @o("1/messenger/getUsers")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@J81.a @k C39974c c39974c, @k Continuation<? super TypedResult<C39975d>> continuation);

    @o("1/messenger/createItemChannel")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@J81.a @k C19741v c19741v, @k Continuation<? super TypedResult<C19742w>> continuation);

    @o("1/messenger/sendTextMessage")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object d(@J81.a @k H h12, @k Continuation<? super TypedResult<I>> continuation);

    @o("1/messenger/getChannels")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object e(@J81.a @k GetChannelsRequest getChannelsRequest, @k Continuation<? super TypedResult<C26962A>> continuation);

    @o("1/messenger/getChannelById")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object f(@J81.a @k GetChatByIdRequest getChatByIdRequest, @k Continuation<? super TypedResult<GetChannelByIdResponse>> continuation);

    @o("1/messenger/getUserVisibleMessages")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object g(@J81.a @k GetUserVisibleMessagesRequest getUserVisibleMessagesRequest, @k Continuation<? super TypedResult<i>> continuation);
}
