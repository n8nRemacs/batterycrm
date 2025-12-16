package com.google.android.play.core.splitinstall;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    public final Context f358690a;

    public N(@j.N Context context) {
        this.f358690a = context;
    }

    public final Set a() {
        Set<String> hashSet;
        synchronized (N.class) {
            try {
                hashSet = this.f358690a.getSharedPreferences("playcore_split_install_internal", 0).getStringSet("modules_to_uninstall_if_emulated", new HashSet());
            } catch (Exception unused) {
                hashSet = new HashSet<>();
            }
            if (hashSet == null) {
                hashSet = new HashSet<>();
            }
        }
        return hashSet;
    }
}
