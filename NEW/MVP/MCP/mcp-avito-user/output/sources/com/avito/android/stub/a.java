package com.avito.android.stub;

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
import io.reactivex.rxjava3.core.I;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.G;
import kotlin.G0;
import kotlin.Metadata;
import ru.avito.messenger.MessengerApi;
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

/* compiled from: StubMessengerModule.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/stub/a;", "Lru/avito/messenger/MessengerApi;", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class a implements MessengerApi {
    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I a(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> abortChunkedUpload(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> addToBlackList(@Y61.k List<BlacklistUserRequest> list, @Y61.l Long l12, @Y61.l String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<RawJson> callMethod(@Y61.k String str, @Y61.k RawJson rawJson) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Boolean> clearHistory(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> confirmChatAsNonSpam(@Y61.k String str, @Y61.k String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> confirmChatAsSpam(@Y61.k String str, @Y61.k String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Channel> createChat(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Channel> createChatByOpponentUser(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Channel> createChatWithAvito(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<CreateFileResponse> createFile(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<CreateVoiceFileResponse> createVoiceFile(@Y61.k String str, long j12) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I d(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> deleteMessage(@Y61.k String str, @Y61.k String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> deleteQuickReply(@Y61.k String str) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I e(double d12, double d13) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I g(@Y61.k Collection collection, @Y61.k List list, @Y61.k List list2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<BlockedUsersResponse> getBlacklist(int i12, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<BlacklistReasons> getBlacklistReasons() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<BodyImagesResponse> getBodyImages(@Y61.k Collection<String> collection) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<List<BodyItem>> getBodyItems(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Channel> getChatById(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChannelsCounters> getChatCounters() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GetFileResponse> getFile(@Y61.k String str) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<FoldersCountersResponse> getFolderCounters(@Y61.k Map<String, ? extends Collection<String>> map, @Y61.l Boolean bool) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GeoMarker[]> getGeoMarkers(@Y61.k String str, @Y61.k RawJson rawJson) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GeoSearchSuggests> getGeoSearchSuggests(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<C50261a> getPhoneByChannelId(@Y61.k String str, @Y61.l String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<QuickRepliesResponse> getQuickReplies() {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<RecommendationsResponse> getRecommendations(@Y61.k String str, @Y61.k RawJson rawJson) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<MessageSuggestsResponse> getSellerSuggests(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GetSettingsResponse> getSettings(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Map<String, String>> getUnknownMessageBodies(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GetLastActionTimesResponse> getUserLastActionTimes(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<GetUsersResponse> getUsers(@Y61.k String str, @Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<VideosResponse> getVideos(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Map<String, VoiceInfo>> getVoiceInfos(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I h(int i12, @Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I i(@Y61.k String str, @Y61.l GeoPoint geoPoint) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I j(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I k(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num, @Y61.k String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I l() {
        throw new G("An operation is not implemented: not implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessagesResponse> latestMessages(@Y61.k String str, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I m() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Boolean> markChannelAsRead(@Y61.k String str, long j12) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Boolean> markChannelsAsRead(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<Boolean> markChannelsAsUnread(@Y61.k List<String> list) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I n() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I o(@Y61.l Long l12, int i12, @Y61.k LinkedHashMap linkedHashMap) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<PinUnpinChannelResponse> pinChannel(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<SuccessResponse> removeFromBlackList(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendCallMessage(@Y61.k String str, @Y61.k String str2) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendFileMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendImageMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendItemMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendLinkMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendLocationMessage(@Y61.k String str, double d12, double d13, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> sendPing() {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendReactionMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendTextMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> sendTyping(@Y61.k String str, @Y61.k List<String> list, @Y61.l Long l12) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendVideoMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<ChatMessage> sendVoiceMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<G0> setOptions(@Y61.k Map<String, ? extends Object> map) {
        throw new G("An operation is not implemented: Not yet implemented");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final I<PinUnpinChannelResponse> unpinChannel(@Y61.k String str) {
        throw new G("An operation is not implemented: Not yet implemented");
    }
}
