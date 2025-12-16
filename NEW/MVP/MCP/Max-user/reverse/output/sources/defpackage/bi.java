package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class bi extends j3 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bi(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM animoji";
            case 1:
                return "DELETE FROM animoji_set";
            case 2:
                return "DELETE FROM chats WHERE id = ?";
            case 3:
                return "DELETE FROM chats";
            case 4:
                return "INSERT OR REPLACE INTO chat_title (docid, normalizedTitle, originalTitle, normalizedTitleWithoutEmoji, originalTitleWithoutEmoji, sortTime) VALUES(?, ?, ?, ?, ?, ?)";
            case 5:
                return "DELETE FROM chat_title WHERE docid=?";
            case 6:
                return "DELETE FROM chat_title";
            case 7:
                return "DELETE FROM complain_reasons";
            case 8:
                return "UPDATE contacts SET server_id = ?, data = ? WHERE id = ?";
            case 9:
                return "UPDATE contacts SET presence = ?, presence_type = ? WHERE server_id = ?";
            case 10:
                return "DELETE FROM contacts";
            case 11:
                return "INSERT OR REPLACE INTO contact_title (docid, link, allNormalizedTitles, allOriginalTitles, allNormalizedTitlesWithoutEmoji, allOriginalTitlesWithoutEmoji) VALUES(?, ?, ?, ?, ?, ?)";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "DELETE FROM contact_title WHERE docid=?";
            case 13:
                return "DELETE FROM contact_title";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "DELETE FROM default_emoji";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "DELETE FROM draft_uploads WHERE chat_id=? AND attach_id=?";
            case 16:
                return "DELETE FROM draft_uploads";
            case LangUtils.HASH_SEED /* 17 */:
                return "DELETE FROM favorite_sticker_sets";
            case 18:
                return "DELETE FROM favorite_stickers";
            case 19:
                return "DELETE FROM fcm_notifications_analytics";
            case 20:
                return "DELETE FROM fcm_notifications_analytics WHERE analytics_status=? AND chat_id=? AND time<=?";
            case 21:
                return "DELETE FROM fcm_notifications_analytics WHERE received_time<=?";
            case 22:
                return "DELETE FROM fcm_notifications_history";
            case 23:
                return "DELETE FROM informer_banner WHERE id = ?";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "DELETE FROM informer_banner";
            case 25:
                return "DELETE FROM message_uploads WHERE message_id=? AND chat_id=? AND attach_id=?";
            case 26:
                return "DELETE FROM message_uploads";
            case 27:
                return "UPDATE messages SET delivery_status = ? WHERE id = ?";
            case 28:
                return "UPDATE messages SET error = ? WHERE id = ?";
            default:
                return "UPDATE messages SET localized_error = ? WHERE id = ?";
        }
    }
}
