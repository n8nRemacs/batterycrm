package com.avito.android.iac_dialer.impl_module.camera;

import Y61.k;
import dL.d;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: IacCameraPosition.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/camera/IacCameraPosition;", "", "LdL/d;", "<init>", "(Ljava/lang/String;I)V", "FRONT", "BACK", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class IacCameraPosition implements d {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ IacCameraPosition[] $VALUES;
    public static final IacCameraPosition FRONT = new IacCameraPosition("FRONT", 0);
    public static final IacCameraPosition BACK = new IacCameraPosition("BACK", 1);

    private static final /* synthetic */ IacCameraPosition[] $values() {
        return new IacCameraPosition[]{FRONT, BACK};
    }

    static {
        IacCameraPosition[] iacCameraPositionArr$values = $values();
        $VALUES = iacCameraPositionArr$values;
        $ENTRIES = c.a(iacCameraPositionArr$values);
    }

    private IacCameraPosition(String str, int i12) {
    }

    @k
    public static a<IacCameraPosition> getEntries() {
        return $ENTRIES;
    }

    public static IacCameraPosition valueOf(String str) {
        return (IacCameraPosition) Enum.valueOf(IacCameraPosition.class, str);
    }

    public static IacCameraPosition[] values() {
        return (IacCameraPosition[]) $VALUES.clone();
    }
}
