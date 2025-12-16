package com.vk.id.internal.context;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;

/* compiled from: AndroidPackageManager.kt */
@P
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0017J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/vk/id/internal/context/AndroidPackageManager;", "Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "packageManager", "Landroid/content/pm/PackageManager;", "<init>", "(Landroid/content/pm/PackageManager;)V", "queryIntentServices", "", "Landroid/content/pm/ResolveInfo;", "intent", "Landroid/content/Intent;", "flags", "", "queryIntentActivities", "resolveActivity", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "packageName", "", "resolveService", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidPackageManager implements InternalVKIDPackageManager {

    @k
    private final PackageManager packageManager;

    public AndroidPackageManager(@k PackageManager packageManager) {
        this.packageManager = packageManager;
    }

    @Override // com.vk.id.internal.context.InternalVKIDPackageManager
    @k
    public PackageInfo getPackageInfo(@k String packageName, int flags) {
        return this.packageManager.getPackageInfo(packageName, flags);
    }

    @Override // com.vk.id.internal.context.InternalVKIDPackageManager
    @k
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ResolveInfo> queryIntentActivities(@k Intent intent, int flags) {
        return this.packageManager.queryIntentActivities(intent, flags);
    }

    @Override // com.vk.id.internal.context.InternalVKIDPackageManager
    @k
    @SuppressLint({"QueryPermissionsNeeded"})
    public List<ResolveInfo> queryIntentServices(@k Intent intent, int flags) {
        return this.packageManager.queryIntentServices(intent, flags);
    }

    @Override // com.vk.id.internal.context.InternalVKIDPackageManager
    @l
    public ResolveInfo resolveActivity(@k Intent intent, int flags) {
        return this.packageManager.resolveActivity(intent, flags);
    }

    @Override // com.vk.id.internal.context.InternalVKIDPackageManager
    @l
    public ResolveInfo resolveService(@k Intent intent, int flags) {
        return this.packageManager.resolveService(intent, flags);
    }
}
