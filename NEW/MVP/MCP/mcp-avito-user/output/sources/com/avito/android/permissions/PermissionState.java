package com.avito.android.permissions;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PermissionState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/permissions/PermissionState;", "", "_common_permissions_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PermissionState {

    /* renamed from: b, reason: collision with root package name */
    public static final PermissionState f215104b;

    /* renamed from: c, reason: collision with root package name */
    public static final PermissionState f215105c;

    /* renamed from: d, reason: collision with root package name */
    public static final PermissionState f215106d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ PermissionState[] f215107e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f215108f;

    /* compiled from: PermissionState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[PermissionState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PermissionState permissionState = PermissionState.f215104b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                PermissionState permissionState2 = PermissionState.f215104b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        PermissionState permissionState = new PermissionState("GRANTED", 0);
        f215104b = permissionState;
        PermissionState permissionState2 = new PermissionState("DENIED", 1);
        f215105c = permissionState2;
        PermissionState permissionState3 = new PermissionState("FOREVER_DENIED", 2);
        f215106d = permissionState3;
        PermissionState[] permissionStateArr = {permissionState, permissionState2, permissionState3};
        f215107e = permissionStateArr;
        f215108f = kotlin.enums.c.a(permissionStateArr);
    }

    public PermissionState() {
        throw null;
    }

    public static PermissionState valueOf(String str) {
        return (PermissionState) Enum.valueOf(PermissionState.class, str);
    }

    public static PermissionState[] values() {
        return (PermissionState[]) f215107e.clone();
    }

    @Y61.l
    public final Boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return Boolean.TRUE;
        }
        if (iOrdinal == 2) {
            return Boolean.FALSE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean b() {
        return this == f215104b;
    }

    public final boolean c() {
        return this != f215104b;
    }
}
