package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class crd extends j3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ crd(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO folder_and_chats VALUES (?, ?)";
            case 1:
                return "DELETE FROM folder_and_chats";
            case 2:
                return "UPDATE chat_folder SET title = ?, emoji = ? WHERE id = ?";
            case 3:
                return "DELETE FROM folder_and_chats WHERE chatId = ?";
            case 4:
                return "INSERT OR REPLACE INTO saved_msg_chat(user_id, chat_id) VALUES(?, ?)";
            case 5:
                return "DELETE FROM saved_msg_chat WHERE chat_id = ?";
            case 6:
                return "DELETE FROM saved_msg_chat";
            case 7:
                return "DELETE FROM stat_events";
            case 8:
                return "\n            DELETE FROM stat_events\n            WHERE timestamp < ?\n        ";
            case 9:
                return "DELETE FROM sticker_sets";
            case 10:
                return "DELETE FROM stickers";
            case 11:
                return "\n            DELETE FROM video_conversions \n            WHERE source_uri=? \n            AND quality=? \n            AND start_trim_position=? \n            AND end_trim_position=? \n            AND mute=?    \n        ";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "DELETE FROM video_conversions";
            case 13:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "UPDATE tasks SET status = ? WHERE id = ?";
            case 16:
                return "UPDATE tasks SET data = ? WHERE id = ?";
            case LangUtils.HASH_SEED /* 17 */:
                return "UPDATE tasks SET data = ?, status = ? WHERE id = ?";
            case 18:
                return "UPDATE tasks SET fails_count = fails_count + 1 WHERE id = ?";
            case 19:
                return "DELETE FROM tasks WHERE id = ?";
            case 20:
                return "DELETE FROM tasks";
            case 21:
                return "DELETE FROM tasks WHERE type = ?";
            case 22:
                return "DELETE FROM uploads WHERE path=? AND upload_type=? AND last_modified=?";
            case 23:
                return "DELETE FROM uploads WHERE attach_id=?";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "DELETE FROM uploads WHERE photo_token=?";
            case 25:
                return "DELETE FROM uploads";
            case 26:
                return "DELETE FROM video_conversions WHERE source_uri=? AND quality=? AND start_trim_position=? AND end_trim_position=? AND mute=?";
            case 27:
                return "DELETE FROM video_conversions";
            case 28:
                return "UPDATE webapp_biometry SET token = ? WHERE user_id = ? AND bot_id = ?";
            default:
                return "UPDATE webapp_biometry SET access_requested = ?, access_granted = ? WHERE user_id = ? AND bot_id = ?";
        }
    }
}
