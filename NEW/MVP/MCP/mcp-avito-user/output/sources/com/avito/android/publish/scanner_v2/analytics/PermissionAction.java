package com.avito.android.publish.scanner_v2.analytics;

import Y61.k;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScannerPermissionEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/analytics/PermissionAction;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class PermissionAction {

    /* renamed from: c, reason: collision with root package name */
    public static final PermissionAction f239325c;

    /* renamed from: d, reason: collision with root package name */
    public static final PermissionAction f239326d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PermissionAction[] f239327e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ a f239328f;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f239329b;

    static {
        PermissionAction permissionAction = new PermissionAction("ALLOW", 0, "allow");
        f239325c = permissionAction;
        PermissionAction permissionAction2 = new PermissionAction("DISALLOW", 1, "disallow");
        f239326d = permissionAction2;
        PermissionAction[] permissionActionArr = {permissionAction, permissionAction2};
        f239327e = permissionActionArr;
        f239328f = c.a(permissionActionArr);
    }

    public PermissionAction(String str, int i12, String str2) {
        this.f239329b = str2;
    }

    public static PermissionAction valueOf(String str) {
        return (PermissionAction) Enum.valueOf(PermissionAction.class, str);
    }

    public static PermissionAction[] values() {
        return (PermissionAction[]) f239327e.clone();
    }
}
