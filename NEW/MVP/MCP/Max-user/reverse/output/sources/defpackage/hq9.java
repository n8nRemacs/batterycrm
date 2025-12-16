package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class hq9 extends j3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq9(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "UPDATE messages SET update_time = ? WHERE id = ?";
            case 1:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time <= ?";
            case 2:
                return "UPDATE messages SET status = ? WHERE chat_id = ? AND time >= ? AND time <= ?";
            case 3:
                return "UPDATE messages SET channel_views = ?, channel_forwards = ? WHERE server_id = ?";
            case 4:
                return "UPDATE messages SET reactions = ?, reactions_update_time = ? WHERE server_id = ?";
            case 5:
                return "UPDATE messages SET delayed_attrs_time_to_fire = ? AND delayed_attrs_notify_sender = ? WHERE id = ?";
            case 6:
                return "DELETE FROM messages WHERE chat_id = ?";
            case 7:
                return "DELETE FROM messages";
            case 8:
                return "DELETE FROM messages WHERE chat_id = ? AND time <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NULL AND delayed_attrs_notify_sender IS NULL";
            case 9:
                return "DELETE FROM messages WHERE chat_id = ? AND delayed_attrs_time_to_fire <= ? AND inserted_from_msg_link = 0 AND delayed_attrs_time_to_fire IS NOT NULL AND delayed_attrs_notify_sender IS NOT NULL";
            case 10:
                return "DELETE FROM messages WHERE chat_id = ? AND server_id = 0 AND time_local >= ? AND time_local <= ?";
            case 11:
                return "DELETE FROM messages WHERE media_type = ?";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "UPDATE messages  SET delivery_status = ? WHERE chat_id = ? AND sender = ? AND time <= ? AND delivery_status = ? AND inserted_from_msg_link = 0 AND status <> ?";
            case 13:
                return "UPDATE messages SET chat_id = ? WHERE id = ?";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "DELETE FROM fcm_notifications WHERE time <= ?";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "DELETE FROM fcm_notifications WHERE time <= ? AND chat_id = ?";
            case 16:
                return "DELETE FROM fcm_notifications WHERE chat_id = ? AND message_id = ?";
            case LangUtils.HASH_SEED /* 17 */:
                return "DELETE FROM fcm_notifications";
            case 18:
                return "DELETE FROM fcm_notifications WHERE chat_id = ?";
            case 19:
                return "DELETE FROM notifications_read_marks";
            case 20:
                return "DELETE FROM notifications_tracker_messages WHERE time<=?";
            case 21:
                return "DELETE FROM notifications_tracker_messages";
            case 22:
                return "UPDATE phones SET server_phone = ?, type = ? WHERE phone = ?";
            case 23:
                return "DELETE FROM phones";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "DELETE FROM phones WHERE id = ?";
            case 25:
                return "DELETE FROM profile";
            case 26:
                return "DELETE FROM reactions_section";
            case 27:
                return "DELETE FROM recent";
            case 28:
                return "DELETE FROM chat_folder";
            default:
                return "DELETE FROM folder_and_chats WHERE folderId = ?";
        }
    }
}
