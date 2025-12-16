package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public abstract class k5j {
    public static final /* synthetic */ int a = 0;

    public static void a(Bundle bundle, HashSet hashSet) {
        List list;
        wqi.c("k5j", "onCreate", new Object[0]);
        if (!bundle.containsKey("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS") || (list = (List) bundle.get("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS")) == null) {
            return;
        }
        hashSet.clear();
        hashSet.addAll(list);
    }

    public static final kmg b() {
        return new kmg(new n5g(r4d.oneme_settings_twofa_restore_delete_user_confirmation_title), new n5g(r4d.oneme_settings_twofa_restore_delete_user_confirmation_description), ve3.j(new pq3(e0d.oneme_settings_twofa_delete_user_confirmation_action, new n5g(r4d.oneme_settings_twofa_restore_delete_user_confirmation_action), 3, true, 3, 1), new pq3(e0d.oneme_settings_twofa_delete_user_confirmation_skip, new n5g(mvd.p), 2, 32)), f1e.SETTINGS_2FA_PROFILE_DELETE);
    }
}
