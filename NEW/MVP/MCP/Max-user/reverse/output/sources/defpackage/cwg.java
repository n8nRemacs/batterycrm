package defpackage;

/* loaded from: classes2.dex */
public final class cwg extends vg5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwg(lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `uploads` (`attach_local_id`,`prepared_path`,`file_name`,`upload_url`,`upload_progress`,`total_bytes`,`upload_status`,`created_time`,`path`,`last_modified`,`upload_type`,`photo_token`,`attach_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `video_conversions` (`finished`,`prepared_path`,`result_path`,`source_uri`,`quality`,`start_trim_position`,`end_trim_position`,`mute`) VALUES (?,?,?,?,?,?,?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `webapp_biometry` (`id`,`user_id`,`bot_id`,`token`,`access_requested`,`access_granted`) VALUES (nullif(?, 0),?,?,?,?,?)";
            case 3:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 4:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 5:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // defpackage.vg5
    public final void z(vk6 vk6Var, Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                cug cugVar = (cug) obj;
                String str = cugVar.b;
                if (str == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str);
                }
                String str2 = cugVar.c;
                if (str2 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str2);
                }
                String str3 = cugVar.d;
                if (str3 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str3);
                }
                String str4 = cugVar.e;
                if (str4 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str4);
                }
                vk6Var.g(5, cugVar.f);
                vk6Var.k(6, cugVar.g);
                vk6Var.k(7, cugVar.h.a);
                vk6Var.k(8, cugVar.j);
                ey2 ey2Var = cugVar.a;
                String str5 = (String) ey2Var.c;
                if (str5 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str5);
                }
                vk6Var.k(10, ey2Var.b);
                vk6Var.k(11, ((wvg) ey2Var.d).a);
                svg svgVar = cugVar.i;
                if (svgVar == null) {
                    vk6Var.S(12);
                    vk6Var.S(13);
                    break;
                } else {
                    String str6 = svgVar.a;
                    if (str6 == null) {
                        vk6Var.S(12);
                    } else {
                        vk6Var.f(12, str6);
                    }
                    vk6Var.k(13, svgVar.b);
                    break;
                }
            case 1:
                n2h n2hVar = (n2h) obj;
                vk6Var.k(1, n2hVar.b ? 1L : 0L);
                String str7 = n2hVar.c;
                if (str7 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str7);
                }
                String str8 = n2hVar.d;
                if (str8 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str8);
                }
                m2h m2hVar = n2hVar.a;
                String str9 = m2hVar.a;
                if (str9 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str9);
                }
                vk6Var.k(5, m2hVar.b.b);
                vk6Var.g(6, m2hVar.c);
                vk6Var.g(7, m2hVar.d);
                vk6Var.k(8, m2hVar.e ? 1L : 0L);
                break;
            case 2:
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
                break;
            case 3:
                h5i h5iVar = (h5i) obj;
                String str11 = h5iVar.a;
                if (str11 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str11);
                }
                String str12 = h5iVar.b;
                if (str12 != null) {
                    vk6Var.f(2, str12);
                    break;
                } else {
                    vk6Var.S(2);
                    break;
                }
            case 4:
                j5i j5iVar = (j5i) obj;
                String str13 = j5iVar.a;
                if (str13 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str13);
                }
                byte[] bArrF = yd4.f(j5iVar.b);
                if (bArrF != null) {
                    vk6Var.D(2, bArrF);
                    break;
                } else {
                    vk6Var.S(2);
                    break;
                }
            case 5:
                r5i r5iVar = (r5i) obj;
                String str14 = r5iVar.a;
                if (str14 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str14);
                }
                vk6Var.k(2, to8.q(r5iVar.b));
                String str15 = r5iVar.c;
                if (str15 == null) {
                    vk6Var.S(3);
                } else {
                    vk6Var.f(3, str15);
                }
                String str16 = r5iVar.d;
                if (str16 == null) {
                    vk6Var.S(4);
                } else {
                    vk6Var.f(4, str16);
                }
                byte[] bArrF2 = yd4.f(r5iVar.e);
                if (bArrF2 == null) {
                    vk6Var.S(5);
                } else {
                    vk6Var.D(5, bArrF2);
                }
                byte[] bArrF3 = yd4.f(r5iVar.f);
                if (bArrF3 == null) {
                    vk6Var.S(6);
                } else {
                    vk6Var.D(6, bArrF3);
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
                if (bu3Var == null) {
                    vk6Var.S(20);
                    vk6Var.S(21);
                    vk6Var.S(22);
                    vk6Var.S(23);
                    vk6Var.S(24);
                    vk6Var.S(25);
                    vk6Var.S(26);
                    vk6Var.S(27);
                    break;
                } else {
                    vk6Var.k(20, to8.k(bu3Var.a));
                    vk6Var.k(21, bu3Var.b ? 1L : 0L);
                    vk6Var.k(22, bu3Var.c ? 1L : 0L);
                    vk6Var.k(23, bu3Var.d ? 1L : 0L);
                    vk6Var.k(24, bu3Var.e ? 1L : 0L);
                    vk6Var.k(25, bu3Var.f);
                    vk6Var.k(26, bu3Var.g);
                    vk6Var.D(27, to8.p(bu3Var.h));
                    break;
                }
            default:
                t5i t5iVar = (t5i) obj;
                String str17 = t5iVar.a;
                if (str17 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str17);
                }
                String str18 = t5iVar.b;
                if (str18 != null) {
                    vk6Var.f(2, str18);
                    break;
                } else {
                    vk6Var.S(2);
                    break;
                }
        }
    }
}
