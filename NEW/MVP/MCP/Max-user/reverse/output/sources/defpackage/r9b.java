package defpackage;

import android.database.SQLException;
import androidx.work.impl.WorkDatabase_Impl;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.apache.http.cookie.ClientCookie;
import org.webrtc.MediaStreamTrack;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase_Impl;

/* loaded from: classes2.dex */
public final class r9b extends oy {
    public final /* synthetic */ int c = 1;
    public final /* synthetic */ lrd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9b(WorkDatabase_Impl workDatabase_Impl) {
        super(16, 5);
        this.d = workDatabase_Impl;
    }

    private final lm9 w(pk6 pk6Var) throws IOException {
        HashMap map = new HashMap(13);
        map.put("attach_local_id", new myf(0, 1, "attach_local_id", "TEXT", null, false));
        map.put("prepared_path", new myf(0, 1, "prepared_path", "TEXT", null, false));
        map.put("file_name", new myf(0, 1, "file_name", "TEXT", null, false));
        map.put("upload_url", new myf(0, 1, "upload_url", "TEXT", null, false));
        map.put("upload_progress", new myf(0, 1, "upload_progress", "REAL", null, true));
        map.put("total_bytes", new myf(0, 1, "total_bytes", "INTEGER", null, true));
        map.put("upload_status", new myf(0, 1, "upload_status", "INTEGER", null, false));
        map.put("created_time", new myf(0, 1, "created_time", "INTEGER", null, true));
        map.put(ClientCookie.PATH_ATTR, new myf(1, 1, ClientCookie.PATH_ATTR, "TEXT", null, true));
        map.put("last_modified", new myf(2, 1, "last_modified", "INTEGER", null, true));
        map.put("upload_type", new myf(3, 1, "upload_type", "INTEGER", null, true));
        map.put("photo_token", new myf(0, 1, "photo_token", "TEXT", null, false));
        qyf qyfVar = new qyf("uploads", map, a9h.i(map, "attach_id", new myf(0, 1, "attach_id", "INTEGER", null, false), 0), new HashSet(0));
        qyf qyfVarA = qyf.a(pk6Var, "uploads");
        if (!qyfVar.equals(qyfVarA)) {
            return new lm9(false, a9h.f("uploads(ru.ok.tamtam.android.upload.UploadDb).\n Expected:\n", qyfVar, "\n Found:\n", qyfVarA));
        }
        HashMap map2 = new HashMap(10);
        map2.put(ClientCookie.PATH_ATTR, new myf(0, 1, ClientCookie.PATH_ATTR, "TEXT", null, false));
        map2.put("last_modified", new myf(0, 1, "last_modified", "INTEGER", null, true));
        map2.put("upload_type", new myf(0, 1, "upload_type", "INTEGER", null, false));
        map2.put("message_id", new myf(1, 1, "message_id", "INTEGER", null, true));
        map2.put("chat_id", new myf(2, 1, "chat_id", "INTEGER", null, true));
        map2.put("attach_id", new myf(3, 1, "attach_id", "TEXT", null, true));
        map2.put("video_quality", new myf(0, 1, "video_quality", "INTEGER", null, false));
        map2.put("video_start_trim_position", new myf(0, 1, "video_start_trim_position", "REAL", null, false));
        map2.put("video_end_trim_position", new myf(0, 1, "video_end_trim_position", "REAL", null, false));
        qyf qyfVar2 = new qyf("message_uploads", map2, a9h.i(map2, "mute", new myf(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        qyf qyfVarA2 = qyf.a(pk6Var, "message_uploads");
        if (!qyfVar2.equals(qyfVarA2)) {
            return new lm9(false, a9h.f("message_uploads(ru.ok.tamtam.android.upload.message.MessageUploadDb).\n Expected:\n", qyfVar2, "\n Found:\n", qyfVarA2));
        }
        HashMap map3 = new HashMap(8);
        map3.put("finished", new myf(0, 1, "finished", "INTEGER", null, true));
        map3.put("prepared_path", new myf(0, 1, "prepared_path", "TEXT", null, false));
        map3.put("result_path", new myf(0, 1, "result_path", "TEXT", null, false));
        map3.put("source_uri", new myf(1, 1, "source_uri", "TEXT", null, true));
        map3.put("quality", new myf(2, 1, "quality", "INTEGER", null, true));
        map3.put("start_trim_position", new myf(3, 1, "start_trim_position", "REAL", null, true));
        map3.put("end_trim_position", new myf(4, 1, "end_trim_position", "REAL", null, true));
        qyf qyfVar3 = new qyf("video_conversions", map3, a9h.i(map3, "mute", new myf(5, 1, "mute", "INTEGER", "false", true), 0), new HashSet(0));
        qyf qyfVarA3 = qyf.a(pk6Var, "video_conversions");
        if (!qyfVar3.equals(qyfVarA3)) {
            return new lm9(false, a9h.f("video_conversions(ru.ok.tamtam.android.video.converter.VideoConversionDb).\n Expected:\n", qyfVar3, "\n Found:\n", qyfVarA3));
        }
        HashMap map4 = new HashMap(9);
        map4.put("latitude", new myf(0, 1, "latitude", "REAL", null, true));
        map4.put("longitude", new myf(0, 1, "longitude", "REAL", null, true));
        map4.put("altitude", new myf(0, 1, "altitude", "REAL", "0", true));
        map4.put("accuracy", new myf(0, 1, "accuracy", "REAL", "0", true));
        map4.put("bearing", new myf(0, 1, "bearing", "REAL", "0", true));
        map4.put("speed", new myf(0, 1, "speed", "REAL", "0", true));
        map4.put("device_id", new myf(0, 1, "device_id", "TEXT", null, true));
        map4.put("contact_server_id", new myf(1, 1, "contact_server_id", "INTEGER", null, true));
        qyf qyfVar4 = new qyf("contact_location", map4, a9h.i(map4, "time", new myf(2, 1, "time", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA4 = qyf.a(pk6Var, "contact_location");
        if (!qyfVar4.equals(qyfVarA4)) {
            return new lm9(false, a9h.f("contact_location(ru.ok.tamtam.android.location.live.model.ContactLocationDb).\n Expected:\n", qyfVar4, "\n Found:\n", qyfVarA4));
        }
        HashMap map5 = new HashMap(8);
        map5.put("message_time", new myf(0, 1, "message_time", "INTEGER", null, true));
        map5.put("live_period", new myf(0, 1, "live_period", "INTEGER", null, true));
        map5.put("start_time", new myf(0, 1, "start_time", "INTEGER", null, true));
        map5.put("end_time", new myf(0, 1, "end_time", "INTEGER", null, true));
        map5.put("device_id", new myf(0, 1, "device_id", "TEXT", null, true));
        map5.put("contact_server_id", new myf(1, 1, "contact_server_id", "INTEGER", null, true));
        map5.put("chat_id", new myf(2, 1, "chat_id", "INTEGER", null, true));
        qyf qyfVar5 = new qyf("chat_location", map5, a9h.i(map5, "message_id", new myf(3, 1, "message_id", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA5 = qyf.a(pk6Var, "chat_location");
        if (!qyfVar5.equals(qyfVarA5)) {
            return new lm9(false, a9h.f("chat_location(ru.ok.tamtam.android.location.live.model.ChatLocationDb).\n Expected:\n", qyfVar5, "\n Found:\n", qyfVarA5));
        }
        HashMap map6 = new HashMap(9);
        map6.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map6.put(SdkMetricStatEvent.NAME_KEY, new myf(0, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, false));
        map6.put("icon_url", new myf(0, 1, "icon_url", "TEXT", null, false));
        map6.put("author_id", new myf(0, 1, "author_id", "INTEGER", null, true));
        map6.put("created_time", new myf(0, 1, "created_time", "INTEGER", null, true));
        map6.put("updated_time", new myf(0, 1, "updated_time", "INTEGER", null, true));
        map6.put("link", new myf(0, 1, "link", "TEXT", null, true));
        map6.put("stickers", new myf(0, 1, "stickers", "TEXT", null, true));
        qyf qyfVar6 = new qyf("sticker_sets", map6, a9h.i(map6, "draft", new myf(0, 1, "draft", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA6 = qyf.a(pk6Var, "sticker_sets");
        if (!qyfVar6.equals(qyfVarA6)) {
            return new lm9(false, a9h.f("sticker_sets(ru.ok.tamtam.android.stickers.sets.StickerSetDb).\n Expected:\n", qyfVar6, "\n Found:\n", qyfVarA6));
        }
        HashMap map7 = new HashMap(2);
        map7.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        qyf qyfVar7 = new qyf("favorite_sticker_sets", map7, a9h.i(map7, "index", new myf(0, 1, "index", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA7 = qyf.a(pk6Var, "favorite_sticker_sets");
        if (!qyfVar7.equals(qyfVarA7)) {
            return new lm9(false, a9h.f("favorite_sticker_sets(ru.ok.tamtam.android.stickers.sets.favorite.FavoriteStickerSetDb).\n Expected:\n", qyfVar7, "\n Found:\n", qyfVarA7));
        }
        HashMap map8 = new HashMap(2);
        map8.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        qyf qyfVar8 = new qyf("favorite_stickers", map8, a9h.i(map8, "index", new myf(0, 1, "index", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA8 = qyf.a(pk6Var, "favorite_stickers");
        if (!qyfVar8.equals(qyfVarA8)) {
            return new lm9(false, a9h.f("favorite_stickers(ru.ok.tamtam.android.stickers.favorite.FavoriteStickerDb).\n Expected:\n", qyfVar8, "\n Found:\n", qyfVarA8));
        }
        HashMap map9 = new HashMap(8);
        map9.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map9.put("recent_type", new myf(0, 1, "recent_type", "INTEGER", null, true));
        map9.put("recent_time", new myf(0, 1, "recent_time", "INTEGER", null, true));
        map9.put("server_id", new myf(0, 1, "server_id", "INTEGER", "0", true));
        map9.put("sticker_id", new myf(0, 1, "sticker_id", "INTEGER", null, false));
        map9.put("emoji", new myf(0, 1, "emoji", "TEXT", null, false));
        map9.put("gif", new myf(0, 1, "gif", "BLOB", null, false));
        qyf qyfVar9 = new qyf("recent", map9, a9h.i(map9, "gif_id", new myf(0, 1, "gif_id", "INTEGER", null, false), 0), new HashSet(0));
        qyf qyfVarA9 = qyf.a(pk6Var, "recent");
        if (!qyfVar9.equals(qyfVarA9)) {
            return new lm9(false, a9h.f("recent(ru.ok.tamtam.android.stickers.recents.RecentDb).\n Expected:\n", qyfVar9, "\n Found:\n", qyfVarA9));
        }
        HashMap map10 = new HashMap(2);
        map10.put("emoji", new myf(1, 1, "emoji", "TEXT", null, true));
        qyf qyfVar10 = new qyf("default_emoji", map10, a9h.i(map10, "default_value", new myf(0, 1, "default_value", "TEXT", null, true), 0), new HashSet(0));
        qyf qyfVarA10 = qyf.a(pk6Var, "default_emoji");
        if (!qyfVar10.equals(qyfVarA10)) {
            return new lm9(false, a9h.f("default_emoji(ru.ok.tamtam.android.stickers.emoji.DefaultEmojiDb).\n Expected:\n", qyfVar10, "\n Found:\n", qyfVarA10));
        }
        HashMap map11 = new HashMap(13);
        map11.put("chat_id", new myf(1, 1, "chat_id", "INTEGER", null, true));
        map11.put("message_id", new myf(2, 1, "message_id", "INTEGER", null, true));
        map11.put("type", new myf(0, 1, "type", "TEXT", null, true));
        map11.put("chat_title", new myf(0, 1, "chat_title", "TEXT", null, false));
        map11.put("sender_user_name", new myf(0, 1, "sender_user_name", "TEXT", null, false));
        map11.put("sender_user_id", new myf(0, 1, "sender_user_id", "INTEGER", null, true));
        map11.put("time", new myf(0, 1, "time", "INTEGER", null, true));
        map11.put("text", new myf(0, 1, "text", "TEXT", null, true));
        map11.put("push_id", new myf(0, 1, "push_id", "INTEGER", null, true));
        map11.put("event_key", new myf(0, 1, "event_key", "TEXT", null, false));
        map11.put("large_image_url", new myf(0, 1, "large_image_url", "TEXT", "NULL", false));
        map11.put("fire_m", new myf(0, 1, "fire_m", "INTEGER", "0", true));
        qyf qyfVar11 = new qyf("fcm_notifications", map11, a9h.i(map11, "has_any_error", new myf(0, 1, "has_any_error", "INTEGER", "0", true), 0), new HashSet(0));
        qyf qyfVarA11 = qyf.a(pk6Var, "fcm_notifications");
        if (!qyfVar11.equals(qyfVarA11)) {
            return new lm9(false, a9h.f("fcm_notifications(ru.ok.tamtam.android.notifications.messages.newpush.fcm.storage.model.FcmNotification).\n Expected:\n", qyfVar11, "\n Found:\n", qyfVarA11));
        }
        HashMap map12 = new HashMap(2);
        map12.put("chat_id", new myf(1, 1, "chat_id", "INTEGER", null, true));
        qyf qyfVar12 = new qyf("fcm_notifications_history", map12, a9h.i(map12, "last_notify_msg_id", new myf(0, 1, "last_notify_msg_id", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA12 = qyf.a(pk6Var, "fcm_notifications_history");
        if (!qyfVar12.equals(qyfVarA12)) {
            return new lm9(false, a9h.f("fcm_notifications_history(ru.ok.tamtam.android.notifications.messages.newpush.fcm.history.model.FcmNotificationHistoryDb).\n Expected:\n", qyfVar12, "\n Found:\n", qyfVarA12));
        }
        HashMap map13 = new HashMap(13);
        map13.put("push_id", new myf(0, 1, "push_id", "INTEGER", null, true));
        map13.put("chat_id", new myf(1, 1, "chat_id", "INTEGER", null, true));
        map13.put("msg_id", new myf(2, 1, "msg_id", "INTEGER", null, true));
        map13.put("analytics_status", new myf(0, 1, "analytics_status", "INTEGER", null, true));
        map13.put("suid", new myf(0, 1, "suid", "INTEGER", null, false));
        map13.put("content_length", new myf(0, 1, "content_length", "INTEGER", null, true));
        map13.put("sent_time", new myf(0, 1, "sent_time", "INTEGER", null, false));
        map13.put("event_key", new myf(0, 1, "event_key", "TEXT", null, false));
        map13.put("fcm_sent_time", new myf(0, 1, "fcm_sent_time", "INTEGER", null, true));
        map13.put("received_time", new myf(0, 1, "received_time", "INTEGER", null, true));
        map13.put("push_type", new myf(0, 1, "push_type", "TEXT", null, true));
        map13.put("time", new myf(0, 1, "time", "INTEGER", null, true));
        qyf qyfVar13 = new qyf("fcm_notifications_analytics", map13, a9h.i(map13, "created_time", new myf(0, 1, "created_time", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA13 = qyf.a(pk6Var, "fcm_notifications_analytics");
        if (!qyfVar13.equals(qyfVarA13)) {
            return new lm9(false, a9h.f("fcm_notifications_analytics(ru.ok.tamtam.android.notifications.messages.newpush.fcm.analytics.model.FcmAnalyticsEntryDb).\n Expected:\n", qyfVar13, "\n Found:\n", qyfVarA13));
        }
        HashMap map14 = new HashMap(2);
        map14.put("chat_id", new myf(1, 1, "chat_id", "INTEGER", null, true));
        qyf qyfVar14 = new qyf("notifications_read_marks", map14, a9h.i(map14, "mark", new myf(0, 1, "mark", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA14 = qyf.a(pk6Var, "notifications_read_marks");
        if (!qyfVar14.equals(qyfVarA14)) {
            return new lm9(false, a9h.f("notifications_read_marks(ru.ok.tamtam.android.notifications.messages.newpush.readmarks.model.NotificationReadMarkDb).\n Expected:\n", qyfVar14, "\n Found:\n", qyfVarA14));
        }
        HashMap map15 = new HashMap(5);
        map15.put("chat_id", new myf(2, 1, "chat_id", "INTEGER", null, true));
        map15.put("message_id", new myf(1, 1, "message_id", "INTEGER", null, true));
        map15.put("time", new myf(0, 1, "time", "INTEGER", null, true));
        map15.put("fcm", new myf(0, 1, "fcm", "INTEGER", null, false));
        qyf qyfVar15 = new qyf("notifications_tracker_messages", map15, a9h.i(map15, "drop_reason", new myf(0, 1, "drop_reason", "TEXT", null, false), 0), new HashSet(0));
        qyf qyfVarA15 = qyf.a(pk6Var, "notifications_tracker_messages");
        if (!qyfVar15.equals(qyfVarA15)) {
            return new lm9(false, a9h.f("notifications_tracker_messages(ru.ok.tamtam.android.notifications.messages.tracker.storage.model.NotificationsTrackerMessageDb).\n Expected:\n", qyfVar15, "\n Found:\n", qyfVarA15));
        }
        HashMap map16 = new HashMap(9);
        map16.put(ClientCookie.PATH_ATTR, new myf(0, 1, ClientCookie.PATH_ATTR, "TEXT", null, true));
        map16.put("last_modified", new myf(0, 1, "last_modified", "INTEGER", null, true));
        map16.put("upload_type", new myf(0, 1, "upload_type", "INTEGER", null, true));
        map16.put("chat_id", new myf(1, 1, "chat_id", "INTEGER", null, true));
        map16.put("attach_id", new myf(2, 1, "attach_id", "TEXT", null, true));
        map16.put("video_quality", new myf(0, 1, "video_quality", "INTEGER", null, false));
        map16.put("video_start_trim_position", new myf(0, 1, "video_start_trim_position", "REAL", null, false));
        map16.put("video_end_trim_position", new myf(0, 1, "video_end_trim_position", "REAL", null, false));
        qyf qyfVar16 = new qyf("draft_uploads", map16, a9h.i(map16, "mute", new myf(0, 1, "mute", "INTEGER", "false", false), 0), new HashSet(0));
        qyf qyfVarA16 = qyf.a(pk6Var, "draft_uploads");
        if (!qyfVar16.equals(qyfVarA16)) {
            return new lm9(false, a9h.f("draft_uploads(ru.ok.tamtam.android.upload.draft.DraftUploadDb).\n Expected:\n", qyfVar16, "\n Found:\n", qyfVarA16));
        }
        HashMap map17 = new HashMap(14);
        map17.put("id", new myf(1, 1, "id", "TEXT", null, true));
        map17.put("title", new myf(0, 1, "title", "TEXT", null, true));
        map17.put("order", new myf(0, 1, "order", "INTEGER", null, true));
        map17.put("emoji", new myf(0, 1, "emoji", "TEXT", "NULL", false));
        map17.put("filters", new myf(0, 1, "filters", "TEXT", null, true));
        map17.put("isHiddenForAllFolder", new myf(0, 1, "isHiddenForAllFolder", "INTEGER", null, true));
        map17.put("elements", new myf(0, 1, "elements", "BLOB", "NULL", false));
        map17.put("filterSubjects", new myf(0, 1, "filterSubjects", "BLOB", "NULL", false));
        map17.put("widgets", new myf(0, 1, "widgets", "BLOB", "NULL", false));
        map17.put("options", new myf(0, 1, "options", "BLOB", "NULL", false));
        map17.put("updateTime", new myf(0, 1, "updateTime", "INTEGER", "0", true));
        map17.put("favorites", new myf(0, 1, "favorites", "BLOB", "NULL", false));
        map17.put("templateId", new myf(0, 1, "templateId", "INTEGER", "NULL", false));
        HashSet hashSetI = a9h.i(map17, "sourceId", new myf(0, 1, "sourceId", "INTEGER", "NULL", false), 0);
        HashSet hashSet = new HashSet(1);
        hashSet.add(new pyf("index_chat_folder_filters", false, Arrays.asList("filters"), Arrays.asList("ASC")));
        qyf qyfVar17 = new qyf("chat_folder", map17, hashSetI, hashSet);
        qyf qyfVarA17 = qyf.a(pk6Var, "chat_folder");
        if (!qyfVar17.equals(qyfVarA17)) {
            return new lm9(false, a9h.f("chat_folder(ru.ok.tamtam.android.folders.db.RoomChatFolder).\n Expected:\n", qyfVar17, "\n Found:\n", qyfVarA17));
        }
        HashMap map18 = new HashMap(2);
        map18.put(ApiProtocol.PARAM_CHAT_ID, new myf(1, 1, ApiProtocol.PARAM_CHAT_ID, "INTEGER", null, true));
        qyf qyfVar18 = new qyf("folder_and_chats", map18, a9h.i(map18, "folderId", new myf(2, 1, "folderId", "TEXT", null, true), 0), new HashSet(0));
        qyf qyfVarA18 = qyf.a(pk6Var, "folder_and_chats");
        if (!qyfVar18.equals(qyfVarA18)) {
            return new lm9(false, a9h.f("folder_and_chats(ru.ok.tamtam.android.folders.db.ChatAndFolderCrossRef).\n Expected:\n", qyfVar18, "\n Found:\n", qyfVarA18));
        }
        HashMap map19 = new HashMap(2);
        map19.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        qyf qyfVar19 = new qyf("selected_mentions", map19, a9h.i(map19, "selectedMentionType", new myf(0, 1, "selectedMentionType", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA19 = qyf.a(pk6Var, "selected_mentions");
        if (!qyfVar19.equals(qyfVarA19)) {
            return new lm9(false, a9h.f("selected_mentions(ru.ok.tamtam.mentions.SelectedMention).\n Expected:\n", qyfVar19, "\n Found:\n", qyfVarA19));
        }
        HashSet hashSet2 = new HashSet(5);
        hashSet2.add("normalizedTitle");
        hashSet2.add("originalTitle");
        hashSet2.add("normalizedTitleWithoutEmoji");
        hashSet2.add("originalTitleWithoutEmoji");
        hashSet2.add("sortTime");
        yl6 yl6Var = new yl6("chat_title", hashSet2, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)");
        yl6 yl6VarA = yl6.a(pk6Var, "chat_title");
        if (!yl6Var.equals(yl6VarA)) {
            return new lm9(false, "chat_title(ru.ok.tamtam.android.chat.ChatTitle).\n Expected:\n" + yl6Var + "\n Found:\n" + yl6VarA);
        }
        HashSet hashSet3 = new HashSet(5);
        hashSet3.add("link");
        hashSet3.add("allNormalizedTitles");
        hashSet3.add("allOriginalTitles");
        hashSet3.add("allNormalizedTitlesWithoutEmoji");
        hashSet3.add("allOriginalTitlesWithoutEmoji");
        yl6 yl6Var2 = new yl6("contact_title", hashSet3, "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)");
        yl6 yl6VarA2 = yl6.a(pk6Var, "contact_title");
        if (!yl6Var2.equals(yl6VarA2)) {
            return new lm9(false, "contact_title(ru.ok.tamtam.android.contacts.ContactTitle).\n Expected:\n" + yl6Var2 + "\n Found:\n" + yl6VarA2);
        }
        HashMap map20 = new HashMap(33);
        map20.put("uuid", new myf(1, 1, "uuid", "TEXT", null, true));
        map20.put("uniqueWorkName", new myf(0, 1, "uniqueWorkName", "TEXT", null, true));
        map20.put("existingWorkPolicy", new myf(0, 1, "existingWorkPolicy", "TEXT", null, true));
        map20.put("tags", new myf(0, 1, "tags", "TEXT", null, true));
        map20.put("time", new myf(0, 1, "time", "INTEGER", null, true));
        map20.put("state", new myf(0, 1, "state", "INTEGER", "0", true));
        map20.put("work_spec_id", new myf(0, 1, "work_spec_id", "TEXT", null, true));
        map20.put("work_spec_state", new myf(0, 1, "work_spec_state", "INTEGER", null, true));
        map20.put("work_spec_worker_class_name", new myf(0, 1, "work_spec_worker_class_name", "TEXT", null, true));
        map20.put("work_spec_input_merger_class_name", new myf(0, 1, "work_spec_input_merger_class_name", "TEXT", null, false));
        map20.put("work_spec_input", new myf(0, 1, "work_spec_input", "BLOB", null, true));
        map20.put("work_spec_output", new myf(0, 1, "work_spec_output", "BLOB", null, true));
        map20.put("work_spec_initial_delay", new myf(0, 1, "work_spec_initial_delay", "INTEGER", null, true));
        map20.put("work_spec_interval_duration", new myf(0, 1, "work_spec_interval_duration", "INTEGER", null, true));
        map20.put("work_spec_flex_duration", new myf(0, 1, "work_spec_flex_duration", "INTEGER", null, true));
        map20.put("work_spec_run_attempt_count", new myf(0, 1, "work_spec_run_attempt_count", "INTEGER", null, true));
        map20.put("work_spec_backoff_policy", new myf(0, 1, "work_spec_backoff_policy", "INTEGER", null, true));
        map20.put("work_spec_backoff_delay_duration", new myf(0, 1, "work_spec_backoff_delay_duration", "INTEGER", null, true));
        map20.put("work_spec_last_enqueue_time", new myf(0, 1, "work_spec_last_enqueue_time", "INTEGER", null, true));
        map20.put("work_spec_minimum_retention_duration", new myf(0, 1, "work_spec_minimum_retention_duration", "INTEGER", null, true));
        map20.put("work_spec_schedule_requested_at", new myf(0, 1, "work_spec_schedule_requested_at", "INTEGER", null, true));
        map20.put("work_spec_run_in_foreground", new myf(0, 1, "work_spec_run_in_foreground", "INTEGER", null, true));
        map20.put("work_spec_out_of_quota_policy", new myf(0, 1, "work_spec_out_of_quota_policy", "INTEGER", null, true));
        map20.put("work_spec_period_count", new myf(0, 1, "work_spec_period_count", "INTEGER", "0", true));
        map20.put("work_spec_generation", new myf(0, 1, "work_spec_generation", "INTEGER", "0", true));
        map20.put("work_spec_required_network_type", new myf(0, 1, "work_spec_required_network_type", "INTEGER", null, true));
        map20.put("work_spec_requires_charging", new myf(0, 1, "work_spec_requires_charging", "INTEGER", null, true));
        map20.put("work_spec_requires_device_idle", new myf(0, 1, "work_spec_requires_device_idle", "INTEGER", null, true));
        map20.put("work_spec_requires_battery_not_low", new myf(0, 1, "work_spec_requires_battery_not_low", "INTEGER", null, true));
        map20.put("work_spec_requires_storage_not_low", new myf(0, 1, "work_spec_requires_storage_not_low", "INTEGER", null, true));
        map20.put("work_spec_trigger_content_update_delay", new myf(0, 1, "work_spec_trigger_content_update_delay", "INTEGER", null, true));
        map20.put("work_spec_trigger_max_content_delay", new myf(0, 1, "work_spec_trigger_max_content_delay", "INTEGER", null, true));
        HashSet hashSetI2 = a9h.i(map20, "work_spec_content_uri_triggers", new myf(0, 1, "work_spec_content_uri_triggers", "BLOB", null, true), 0);
        HashSet hashSet4 = new HashSet(4);
        hashSet4.add(new pyf("index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration", true, Arrays.asList("uniqueWorkName", "work_spec_interval_duration"), Arrays.asList("ASC", "ASC")));
        hashSet4.add(new pyf("index_WorkerQueueItem_work_spec_schedule_requested_at", false, Arrays.asList("work_spec_schedule_requested_at"), Arrays.asList("ASC")));
        hashSet4.add(new pyf("index_WorkerQueueItem_work_spec_last_enqueue_time", false, Arrays.asList("work_spec_last_enqueue_time"), Arrays.asList("ASC")));
        hashSet4.add(new pyf("index_WorkerQueueItem_time", false, Arrays.asList("time"), Arrays.asList("ASC")));
        qyf qyfVar20 = new qyf("WorkerQueueItem", map20, hashSetI2, hashSet4);
        qyf qyfVarA20 = qyf.a(pk6Var, "WorkerQueueItem");
        if (!qyfVar20.equals(qyfVarA20)) {
            return new lm9(false, a9h.f("WorkerQueueItem(androidx.work.impl.model.WorkerQueueItem).\n Expected:\n", qyfVar20, "\n Found:\n", qyfVarA20));
        }
        HashMap map21 = new HashMap(8);
        map21.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map21.put("type", new myf(0, 1, "type", "INTEGER", null, true));
        map21.put("status", new myf(0, 1, "status", "INTEGER", null, true));
        map21.put("fails_count", new myf(0, 1, "fails_count", "INTEGER", null, true));
        map21.put("depends_request_id", new myf(0, 1, "depends_request_id", "INTEGER", null, true));
        map21.put("dependency_type", new myf(0, 1, "dependency_type", "INTEGER", null, true));
        map21.put("data", new myf(0, 1, "data", "BLOB", null, true));
        qyf qyfVar21 = new qyf("tasks", map21, a9h.i(map21, "created_time", new myf(0, 1, "created_time", "INTEGER", null, true), 0), new HashSet(0));
        qyf qyfVarA21 = qyf.a(pk6Var, "tasks");
        if (!qyfVar21.equals(qyfVarA21)) {
            return new lm9(false, a9h.f("tasks(one.me.sdk.tasks.db.TaskEntity).\n Expected:\n", qyfVar21, "\n Found:\n", qyfVarA21));
        }
        HashMap map22 = new HashMap(5);
        map22.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map22.put("server_id", new myf(0, 1, "server_id", "INTEGER", null, true));
        map22.put("presence", new myf(0, 1, "presence", "INTEGER", null, true));
        map22.put("presence_type", new myf(0, 1, "presence_type", "INTEGER", null, true));
        HashSet hashSetI3 = a9h.i(map22, "data", new myf(0, 1, "data", "BLOB", null, true), 0);
        HashSet hashSet5 = new HashSet(1);
        hashSet5.add(new pyf("index_contacts_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        qyf qyfVar22 = new qyf("contacts", map22, hashSetI3, hashSet5);
        qyf qyfVarA22 = qyf.a(pk6Var, "contacts");
        if (!qyfVar22.equals(qyfVarA22)) {
            return new lm9(false, a9h.f("contacts(ru.ok.tamtam.android.contacts.db.ContactEntity).\n Expected:\n", qyfVar22, "\n Found:\n", qyfVarA22));
        }
        HashMap map23 = new HashMap(10);
        map23.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map23.put("phonebook_id", new myf(0, 1, "phonebook_id", "INTEGER", null, true));
        map23.put("contact_id", new myf(0, 1, "contact_id", "INTEGER", null, true));
        map23.put("phone", new myf(0, 1, "phone", "TEXT", null, true));
        map23.put("server_phone", new myf(0, 1, "server_phone", "INTEGER", null, true));
        map23.put("email", new myf(0, 1, "email", "TEXT", null, false));
        map23.put("first_name", new myf(0, 1, "first_name", "TEXT", null, true));
        map23.put("last_name", new myf(0, 1, "last_name", "TEXT", null, false));
        map23.put("avatar_path", new myf(0, 1, "avatar_path", "TEXT", null, false));
        HashSet hashSetI4 = a9h.i(map23, "type", new myf(0, 1, "type", "INTEGER", null, true), 0);
        HashSet hashSet6 = new HashSet(3);
        hashSet6.add(new pyf("index_phones_phonebook_id", false, Arrays.asList("phonebook_id"), Arrays.asList("ASC")));
        hashSet6.add(new pyf("index_phones_type", false, Arrays.asList("type"), Arrays.asList("ASC")));
        hashSet6.add(new pyf("index_phones_server_phone", false, Arrays.asList("server_phone"), Arrays.asList("ASC")));
        qyf qyfVar23 = new qyf("phones", map23, hashSetI4, hashSet6);
        qyf qyfVarA23 = qyf.a(pk6Var, "phones");
        if (!qyfVar23.equals(qyfVarA23)) {
            return new lm9(false, a9h.f("phones(ru.ok.tamtam.android.phone.PhoneEntity).\n Expected:\n", qyfVar23, "\n Found:\n", qyfVarA23));
        }
        HashMap map24 = new HashMap(3);
        map24.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map24.put("timestamp", new myf(0, 1, "timestamp", "INTEGER", null, true));
        qyf qyfVar24 = new qyf("stat_events", map24, a9h.i(map24, "entry", new myf(0, 1, "entry", "BLOB", null, true), 0), new HashSet(0));
        qyf qyfVarA24 = qyf.a(pk6Var, "stat_events");
        if (!qyfVar24.equals(qyfVarA24)) {
            return new lm9(false, a9h.f("stat_events(ru.ok.tamtam.android.stats.StatEntity).\n Expected:\n", qyfVar24, "\n Found:\n", qyfVarA24));
        }
        HashMap map25 = new HashMap(16);
        map25.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map25.put("sticker_id", new myf(0, 1, "sticker_id", "INTEGER", null, true));
        map25.put("width", new myf(0, 1, "width", "INTEGER", null, true));
        map25.put("height", new myf(0, 1, "height", "INTEGER", null, true));
        map25.put(KwsFeaturesConfigProviderImpl.URL_KEY, new myf(0, 1, KwsFeaturesConfigProviderImpl.URL_KEY, "TEXT", null, false));
        map25.put("update_time", new myf(0, 1, "update_time", "INTEGER", null, true));
        map25.put("mp4_url", new myf(0, 1, "mp4_url", "TEXT", null, false));
        map25.put("first_url", new myf(0, 1, "first_url", "TEXT", null, false));
        map25.put("preview_url", new myf(0, 1, "preview_url", "TEXT", null, false));
        map25.put("tags", new myf(0, 1, "tags", "TEXT", null, true));
        map25.put("sticker_type", new myf(0, 1, "sticker_type", "INTEGER", null, true));
        map25.put("set_id", new myf(0, 1, "set_id", "INTEGER", null, true));
        map25.put("lottie_url", new myf(0, 1, "lottie_url", "TEXT", null, false));
        map25.put(MediaStreamTrack.AUDIO_TRACK_KIND, new myf(0, 1, MediaStreamTrack.AUDIO_TRACK_KIND, "INTEGER", null, true));
        map25.put("author_type", new myf(0, 1, "author_type", "INTEGER", null, true));
        qyf qyfVar25 = new qyf("stickers", map25, a9h.i(map25, "video_url", new myf(0, 1, "video_url", "TEXT", null, false), 0), new HashSet(0));
        qyf qyfVarA25 = qyf.a(pk6Var, "stickers");
        if (!qyfVar25.equals(qyfVarA25)) {
            return new lm9(false, a9h.f("stickers(ru.ok.tamtam.android.stickers.db.StickerEntity).\n Expected:\n", qyfVar25, "\n Found:\n", qyfVarA25));
        }
        HashMap map26 = new HashMap(6);
        map26.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map26.put("server_id", new myf(0, 1, "server_id", "INTEGER", null, true));
        map26.put("data", new myf(0, 1, "data", "BLOB", null, true));
        map26.put("favourite_index", new myf(0, 1, "favourite_index", "INTEGER", null, true));
        map26.put("sort_time", new myf(0, 1, "sort_time", "INTEGER", null, true));
        HashSet hashSetI5 = a9h.i(map26, "cid", new myf(0, 1, "cid", "INTEGER", "0", true), 0);
        HashSet hashSet7 = new HashSet(4);
        hashSet7.add(new pyf("index_chats_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        hashSet7.add(new pyf("index_chats_cid", false, Arrays.asList("cid"), Arrays.asList("ASC")));
        hashSet7.add(new pyf("index_chats_favourite_index", false, Arrays.asList("favourite_index"), Arrays.asList("ASC")));
        hashSet7.add(new pyf("index_chats_favourite_index_sort_time_id", false, Arrays.asList("favourite_index", "sort_time", "id"), Arrays.asList("ASC", "DESC", "DESC")));
        qyf qyfVar26 = new qyf("chats", map26, hashSetI5, hashSet7);
        qyf qyfVarA26 = qyf.a(pk6Var, "chats");
        if (!qyfVar26.equals(qyfVarA26)) {
            return new lm9(false, a9h.f("chats(ru.ok.tamtam.android.chat.ChatEntity).\n Expected:\n", qyfVar26, "\n Found:\n", qyfVarA26));
        }
        HashMap map27 = new HashMap(37);
        map27.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map27.put("server_id", new myf(0, 1, "server_id", "INTEGER", null, true));
        map27.put("time", new myf(0, 1, "time", "INTEGER", null, true));
        map27.put("update_time", new myf(0, 1, "update_time", "INTEGER", null, true));
        map27.put("sender", new myf(0, 1, "sender", "INTEGER", null, true));
        map27.put("cid", new myf(0, 1, "cid", "INTEGER", null, true));
        map27.put("text", new myf(0, 1, "text", "TEXT", null, false));
        map27.put("delivery_status", new myf(0, 1, "delivery_status", "INTEGER", null, true));
        map27.put("status", new myf(0, 1, "status", "INTEGER", null, true));
        map27.put("time_local", new myf(0, 1, "time_local", "INTEGER", null, true));
        map27.put(NegotiationErrorStat.KEY_ERROR, new myf(0, 1, NegotiationErrorStat.KEY_ERROR, "TEXT", null, false));
        map27.put("localized_error", new myf(0, 1, "localized_error", "TEXT", null, false));
        map27.put("attaches", new myf(0, 1, "attaches", "BLOB", null, false));
        map27.put("media_type", new myf(0, 1, "media_type", "INTEGER", null, true));
        map27.put("detect_share", new myf(0, 1, "detect_share", "INTEGER", null, true));
        map27.put("msg_link_type", new myf(0, 1, "msg_link_type", "INTEGER", null, true));
        map27.put("msg_link_id", new myf(0, 1, "msg_link_id", "INTEGER", null, true));
        map27.put("inserted_from_msg_link", new myf(0, 1, "inserted_from_msg_link", "INTEGER", null, true));
        map27.put("msg_link_chat_id", new myf(0, 1, "msg_link_chat_id", "INTEGER", null, true));
        map27.put("msg_link_chat_name", new myf(0, 1, "msg_link_chat_name", "TEXT", null, false));
        map27.put("msg_link_chat_link", new myf(0, 1, "msg_link_chat_link", "TEXT", null, false));
        map27.put("msg_link_chat_icon_url", new myf(0, 1, "msg_link_chat_icon_url", "TEXT", null, false));
        map27.put("msg_link_chat_access_type", new myf(0, 1, "msg_link_chat_access_type", "INTEGER", null, false));
        map27.put("msg_link_out_chat_id", new myf(0, 1, "msg_link_out_chat_id", "INTEGER", null, true));
        map27.put("msg_link_out_msg_id", new myf(0, 1, "msg_link_out_msg_id", "INTEGER", null, true));
        map27.put("type", new myf(0, 1, "type", "INTEGER", null, true));
        map27.put("chat_id", new myf(0, 1, "chat_id", "INTEGER", null, true));
        map27.put("channel_views", new myf(0, 1, "channel_views", "INTEGER", null, true));
        map27.put("channel_forwards", new myf(0, 1, "channel_forwards", "INTEGER", null, true));
        map27.put("view_time", new myf(0, 1, "view_time", "INTEGER", null, true));
        map27.put("options", new myf(0, 1, "options", "INTEGER", null, true));
        map27.put("live_until", new myf(0, 1, "live_until", "INTEGER", null, true));
        map27.put("elements", new myf(0, 1, "elements", "BLOB", null, true));
        map27.put("reactions", new myf(0, 1, "reactions", "BLOB", null, false));
        map27.put("delayed_attrs_time_to_fire", new myf(0, 1, "delayed_attrs_time_to_fire", "INTEGER", null, false));
        map27.put("delayed_attrs_notify_sender", new myf(0, 1, "delayed_attrs_notify_sender", "INTEGER", null, false));
        HashSet hashSetI6 = a9h.i(map27, "reactions_update_time", new myf(0, 1, "reactions_update_time", "INTEGER", "0", true), 1);
        hashSetI6.add(new nyf("chats", "NO ACTION", "NO ACTION", Arrays.asList("chat_id"), Arrays.asList("id")));
        HashSet hashSet8 = new HashSet(7);
        hashSet8.add(new pyf("index_messages_chat_id", false, Arrays.asList("chat_id"), Arrays.asList("ASC")));
        hashSet8.add(new pyf("index_messages_cid", false, Arrays.asList("cid"), Arrays.asList("ASC")));
        hashSet8.add(new pyf("index_messages_server_id", false, Arrays.asList("server_id"), Arrays.asList("ASC")));
        hashSet8.add(new pyf("index_messages_chat_id_time", false, Arrays.asList("chat_id", "time"), Arrays.asList("ASC", "ASC")));
        hashSet8.add(new pyf("index_messages_chat_id_media_type", false, Arrays.asList("chat_id", "media_type"), Arrays.asList("ASC", "ASC")));
        hashSet8.add(new pyf("index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender", false, Arrays.asList("delayed_attrs_time_to_fire", "delayed_attrs_notify_sender"), Arrays.asList("ASC", "ASC")));
        hashSet8.add(new pyf("index_messages_reactions_update_time", false, Arrays.asList("reactions_update_time"), Arrays.asList("ASC")));
        qyf qyfVar27 = new qyf("messages", map27, hashSetI6, hashSet8);
        qyf qyfVarA27 = qyf.a(pk6Var, "messages");
        if (!qyfVar27.equals(qyfVarA27)) {
            return new lm9(false, a9h.f("messages(ru.ok.tamtam.android.messages.MessageEntity).\n Expected:\n", qyfVar27, "\n Found:\n", qyfVarA27));
        }
        HashMap map28 = new HashMap(7);
        map28.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map28.put("update_time", new myf(0, 1, "update_time", "INTEGER", null, true));
        map28.put("emoji", new myf(0, 1, "emoji", "TEXT", null, true));
        map28.put("lottie_url", new myf(0, 1, "lottie_url", "TEXT", null, false));
        map28.put("lottie_play_url", new myf(0, 1, "lottie_play_url", "TEXT", null, false));
        map28.put("set_id", new myf(0, 1, "set_id", "INTEGER", null, false));
        qyf qyfVar28 = new qyf("animoji", map28, a9h.i(map28, "icon_url", new myf(0, 1, "icon_url", "TEXT", "NULL", false), 0), new HashSet(0));
        qyf qyfVarA28 = qyf.a(pk6Var, "animoji");
        if (!qyfVar28.equals(qyfVarA28)) {
            return new lm9(false, a9h.f("animoji(ru.ok.tamtam.android.animoji.db.AnimojiEntity).\n Expected:\n", qyfVar28, "\n Found:\n", qyfVarA28));
        }
        HashMap map29 = new HashMap(6);
        map29.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map29.put(SdkMetricStatEvent.NAME_KEY, new myf(0, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, true));
        map29.put("icon_url", new myf(0, 1, "icon_url", "TEXT", null, true));
        map29.put("icon_lottie_url", new myf(0, 1, "icon_lottie_url", "TEXT", null, false));
        map29.put("update_time", new myf(0, 1, "update_time", "INTEGER", null, true));
        qyf qyfVar29 = new qyf("animoji_set", map29, a9h.i(map29, "animoji_ids", new myf(0, 1, "animoji_ids", "TEXT", null, true), 0), new HashSet(0));
        qyf qyfVarA29 = qyf.a(pk6Var, "animoji_set");
        if (!qyfVar29.equals(qyfVarA29)) {
            return new lm9(false, a9h.f("animoji_set(ru.ok.tamtam.android.animoji.db.AnimojiSetEntity).\n Expected:\n", qyfVar29, "\n Found:\n", qyfVarA29));
        }
        HashMap map30 = new HashMap(3);
        map30.put("id", new myf(1, 1, "id", "TEXT", null, true));
        map30.put("update_time", new myf(0, 1, "update_time", "INTEGER", null, true));
        qyf qyfVar30 = new qyf("reactions_section", map30, a9h.i(map30, "reactions", new myf(0, 1, "reactions", "TEXT", null, true), 0), new HashSet(0));
        qyf qyfVarA30 = qyf.a(pk6Var, "reactions_section");
        if (!qyfVar30.equals(qyfVarA30)) {
            return new lm9(false, a9h.f("reactions_section(ru.ok.tamtam.android.animoji.db.ReactionsSectionEntity).\n Expected:\n", qyfVar30, "\n Found:\n", qyfVarA30));
        }
        HashMap map31 = new HashMap(2);
        map31.put("user_id", new myf(1, 1, "user_id", "INTEGER", null, true));
        HashSet hashSetI7 = a9h.i(map31, "chat_id", new myf(0, 1, "chat_id", "INTEGER", null, true), 0);
        HashSet hashSet9 = new HashSet(1);
        hashSet9.add(new pyf("index_saved_msg_chat_chat_id", true, Arrays.asList("chat_id"), Arrays.asList("ASC")));
        qyf qyfVar31 = new qyf("saved_msg_chat", map31, hashSetI7, hashSet9);
        qyf qyfVarA31 = qyf.a(pk6Var, "saved_msg_chat");
        if (!qyfVar31.equals(qyfVarA31)) {
            return new lm9(false, a9h.f("saved_msg_chat(ru.ok.tamtam.android.chat.SavedMessagesChatEntity).\n Expected:\n", qyfVar31, "\n Found:\n", qyfVarA31));
        }
        HashMap map32 = new HashMap(6);
        map32.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map32.put("user_id", new myf(0, 1, "user_id", "INTEGER", null, true));
        map32.put("bot_id", new myf(0, 1, "bot_id", "INTEGER", null, true));
        map32.put(ApiProtocol.KEY_TOKEN, new myf(0, 1, ApiProtocol.KEY_TOKEN, "TEXT", null, false));
        map32.put("access_requested", new myf(0, 1, "access_requested", "INTEGER", null, true));
        HashSet hashSetI8 = a9h.i(map32, "access_granted", new myf(0, 1, "access_granted", "INTEGER", null, true), 0);
        HashSet hashSet10 = new HashSet(2);
        hashSet10.add(new pyf("index_webapp_biometry_user_id", false, Arrays.asList("user_id"), Arrays.asList("ASC")));
        hashSet10.add(new pyf("index_webapp_biometry_bot_id", false, Arrays.asList("bot_id"), Arrays.asList("ASC")));
        qyf qyfVar32 = new qyf("webapp_biometry", map32, hashSetI8, hashSet10);
        qyf qyfVarA32 = qyf.a(pk6Var, "webapp_biometry");
        if (!qyfVar32.equals(qyfVarA32)) {
            return new lm9(false, a9h.f("webapp_biometry(ru.ok.tamtam.android.webapp.WebAppBiometryEntity).\n Expected:\n", qyfVar32, "\n Found:\n", qyfVarA32));
        }
        HashMap map33 = new HashMap(3);
        map33.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map33.put("server_id", new myf(0, 1, "server_id", "INTEGER", null, true));
        HashSet hashSetI9 = a9h.i(map33, "profile", new myf(0, 1, "profile", "BLOB", null, true), 0);
        HashSet hashSet11 = new HashSet(1);
        hashSet11.add(new pyf("index_profile_server_id", true, Arrays.asList("server_id"), Arrays.asList("ASC")));
        qyf qyfVar33 = new qyf("profile", map33, hashSetI9, hashSet11);
        qyf qyfVarA33 = qyf.a(pk6Var, "profile");
        if (!qyfVar33.equals(qyfVarA33)) {
            return new lm9(false, a9h.f("profile(ru.ok.tamtam.android.profile.db.ProfileEntity).\n Expected:\n", qyfVar33, "\n Found:\n", qyfVarA33));
        }
        HashMap map34 = new HashMap(3);
        map34.put("id", new myf(1, 1, "id", "INTEGER", null, true));
        map34.put("type_id", new myf(0, 1, "type_id", "INTEGER", null, true));
        qyf qyfVar34 = new qyf("complain_reasons", map34, a9h.i(map34, "complain_reasons", new myf(0, 1, "complain_reasons", "TEXT", null, true), 0), new HashSet(0));
        qyf qyfVarA34 = qyf.a(pk6Var, "complain_reasons");
        if (!qyfVar34.equals(qyfVarA34)) {
            return new lm9(false, a9h.f("complain_reasons(ru.ok.tamtam.android.complain.ComplainReasonsEntity).\n Expected:\n", qyfVar34, "\n Found:\n", qyfVarA34));
        }
        HashMap map35 = new HashMap(14);
        map35.put("id", new myf(1, 1, "id", "TEXT", null, true));
        map35.put("title", new myf(0, 1, "title", "TEXT", null, true));
        map35.put("is_title_animated", new myf(0, 1, "is_title_animated", "INTEGER", null, true));
        map35.put("description", new myf(0, 1, "description", "TEXT", null, false));
        map35.put(LogFactory.PRIORITY_KEY, new myf(0, 1, LogFactory.PRIORITY_KEY, "INTEGER", null, true));
        map35.put("repeat", new myf(0, 1, "repeat", "INTEGER", null, true));
        map35.put("rerun", new myf(0, 1, "rerun", "INTEGER", null, true));
        map35.put("animoji_id", new myf(0, 1, "animoji_id", "INTEGER", null, true));
        map35.put(KwsFeaturesConfigProviderImpl.URL_KEY, new myf(0, 1, KwsFeaturesConfigProviderImpl.URL_KEY, "TEXT", null, true));
        map35.put("type", new myf(0, 1, "type", "INTEGER", null, true));
        map35.put("click_time", new myf(0, 1, "click_time", "INTEGER", "0", true));
        map35.put("show_time", new myf(0, 1, "show_time", "INTEGER", "0", true));
        map35.put("close_time", new myf(0, 1, "close_time", "INTEGER", "0", true));
        qyf qyfVar35 = new qyf("informer_banner", map35, a9h.i(map35, "show_count", new myf(0, 1, "show_count", "INTEGER", "0", true), 0), new HashSet(0));
        qyf qyfVarA35 = qyf.a(pk6Var, "informer_banner");
        return !qyfVar35.equals(qyfVarA35) ? new lm9(false, a9h.f("informer_banner(ru.ok.tamtam.android.informer.InformerBannerEntity).\n Expected:\n", qyfVar35, "\n Found:\n", qyfVarA35)) : new lm9(true, null);
    }

    @Override // defpackage.oy
    public final void c(pk6 pk6Var) throws SQLException {
        switch (this.c) {
            case 0:
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `uploads` (`attach_local_id` TEXT, `prepared_path` TEXT, `file_name` TEXT, `upload_url` TEXT, `upload_progress` REAL NOT NULL, `total_bytes` INTEGER NOT NULL, `upload_status` INTEGER, `created_time` INTEGER NOT NULL, `path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `photo_token` TEXT, `attach_id` INTEGER, PRIMARY KEY(`path`, `last_modified`, `upload_type`))", "CREATE TABLE IF NOT EXISTS `message_uploads` (`path` TEXT, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER, `message_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`message_id`, `chat_id`, `attach_id`))", "CREATE TABLE IF NOT EXISTS `video_conversions` (`finished` INTEGER NOT NULL, `prepared_path` TEXT, `result_path` TEXT, `source_uri` TEXT NOT NULL, `quality` INTEGER NOT NULL, `start_trim_position` REAL NOT NULL, `end_trim_position` REAL NOT NULL, `mute` INTEGER NOT NULL DEFAULT false, PRIMARY KEY(`source_uri`, `quality`, `start_trim_position`, `end_trim_position`, `mute`))", "CREATE TABLE IF NOT EXISTS `contact_location` (`latitude` REAL NOT NULL, `longitude` REAL NOT NULL, `altitude` REAL NOT NULL DEFAULT 0, `accuracy` REAL NOT NULL DEFAULT 0, `bearing` REAL NOT NULL DEFAULT 0, `speed` REAL NOT NULL DEFAULT 0, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `time`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `chat_location` (`message_time` INTEGER NOT NULL, `live_period` INTEGER NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `device_id` TEXT NOT NULL, `contact_server_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, PRIMARY KEY(`contact_server_id`, `chat_id`, `message_id`))", "CREATE TABLE IF NOT EXISTS `sticker_sets` (`id` INTEGER NOT NULL, `name` TEXT, `icon_url` TEXT, `author_id` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, `updated_time` INTEGER NOT NULL, `link` TEXT NOT NULL, `stickers` TEXT NOT NULL, `draft` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `favorite_sticker_sets` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `favorite_stickers` (`id` INTEGER NOT NULL, `index` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `recent` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recent_type` INTEGER NOT NULL, `recent_time` INTEGER NOT NULL, `server_id` INTEGER NOT NULL DEFAULT 0, `sticker_id` INTEGER, `emoji` TEXT, `gif` BLOB, `gif_id` INTEGER)", "CREATE TABLE IF NOT EXISTS `default_emoji` (`emoji` TEXT NOT NULL, `default_value` TEXT NOT NULL, PRIMARY KEY(`emoji`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `type` TEXT NOT NULL, `chat_title` TEXT, `sender_user_name` TEXT, `sender_user_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `text` TEXT NOT NULL, `push_id` INTEGER NOT NULL, `event_key` TEXT, `large_image_url` TEXT DEFAULT NULL, `fire_m` INTEGER NOT NULL DEFAULT 0, `has_any_error` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`chat_id`, `message_id`))", "CREATE TABLE IF NOT EXISTS `fcm_notifications_history` (`chat_id` INTEGER NOT NULL, `last_notify_msg_id` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `fcm_notifications_analytics` (`push_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `msg_id` INTEGER NOT NULL, `analytics_status` INTEGER NOT NULL, `suid` INTEGER, `content_length` INTEGER NOT NULL, `sent_time` INTEGER, `event_key` TEXT, `fcm_sent_time` INTEGER NOT NULL, `received_time` INTEGER NOT NULL, `push_type` TEXT NOT NULL, `time` INTEGER NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`chat_id`, `msg_id`))", "CREATE TABLE IF NOT EXISTS `notifications_read_marks` (`chat_id` INTEGER NOT NULL, `mark` INTEGER NOT NULL, PRIMARY KEY(`chat_id`))", "CREATE TABLE IF NOT EXISTS `notifications_tracker_messages` (`chat_id` INTEGER NOT NULL, `message_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `fcm` INTEGER, `drop_reason` TEXT, PRIMARY KEY(`message_id`, `chat_id`))", "CREATE TABLE IF NOT EXISTS `draft_uploads` (`path` TEXT NOT NULL, `last_modified` INTEGER NOT NULL, `upload_type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `attach_id` TEXT NOT NULL, `video_quality` INTEGER, `video_start_trim_position` REAL, `video_end_trim_position` REAL, `mute` INTEGER DEFAULT false, PRIMARY KEY(`chat_id`, `attach_id`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `chat_folder` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `order` INTEGER NOT NULL, `emoji` TEXT DEFAULT NULL, `filters` TEXT NOT NULL, `isHiddenForAllFolder` INTEGER NOT NULL, `elements` BLOB DEFAULT NULL, `filterSubjects` BLOB DEFAULT NULL, `widgets` BLOB DEFAULT NULL, `options` BLOB DEFAULT NULL, `updateTime` INTEGER NOT NULL DEFAULT 0, `favorites` BLOB DEFAULT NULL, `templateId` INTEGER DEFAULT NULL, `sourceId` INTEGER DEFAULT NULL, PRIMARY KEY(`id`))", "CREATE INDEX IF NOT EXISTS `index_chat_folder_filters` ON `chat_folder` (`filters`)", "CREATE TABLE IF NOT EXISTS `folder_and_chats` (`chatId` INTEGER NOT NULL, `folderId` TEXT NOT NULL, PRIMARY KEY(`chatId`, `folderId`))", "CREATE TABLE IF NOT EXISTS `selected_mentions` (`id` INTEGER NOT NULL, `selectedMentionType` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                vb9.g(pk6Var, "CREATE VIRTUAL TABLE IF NOT EXISTS `chat_title` USING FTS4(`normalizedTitle` TEXT NOT NULL, `originalTitle` TEXT NOT NULL, `normalizedTitleWithoutEmoji` TEXT, `originalTitleWithoutEmoji` TEXT, `sortTime` INTEGER NOT NULL)", "CREATE VIRTUAL TABLE IF NOT EXISTS `contact_title` USING FTS4(`link` TEXT NOT NULL, `allNormalizedTitles` TEXT NOT NULL, `allOriginalTitles` TEXT NOT NULL, `allNormalizedTitlesWithoutEmoji` TEXT, `allOriginalTitlesWithoutEmoji` TEXT)", "CREATE TABLE IF NOT EXISTS `WorkerQueueItem` (`uuid` TEXT NOT NULL, `uniqueWorkName` TEXT NOT NULL, `existingWorkPolicy` TEXT NOT NULL, `tags` TEXT NOT NULL, `time` INTEGER NOT NULL, `state` INTEGER NOT NULL DEFAULT 0, `work_spec_id` TEXT NOT NULL, `work_spec_state` INTEGER NOT NULL, `work_spec_worker_class_name` TEXT NOT NULL, `work_spec_input_merger_class_name` TEXT, `work_spec_input` BLOB NOT NULL, `work_spec_output` BLOB NOT NULL, `work_spec_initial_delay` INTEGER NOT NULL, `work_spec_interval_duration` INTEGER NOT NULL, `work_spec_flex_duration` INTEGER NOT NULL, `work_spec_run_attempt_count` INTEGER NOT NULL, `work_spec_backoff_policy` INTEGER NOT NULL, `work_spec_backoff_delay_duration` INTEGER NOT NULL, `work_spec_last_enqueue_time` INTEGER NOT NULL, `work_spec_minimum_retention_duration` INTEGER NOT NULL, `work_spec_schedule_requested_at` INTEGER NOT NULL, `work_spec_run_in_foreground` INTEGER NOT NULL, `work_spec_out_of_quota_policy` INTEGER NOT NULL, `work_spec_period_count` INTEGER NOT NULL DEFAULT 0, `work_spec_generation` INTEGER NOT NULL DEFAULT 0, `work_spec_required_network_type` INTEGER NOT NULL, `work_spec_requires_charging` INTEGER NOT NULL, `work_spec_requires_device_idle` INTEGER NOT NULL, `work_spec_requires_battery_not_low` INTEGER NOT NULL, `work_spec_requires_storage_not_low` INTEGER NOT NULL, `work_spec_trigger_content_update_delay` INTEGER NOT NULL, `work_spec_trigger_max_content_delay` INTEGER NOT NULL, `work_spec_content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`uuid`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_WorkerQueueItem_uniqueWorkName_work_spec_interval_duration` ON `WorkerQueueItem` (`uniqueWorkName`, `work_spec_interval_duration`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_schedule_requested_at` ON `WorkerQueueItem` (`work_spec_schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_work_spec_last_enqueue_time` ON `WorkerQueueItem` (`work_spec_last_enqueue_time`)", "CREATE INDEX IF NOT EXISTS `index_WorkerQueueItem_time` ON `WorkerQueueItem` (`time`)", "CREATE TABLE IF NOT EXISTS `tasks` (`id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `status` INTEGER NOT NULL, `fails_count` INTEGER NOT NULL, `depends_request_id` INTEGER NOT NULL, `dependency_type` INTEGER NOT NULL, `data` BLOB NOT NULL, `created_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `contacts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `presence` INTEGER NOT NULL, `presence_type` INTEGER NOT NULL, `data` BLOB NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_contacts_server_id` ON `contacts` (`server_id`)", "CREATE TABLE IF NOT EXISTS `phones` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `phonebook_id` INTEGER NOT NULL, `contact_id` INTEGER NOT NULL, `phone` TEXT NOT NULL, `server_phone` INTEGER NOT NULL, `email` TEXT, `first_name` TEXT NOT NULL, `last_name` TEXT, `avatar_path` TEXT, `type` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_phones_phonebook_id` ON `phones` (`phonebook_id`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_phones_type` ON `phones` (`type`)", "CREATE INDEX IF NOT EXISTS `index_phones_server_phone` ON `phones` (`server_phone`)", "CREATE TABLE IF NOT EXISTS `stat_events` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `timestamp` INTEGER NOT NULL, `entry` BLOB NOT NULL)", "CREATE TABLE IF NOT EXISTS `stickers` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sticker_id` INTEGER NOT NULL, `width` INTEGER NOT NULL, `height` INTEGER NOT NULL, `url` TEXT, `update_time` INTEGER NOT NULL, `mp4_url` TEXT, `first_url` TEXT, `preview_url` TEXT, `tags` TEXT NOT NULL, `sticker_type` INTEGER NOT NULL, `set_id` INTEGER NOT NULL, `lottie_url` TEXT, `audio` INTEGER NOT NULL, `author_type` INTEGER NOT NULL, `video_url` TEXT)");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `chats` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `data` BLOB NOT NULL, `favourite_index` INTEGER NOT NULL, `sort_time` INTEGER NOT NULL, `cid` INTEGER NOT NULL DEFAULT 0)", "CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)", "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index` ON `chats` (`favourite_index`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_chats_favourite_index_sort_time_id` ON `chats` (`favourite_index` ASC, `sort_time` DESC, `id` DESC)", "CREATE TABLE IF NOT EXISTS `messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_chat_icon_url` TEXT, `msg_link_chat_access_type` INTEGER, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, `reactions_update_time` INTEGER NOT NULL DEFAULT 0, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)", "CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)", "CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_messages_reactions_update_time` ON `messages` (`reactions_update_time`)", "CREATE TABLE IF NOT EXISTS `animoji` (`id` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `emoji` TEXT NOT NULL, `lottie_url` TEXT, `lottie_play_url` TEXT, `set_id` INTEGER, `icon_url` TEXT DEFAULT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `animoji_set` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `icon_url` TEXT NOT NULL, `icon_lottie_url` TEXT, `update_time` INTEGER NOT NULL, `animoji_ids` TEXT NOT NULL, PRIMARY KEY(`id`))", "CREATE TABLE IF NOT EXISTS `reactions_section` (`id` TEXT NOT NULL, `update_time` INTEGER NOT NULL, `reactions` TEXT NOT NULL, PRIMARY KEY(`id`))");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `saved_msg_chat` (`user_id` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, PRIMARY KEY(`user_id`))", "CREATE UNIQUE INDEX IF NOT EXISTS `index_saved_msg_chat_chat_id` ON `saved_msg_chat` (`chat_id`)", "CREATE TABLE IF NOT EXISTS `webapp_biometry` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` INTEGER NOT NULL, `bot_id` INTEGER NOT NULL, `token` TEXT, `access_requested` INTEGER NOT NULL, `access_granted` INTEGER NOT NULL)", "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_user_id` ON `webapp_biometry` (`user_id`)");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_webapp_biometry_bot_id` ON `webapp_biometry` (`bot_id`)", "CREATE TABLE IF NOT EXISTS `profile` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `profile` BLOB NOT NULL)", "CREATE UNIQUE INDEX IF NOT EXISTS `index_profile_server_id` ON `profile` (`server_id`)", "CREATE TABLE IF NOT EXISTS `complain_reasons` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `type_id` INTEGER NOT NULL, `complain_reasons` TEXT NOT NULL)");
                pk6Var.Q("CREATE TABLE IF NOT EXISTS `informer_banner` (`id` TEXT NOT NULL, `title` TEXT NOT NULL, `is_title_animated` INTEGER NOT NULL, `description` TEXT, `priority` INTEGER NOT NULL, `repeat` INTEGER NOT NULL, `rerun` INTEGER NOT NULL, `animoji_id` INTEGER NOT NULL, `url` TEXT NOT NULL, `type` INTEGER NOT NULL, `click_time` INTEGER NOT NULL DEFAULT 0, `show_time` INTEGER NOT NULL DEFAULT 0, `close_time` INTEGER NOT NULL DEFAULT 0, `show_count` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                pk6Var.Q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                pk6Var.Q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '48b8c2473e2a69e00618d37c479a3bc4')");
                break;
            default:
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)", "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)", "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
                vb9.g(pk6Var, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)", "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)", "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
                vb9.g(pk6Var, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )", "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)", "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
                pk6Var.Q("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                pk6Var.Q("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                pk6Var.Q("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                break;
        }
    }

    @Override // defpackage.oy
    public final void d(pk6 pk6Var) throws SQLException {
        switch (this.c) {
            case 0:
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `uploads`", "DROP TABLE IF EXISTS `message_uploads`", "DROP TABLE IF EXISTS `video_conversions`", "DROP TABLE IF EXISTS `contact_location`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `chat_location`", "DROP TABLE IF EXISTS `sticker_sets`", "DROP TABLE IF EXISTS `favorite_sticker_sets`", "DROP TABLE IF EXISTS `favorite_stickers`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `recent`", "DROP TABLE IF EXISTS `default_emoji`", "DROP TABLE IF EXISTS `fcm_notifications`", "DROP TABLE IF EXISTS `fcm_notifications_history`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `fcm_notifications_analytics`", "DROP TABLE IF EXISTS `notifications_read_marks`", "DROP TABLE IF EXISTS `notifications_tracker_messages`", "DROP TABLE IF EXISTS `draft_uploads`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `chat_folder`", "DROP TABLE IF EXISTS `folder_and_chats`", "DROP TABLE IF EXISTS `selected_mentions`", "DROP TABLE IF EXISTS `chat_title`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `contact_title`", "DROP TABLE IF EXISTS `WorkerQueueItem`", "DROP TABLE IF EXISTS `tasks`", "DROP TABLE IF EXISTS `contacts`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `phones`", "DROP TABLE IF EXISTS `stat_events`", "DROP TABLE IF EXISTS `stickers`", "DROP TABLE IF EXISTS `chats`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `messages`", "DROP TABLE IF EXISTS `animoji`", "DROP TABLE IF EXISTS `animoji_set`", "DROP TABLE IF EXISTS `reactions_section`");
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `saved_msg_chat`", "DROP TABLE IF EXISTS `webapp_biometry`", "DROP TABLE IF EXISTS `profile`", "DROP TABLE IF EXISTS `complain_reasons`");
                pk6Var.Q("DROP TABLE IF EXISTS `informer_banner`");
                List list = ((OneMeRoomDatabase_Impl) this.d).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ja3) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                vb9.g(pk6Var, "DROP TABLE IF EXISTS `Dependency`", "DROP TABLE IF EXISTS `WorkSpec`", "DROP TABLE IF EXISTS `WorkTag`", "DROP TABLE IF EXISTS `SystemIdInfo`");
                pk6Var.Q("DROP TABLE IF EXISTS `WorkName`");
                pk6Var.Q("DROP TABLE IF EXISTS `WorkProgress`");
                pk6Var.Q("DROP TABLE IF EXISTS `Preference`");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((ja3) workDatabase_Impl.g.get(i)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void q() {
        switch (this.c) {
            case 0:
                List list = ((OneMeRoomDatabase_Impl) this.d).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ja3) it.next()).getClass();
                    }
                    break;
                }
                break;
            default:
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d;
                List list2 = workDatabase_Impl.g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((ja3) workDatabase_Impl.g.get(i)).getClass();
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void r(pk6 pk6Var) throws SQLException {
        switch (this.c) {
            case 0:
                ((OneMeRoomDatabase_Impl) this.d).a = pk6Var;
                pk6Var.Q("PRAGMA foreign_keys = ON");
                ((OneMeRoomDatabase_Impl) this.d).l(pk6Var);
                List list = ((OneMeRoomDatabase_Impl) this.d).g;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((ja3) it.next()).a(pk6Var);
                    }
                    break;
                }
                break;
            default:
                ((WorkDatabase_Impl) this.d).a = pk6Var;
                pk6Var.Q("PRAGMA foreign_keys = ON");
                ((WorkDatabase_Impl) this.d).l(pk6Var);
                List list2 = ((WorkDatabase_Impl) this.d).g;
                if (list2 != null) {
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        ((ja3) ((WorkDatabase_Impl) this.d).g.get(i)).a(pk6Var);
                    }
                    break;
                }
                break;
        }
    }

    @Override // defpackage.oy
    public final void t(pk6 pk6Var) throws IOException, SQLException {
        switch (this.c) {
            case 0:
                u7j.a(pk6Var);
                break;
            default:
                u7j.a(pk6Var);
                break;
        }
    }

    @Override // defpackage.oy
    public final lm9 u(pk6 pk6Var) throws IOException {
        switch (this.c) {
            case 0:
                return w(pk6Var);
            default:
                HashMap map = new HashMap(2);
                map.put("work_spec_id", new myf(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSetI = a9h.i(map, "prerequisite_id", new myf(2, 1, "prerequisite_id", "TEXT", null, true), 2);
                hashSetI.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                hashSetI.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
                HashSet hashSet = new HashSet(2);
                hashSet.add(new pyf("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                hashSet.add(new pyf("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
                qyf qyfVar = new qyf("Dependency", map, hashSetI, hashSet);
                qyf qyfVarA = qyf.a(pk6Var, "Dependency");
                if (!qyfVar.equals(qyfVarA)) {
                    return new lm9(false, a9h.f("Dependency(androidx.work.impl.model.Dependency).\n Expected:\n", qyfVar, "\n Found:\n", qyfVarA));
                }
                HashMap map2 = new HashMap(27);
                map2.put("id", new myf(1, 1, "id", "TEXT", null, true));
                map2.put("state", new myf(0, 1, "state", "INTEGER", null, true));
                map2.put("worker_class_name", new myf(0, 1, "worker_class_name", "TEXT", null, true));
                map2.put("input_merger_class_name", new myf(0, 1, "input_merger_class_name", "TEXT", null, false));
                map2.put("input", new myf(0, 1, "input", "BLOB", null, true));
                map2.put("output", new myf(0, 1, "output", "BLOB", null, true));
                map2.put("initial_delay", new myf(0, 1, "initial_delay", "INTEGER", null, true));
                map2.put("interval_duration", new myf(0, 1, "interval_duration", "INTEGER", null, true));
                map2.put("flex_duration", new myf(0, 1, "flex_duration", "INTEGER", null, true));
                map2.put("run_attempt_count", new myf(0, 1, "run_attempt_count", "INTEGER", null, true));
                map2.put("backoff_policy", new myf(0, 1, "backoff_policy", "INTEGER", null, true));
                map2.put("backoff_delay_duration", new myf(0, 1, "backoff_delay_duration", "INTEGER", null, true));
                map2.put("last_enqueue_time", new myf(0, 1, "last_enqueue_time", "INTEGER", null, true));
                map2.put("minimum_retention_duration", new myf(0, 1, "minimum_retention_duration", "INTEGER", null, true));
                map2.put("schedule_requested_at", new myf(0, 1, "schedule_requested_at", "INTEGER", null, true));
                map2.put("run_in_foreground", new myf(0, 1, "run_in_foreground", "INTEGER", null, true));
                map2.put("out_of_quota_policy", new myf(0, 1, "out_of_quota_policy", "INTEGER", null, true));
                map2.put("period_count", new myf(0, 1, "period_count", "INTEGER", "0", true));
                map2.put("generation", new myf(0, 1, "generation", "INTEGER", "0", true));
                map2.put("required_network_type", new myf(0, 1, "required_network_type", "INTEGER", null, true));
                map2.put("requires_charging", new myf(0, 1, "requires_charging", "INTEGER", null, true));
                map2.put("requires_device_idle", new myf(0, 1, "requires_device_idle", "INTEGER", null, true));
                map2.put("requires_battery_not_low", new myf(0, 1, "requires_battery_not_low", "INTEGER", null, true));
                map2.put("requires_storage_not_low", new myf(0, 1, "requires_storage_not_low", "INTEGER", null, true));
                map2.put("trigger_content_update_delay", new myf(0, 1, "trigger_content_update_delay", "INTEGER", null, true));
                map2.put("trigger_max_content_delay", new myf(0, 1, "trigger_max_content_delay", "INTEGER", null, true));
                HashSet hashSetI2 = a9h.i(map2, "content_uri_triggers", new myf(0, 1, "content_uri_triggers", "BLOB", null, true), 0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new pyf("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
                hashSet2.add(new pyf("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
                qyf qyfVar2 = new qyf("WorkSpec", map2, hashSetI2, hashSet2);
                qyf qyfVarA2 = qyf.a(pk6Var, "WorkSpec");
                if (!qyfVar2.equals(qyfVarA2)) {
                    return new lm9(false, a9h.f("WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n", qyfVar2, "\n Found:\n", qyfVarA2));
                }
                HashMap map3 = new HashMap(2);
                map3.put("tag", new myf(1, 1, "tag", "TEXT", null, true));
                HashSet hashSetI3 = a9h.i(map3, "work_spec_id", new myf(2, 1, "work_spec_id", "TEXT", null, true), 1);
                hashSetI3.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new pyf("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                qyf qyfVar3 = new qyf("WorkTag", map3, hashSetI3, hashSet3);
                qyf qyfVarA3 = qyf.a(pk6Var, "WorkTag");
                if (!qyfVar3.equals(qyfVarA3)) {
                    return new lm9(false, a9h.f("WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n", qyfVar3, "\n Found:\n", qyfVarA3));
                }
                HashMap map4 = new HashMap(3);
                map4.put("work_spec_id", new myf(1, 1, "work_spec_id", "TEXT", null, true));
                map4.put("generation", new myf(2, 1, "generation", "INTEGER", "0", true));
                HashSet hashSetI4 = a9h.i(map4, "system_id", new myf(0, 1, "system_id", "INTEGER", null, true), 1);
                hashSetI4.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                qyf qyfVar4 = new qyf("SystemIdInfo", map4, hashSetI4, new HashSet(0));
                qyf qyfVarA4 = qyf.a(pk6Var, "SystemIdInfo");
                if (!qyfVar4.equals(qyfVarA4)) {
                    return new lm9(false, a9h.f("SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n", qyfVar4, "\n Found:\n", qyfVarA4));
                }
                HashMap map5 = new HashMap(2);
                map5.put(SdkMetricStatEvent.NAME_KEY, new myf(1, 1, SdkMetricStatEvent.NAME_KEY, "TEXT", null, true));
                HashSet hashSetI5 = a9h.i(map5, "work_spec_id", new myf(2, 1, "work_spec_id", "TEXT", null, true), 1);
                hashSetI5.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new pyf("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
                qyf qyfVar5 = new qyf("WorkName", map5, hashSetI5, hashSet4);
                qyf qyfVarA5 = qyf.a(pk6Var, "WorkName");
                if (!qyfVar5.equals(qyfVarA5)) {
                    return new lm9(false, a9h.f("WorkName(androidx.work.impl.model.WorkName).\n Expected:\n", qyfVar5, "\n Found:\n", qyfVarA5));
                }
                HashMap map6 = new HashMap(2);
                map6.put("work_spec_id", new myf(1, 1, "work_spec_id", "TEXT", null, true));
                HashSet hashSetI6 = a9h.i(map6, "progress", new myf(0, 1, "progress", "BLOB", null, true), 1);
                hashSetI6.add(new nyf("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
                qyf qyfVar6 = new qyf("WorkProgress", map6, hashSetI6, new HashSet(0));
                qyf qyfVarA6 = qyf.a(pk6Var, "WorkProgress");
                if (!qyfVar6.equals(qyfVarA6)) {
                    return new lm9(false, a9h.f("WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n", qyfVar6, "\n Found:\n", qyfVarA6));
                }
                HashMap map7 = new HashMap(2);
                map7.put("key", new myf(1, 1, "key", "TEXT", null, true));
                qyf qyfVar7 = new qyf("Preference", map7, a9h.i(map7, "long_value", new myf(0, 1, "long_value", "INTEGER", null, false), 0), new HashSet(0));
                qyf qyfVarA7 = qyf.a(pk6Var, "Preference");
                return !qyfVar7.equals(qyfVarA7) ? new lm9(false, a9h.f("Preference(androidx.work.impl.model.Preference).\n Expected:\n", qyfVar7, "\n Found:\n", qyfVarA7)) : new lm9(true, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9b(OneMeRoomDatabase_Impl oneMeRoomDatabase_Impl) {
        super(23, 5);
        this.d = oneMeRoomDatabase_Impl;
    }
}
