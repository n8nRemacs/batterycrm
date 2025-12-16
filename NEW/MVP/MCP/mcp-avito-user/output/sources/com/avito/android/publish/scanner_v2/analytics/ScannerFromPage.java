package com.avito.android.publish.scanner_v2.analytics;

import Y61.k;
import android.annotation.SuppressLint;
import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ScannerFromPage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/scanner_v2/analytics/ScannerFromPage;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"HardcodeStringDetector"})
/* loaded from: classes16.dex */
public final class ScannerFromPage {

    /* renamed from: c, reason: collision with root package name */
    public static final ScannerFromPage f239330c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScannerFromPage f239331d;

    /* renamed from: e, reason: collision with root package name */
    public static final ScannerFromPage f239332e;

    /* renamed from: f, reason: collision with root package name */
    public static final ScannerFromPage f239333f;

    /* renamed from: g, reason: collision with root package name */
    public static final ScannerFromPage f239334g;

    /* renamed from: h, reason: collision with root package name */
    public static final ScannerFromPage f239335h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ScannerFromPage[] f239336i;

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f239337j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f239338b;

    static {
        ScannerFromPage scannerFromPage = new ScannerFromPage("ERROR_SCREEN", 0, "Экран с ошибкой распознавания СТС");
        f239330c = scannerFromPage;
        ScannerFromPage scannerFromPage2 = new ScannerFromPage("CAMERA_SCREEN", 1, "Экран фотографирования СТС");
        f239331d = scannerFromPage2;
        ScannerFromPage scannerFromPage3 = new ScannerFromPage("PERMISSION_SCREEN", 2, "Экран с ошибкой доступа к камере");
        f239332e = scannerFromPage3;
        ScannerFromPage scannerFromPage4 = new ScannerFromPage("VIN_STEP", 3, "VIN или номер кузова");
        f239333f = scannerFromPage4;
        ScannerFromPage scannerFromPage5 = new ScannerFromPage("PREVIOUS_STEP", 4, "Предыдущий шаг");
        f239334g = scannerFromPage5;
        ScannerFromPage scannerFromPage6 = new ScannerFromPage("INSTRUCTION_BOTTOM_SHEET", 5, "Как надо фотографировать");
        f239335h = scannerFromPage6;
        ScannerFromPage[] scannerFromPageArr = {scannerFromPage, scannerFromPage2, scannerFromPage3, scannerFromPage4, scannerFromPage5, scannerFromPage6};
        f239336i = scannerFromPageArr;
        f239337j = c.a(scannerFromPageArr);
    }

    public ScannerFromPage(String str, int i12, String str2) {
        this.f239338b = str2;
    }

    public static ScannerFromPage valueOf(String str) {
        return (ScannerFromPage) Enum.valueOf(ScannerFromPage.class, str);
    }

    public static ScannerFromPage[] values() {
        return (ScannerFromPage[]) f239336i.clone();
    }
}
