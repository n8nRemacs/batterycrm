package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.a;

/* loaded from: classes2.dex */
public final class ai extends vg5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `animoji` (`id`,`update_time`,`emoji`,`lottie_url`,`lottie_play_url`,`set_id`,`icon_url`) VALUES (?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `animoji_set` (`id`,`name`,`icon_url`,`icon_lottie_url`,`update_time`,`animoji_ids`) VALUES (?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `complain_reasons` (`id`,`type_id`,`complain_reasons`) VALUES (nullif(?, 0),?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `contacts` (`id`,`server_id`,`presence`,`presence_type`,`data`) VALUES (nullif(?, 0),?,?,?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `default_emoji` (`emoji`,`default_value`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 6:
                return "INSERT OR REPLACE INTO `draft_uploads` (`path`,`last_modified`,`upload_type`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR REPLACE INTO `favorite_sticker_sets` (`id`,`index`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `favorite_stickers` (`id`,`index`) VALUES (?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `fcm_notifications_analytics` (`push_id`,`chat_id`,`msg_id`,`analytics_status`,`suid`,`content_length`,`sent_time`,`event_key`,`fcm_sent_time`,`received_time`,`push_type`,`time`,`created_time`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 10:
                return "INSERT OR REPLACE INTO `fcm_notifications_history` (`chat_id`,`last_notify_msg_id`) VALUES (?,?)";
            case 11:
                return "INSERT OR REPLACE INTO `informer_banner` (`id`,`title`,`is_title_animated`,`description`,`priority`,`repeat`,`rerun`,`animoji_id`,`url`,`type`,`click_time`,`show_time`,`close_time`,`show_count`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "INSERT OR REPLACE INTO `message_uploads` (`path`,`last_modified`,`upload_type`,`message_id`,`chat_id`,`attach_id`,`video_quality`,`video_start_trim_position`,`video_end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?,?,?)";
            case 13:
                return "INSERT OR REPLACE INTO `fcm_notifications` (`chat_id`,`message_id`,`type`,`chat_title`,`sender_user_name`,`sender_user_id`,`time`,`text`,`push_id`,`event_key`,`large_image_url`,`fire_m`,`has_any_error`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return "INSERT OR REPLACE INTO `notifications_read_marks` (`chat_id`,`mark`) VALUES (?,?)";
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return "INSERT OR IGNORE INTO `notifications_tracker_messages` (`chat_id`,`message_id`,`time`,`fcm`,`drop_reason`) VALUES (?,?,?,?,?)";
            case 16:
                return "INSERT OR ABORT INTO `phones` (`id`,`phonebook_id`,`contact_id`,`phone`,`server_phone`,`email`,`first_name`,`last_name`,`avatar_path`,`type`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
            case LangUtils.HASH_SEED /* 17 */:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 18:
                return "INSERT OR REPLACE INTO `profile` (`id`,`server_id`,`profile`) VALUES (nullif(?, 0),?,?)";
            case 19:
                return "INSERT OR REPLACE INTO `reactions_section` (`id`,`update_time`,`reactions`) VALUES (?,?,?)";
            case 20:
                return "INSERT OR REPLACE INTO `recent` (`id`,`recent_type`,`recent_time`,`server_id`,`sticker_id`,`emoji`,`gif`,`gif_id`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            case 21:
                return "INSERT OR REPLACE INTO `chat_folder` (`id`,`title`,`order`,`emoji`,`filters`,`isHiddenForAllFolder`,`elements`,`filterSubjects`,`widgets`,`options`,`updateTime`,`favorites`,`templateId`,`sourceId`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 22:
                return "INSERT OR REPLACE INTO `folder_and_chats` (`chatId`,`folderId`) VALUES (?,?)";
            case 23:
                return "INSERT OR REPLACE INTO `selected_mentions` (`id`,`selectedMentionType`) VALUES (?,?)";
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return "INSERT OR ABORT INTO `stat_events` (`id`,`timestamp`,`entry`) VALUES (nullif(?, 0),?,?)";
            case 25:
                return "INSERT OR REPLACE INTO `sticker_sets` (`id`,`name`,`icon_url`,`author_id`,`created_time`,`updated_time`,`link`,`stickers`,`draft`) VALUES (?,?,?,?,?,?,?,?,?)";
            case 26:
                return "INSERT OR REPLACE INTO `stickers` (`id`,`sticker_id`,`width`,`height`,`url`,`update_time`,`mp4_url`,`first_url`,`preview_url`,`tags`,`sticker_type`,`set_id`,`lottie_url`,`audio`,`author_type`,`video_url`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 27:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?)";
            case 28:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `tasks` (`id`,`type`,`status`,`fails_count`,`depends_request_id`,`dependency_type`,`data`,`created_time`) VALUES (?,?,?,?,?,?,?,?)";
        }
    }

    /* JADX WARN: Type inference failed for: r6v27, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.vg5
    public final void z(vk6 vk6Var, Object obj) throws JSONException {
        String str;
        int i;
        switch (this.d) {
            case 0:
                si siVar = (si) obj;
                vk6Var.k(1, siVar.a);
                vk6Var.k(2, siVar.b);
                String str2 = siVar.c;
                if (str2 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str2);
                }
                String str3 = siVar.d;
                if (str3 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str3);
                }
                String str4 = siVar.e;
                if (str4 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.f(5, str4);
                }
                Long l = siVar.f;
                if (l == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.k(6, l.longValue());
                }
                String str5 = siVar.g;
                if (str5 == null) {
                    vk6Var.S(7);
                    return;
                } else {
                    vk6Var.f(7, str5);
                    return;
                }
            case 1:
                dk dkVar = (dk) obj;
                vk6Var.k(1, dkVar.a);
                String str6 = dkVar.b;
                if (str6 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str6);
                }
                String str7 = dkVar.c;
                if (str7 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str7);
                }
                String str8 = dkVar.d;
                if (str8 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str8);
                }
                vk6Var.k(5, dkVar.e);
                String string = new JSONArray((Collection) dkVar.f).toString();
                if (string == null) {
                    vk6Var.S(6);
                    return;
                } else {
                    vk6Var.f(6, string);
                    return;
                }
            case 2:
                nj3 nj3Var = (nj3) obj;
                vk6Var.k(1, nj3Var.a);
                vk6Var.k(2, nj3Var.b);
                List<jj3> list = nj3Var.c;
                JSONArray jSONArray = new JSONArray();
                for (jj3 jj3Var : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", (int) jj3Var.a);
                    jSONObject.put("title", jj3Var.b);
                    jSONArray.put(jSONObject);
                }
                vk6Var.f(3, jSONArray.toString());
                return;
            case 3:
                uw3 uw3Var = (uw3) obj;
                vk6Var.k(1, uw3Var.a);
                vk6Var.k(2, uw3Var.b);
                vk6Var.k(3, uw3Var.c);
                vk6Var.k(4, uw3Var.d);
                vk6Var.D(5, a6j.b(uw3Var.e));
                return;
            case 4:
                throw az1.g(obj);
            case 5:
                ut4 ut4Var = (ut4) obj;
                String str9 = ut4Var.a;
                if (str9 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str9);
                }
                String str10 = ut4Var.b;
                if (str10 == null) {
                    vk6Var.S(2);
                    return;
                } else {
                    vk6Var.f(2, str10);
                    return;
                }
            case 6:
                g35 g35Var = (g35) obj;
                String str11 = g35Var.b;
                if (str11 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str11);
                }
                vk6Var.k(2, g35Var.c);
                vk6Var.k(3, g35Var.d.a);
                z25 z25Var = g35Var.a;
                vk6Var.k(4, z25Var.a);
                String str12 = z25Var.b;
                if (str12 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.f(5, str12);
                }
                u10 u10Var = g35Var.e;
                if (u10Var != null) {
                    vk6Var.k(6, u10Var.c.b);
                    vk6Var.g(7, u10Var.a);
                    vk6Var.g(8, u10Var.b);
                    vk6Var.k(9, u10Var.d ? 1L : 0L);
                    return;
                }
                vk6Var.S(6);
                vk6Var.S(7);
                vk6Var.S(8);
                vk6Var.S(9);
                return;
            case 7:
                wr5 wr5Var = (wr5) obj;
                vk6Var.k(1, wr5Var.a);
                vk6Var.k(2, wr5Var.b);
                return;
            case 8:
                cr5 cr5Var = (cr5) obj;
                vk6Var.k(1, cr5Var.a);
                vk6Var.k(2, cr5Var.b);
                return;
            case 9:
                ws5 ws5Var = (ws5) obj;
                vk6Var.k(1, ws5Var.a);
                vk6Var.k(2, ws5Var.b);
                vk6Var.k(3, ws5Var.c);
                vk6Var.k(4, ws5Var.d != 0 ? az1.v(r3) : 0);
                Long l2 = ws5Var.e;
                if (l2 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.k(5, l2.longValue());
                }
                vk6Var.k(6, ws5Var.f);
                Long l3 = ws5Var.g;
                if (l3 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.k(7, l3.longValue());
                }
                String str13 = ws5Var.h;
                if (str13 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str13);
                }
                vk6Var.k(9, ws5Var.i);
                vk6Var.k(10, ws5Var.j);
                String str14 = ws5Var.k;
                if (str14 == null) {
                    vk6Var.S(11);
                } else {
                    vk6Var.f(11, str14);
                }
                vk6Var.k(12, ws5Var.l);
                vk6Var.k(13, ws5Var.m);
                return;
            case 10:
                nt5 nt5Var = (nt5) obj;
                vk6Var.k(1, nt5Var.a);
                vk6Var.k(2, nt5Var.b);
                return;
            case 11:
                vk7 vk7Var = (vk7) obj;
                String str15 = vk7Var.a;
                if (str15 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str15);
                }
                String str16 = vk7Var.b;
                if (str16 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str16);
                }
                vk6Var.k(3, vk7Var.c ? 1L : 0L);
                String str17 = vk7Var.d;
                if (str17 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str17);
                }
                vk6Var.k(5, vk7Var.e);
                vk6Var.k(6, vk7Var.f);
                vk6Var.k(7, vk7Var.g);
                vk6Var.k(8, vk7Var.h);
                String str18 = vk7Var.i;
                if (str18 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str18);
                }
                vk6Var.k(10, vk7Var.j.a);
                vk6Var.k(11, vk7Var.k);
                vk6Var.k(12, vk7Var.l);
                vk6Var.k(13, vk7Var.m);
                vk6Var.k(14, vk7Var.n);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                wm9 wm9Var = (wm9) obj;
                String str19 = wm9Var.b;
                if (str19 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str19);
                }
                vk6Var.k(2, wm9Var.c);
                vk6Var.k(3, wm9Var.d.a);
                bz1 bz1Var = wm9Var.a;
                vk6Var.k(4, bz1Var.a);
                vk6Var.k(5, bz1Var.b);
                String str20 = (String) bz1Var.c;
                if (str20 == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.f(6, str20);
                }
                u10 u10Var2 = wm9Var.e;
                if (u10Var2 != null) {
                    vk6Var.k(7, u10Var2.c.b);
                    vk6Var.g(8, u10Var2.a);
                    vk6Var.g(9, u10Var2.b);
                    vk6Var.k(10, u10Var2.d ? 1L : 0L);
                    return;
                }
                vk6Var.S(7);
                vk6Var.S(8);
                vk6Var.S(9);
                vk6Var.S(10);
                return;
            case 13:
                lt5 lt5Var = (lt5) obj;
                vk6Var.k(1, lt5Var.a);
                vk6Var.k(2, lt5Var.b);
                vk6Var.f(3, lt5Var.c.a);
                String str21 = lt5Var.d;
                if (str21 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str21);
                }
                String str22 = lt5Var.e;
                if (str22 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.f(5, str22);
                }
                vk6Var.k(6, lt5Var.f);
                vk6Var.k(7, lt5Var.g);
                String str23 = lt5Var.h;
                if (str23 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str23);
                }
                vk6Var.k(9, lt5Var.i);
                String str24 = lt5Var.j;
                if (str24 == null) {
                    vk6Var.S(10);
                } else {
                    vk6Var.f(10, str24);
                }
                String str25 = lt5Var.k;
                if (str25 == null) {
                    vk6Var.S(11);
                } else {
                    vk6Var.f(11, str25);
                }
                vk6Var.k(12, lt5Var.l ? 1L : 0L);
                vk6Var.k(13, lt5Var.m ? 1L : 0L);
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                cna cnaVar = (cna) obj;
                vk6Var.k(1, cnaVar.a);
                vk6Var.k(2, cnaVar.b);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                vpa vpaVar = (vpa) obj;
                vk6Var.k(1, vpaVar.a);
                vk6Var.k(2, vpaVar.b);
                vk6Var.k(3, vpaVar.c);
                Boolean bool = vpaVar.d;
                if ((bool == null ? null : Integer.valueOf(bool.booleanValue() ? 1 : 0)) == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.k(4, r3.intValue());
                }
                x55 x55Var = vpaVar.e;
                String str26 = x55Var != null ? x55Var.a : null;
                if (str26 == null) {
                    vk6Var.S(5);
                    return;
                } else {
                    vk6Var.f(5, str26);
                    return;
                }
            case 16:
                ztb ztbVar = (ztb) obj;
                vk6Var.k(1, ztbVar.a);
                vk6Var.k(2, ztbVar.b);
                vk6Var.k(3, ztbVar.c);
                String str27 = ztbVar.d;
                if (str27 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str27);
                }
                vk6Var.k(5, ztbVar.e);
                String str28 = ztbVar.f;
                if (str28 == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.f(6, str28);
                }
                String str29 = ztbVar.g;
                if (str29 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str29);
                }
                String str30 = ztbVar.h;
                if (str30 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str30);
                }
                String str31 = ztbVar.i;
                if (str31 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str31);
                }
                vk6Var.k(10, az1.v(ztbVar.j));
                return;
            case LangUtils.HASH_SEED /* 17 */:
                r7c r7cVar = (r7c) obj;
                vk6Var.f(1, r7cVar.a);
                vk6Var.k(2, r7cVar.b.longValue());
                return;
            case 18:
                ghc ghcVar = (ghc) obj;
                vk6Var.k(1, ghcVar.a);
                vk6Var.k(2, ghcVar.b);
                py0 py0Var = ghcVar.c;
                byte[] bArr = a.a;
                Protos.SelfProfile selfProfile = new Protos.SelfProfile();
                ?? r6 = py0Var.b;
                List list2 = (List) py0Var.c;
                selfProfile.restrictions = new HashMap(r6.size());
                if (!r6.isEmpty()) {
                    for (Integer num : r6.keySet()) {
                        Protos.RestrictionsInfo restrictionsInfo = new Protos.RestrictionsInfo();
                        restrictionsInfo.expiration = ((epd) r6.get(num)).a;
                        selfProfile.restrictions.put(num, restrictionsInfo);
                    }
                }
                selfProfile.profileOptions = new int[list2.size()];
                if (!list2.isEmpty()) {
                    int i2 = 0;
                    while (true) {
                        int[] iArr = selfProfile.profileOptions;
                        if (i2 < iArr.length) {
                            iArr[i2] = ((Integer) list2.get(i2)).intValue();
                            i2++;
                        }
                    }
                }
                vk6Var.D(3, fl9.toByteArray(selfProfile));
                return;
            case 19:
                iad iadVar = (iad) obj;
                String str32 = iadVar.a;
                if (str32 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str32);
                }
                vk6Var.k(2, iadVar.b);
                String string2 = new JSONArray((Collection) iadVar.c).toString();
                if (string2 == null) {
                    vk6Var.S(3);
                    return;
                } else {
                    vk6Var.f(3, string2);
                    return;
                }
            case 20:
                pcd pcdVar = (pcd) obj;
                vk6Var.k(1, pcdVar.a);
                vk6Var.k(2, pcdVar.b.a);
                vk6Var.k(3, pcdVar.c);
                vk6Var.k(4, pcdVar.d);
                n7 n7Var = pcdVar.e;
                if (n7Var != null) {
                    vk6Var.k(5, n7Var.a);
                } else {
                    vk6Var.S(5);
                }
                kce kceVar = pcdVar.f;
                if (kceVar == null || (str = (String) kceVar.b) == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.f(6, str);
                }
                v32 v32Var = pcdVar.g;
                if (v32Var == null) {
                    vk6Var.S(7);
                    vk6Var.S(8);
                    return;
                }
                byte[] bArr2 = (byte[]) v32Var.c;
                if (bArr2 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.D(7, bArr2);
                }
                vk6Var.k(8, v32Var.b);
                return;
            case 21:
                uqd uqdVar = (uqd) obj;
                String str33 = uqdVar.a;
                if (str33 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str33);
                }
                String str34 = uqdVar.b;
                if (str34 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str34);
                }
                vk6Var.k(3, uqdVar.c);
                String str35 = uqdVar.d;
                if (str35 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str35);
                }
                vk6Var.f(5, uzi.a(uqdVar.e));
                vk6Var.k(6, uqdVar.f ? 1L : 0L);
                List list3 = uqdVar.g;
                byte[] bArrB = list3 != null ? dj9.b(list3) : null;
                if (bArrB == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.D(7, bArrB);
                }
                byte[] bArrD = uzi.d(uqdVar.h);
                if (bArrD == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.D(8, bArrD);
                }
                byte[] bArrE = uzi.e(uqdVar.i);
                if (bArrE == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.D(9, bArrE);
                }
                Set set = uqdVar.j;
                byte[] byteArray = set != null ? fl9.toByteArray(lsi.b(set)) : null;
                if (byteArray == null) {
                    vk6Var.S(10);
                } else {
                    vk6Var.D(10, byteArray);
                }
                vk6Var.k(11, uqdVar.k);
                byte[] bArrJ = uzi.j(uqdVar.l);
                if (bArrJ == null) {
                    vk6Var.S(12);
                } else {
                    vk6Var.D(12, bArrJ);
                }
                Long l4 = uqdVar.m;
                if (l4 == null) {
                    vk6Var.S(13);
                } else {
                    vk6Var.k(13, l4.longValue());
                }
                Long l5 = uqdVar.n;
                if (l5 == null) {
                    vk6Var.S(14);
                    return;
                } else {
                    vk6Var.k(14, l5.longValue());
                    return;
                }
            case 22:
                ic2 ic2Var = (ic2) obj;
                vk6Var.k(1, ic2Var.a);
                String str36 = ic2Var.b;
                if (str36 == null) {
                    vk6Var.S(2);
                    return;
                } else {
                    vk6Var.f(2, str36);
                    return;
                }
            case 23:
                vk6Var.k(1, ((jce) obj).a);
                vk6Var.k(2, az1.v(r2.b));
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                fcf fcfVar = (fcf) obj;
                vk6Var.k(1, fcfVar.a);
                vk6Var.k(2, fcfVar.b);
                hg8 hg8Var = fcfVar.c;
                Protos.LogEvent logEvent = new Protos.LogEvent();
                logEvent.time = hg8Var.f;
                logEvent.type = hg8Var.a;
                logEvent.event = hg8Var.b;
                Map map = hg8Var.e;
                if (map != null) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        efi.q(map, byteArrayOutputStream);
                        logEvent.params = byteArrayOutputStream.toByteArray();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
                logEvent.userId = hg8Var.c;
                logEvent.sessionId = hg8Var.d;
                vk6Var.D(3, fl9.toByteArray(logEvent));
                return;
            case 25:
                yff yffVar = (yff) obj;
                vk6Var.k(1, yffVar.a);
                String str37 = yffVar.b;
                if (str37 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str37);
                }
                String str38 = yffVar.c;
                if (str38 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str38);
                }
                vk6Var.k(4, yffVar.d);
                vk6Var.k(5, yffVar.e);
                vk6Var.k(6, yffVar.f);
                String str39 = yffVar.g;
                if (str39 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str39);
                }
                String string3 = new JSONArray((Collection) yffVar.h).toString();
                if (string3 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, string3);
                }
                vk6Var.k(9, yffVar.i ? 1L : 0L);
                return;
            case 26:
                aff affVar = (aff) obj;
                vk6Var.k(1, affVar.a);
                vk6Var.k(2, affVar.b);
                vk6Var.k(3, affVar.c);
                vk6Var.k(4, affVar.d);
                String str40 = affVar.e;
                if (str40 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.f(5, str40);
                }
                vk6Var.k(6, affVar.f);
                String str41 = affVar.g;
                if (str41 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str41);
                }
                String str42 = affVar.h;
                if (str42 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str42);
                }
                String str43 = affVar.i;
                if (str43 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str43);
                }
                vk6Var.f(10, ue3.N(affVar.j, ",", null, null, null, 62));
                int i3 = affVar.k;
                if (i3 == 1) {
                    i = 0;
                } else if (i3 == 2) {
                    i = 10;
                } else if (i3 == 3) {
                    i = 20;
                } else {
                    if (i3 != 4) {
                        throw null;
                    }
                    i = 40;
                }
                vk6Var.k(11, i);
                vk6Var.k(12, affVar.l);
                String str44 = affVar.m;
                if (str44 == null) {
                    vk6Var.S(13);
                } else {
                    vk6Var.f(13, str44);
                }
                vk6Var.k(14, affVar.n ? 1L : 0L);
                vk6Var.k(15, ctd.c(affVar.o));
                String str45 = affVar.p;
                if (str45 == null) {
                    vk6Var.S(16);
                    return;
                } else {
                    vk6Var.f(16, str45);
                    return;
                }
            case 27:
                n2h n2hVar = (n2h) obj;
                vk6Var.k(1, n2hVar.b ? 1L : 0L);
                String str46 = n2hVar.c;
                if (str46 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str46);
                }
                String str47 = n2hVar.d;
                if (str47 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str47);
                }
                m2h m2hVar = n2hVar.a;
                String str48 = m2hVar.a;
                if (str48 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str48);
                }
                vk6Var.k(5, m2hVar.b.b);
                vk6Var.g(6, m2hVar.c);
                vk6Var.g(7, m2hVar.d);
                vk6Var.k(8, m2hVar.e ? 1L : 0L);
                return;
            case 28:
                String str49 = ((xwf) obj).a;
                if (str49 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str49);
                }
                vk6Var.k(2, r2.b);
                vk6Var.k(3, r2.c);
                return;
            default:
                s2g s2gVar = (s2g) obj;
                vk6Var.k(1, s2gVar.a);
                vk6Var.k(2, s2gVar.b.a);
                vk6Var.k(3, s2gVar.c.a);
                vk6Var.k(4, s2gVar.d);
                vk6Var.k(5, s2gVar.e);
                vk6Var.k(6, s2gVar.f);
                byte[] bArr3 = s2gVar.g;
                if (bArr3 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.D(7, bArr3);
                }
                vk6Var.k(8, s2gVar.h);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(d3g d3gVar, lrd lrdVar) {
        super(lrdVar);
        this.d = 29;
    }
}
