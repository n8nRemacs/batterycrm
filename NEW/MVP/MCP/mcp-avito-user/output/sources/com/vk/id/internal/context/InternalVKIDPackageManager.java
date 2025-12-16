package com.vk.id.internal.context;

import Y61.k;
import Y61.l;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.ResolveInfo;
import com.vk.id.common.InternalVKIDApi;
import java.util.List;
import kotlin.Metadata;

/* compiled from: InternalVKIDPackageManager.kt */
@InternalVKIDApi
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\bH&J\u001e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&J\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0010"}, d2 = {"Lcom/vk/id/internal/context/InternalVKIDPackageManager;", "", "queryIntentServices", "", "Landroid/content/pm/ResolveInfo;", "intent", "Landroid/content/Intent;", "flags", "", "resolveActivity", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "packageName", "", "queryIntentActivities", "resolveService", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface InternalVKIDPackageManager {
    @k
    PackageInfo getPackageInfo(@k String packageName, int flags);

    @k
    List<ResolveInfo> queryIntentActivities(@k Intent intent, int flags);

    @k
    List<ResolveInfo> queryIntentServices(@k Intent intent, int flags);

    @l
    ResolveInfo resolveActivity(@k Intent intent, int flags);

    @l
    ResolveInfo resolveService(@k Intent intent, int flags);
}
