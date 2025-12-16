package com.avito.android.service.short_task.metrics;

import android.app.WallpaperColors;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.PowerManager;
import androidx.core.graphics.C22767g;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.model.text.FontStyleKt;
import com.avito.android.util.C35835l0;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DarkThemeDetectionProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/service/short_task/metrics/DarkThemeDetectionProvider;", "Lcom/avito/android/service/short_task/metrics/n;", "DarkThemeCheckResult", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DarkThemeDetectionProvider implements n {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f274064a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Context f274065b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DarkThemeDetectionProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/DarkThemeDetectionProvider$DarkThemeCheckResult;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DarkThemeCheckResult {

        /* renamed from: c, reason: collision with root package name */
        public static final DarkThemeCheckResult f274066c;

        /* renamed from: d, reason: collision with root package name */
        public static final DarkThemeCheckResult f274067d;

        /* renamed from: e, reason: collision with root package name */
        public static final DarkThemeCheckResult f274068e;

        /* renamed from: f, reason: collision with root package name */
        public static final DarkThemeCheckResult f274069f;

        /* renamed from: g, reason: collision with root package name */
        public static final DarkThemeCheckResult f274070g;

        /* renamed from: h, reason: collision with root package name */
        public static final /* synthetic */ DarkThemeCheckResult[] f274071h;

        /* renamed from: i, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f274072i;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f274073b;

        static {
            DarkThemeCheckResult darkThemeCheckResult = new DarkThemeCheckResult("VERSION_BEFORE_THEMES", 0, "version_before_themes");
            DarkThemeCheckResult darkThemeCheckResult2 = new DarkThemeCheckResult("LIGHT", 1, "light_theme");
            f274066c = darkThemeCheckResult2;
            DarkThemeCheckResult darkThemeCheckResult3 = new DarkThemeCheckResult("DARK", 2, "dark_theme");
            f274067d = darkThemeCheckResult3;
            DarkThemeCheckResult darkThemeCheckResult4 = new DarkThemeCheckResult("PROBABLY_DARK", 3, "probably_dark_theme");
            f274068e = darkThemeCheckResult4;
            DarkThemeCheckResult darkThemeCheckResult5 = new DarkThemeCheckResult("PROBABLY_LIGHT", 4, "probably_light_theme");
            f274069f = darkThemeCheckResult5;
            DarkThemeCheckResult darkThemeCheckResult6 = new DarkThemeCheckResult("UNDEFINED", 5, "undefined");
            f274070g = darkThemeCheckResult6;
            DarkThemeCheckResult[] darkThemeCheckResultArr = {darkThemeCheckResult, darkThemeCheckResult2, darkThemeCheckResult3, darkThemeCheckResult4, darkThemeCheckResult5, darkThemeCheckResult6};
            f274071h = darkThemeCheckResultArr;
            f274072i = kotlin.enums.c.a(darkThemeCheckResultArr);
        }

        public DarkThemeCheckResult(String str, int i12, String str2) {
            this.f274073b = str2;
        }

        public static DarkThemeCheckResult valueOf(String str) {
            return (DarkThemeCheckResult) Enum.valueOf(DarkThemeCheckResult.class, str);
        }

        public static DarkThemeCheckResult[] values() {
            return (DarkThemeCheckResult[]) f274071h.clone();
        }
    }

    @Inject
    public DarkThemeDetectionProvider(@Y61.k Context context, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f274064a = interfaceC28373a;
        this.f274065b = context;
    }

    @Override // com.avito.android.service.short_task.metrics.n
    @Y61.k
    public final io.reactivex.rxjava3.core.z<m> a() {
        DarkThemeCheckResult darkThemeCheckResult;
        int i12;
        int i13;
        char c12 = 2;
        int i14 = 1;
        int i15 = Build.VERSION.SDK_INT;
        Context context = this.f274065b;
        if (i15 <= 28) {
            WallpaperColors wallpaperColors = WallpaperManager.getInstance(context).getWallpaperColors(1);
            if (wallpaperColors == null) {
                darkThemeCheckResult = DarkThemeCheckResult.f274070g;
            } else {
                int argb = wallpaperColors.getPrimaryColor().toArgb();
                Color secondaryColor = wallpaperColors.getSecondaryColor();
                int argb2 = secondaryColor != null ? secondaryColor.toArgb() : argb;
                Color tertiaryColor = wallpaperColors.getTertiaryColor();
                int[] iArr = {argb, argb2, tertiaryColor != null ? tertiaryColor.toArgb() : argb2};
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(6, 1, Bitmap.Config.ARGB_8888);
                for (int i16 = 0; i16 < 3; i16++) {
                    bitmapCreateBitmap.setPixel(i16, 0, iArr[0]);
                }
                for (int i17 = 3; i17 < 5; i17++) {
                    bitmapCreateBitmap.setPixel(i17, 0, iArr[1]);
                }
                bitmapCreateBitmap.setPixel(5, 0, iArr[2]);
                int height = bitmapCreateBitmap.getHeight() * bitmapCreateBitmap.getWidth();
                int[] iArr2 = new int[height];
                int iB2 = kotlin.math.b.b(height * 0.025f);
                bitmapCreateBitmap.getPixels(iArr2, 0, bitmapCreateBitmap.getWidth(), 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight());
                float[] fArr = new float[3];
                double d12 = 0.0d;
                int i18 = 0;
                int i19 = 0;
                while (i18 < height) {
                    int i22 = iArr2[i18];
                    ThreadLocal<double[]> threadLocal = C22767g.f44773a;
                    C22767g.a(Color.red(i22), Color.green(i22), Color.blue(i22), fArr);
                    float f12 = fArr[c12];
                    int iAlpha = Color.alpha(iArr2[i18]);
                    int[] iArr3 = iArr2;
                    if (C22767g.d(iArr2[i18], -16777216) <= 6.0f && iAlpha != 0) {
                        i13 = 1;
                        i19++;
                    } else {
                        i13 = 1;
                    }
                    d12 += f12;
                    i18 += i13;
                    i14 = i13;
                    iArr2 = iArr3;
                    c12 = 2;
                }
                int i23 = i14;
                double d13 = d12 / height;
                int i24 = (d13 <= ((double) 0.75f) || i19 >= iB2) ? 0 : i23;
                if (d13 < 0.25f) {
                    i12 = 2;
                    i24 |= 2;
                } else {
                    i12 = 2;
                }
                int i25 = (i24 & i12) != 0 ? i23 : 0;
                darkThemeCheckResult = Build.VERSION.SDK_INT == 27 ? i25 != 0 ? DarkThemeCheckResult.f274068e : DarkThemeCheckResult.f274069f : i25 != 0 ? DarkThemeCheckResult.f274068e : DarkThemeCheckResult.f274069f;
            }
        } else {
            int i26 = context.getResources().getConfiguration().uiMode & 48;
            darkThemeCheckResult = i26 != 16 ? i26 != 32 ? DarkThemeCheckResult.f274069f : DarkThemeCheckResult.f274067d : DarkThemeCheckResult.f274066c;
        }
        m mVar = new m("color_theme_status", darkThemeCheckResult.f274073b);
        int i27 = androidx.appcompat.app.p.f21560c;
        Object systemService = context.getSystemService("power");
        return io.reactivex.rxjava3.core.z.X(C42745f0.e0(mVar, new m("app_ui_theme", C35835l0.b(context, i27, systemService instanceof PowerManager ? (PowerManager) systemService : null) == 32 ? "dark" : FontStyleKt.LIGHT)));
    }
}
