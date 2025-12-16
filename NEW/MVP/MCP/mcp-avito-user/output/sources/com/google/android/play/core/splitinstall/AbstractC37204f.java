package com.google.android.play.core.splitinstall;

import android.app.PendingIntent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* renamed from: com.google.android.play.core.splitinstall.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37204f {
    public static AbstractC37204f b(int i12, @PY0.b int i13, @PY0.a int i14, long j12, long j13, List<String> list, List<String> list2) {
        if (i13 != 8) {
            return new C37206h(i12, i13, i14, j12, j13, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static AbstractC37204f n(Bundle bundle) {
        return new C37206h(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    @PY0.a
    public abstract int c();

    public final boolean d() {
        int i12 = i();
        return i12 == 0 || i12 == 5 || i12 == 6 || i12 == 7;
    }

    @j.N
    public final ArrayList e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    @j.N
    public final ArrayList f() {
        return l() != null ? new ArrayList(l()) : new ArrayList();
    }

    @j.P
    @Deprecated
    public abstract PendingIntent g();

    public abstract int h();

    @PY0.b
    public abstract int i();

    public abstract long j();

    @j.P
    public abstract List k();

    @j.P
    public abstract List l();

    @j.P
    public abstract List m();
}
