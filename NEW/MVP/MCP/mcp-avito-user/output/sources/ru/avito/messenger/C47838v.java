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

/* compiled from: MessengerApiProxy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/messenger/v;", "Lru/avito/messenger/MessengerApi;", "_avito-discouraged_messenger"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ru.avito.messenger.v, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47838v implements MessengerApi {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MessengerApiService f431866a;

    public C47838v(@Y61.k MessengerApiService messengerApiService) {
        this.f431866a = messengerApiService;
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I a(@Y61.k String str) {
        return this.f431866a.addQuickReply(str, null);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> abortChunkedUpload(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
        return this.f431866a.abortChunkedUpload(str, str2, str3);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> addToBlackList(@Y61.k List<BlacklistUserRequest> list, @Y61.l Long l12, @Y61.l String str) {
        return this.f431866a.addToBlackList(list, l12, str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I c(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k ArrayList arrayList) {
        return this.f431866a.confirmChunkedUpload(str, str2, str3, arrayList);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<RawJson> callMethod(@Y61.k String str, @Y61.k RawJson rawJson) {
        return this.f431866a.callMethod(str, rawJson);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> clearHistory(@Y61.k List<String> list) {
        return this.f431866a.clearHistory(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsNonSpam(@Y61.k String str, @Y61.k String str2) {
        return this.f431866a.confirmChatAsNonSpam(str, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> confirmChatAsSpam(@Y61.k String str, @Y61.k String str2) {
        return this.f431866a.confirmChatAsSpam(str, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> createChat(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
        return this.f431866a.createChat(str, str2, str3, str4);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> createChatByOpponentUser(@Y61.k String str) {
        return this.f431866a.createChatByOpponentUser(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> createChatWithAvito(@Y61.l String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f431866a.createChatWithAvito(str, str2, str3);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<CreateFileResponse> createFile(@Y61.k String str) {
        return this.f431866a.createFile(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<CreateVoiceFileResponse> createVoiceFile(@Y61.k String str, long j12) {
        return this.f431866a.createVoiceFile(str, j12);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I d(@Y61.k String str, @Y61.k String str2, @Y61.l String str3) {
        return this.f431866a.createChunkedVideoFile(str, str2, "application/octet-stream", str3);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> deleteMessage(@Y61.k String str, @Y61.k String str2) {
        return this.f431866a.deleteMessage(str, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> deleteQuickReply(@Y61.k String str) {
        return this.f431866a.deleteQuickReply(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I e(double d12, double d13) {
        return this.f431866a.getGeoCodedLocationForCoordinates(d12, d13, "house");
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I g(@Y61.k Collection collection, @Y61.k List list, @Y61.k List list2) {
        return this.f431866a.updateFolderTags(collection, list, list2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<BlockedUsersResponse> getBlacklist(int i12, @Y61.l Integer num) {
        return this.f431866a.getBlacklist(i12, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<BlacklistReasons> getBlacklistReasons() {
        return this.f431866a.getBlacklistReasons();
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<BodyImagesResponse> getBodyImages(@Y61.k Collection<String> collection) {
        return this.f431866a.getBodyImages(collection);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<List<BodyItem>> getBodyItems(@Y61.k List<String> list) {
        return this.f431866a.getBodyItems(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Channel> getChatById(@Y61.k String str) {
        return this.f431866a.getChatById(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChannelsCounters> getChatCounters() {
        return this.f431866a.getChatCounters();
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GetFileResponse> getFile(@Y61.k String str) {
        return this.f431866a.getFile(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<FoldersCountersResponse> getFolderCounters(@Y61.k Map<String, ? extends Collection<String>> map, @Y61.l Boolean bool) {
        return this.f431866a.getFolderCounters(map, bool);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GeoMarker[]> getGeoMarkers(@Y61.k String str, @Y61.k RawJson rawJson) {
        return this.f431866a.getGeoMarkers(str, rawJson);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GeoSearchSuggests> getGeoSearchSuggests(@Y61.k String str, @Y61.k String str2, @Y61.l GeoPoint geoPoint) {
        return this.f431866a.getGeoSearchSuggests(str, str2, geoPoint);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<C50261a> getPhoneByChannelId(@Y61.k String str, @Y61.l String str2) {
        return this.f431866a.getPhoneByChannelId(str, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<QuickRepliesResponse> getQuickReplies() {
        return this.f431866a.getQuickReplies();
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<RecommendationsResponse> getRecommendations(@Y61.k String str, @Y61.k RawJson rawJson) {
        return this.f431866a.getRecommendations(str, rawJson);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<MessageSuggestsResponse> getSellerSuggests(@Y61.k String str, @Y61.l String str2, @Y61.l String str3) {
        return this.f431866a.getSellerSuggests(str, str2, str3);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GetSettingsResponse> getSettings(@Y61.k List<String> list) {
        return this.f431866a.getSettings(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, String>> getUnknownMessageBodies(@Y61.k List<String> list) {
        return this.f431866a.getUnknownMessageBodies(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GetLastActionTimesResponse> getUserLastActionTimes(@Y61.k List<String> list) {
        return this.f431866a.getUserLastActionTimes(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<GetUsersResponse> getUsers(@Y61.k String str, @Y61.k List<String> list) {
        return this.f431866a.getUsers(str, list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<VideosResponse> getVideos(@Y61.k List<String> list) {
        return this.f431866a.getVideos(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, GetFileResponse>> getVoiceFile(@Y61.k List<String> list) {
        return this.f431866a.getVoiceFile(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Map<String, VoiceInfo>> getVoiceInfos(@Y61.k List<String> list) {
        return this.f431866a.getVoiceInfos(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I h(int i12, @Y61.k String str) {
        return this.f431866a.searchChats(i12, 10, str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I i(@Y61.k String str, @Y61.l GeoPoint geoPoint) {
        return this.f431866a.getFavoritePlaces(str, geoPoint, null);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I j(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num) {
        return this.f431866a.messagesBefore(str, l12, null, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I k(@Y61.k String str, @Y61.l Long l12, @Y61.l Integer num, @Y61.k String str2) {
        return this.f431866a.getItemsForAttach(str, l12, 20, num, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I l() {
        return this.f431866a.editQuickReply(null, null, null);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessagesResponse> latestMessages(@Y61.k String str, @Y61.l Integer num) {
        return this.f431866a.latestMessages(str, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I m() {
        return this.f431866a.getReplySuggest(null);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> markChannelAsRead(@Y61.k String str, long j12) {
        return this.f431866a.markChannelAsRead(str, j12);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> markChannelsAsRead(@Y61.k List<String> list) {
        return this.f431866a.markChannelsAsRead(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<Boolean> markChannelsAsUnread(@Y61.k List<String> list) {
        return this.f431866a.markChannelsAsUnread(list);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I n() {
        return this.f431866a.createVideoFile(null, null);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I o(@Y61.l Long l12, int i12, @Y61.k LinkedHashMap linkedHashMap) {
        return this.f431866a.getChannels(l12, i12, linkedHashMap);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> pinChannel(@Y61.k String str) {
        return this.f431866a.pinChannel(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<SuccessResponse> removeFromBlackList(@Y61.k String str) {
        return this.f431866a.removeFromBlackList(str);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendCallMessage(@Y61.k String str, @Y61.k String str2) {
        return this.f431866a.sendCallMessage(str, str2);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendFileMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num) {
        return this.f431866a.sendFileMessage(str, str2, str3, str4, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendImageMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num) {
        return this.f431866a.sendImageMessage(str, str2, str3, str4, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendItemMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5) {
        return this.f431866a.sendItemMessage(str, str2, str3, str4, num, str5);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendLinkMessage(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l Integer num) {
        return this.f431866a.sendLinkMessage(str, str2, str3, str4, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendLocationMessage(@Y61.k String str, double d12, double d13, @Y61.k String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return this.f431866a.sendLocationMessage(str, d12, d13, str2, str3, str4, str5, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> sendPing() {
        return this.f431866a.sendPing();
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendReactionMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4) {
        return this.f431866a.sendReactionMessage(str, str2, str3, str4);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendTextMessage(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l List<String> list, @Y61.l String str4, @Y61.l Integer num, @Y61.l String str5, @Y61.l Long l12) {
        return this.f431866a.sendTextMessage(str, str2, str3, list, str4, num, str5, l12);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> sendTyping(@Y61.k String str, @Y61.k List<String> list, @Y61.l Long l12) {
        return this.f431866a.sendTyping(str, list, l12);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendVideoMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return this.f431866a.sendVideoMessage(str, str2, str3, str4, str5, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<ChatMessage> sendVoiceMessage(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num) {
        return this.f431866a.sendVoiceMessage(str, str2, str3, str4, str5, num);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<kotlin.G0> setOptions(@Y61.k Map<String, ? extends Object> map) {
        return this.f431866a.setOptions(map);
    }

    @Override // ru.avito.messenger.MessengerApi
    @Y61.k
    public final io.reactivex.rxjava3.core.I<PinUnpinChannelResponse> unpinChannel(@Y61.k String str) {
        return this.f431866a.unpinChannel(str);
    }
}
