package com.avito.android.persistence.messenger;

import V1.h;
import Z1.e;
import androidx.room.E0;
import androidx.room.RoomDatabase;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.messenger.message.MessageBody;
import com.huawei.hms.adapter.internal.CommonCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes15.dex */
public final class MessengerDatabase_Impl extends MessengerDatabase {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f215197x = 0;

    /* renamed from: n, reason: collision with root package name */
    public volatile N1 f215198n;

    /* renamed from: o, reason: collision with root package name */
    public volatile C33087l0 f215199o;

    /* renamed from: p, reason: collision with root package name */
    public volatile X f215200p;

    /* renamed from: q, reason: collision with root package name */
    public volatile O0 f215201q;

    /* renamed from: r, reason: collision with root package name */
    public volatile b3 f215202r;

    /* renamed from: s, reason: collision with root package name */
    public volatile W0 f215203s;

    /* renamed from: t, reason: collision with root package name */
    public volatile C33122u0 f215204t;

    /* renamed from: u, reason: collision with root package name */
    public volatile C33132w2 f215205u;

    /* renamed from: v, reason: collision with root package name */
    public volatile O2 f215206v;

    /* renamed from: w, reason: collision with root package name */
    public volatile F0 f215207w;

    public class a extends E0.b {
        public a() {
            super(57);
        }

        @Override // androidx.room.E0.b
        public final void a(@j.N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `message` (`local_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `remote_id` TEXT, `created` INTEGER NOT NULL, `type` TEXT NOT NULL, `user_id` TEXT NOT NULL, `from_id` TEXT NOT NULL, `json_body` TEXT NOT NULL, `is_read` INTEGER NOT NULL, `is_spam` INTEGER NOT NULL, `is_failed` INTEGER NOT NULL, `read_timestamp` INTEGER, `preview_text` TEXT, `is_supported` INTEGER NOT NULL, `is_complete` INTEGER NOT NULL, `is_read_status` TEXT NOT NULL, `read_locally_timestamp` INTEGER, `qm_id` TEXT, `qm_from_id` TEXT, `qm_type` TEXT, `qm_json_body` TEXT, `qm_created` INTEGER, `is_qm_body_complete` INTEGER, `qm_chunk_index` INTEGER, `x_hash` TEXT, `user_type` TEXT NOT NULL, `user_account_id` TEXT NOT NULL, `column_send_timestamp` INTEGER, PRIMARY KEY(`local_id`, `channel_id`, `user_id`, `user_type`))", "CREATE INDEX IF NOT EXISTS `index_message_remote_id` ON `message` (`remote_id`)", "CREATE INDEX IF NOT EXISTS `index_message_created` ON `message` (`created`)", "CREATE TABLE IF NOT EXISTS `channel_meta_data` (`local_user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `last_synced_message_timestamp` INTEGER, `sellers_suggests_enabled` INTEGER NOT NULL, `deleted_locally_timestamp` INTEGER, `local_user_type` TEXT NOT NULL, `local_user_account_id` TEXT NOT NULL, PRIMARY KEY(`local_user_id`, `channel_id`, `local_user_type`))");
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE UNIQUE INDEX IF NOT EXISTS `local_user_id_and_channel_id_and_local_user_type` ON `channel_meta_data` (`local_user_id`, `channel_id`, `local_user_type`)", "CREATE TABLE IF NOT EXISTS `channel` (`user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `type` TEXT NOT NULL, `created` INTEGER NOT NULL, `updated` INTEGER NOT NULL, `context_type` TEXT NOT NULL, `json_context` TEXT NOT NULL, `json_read_only_state` TEXT, `is_deleted` INTEGER NOT NULL, `is_read` INTEGER NOT NULL, `is_read_status` TEXT NOT NULL, `is_spam` INTEGER NOT NULL, `is_answered` INTEGER NOT NULL, `json_context_actions` TEXT, `flow` TEXT, `suspect_message_id` TEXT, `item_id` TEXT, `interlocutor_id` TEXT, `json_display_info` TEXT NOT NULL, `json_input_state` TEXT, `pin_order` INTEGER, `user_type` TEXT NOT NULL, PRIMARY KEY(`user_id`, `channel_id`, `user_type`))", "CREATE UNIQUE INDEX IF NOT EXISTS `user_id_and_channel_id` ON `channel` (`user_id`, `channel_id`, `user_type`)", "CREATE TABLE IF NOT EXISTS `user` (`local_user_id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `name` TEXT, `label` TEXT, `last_action_time` INTEGER, `time_diff` INTEGER, `json_public_profile` TEXT, `local_user_type` TEXT NOT NULL, PRIMARY KEY(`local_user_id`, `user_id`, `channel_id`, `local_user_type`))");
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE UNIQUE INDEX IF NOT EXISTS `user_and_channel_ids` ON `user` (`local_user_id`, `user_id`, `channel_id`, `local_user_type`)", "CREATE TABLE IF NOT EXISTS `draft` (`local_user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `interlocutor_id` TEXT NOT NULL, `text` TEXT NOT NULL, `local_user_type` TEXT NOT NULL, PRIMARY KEY(`local_user_id`, `channel_id`, `local_user_type`))", "CREATE TABLE IF NOT EXISTS `channel_tag` (`local_user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `tag` TEXT NOT NULL, `local_user_type` TEXT NOT NULL, PRIMARY KEY(`local_user_id`, `channel_id`, `tag`, `local_user_type`))", "CREATE INDEX IF NOT EXISTS `tag_local_user_id_and_channel_id` ON `channel_tag` (`local_user_id`, `channel_id`, `local_user_type`)");
            androidx.media3.exoplayer.analytics.m.o(bVar, "CREATE TABLE IF NOT EXISTS `message_meta_info` (`local_user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `local_message_id` TEXT NOT NULL, `path` TEXT, `internal_path` TEXT, `progress` INTEGER NOT NULL, `transfer_status` TEXT NOT NULL, `file_id` TEXT, `video_id` TEXT, `duration` INTEGER NOT NULL, `upload_session_id` TEXT, `size_in_bytes` INTEGER NOT NULL, `chunk_count` INTEGER NOT NULL, `original_file_name` TEXT, `resolution` TEXT, `extension` TEXT, `compression_failed` INTEGER NOT NULL, `file_hash` TEXT, `recorded_video_internal_path` TEXT, `local_user_type` TEXT NOT NULL, `local_user_account_id` TEXT NOT NULL, `local_file_chunks` TEXT, `local_voice_error` TEXT, PRIMARY KEY(`local_user_id`, `channel_id`, `local_message_id`, `local_user_type`))", "CREATE INDEX IF NOT EXISTS `index_message_meta_info_internal_path` ON `message_meta_info` (`internal_path`)", "CREATE TABLE IF NOT EXISTS `last_known_user` (`user_id` TEXT NOT NULL, `user_hash_id` TEXT NOT NULL, `user_hash_rotation_group` TEXT NOT NULL, PRIMARY KEY(`user_id`, `user_hash_rotation_group`))", "CREATE TABLE IF NOT EXISTS `message_upload_part` (`local_user_id` TEXT NOT NULL, `channel_id` TEXT NOT NULL, `local_message_id` TEXT NOT NULL, `part_number` INTEGER NOT NULL, `total_number_of_parts` INTEGER NOT NULL, `path` TEXT NOT NULL, `transfer_status` TEXT NOT NULL, `hash` TEXT, `e_tag` TEXT, `local_user_type` TEXT NOT NULL, PRIMARY KEY(`local_user_id`, `channel_id`, `local_message_id`, `part_number`, `local_user_type`))");
            bVar.P4("CREATE INDEX IF NOT EXISTS `index_message_upload_part_path` ON `message_upload_part` (`path`)");
            bVar.P4("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.P4("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '85cfba638a4571913bd9393d8d4d5046')");
        }

        @Override // androidx.room.E0.b
        public final void b(@j.N androidx.sqlite.db.framework.b bVar) {
            androidx.media3.exoplayer.analytics.m.o(bVar, "DROP TABLE IF EXISTS `message`", "DROP TABLE IF EXISTS `channel_meta_data`", "DROP TABLE IF EXISTS `channel`", "DROP TABLE IF EXISTS `user`");
            androidx.media3.exoplayer.analytics.m.o(bVar, "DROP TABLE IF EXISTS `draft`", "DROP TABLE IF EXISTS `channel_tag`", "DROP TABLE IF EXISTS `message_meta_info`", "DROP TABLE IF EXISTS `last_known_user`");
            bVar.P4("DROP TABLE IF EXISTS `message_upload_part`");
            int i12 = MessengerDatabase_Impl.f215197x;
            ArrayList arrayList = MessengerDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).a(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void c() {
            int i12 = MessengerDatabase_Impl.f215197x;
            ArrayList arrayList = MessengerDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).getClass();
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void d(@j.N androidx.sqlite.db.framework.b bVar) {
            MessengerDatabase_Impl messengerDatabase_Impl = MessengerDatabase_Impl.this;
            int i12 = MessengerDatabase_Impl.f215197x;
            messengerDatabase_Impl.f54297a = bVar;
            MessengerDatabase_Impl.this.m(bVar);
            ArrayList arrayList = MessengerDatabase_Impl.this.f54303g;
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.b) it.next()).b(bVar);
                }
            }
        }

        @Override // androidx.room.E0.b
        public final void e(@j.N androidx.sqlite.db.framework.b bVar) {
            V1.c.a(bVar);
        }

        @Override // androidx.room.E0.b
        @j.N
        public final E0.c f(@j.N androidx.sqlite.db.framework.b bVar) {
            HashMap map = new HashMap(28);
            map.put("local_id", new h.a(1, "local_id", "TEXT", null, true, 1));
            map.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map.put("remote_id", new h.a(0, "remote_id", "TEXT", null, false, 1));
            map.put("created", new h.a(0, "created", "INTEGER", null, true, 1));
            map.put("type", new h.a(0, "type", "TEXT", null, true, 1));
            map.put("user_id", new h.a(3, "user_id", "TEXT", null, true, 1));
            map.put("from_id", new h.a(0, "from_id", "TEXT", null, true, 1));
            map.put(CommonCode.MapKey.JSON_BODY, new h.a(0, CommonCode.MapKey.JSON_BODY, "TEXT", null, true, 1));
            map.put("is_read", new h.a(0, "is_read", "INTEGER", null, true, 1));
            map.put("is_spam", new h.a(0, "is_spam", "INTEGER", null, true, 1));
            map.put("is_failed", new h.a(0, "is_failed", "INTEGER", null, true, 1));
            map.put("read_timestamp", new h.a(0, "read_timestamp", "INTEGER", null, false, 1));
            map.put("preview_text", new h.a(0, "preview_text", "TEXT", null, false, 1));
            map.put("is_supported", new h.a(0, "is_supported", "INTEGER", null, true, 1));
            map.put("is_complete", new h.a(0, "is_complete", "INTEGER", null, true, 1));
            map.put("is_read_status", new h.a(0, "is_read_status", "TEXT", null, true, 1));
            map.put("read_locally_timestamp", new h.a(0, "read_locally_timestamp", "INTEGER", null, false, 1));
            map.put("qm_id", new h.a(0, "qm_id", "TEXT", null, false, 1));
            map.put("qm_from_id", new h.a(0, "qm_from_id", "TEXT", null, false, 1));
            map.put("qm_type", new h.a(0, "qm_type", "TEXT", null, false, 1));
            map.put("qm_json_body", new h.a(0, "qm_json_body", "TEXT", null, false, 1));
            map.put("qm_created", new h.a(0, "qm_created", "INTEGER", null, false, 1));
            map.put("is_qm_body_complete", new h.a(0, "is_qm_body_complete", "INTEGER", null, false, 1));
            map.put("qm_chunk_index", new h.a(0, "qm_chunk_index", "INTEGER", null, false, 1));
            map.put("x_hash", new h.a(0, "x_hash", "TEXT", null, false, 1));
            map.put("user_type", new h.a(4, "user_type", "TEXT", null, true, 1));
            map.put("user_account_id", new h.a(0, "user_account_id", "TEXT", null, true, 1));
            HashSet hashSetN = androidx.media3.exoplayer.analytics.m.n(map, "column_send_timestamp", new h.a(0, "column_send_timestamp", "INTEGER", null, false, 1), 0);
            HashSet hashSet = new HashSet(2);
            hashSet.add(new h.f("index_message_remote_id", false, Arrays.asList("remote_id"), Arrays.asList("ASC")));
            hashSet.add(new h.f("index_message_created", false, Arrays.asList("created"), Arrays.asList("ASC")));
            V1.h hVar = new V1.h("message", map, hashSetN, hashSet);
            V1.h hVarA = V1.h.a(bVar, "message");
            if (!hVar.equals(hVarA)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("message(com.avito.android.persistence.messenger.MessageEntity).\n Expected:\n", hVar, "\n Found:\n", hVarA));
            }
            HashMap map2 = new HashMap(7);
            map2.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map2.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map2.put("last_synced_message_timestamp", new h.a(0, "last_synced_message_timestamp", "INTEGER", null, false, 1));
            map2.put("sellers_suggests_enabled", new h.a(0, "sellers_suggests_enabled", "INTEGER", null, true, 1));
            map2.put("deleted_locally_timestamp", new h.a(0, "deleted_locally_timestamp", "INTEGER", null, false, 1));
            map2.put("local_user_type", new h.a(3, "local_user_type", "TEXT", null, true, 1));
            HashSet hashSetN2 = androidx.media3.exoplayer.analytics.m.n(map2, "local_user_account_id", new h.a(0, "local_user_account_id", "TEXT", null, true, 1), 0);
            HashSet hashSet2 = new HashSet(1);
            hashSet2.add(new h.f("local_user_id_and_channel_id_and_local_user_type", true, Arrays.asList("local_user_id", "channel_id", "local_user_type"), Arrays.asList("ASC", "ASC", "ASC")));
            V1.h hVar2 = new V1.h("channel_meta_data", map2, hashSetN2, hashSet2);
            V1.h hVarA2 = V1.h.a(bVar, "channel_meta_data");
            if (!hVar2.equals(hVarA2)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("channel_meta_data(com.avito.android.persistence.messenger.ChannelMetaInfo).\n Expected:\n", hVar2, "\n Found:\n", hVarA2));
            }
            HashMap map3 = new HashMap(22);
            map3.put("user_id", new h.a(1, "user_id", "TEXT", null, true, 1));
            map3.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map3.put("type", new h.a(0, "type", "TEXT", null, true, 1));
            map3.put("created", new h.a(0, "created", "INTEGER", null, true, 1));
            map3.put("updated", new h.a(0, "updated", "INTEGER", null, true, 1));
            map3.put("context_type", new h.a(0, "context_type", "TEXT", null, true, 1));
            map3.put("json_context", new h.a(0, "json_context", "TEXT", null, true, 1));
            map3.put("json_read_only_state", new h.a(0, "json_read_only_state", "TEXT", null, false, 1));
            map3.put("is_deleted", new h.a(0, "is_deleted", "INTEGER", null, true, 1));
            map3.put("is_read", new h.a(0, "is_read", "INTEGER", null, true, 1));
            map3.put("is_read_status", new h.a(0, "is_read_status", "TEXT", null, true, 1));
            map3.put("is_spam", new h.a(0, "is_spam", "INTEGER", null, true, 1));
            map3.put("is_answered", new h.a(0, "is_answered", "INTEGER", null, true, 1));
            map3.put("json_context_actions", new h.a(0, "json_context_actions", "TEXT", null, false, 1));
            map3.put(MessageBody.SystemMessageBody.Platform.FLOW, new h.a(0, MessageBody.SystemMessageBody.Platform.FLOW, "TEXT", null, false, 1));
            map3.put("suspect_message_id", new h.a(0, "suspect_message_id", "TEXT", null, false, 1));
            map3.put("item_id", new h.a(0, "item_id", "TEXT", null, false, 1));
            map3.put("interlocutor_id", new h.a(0, "interlocutor_id", "TEXT", null, false, 1));
            map3.put("json_display_info", new h.a(0, "json_display_info", "TEXT", null, true, 1));
            map3.put("json_input_state", new h.a(0, "json_input_state", "TEXT", null, false, 1));
            map3.put("pin_order", new h.a(0, "pin_order", "INTEGER", null, false, 1));
            HashSet hashSetN3 = androidx.media3.exoplayer.analytics.m.n(map3, "user_type", new h.a(3, "user_type", "TEXT", null, true, 1), 0);
            HashSet hashSet3 = new HashSet(1);
            hashSet3.add(new h.f("user_id_and_channel_id", true, Arrays.asList("user_id", "channel_id", "user_type"), Arrays.asList("ASC", "ASC", "ASC")));
            V1.h hVar3 = new V1.h("channel", map3, hashSetN3, hashSet3);
            V1.h hVarA3 = V1.h.a(bVar, "channel");
            if (!hVar3.equals(hVarA3)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("channel(com.avito.android.persistence.messenger.ChannelEntity).\n Expected:\n", hVar3, "\n Found:\n", hVarA3));
            }
            HashMap map4 = new HashMap(9);
            map4.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map4.put("user_id", new h.a(2, "user_id", "TEXT", null, true, 1));
            map4.put("channel_id", new h.a(3, "channel_id", "TEXT", null, true, 1));
            map4.put("name", new h.a(0, "name", "TEXT", null, false, 1));
            map4.put("label", new h.a(0, "label", "TEXT", null, false, 1));
            map4.put("last_action_time", new h.a(0, "last_action_time", "INTEGER", null, false, 1));
            map4.put("time_diff", new h.a(0, "time_diff", "INTEGER", null, false, 1));
            map4.put("json_public_profile", new h.a(0, "json_public_profile", "TEXT", null, false, 1));
            HashSet hashSetN4 = androidx.media3.exoplayer.analytics.m.n(map4, "local_user_type", new h.a(4, "local_user_type", "TEXT", null, true, 1), 0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new h.f("user_and_channel_ids", true, Arrays.asList("local_user_id", "user_id", "channel_id", "local_user_type"), Arrays.asList("ASC", "ASC", "ASC", "ASC")));
            V1.h hVar4 = new V1.h(ChannelContext.UserToUser.TYPE, map4, hashSetN4, hashSet4);
            V1.h hVarA4 = V1.h.a(bVar, ChannelContext.UserToUser.TYPE);
            if (!hVar4.equals(hVarA4)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("user(com.avito.android.persistence.messenger.UserEntity).\n Expected:\n", hVar4, "\n Found:\n", hVarA4));
            }
            HashMap map5 = new HashMap(5);
            map5.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map5.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map5.put("interlocutor_id", new h.a(0, "interlocutor_id", "TEXT", null, true, 1));
            map5.put("text", new h.a(0, "text", "TEXT", null, true, 1));
            V1.h hVar5 = new V1.h("draft", map5, androidx.media3.exoplayer.analytics.m.n(map5, "local_user_type", new h.a(3, "local_user_type", "TEXT", null, true, 1), 0), new HashSet(0));
            V1.h hVarA5 = V1.h.a(bVar, "draft");
            if (!hVar5.equals(hVarA5)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("draft(com.avito.android.persistence.messenger.DraftEntity).\n Expected:\n", hVar5, "\n Found:\n", hVarA5));
            }
            HashMap map6 = new HashMap(4);
            map6.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map6.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map6.put("tag", new h.a(3, "tag", "TEXT", null, true, 1));
            HashSet hashSetN5 = androidx.media3.exoplayer.analytics.m.n(map6, "local_user_type", new h.a(4, "local_user_type", "TEXT", null, true, 1), 0);
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new h.f("tag_local_user_id_and_channel_id", false, Arrays.asList("local_user_id", "channel_id", "local_user_type"), Arrays.asList("ASC", "ASC", "ASC")));
            V1.h hVar6 = new V1.h("channel_tag", map6, hashSetN5, hashSet5);
            V1.h hVarA6 = V1.h.a(bVar, "channel_tag");
            if (!hVar6.equals(hVarA6)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("channel_tag(com.avito.android.persistence.messenger.ChannelTag).\n Expected:\n", hVar6, "\n Found:\n", hVarA6));
            }
            HashMap map7 = new HashMap(23);
            map7.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map7.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map7.put("local_message_id", new h.a(3, "local_message_id", "TEXT", null, true, 1));
            map7.put("path", new h.a(0, "path", "TEXT", null, false, 1));
            map7.put("internal_path", new h.a(0, "internal_path", "TEXT", null, false, 1));
            map7.put("progress", new h.a(0, "progress", "INTEGER", null, true, 1));
            map7.put("transfer_status", new h.a(0, "transfer_status", "TEXT", null, true, 1));
            map7.put("file_id", new h.a(0, "file_id", "TEXT", null, false, 1));
            map7.put("video_id", new h.a(0, "video_id", "TEXT", null, false, 1));
            map7.put("duration", new h.a(0, "duration", "INTEGER", null, true, 1));
            map7.put("upload_session_id", new h.a(0, "upload_session_id", "TEXT", null, false, 1));
            map7.put("size_in_bytes", new h.a(0, "size_in_bytes", "INTEGER", null, true, 1));
            map7.put("chunk_count", new h.a(0, "chunk_count", "INTEGER", null, true, 1));
            map7.put("original_file_name", new h.a(0, "original_file_name", "TEXT", null, false, 1));
            map7.put(CommonCode.MapKey.HAS_RESOLUTION, new h.a(0, CommonCode.MapKey.HAS_RESOLUTION, "TEXT", null, false, 1));
            map7.put("extension", new h.a(0, "extension", "TEXT", null, false, 1));
            map7.put("compression_failed", new h.a(0, "compression_failed", "INTEGER", null, true, 1));
            map7.put("file_hash", new h.a(0, "file_hash", "TEXT", null, false, 1));
            map7.put("recorded_video_internal_path", new h.a(0, "recorded_video_internal_path", "TEXT", null, false, 1));
            map7.put("local_user_type", new h.a(4, "local_user_type", "TEXT", null, true, 1));
            map7.put("local_user_account_id", new h.a(0, "local_user_account_id", "TEXT", null, true, 1));
            map7.put("local_file_chunks", new h.a(0, "local_file_chunks", "TEXT", null, false, 1));
            HashSet hashSetN6 = androidx.media3.exoplayer.analytics.m.n(map7, "local_voice_error", new h.a(0, "local_voice_error", "TEXT", null, false, 1), 0);
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new h.f("index_message_meta_info_internal_path", false, Arrays.asList("internal_path"), Arrays.asList("ASC")));
            V1.h hVar7 = new V1.h("message_meta_info", map7, hashSetN6, hashSet6);
            V1.h hVarA7 = V1.h.a(bVar, "message_meta_info");
            if (!hVar7.equals(hVarA7)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("message_meta_info(com.avito.android.persistence.messenger.MessageMetaInfo).\n Expected:\n", hVar7, "\n Found:\n", hVarA7));
            }
            HashMap map8 = new HashMap(3);
            map8.put("user_id", new h.a(1, "user_id", "TEXT", null, true, 1));
            map8.put("user_hash_id", new h.a(0, "user_hash_id", "TEXT", null, true, 1));
            V1.h hVar8 = new V1.h("last_known_user", map8, androidx.media3.exoplayer.analytics.m.n(map8, "user_hash_rotation_group", new h.a(2, "user_hash_rotation_group", "TEXT", null, true, 1), 0), new HashSet(0));
            V1.h hVarA8 = V1.h.a(bVar, "last_known_user");
            if (!hVar8.equals(hVarA8)) {
                return new E0.c(false, androidx.media3.exoplayer.analytics.m.k("last_known_user(com.avito.android.persistence.messenger.LastKnownUserEntity).\n Expected:\n", hVar8, "\n Found:\n", hVarA8));
            }
            HashMap map9 = new HashMap(10);
            map9.put("local_user_id", new h.a(1, "local_user_id", "TEXT", null, true, 1));
            map9.put("channel_id", new h.a(2, "channel_id", "TEXT", null, true, 1));
            map9.put("local_message_id", new h.a(3, "local_message_id", "TEXT", null, true, 1));
            map9.put("part_number", new h.a(4, "part_number", "INTEGER", null, true, 1));
            map9.put("total_number_of_parts", new h.a(0, "total_number_of_parts", "INTEGER", null, true, 1));
            map9.put("path", new h.a(0, "path", "TEXT", null, true, 1));
            map9.put("transfer_status", new h.a(0, "transfer_status", "TEXT", null, true, 1));
            map9.put("hash", new h.a(0, "hash", "TEXT", null, false, 1));
            map9.put("e_tag", new h.a(0, "e_tag", "TEXT", null, false, 1));
            HashSet hashSetN7 = androidx.media3.exoplayer.analytics.m.n(map9, "local_user_type", new h.a(5, "local_user_type", "TEXT", null, true, 1), 0);
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new h.f("index_message_upload_part_path", false, Arrays.asList("path"), Arrays.asList("ASC")));
            V1.h hVar9 = new V1.h("message_upload_part", map9, hashSetN7, hashSet7);
            V1.h hVarA9 = V1.h.a(bVar, "message_upload_part");
            return !hVar9.equals(hVarA9) ? new E0.c(false, androidx.media3.exoplayer.analytics.m.k("message_upload_part(com.avito.android.persistence.messenger.MessageUploadPart).\n Expected:\n", hVar9, "\n Found:\n", hVarA9)) : new E0.c(true, null);
        }
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final Y0 A() {
        N1 n12;
        if (this.f215198n != null) {
            return this.f215198n;
        }
        synchronized (this) {
            try {
                if (this.f215198n == null) {
                    this.f215198n = new N1(this);
                }
                n12 = this.f215198n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return n12;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final R1 B() {
        C33132w2 c33132w2;
        if (this.f215205u != null) {
            return this.f215205u;
        }
        synchronized (this) {
            try {
                if (this.f215205u == null) {
                    this.f215205u = new C33132w2(this);
                }
                c33132w2 = this.f215205u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c33132w2;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final InterfaceC33140y2 C() {
        O2 o22;
        if (this.f215206v != null) {
            return this.f215206v;
        }
        synchronized (this) {
            try {
                if (this.f215206v == null) {
                    this.f215206v = new O2(this);
                }
                o22 = this.f215206v;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o22;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final Q2 D() {
        b3 b3Var;
        if (this.f215202r != null) {
            return this.f215202r;
        }
        synchronized (this) {
            try {
                if (this.f215202r == null) {
                    this.f215202r = new b3(this);
                }
                b3Var = this.f215202r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b3Var;
    }

    @Override // androidx.room.RoomDatabase
    public final void d() {
        a();
        Z1.d writableDatabase = i().getWritableDatabase();
        try {
            c();
            writableDatabase.P4("DELETE FROM `message`");
            writableDatabase.P4("DELETE FROM `channel_meta_data`");
            writableDatabase.P4("DELETE FROM `channel`");
            writableDatabase.P4("DELETE FROM `user`");
            writableDatabase.P4("DELETE FROM `draft`");
            writableDatabase.P4("DELETE FROM `channel_tag`");
            writableDatabase.P4("DELETE FROM `message_meta_info`");
            writableDatabase.P4("DELETE FROM `last_known_user`");
            writableDatabase.P4("DELETE FROM `message_upload_part`");
            s();
        } finally {
            l();
            writableDatabase.R5("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.e6()) {
                writableDatabase.P4("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final androidx.room.Y f() {
        return new androidx.room.Y(this, new HashMap(0), new HashMap(0), "message", "channel_meta_data", "channel", ChannelContext.UserToUser.TYPE, "draft", "channel_tag", "message_meta_info", "last_known_user", "message_upload_part");
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Z1.e g(@j.N androidx.room.C c12) {
        androidx.room.E0 e02 = new androidx.room.E0(c12, new a(), "85cfba638a4571913bd9393d8d4d5046", "c79517a6a505af02cc8d4c765dfc7c2d");
        e.b.a aVarA = e.b.a(c12.f54232a);
        aVarA.f19829b = c12.f54233b;
        aVarA.f19830c = e02;
        return c12.f54234c.c(aVarA.a());
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final List h() {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Set<Class<? extends androidx.room.migration.a>> j() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @j.N
    public final Map<Class<?>, List<Class<?>>> k() {
        HashMap map = new HashMap();
        map.put(Y0.class, Collections.emptyList());
        map.put(InterfaceC33043a0.class, Collections.emptyList());
        map.put(AbstractC33042a.class, Collections.emptyList());
        map.put(G0.class, Collections.emptyList());
        map.put(Q2.class, Collections.emptyList());
        map.put(S0.class, Collections.emptyList());
        map.put(InterfaceC33095n0.class, Collections.emptyList());
        map.put(R1.class, Collections.emptyList());
        map.put(InterfaceC33140y2.class, Collections.emptyList());
        map.put(InterfaceC33130w0.class, Collections.emptyList());
        return map;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final AbstractC33042a u() {
        X x12;
        if (this.f215200p != null) {
            return this.f215200p;
        }
        synchronized (this) {
            try {
                if (this.f215200p == null) {
                    this.f215200p = new X(this);
                }
                x12 = this.f215200p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x12;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final InterfaceC33043a0 v() {
        C33087l0 c33087l0;
        if (this.f215199o != null) {
            return this.f215199o;
        }
        synchronized (this) {
            try {
                if (this.f215199o == null) {
                    this.f215199o = new C33087l0(this);
                }
                c33087l0 = this.f215199o;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c33087l0;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final InterfaceC33095n0 w() {
        C33122u0 c33122u0;
        if (this.f215204t != null) {
            return this.f215204t;
        }
        synchronized (this) {
            try {
                if (this.f215204t == null) {
                    this.f215204t = new C33122u0(this);
                }
                c33122u0 = this.f215204t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c33122u0;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final InterfaceC33130w0 x() {
        F0 f02;
        if (this.f215207w != null) {
            return this.f215207w;
        }
        synchronized (this) {
            try {
                if (this.f215207w == null) {
                    this.f215207w = new F0(this);
                }
                f02 = this.f215207w;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f02;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final G0 y() {
        O0 o02;
        if (this.f215201q != null) {
            return this.f215201q;
        }
        synchronized (this) {
            try {
                if (this.f215201q == null) {
                    this.f215201q = new O0(this);
                }
                o02 = this.f215201q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return o02;
    }

    @Override // com.avito.android.persistence.messenger.MessengerDatabase
    public final S0 z() {
        W0 w02;
        if (this.f215203s != null) {
            return this.f215203s;
        }
        synchronized (this) {
            try {
                if (this.f215203s == null) {
                    this.f215203s = new W0(this);
                }
                w02 = this.f215203s;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w02;
    }
}
