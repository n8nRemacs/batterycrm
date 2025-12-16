package com.avito.android.barcode_scanner_impl.presentation.barcodescanner.mvi.entity;

import Y61.l;
import com.avito.android.R;
import j.InterfaceC42165v;
import kotlin.Metadata;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BarcodeScannerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/barcode_scanner_impl/presentation/barcodescanner/mvi/entity/CameraFlashState;", "", "_avito_barcode-scanner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CameraFlashState {

    /* renamed from: c, reason: collision with root package name */
    public static final CameraFlashState f98991c;

    /* renamed from: d, reason: collision with root package name */
    public static final CameraFlashState f98992d;

    /* renamed from: e, reason: collision with root package name */
    public static final CameraFlashState f98993e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ CameraFlashState[] f98994f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f98995g;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Integer f98996b;

    /* compiled from: BarcodeScannerState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CameraFlashState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CameraFlashState cameraFlashState = CameraFlashState.f98991c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                CameraFlashState cameraFlashState2 = CameraFlashState.f98991c;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        CameraFlashState cameraFlashState = new CameraFlashState("OFF", 0, Integer.valueOf(R.drawable.common_ic_light_off_24));
        f98991c = cameraFlashState;
        CameraFlashState cameraFlashState2 = new CameraFlashState("ON", 1, Integer.valueOf(R.drawable.common_ic_light_on_24));
        f98992d = cameraFlashState2;
        CameraFlashState cameraFlashState3 = new CameraFlashState("NOT_AVAILABLE", 2, null);
        f98993e = cameraFlashState3;
        CameraFlashState[] cameraFlashStateArr = {cameraFlashState, cameraFlashState2, cameraFlashState3};
        f98994f = cameraFlashStateArr;
        f98995g = c.a(cameraFlashStateArr);
    }

    public CameraFlashState(@InterfaceC42165v String str, int i12, Integer num) {
        this.f98996b = num;
    }

    public static CameraFlashState valueOf(String str) {
        return (CameraFlashState) Enum.valueOf(CameraFlashState.class, str);
    }

    public static CameraFlashState[] values() {
        return (CameraFlashState[]) f98994f.clone();
    }
}
