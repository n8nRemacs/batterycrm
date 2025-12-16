package ru.avito.messenger;

import com.avito.android.remote.model.RawJson;
import com.avito.android.remote.model.messenger.context_actions.RecommendationsResponse;
import com.avito.android.remote.model.messenger.geo.GeoMarker;
import com.avito.android.remote.model.messenger.geo.GeoPoint;
import com.avito.android.remote.model.messenger.geo.GeoSearchSuggests;
import com.avito.android.remote.model.messenger.get_settings.GetSettingsResponse;
import com.avito.android.remote.model.messenger.message_suggests.MessageSuggestsResponse;
import com.avito.android.remote.model.messenger.quick_replies.QuickRepliesResponse;
import com.avito.android.remote.model.messenger.video.VideosResponse;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import ru.avito.messenger.api.entity.BlacklistReasons;
import ru.avito.messenger.api.entity.BlacklistUserRequest;
import ru.avito.messenger.api.entity.BlockedUsersResponse;
import ru.avito.messenger.api.entity.BodyImagesResponse;
import ru.avito.messenger.api.entity.Channel;
import ru.avito.messenger.api.entity.ChannelsCounters;
import ru.avito.messenger.api.entity.ChatMessage;
import ru.avito.messenger.api.entity.ChatMessagesResponse;
import ru.avito.messenger.api.entity.CreateFileResponse;
import ru.avito.messenger.api.entity.CreateVoiceFileResponse;
import ru.avito.messenger.api.entity.FoldersCountersResponse;
import ru.avito.messenger.api.entity.GetFileResponse;
import ru.avito.messenger.api.entity.GetLastActionTimesResponse;
import ru.avito.messenger.api.entity.GetUsersResponse;
import ru.avito.messenger.api.entity.PinUnpinChannelResponse;
import ru.avito.messenger.api.entity.SuccessResponse;
import ru.avito.messenger.api.entity.body.item.BodyItem;
import yk0.C50261a;

/* compiled from: MessengerApi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/avito/messenger/MessengerApi;", "", "Companion", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface MessengerApi {

    /* compiled from: MessengerApi.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lru/avito/messenger/MessengerApi$Companion;", "", "<init>", "()V", "GetChatsFilters", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: MessengerApi.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/MessengerApi$Companion$GetChatsFilters;", "", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class GetChatsFilters {

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ GetChatsFilters[] f430676b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f430677c;

            static {
                GetChatsFilters[] getChatsFiltersArr = {new GetChatsFilters("ITEM_IDS", 0), new GetChatsFilters("UNREAD", 1)};
                f430676b = getChatsFiltersArr;
                f430677c = kotlin.enums.c.a(getChatsFiltersArr);
            }

            public GetChatsFilters() {
                throw null;
            }

            public static GetChatsFilters valueOf(String str) {
                return (GetChatsFilters) Enum.valueOf(GetChatsFilters.class, str);
            }

            public static GetChatsFilters[] values() {
                return (GetChatsFilters[]) f430676b.clone();
            }
        }

        static {
            new Companion();
        }
    }

    /* compiled from: MessengerApi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.k
    io.reactivex.rxjava3.core.I a(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> abortChunkedUpload(@Y61.k String str, @Y61.k String str2, @Y61.k String str3);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> addToBlackList(@Y61.k List<BlacklistUserRequest> list, @Y61.l Long l12, @Y61.l String str);

    @Y61.k
    io.reactivex.rxjava3.core.I c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList);

    @Y61.k
    io.reactivex.rxjava3.core.I<RawJson> callMethod(@Y61.k String str, @Y61.k RawJson rawJson);

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> clearHistory(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsNonSpam(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsSpam(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChat(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChatByOpponentUser(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> createChatWithAvito(@Y61.l String str, @Y61.l String str2, @Y61.l String str3);

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
    io.reactivex.rxjava3.core.I g(@Y61.k Collection collection, @Y61.k List list, @Y61.k List list2);

    @Y61.k
    io.reactivex.rxjava3.core.I<BlockedUsersResponse> getBlacklist(int i12, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<BlacklistReasons> getBlacklistReasons();

    @Y61.k
    io.reactivex.rxjava3.core.I<BodyImagesResponse> getBodyImages(@Y61.k Collection<String> collection);

    @Y61.k
    io.reactivex.rxjava3.core.I<List<BodyItem>> getBodyItems(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Channel> getChatById(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChannelsCounters> getChatCounters();

    @Y61.k
    io.reactivex.rxjava3.core.I<GetFileResponse> getFile(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<FoldersCountersResponse> getFolderCounters(@Y61.k Map<String, ? extends Collection<String>> map, @Y61.l Boolean bool);

    @Y61.k
    io.reactivex.rxjava3.core.I<GeoMarker[]> getGeoMarkers(@Y61.k String str, @Y61.k RawJson rawJson);

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
    io.reactivex.rxjava3.core.I<GetSettingsResponse> getSettings(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, String>> getUnknownMessageBodies(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<GetLastActionTimesResponse> getUserLastActionTimes(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<GetUsersResponse> getUsers(@Y61.k String str, @Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<VideosResponse> getVideos(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> getVoiceInfos(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I h(int i12, @Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I i(@Y61.k String str, @Y61.l GeoPoint geoPoint);

    @Y61.k
    io.reactivex.rxjava3.core.I j(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I k(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I l();

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessagesResponse> latestMessages(@Y61.k String str, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I m();

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelAsRead(@Y61.k String str, long j12);

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelsAsRead(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I<Boolean> markChannelsAsUnread(@Y61.k List<String> list);

    @Y61.k
    io.reactivex.rxjava3.core.I n();

    @Y61.k
    io.reactivex.rxjava3.core.I o(@Y61.l Long l12, int i12, @Y61.k LinkedHashMap linkedHashMap);

    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> pinChannel(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<SuccessResponse> removeFromBlackList(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendCallMessage(@Y61.k String str, @Y61.k String str2);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendFileMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendImageMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendItemMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendLinkMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendLocationMessage(@Y61.k String str, double d12, double d13, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> sendPing();

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendReactionMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendTextMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> sendTyping(@Y61.k String str, @Y61.k List<String> list, @Y61.l Long l12);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVideoMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<ChatMessage> sendVoiceMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num);

    @Y61.k
    io.reactivex.rxjava3.core.I<kotlin.G0> setOptions(@Y61.k Map<String, ? extends Object> map);

    @Y61.k
    io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> unpinChannel(@Y61.k String str);
}
