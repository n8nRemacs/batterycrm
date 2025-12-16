package androidx.work.impl.model;

import androidx.work.C23542f;
import androidx.work.C23544h;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
class Y extends androidx.room.L<H> {
    @Override // androidx.room.O0
    @j.N
    public final String b() {
        return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    @Override // androidx.room.L
    public final void d(@j.N Z1.i iVar, @j.N H h12) {
        H h13 = h12;
        iVar.h4(1, h13.f55795a);
        int i12 = u0.f55888a;
        iVar.g1(2, u0.k(h13.f55796b));
        iVar.h4(3, h13.f55797c);
        iVar.h4(4, h13.f55798d);
        C23544h c23544h = h13.f55799e;
        C23544h.f55508b.getClass();
        iVar.u4(5, C23544h.b.c(c23544h));
        iVar.u4(6, C23544h.b.c(h13.f55800f));
        iVar.g1(7, h13.f55801g);
        iVar.g1(8, h13.f55802h);
        iVar.g1(9, h13.f55803i);
        iVar.g1(10, h13.f55805k);
        iVar.g1(11, u0.a(h13.f55806l));
        iVar.g1(12, h13.f55807m);
        iVar.g1(13, h13.f55808n);
        iVar.g1(14, h13.f55809o);
        iVar.g1(15, h13.f55810p);
        iVar.g1(16, h13.f55811q ? 1L : 0L);
        iVar.g1(17, u0.i(h13.f55812r));
        iVar.g1(18, h13.f55813s);
        iVar.g1(19, h13.f55814t);
        iVar.g1(20, h13.f55815u);
        iVar.g1(21, h13.f55816v);
        iVar.g1(22, h13.f55817w);
        String str = h13.f55818x;
        if (str == null) {
            iVar.B4(23);
        } else {
            iVar.h4(23, str);
        }
        C23542f c23542f = h13.f55804j;
        iVar.g1(24, u0.h(c23542f.f55487a));
        iVar.u4(25, u0.c(c23542f.f55488b));
        iVar.g1(26, c23542f.f55489c ? 1L : 0L);
        iVar.g1(27, c23542f.f55490d ? 1L : 0L);
        iVar.g1(28, c23542f.f55491e ? 1L : 0L);
        iVar.g1(29, c23542f.f55492f ? 1L : 0L);
        iVar.g1(30, c23542f.f55493g);
        iVar.g1(31, c23542f.f55494h);
        iVar.u4(32, u0.j(c23542f.f55495i));
    }
}
