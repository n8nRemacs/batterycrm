package ru.avito.messenger;

import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggests;
import com.avito.android.remote.model.messenger.get_settings.GetSettingsRequest;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.BlacklistReasons;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsCounters;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.CreateFileResponse;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;
import ru.avito.messenger.api.entity.GetFileResponse;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;
import yk0.C50261a;

/* compiled from: MessengerClient.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r¨\u0006\u000e"}, d2 = {"Lru/avito/messenger/z;", "Lru/avito/messenger/V;", "Lru/avito/messenger/x;", "Lru/avito/messenger/y;", "Lru/avito/messenger/Z;", "Lru/avito/messenger/q0;", "Lru/avito/messenger/h0;", "Lru/avito/messenger/e0;", "Lru/avito/messenger/i0;", "Lru/avito/messenger/W;", "Lru/avito/messenger/Y;", "Lru/avito/messenger/n;", "Lru/avito/messenger/f0;", "Lru/avito/messenger/I0;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public interface InterfaceC47842z extends V, InterfaceC47840x, InterfaceC47841y, Z, q0, InterfaceC47742h0, InterfaceC47736e0, InterfaceC47744i0, W, Y, InterfaceC47831n, InterfaceC47738f0, I0 {

    /* compiled from: MessengerClient.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.avito.messenger.z$a */
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> E(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I a(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> abortChunkedUpload(@Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList);

    @Y61.k
    io.reactivex.rxjava3.core.I<RawJson> callMethod(@Y61.k String str, @Y61.k RawJson rawJson);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsNonSpam(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsSpam(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<CreateFileResponse> createFile(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<CreateVoiceFileResponse> createVoiceFile(@Y61.k String str, long j12);

    @Y61.k
    io.reactivex.rxjava3.core.I d(@Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> deleteMessage(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> deleteQuickReply(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I e(double d12, double d13);

    @Y61.k
    io.reactivex.rxjava3.core.I f(@Y61.k String str, @Y61.k MessengerUserHashInfo messengerUserHashInfo);

    @Y61.k
    io.reactivex.rxjava3.core.I g(@Y61.k Collection collection, @Y61.k List list, @Y61.k List list2);

    @Y61.k
    io.reactivex.rxjava3.core.I<BlacklistReasons> getBlacklistReasons();

    @Y61.k
    io.reactivex.rxjava3.core.I<ChannelsCounters> getChatCounters();

    @Y61.k
    io.reactivex.rxjava3.core.I<GetFileResponse> getFile(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<GeoSearchSuggests> getGeoSearchSuggests(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint);

    @Y61.k
    io.reactivex.rxjava3.core.I<C50261a> getPhoneByChannelId(@Y61.k String str, @Y61.l String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<QuickRepliesResponse> getQuickReplies();

    @Y61.k
    io.reactivex.rxjava3.core.I<RecommendationsResponse> getRecommendations(@Y61.k String str, @Y61.k RawJson rawJson);

    @Y61.k
    io.reactivex.rxjava3.core.I<MessageSuggestsResponse> getSellerSuggests(@Y61.k String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, String>> getUnknownMessageBodies(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<VideosResponse> getVideos(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I h(int i12, @Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I i(@Y61.k String str, @Y61.l GeoPoint geoPoint);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> k(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.l String str, @Y61.l String str2, @Y61.l String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I n(@Y61.k GetSettingsRequest.ForAutoReplies forAutoReplies);

    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> pinChannel(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> sendTyping(@Y61.k String str, @Y61.k List<String> list, @Y61.l Long l12);

    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> unpinChannel(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> w(@Y61.k MessengerUserHashInfo messengerUserHashInfo, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Y41.a<? extends io.reactivex.rxjava3.core.I<Channel>> aVar);
}
