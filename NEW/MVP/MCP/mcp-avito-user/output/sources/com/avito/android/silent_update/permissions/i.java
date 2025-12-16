package com.avito.android.silent_update.permissions;

import android.content.Context;
import android.os.Build;
import android.os.PowerManager;
import com.avito.android.permissions.u;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SilentUpdatePermissionChecker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/silent_update/permissions/i;", "", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f283717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final u f283718b;

    @Inject
    public i(@Y61.k Context context, @Y61.k u uVar) {
        this.f283717a = context;
        this.f283718b = uVar;
    }

    public final boolean a() {
        Context context = this.f283717a;
        return ((PowerManager) context.getSystemService("power")).isIgnoringBatteryOptimizations(context.getPackageName());
    }

    public final boolean b() {
        return this.f283717a.getPackageManager().canRequestPackageInstalls();
    }

    public final boolean c() {
        return this.f283718b.b("android.permission.WRITE_EXTERNAL_STORAGE") || Build.VERSION.SDK_INT >= 29;
    }
}
