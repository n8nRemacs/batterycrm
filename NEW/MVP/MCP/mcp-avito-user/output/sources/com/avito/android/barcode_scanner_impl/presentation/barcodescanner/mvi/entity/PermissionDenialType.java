package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarcodeScannerAction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/PermissionDenialType;", "", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PermissionDenialType {

    /* renamed from: b, reason: collision with root package name */
    public static final PermissionDenialType f98997b;

    /* renamed from: c, reason: collision with root package name */
    public static final PermissionDenialType f98998c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ PermissionDenialType[] f98999d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ a f99000e;

    static {
        PermissionDenialType permissionDenialType = new PermissionDenialType("COULD_ASK_AGAIN", 0);
        f98997b = permissionDenialType;
        PermissionDenialType permissionDenialType2 = new PermissionDenialType("NEVER_ASK_AGAIN", 1);
        f98998c = permissionDenialType2;
        PermissionDenialType[] permissionDenialTypeArr = {permissionDenialType, permissionDenialType2};
        f98999d = permissionDenialTypeArr;
        f99000e = c.a(permissionDenialTypeArr);
    }

    public PermissionDenialType() {
        throw null;
    }

    public static PermissionDenialType valueOf(String str) {
        return (PermissionDenialType) Enum.valueOf(PermissionDenialType.class, str);
    }

    public static PermissionDenialType[] values() {
        return (PermissionDenialType[]) f98999d.clone();
    }
}
