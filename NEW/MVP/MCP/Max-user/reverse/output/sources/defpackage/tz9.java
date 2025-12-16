package defpackage;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class tz9 extends rz9 {
    public final qi8 c;
    public final q3b d;

    public tz9(qi8 qi8Var, q3b q3bVar) {
        super(1, 2);
        this.c = qi8Var;
        this.d = q3bVar;
    }

    @Override // defpackage.rz9
    public final void a(pk6 pk6Var) {
        wqi.c("Migration_1_2", "start", new Object[0]);
        m73 m73Var = new m73(this.d);
        ArrayList arrayList = new ArrayList();
        pk6Var.l();
        try {
            Cursor cursorK0 = pk6Var.k0("SELECT * FROM chats");
            try {
                int columnIndex = cursorK0.getColumnIndex("id");
                int columnIndex2 = cursorK0.getColumnIndex("data");
                while (cursorK0.moveToNext()) {
                    if (!cursorK0.isNull(columnIndex2)) {
                        long j = cursorK0.getLong(columnIndex);
                        try {
                            arrayList.add(new Long[]{Long.valueOf(m73Var.c(cursorK0.getBlob(columnIndex2)).l), Long.valueOf(j)});
                        } catch (Throwable unused) {
                            wqi.q("Migration_1_2", "could not parse blob for chat #" + j, new Object[0]);
                        }
                    }
                }
                cursorK0.close();
            } finally {
            }
        } finally {
            try {
            } finally {
            }
        }
        if (arrayList.isEmpty()) {
            pk6Var.l0();
            wqi.c("Migration_1_2", "no data, finished!", new Object[0]);
            return;
        }
        pk6Var.Q("DROP INDEX IF EXISTS index_chats_server_id");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_chats_server_id` ON `chats` (`server_id`)");
        pk6Var.Q("ALTER TABLE chats ADD COLUMN cid INTEGER NOT NULL DEFAULT 0");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_chats_cid` ON `chats` (`cid`)");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pk6Var.Z("UPDATE chats SET cid = ? WHERE id = ?", (Long[]) it.next());
        }
        pk6Var.Q("CREATE TABLE IF NOT EXISTS `temp_messages` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `server_id` INTEGER NOT NULL, `time` INTEGER NOT NULL, `update_time` INTEGER NOT NULL, `sender` INTEGER NOT NULL, `cid` INTEGER NOT NULL, `text` TEXT, `delivery_status` INTEGER NOT NULL, `status` INTEGER NOT NULL, `time_local` INTEGER NOT NULL, `error` TEXT, `localized_error` TEXT, `attaches` BLOB, `media_type` INTEGER NOT NULL, `detect_share` INTEGER NOT NULL, `msg_link_type` INTEGER NOT NULL, `msg_link_id` INTEGER NOT NULL, `inserted_from_msg_link` INTEGER NOT NULL, `msg_link_chat_id` INTEGER NOT NULL, `msg_link_chat_name` TEXT, `msg_link_chat_link` TEXT, `msg_link_out_chat_id` INTEGER NOT NULL, `msg_link_out_msg_id` INTEGER NOT NULL, `type` INTEGER NOT NULL, `chat_id` INTEGER NOT NULL, `ttl` INTEGER NOT NULL, `channel_views` INTEGER NOT NULL, `channel_forwards` INTEGER NOT NULL, `view_time` INTEGER NOT NULL, `zoom` INTEGER NOT NULL, `options` INTEGER NOT NULL, `live_until` INTEGER NOT NULL, `constructor_id` INTEGER NOT NULL, `elements` BLOB NOT NULL, `reactions` BLOB, `delayed_attrs_time_to_fire` INTEGER, `delayed_attrs_notify_sender` INTEGER, FOREIGN KEY(`chat_id`) REFERENCES `chats`(`id`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        pk6Var.Q("INSERT INTO temp_messages SELECT * FROM messages");
        pk6Var.Q("DROP TABLE messages");
        pk6Var.Q("ALTER TABLE temp_messages RENAME TO messages");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_chat_id` ON `messages` (`chat_id`)");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_cid` ON `messages` (`cid`)");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_server_id` ON `messages` (`server_id`)");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_time` ON `messages` (`chat_id`, `time`)");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_chat_id_media_type` ON `messages` (`chat_id`, `media_type`)");
        pk6Var.Q("CREATE INDEX IF NOT EXISTS `index_messages_delayed_attrs_time_to_fire_delayed_attrs_notify_sender` ON `messages` (`delayed_attrs_time_to_fire`, `delayed_attrs_notify_sender`)");
        pk6Var.l0();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "Migration_1_2", "finish! migrate " + arrayList.size() + " chats", null);
            }
        }
    }
}
