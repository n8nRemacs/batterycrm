package defpackage;

import java.util.List;
import java.util.Set;

/* loaded from: classes2.dex */
public final class am4 extends ug5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ am4(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "DELETE FROM `default_emoji` WHERE `emoji` = ?";
            case 1:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`server_id` = ?,`cid` = ?,`time` = ?,`time_local` = ?,`view_time` = ?,`options` = ?,`live_until` = ?,`delivery_status` = ?,`status` = ?,`delayed_attrs_time_to_fire` = ?,`delayed_attrs_notify_sender` = ? WHERE `id` = ?";
            case 2:
                return "UPDATE OR ABORT `messages` SET `id` = ?,`view_time` = ? WHERE `id` = ?";
            case 3:
                return "DELETE FROM `fcm_notifications` WHERE `chat_id` = ? AND `message_id` = ?";
            case 4:
                return "UPDATE OR ABORT `phones` SET `id` = ?,`phonebook_id` = ?,`contact_id` = ?,`phone` = ?,`server_phone` = ?,`email` = ?,`first_name` = ?,`last_name` = ?,`avatar_path` = ?,`type` = ? WHERE `id` = ?";
            case 5:
                return "DELETE FROM `recent` WHERE `id` = ?";
            case 6:
                return "UPDATE OR REPLACE `chat_folder` SET `id` = ?,`title` = ?,`order` = ?,`emoji` = ?,`filters` = ?,`isHiddenForAllFolder` = ?,`elements` = ?,`filterSubjects` = ?,`widgets` = ?,`options` = ?,`updateTime` = ?,`favorites` = ?,`templateId` = ?,`sourceId` = ? WHERE `id` = ?";
            case 7:
                return "UPDATE OR REPLACE `tasks` SET `id` = ?,`type` = ?,`status` = ?,`fails_count` = ?,`depends_request_id` = ?,`dependency_type` = ?,`data` = ?,`created_time` = ? WHERE `id` = ?";
            case 8:
                return "UPDATE OR REPLACE `webapp_biometry` SET `id` = ?,`user_id` = ?,`bot_id` = ?,`token` = ?,`access_requested` = ?,`access_granted` = ? WHERE `id` = ?";
            default:
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }
    }

    @Override // defpackage.ug5
    public final void z(vk6 vk6Var, Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                throw az1.g(obj);
            case 1:
                throw az1.g(obj);
            case 2:
                throw az1.g(obj);
            case 3:
                throw az1.g(obj);
            case 4:
                ztb ztbVar = (ztb) obj;
                vk6Var.k(1, ztbVar.a);
                vk6Var.k(2, ztbVar.b);
                vk6Var.k(3, ztbVar.c);
                String str = ztbVar.d;
                if (str == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str);
                }
                vk6Var.k(5, ztbVar.e);
                String str2 = ztbVar.f;
                if (str2 == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.f(6, str2);
                }
                String str3 = ztbVar.g;
                if (str3 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str3);
                }
                String str4 = ztbVar.h;
                if (str4 == null) {
                    vk6Var.S(8);
                } else {
                    vk6Var.f(8, str4);
                }
                String str5 = ztbVar.i;
                if (str5 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str5);
                }
                vk6Var.k(10, az1.v(ztbVar.j));
                vk6Var.k(11, ztbVar.a);
                return;
            case 5:
                vk6Var.k(1, ((pcd) obj).a);
                return;
            case 6:
                uqd uqdVar = (uqd) obj;
                String str6 = uqdVar.a;
                if (str6 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str6);
                }
                String str7 = uqdVar.b;
                if (str7 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str7);
                }
                vk6Var.k(3, uqdVar.c);
                String str8 = uqdVar.d;
                if (str8 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str8);
                }
                vk6Var.f(5, uzi.a(uqdVar.e));
                vk6Var.k(6, uqdVar.f ? 1L : 0L);
                List list = uqdVar.g;
                byte[] bArrB = list != null ? dj9.b(list) : null;
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
                Long l = uqdVar.m;
                if (l == null) {
                    vk6Var.S(13);
                } else {
                    vk6Var.k(13, l.longValue());
                }
                Long l2 = uqdVar.n;
                if (l2 == null) {
                    vk6Var.S(14);
                } else {
                    vk6Var.k(14, l2.longValue());
                }
                String str9 = uqdVar.a;
                if (str9 == null) {
                    vk6Var.S(15);
                    return;
                } else {
                    vk6Var.f(15, str9);
                    return;
                }
            case 7:
                s2g s2gVar = (s2g) obj;
                vk6Var.k(1, s2gVar.a);
                vk6Var.k(2, s2gVar.b.a);
                vk6Var.k(3, s2gVar.c.a);
                vk6Var.k(4, s2gVar.d);
                vk6Var.k(5, s2gVar.e);
                vk6Var.k(6, s2gVar.f);
                byte[] bArr = s2gVar.g;
                if (bArr == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.D(7, bArr);
                }
                vk6Var.k(8, s2gVar.h);
                vk6Var.k(9, s2gVar.a);
                return;
            case 8:
                umh umhVar = (umh) obj;
                vk6Var.k(1, umhVar.a);
                vk6Var.k(2, umhVar.b);
                vk6Var.k(3, umhVar.c);
                String str10 = umhVar.d;
                if (str10 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str10);
                }
                vk6Var.k(5, umhVar.e ? 1L : 0L);
                vk6Var.k(6, umhVar.f ? 1L : 0L);
                vk6Var.k(7, umhVar.a);
                return;
            default:
                r5i r5iVar = (r5i) obj;
                String str11 = r5iVar.a;
                if (str11 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str11);
                }
                vk6Var.k(2, to8.q(r5iVar.b));
                String str12 = r5iVar.c;
                if (str12 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str12);
                }
                String str13 = r5iVar.d;
                if (str13 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str13);
                }
                byte[] bArrF = yd4.f(r5iVar.e);
                if (bArrF == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.D(5, bArrF);
                }
                byte[] bArrF2 = yd4.f(r5iVar.f);
                if (bArrF2 == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.D(6, bArrF2);
                }
                vk6Var.k(7, r5iVar.g);
                vk6Var.k(8, r5iVar.h);
                vk6Var.k(9, r5iVar.i);
                vk6Var.k(10, r5iVar.k);
                vk6Var.k(11, to8.a(r5iVar.l));
                vk6Var.k(12, r5iVar.m);
                vk6Var.k(13, r5iVar.n);
                vk6Var.k(14, r5iVar.o);
                vk6Var.k(15, r5iVar.p);
                vk6Var.k(16, r5iVar.q ? 1L : 0L);
                vk6Var.k(17, to8.l(r5iVar.r));
                vk6Var.k(18, r5iVar.s);
                vk6Var.k(19, r5iVar.t);
                bu3 bu3Var = r5iVar.j;
                if (bu3Var != null) {
                    vk6Var.k(20, to8.k(bu3Var.a));
                    vk6Var.k(21, bu3Var.b ? 1L : 0L);
                    vk6Var.k(22, bu3Var.c ? 1L : 0L);
                    vk6Var.k(23, bu3Var.d ? 1L : 0L);
                    vk6Var.k(24, bu3Var.e ? 1L : 0L);
                    vk6Var.k(25, bu3Var.f);
                    vk6Var.k(26, bu3Var.g);
                    vk6Var.D(27, to8.p(bu3Var.h));
                } else {
                    vk6Var.S(20);
                    vk6Var.S(21);
                    vk6Var.S(22);
                    vk6Var.S(23);
                    vk6Var.S(24);
                    vk6Var.S(25);
                    vk6Var.S(26);
                    vk6Var.S(27);
                }
                String str14 = r5iVar.a;
                if (str14 == null) {
                    vk6Var.S(28);
                    return;
                } else {
                    vk6Var.f(28, str14);
                    return;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(d3g d3gVar, lrd lrdVar) {
        super(lrdVar);
        this.d = 7;
    }
}
