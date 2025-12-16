package defpackage;

import android.app.Activity;
import java.io.IOException;
import one.me.android.root.RootController;

/* loaded from: classes2.dex */
public final class kkc extends i3 {
    public static final kkc c = new kkc(11);

    public static ei4 N0(long j, long j2) {
        return new ei4(ho7.k(az1.l(j, ":profile/edit/admin_permission?chat_id=", "&contact_id="), j2, "&permissions_type=change_admin"));
    }

    public static ei4 R0(long j, String str, int i) {
        return new ei4(ho7.l(u45.m(i, j, ":invite/qr?height=", "&id="), "&type=", str));
    }

    public final void L0(long j, boolean z) {
        p0().b(":profile/add-members?chat_id=" + j + "&is_chat=" + z, null);
    }

    public final void M0(long j) {
        p0().b(a9h.d(j, ":chats?id=", "&type=local"), null);
    }

    public final void O0(long j) {
        p0().b(":profile/invite?id=" + j, null);
    }

    public final void P0(long j, String str) {
        p0().b(a9h.e(":profile/members?id=", j, "&type=", str), null);
    }

    public final void Q0(long j) throws IOException {
        ii4 ii4VarP0 = p0();
        hi4 hi4Var = new hi4();
        hi4Var.a = ":profile";
        hi4Var.c(Long.valueOf(j), "id");
        hi4Var.c("contact", "type");
        ii4VarP0.c(hi4Var.a(), null);
    }

    public final void S0() {
        Activity activityD;
        if (p0().d() || (activityD = ((RootController) ((b3b) p0().a()).f()).G0().d()) == null) {
            return;
        }
        activityD.finish();
    }
}
