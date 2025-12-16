package com.google.android.datatransport.runtime;

import android.annotation.SuppressLint;
import android.util.Log;
import com.google.android.datatransport.Priority;
import j.l0;

/* compiled from: ForcedSender.java */
/* loaded from: classes10.dex */
public final class m {
    @SuppressLint({"DiscouragedApi"})
    @l0
    public static void a(com.google.android.datatransport.g gVar) {
        Priority priority = Priority.f342918d;
        if (gVar instanceof t) {
            v.a().f343296d.a(((t) gVar).f343285a.e(priority), 1);
        } else if (Log.isLoggable("TRuntime.".concat("ForcedSender"), 5)) {
            String.format("Expected instance of `TransportImpl`, got `%s`.", gVar);
        }
    }
}
