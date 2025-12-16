package defpackage;

import androidx.work.impl.model.WorkersQueueDao_Impl;

/* loaded from: classes.dex */
public final class g6i extends vg5 {
    public final /* synthetic */ int d;
    public final /* synthetic */ WorkersQueueDao_Impl o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g6i(WorkersQueueDao_Impl workersQueueDao_Impl, lrd lrdVar, int i) {
        super(lrdVar);
        this.d = i;
        this.o = workersQueueDao_Impl;
    }

    @Override // defpackage.j3
    public final String d() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `WorkerQueueItem` (`uuid`,`uniqueWorkName`,`existingWorkPolicy`,`tags`,`time`,`state`,`work_spec_id`,`work_spec_state`,`work_spec_worker_class_name`,`work_spec_input_merger_class_name`,`work_spec_input`,`work_spec_output`,`work_spec_initial_delay`,`work_spec_interval_duration`,`work_spec_flex_duration`,`work_spec_run_attempt_count`,`work_spec_backoff_policy`,`work_spec_backoff_delay_duration`,`work_spec_last_enqueue_time`,`work_spec_minimum_retention_duration`,`work_spec_schedule_requested_at`,`work_spec_run_in_foreground`,`work_spec_out_of_quota_policy`,`work_spec_period_count`,`work_spec_generation`,`work_spec_required_network_type`,`work_spec_requires_charging`,`work_spec_requires_device_idle`,`work_spec_requires_battery_not_low`,`work_spec_requires_storage_not_low`,`work_spec_trigger_content_update_delay`,`work_spec_trigger_max_content_delay`,`work_spec_content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }
    }

    @Override // defpackage.vg5
    public final void z(vk6 vk6Var, Object obj) throws Throwable {
        switch (this.d) {
            case 0:
                a6i a6iVar = (a6i) obj;
                String str = a6iVar.a;
                if (str == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str);
                }
                String str2 = a6iVar.b;
                if (str2 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str2);
                }
                vk6Var.f(3, this.o.__ExistingWorkPolicy_enumToString(a6iVar.c));
                vk6Var.f(4, ue3.N(a6iVar.e, ",", null, null, null, 62));
                vk6Var.k(5, a6iVar.f);
                vk6Var.k(6, a6iVar.g);
                r5i r5iVar = a6iVar.d;
                String str3 = r5iVar.a;
                if (str3 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str3);
                }
                vk6Var.k(8, to8.q(r5iVar.b));
                String str4 = r5iVar.c;
                if (str4 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str4);
                }
                String str5 = r5iVar.d;
                if (str5 == null) {
                    vk6Var.S(10);
                } else {
                    vk6Var.f(10, str5);
                }
                byte[] bArrF = yd4.f(r5iVar.e);
                if (bArrF == null) {
                    vk6Var.S(11);
                } else {
                    vk6Var.D(11, bArrF);
                }
                byte[] bArrF2 = yd4.f(r5iVar.f);
                if (bArrF2 == null) {
                    vk6Var.S(12);
                } else {
                    vk6Var.D(12, bArrF2);
                }
                vk6Var.k(13, r5iVar.g);
                vk6Var.k(14, r5iVar.h);
                vk6Var.k(15, r5iVar.i);
                vk6Var.k(16, r5iVar.k);
                vk6Var.k(17, to8.a(r5iVar.l));
                vk6Var.k(18, r5iVar.m);
                vk6Var.k(19, r5iVar.n);
                vk6Var.k(20, r5iVar.o);
                vk6Var.k(21, r5iVar.p);
                vk6Var.k(22, r5iVar.q ? 1L : 0L);
                vk6Var.k(23, to8.l(r5iVar.r));
                vk6Var.k(24, r5iVar.s);
                vk6Var.k(25, r5iVar.t);
                bu3 bu3Var = r5iVar.j;
                vk6Var.k(26, to8.k(bu3Var.a));
                vk6Var.k(27, bu3Var.b ? 1L : 0L);
                vk6Var.k(28, bu3Var.c ? 1L : 0L);
                vk6Var.k(29, bu3Var.d ? 1L : 0L);
                vk6Var.k(30, bu3Var.e ? 1L : 0L);
                vk6Var.k(31, bu3Var.f);
                vk6Var.k(32, bu3Var.g);
                vk6Var.D(33, to8.p(bu3Var.h));
                break;
            default:
                a6i a6iVar2 = (a6i) obj;
                String str6 = a6iVar2.a;
                if (str6 == null) {
                    vk6Var.S(1);
                } else {
                    vk6Var.f(1, str6);
                }
                String str7 = a6iVar2.b;
                if (str7 == null) {
                    vk6Var.S(2);
                } else {
                    vk6Var.f(2, str7);
                }
                vk6Var.f(3, this.o.__ExistingWorkPolicy_enumToString(a6iVar2.c));
                vk6Var.f(4, ue3.N(a6iVar2.e, ",", null, null, null, 62));
                vk6Var.k(5, a6iVar2.f);
                vk6Var.k(6, a6iVar2.g);
                r5i r5iVar2 = a6iVar2.d;
                String str8 = r5iVar2.a;
                if (str8 == null) {
                    vk6Var.S(7);
                } else {
                    vk6Var.f(7, str8);
                }
                vk6Var.k(8, to8.q(r5iVar2.b));
                String str9 = r5iVar2.c;
                if (str9 == null) {
                    vk6Var.S(9);
                } else {
                    vk6Var.f(9, str9);
                }
                String str10 = r5iVar2.d;
                if (str10 == null) {
                    vk6Var.S(10);
                } else {
                    vk6Var.f(10, str10);
                }
                byte[] bArrF3 = yd4.f(r5iVar2.e);
                if (bArrF3 == null) {
                    vk6Var.S(11);
                } else {
                    vk6Var.D(11, bArrF3);
                }
                byte[] bArrF4 = yd4.f(r5iVar2.f);
                if (bArrF4 == null) {
                    vk6Var.S(12);
                } else {
                    vk6Var.D(12, bArrF4);
                }
                vk6Var.k(13, r5iVar2.g);
                vk6Var.k(14, r5iVar2.h);
                vk6Var.k(15, r5iVar2.i);
                vk6Var.k(16, r5iVar2.k);
                vk6Var.k(17, to8.a(r5iVar2.l));
                vk6Var.k(18, r5iVar2.m);
                vk6Var.k(19, r5iVar2.n);
                vk6Var.k(20, r5iVar2.o);
                vk6Var.k(21, r5iVar2.p);
                vk6Var.k(22, r5iVar2.q ? 1L : 0L);
                vk6Var.k(23, to8.l(r5iVar2.r));
                vk6Var.k(24, r5iVar2.s);
                vk6Var.k(25, r5iVar2.t);
                bu3 bu3Var2 = r5iVar2.j;
                vk6Var.k(26, to8.k(bu3Var2.a));
                vk6Var.k(27, bu3Var2.b ? 1L : 0L);
                vk6Var.k(28, bu3Var2.c ? 1L : 0L);
                vk6Var.k(29, bu3Var2.d ? 1L : 0L);
                vk6Var.k(30, bu3Var2.e ? 1L : 0L);
                vk6Var.k(31, bu3Var2.f);
                vk6Var.k(32, bu3Var2.g);
                vk6Var.D(33, to8.p(bu3Var2.h));
                break;
        }
    }
}
