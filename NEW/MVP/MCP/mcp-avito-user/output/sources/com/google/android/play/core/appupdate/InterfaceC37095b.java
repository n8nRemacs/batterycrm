package com.google.android.play.core.appupdate;

import com.avito.android.home.HomeActivity;
import com.google.android.gms.tasks.Task;
import j.N;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* renamed from: com.google.android.play.core.appupdate.b, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC37095b {
    @N
    Task<C37094a> a();

    @Deprecated
    boolean b(@N C37094a c37094a, @JY0.b int i12, @N HomeActivity homeActivity);

    @N
    Task<Void> c();

    void d(@N com.google.android.play.core.install.a aVar);

    void e(@N com.google.android.play.core.install.a aVar);
}
