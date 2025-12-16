package com.google.android.play.core.install;

import JY0.c;
import JY0.d;
import android.content.Intent;
import com.google.android.play.core.appupdate.internal.s;
import j.N;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public abstract class InstallState {
    public static InstallState f(@N Intent intent, @N s sVar) {
        sVar.a("List of extras in received intent needed by fromUpdateIntent:", new Object[0]);
        sVar.a("Key: %s; value: %s", "install.status", Integer.valueOf(intent.getIntExtra("install.status", 0)));
        sVar.a("Key: %s; value: %s", "error.code", Integer.valueOf(intent.getIntExtra("error.code", 0)));
        return new b(intent.getIntExtra("install.status", 0), intent.getIntExtra("error.code", 0), intent.getLongExtra("bytes.downloaded", 0L), intent.getLongExtra("total.bytes.to.download", 0L), intent.getStringExtra("package.name"));
    }

    public abstract long a();

    @c
    public abstract int b();

    @d
    public abstract int c();

    public abstract String d();

    public abstract long e();
}
